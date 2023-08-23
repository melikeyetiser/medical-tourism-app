package com.demo.medicaltourismapp.model;

import com.demo.medicaltourismapp.util.BaseDTO;
import lombok.Data;

@Data
public class HotelDTO extends BaseDTO {

    private String name;
    private int capacity;
}
