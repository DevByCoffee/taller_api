package com.omarmartinez99.tallerMVC.tallermvc.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    private String plate;
    private String brand;
    private String model;
    private int year;

}
