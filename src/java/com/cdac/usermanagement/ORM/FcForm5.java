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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaitanya
 */
@Entity
@Table(name = "fc_form5", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm5.findAll", query = "SELECT f FROM FcForm5 f")
    , @NamedQuery(name = "FcForm5.findById", query = "SELECT f FROM FcForm5 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm5.findByProfileId", query = "SELECT f FROM FcForm5 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm5.findBySirFir", query = "SELECT f FROM FcForm5 f WHERE f.sirFir = :sirFir")
    , @NamedQuery(name = "FcForm5.findBySirUs", query = "SELECT f FROM FcForm5 f WHERE f.sirUs = :sirUs")
    , @NamedQuery(name = "FcForm5.findBySirPs", query = "SELECT f FROM FcForm5 f WHERE f.sirPs = :sirPs")
    , @NamedQuery(name = "FcForm5.findBySirChild1", query = "SELECT f FROM FcForm5 f WHERE f.sirChild1 = :sirChild1")
    , @NamedQuery(name = "FcForm5.findBySirFat", query = "SELECT f FROM FcForm5 f WHERE f.sirFat = :sirFat")
    , @NamedQuery(name = "FcForm5.findBySirAge", query = "SELECT f FROM FcForm5 f WHERE f.sirAge = :sirAge")
    , @NamedQuery(name = "FcForm5.findBySirPl", query = "SELECT f FROM FcForm5 f WHERE f.sirPl = :sirPl")
    , @NamedQuery(name = "FcForm5.findBySirbtTm", query = "SELECT f FROM FcForm5 f WHERE f.sirbtTm = :sirbtTm")
    , @NamedQuery(name = "FcForm5.findBySirDt2", query = "SELECT f FROM FcForm5 f WHERE f.sirDt2 = :sirDt2")
    , @NamedQuery(name = "FcForm5.findBySiDay", query = "SELECT f FROM FcForm5 f WHERE f.siDay = :siDay")
    , @NamedQuery(name = "FcForm5.findBySirYr2", query = "SELECT f FROM FcForm5 f WHERE f.sirYr2 = :sirYr2")})
public class FcForm5 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "profile_id", nullable = false, length = 30)
    private String profileId;
    @Size(max = 80)
    @Column(name = "sir_fir", length = 80)
    private String sirFir;
    @Size(max = 80)
    @Column(name = "sir_us", length = 80)
    private String sirUs;
    @Size(max = 80)
    @Column(name = "sir_ps", length = 80)
    private String sirPs;
    @Size(max = 80)
    @Column(name = "sir_child1", length = 80)
    private String sirChild1;
    @Size(max = 80)
    @Column(name = "sir_fat", length = 80)
    private String sirFat;
    @Size(max = 80)
    @Column(name = "sir_age", length = 80)
    private String sirAge;
    @Size(max = 80)
    @Column(name = "sir_pl", length = 80)
    private String sirPl;
    @Size(max = 80)
    @Column(name = "sir_btTm", length = 80)
    private String sirbtTm;
    @Size(max = 80)
    @Column(name = "sir_dt2", length = 80)
    private String sirDt2;
    @Size(max = 80)
    @Column(name = "si_day", length = 80)
    private String siDay;
    @Column(name = "sir_yr2")
    private Integer sirYr2;

    public FcForm5() {
    }

    public FcForm5(Integer id) {
        this.id = id;
    }

    public FcForm5(Integer id, String profileId) {
        this.id = id;
        this.profileId = profileId;
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

    public String getSirFir() {
        return sirFir;
    }

    public void setSirFir(String sirFir) {
        this.sirFir = sirFir;
    }

    public String getSirUs() {
        return sirUs;
    }

    public void setSirUs(String sirUs) {
        this.sirUs = sirUs;
    }

    public String getSirPs() {
        return sirPs;
    }

    public void setSirPs(String sirPs) {
        this.sirPs = sirPs;
    }

    public String getSirChild1() {
        return sirChild1;
    }

    public void setSirChild1(String sirChild1) {
        this.sirChild1 = sirChild1;
    }

    public String getSirFat() {
        return sirFat;
    }

    public void setSirFat(String sirFat) {
        this.sirFat = sirFat;
    }

    public String getSirAge() {
        return sirAge;
    }

    public void setSirAge(String sirAge) {
        this.sirAge = sirAge;
    }

    public String getSirPl() {
        return sirPl;
    }

    public void setSirPl(String sirPl) {
        this.sirPl = sirPl;
    }

    public String getSirbtTm() {
        return sirbtTm;
    }

    public void setSirbtTm(String sirbtTm) {
        this.sirbtTm = sirbtTm;
    }

    public String getSirDt2() {
        return sirDt2;
    }

    public void setSirDt2(String sirDt2) {
        this.sirDt2 = sirDt2;
    }

    public String getSiDay() {
        return siDay;
    }

    public void setSiDay(String siDay) {
        this.siDay = siDay;
    }

    public Integer getSirYr2() {
        return sirYr2;
    }

    public void setSirYr2(Integer sirYr2) {
        this.sirYr2 = sirYr2;
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
        if (!(object instanceof FcForm5)) {
            return false;
        }
        FcForm5 other = (FcForm5) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm5[ id=" + id + " ]";
    }
    
}
