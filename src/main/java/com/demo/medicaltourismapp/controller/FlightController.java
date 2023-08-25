package com.demo.medicaltourismapp.controller;

import com.demo.medicaltourismapp.database.entity.FlightEntity;
import com.demo.medicaltourismapp.database.repository.FlightRepository;
import com.demo.medicaltourismapp.mapper.FlightMapper;
import com.demo.medicaltourismapp.model.FlightDTO;
import com.demo.medicaltourismapp.model.requestDTO.FlightRequestDTO;
import com.demo.medicaltourismapp.service.FlightService;
import com.demo.medicaltourismapp.util.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("flight")
public class FlightController extends BaseController<FlightEntity, FlightDTO, FlightRequestDTO,
        FlightMapper, FlightRepository, FlightService> {
    private final FlightService flightService;

    @Override
    protected FlightService getService() {
        return flightService;
    }
}
