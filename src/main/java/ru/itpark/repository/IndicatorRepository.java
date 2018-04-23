package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.entity.IndicatorEntity;
import ru.itpark.entity.Lead;

import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@Repository
public interface IndicatorRepository extends JpaRepository<IndicatorEntity, Long> {

    @Query("select l.id, l.prevDt from IndicatorEntity l")
    List<Object[]> jpql3();

    @Query("select i.id, m.note, i.prevDt, i.prevValue, i.curDt, i.curValue, f.number, s.name\n" +
            " from IndicatorEntity i\n" +
            "left join i.meter m\n" +
            "left join i.flat f\n" +
            "left join i.service s")
    List<Object[]> jpql4();



    @Query("select i.id, m.note, i.prevDt, i.prevValue, i.curDt, i.curValue, f.number, s.name\n" +
            " from IndicatorEntity i\n" +
            "left join i.meter m\n" +
            "left join i.flat f\n" +
            "left join i.service s\n" +
            "where i.id = :id")
    Object[] jpql8(@Param("id") Long id);


    static void saveall(IndicatorEntity indicatorEntityResult) {

    }
}
