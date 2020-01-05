package dev.daqiang.ficusvirens.root.infra.service.impl;

import dev.daqiang.ficusvirens.root.domain.entity.TreeNode;
import dev.daqiang.ficusvirens.root.infra.mapper.TreeNodeMapper;
import dev.daqiang.ficusvirens.root.infra.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeNodeMapper mapper;

    @Override
    public List<TreeNode> findChildNodeUnder(TreeNode parentNode) {
        if (isExist(parentNode)) {
            // TODO 传入的值是否带有 left 和 right
            // TreeNode node = mapper.selectNode(parentNode.getId());
            return mapper.selectNodeUnder(parentNode);
        }

        // TODO 抛出异常
        return null;
    }


    @Override
    public boolean saveNodeUnder(TreeNode parentNode, TreeNode newNode) {
        if (isExist(parentNode)) {
            Integer left = parentNode.getRight();
            mapper.nodeRightAddTwoAfter(parentNode);
            mapper.nodeLeftAddTwoAfter(parentNode);
            newNode.setLeft(left);
            newNode.setRight(left + 1);
            return mapper.updateNode(newNode);
        }
        return false;
    }

    @Override
    public boolean removeNode(TreeNode node) {
        return false;
    }

    @Override
    public boolean updateNode(TreeNode node) {
        return false;
    }

    @Override
    public boolean isExist(TreeNode node) {
        return node.getId() != null && mapper.selectNode(node.getId()) != null;
    }
}
