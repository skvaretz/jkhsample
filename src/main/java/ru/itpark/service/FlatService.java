package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.entity.FlatEntity;

import ru.itpark.repository.FlatRepository;

import java.util.List;


/**
 * Created by alexander.skvortsov on 06.08.2017.
 */
@Service
public class FlatService {
    private final FlatRepository repository;

    @Autowired
    public FlatService(FlatRepository repository) {
        this.repository = repository;
    }

    public List<FlatEntity> findAll() {
        return repository.findAll();
    }

    public FlatEntity findOne(long id) {
        return repository.findOne(id);
    }




    public void save(FlatEntity flat) {
        repository.save(flat);
    }

    public void delete(long id) {
        repository.delete(id);
    }
}
