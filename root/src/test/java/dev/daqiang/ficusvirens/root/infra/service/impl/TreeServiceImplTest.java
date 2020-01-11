package dev.daqiang.ficusvirens.root.infra.service.impl;

import dev.daqiang.ficusvirens.root.domain.entity.TreeNode;
import dev.daqiang.ficusvirens.root.infra.mapper.TreeNodeMapper;
import dev.daqiang.ficusvirens.root.infra.service.TreeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/1/11
 * Package dev.daqiang.ficusvirens.root.infra.service.impl in ficus-virens
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource("classpath:application-dev.yaml")
public class TreeServiceImplTest {
    @Autowired
    TreeService service;

    @Autowired
    TreeNodeMapper mapper;

    private TreeNode root, red, beef;
    @Before
    public void init() {
        root = service.findNode(1L);
        red = service.findNode(3L);
        beef = service.findNode(8L);
    }

    @Test
    public void findNode() {
        assertEquals("Food", root.getNodeName());
    }

    @Test
    public void findSubTreeNode() {

        List<TreeNode> list = service.findSubTreeNode(root);
        assertEquals(9, list.size());
    }

    @Test
    public void findTreePath() {
        TreeNode start = new TreeNode();
        TreeNode end = new TreeNode();
        start.setId(1L);
        end.setId(6L);
        List<TreeNode> list = service.findTreePath(start, end);
        assertEquals(4, list.size());
        assertEquals("Yellow", list.get(2).getNodeName());
    }

    @Test
    @Transactional
    public void saveNodeUnder() {
        TreeNode apple = new TreeNode("Apple", 1L);
        service.saveNodeUnder(red, apple);

        TreeNode node = mapper.selectNodeByName("Apple");
        TreeNode meat = service.findNode(7L);
        List<TreeNode> list = service.findSubTreeNode(root);

        assertNotNull(node);
        assertEquals(10, list.size());
        assertEquals(14, meat.getLeft().intValue());
    }

    @Test
    @Transactional
    public void removeSubTree() {
        service.removeSubTree(beef);

        List<TreeNode> list = service.findSubTreeNode(root);
        TreeNode newRoot = service.findNode(1L);

        assertEquals(8, list.size());
        assertEquals(16, newRoot.getRight().intValue());
    }

    @Test
    @Transactional
    public void updateNode() {
        root.setNodeName("Foot-1");
        service.updateNode(root);

        TreeNode newRoot = service.findNode(1L);

        assertEquals("Foot-1", newRoot.getNodeName());
    }

    @Test
    public void isExist() {
    }
}