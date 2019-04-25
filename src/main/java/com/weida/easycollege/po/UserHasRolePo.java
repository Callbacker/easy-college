package com.weida.easycollege.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_has_role", schema = "easy_college")
@IdClass(UserHasRolePoPK.class)
public class UserHasRolePo {
    private int userId;
    private int roleId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserHasRolePo that = (UserHasRolePo) o;
        return userId == that.userId &&
                roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }
}
