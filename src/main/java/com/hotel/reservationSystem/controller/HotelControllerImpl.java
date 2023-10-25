package com.hotel.reservationSystem.controller;

import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.services.HotelService;

import com.hotel.reservationSystem.services.formatter.JsonFormatService;
import lombok.Setter;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelControllerImpl {

    @Autowired
    @Setter
    HotelService hotelService;

    @Autowired
    @Setter
    JsonFormatService jsonFormatService;

    @GetMapping("/hotels")
    public List<Hotel> getAllHotel(){
        return hotelService.getAllHotel();
    }

    @GetMapping("/hotels/{isAdult}/{isChild}/{isFamily}/{isHoneymoon}/{isParkingLot}/{isPet}/{isPool}/{location}/{price}")
    public List<Hotel> getAllHotelByFilter(@PathVariable Boolean isAdult,
                                           @PathVariable Boolean isChild,
                                           @PathVariable Boolean isFamily,
                                           @PathVariable Boolean isHoneymoon,
                                           @PathVariable Boolean isParkingLot,
                                           @PathVariable Boolean isPet,
                                           @PathVariable Boolean isPool,
                                           @PathVariable String location,
                                           @PathVariable Integer price
                                           ){
        return hotelService.getAllHotelByFilter(isAdult,isChild,isFamily,isHoneymoon,isParkingLot,isPet,isPool,location,price);
    }

    @PostMapping("/hotels")
    public JSONObject stringToJson(@RequestBody List<Hotel> hotels) throws ParseException {
        return jsonFormatService.JsonToString((hotels.get(0)).getPngURL());
    }

    // create instructor rest api
   // @PostMapping("/instructors")
   // public Instructor createInstructor(@RequestBody Instructor instructor) {
   //     return instructorService.save(instructor);
   // }


}
