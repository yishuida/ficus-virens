package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.blog.domain.entity.Permission;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/10/23
 * Package dev.daqiang.ficusvirens.root.infra.mapper in ficus-virens-back
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application-dev.yaml")
public class PermissionMapperTest {

    @Autowired
    PermissionMapper mapper;

    @Test
    public void selectTest() {
        assertEquals(mapper.selectAll().size(), 4);
        assertEquals(mapper.selectById(1L).getPermissionName(), "role");
        assertEquals(mapper.selectByRoleId(1L).size(), 3);
    }

    @Test
    @Transactional
    public void insertTest() {
        Permission permission = new Permission("test1");
        mapper.insert(permission);
        assertNotNull(mapper.selectByName("test1").getId());

    }
    @Test
    @Transactional
    public void updateTest() {
        Permission permission = mapper.selectById(1L);
        permission.setPermissionName("test");
        mapper.update(permission);
        assertEquals(mapper.selectById(1L).getPermissionName(), "test");
    }

    @Test
    @Transactional
    public void deleteTest() {
        mapper.deleteById(4L);
        assertNull(mapper.selectById(4L));
    }

}