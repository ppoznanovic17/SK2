package org.petarbogdan.service1.ctrl;

import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserCtrl {

    @Autowired
    private UserService userService;


    @GetMapping(path = "/all")
    public List<UserModel> allUsers(){
        return userService.findAllUsers();
    }

    @GetMapping(path = "/{username}")
    public Optional<UserModel> userByUsername(@PathVariable String username){
        return userService.findByUsername(username);
    }

    @GetMapping(path = "/id/{id}")
    public Optional<UserModel> userById(@PathVariable Long id){
        return userService.findById(id);
    }

}
