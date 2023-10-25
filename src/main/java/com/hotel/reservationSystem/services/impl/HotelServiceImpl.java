package com.hotel.reservationSystem.services.impl;

import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.repository.HotelDAO;
import com.hotel.reservationSystem.services.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelDAO hotelDAO;

    @Transactional(readOnly = true)
    @Override
    public List<Hotel> getAllHotel(){
        return hotelDAO.findAll();
    }



    @Transactional
    @Override
    public void save(List<Hotel> hotels) {
         hotelDAO.saveAll(hotels);
    }


    @Transactional
    @Override
    public List<Hotel> getAllHotelByFilter(

                                           Boolean isAdult,
                                           Boolean isChild,
                                           Boolean isFamily,
                                           Boolean isHoneymoon,
                                           Boolean isParkingLot,
                                           Boolean  isPet,
                                           Boolean isPool,
                                           String location,
                                           Integer price
                                          ){

        return hotelDAO.getAllHotelByFilter(
                                                isAdult,
                                                isChild,
                                                isFamily,
                                                isHoneymoon,
                                                isParkingLot ,
                                                isPet,
                                                isPool ,
                                                location,
                                                price
                                              );
    }

}
