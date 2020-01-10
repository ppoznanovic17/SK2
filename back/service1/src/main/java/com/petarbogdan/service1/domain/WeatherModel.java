package com.petarbogdan.service1.domain;

public class WeatherModel {

    public String timezone;

    public CurrentlyModel currently;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public CurrentlyModel getCurrently() {
        return currently;
    }
}
