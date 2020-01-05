package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.ficusvirens.root.domain.entity.TreeNode;

import java.util.List;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public interface TreeService {

    List<TreeNode> findChildNodeUnder(TreeNode parentNode);

    boolean saveNodeUnder(TreeNode parentNode, TreeNode newNode);

    boolean removeNode(TreeNode node);

    boolean updateNode(TreeNode node);

    boolean isExist(TreeNode node);
}
