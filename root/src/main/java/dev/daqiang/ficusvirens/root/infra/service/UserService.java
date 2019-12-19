package dev.daqiang.ficusvirens.root.infra.service;

import dev.daqiang.blog.domain.entity.User;
import dev.daqiang.blog.domain.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
