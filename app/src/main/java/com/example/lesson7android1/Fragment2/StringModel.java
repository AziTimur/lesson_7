package com.example.lesson7android1.Fragment2;

import java.io.Serializable;

public class StringModel implements Serializable {
    private String nameOfPlanet, numberOfPlanet;

    public StringModel(String nameOfPlanet, String numberOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
        this.numberOfPlanet = numberOfPlanet;
    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public String getNumberOfPlanet() {
        return numberOfPlanet;
    }
}