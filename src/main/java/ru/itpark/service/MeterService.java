package ru.itpark.service;
import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.itpark.entity.MeterEntity;
import ru.itpark.entity.MetersTypeEntity;
import ru.itpark.repository.MeterRepository;
import ru.itpark.repository.MetersTypeRepository;

import java.util.List;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@Service
public class MeterService {
    private final MeterRepository repository;

    @Autowired
    public MeterService(MeterRepository repository) {
        this.repository = repository;
    }

    public List<MeterEntity> findAll() {
        return repository.findAll();
    }

    public MeterEntity findOne(long id) {
        return repository.findOne(id);
    }




    public void save(MeterEntity meter) {
        repository.save(meter);
    }

    public void delete(long id) {
        repository.delete(id);
    }


}