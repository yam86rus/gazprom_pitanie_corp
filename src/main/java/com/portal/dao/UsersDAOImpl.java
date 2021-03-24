package com.portal.dao;

import com.portal.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Users> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<Users> allUsers = session.createQuery("from Users", Users.class).getResultList();
        return allUsers;
    }
}
