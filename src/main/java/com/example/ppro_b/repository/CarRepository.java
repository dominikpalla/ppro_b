package com.example.ppro_b.repository;

import com.example.ppro_b.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

}
