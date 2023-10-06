package com.hotel.reservationSystem.repository;

import com.hotel.reservationSystem.models.Hotel;
import com.hotel.reservationSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
}

