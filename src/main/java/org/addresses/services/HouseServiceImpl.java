package org.addresses.services;

import org.addresses.models.House;
import org.addresses.repositories.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseRepository repository;

    @Override
    public List<House> findAll() {
        return (List<House>) repository.findAll();
    }

    @Override
    public void addHouse(House house){
        repository.save(house);
    }

    @Override
    public void deleteHouse(String id){
        repository.deleteById(id);
    }
}
