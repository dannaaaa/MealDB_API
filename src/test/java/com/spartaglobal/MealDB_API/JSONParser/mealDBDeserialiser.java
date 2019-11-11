package com.spartaglobal.MealDB_API.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class mealDBDeserialiser {
    public mealDBDTO mealDEMapped;


    public mealDBDeserialiser(String jsonString) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            mealDEMapped = objectMapper.readValue((jsonString), mealDBDTO.class );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
