package com.hotel.reservationSystem.services.formatter;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public interface JsonFormatService {

    JSONObject JsonToString(String pngUrlJsonString) throws ParseException;

    String stringToJson(JSONObject jsonObject);
}
