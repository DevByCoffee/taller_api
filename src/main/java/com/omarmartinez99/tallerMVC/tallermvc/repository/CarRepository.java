package com.omarmartinez99.tallerMVC.tallermvc.repository;

import com.omarmartinez99.tallerMVC.tallermvc.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
