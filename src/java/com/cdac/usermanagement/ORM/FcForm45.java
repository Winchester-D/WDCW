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
@Table(name = "fc_form45", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm45.findAll", query = "SELECT f FROM FcForm45 f")
    , @NamedQuery(name = "FcForm45.findById", query = "SELECT f FROM FcForm45 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm45.findByProfileId", query = "SELECT f FROM FcForm45 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm45.findByCpCaseno", query = "SELECT f FROM FcForm45 f WHERE f.cpCaseno = :cpCaseno")
    , @NamedQuery(name = "FcForm45.findByCpMgvb", query = "SELECT f FROM FcForm45 f WHERE f.cpMgvb = :cpMgvb")
    , @NamedQuery(name = "FcForm45.findByCpYear", query = "SELECT f FROM FcForm45 f WHERE f.cpYear = :cpYear")
    , @NamedQuery(name = "FcForm45.findByCpReside", query = "SELECT f FROM FcForm45 f WHERE f.cpReside = :cpReside")
    , @NamedQuery(name = "FcForm45.findByCpEscort", query = "SELECT f FROM FcForm45 f WHERE f.cpEscort = :cpEscort")
    , @NamedQuery(name = "FcForm45.findByCpSupritendent", query = "SELECT f FROM FcForm45 f WHERE f.cpSupritendent = :cpSupritendent")
    , @NamedQuery(name = "FcForm45.findByCpResiding", query = "SELECT f FROM FcForm45 f WHERE f.cpResiding = :cpResiding")
    , @NamedQuery(name = "FcForm45.findByCpDateday", query = "SELECT f FROM FcForm45 f WHERE f.cpDateday = :cpDateday")
    , @NamedQuery(name = "FcForm45.findByCpDatemon", query = "SELECT f FROM FcForm45 f WHERE f.cpDatemon = :cpDatemon")
    , @NamedQuery(name = "FcForm45.findByCpOrderAdmission", query = "SELECT f FROM FcForm45 f WHERE f.cpOrderAdmission = :cpOrderAdmission")
    , @NamedQuery(name = "FcForm45.findByCpBornon", query = "SELECT f FROM FcForm45 f WHERE f.cpBornon = :cpBornon")
    , @NamedQuery(name = "FcForm45.findByCpProfile", query = "SELECT f FROM FcForm45 f WHERE f.cpProfile = :cpProfile")})
public class FcForm45 implements Serializable {

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
    @Column(name = "cpCaseno", length = 20)
    private String cpCaseno;
    @Size(max = 40)
    @Column(name = "cpMgvb", length = 40)
    private String cpMgvb;
    @Size(max = 20)
    @Column(name = "cpYear", length = 20)
    private String cpYear;
    @Size(max = 50)
    @Column(name = "cpReside", length = 50)
    private String cpReside;
    @Size(max = 50)
    @Column(name = "cpEscort", length = 50)
    private String cpEscort;
    @Size(max = 50)
    @Column(name = "cpSupritendent", length = 50)
    private String cpSupritendent;
    @Size(max = 80)
    @Column(name = "cpResiding", length = 80)
    private String cpResiding;
    @Size(max = 20)
    @Column(name = "cpDateday", length = 20)
    private String cpDateday;
    @Size(max = 20)
    @Column(name = "cpDatemon", length = 20)
    private String cpDatemon;
    @Size(max = 30)
    @Column(name = "cpOrderAdmission", length = 30)
    private String cpOrderAdmission;
    @Size(max = 30)
    @Column(name = "cpBornon", length = 30)
    private String cpBornon;
    @Size(max = 30)
    @Column(name = "cpProfile", length = 30)
    private String cpProfile;

    public FcForm45() {
    }

    public FcForm45(Integer id) {
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

    public String getCpCaseno() {
        return cpCaseno;
    }

    public void setCpCaseno(String cpCaseno) {
        this.cpCaseno = cpCaseno;
    }

    public String getCpMgvb() {
        return cpMgvb;
    }

    public void setCpMgvb(String cpMgvb) {
        this.cpMgvb = cpMgvb;
    }

    public String getCpYear() {
        return cpYear;
    }

    public void setCpYear(String cpYear) {
        this.cpYear = cpYear;
    }

    public String getCpReside() {
        return cpReside;
    }

    public void setCpReside(String cpReside) {
        this.cpReside = cpReside;
    }

    public String getCpEscort() {
        return cpEscort;
    }

    public void setCpEscort(String cpEscort) {
        this.cpEscort = cpEscort;
    }

    public String getCpSupritendent() {
        return cpSupritendent;
    }

    public void setCpSupritendent(String cpSupritendent) {
        this.cpSupritendent = cpSupritendent;
    }

    public String getCpResiding() {
        return cpResiding;
    }

    public void setCpResiding(String cpResiding) {
        this.cpResiding = cpResiding;
    }

    public String getCpDateday() {
        return cpDateday;
    }

    public void setCpDateday(String cpDateday) {
        this.cpDateday = cpDateday;
    }

    public String getCpDatemon() {
        return cpDatemon;
    }

    public void setCpDatemon(String cpDatemon) {
        this.cpDatemon = cpDatemon;
    }

    public String getCpOrderAdmission() {
        return cpOrderAdmission;
    }

    public void setCpOrderAdmission(String cpOrderAdmission) {
        this.cpOrderAdmission = cpOrderAdmission;
    }

    public String getCpBornon() {
        return cpBornon;
    }

    public void setCpBornon(String cpBornon) {
        this.cpBornon = cpBornon;
    }

    public String getCpProfile() {
        return cpProfile;
    }

    public void setCpProfile(String cpProfile) {
        this.cpProfile = cpProfile;
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
        if (!(object instanceof FcForm45)) {
            return false;
        }
        FcForm45 other = (FcForm45) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm45[ id=" + id + " ]";
    }
    
}
