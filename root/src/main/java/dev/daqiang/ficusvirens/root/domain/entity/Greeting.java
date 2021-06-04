package dev.daqiang.ficusvirens.root.domain.entity;

import lombok.Data;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/21
 * Package dev.daqiang.ficusvirens.root.domain.entity in ficus-virens
 */
@Data
public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
