package com.hotel.reservationSystem.controller;

import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.services.HotelService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HotelControllerImpl {

    @Autowired
    @Setter
    HotelService hotelService;

    @GetMapping("hotels")
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotel();
    }

    // create instructor rest api
   // @PostMapping("/instructors")
   // public Instructor createInstructor(@RequestBody Instructor instructor) {
   //     return instructorService.save(instructor);
   // }


}
