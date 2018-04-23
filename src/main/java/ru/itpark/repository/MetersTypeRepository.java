package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.entity.MetersTypeEntity;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
public interface MetersTypeRepository extends JpaRepository<MetersTypeEntity, Long> {
}
