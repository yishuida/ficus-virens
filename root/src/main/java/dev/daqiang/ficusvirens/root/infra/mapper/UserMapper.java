package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.blog.domain.entity.Role;
import dev.daqiang.blog.domain.entity.User;
import dev.daqiang.blog.domain.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Vista Yih
 * @version 0.1.0
 *
 */
@Mapper
public interface UserMapper {
    /**
     * 获得所有用户
     * @return 所有用户列表
     */
    List<User> selectAll();

    /**
     * 根据用户 ID 获取用户信息
     * @param id 用户编号
     * @return 用户信息
     */
    User selectById(Long id);

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户信息
     */
    User selectByUsername(String username);

    /**
     * 根据用户编号获取用户详细信息
     * @param userId 用户编号
     * @return 用户详细信息
     */
    UserInfo selectUserInfoById(Long userId);

    /**
     * 根据用户 ID 获取用户信息，需要将 blog_sys_user_role 关联的数据删除之后执行
     * @param id 用户编号
     */
    void deleteById(Long id);

    /**
     * 插入用户
     * @param user 用户信息
     */
    void insert(User user);

    /**
     * 更新用户信息
     * @param user 用户信息
     */
    void update(User user);

    /**
     * 为用户添加角色关联
     * @param userId 用户编号
     * @param roleId 角色编号
     */
    void addRole(Long userId, Long roleId);

    /**
     * 删除用户的所有关联角色
     * @param userId 用户编号
     */
    void deleteRoles(Long userId);

    /**
     * 删除用户的角色关联
     * @param userId 用户编号
     * @param roleId 角色编号
     */
    void deleteRole(Long userId, Long roleId);
}
