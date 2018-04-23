package ru.itpark.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@Entity
@Table(name = "meter", schema = "public", catalog = "gkh")
public class MeterEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private String number;
    private Date verifDt;
    private String note;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private MetersTypeEntity type;

    @ManyToOne
    @JoinColumn(name = "flat_id")
    private FlatEntity flat;

    @Basic
    @Column(name = "id", nullable = true, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number", nullable = true, insertable = true, updatable = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "verif_dt", nullable = true, insertable = true, updatable = true)
    public Date getVerifDt() {
        return verifDt;
    }

    public void setVerifDt(Date verifDt) {
        this.verifDt = verifDt;
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

        MeterEntity that = (MeterEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (verifDt != null ? !verifDt.equals(that.verifDt) : that.verifDt != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (verifDt != null ? verifDt.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
