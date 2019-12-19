package dev.daqiang.ficusvirens.root.infra.service.impl;

import dev.daqiang.blog.domain.entity.ThemeNode;
import dev.daqiang.ficusvirens.root.infra.mapper.ThemeNodeMapper;
import dev.daqiang.ficusvirens.root.infra.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeNodeMapper mapper;

    @Override
    public List<ThemeNode> findChildNodeUnder(ThemeNode parentNode) {
        if (isExist(parentNode)) {
            // TODO 传入的值是否带有 left 和 right
            // ThemeNode node = mapper.selectNode(parentNode.getId());
            return mapper.selectNodeUnder(parentNode);
        }

        // TODO 抛出异常
        return null;
    }


    @Override
    public boolean saveNodeUnder(ThemeNode parentNode, ThemeNode newNode) {
        if (isExist(parentNode)) {
            Integer left = parentNode.getRight();
            mapper.updateLeftNode(left);
            mapper.updateRightNode(left);
            newNode.setLeft(left);
            newNode.setRight(left + 1);
            return mapper.updateNode(newNode);
        }
        return false;
    }

    @Override
    public boolean removeNode(ThemeNode node) {
        return false;
    }

    @Override
    public boolean updateNode(ThemeNode node) {
        return false;
    }

    @Override
    public boolean isExist(ThemeNode node) {
        return node.getId() != null && mapper.selectNode(node.getId()) != null;
    }
}
