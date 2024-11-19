package com.omarmartinez99.tallerMVC.tallermvc.controller;

import com.omarmartinez99.tallerMVC.tallermvc.businessService.CarService;
import com.omarmartinez99.tallerMVC.tallermvc.dto.CarDTO;
import com.omarmartinez99.tallerMVC.tallermvc.domain.Car;
import com.omarmartinez99.tallerMVC.tallermvc.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarController {

    //Se usa para llamar al negocio
    private final CarService carService;
    //Se usa para mapear el objeto cars y pasarlo a bobean
    private final CarMapper carMapper;


    @GetMapping
    public ResponseEntity<List<CarDTO>> findAll() {
        List<Car> cars = carService.findAll();
        return ResponseEntity.ok(cars.stream().map(carMapper::toDTO).toList());
    }
    @PostMapping
    public ResponseEntity<Void> insertCar(@RequestBody CarDTO carDTO) {
        Car car = carMapper.toDOMAIN(carDTO);
        carService.insertCar(car);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
