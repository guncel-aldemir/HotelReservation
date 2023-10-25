package com.hotel.reservationSystem.services;

import com.hotel.reservationSystem.models.Hotel;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface HotelService {
     List<Hotel> getAllHotel();
     void save(List<Hotel> hotels);

     List<Hotel> getAllHotelByFilter(Boolean isAdult,Boolean isChild,Boolean isFamily,Boolean isHoneymoon,Boolean isParkingLot, Boolean isPet, Boolean isPool , String location, Integer price);
}
