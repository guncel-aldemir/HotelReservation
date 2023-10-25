package com.hotel.reservationSystem.services.formatter;


import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonFormaterImpl implements JsonFormatService {
    @Override
    public JSONObject JsonToString(String pngUrlJsonString) throws ParseException {

        JSONParser parser= new JSONParser();
        JSONObject jsp;
        jsp=(JSONObject) parser.parse(pngUrlJsonString.replace("'", "\""));
        return jsp;
    }

    @Override
    public String stringToJson(JSONObject jsonObject) {
        return jsonObject.toString();
    }
}
