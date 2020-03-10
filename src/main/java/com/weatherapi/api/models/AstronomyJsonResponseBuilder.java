/*
 * WeatherAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.weatherapi.api.models;

import java.util.*;

public class AstronomyJsonResponseBuilder {
    //the instance to build
    private AstronomyJsonResponse astronomyJsonResponse;

    /**
     * Default constructor to initialize the instance
     */
    public AstronomyJsonResponseBuilder() {
        astronomyJsonResponse = new AstronomyJsonResponse();
    }

    public AstronomyJsonResponseBuilder location(Location location) {
        astronomyJsonResponse.setLocation(location);
        return this;
    }

    public AstronomyJsonResponseBuilder astronomy(Astronomy astronomy) {
        astronomyJsonResponse.setAstronomy(astronomy);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AstronomyJsonResponse build() {
        return astronomyJsonResponse;
    }
}