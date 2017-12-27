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
@Table(name = "fc_form21", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm21.findAll", query = "SELECT f FROM FcForm21 f")
    , @NamedQuery(name = "FcForm21.findById", query = "SELECT f FROM FcForm21 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm21.findByProfileId", query = "SELECT f FROM FcForm21 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm21.findByCpActName", query = "SELECT f FROM FcForm21 f WHERE f.cpActName = :cpActName")
    , @NamedQuery(name = "FcForm21.findByCpCname", query = "SELECT f FROM FcForm21 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm21.findByCpAge", query = "SELECT f FROM FcForm21 f WHERE f.cpAge = :cpAge")
    , @NamedQuery(name = "FcForm21.findByCpGname", query = "SELECT f FROM FcForm21 f WHERE f.cpGname = :cpGname")
    , @NamedQuery(name = "FcForm21.findByCpAddress", query = "SELECT f FROM FcForm21 f WHERE f.cpAddress = :cpAddress")
    , @NamedQuery(name = "FcForm21.findByCpDate", query = "SELECT f FROM FcForm21 f WHERE f.cpDate = :cpDate")
    , @NamedQuery(name = "FcForm21.findByCpDay", query = "SELECT f FROM FcForm21 f WHERE f.cpDay = :cpDay")
    , @NamedQuery(name = "FcForm21.findByCpMon", query = "SELECT f FROM FcForm21 f WHERE f.cpMon = :cpMon")
    , @NamedQuery(name = "FcForm21.findByCpYr", query = "SELECT f FROM FcForm21 f WHERE f.cpYr = :cpYr")})
public class FcForm21 extends FcForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 40)
    @Column(name = "cpActName", length = 40)
    private String cpActName;
    @Size(max = 40)
    @Column(name = "cpCname", length = 40)
    private String cpCname;
    @Size(max = 20)
    @Column(name = "cpAge", length = 20)
    private String cpAge;
    @Size(max = 40)
    @Column(name = "cpGname", length = 40)
    private String cpGname;
    @Size(max = 80)
    @Column(name = "cpAddress", length = 80)
    private String cpAddress;
    @Size(max = 40)
    @Column(name = "cpDate", length = 40)
    private String cpDate;
    @Size(max = 20)
    @Column(name = "cpDay", length = 20)
    private String cpDay;
    @Size(max = 20)
    @Column(name = "cpMon", length = 20)
    private String cpMon;
    @Size(max = 20)
    @Column(name = "cpYr", length = 20)
    private String cpYr;

    public FcForm21() {
    }

    public FcForm21(Integer id) {
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

    public String getCpActName() {
        return cpActName;
    }

    public void setCpActName(String cpActName) {
        this.cpActName = cpActName;
    }

    public String getCpCname() {
        return cpCname;
    }

    public void setCpCname(String cpCname) {
        this.cpCname = cpCname;
    }

    public String getCpAge() {
        return cpAge;
    }

    public void setCpAge(String cpAge) {
        this.cpAge = cpAge;
    }

    public String getCpGname() {
        return cpGname;
    }

    public void setCpGname(String cpGname) {
        this.cpGname = cpGname;
    }

    public String getCpAddress() {
        return cpAddress;
    }

    public void setCpAddress(String cpAddress) {
        this.cpAddress = cpAddress;
    }

    public String getCpDate() {
        return cpDate;
    }

    public void setCpDate(String cpDate) {
        this.cpDate = cpDate;
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
        if (!(object instanceof FcForm21)) {
            return false;
        }
        FcForm21 other = (FcForm21) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm21[ id=" + id + " ]";
    }
    
}
