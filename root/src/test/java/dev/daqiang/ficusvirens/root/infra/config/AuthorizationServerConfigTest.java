package dev.daqiang.ficusvirens.root.infra.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/11/9
 * Package dev.daqiang.ficusvirens.root.infra.config in ficus-virens
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class AuthorizationServerConfigTest {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Test
    public void test() {
        System.out.println(passwordEncoder.encode("client"));
    }
}