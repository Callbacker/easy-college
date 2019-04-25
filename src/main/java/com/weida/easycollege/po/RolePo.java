package com.weida.easycollege.po;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role", schema = "easy_college")
public class RolePo {
    private int id;
    private int type;
    private String name;
    private String description;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePo rolePo = (RolePo) o;
        return id == rolePo.id &&
                type == rolePo.type &&
                Objects.equals(name, rolePo.name) &&
                Objects.equals(description, rolePo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, description);
    }
}
