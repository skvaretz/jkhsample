package ru.itpark.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by alexander.skvortsov on 09.08.2017.
 */
@Entity
@Table(name = "tenant", schema = "public", catalog = "gkh")
public class TenantEntity {
    private Long id;
    private String name;
    private String patrName;
    private String surname;
    private String birthDt;
    private String note;
    private String auth_token;
    private String fiodr;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    @Basic
    @Column(name = "auth_token", nullable = true, insertable = true, updatable = true, length = 100)
    public String getAuth_token() {
        return auth_token;
    }


    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    @Column(name = "fiodr", nullable = true, insertable = true, updatable = true, length = 100)
    public String getFiodr() {
        return fiodr;
    }

    public void setFiodr(String fiodr) {
        this.fiodr = fiodr;
    }

    @Basic
    @Column(name = "patr_name", nullable = true, insertable = true, updatable = true, length = 100)
    public String getPatrName() {
        return patrName;
    }

    public void setPatrName(String patrName) {
        this.patrName = patrName;
    }

    @Basic
    @Column(name = "surname", nullable = true, insertable = true, updatable = true, length = 100)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "birth_dt", nullable = true, insertable = true, updatable = true)
    public String getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(String birthDt) {
        this.birthDt = birthDt;
    }

    @Basic
    @Column(name = "note", nullable = true, insertable = true, updatable = true, length = 100)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TenantEntity that = (TenantEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (patrName != null ? !patrName.equals(that.patrName) : that.patrName != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (birthDt != null ? !birthDt.equals(that.birthDt) : that.birthDt != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }



}
