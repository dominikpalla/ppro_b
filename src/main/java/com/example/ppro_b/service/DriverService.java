package com.example.ppro_b.service;

import com.example.ppro_b.model.Driver;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public interface DriverService {
    ArrayList<Driver> getAllDrivers();
    Driver getDriverById(int id);
    void saveDriver(Driver Driver);
    void deleteDriver(int id);
    int getCount();
}
