package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.ficusvirens.root.domain.entity.ThemeNode;

import java.util.List;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public interface ThemeService {

    List<ThemeNode> findChildNodeUnder(ThemeNode parentNode);

    boolean saveNodeUnder(ThemeNode parentNode, ThemeNode newNode);

    boolean removeNode(ThemeNode node);

    boolean updateNode(ThemeNode node);

    boolean isExist(ThemeNode node);
}
