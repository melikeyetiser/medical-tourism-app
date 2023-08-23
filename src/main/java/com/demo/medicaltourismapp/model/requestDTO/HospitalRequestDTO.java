package com.demo.medicaltourismapp.model.requestDTO;

import com.demo.medicaltourismapp.database.entity.DoctorEntity;
import com.demo.medicaltourismapp.util.BaseDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class HospitalRequestDTO extends BaseDTO {

    private String name;
    @JsonIgnore
    private List<DoctorEntity> doctorEntityList;
}
