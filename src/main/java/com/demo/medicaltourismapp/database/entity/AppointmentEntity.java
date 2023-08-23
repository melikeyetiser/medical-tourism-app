package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AppointmentEntity extends BaseEntity {

    private FlightEntity flight;
    private HotelEntity hotel;

}
