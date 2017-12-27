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
@Table(name = "fc_form4", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm4.findAll", query = "SELECT f FROM FcForm4 f")
    , @NamedQuery(name = "FcForm4.findById", query = "SELECT f FROM FcForm4 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm4.findByProfileId", query = "SELECT f FROM FcForm4 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm4.findByPiDay", query = "SELECT f FROM FcForm4 f WHERE f.piDay = :piDay")
    , @NamedQuery(name = "FcForm4.findByPiMon", query = "SELECT f FROM FcForm4 f WHERE f.piMon = :piMon")
    , @NamedQuery(name = "FcForm4.findByPiYr", query = "SELECT f FROM FcForm4 f WHERE f.piYr = :piYr")
    , @NamedQuery(name = "FcForm4.findByPiChild1", query = "SELECT f FROM FcForm4 f WHERE f.piChild1 = :piChild1")
    , @NamedQuery(name = "FcForm4.findByPiFat", query = "SELECT f FROM FcForm4 f WHERE f.piFat = :piFat")
    , @NamedQuery(name = "FcForm4.findByPiAge", query = "SELECT f FROM FcForm4 f WHERE f.piAge = :piAge")
    , @NamedQuery(name = "FcForm4.findByPiPlace", query = "SELECT f FROM FcForm4 f WHERE f.piPlace = :piPlace")
    , @NamedQuery(name = "FcForm4.findByPiFir", query = "SELECT f FROM FcForm4 f WHERE f.piFir = :piFir")
    , @NamedQuery(name = "FcForm4.findByPiPs", query = "SELECT f FROM FcForm4 f WHERE f.piPs = :piPs")
    , @NamedQuery(name = "FcForm4.findByPiCcl1", query = "SELECT f FROM FcForm4 f WHERE f.piCcl1 = :piCcl1")
    , @NamedQuery(name = "FcForm4.findByPiPrd", query = "SELECT f FROM FcForm4 f WHERE f.piPrd = :piPrd")
    , @NamedQuery(name = "FcForm4.findByPiCcl2", query = "SELECT f FROM FcForm4 f WHERE f.piCcl2 = :piCcl2")
    , @NamedQuery(name = "FcForm4.findByPinxtHr", query = "SELECT f FROM FcForm4 f WHERE f.pinxtHr = :pinxtHr")
    , @NamedQuery(name = "FcForm4.findByPiDay2", query = "SELECT f FROM FcForm4 f WHERE f.piDay2 = :piDay2")
    , @NamedQuery(name = "FcForm4.findByPiMon2", query = "SELECT f FROM FcForm4 f WHERE f.piMon2 = :piMon2")
    , @NamedQuery(name = "FcForm4.findByPiYr2", query = "SELECT f FROM FcForm4 f WHERE f.piYr2 = :piYr2")})
public class FcForm4 implements Serializable {

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
    @Column(name = "pi_day", length = 80)
    private String piDay;
    @Size(max = 80)
    @Column(name = "pi_mon", length = 80)
    private String piMon;
    @Size(max = 80)
    @Column(name = "pi_yr", length = 80)
    private String piYr;
    @Size(max = 80)
    @Column(name = "pi_child1", length = 80)
    private String piChild1;
    @Size(max = 80)
    @Column(name = "pi_fat", length = 80)
    private String piFat;
    @Size(max = 80)
    @Column(name = "pi_age", length = 80)
    private String piAge;
    @Size(max = 80)
    @Column(name = "pi_place", length = 80)
    private String piPlace;
    @Size(max = 80)
    @Column(name = "pi_fir", length = 80)
    private String piFir;
    @Size(max = 80)
    @Column(name = "pi_ps", length = 80)
    private String piPs;
    @Size(max = 80)
    @Column(name = "pi_ccl1", length = 80)
    private String piCcl1;
    @Size(max = 80)
    @Column(name = "pi_prd", length = 80)
    private String piPrd;
    @Size(max = 80)
    @Column(name = "pi_ccl2", length = 80)
    private String piCcl2;
    @Size(max = 80)
    @Column(name = "pi_nxtHr", length = 80)
    private String pinxtHr;
    @Size(max = 80)
    @Column(name = "pi_day2", length = 80)
    private String piDay2;
    @Size(max = 80)
    @Column(name = "pi_mon2", length = 80)
    private String piMon2;
    @Size(max = 80)
    @Column(name = "pi_yr2", length = 80)
    private String piYr2;

    public FcForm4() {
    }

    public FcForm4(Integer id) {
        this.id = id;
    }

    public FcForm4(Integer id, String profileId) {
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

    public String getPiDay() {
        return piDay;
    }

    public void setPiDay(String piDay) {
        this.piDay = piDay;
    }

    public String getPiMon() {
        return piMon;
    }

    public void setPiMon(String piMon) {
        this.piMon = piMon;
    }

    public String getPiYr() {
        return piYr;
    }

    public void setPiYr(String piYr) {
        this.piYr = piYr;
    }

    public String getPiChild1() {
        return piChild1;
    }

    public void setPiChild1(String piChild1) {
        this.piChild1 = piChild1;
    }

    public String getPiFat() {
        return piFat;
    }

    public void setPiFat(String piFat) {
        this.piFat = piFat;
    }

    public String getPiAge() {
        return piAge;
    }

    public void setPiAge(String piAge) {
        this.piAge = piAge;
    }

    public String getPiPlace() {
        return piPlace;
    }

    public void setPiPlace(String piPlace) {
        this.piPlace = piPlace;
    }

    public String getPiFir() {
        return piFir;
    }

    public void setPiFir(String piFir) {
        this.piFir = piFir;
    }

    public String getPiPs() {
        return piPs;
    }

    public void setPiPs(String piPs) {
        this.piPs = piPs;
    }

    public String getPiCcl1() {
        return piCcl1;
    }

    public void setPiCcl1(String piCcl1) {
        this.piCcl1 = piCcl1;
    }

    public String getPiPrd() {
        return piPrd;
    }

    public void setPiPrd(String piPrd) {
        this.piPrd = piPrd;
    }

    public String getPiCcl2() {
        return piCcl2;
    }

    public void setPiCcl2(String piCcl2) {
        this.piCcl2 = piCcl2;
    }

    public String getPinxtHr() {
        return pinxtHr;
    }

    public void setPinxtHr(String pinxtHr) {
        this.pinxtHr = pinxtHr;
    }

    public String getPiDay2() {
        return piDay2;
    }

    public void setPiDay2(String piDay2) {
        this.piDay2 = piDay2;
    }

    public String getPiMon2() {
        return piMon2;
    }

    public void setPiMon2(String piMon2) {
        this.piMon2 = piMon2;
    }

    public String getPiYr2() {
        return piYr2;
    }

    public void setPiYr2(String piYr2) {
        this.piYr2 = piYr2;
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
        if (!(object instanceof FcForm4)) {
            return false;
        }
        FcForm4 other = (FcForm4) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm4[ id=" + id + " ]";
    }
    
}
