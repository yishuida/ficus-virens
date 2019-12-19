package dev.daqiang.ficusvirens.root.entity;

import lombok.Data;

import java.util.Objects;

@Data
public class Permission extends BaseEntity {

    private Long id;

    private String permissionName;

    public Permission(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Permission that = (Permission) o;
        return id.equals(that.id) &&
                permissionName.equals(that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permissionName);
    }


}
