package dev.daqiang.ficusvirens.root.infra.mapper;

import dev.daqiang.ficusvirens.root.domain.entity.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/1/4
 * Package dev.daqiang.ficusvirens.root.infra.mapper in ficus-virens
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class TreeNodeMapperTest {
    @Autowired
    TreeNodeMapper mapper;

    @Test
    public void selectNodeTest() {
        TreeNode node = mapper.selectNodeById(1L);
        assertEquals(node.getNodeName(), "Food");
    }

    @Test
    public void selectNodeUnderTest() {
        TreeNode node = mapper.selectNodeById(1L);
        List<TreeNode> nodes = mapper.selectNodeUnder(node);
        assertEquals(nodes.size(), 8);
    }

    @Test
    @Transactional
    public void insertNodeTest() {
        TreeNode red = mapper.selectNodeById(3L);
        TreeNode apple = new TreeNode();
        apple.setNodeName("apple");
        apple.setRight(red.getRight());
        apple.setLeft(red.getRight() + 1);
        mapper.updateNodeLeftWhenAddOne(red);
        mapper.updateNodeRightWhenAddOne(red);
        mapper.insertNode(apple);
        TreeNode meat = mapper.selectNodeById(7L);
        assertEquals(meat.getRight().longValue(), 19L);
    }

    @Test
    public void selectNodePathTest() {
        TreeNode root = mapper.selectNodeById(1L);
        TreeNode banana = mapper.selectNodeById(6L);

        List<TreeNode> list = mapper.selectNodePath(root, banana);
        for (TreeNode node: list) {
            System.out.println(node);
        }
    }

}