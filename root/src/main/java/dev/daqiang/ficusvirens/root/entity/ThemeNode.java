package dev.daqiang.ficusvirens.root.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ThemeNode extends BaseEntity {

    private Long id;

    private String themeName;

    private Long postId;

    private Integer left;

    private Integer right;

    private Integer level;
}
