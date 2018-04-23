package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.entity.IndicatorEntity;
import ru.itpark.entity.TenantEntity;
import ru.itpark.repository.TenantRepository;

import java.util.List;

/**
 * Created by alexander.skvortsov on 09.08.2017.
 */
@Service
public class TenantService {
    private final TenantRepository repository;

    @Autowired
    public TenantService(TenantRepository repository) {
        this.repository = repository;
    }

    public List<TenantEntity> findAll() {
        return repository.findAll();
    }

    public TenantEntity findOne(long id) {
        return repository.findOne(id);
    }

    public TenantRepository getRepository() {
        return repository;
    }

    public void save(TenantEntity tenantEntity) {
        repository.save(tenantEntity);
    }

    public void delete(long id) {
        repository.delete(id);
    }
}
