package com.example.mapbackendapplication.controller;

import com.example.mapbackendapplication.entity.LocationAndTime;
import com.example.mapbackendapplication.repository.LocationAndTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class LocationAndTimeController {

    @Autowired
    LocationAndTimeRepository locationAndTimeRepository;

    @PostMapping(path="/insert", consumes = {"application/json"})
    public LocationAndTime saveData(@RequestBody LocationAndTime locTime) throws IOException {
        LocationAndTime record = locationAndTimeRepository.save(locTime);
            return record;
        }

    @GetMapping(path="/get-all")
    public @ResponseBody
    Iterable<LocationAndTime> getAll(){
        assert locationAndTimeRepository != null;
        return locationAndTimeRepository.findAll();
    }

}

