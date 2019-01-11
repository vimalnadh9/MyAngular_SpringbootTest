package com.globaltech.bikes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globaltech.bikes.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
