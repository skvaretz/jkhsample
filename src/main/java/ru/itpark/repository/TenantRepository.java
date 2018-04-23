package ru.itpark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itpark.entity.TenantEntity;

import javax.persistence.NamedQuery;
import java.util.List;

/**
 * Created by alexander.skvortsov on 09.08.2017.
 */
@Repository
public interface TenantRepository  extends JpaRepository<TenantEntity, Long> {
    @Query(value = "select id, name, patrName, surname, birthDt, auth_token, fiodr  from TenantEntity\n" +
                    "    where id = :id")
    Object[] jpql5(@Param("id") Long id);


    @Query(value = "select update_auth_token (id)  from tenant\n" +
            "    where fiodr = :fiodr" , nativeQuery = true)
    Object[] jpql6(@Param("fiodr") String fiodr);



}
