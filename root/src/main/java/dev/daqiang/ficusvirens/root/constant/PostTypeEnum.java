package dev.daqiang.ficusvirens.root.constant;

public enum  PostTypeEnum {
    ORIGINAL("original"),
    TRANSLATION("translation"),
    REPRINTED("reprinted");

    private String type;

    PostTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
