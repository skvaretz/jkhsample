package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ru.itpark.entity.ServicesEntity;

/**
 * Created by alexander.skvortsov on 09.08.2017.
 */
@Repository
public interface ServiceRepository   extends JpaRepository<ServicesEntity, Long> {
}
