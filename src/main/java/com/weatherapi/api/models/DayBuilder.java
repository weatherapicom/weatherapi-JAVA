/*
 * WeatherAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.weatherapi.api.models;

import java.util.*;

public class DayBuilder {
    //the instance to build
    private Day day;

    /**
     * Default constructor to initialize the instance
     */
    public DayBuilder() {
        day = new Day();
    }

    /**
     * Maximum temperature in celsius for the day.
     */
    public DayBuilder maxtempC(Double maxtempC) {
        day.setMaxtempC(maxtempC);
        return this;
    }

    /**
     * Maximum temperature in fahrenheit for the day
     */
    public DayBuilder maxtempF(Double maxtempF) {
        day.setMaxtempF(maxtempF);
        return this;
    }

    /**
     * Minimum temperature in celsius for the day
     */
    public DayBuilder mintempC(Double mintempC) {
        day.setMintempC(mintempC);
        return this;
    }

    /**
     * Minimum temperature in fahrenheit for the day
     */
    public DayBuilder mintempF(Double mintempF) {
        day.setMintempF(mintempF);
        return this;
    }

    /**
     * Average temperature in celsius for the day
     */
    public DayBuilder avgtempC(Double avgtempC) {
        day.setAvgtempC(avgtempC);
        return this;
    }

    /**
     * Average temperature in fahrenheit for the day
     */
    public DayBuilder avgtempF(Double avgtempF) {
        day.setAvgtempF(avgtempF);
        return this;
    }

    /**
     * Maximum wind speed in miles per hour
     */
    public DayBuilder maxwindMph(Double maxwindMph) {
        day.setMaxwindMph(maxwindMph);
        return this;
    }

    /**
     * Maximum wind speed in kilometer per hour
     */
    public DayBuilder maxwindKph(Double maxwindKph) {
        day.setMaxwindKph(maxwindKph);
        return this;
    }

    /**
     * Total precipitation in milimeter
     */
    public DayBuilder totalprecipMm(Double totalprecipMm) {
        day.setTotalprecipMm(totalprecipMm);
        return this;
    }

    /**
     * Total precipitation in inches
     */
    public DayBuilder totalprecipIn(Double totalprecipIn) {
        day.setTotalprecipIn(totalprecipIn);
        return this;
    }

    /**
     * Average visibility in kilometer
     */
    public DayBuilder avgvisKm(Double avgvisKm) {
        day.setAvgvisKm(avgvisKm);
        return this;
    }

    /**
     * Average visibility in miles
     */
    public DayBuilder avgvisMiles(Double avgvisMiles) {
        day.setAvgvisMiles(avgvisMiles);
        return this;
    }

    /**
     * Average humidity as percentage
     */
    public DayBuilder avghumidity(Double avghumidity) {
        day.setAvghumidity(avghumidity);
        return this;
    }

    public DayBuilder condition(Condition condition) {
        day.setCondition(condition);
        return this;
    }

    /**
     * UV Index
     */
    public DayBuilder uv(Double uv) {
        day.setUv(uv);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Day build() {
        return day;
    }
}