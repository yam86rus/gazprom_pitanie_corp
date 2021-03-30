package com.portal.service;

import com.portal.entity.Vacancy;

import java.util.List;

public interface VacancyService {
    public List<Vacancy> getAllVacancies();
    public void saveVacancy (Vacancy vacancy);
    public Vacancy getVacancy(int id);
    public void deleteVacancy(int id);

}
