package com.petarbogdan.service1;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.petarbogdan.service1.domain.SubscriptionModel;
import com.petarbogdan.service1.domain.UserModel;
import com.petarbogdan.service1.domain.UserSubRel;
import com.petarbogdan.service1.domain.WeatherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Configuration
@EnableScheduling
public class Service {


    @Autowired
    private RestTemplate restTemplate;



    @Scheduled(fixedRate = 10000L)
    public static void doIt1(){
        String key = "e3cb8fb5f59a3e86822c810d6f19e6f5";
         String apiBase = "https://api.darksky.net/forecast/" + key + "/";
        System.out.println("cao");
        String uri = "http://localhost:9000/service2/subs";
        RestTemplate restTemplate = new RestTemplate();


        /*ResponseEntity<List<SubscriptionModel>> responseEntity = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<SubscriptionModel>  >() {
                });
        List<SubscriptionModel> subs = responseEntity.getBody();

        String darkSky = apiBase + subs.get(0).getLatitude() + "," + subs.get(0).getLongitude() + "?units=si";

        WeatherModel o = restTemplate.getForObject(darkSky, WeatherModel.class);
        System.out.println(o.getTimezone());
        System.out.println(o.getCurrently().pressure);
        System.out.println(o.getCurrently().summary);
        System.out.println(o.getCurrently().temperature);
        System.out.println(o.getCurrently().windSpeed);*/

        ResponseEntity<List<UserSubRel>> reposnseRel = restTemplate.exchange(
                "http://localhost:9000/service2/rel",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserSubRel>  >() {
                });
        List<UserSubRel> rels = reposnseRel.getBody();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ResponseEntity<List<SubscriptionModel>> reposnseSubs = restTemplate.exchange(
                "http://localhost:9000/service2/subs",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<SubscriptionModel>  >() {
                });
        List<SubscriptionModel> subs = reposnseSubs.getBody();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ResponseEntity<List<UserModel>> reposnseUsers = restTemplate.exchange(
                "http://localhost:9000/service2/user/all",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserModel>  >() {
                });
        List<UserModel> users = reposnseUsers.getBody();


        Long userId;
        Long subId;

        for(UserSubRel rel : rels){
           subId = rel.getSubId();
           userId = rel.getUserId();

            SubscriptionModel s = SubscriptionModel.findById(subId, subs);
            if(s!= null && s.getType()==1){
                UserModel u = UserModel.findById(userId,users);

                String darkSky = apiBase + s.getLatitude() + "," + s.getLongitude() + "?units=si";
                WeatherModel o = restTemplate.getForObject(darkSky, WeatherModel.class);

                System.out.println(o.getTimezone());
                System.out.println(o.getCurrently().pressure);
                System.out.println(o.getCurrently().summary);
                System.out.println(o.getCurrently().temperature);
                System.out.println(o.getCurrently().windSpeed);

                System.out.println(s.getCity());
                System.out.println(s.getType());
                System.out.println(u.getEmail());
                System.out.println(u.getUsername());
                System.out.println("--------------------------------------------------------------------------------------");

            }






        }








    }

    @Scheduled(fixedRate = 60000L)
    public static void doIt6(){
        String key = "e3cb8fb5f59a3e86822c810d6f19e6f5";
        String apiBase = "https://api.darksky.net/forecast/" + key + "/";
        System.out.println("cao");
        String uri = "http://localhost:9000/service2/subs";
        RestTemplate restTemplate = new RestTemplate();


        /*ResponseEntity<List<SubscriptionModel>> responseEntity = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<SubscriptionModel>  >() {
                });
        List<SubscriptionModel> subs = responseEntity.getBody();

        String darkSky = apiBase + subs.get(0).getLatitude() + "," + subs.get(0).getLongitude() + "?units=si";

        WeatherModel o = restTemplate.getForObject(darkSky, WeatherModel.class);
        System.out.println(o.getTimezone());
        System.out.println(o.getCurrently().pressure);
        System.out.println(o.getCurrently().summary);
        System.out.println(o.getCurrently().temperature);
        System.out.println(o.getCurrently().windSpeed);*/

        ResponseEntity<List<UserSubRel>> reposnseRel = restTemplate.exchange(
                "http://localhost:9000/service2/rel",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserSubRel>  >() {
                });
        List<UserSubRel> rels = reposnseRel.getBody();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ResponseEntity<List<SubscriptionModel>> reposnseSubs = restTemplate.exchange(
                "http://localhost:9000/service2/subs",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<SubscriptionModel>  >() {
                });
        List<SubscriptionModel> subs = reposnseSubs.getBody();
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ResponseEntity<List<UserModel>> reposnseUsers = restTemplate.exchange(
                "http://localhost:9000/service2/user/all",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserModel>  >() {
                });
        List<UserModel> users = reposnseUsers.getBody();


        Long userId;
        Long subId;

        for(UserSubRel rel : rels){
            subId = rel.getSubId();
            userId = rel.getUserId();

            SubscriptionModel s = SubscriptionModel.findById(subId, subs);
            if(s!= null && s.getType()==6){
                UserModel u = UserModel.findById(userId,users);

                String darkSky = apiBase + s.getLatitude() + "," + s.getLongitude() + "?units=si";
                WeatherModel o = restTemplate.getForObject(darkSky, WeatherModel.class);

                System.out.println(o.getTimezone());
                System.out.println(o.getCurrently().pressure);
                System.out.println(o.getCurrently().summary);
                System.out.println(o.getCurrently().temperature);
                System.out.println(o.getCurrently().windSpeed);

                System.out.println(s.getCity());
                System.out.println(s.getType());
                System.out.println(u.getEmail());
                System.out.println(u.getUsername());
                System.out.println("--------------------------------------------------------------------------------------");

            }






        }








    }

}
