package org.petarbogdan.service1.domain;

import lombok.*;
import org.hibernate.mapping.List;

import javax.persistence.*;
import java.util.ArrayList;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
@Entity(name = "subscription")
public class SubscriptionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subscriptionId;

    private String city;

    private int type;

    private String country;

    private double longitude;

    private double latitude;





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


}
