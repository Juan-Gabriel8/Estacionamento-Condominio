package com.Jgroup.controleestacionamento.repository;

import com.Jgroup.controleestacionamento.model.ParkingSpotModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
