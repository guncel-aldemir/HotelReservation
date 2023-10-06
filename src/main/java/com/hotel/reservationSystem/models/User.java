package com.hotel.reservationSystem.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Entity db'de tablo oluşturu kolonlarla(variables)
// Data getter setter hashcode equals ekler
// NoAArgsConstructor gerekli her zaman
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    // primarykey olmak zorunda @entity anotasyonu nedeniyle db'ye setlerken gerekli
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;

}