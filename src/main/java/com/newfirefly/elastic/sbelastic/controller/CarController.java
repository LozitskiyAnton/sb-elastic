package com.newfirefly.elastic.sbelastic.controller;

import com.newfirefly.elastic.sbelastic.model.CarModel;
import com.newfirefly.elastic.sbelastic.repository.CarRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {

    private final CarRepository carRepository;

    @PostMapping
    public void save(@RequestBody CarModel car) {
        carRepository.save(car);
    }

    @GetMapping("/{id}")
    public CarModel findById(@PathVariable String id) {
        return carRepository.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<CarModel> findAll() {
        return carRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable String id) {
        carRepository.deleteById(id);
    }

    @PutMapping
    public void update(@RequestBody CarModel car) {
        carRepository.save(car);
    }

}
