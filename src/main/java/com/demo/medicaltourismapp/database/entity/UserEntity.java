package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Column
    private String username;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column
    private boolean isEnabled;

    @ManyToMany(fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JoinColumn(name = "role_id", nullable = false)
    private Set<RoleEntity> roles;


    public UserEntity() {
        isEnabled = false;
    }


}
