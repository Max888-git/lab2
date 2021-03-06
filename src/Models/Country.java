package Models;

import java.lang.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    private String name;
    private long population;
    private double area;
    private String capital;

    Country(){
        name = "CountryName";
        population = 100000;
        area = 767676;
        capital = "Capital City";
    }

    public Country(String name, long population, double area, String capital) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.capital = capital;
    }

    /**
     * GETTER / SETTER
     */

    public String getName(){
        return name;
    }
    public long getPopulation(){
        return population;
    }
    public double getArea(){
        return area;
    }
    public String getCapital(){
        return capital;
    }


    @JsonIgnoreProperties
    public String getInfo(){
        return (
                "Name: " + getName() +
                ", Capital: " + getCapital() +
                "\nArea: " + getArea() +
                "\nPopulation: " + getPopulation()
                );
    }
    @JsonIgnoreProperties
    public String getCountry(){
        return (getName()+", "+getCapital());
    }

    public static final class Builder {
        private String name;
        private long population;
        private double area;
        private String capital;

        public Builder() {
        }

        public static Builder aCountry() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPopulation(long population) {
            this.population = population;
            return this;
        }

        public Builder setArea(double area) {
            this.area = area;
            return this;
        }

        public Builder setCapital(String capital) {
            this.capital = capital;
            return this;
        }

        public Country build() {
            return new Country(name, population, area, capital);
        }
    }
}