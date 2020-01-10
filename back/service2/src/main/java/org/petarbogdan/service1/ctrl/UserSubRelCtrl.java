package org.petarbogdan.service1.ctrl;

import org.petarbogdan.service1.domain.SubscriptionModel;
import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.domain.UserSubRel;
import org.petarbogdan.service1.service.UserSubRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserSubRelCtrl {

    @Autowired
    UserSubRelService userSubRelService;

    @GetMapping(path = "/rel")
    public List<UserSubRel> gelAllSubs(){
        return userSubRelService.findAll();
    }

    @GetMapping(path = "/rel/{user}")
    public List<UserSubRel> getByUser(@PathVariable Long user){
        return userSubRelService.findAllByUserId(user);
    }

    @PostMapping(path = "/rel/post")
    public UserSubRel newSubsUser (@RequestBody UserSubRel userSubRel){
        return userSubRelService.save(userSubRel);

    }

    @DeleteMapping(path = "/rel/del/{id}")
    public void deleteRel(@PathVariable Long id){
         userSubRelService.deleteById(id);
    }


}
