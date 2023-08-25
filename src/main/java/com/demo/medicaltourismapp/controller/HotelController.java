package com.demo.medicaltourismapp.controller;

import com.demo.medicaltourismapp.database.entity.HotelEntity;
import com.demo.medicaltourismapp.database.repository.HotelRepository;
import com.demo.medicaltourismapp.mapper.HotelMapper;
import com.demo.medicaltourismapp.model.HotelDTO;
import com.demo.medicaltourismapp.model.requestDTO.HotelRequestDTO;
import com.demo.medicaltourismapp.service.HotelService;
import com.demo.medicaltourismapp.util.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("hotel")
public class HotelController extends BaseController<HotelEntity, HotelDTO, HotelRequestDTO,
        HotelMapper, HotelRepository, HotelService> {

    private final HotelService hotelService;

    @Override
    protected HotelService getService() {
        return hotelService;
    }
}
