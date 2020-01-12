package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.Role;
import dev.daqiang.ficusvirens.root.domain.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/10/20
 * Package dev.daqiang.blog.infra.mapper in ficus-virens-back
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    public void selectTest() {
        List<User> users =  mapper.selectAll();
        User user = mapper.selectById(1L);
        assertEquals(4, users.size());
        assertEquals("admin", user.getUsername());
        assertEquals(user.getRoles().size(), 3);
        for (Role r : user.getRoles()) {
            if (r.getRoleName().equals("administrator")) {
                assertEquals(r.getPermissions().size(), 3);
            }
        }
    }

    @Test
    @Transactional
    public void deleteTest() {
        mapper.deleteById(4L);
        assertNull(mapper.selectById(4L));
    }

    @Test
    @Transactional
    public void insertTest() {
        User user = new User("insert", "password");
        mapper.insert(user);
        assertNotNull(mapper.selectByUsername("insert"));
    }

    @Test
    @Transactional
    public void updateTest() {
        User user = mapper.selectById(3L);
        System.out.println(user);
        user.setUsername("Vista");
        mapper.update(user);
        assertEquals("Vista", mapper.selectById(3L).getUsername());
    }

}
