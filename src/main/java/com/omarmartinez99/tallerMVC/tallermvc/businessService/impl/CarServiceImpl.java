package com.omarmartinez99.tallerMVC.tallermvc.businessService.impl;

import com.omarmartinez99.tallerMVC.tallermvc.businessService.CarService;
import com.omarmartinez99.tallerMVC.tallermvc.domain.Car;
import com.omarmartinez99.tallerMVC.tallermvc.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Este servicio llama al car repository
 */
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Override
    public List<Car> findAll(){
        return carRepository.findAll();
    }

    @Override
    public void insertCar(Car car) {
        carRepository.save(car);
    }
}
