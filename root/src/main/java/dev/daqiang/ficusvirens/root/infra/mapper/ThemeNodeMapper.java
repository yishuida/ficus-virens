package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.ThemeNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ThemeNodeMapper {

    /**
     * 获得主题节点的信息
     * @param nodeId 节点编号
     * @return 节点 ThemeNode
     */
    ThemeNode selectNode(Long nodeId);

    /**
     * 获取根节点下的所有节点
     * @return 子节点列表
     */
    List<ThemeNode> selectUnderRootNode();

    /**
     * 获得某节点的所有子节点
     * @param parent 父节点
     * @return 子节点列表
     */
    List<ThemeNode> selectNodeUnder(ThemeNode parent);

    List<ThemeNode> selectNodeAToNodeBPath(Integer leftA, Integer rightA, Integer leftB, Integer rightB);

    Boolean insertThemeNode(ThemeNode node);

    Boolean updateNode(ThemeNode node);

    Boolean updateNodes(List<ThemeNode> nodes);

    /**
     * 更新大于等于 lft 所有节点的左值
     * @param lft 更新的左值
     * @return 是否成功
     */
    Boolean updateLeftNode(Integer lft);

    /**
     * 更新大于等于 lft 所有节点的右值
     * @param lft 更新的右值
     * @return 是否成功
     */
    boolean updateRightNode(Integer lft);

    Boolean deleteLeafNode(Integer left, Integer right);

    Boolean deleteAllUnderNode(Integer left, Integer right);
}
