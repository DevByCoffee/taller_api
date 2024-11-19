package com.omarmartinez99.tallerMVC.tallermvc.businessService;

import com.omarmartinez99.tallerMVC.tallermvc.domain.Car;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    void insertCar(Car car);
}
