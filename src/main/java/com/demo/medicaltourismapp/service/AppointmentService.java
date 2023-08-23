package com.demo.medicaltourismapp.service;

import com.demo.medicaltourismapp.database.entity.AppointmentEntity;
import com.demo.medicaltourismapp.database.repository.AppointmentRepository;
import com.demo.medicaltourismapp.mapper.AppointmentMapper;
import com.demo.medicaltourismapp.model.AppointmentDTO;
import com.demo.medicaltourismapp.model.requestDTO.AppointmentRequestDTO;
import com.demo.medicaltourismapp.util.BaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppointmentService extends BaseService<AppointmentEntity, AppointmentDTO, AppointmentRequestDTO,
        AppointmentMapper, AppointmentRepository> {

    private final AppointmentRepository appointmentRepository;
    private final AppointmentMapper appointmentMapper;


    @Override
    protected AppointmentMapper getMapper() {
        return null;
    }

    @Override
    protected AppointmentRepository getRepository() {
        return null;
    }
}
