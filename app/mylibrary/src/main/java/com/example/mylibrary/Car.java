package com.example.mylibrary;

public class Car {

    int id;
    String name;
    String color;
    int year;

    public Car(int id, String name, String color, int year) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.year = year;}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
