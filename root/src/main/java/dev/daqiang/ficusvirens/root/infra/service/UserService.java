package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.ficusvirens.root.domain.entity.User;
import dev.daqiang.ficusvirens.root.domain.entity.UserInfo;

import java.util.List;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public interface UserService {

    List<User> findAllUser();

    User findUserInfoById(Long id);

    User findUserByUsername(String username);

    User findUserById(Long id);

    UserInfo findUserInfoByUsername(String username);

    Integer changePassword(String oldPassword, String newPassword);

    Integer saveUser(User user);

    Integer deleteUserById();

    Integer updateUserInfo(UserInfo userInfo);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
