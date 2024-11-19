package com.omarmartinez99.tallerMVC.tallermvc.mapper;


import com.omarmartinez99.tallerMVC.tallermvc.dto.CarDTO;
import com.omarmartinez99.tallerMVC.tallermvc.domain.Car;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarDTO toDTO(Car car);

    Car toDOMAIN(CarDTO carDTO);
}


