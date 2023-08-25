package com.demo.medicaltourismapp.database.entity;

import com.demo.medicaltourismapp.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table
@AttributeOverride(
        name = "id",
        column = @Column(
                name = "appointment_id"
        )
)
public class AppointmentEntity extends BaseEntity {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointment_flight")
    private List<FlightEntity> flights;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "appointment_hotel")
    private HotelEntity hotel;

    // this will be the notes taken by the doctor during an appointment for a single patient
    @Column
    private String doctorsNotes;

}
