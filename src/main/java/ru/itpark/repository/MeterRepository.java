package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itpark.entity.MeterEntity;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@Repository
public interface MeterRepository  extends JpaRepository<MeterEntity, Long> {
}
