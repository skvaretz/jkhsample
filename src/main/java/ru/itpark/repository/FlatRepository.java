package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itpark.entity.FlatEntity;

/**
 * Created by alexander.skvortsov on 06.08.2017.
 */
@Repository
public interface FlatRepository extends JpaRepository<FlatEntity, Long> {

}
