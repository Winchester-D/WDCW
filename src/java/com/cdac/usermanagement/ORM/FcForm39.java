/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.usermanagement.ORM;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaitanya
 */
@Entity
@Table(name = "fc_form39", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm39.findAll", query = "SELECT f FROM FcForm39 f")
    , @NamedQuery(name = "FcForm39.findById", query = "SELECT f FROM FcForm39 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm39.findByProfileId", query = "SELECT f FROM FcForm39 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm39.findByOn39", query = "SELECT f FROM FcForm39 f WHERE f.on39 = :on39")
    , @NamedQuery(name = "FcForm39.findByInst39", query = "SELECT f FROM FcForm39 f WHERE f.inst39 = :inst39")
    , @NamedQuery(name = "FcForm39.findByFrom39", query = "SELECT f FROM FcForm39 f WHERE f.from39 = :from39")
    , @NamedQuery(name = "FcForm39.findByPeriod39", query = "SELECT f FROM FcForm39 f WHERE f.period39 = :period39")
    , @NamedQuery(name = "FcForm39.findByDate139", query = "SELECT f FROM FcForm39 f WHERE f.date139 = :date139")
    , @NamedQuery(name = "FcForm39.findByDay139", query = "SELECT f FROM FcForm39 f WHERE f.day139 = :day139")
    , @NamedQuery(name = "FcForm39.findByYear139", query = "SELECT f FROM FcForm39 f WHERE f.year139 = :year139")
    , @NamedQuery(name = "FcForm39.findByDate239", query = "SELECT f FROM FcForm39 f WHERE f.date239 = :date239")
    , @NamedQuery(name = "FcForm39.findByDay239", query = "SELECT f FROM FcForm39 f WHERE f.day239 = :day239")
    , @NamedQuery(name = "FcForm39.findByYear239", query = "SELECT f FROM FcForm39 f WHERE f.year239 = :year239")})
public class FcForm39 extends FcForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 30)
    @Column(name = "on39", length = 30)
    private String on39;
    @Size(max = 40)
    @Column(name = "inst39", length = 40)
    private String inst39;
    @Size(max = 50)
    @Column(name = "from39", length = 50)
    private String from39;
    @Size(max = 20)
    @Column(name = "period39", length = 20)
    private String period39;
    @Size(max = 20)
    @Column(name = "date139", length = 20)
    private String date139;
    @Size(max = 20)
    @Column(name = "day139", length = 20)
    private String day139;
    @Size(max = 20)
    @Column(name = "year139", length = 20)
    private String year139;
    @Size(max = 20)
    @Column(name = "date239", length = 20)
    private String date239;
    @Size(max = 20)
    @Column(name = "day239", length = 20)
    private String day239;
    @Size(max = 20)
    @Column(name = "year239", length = 20)
    private String year239;

    public FcForm39() {
    }

    public FcForm39(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getOn39() {
        return on39;
    }

    public void setOn39(String on39) {
        this.on39 = on39;
    }

    public String getInst39() {
        return inst39;
    }

    public void setInst39(String inst39) {
        this.inst39 = inst39;
    }

    public String getFrom39() {
        return from39;
    }

    public void setFrom39(String from39) {
        this.from39 = from39;
    }

    public String getPeriod39() {
        return period39;
    }

    public void setPeriod39(String period39) {
        this.period39 = period39;
    }

    public String getDate139() {
        return date139;
    }

    public void setDate139(String date139) {
        this.date139 = date139;
    }

    public String getDay139() {
        return day139;
    }

    public void setDay139(String day139) {
        this.day139 = day139;
    }

    public String getYear139() {
        return year139;
    }

    public void setYear139(String year139) {
        this.year139 = year139;
    }

    public String getDate239() {
        return date239;
    }

    public void setDate239(String date239) {
        this.date239 = date239;
    }

    public String getDay239() {
        return day239;
    }

    public void setDay239(String day239) {
        this.day239 = day239;
    }

    public String getYear239() {
        return year239;
    }

    public void setYear239(String year239) {
        this.year239 = year239;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FcForm39)) {
            return false;
        }
        FcForm39 other = (FcForm39) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm39[ id=" + id + " ]";
    }
    
}
