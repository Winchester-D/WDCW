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
@Table(name = "fc_form19", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm19.findAll", query = "SELECT f FROM FcForm19 f")
    , @NamedQuery(name = "FcForm19.findById", query = "SELECT f FROM FcForm19 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm19.findByProfileId", query = "SELECT f FROM FcForm19 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm19.findByCipiNo", query = "SELECT f FROM FcForm19 f WHERE f.cipiNo = :cipiNo")
    , @NamedQuery(name = "FcForm19.findByCipiDay", query = "SELECT f FROM FcForm19 f WHERE f.cipiDay = :cipiDay")
    , @NamedQuery(name = "FcForm19.findByCipiYear", query = "SELECT f FROM FcForm19 f WHERE f.cipiYear = :cipiYear")
    , @NamedQuery(name = "FcForm19.findByCpRe", query = "SELECT f FROM FcForm19 f WHERE f.cpRe = :cpRe")
    , @NamedQuery(name = "FcForm19.findByCpName", query = "SELECT f FROM FcForm19 f WHERE f.cpName = :cpName")
    , @NamedQuery(name = "FcForm19.findByCpDate", query = "SELECT f FROM FcForm19 f WHERE f.cpDate = :cpDate")
    , @NamedQuery(name = "FcForm19.findByCpFat", query = "SELECT f FROM FcForm19 f WHERE f.cpFat = :cpFat")
    , @NamedQuery(name = "FcForm19.findByCpFatAddress", query = "SELECT f FROM FcForm19 f WHERE f.cpFatAddress = :cpFatAddress")
    , @NamedQuery(name = "FcForm19.findByCpCname", query = "SELECT f FROM FcForm19 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm19.findByCpCwc", query = "SELECT f FROM FcForm19 f WHERE f.cpCwc = :cpCwc")
    , @NamedQuery(name = "FcForm19.findByCpFat1", query = "SELECT f FROM FcForm19 f WHERE f.cpFat1 = :cpFat1")
    , @NamedQuery(name = "FcForm19.findByCpFatAddress1", query = "SELECT f FROM FcForm19 f WHERE f.cpFatAddress1 = :cpFatAddress1")
    , @NamedQuery(name = "FcForm19.findByCpPer", query = "SELECT f FROM FcForm19 f WHERE f.cpPer = :cpPer")
    , @NamedQuery(name = "FcForm19.findByCpJurisdiction", query = "SELECT f FROM FcForm19 f WHERE f.cpJurisdiction = :cpJurisdiction")
    , @NamedQuery(name = "FcForm19.findByCpCname1", query = "SELECT f FROM FcForm19 f WHERE f.cpCname1 = :cpCname1")
    , @NamedQuery(name = "FcForm19.findByCpFatAddress2", query = "SELECT f FROM FcForm19 f WHERE f.cpFatAddress2 = :cpFatAddress2")
    , @NamedQuery(name = "FcForm19.findByCpPer1", query = "SELECT f FROM FcForm19 f WHERE f.cpPer1 = :cpPer1")
    , @NamedQuery(name = "FcForm19.findByCpSchoolName", query = "SELECT f FROM FcForm19 f WHERE f.cpSchoolName = :cpSchoolName")
    , @NamedQuery(name = "FcForm19.findByCpSchoolAddress", query = "SELECT f FROM FcForm19 f WHERE f.cpSchoolAddress = :cpSchoolAddress")
    , @NamedQuery(name = "FcForm19.findByCpDay", query = "SELECT f FROM FcForm19 f WHERE f.cpDay = :cpDay")
    , @NamedQuery(name = "FcForm19.findByCpMon", query = "SELECT f FROM FcForm19 f WHERE f.cpMon = :cpMon")
    , @NamedQuery(name = "FcForm19.findByCpYr", query = "SELECT f FROM FcForm19 f WHERE f.cpYr = :cpYr")})
