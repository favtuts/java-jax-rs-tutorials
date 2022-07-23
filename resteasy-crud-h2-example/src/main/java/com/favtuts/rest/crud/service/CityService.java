package com.favtuts.rest.crud.service;

import com.favtuts.rest.crud.dao.ICityDao;
import com.favtuts.rest.crud.model.City;

import java.util.List;
import javax.inject.Inject;

public class CityService implements ICityService {
    
    @Inject
    private ICityDao cityDao;

    @Override
    public List<City> findAll() {

        return cityDao.findAll();
    }

    @Override
    public boolean save(City city) {
        
        return cityDao.save(city);
    }

    @Override
    public City find(Long id) {
        
        return cityDao.find(id);
    }

    @Override
    public boolean update(City city, Long id) {
        
        return cityDao.update(city, id);
    }

    @Override
    public boolean delete(Long id) {
        
        return cityDao.delete(id);
    }
}
