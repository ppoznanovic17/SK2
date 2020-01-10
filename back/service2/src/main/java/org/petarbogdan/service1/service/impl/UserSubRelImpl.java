package org.petarbogdan.service1.service.impl;

import org.petarbogdan.service1.dao.UserSubRelDao;
import org.petarbogdan.service1.domain.UserSubRel;
import org.petarbogdan.service1.service.UserSubRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSubRelImpl implements UserSubRelService {

        @Autowired
        UserSubRelDao rel;


    @Override
    public List<UserSubRel> findAll() {

        return rel.findAll();
    }

    @Override
    public List<UserSubRel> findAllByUserId(Long aLong) {
        return rel.findAllByUserId(aLong);
    }



    @Override
    public void deleteById(Long aLong) {
        rel.deleteById(aLong);
    }


    @Override
    public UserSubRel save(UserSubRel userSubRel) {

        Optional<UserSubRel> pom = findById(userSubRel.getId());
        if(pom!= null){
            return rel.save(userSubRel);
        }

        return null;
    }

    @Override
    public Optional<UserSubRel> findById(Long id) {
        return rel.findById(id);
    }
}