public class FcForm19 extends FcForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 20)
    @Column(name = "cipiNo", length = 20)
    private String cipiNo;
    @Size(max = 20)
    @Column(name = "cipiDay", length = 20)
    private String cipiDay;
    @Size(max = 20)
    @Column(name = "cipiYear", length = 20)
    private String cipiYear;
    @Size(max = 50)
    @Column(name = "cpRe", length = 50)
    private String cpRe;
    @Size(max = 50)
    @Column(name = "cpName", length = 50)
    private String cpName;
    @Size(max = 50)
    @Column(name = "cpDate", length = 50)
    private String cpDate;
    @Size(max = 50)
    @Column(name = "cpFat", length = 50)
    private String cpFat;
    @Size(max = 70)
    @Column(name = "cpFatAddress", length = 70)
    private String cpFatAddress;
    @Size(max = 50)
    @Column(name = "cpCname", length = 50)
    private String cpCname;
    @Size(max = 80)
    @Column(name = "cpCwc", length = 80)
    private String cpCwc;
    @Size(max = 50)
    @Column(name = "cpFat1", length = 50)
    private String cpFat1;
    @Size(max = 70)
    @Column(name = "cpFatAddress1", length = 70)
    private String cpFatAddress1;
    @Size(max = 40)
    @Column(name = "cpPer", length = 40)
    private String cpPer;
    @Size(max = 40)
    @Column(name = "cpJurisdiction", length = 40)
    private String cpJurisdiction;
    @Size(max = 40)
    @Column(name = "cpCname1", length = 40)
    private String cpCname1;
    @Size(max = 70)
    @Column(name = "cpFatAddress2", length = 70)
    private String cpFatAddress2;
    @Size(max = 40)
    @Column(name = "cpPer1", length = 40)
    private String cpPer1;
    @Size(max = 40)
    @Column(name = "cpSchoolName", length = 40)
    private String cpSchoolName;
    @Size(max = 70)
    @Column(name = "cpSchoolAddress", length = 70)
    private String cpSchoolAddress;
    @Size(max = 20)
    @Column(name = "cpDay", length = 20)
    private String cpDay;
    @Size(max = 20)
    @Column(name = "cpMon", length = 20)
    private String cpMon;
    @Size(max = 20)
    @Column(name = "cpYr", length = 20)
    private String cpYr;

    public FcForm19() {
    }

    public FcForm19(Integer id) {
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

    public String getCipiNo() {
        return cipiNo;
    }

    public void setCipiNo(String cipiNo) {
        this.cipiNo = cipiNo;
    }

    public String getCipiDay() {
        return cipiDay;
    }

    public void setCipiDay(String cipiDay) {
        this.cipiDay = cipiDay;
    }

    public String getCipiYear() {
        return cipiYear;
    }

    public void setCipiYear(String cipiYear) {
        this.cipiYear = cipiYear;
    }

    public String getCpRe() {
        return cpRe;
    }

    public void setCpRe(String cpRe) {
        this.cpRe = cpRe;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpDate() {
        return cpDate;
    }

    public void setCpDate(String cpDate) {
        this.cpDate = cpDate;
    }

    public String getCpFat() {
        return cpFat;
    }

    public void setCpFat(String cpFat) {
        this.cpFat = cpFat;
    }

    public String getCpFatAddress() {
        return cpFatAddress;
    }

    public void setCpFatAddress(String cpFatAddress) {
        this.cpFatAddress = cpFatAddress;
    }

    public String getCpCname() {
        return cpCname;
    }

    public void setCpCname(String cpCname) {
        this.cpCname = cpCname;
    }

    public String getCpCwc() {
        return cpCwc;
    }

    public void setCpCwc(String cpCwc) {
        this.cpCwc = cpCwc;
    }

    public String getCpFat1() {
        return cpFat1;
    }

    public void setCpFat1(String cpFat1) {
        this.cpFat1 = cpFat1;
    }

    public String getCpFatAddress1() {
        return cpFatAddress1;
    }

    public void setCpFatAddress1(String cpFatAddress1) {
        this.cpFatAddress1 = cpFatAddress1;
    }

    public String getCpPer() {
        return cpPer;
    }

    public void setCpPer(String cpPer) {
        this.cpPer = cpPer;
    }

    public String getCpJurisdiction() {
        return cpJurisdiction;
    }

    public void setCpJurisdiction(String cpJurisdiction) {
        this.cpJurisdiction = cpJurisdiction;
    }

    public String getCpCname1() {
        return cpCname1;
    }

    public void setCpCname1(String cpCname1) {
        this.cpCname1 = cpCname1;
    }

    public String getCpFatAddress2() {
        return cpFatAddress2;
    }

    public void setCpFatAddress2(String cpFatAddress2) {
        this.cpFatAddress2 = cpFatAddress2;
    }

    public String getCpPer1() {
        return cpPer1;
    }

    public void setCpPer1(String cpPer1) {
        this.cpPer1 = cpPer1;
    }

    public String getCpSchoolName() {
        return cpSchoolName;
    }

    public void setCpSchoolName(String cpSchoolName) {
        this.cpSchoolName = cpSchoolName;
    }

    public String getCpSchoolAddress() {
        return cpSchoolAddress;
    }

    public void setCpSchoolAddress(String cpSchoolAddress) {
        this.cpSchoolAddress = cpSchoolAddress;
    }

    public String getCpDay() {
        return cpDay;
    }

    public void setCpDay(String cpDay) {
        this.cpDay = cpDay;
    }

    public String getCpMon() {
        return cpMon;
    }

    public void setCpMon(String cpMon) {
        this.cpMon = cpMon;
    }

    public String getCpYr() {
        return cpYr;
    }

    public void setCpYr(String cpYr) {
        this.cpYr = cpYr;
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
        if (!(object instanceof FcForm19)) {
            return false;
        }
        FcForm19 other = (FcForm19) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm19[ id=" + id + " ]";
    }
    
}
