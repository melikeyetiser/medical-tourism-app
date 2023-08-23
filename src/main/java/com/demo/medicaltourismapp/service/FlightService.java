package com.demo.medicaltourismapp.service;

import com.demo.medicaltourismapp.database.entity.FlightEntity;
import com.demo.medicaltourismapp.database.repository.FlightRepository;
import com.demo.medicaltourismapp.mapper.FlightMapper;
import com.demo.medicaltourismapp.model.FlightDTO;
import com.demo.medicaltourismapp.model.requestDTO.FlightRequestDTO;
import com.demo.medicaltourismapp.util.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FlightService extends BaseService<FlightEntity, FlightDTO, FlightRequestDTO,
        FlightMapper, FlightRepository> {

    private final FlightRepository flightRepository;
    private final FlightMapper flightMapper;


    @Override
    protected FlightMapper getMapper() {
        return flightMapper;
    }

    @Override
    protected FlightRepository getRepository() {
        return flightRepository;
    }
}
