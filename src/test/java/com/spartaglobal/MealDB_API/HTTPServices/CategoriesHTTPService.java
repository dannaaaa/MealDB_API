package com.spartaglobal.MealDB_API.HTTPServices;

import com.spartaglobal.MealDB_API.config.APIKey;
import com.spartaglobal.MealDB_API.config.MealDBURLConfig;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class CategoriesHTTPService {

    private CloseableHttpResponse catResponse;
    private String mealDBCategoriesJSONString;

    public void executeCategoriesGetRequest(){

        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

        String  categoriesServiceURL = MealDBURLConfig.BASEURL + MealDBURLConfig.CATEGORIESMEALENDPOINT + "?" + APIKey.APIKEY;

        HttpGet httpGet = new HttpGet(categoriesServiceURL);
        try {
            catResponse = closeableHttpClient.execute(httpGet);
            mealDBCategoriesJSONString = EntityUtils.toString(catResponse.getEntity());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getMealDBCategoriesJSONString (){
        return mealDBCategoriesJSONString;
    }




}
