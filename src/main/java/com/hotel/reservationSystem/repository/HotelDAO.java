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
}

