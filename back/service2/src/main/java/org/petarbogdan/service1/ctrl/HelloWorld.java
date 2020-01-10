package org.petarbogdan.service1.ctrl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.petarbogdan.service1.dao.SubscriptionDao;
import org.petarbogdan.service1.dao.UserDao;
import org.petarbogdan.service1.dao.UserSubRelDao;
import org.petarbogdan.service1.domain.SubscriptionModel;
import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.domain.UserSubRel;
import org.petarbogdan.service1.service.impl.UserSubRelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Getter
@Setter
@AllArgsConstructor
public class HelloWorld {

    @Autowired
    SubscriptionDao sdao;

    @Autowired
    UserDao udao;

    @Autowired
    UserSubRelDao reldao;



   /* @GetMapping(path = "/test")
    public UserSubRel hello () {
        UserSubRel rel = new UserSubRel();
        UserModel user = new UserModel();
        user.setEmail("email@gmail.com");
        user.setPassword("pass");
        user.setUsername("pass");

        SubscriptionModel sub = new SubscriptionModel();
        sub.setCity("Markovac");
        sub.setCountry("Zarkovo");

        rel.setSubscription(sub);
        rel.setUser(user);

        reldao.save(rel);

        return  rel;
    }*/

    /*@GetMapping(path = "/test")
    public UserModel hello () {
       this.run();
       return new UserModel();
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        udao.deleteById( id);
    }

    @GetMapping(path = "/list/{id}")
    public List list(@PathVariable Long id) {
        List a = new ArrayList();
        UserModel u =  udao.findById(id).get();
        if(u!= null){
            for(SubscriptionModel subscriptionModel: u.getSubscriptionModelList()){
                a.add(subscriptionModel);
            }
            return a;
        }

        return new ArrayList();
    }




    public void run(){

        Optional<UserModel> u = udao.findById(29L);
        if(u!= null){
            UserModel user = u.get();
            SubscriptionModel s = new SubscriptionModel();
            s.setCountry("Srbijaaaa");
            s.setCity("MARKOVAAAAC");

            user.getSubscriptionModelList().add(s);
            s.getUsers().add(user);

            sdao.save(s);
            udao.save(user);
        }










    }*/
}
