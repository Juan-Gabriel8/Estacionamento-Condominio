package com.Jgroup.controleestacionamento.service;

import com.Jgroup.controleestacionamento.model.ParkingSpotModel;
import com.Jgroup.controleestacionamento.repository.ParkingSpotRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = {})
public class ParkingSpotServiceTest {

    @MockBean
    private ParkingSpotRepository  parkingSpotRepository;

    @Autowired
    ParkingSpotService service;
    @Test
    void BuscarTodos(){
        List<ParkingSpotModel> parkingSpotModelList = new ArrayList<>();
        parkingSpotModelList.add(new ParkingSpotModel());
        Pageable pageable = PageRequest.of(0, 10);
        Page<ParkingSpotModel> parkingSpotModelPage = new PageImpl<>(parkingSpotModelList, pageable, parkingSpotModelList.size());
        when(parkingSpotRepository.findAll((Pageable) any(ParkingSpotModel.class))).thenReturn(parkingSpotModelPage);

    }
}
