package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class HospitalEntity extends BaseEntity {

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<DoctorEntity> doctorEntityList;

}
