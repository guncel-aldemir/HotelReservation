package com.hotel.reservationSystem.repository;

import com.hotel.reservationSystem.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelDAO extends JpaRepository<Hotel, Long> {

    // @Query(value = "select * from hotel where hotel.price between :min and :max ")
    // List<Hotel> getBetweenPriceMaxAndMin(Double min, Double max);


    @Query(value = "from Hotel hotel " +
            "where hotel.location  LIKE  :location " +

            "AND hotel.isAdult IN (true, :isAdult)" +
            "AND hotel.isChild IN (true , :isChild)" +
            "AND hotel.isFamily IN (true, :isFamily)" +
            "AND hotel.isHoneymoon IN (true, :isHoneymoon)" +
            "AND hotel.isParkingLot IN (true, :isParkingLot)" +
            "AND hotel.isPet IN (true, :isPet)" +
            "AND hotel.isPool IN (true, :isPool)" +
            "AND hotel.price = :price ")
    List<Hotel> getAllHotelByFilter(Boolean isAdult,Boolean isChild,Boolean isFamily,Boolean isHoneymoon,Boolean isParkingLot, Boolean isPet, Boolean isPool,String location, Integer price);
}

