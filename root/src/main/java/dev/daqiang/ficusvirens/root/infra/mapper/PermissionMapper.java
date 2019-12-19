package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author Vista Yih
 * @version 0.1.0
 *
 */
@Mapper
public interface PermissionMapper {

    /**
     * 查询所有权限
     * @return 权限列表
     */
    List<Permission> selectAll();


    /**
     * 根据编号查询权限
     * @param permissionId 权限编号
     * @return 权限信息
     */
    Permission selectById(Long permissionId);

    /**
     * 根据权限名查询权限
     * @param permissionName 权限名
     * @return 权限信息
     */
    Permission selectByName(String permissionName);

    /**
     * 查询角色的权限
     * @param roleId
     * @return 角色的权限列表
     */
    List<Permission> selectByRoleId(Long roleId);

    /**
     * 插入权限
     * @param permission 权限信息
     * @return 结果信息
     */
    Integer insert(Permission permission);

    /**
     * 删除权限，需要先删除外键关联的表里的数据
     * @param permissionId 权限编号
     * @return 结果信息
     */
    Integer deleteById(Long permissionId);

    /**
     * 更新权限
     * @param permission 权限信息
     * @return 结果信息
     */
    Integer update(Permission permission);
}
