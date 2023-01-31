package com.techreturners.encapsulation.bankaccount.model;

import static org.junit.jupiter.api.Assertions.*;
class WeatherReporterTest {

    @org.junit.jupiter.api.Test
    void printForLocation() {
        WeatherReporter wr = new WeatherReporter("London",23.0);
        String locationReport = wr.printForLocation();
        String generatedString = "I am in London and it is \uD83C\uDF26. Ahhh...it's just right \uD83D\uDE0A!. The temperature in Fahrenheit is 73.4.";
        assertEquals(locationReport,generatedString);
    }

    @org.junit.jupiter.api.Test
    void checkBrightnessForLocation() {
        WeatherReporter wr = new WeatherReporter("London",23.0);
        String brightnessReport = wr.checkBrightnessForLocation();
        String generatedString = "\uD83C\uDF26";
        assertEquals(brightnessReport,generatedString);

    }

    @org.junit.jupiter.api.Test
    void checkTemperatureIsHotOrCold() {
        WeatherReporter wr = new WeatherReporter("London",23.0);
        String temperatureReport = wr.checkTemperatureIsHotOrCold();
        String generatedString = "Ahhh...it's just right \uD83D\uDE0A!";
        assertEquals(temperatureReport,generatedString);
    }
}