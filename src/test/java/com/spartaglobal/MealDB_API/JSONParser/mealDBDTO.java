package com.spartaglobal.MealDB_API.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

public class mealDBDTO {
    private List<Map<String, String>> categories;

    public List<Map<String, String>> getCategories() {
        return categories;
    }

    public int sizeOfCategories(){
       return getCategories().size();
    }

    public Map<String,String> getIndividualCategory(int indexNum){
        System.out.println(categories.get(indexNum).getClass());
        return categories.get(indexNum);
    }

    public String accessItemUsingIndexAndKey(int indexnum, String key){
        return getIndividualCategory(indexnum).get(key);
    }

    public String accessItemUsingContents(String type){
        return getIndividualCategory(1).get(type);
    }



    //
//    public List<Map<String, Object>> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<Map<String, Object>> categories) {
//        this.categories = categories;
//    }
//
//
}
