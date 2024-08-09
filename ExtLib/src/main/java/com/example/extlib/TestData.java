package com.example.extlib;

import com.google.gson.Gson;

public class TestData {
    public TestData() {
    }

    public String getTestData(){

        Car c=new Car(10, "TATA","RED", 2000);


        Gson gson = new Gson();

        String json = gson.toJson(c);

        return json;


    }


}
