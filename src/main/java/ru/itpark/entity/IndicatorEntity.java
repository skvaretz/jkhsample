package ru.itpark.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexander.skvortsov on 07.08.2017.
 */
@Entity
@Table(name = "indicator", schema = "public", catalog = "gkh")
public class IndicatorEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String prevDt;
    private String prevValue;
    private String curDt;
    private String curValue;

    public IndicatorEntity(String prevDt, String prevValue, String curDt, String curValue, MeterEntity meter, FlatEntity flat, ServicesEntity service) {
        this.prevDt = prevDt;
        this.prevValue = prevValue;
        this.curDt = curDt;
        this.curValue = curValue;
        this.meter = meter;
        this.flat = flat;
        this.service = service;
    }

    public IndicatorEntity() {
    }

    public void setMeter(MeterEntity meter) {
        this.meter = meter;
    }

    public void setFlat(FlatEntity flat) {
        this.flat = flat;
    }

    public void setService(ServicesEntity service) {
        this.service = service;
    }

    public IndicatorEntity(long id, String prevDt, String prevValue, String curDt, String curValue, long meter, long flat, long service) {

    }


    public MeterEntity getMeter() {
        return meter;
    }

    public FlatEntity getFlat() {
        return flat;
    }

    public ServicesEntity getService() {
        return service;
    }

    @ManyToOne
    @JoinColumn(name = "meter_id")
    private MeterEntity meter;

    @ManyToOne
    @JoinColumn(name = "flat_id")
    private FlatEntity flat;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private ServicesEntity service;


    @Basic
    @Column(name = "id", nullable = true, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "prev_dt", nullable = true, insertable = true, updatable = true)
    public String getPrevDt() {
        return prevDt;
    }

    public void setPrevDt(String prevDt) {
        this.prevDt = prevDt;
    }

    @Basic
    @Column(name = "prev_value", nullable = true, insertable = true, updatable = true, precision = 0)
    public String getPrevValue() {
        return prevValue;
    }

    public void setPrevValue(String prevValue) {
        this.prevValue = prevValue;
    }

    @Basic
    @Column(name = "cur_dt", nullable = true, insertable = true, updatable = true)
    public String getCurDt() {
        return curDt;
    }

    public void setCurDt(String curDt) {
        this.curDt = curDt;
    }

    @Basic
    @Column(name = "cur_value", nullable = true, insertable = true, updatable = true)
    public String getCurValue() {
        return curValue;
    }

    public void setCurValue(String curValue) {
        this.curValue = curValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndicatorEntity that = (IndicatorEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (prevDt != null ? !prevDt.equals(that.prevDt) : that.prevDt != null) return false;
        if (prevValue != null ? !prevValue.equals(that.prevValue) : that.prevValue != null) return false;
        if (curDt != null ? !curDt.equals(that.curDt) : that.curDt != null) return false;
        if (curValue != null ? !curValue.equals(that.curValue) : that.curValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (prevDt != null ? prevDt.hashCode() : 0);
        result = 31 * result + (prevValue != null ? prevValue.hashCode() : 0);
        result = 31 * result + (curDt != null ? curDt.hashCode() : 0);
        result = 31 * result + (curValue != null ? curValue.hashCode() : 0);
        return result;
    }
}
