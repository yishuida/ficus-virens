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
    TreeNode selectNodeById(Long nodeId);

    /**
     * 获得主题节点的信息
     * @param name 节点名
     * @return 节点 TreeNode
     */
    TreeNode selectNodeByName(String name);

    /**
     * 获得某节点的所有子节点
     * @param parent 父节点
     * @return 子节点列表
     */
    List<TreeNode> selectNodeUnder(@Param("parent") TreeNode parent);


    /**
     * 获取从 start 到 end 的路径节点
     * @param start 开始节点
     * @param end 结束节点
     * @return 节点路径
     */
    List<TreeNode> selectNodePath(TreeNode start, TreeNode end);

    /**
     * 更新节点信息
     * @param node 节点
     * @return
     */
    int updateNode(TreeNode node);

    /**
     * 所有大于 node 右值的节点左值加2
     * @param node 节点
     * @return ...
     */
    int updateNodeLeftWhenAddOne(TreeNode node);

    /**
     * 所有大于等于 node 右值的节点右值加2
     * @param node 节点
     * @return ...
     */
    int updateNodeRightWhenAddOne(TreeNode node);

    /**
     * 所有大于等于 node 右值的节点左值减去当前删除的节点总和
     * @param node 节点
     * @return ...
     */
    int updateNodeLeftWhenRemoveOne(TreeNode node);

    /**
     * 所有大于等于 node 右值的节点右值减去当前删除的节点总和
     * @param node 节点
     * @return ...
     */
    int updateNodeRightWhenRemoveOne(TreeNode node);

    /**
     * 更新节点内容
     * @param nodes 节点们
     * @return ...
     */
    int updateNodes(List<TreeNode> nodes);

    /**
     * 插入一个节点
     * @param node 节点
     * @return ...
     */
    
    int insertNode(TreeNode node);

    /**
     * 删除该节点和它的子节点
     * @param node 节点
     * @return ...
     */
    int deleteSubNodeTree(TreeNode node);

}
