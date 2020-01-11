package dev.daqiang.ficusvirens.root.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TreeNode extends BaseEntity {

    public TreeNode() { }

    public TreeNode(String nodeName, Long postId) {
        this.nodeName = nodeName;
        this.postId = postId;
    }

    private Long id;

    private String nodeName;

    private Long postId;

    private Integer left;

    private Integer right;

    private Integer layer;
}
