/*
 * WeatherAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.weatherapi.api.models;

import java.util.*;

public class Forecast1Builder {
    //the instance to build
    private Forecast1 forecast1;

    /**
     * Default constructor to initialize the instance
     */
    public Forecast1Builder() {
        forecast1 = new Forecast1();
    }

    public Forecast1Builder forecastday(List<Forecastday1> forecastday) {
        forecast1.setForecastday(forecastday);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Forecast1 build() {
        return forecast1;
    }
}