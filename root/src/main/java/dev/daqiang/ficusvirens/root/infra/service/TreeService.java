package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.ficusvirens.root.domain.entity.TreeNode;

import java.util.List;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public interface TreeService {

    TreeNode findNode(Long id);
    List<TreeNode> findSubTreeNode(TreeNode node);

    List<TreeNode> findTreePath(TreeNode start, TreeNode end);


    boolean saveNodeUnder(TreeNode parentNode, TreeNode newNode);

    boolean removeSubTree(TreeNode node);

    boolean updateNode(TreeNode node);

    boolean isExist(Long id);
}
