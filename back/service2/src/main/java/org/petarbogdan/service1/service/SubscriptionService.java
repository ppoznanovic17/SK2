package org.petarbogdan.service1.service;

import org.petarbogdan.service1.domain.SubscriptionModel;
import org.petarbogdan.service1.domain.UserSubRel;

import java.util.List;
import java.util.Optional;


public interface SubscriptionService  {

    List<SubscriptionModel> findAll();


    Optional<SubscriptionModel> findById(Long aLong);

    List<SubscriptionModel> findAllByCity(String city);

    List<SubscriptionModel> findAllByType(int type);

}
