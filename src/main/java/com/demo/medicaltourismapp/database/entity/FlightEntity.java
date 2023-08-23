package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class FlightEntity extends BaseEntity {

    @Column
    private int flightNo;

    @Column(nullable = false)
    private int capacity;
}
