package com.demo.medicaltourismapp.model;

import com.demo.medicaltourismapp.database.entity.FlightEntity;
import com.demo.medicaltourismapp.database.entity.HotelEntity;
import com.demo.medicaltourismapp.util.BaseDTO;
import lombok.Data;

@Data
public class AppointmentDTO extends BaseDTO {
    private FlightEntity flight;
    private HotelEntity hotel;
    private String doctorsNotes;
}
