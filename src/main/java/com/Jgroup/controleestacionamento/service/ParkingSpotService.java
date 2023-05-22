package com.Jgroup.controleestacionamento.service;

import com.Jgroup.controleestacionamento.model.ParkingSpotModel;
import com.Jgroup.controleestacionamento.repository.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }
}
