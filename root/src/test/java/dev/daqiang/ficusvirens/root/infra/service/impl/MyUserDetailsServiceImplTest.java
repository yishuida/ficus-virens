package dev.daqiang.ficusvirens.root.infra.service.impl;

import dev.daqiang.ficusvirens.root.domain.entity.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/12/11
 * Package dev.daqiang.ficusvirens.root.infra.service.impl in root
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MyUserDetailsServiceImplTest extends TestCase {
    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Test
    public void testLoadUserByUsername() {
        UserDetails user = userDetailsService.loadUserByUsername("admin");
        user.getAuthorities();
        Assert.assertEquals(passwordEncoder.matches("123456", user.getPassword()), true);
        System.out.println(user);
    }
}