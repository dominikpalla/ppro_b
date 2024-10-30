package com.example.ppro_b.service;

import com.example.ppro_b.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    List<Car> getAllCars();
    Car getCarById(long id);
    void saveCar(Car car);
    void deleteCar(long id);
}
