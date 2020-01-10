package org.petarbogdan.service1.dao;

import org.petarbogdan.service1.domain.SubscriptionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubscriptionDao extends JpaRepository<SubscriptionModel, Long> {


    List<SubscriptionModel> findAll();


    Optional<SubscriptionModel> findById(Long aLong);

    List<SubscriptionModel> findAllByCity(String city);

    List<SubscriptionModel> findAllByType(int type);


}
