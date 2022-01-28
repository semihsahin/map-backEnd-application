package com.example.mapbackendapplication.repository;

import com.example.mapbackendapplication.entity.LocationAndTime;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationAndTimeRepository extends CrudRepository<LocationAndTime,Long> {
}
