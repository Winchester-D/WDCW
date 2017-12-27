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
import javax.persistence.Lob;
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
@Table(name = "fc_form23", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm23.findAll", query = "SELECT f FROM FcForm23 f")
    , @NamedQuery(name = "FcForm23.findById", query = "SELECT f FROM FcForm23 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm23.findByProfileId", query = "SELECT f FROM FcForm23 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm23.findByCpDate", query = "SELECT f FROM FcForm23 f WHERE f.cpDate = :cpDate")
    , @NamedQuery(name = "FcForm23.findByCpDistrict", query = "SELECT f FROM FcForm23 f WHERE f.cpDistrict = :cpDistrict")
    , @NamedQuery(name = "FcForm23.findByCpAname", query = "SELECT f FROM FcForm23 f WHERE f.cpAname = :cpAname")
    , @NamedQuery(name = "FcForm23.findByCpCname", query = "SELECT f FROM FcForm23 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm23.findByCpCage", query = "SELECT f FROM FcForm23 f WHERE f.cpCage = :cpCage")
    , @NamedQuery(name = "FcForm23.findByCpCname2", query = "SELECT f FROM FcForm23 f WHERE f.cpCname2 = :cpCname2")
    , @NamedQuery(name = "FcForm23.findByCpCname3", query = "SELECT f FROM FcForm23 f WHERE f.cpCname3 = :cpCname3")
    , @NamedQuery(name = "FcForm23.findByCpCmname", query = "SELECT f FROM FcForm23 f WHERE f.cpCmname = :cpCmname")
    , @NamedQuery(name = "FcForm23.findByCpDate1", query = "SELECT f FROM FcForm23 f WHERE f.cpDate1 = :cpDate1")
    , @NamedQuery(name = "FcForm23.findByCpTime", query = "SELECT f FROM FcForm23 f WHERE f.cpTime = :cpTime")
    , @NamedQuery(name = "FcForm23.findByCpPlace", query = "SELECT f FROM FcForm23 f WHERE f.cpPlace = :cpPlace")})
public class FcForm23 extends FcForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 60)
    @Column(name = "cpDate", length = 60)
    private String cpDate;
    @Size(max = 60)
    @Column(name = "cpDistrict", length = 60)
    private String cpDistrict;
    @Size(max = 60)
    @Column(name = "cpAname", length = 60)
    private String cpAname;
    @Lob
    @Size(max = 65535)
    @Column(name = "cpRname", length = 65535)
    private String cpRname;
    @Size(max = 80)
    @Column(name = "cpCname", length = 80)
    private String cpCname;
    @Size(max = 3)
    @Column(name = "cpCage", length = 3)
    private String cpCage;
    @Lob
    @Size(max = 65535)
    @Column(name = "cpReason", length = 65535)
    private String cpReason;
    @Size(max = 20)
    @Column(name = "cpCname2", length = 20)
    private String cpCname2;
    @Size(max = 80)
    @Column(name = "cpCname3", length = 80)
    private String cpCname3;
    @Lob
    @Size(max = 65535)
    @Column(name = "cpNameAddress", length = 65535)
    private String cpNameAddress;
    @Size(max = 80)
    @Column(name = "cpCmname", length = 80)
    private String cpCmname;
    @Size(max = 60)
    @Column(name = "cpDate1", length = 60)
    private String cpDate1;
    @Size(max = 20)
    @Column(name = "cpTime", length = 20)
    private String cpTime;
    @Size(max = 40)
    @Column(name = "cpPlace", length = 40)
    private String cpPlace;

    public FcForm23() {
    }

    public FcForm23(Integer id) {
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

    public String getCpDate() {
        return cpDate;
    }

    public void setCpDate(String cpDate) {
        this.cpDate = cpDate;
    }

    public String getCpDistrict() {
        return cpDistrict;
    }

    public void setCpDistrict(String cpDistrict) {
        this.cpDistrict = cpDistrict;
    }

    public String getCpAname() {
        return cpAname;
    }

    public void setCpAname(String cpAname) {
        this.cpAname = cpAname;
    }

    public String getCpRname() {
        return cpRname;
    }

    public void setCpRname(String cpRname) {
        this.cpRname = cpRname;
    }

    public String getCpCname() {
        return cpCname;
    }

    public void setCpCname(String cpCname) {
        this.cpCname = cpCname;
    }

    public String getCpCage() {
        return cpCage;
    }

    public void setCpCage(String cpCage) {
        this.cpCage = cpCage;
    }

    public String getCpReason() {
        return cpReason;
    }

    public void setCpReason(String cpReason) {
        this.cpReason = cpReason;
    }

    public String getCpCname2() {
        return cpCname2;
    }

    public void setCpCname2(String cpCname2) {
        this.cpCname2 = cpCname2;
    }

    public String getCpCname3() {
        return cpCname3;
    }

    public void setCpCname3(String cpCname3) {
        this.cpCname3 = cpCname3;
    }

    public String getCpNameAddress() {
        return cpNameAddress;
    }

    public void setCpNameAddress(String cpNameAddress) {
        this.cpNameAddress = cpNameAddress;
    }

    public String getCpCmname() {
        return cpCmname;
    }

    public void setCpCmname(String cpCmname) {
        this.cpCmname = cpCmname;
    }

    public String getCpDate1() {
        return cpDate1;
    }

    public void setCpDate1(String cpDate1) {
        this.cpDate1 = cpDate1;
    }

    public String getCpTime() {
        return cpTime;
    }

    public void setCpTime(String cpTime) {
        this.cpTime = cpTime;
    }

    public String getCpPlace() {
        return cpPlace;
    }

    public void setCpPlace(String cpPlace) {
        this.cpPlace = cpPlace;
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
        if (!(object instanceof FcForm23)) {
            return false;
        }
        FcForm23 other = (FcForm23) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm23[ id=" + id + " ]";
    }
    
}
