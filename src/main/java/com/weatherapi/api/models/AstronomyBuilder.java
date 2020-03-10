/*
 * WeatherAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.weatherapi.api.models;

import java.util.*;

public class AstronomyBuilder {
    //the instance to build
    private Astronomy astronomy;

    /**
     * Default constructor to initialize the instance
     */
    public AstronomyBuilder() {
        astronomy = new Astronomy();
    }

    public AstronomyBuilder astro(Astro astro) {
        astronomy.setAstro(astro);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Astronomy build() {
        return astronomy;
    }
}