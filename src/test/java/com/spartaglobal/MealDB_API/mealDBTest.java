package com.spartaglobal.MealDB_API;

import com.fasterxml.jackson.databind.JsonNode;
import com.spartaglobal.MealDB_API.HTTPServices.CategoriesHTTPService;
import com.spartaglobal.MealDB_API.JSONParser.mealDBDeserialiser;
import org.junit.BeforeClass;
import org.junit.Test;

public class mealDBTest {

    public static mealDBDeserialiser mealDB;

    static CategoriesHTTPService categoriesHTTPService = new CategoriesHTTPService();

    @BeforeClass
    public static void setup(){

        categoriesHTTPService.executeCategoriesGetRequest();
        mealDB = new mealDBDeserialiser(categoriesHTTPService.getMealDBCategoriesJSONString());
    }

    @Test
    public void testResponse (){

//        System.out.println(mealDB.mealDEMapped.sizeOfCategories());
//        System.out.println(mealDB.mealDEMapped.accessItemUsingIndexAndKey(1,"strCategoryDescription"));
        System.out.println(mealDB.mealDEMapped.accessItemUsingContents("beef"));

    }





}
