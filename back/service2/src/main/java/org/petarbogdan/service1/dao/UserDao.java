package org.petarbogdan.service1.dao;

import org.petarbogdan.service1.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<UserModel, Long> {


    List<UserModel> findAll();

    Optional<UserModel> findById(Long aLong);

    Optional<UserModel> findByUsername (String username);

    
    void deleteById(Long aLong);
}
