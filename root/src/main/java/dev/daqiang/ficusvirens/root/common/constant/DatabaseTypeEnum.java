package dev.daqiang.ficusvirens.root.common.constant;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
public enum DatabaseTypeEnum {
    /**
     * MySQL
     */
    MYSQL("MySQL","mysql"),
    /**
     * PostgreSQL
     */
    POSTPRESQL("PostgreSQL", "postgresql"),
    H2("H2", "h2");

    private final String type;

    private final String alias;

    DatabaseTypeEnum(String type, String alias) {
        this.type = type;
        this.alias = alias;
    }

    public String getType() {
        return type;
    }

    public String getAlias() {
        return alias;
    }
}
