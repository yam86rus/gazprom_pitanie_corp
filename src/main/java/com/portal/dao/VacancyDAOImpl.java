package com.portal.dao;

import com.portal.entity.Vacancy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VacancyDAOImpl implements VacancyDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Vacancy> getAllVacancies() {
        Session session = sessionFactory.getCurrentSession();
        Query <Vacancy> query = session.createQuery("from Vacancy",Vacancy.class);
        List<Vacancy> allVacancies = query.getResultList();

        return allVacancies;
    }
}
