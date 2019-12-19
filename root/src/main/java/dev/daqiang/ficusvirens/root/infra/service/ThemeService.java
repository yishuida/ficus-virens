package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.blog.domain.entity.ThemeNode;

import java.util.List;

/**
 * @author yidaq
 */
public interface ThemeService {

    List<ThemeNode> findChildNodeUnder(ThemeNode parentNode);

    boolean saveNodeUnder(ThemeNode parentNode, ThemeNode newNode);

    boolean removeNode(ThemeNode node);

    boolean updateNode(ThemeNode node);

    boolean isExist(ThemeNode node);
}
