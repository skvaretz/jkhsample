package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.entity.Lead;
import ru.itpark.repository.LeadRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by worker on 7/3/17.
 */

@Service
public class LeadService {
    private final LeadRepository repository;

    @Autowired
    public LeadService(LeadRepository repository) {
        this.repository = repository;
    }

    public List<Lead> findAll() {
        return repository.findAll();
    }

    public Lead findOne(long id) {
        return repository.findOne(id);
    }

    public List<Lead> searchEveryWhere(String text) {
        // Это дело сервиса, как искать и по каким полям в репозитории (тут нужно два параметра, т.к. у нас два поля в методе)
        return repository.findByNameStartingWithOrEmailContainingAllIgnoreCase(text, text);
    }

    public List<Lead> searchByName(String name) {
        return repository.findByNameStartingWithIgnoreCase(name);
    }

    public List<Lead> searchByEmail(String email) {
        return repository.findByEmailContainingIgnoreCase(email);
    }

    public List<Lead> searchByPhone(String phone) {
        return repository.findByPhoneStartingWith(phone);
    }

    public void save(Lead lead) {
        repository.save(lead);
    }

    public void delete(long id) {
       repository.delete(id);
    }
}
