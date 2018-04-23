package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itpark.entity.Lead;

import java.util.List;

/**
 * Created by Student21 on 19.06.2017.
 */
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
    List<Lead> findByNameStartingWithOrEmailContainingAllIgnoreCase(String name, String email);
    List<Lead> findByNameStartingWithIgnoreCase(String name);
    List<Lead> findByEmailContainingIgnoreCase(String email);
    List<Lead> findByPhoneStartingWith(String phone);
}
