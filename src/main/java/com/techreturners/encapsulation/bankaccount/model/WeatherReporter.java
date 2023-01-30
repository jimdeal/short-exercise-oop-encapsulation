package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    private final String LONDON = "London";
    private final String CAPE_TOWN = "Cape Town";
    private final String CALIFORNIA = "California";
    private final int HOT_TEMPERATURE = 30;
    private final int COLD_TEMPERATURE = 10;
    private final double TEMP_CONVERT_MULTIPLIER = (9.0 / 5.0);
    private final int TEMP_CONVERT_ADD = 32;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String printForLocation() {

        double newTemp = TEMP_CONVERT_MULTIPLIER * temperature + TEMP_CONVERT_ADD;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkBrightnessForLocation(), checkTemperatureIsHotOrCold(), newTemp);

    }

    public String checkBrightnessForLocation() {
        if (location.equals(LONDON)) {

            return "🌦";

        } else if (location.equals(CALIFORNIA)) {

            return "🌅";

        } else if (location.equals(CAPE_TOWN)) {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperatureIsHotOrCold() {
        if (temperature > HOT_TEMPERATURE) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMPERATURE) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
