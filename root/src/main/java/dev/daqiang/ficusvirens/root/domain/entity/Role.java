package dev.daqiang.ficusvirens.root.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Vista-Yih
 * @date 2019/12/19
 */
@Data
public class Role extends BaseEntity implements Serializable {

    private Long id;

    private String roleName;

    //private List<Permission> permissions;

    public Role(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return id.equals(role.id) &&
                roleName.equals(role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName);
    }

    public String toString() {
        return this.roleName;
    }
}
