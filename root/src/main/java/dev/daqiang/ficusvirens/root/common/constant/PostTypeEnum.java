package dev.daqiang.ficusvirens.root.common.constant;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public enum  PostTypeEnum {
    /**
     * 原创
     */
    ORIGINAL("original"),
    /**
     * 翻译
     */
    TRANSLATION("translation"),
    /**
     * 。。。
     */
    REPRINTED("reprinted");

    private String type;

    PostTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
