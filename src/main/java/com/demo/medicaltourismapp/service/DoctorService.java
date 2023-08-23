package com.demo.medicaltourismapp.service;

import com.demo.medicaltourismapp.database.entity.DoctorEntity;
import com.demo.medicaltourismapp.database.repository.DoctorRepository;
import com.demo.medicaltourismapp.mapper.DoctorMapper;
import com.demo.medicaltourismapp.model.DoctorDTO;
import com.demo.medicaltourismapp.model.requestDTO.DoctorRequestDTO;
import com.demo.medicaltourismapp.util.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DoctorService extends BaseService<DoctorEntity, DoctorDTO, DoctorRequestDTO,
        DoctorMapper, DoctorRepository> {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;


    @Override
    protected DoctorMapper getMapper() {
        return doctorMapper;
    }

    @Override
    protected DoctorRepository getRepository() {
        return doctorRepository;
    }
}
