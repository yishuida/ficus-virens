package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.Role;
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
 * Created on 2019/10/23
 * Package dev.daqiang.blog.infra.mapper in ficus-virens-back
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RoleMapperTest {

    @Autowired
    private RoleMapper mapper;

    @Test
    public void selectTest() {
        List<Role> roles = mapper.selectAll();
        assertEquals(roles.size(), 4);

        Role role = mapper.selectById(1L);
        assertEquals(role.getRoleName(), "administrator");
        //assertEquals(role.getPermissions().size(), 3);

        assertNotNull(mapper.selectByName("administrator"));
    }

    @Test
    @Transactional
    public void insertTest() {
        Role role = new Role("test1");
        mapper.insert(role);
        assertNotNull(mapper.selectByName("test1"));
    }

    @Test
    @Transactional
    public void deleteTest() {
        mapper.deleteById(4L);
        assertNull(mapper.selectById(4L));
    }

    @Test
    @Transactional
    public void updateTest() {
        Role role = mapper.selectById(1L);
        role.setRoleName("admin");
        mapper.update(role);
        assertEquals(mapper.selectById(1L).getRoleName(), "admin");

    }

}
