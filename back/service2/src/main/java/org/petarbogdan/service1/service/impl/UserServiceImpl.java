package org.petarbogdan.service1.service.impl;

import org.petarbogdan.service1.dao.UserDao;
import org.petarbogdan.service1.domain.UserModel;
import org.petarbogdan.service1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<UserModel> findAllUsers() {
        return userDao.findAll();
    }

    @Override
    public Optional<UserModel> findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public Optional<UserModel> findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public UserModel save(UserModel UserModel) {
        return userDao.save(UserModel);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }
}
