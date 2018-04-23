package ru.itpark.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

/**
 * Created by alexander.skvortsov on 06.08.2017.
 */
@Entity
@Table(name = "invoice_position", schema = "public", catalog = "gkh")
public class InvoicePositionEntity {
    @Id
    @GeneratedValue
    private Integer id;
    private Date curDt;
    private BigInteger accruedValue;
    private BigInteger accruedToPay;

    @Basic
    @Column(name = "id", nullable = true, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cur_dt", nullable = true, insertable = true, updatable = true)
    public Date getCurDt() {
        return curDt;
    }

    public void setCurDt(Date curDt) {
        this.curDt = curDt;
    }

    @Basic
    @Column(name = "accrued_value", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getAccruedValue() {
        return accruedValue;
    }

    public void setAccruedValue(BigInteger accruedValue) {
        this.accruedValue = accruedValue;
    }

    @Basic
    @Column(name = "accrued_to_pay", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getAccruedToPay() {
        return accruedToPay;
    }

    public void setAccruedToPay(BigInteger accruedToPay) {
        this.accruedToPay = accruedToPay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoicePositionEntity that = (InvoicePositionEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (curDt != null ? !curDt.equals(that.curDt) : that.curDt != null) return false;
        if (accruedValue != null ? !accruedValue.equals(that.accruedValue) : that.accruedValue != null) return false;
        if (accruedToPay != null ? !accruedToPay.equals(that.accruedToPay) : that.accruedToPay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (curDt != null ? curDt.hashCode() : 0);
        result = 31 * result + (accruedValue != null ? accruedValue.hashCode() : 0);
        result = 31 * result + (accruedToPay != null ? accruedToPay.hashCode() : 0);
        return result;
    }
}
