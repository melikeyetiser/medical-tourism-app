package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PatientEntity extends BaseEntity {

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AppointmentEntity> appointmentEntityList;
}
