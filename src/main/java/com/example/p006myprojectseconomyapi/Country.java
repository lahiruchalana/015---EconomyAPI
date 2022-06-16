package com.example.p006myprojectseconomyapi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Countries")
public class Country {
    @Id
    private String country_id;
    private String country_name;
    private String country_region;
    private int country_population;
    private int country_gdp;
    private int country_cab;
    private int country_gdp_per_capita;


    public Country(String country_id, String country_name, String country_region, int country_population, int country_gdp, int country_cab, int country_gdp_per_capita) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.country_region = country_region;
        this.country_population = country_population;
        this.country_gdp = country_gdp;
        this.country_cab = country_cab;
        this.country_gdp_per_capita = country_gdp_per_capita;
    }

    public String getId() {
        return country_id;
    }

    public String getName() {
        return country_name;
    }

    public String getRegion() {
        return country_region;
    }

    public int getPopulation() {
        return country_population;
    }

    public int getGDP() {
        return country_gdp;
    }

    public int getCAB() {
        return country_cab;
    }

    public int getGDPPerCapita() {
        return country_gdp_per_capita;
    }

}
