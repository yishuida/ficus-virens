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
public class Post extends BaseEntity {
    private Long id;

    private String postName;

    private String context;

    private String title;

    private String backgroundImage;

    private String content;


}
