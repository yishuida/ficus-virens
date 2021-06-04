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

// TODO 添加异常机制，数据库事务
@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeNodeMapper mapper;

    @Override
    public TreeNode findNode(Long id) {
        if (id != null) {
            return mapper.selectNodeById(id);
        }
        return null;
    }

    @Override
    public List<TreeNode> findSubTreeNode(TreeNode node) {
        List<TreeNode> lists = null;
        TreeNode root = findNode(node.getId());
        if (root != null) {
            lists = mapper.selectNodeUnder(root);
        }
        return lists;
    }

    @Override
    public List<TreeNode> findTreePath(TreeNode start, TreeNode end) {
        List<TreeNode> list = null;
        TreeNode s = findNode(start.getId());
        TreeNode e = findNode(end.getId());
        if (s != null && e != null) {
            list =  mapper.selectNodePath(s, e);

        }
        return list;
    }

    @Override
    public boolean saveNodeUnder(TreeNode parentNode, TreeNode newNode) {
        TreeNode p = findNode(parentNode.getId());
        if (p != null) {
            Integer left = p.getRight();
            mapper.updateNodeLeftWhenAddOne(p);
            mapper.updateNodeRightWhenAddOne(p);
            newNode.setLeft(left);
            newNode.setRight(left + 1);
            return mapper.insertNode(newNode) != 0;
        }
        return false;
    }

    @Override
    public boolean removeSubTree(TreeNode node) {
        TreeNode root = findNode(node.getId());
        if (root != null) {
            mapper.deleteSubNodeTree(root);
            mapper.updateNodeLeftWhenRemoveOne(node);
            mapper.updateNodeRightWhenRemoveOne(node);
        }

        return true;
    }


    @Override
    public boolean updateNode(TreeNode node) {
        return mapper.updateNode(node) != 0;
    }



    @Override
    public boolean isExist(Long id) {
        return id != null && mapper.selectNodeById(id) != null;
    }

}
