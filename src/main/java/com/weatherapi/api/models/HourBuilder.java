/*
 * WeatherAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.weatherapi.api.models;

import java.util.*;

public class HourBuilder {
    //the instance to build
    private Hour hour;

    /**
     * Default constructor to initialize the instance
     */
    public HourBuilder() {
        hour = new Hour();
    }

    /**
     * Time as epoch
     */
    public HourBuilder timeEpoch(Integer timeEpoch) {
        hour.setTimeEpoch(timeEpoch);
        return this;
    }

    /**
     * Date and time
     */
    public HourBuilder time(String time) {
        hour.setTime(time);
        return this;
    }

    /**
     * Temperature in celsius
     */
    public HourBuilder tempC(Double tempC) {
        hour.setTempC(tempC);
        return this;
    }

    /**
     * Temperature in fahrenheit
     */
    public HourBuilder tempF(Double tempF) {
        hour.setTempF(tempF);
        return this;
    }

    /**
     * 1 = Yes 0 = No <br />Whether to show day condition icon or night icon
     */
    public HourBuilder isDay(Integer isDay) {
        hour.setIsDay(isDay);
        return this;
    }

    public HourBuilder condition(Condition condition) {
        hour.setCondition(condition);
        return this;
    }

    /**
     * Wind speed in miles per hour
     */
    public HourBuilder windMph(Double windMph) {
        hour.setWindMph(windMph);
        return this;
    }

    /**
     * Wind speed in kilometer per hour
     */
    public HourBuilder windKph(Double windKph) {
        hour.setWindKph(windKph);
        return this;
    }

    /**
     * Wind direction in degrees
     */
    public HourBuilder windDegree(Integer windDegree) {
        hour.setWindDegree(windDegree);
        return this;
    }

    /**
     * Wind direction as 16 point compass. e.g.: NSW
     */
    public HourBuilder windDir(String windDir) {
        hour.setWindDir(windDir);
        return this;
    }

    /**
     * Pressure in millibars
     */
    public HourBuilder pressureMb(Double pressureMb) {
        hour.setPressureMb(pressureMb);
        return this;
    }

    /**
     * Pressure in inches
     */
    public HourBuilder pressureIn(Double pressureIn) {
        hour.setPressureIn(pressureIn);
        return this;
    }

    /**
     * Precipitation amount in millimeters
     */
    public HourBuilder precipMm(Double precipMm) {
        hour.setPrecipMm(precipMm);
        return this;
    }

    /**
     * Precipitation amount in inches
     */
    public HourBuilder precipIn(Double precipIn) {
        hour.setPrecipIn(precipIn);
        return this;
    }

    /**
     * Humidity as percentage
     */
    public HourBuilder humidity(Integer humidity) {
        hour.setHumidity(humidity);
        return this;
    }

    /**
     * Cloud cover as percentage
     */
    public HourBuilder cloud(Integer cloud) {
        hour.setCloud(cloud);
        return this;
    }

    /**
     * Feels like temperature as celcius
     */
    public HourBuilder feelslikeC(Double feelslikeC) {
        hour.setFeelslikeC(feelslikeC);
        return this;
    }

    /**
     * Feels like temperature as fahrenheit
     */
    public HourBuilder feelslikeF(Double feelslikeF) {
        hour.setFeelslikeF(feelslikeF);
        return this;
    }

    public HourBuilder visKm(Double visKm) {
        hour.setVisKm(visKm);
        return this;
    }

    public HourBuilder visMiles(Double visMiles) {
        hour.setVisMiles(visMiles);
        return this;
    }

    /**
     * UV Index
     */
    public HourBuilder uv(Double uv) {
        hour.setUv(uv);
        return this;
    }

    /**
     * Wind gust in miles per hour
     */
    public HourBuilder gustMph(Double gustMph) {
        hour.setGustMph(gustMph);
        return this;
    }

    /**
     * Wind gust in kilometer per hour
     */
    public HourBuilder gustKph(Double gustKph) {
        hour.setGustKph(gustKph);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Hour build() {
        return hour;
    }
}