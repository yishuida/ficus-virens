package dev.daqiang.ficusvirens.root.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
