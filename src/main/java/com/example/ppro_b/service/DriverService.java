package com.example.ppro_b.service;

import com.example.ppro_b.model.Driver;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface DriverService {
    List<Driver> getAllDrivers();
    Driver getDriverById(long id);
    void saveDriver(Driver Driver);
    void deleteDriver(long id);
}
