package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.TreeNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TreeNodeMapper {

    /**
     * 获得主题节点的信息
     * @param nodeId 节点编号
     * @return 节点 TreeNode
     */
    TreeNode selectNode(Long nodeId);

    /**
     * 获得某节点的所有子节点
     * @param parent 父节点
     * @return 子节点列表
     */
    List<TreeNode> selectNodeUnder(@Param("parent") TreeNode parent);


    /**
     * 更新节点信息
     * @param node 节点
     * @return
     */
    Boolean updateNode(TreeNode node);

    /**
     * 所有大于 node 右值的节点左值加2
     * @param node 节点
     * @return ...
     */
    Boolean nodeLeftAddTwoAfter(TreeNode node);

    /**
     * 所有大于等于 node 右值的节点右值加2
     * @param node 节点
     * @return ...
     */
    Boolean nodeRightAddTwoAfter(TreeNode node);

    /**
     * 更新节点内容
     * @param nodes 节点们
     * @return ...
     */
    Boolean updateNodes(List<TreeNode> nodes);

    /**
     * 插入一个节点
     * @param node 节点
     * @return ...
     */
    Boolean insertNode(TreeNode node);

    Boolean deleteLeafNode(Integer left, Integer right);

    Boolean deleteAllUnderNode(Integer left, Integer right);
}
