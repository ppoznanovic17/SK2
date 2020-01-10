package org.petarbogdan.service1.service.impl;

import org.petarbogdan.service1.dao.SubscriptionDao;
import org.petarbogdan.service1.dao.UserSubRelDao;
import org.petarbogdan.service1.domain.SubscriptionModel;
import org.petarbogdan.service1.domain.UserSubRel;
import org.petarbogdan.service1.service.SubscriptionService;
import org.petarbogdan.service1.service.UserSubRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionImpl implements SubscriptionService {


    @Autowired
    SubscriptionDao dao;


    @Override
    public List<SubscriptionModel> findAll() {
        return dao.findAll();
    }

    @Override
    public Optional<SubscriptionModel> findById(Long aLong) {
        return dao.findById(aLong);
    }

    @Override
    public List<SubscriptionModel> findAllByCity(String city) {
        return dao.findAllByCity(city);
    }

    @Override
    public List<SubscriptionModel> findAllByType(int type) {
        return dao.findAllByType(type);
    }
}
