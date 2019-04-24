package com.weida.easycollege.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "easy_college")
public class UserPo {
    private int id;
    private String name;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPo userPo = (UserPo) o;
        return id == userPo.id &&
                Objects.equals(name, userPo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
