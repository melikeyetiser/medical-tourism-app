package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Set;

@Data
@Table
@Entity
public class RoleEntity extends BaseEntity {
    @Column(unique = true)
    private String name;
    @Column
    private String description;

    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users;
}
