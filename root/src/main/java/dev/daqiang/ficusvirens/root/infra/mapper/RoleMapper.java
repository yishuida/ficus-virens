package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.blog.domain.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Vista Yih
 * @version 0.1.0
 *
 */
@Mapper
public interface RoleMapper {

    /**
     * 查询所有角色信息
     * @return 所有角色信息表
     */
    List<Role> selectAll();

    /**
     * 查询角色信息
     * @param roleId 角色编号
     * @return 角色信息
     */
    Role selectById(Long roleId);

    /**
     * 根据角色名查询角色信息
     * @param roleName 角色名
     * @return 角色信息
     */
    Role selectByName(String roleName);

    /**
     * 更具用户名获取角色
     * @param username 用户名
     * @return 角色列表
     */
    List<Role> selectByUsername(String username);

    /**
     * 更具用户名获取角色
     * @param userId 用户编号
     * @return 角色列表
     */
    List<Role> selectByUserId(Long userId);

    /**
     * 根据角色编号删除角色
     * @param roleId 角色编号
     */
    void deleteById(Long roleId);

    /**
     * 更新角色信息
     * @param role 角色信息
     */
    void update(Role role);

    /**
     * 添加角色
     * @param role 角色信息
     */
    void insert(Role role);
}
