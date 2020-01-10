package org.petarbogdan.service1.service;

import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.domain.UserSubRel;

import java.util.List;
import java.util.Optional;

public interface UserSubRelService {

    List<UserSubRel> findAll();

    List<UserSubRel> findAllByUserId(Long aLong);


    void deleteById(Long aLong);

     UserSubRel save(UserSubRel userSubRel);

     Optional<UserSubRel> findById(Long id);
}
