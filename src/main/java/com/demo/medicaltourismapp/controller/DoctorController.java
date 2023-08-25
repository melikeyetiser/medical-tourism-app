package com.demo.medicaltourismapp.controller;

import com.demo.medicaltourismapp.database.entity.DoctorEntity;
import com.demo.medicaltourismapp.database.repository.DoctorRepository;
import com.demo.medicaltourismapp.mapper.DoctorMapper;
import com.demo.medicaltourismapp.model.DoctorDTO;
import com.demo.medicaltourismapp.model.requestDTO.DoctorRequestDTO;
import com.demo.medicaltourismapp.service.DoctorService;
import com.demo.medicaltourismapp.util.BaseController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("doctor")
public class DoctorController extends BaseController<DoctorEntity, DoctorDTO, DoctorRequestDTO,
        DoctorMapper, DoctorRepository, DoctorService> {

    private final DoctorService doctorService;

    @Override
    protected DoctorService getService() {
        return doctorService;
    }
}
