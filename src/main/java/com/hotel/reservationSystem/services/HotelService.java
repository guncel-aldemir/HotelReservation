package com.hotel.reservationSystem.services;

import com.hotel.reservationSystem.models.Hotel;

import java.util.List;


public interface HotelService {
    public List<Hotel> getAllHotel();
    public Hotel save(Hotel hotel);
}
