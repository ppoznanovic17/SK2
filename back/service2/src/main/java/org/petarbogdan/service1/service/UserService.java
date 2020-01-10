package org.petarbogdan.service1.service;

import org.petarbogdan.service1.domain.UserModel;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<UserModel> findAllUsers();

    Optional<UserModel> findByUsername(String username);

    Optional<UserModel> findById(Long id);

    UserModel save(UserModel UserModel);

    void deleteById (Long id);

}
