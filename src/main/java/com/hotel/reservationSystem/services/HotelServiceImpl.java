package com.hotel.reservationSystem.services;

import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.repository.HotelDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public Hotel save(Hotel hotel) {
        // boolean isExist= hotelDAO.selectExistInstructor(hotel.getHotelID());
       // if(isExist){
       //     throw new InstructorIsAlreadyExistException("Instructor Is Already Exist With Same Email!");}
       // return instructorRepository.save(instructor);
        return null;
    }

}
