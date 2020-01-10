package com.petarbogdan.service1.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class SubscriptionModel {


    private long subscriptionId;

    private String city;

    private int type;

    private String country;

    private double longitude;

    private double latitude;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubscriptionModel that = (SubscriptionModel) o;
        return subscriptionId == that.subscriptionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    public void setSubscriptionId(long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getType() {
        return type;
    }



    public long getSubscriptionId() {
        return subscriptionId;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public static SubscriptionModel findById(Long id, List<SubscriptionModel> list){
        for(SubscriptionModel u: list){
            if(u.subscriptionId == id){
                return u;
            }
        }return null;
    }


}
