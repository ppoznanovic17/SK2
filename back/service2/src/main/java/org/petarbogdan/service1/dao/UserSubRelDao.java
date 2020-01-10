package org.petarbogdan.service1.dao;

import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.domain.UserSubRel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserSubRelDao extends JpaRepository<UserSubRel, Long> {

    List<UserSubRel> findAll();

    List<UserSubRel> findAllByUserId(Long aLong);


    void deleteById(Long aLong);

    Optional<UserSubRel> findById(Long id);




}
