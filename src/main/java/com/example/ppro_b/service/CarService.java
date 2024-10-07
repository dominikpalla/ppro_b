package com.example.ppro_b.service;

import com.example.ppro_b.model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public interface CarService {
    public ArrayList<Car> getAllCars();
    public Car getCarById(int id);
    public void saveCar(Car car);
    public void deleteCar(int id);
    public int getCount();
}
