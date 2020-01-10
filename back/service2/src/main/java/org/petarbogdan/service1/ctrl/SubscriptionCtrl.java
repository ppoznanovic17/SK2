package org.petarbogdan.service1.ctrl;

import org.petarbogdan.service1.domain.SubscriptionModel;
import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SubscriptionCtrl {

    @Autowired
    SubscriptionService subscriptionService;

    @GetMapping(path = "/subs")
    public List<SubscriptionModel> getAllSubs(){
        return subscriptionService.findAll();
    }

    @GetMapping(path = "/subs/type/{type}")
    public List<SubscriptionModel> getAllByType(@PathVariable int type ){
        return subscriptionService.findAllByType(type);
    }

    @GetMapping(path = "/subs/city/{city}")
    public List<SubscriptionModel> getSubByCity(@PathVariable String city ){
        return subscriptionService.findAllByCity(city);
    }






}
