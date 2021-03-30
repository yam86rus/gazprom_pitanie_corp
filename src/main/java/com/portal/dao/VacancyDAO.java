package com.portal.dao;

import com.portal.entity.Vacancy;

import java.util.List;

public interface VacancyDAO {
    public List<Vacancy> getAllVacancies();
    public void saveVacancy (Vacancy vacancy);
    public Vacancy getVacancy(int id);
    public void deleteVacancy(int id);
}
