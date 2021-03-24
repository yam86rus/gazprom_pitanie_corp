package com.portal.service;

import com.portal.dao.UsersDAO;
import com.portal.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersDAO usersDAO;

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }
}
