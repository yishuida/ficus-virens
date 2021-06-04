package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.ficusvirens.root.domain.entity.Role;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public interface RoleService {
    Role findByName(String name) throws Exception;
}
