package com.hotel.reservationSystem.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

// Entity db'de tablo oluşturu kolonlarla(variables)
// Data getter setter hashcode equals ekler
// NoAArgsConstructor gerekli her zaman
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel  {

    // primarykey olmak zorunda @entity anotasyonu nedeniyle db'ye setlerken gerekli
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String hotelDescription;

    private String hotelName;

    private boolean isPool;

    private boolean isParkingLot;

    private boolean isPet;

    private boolean isHoneymoon;

    private boolean isAdult;

    private boolean isFamily;

    private boolean isChild;

    private String neighbourhood;

    private String location;

    private Double rating;

    private String latitude;

    private String longitude;

    private String pngURL;

    private Integer stars;

    private Integer commentNum;

    private Integer price;

    private String kitchenNumber;

    private String hotelConcept;




}