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
@Table(name = "fc_form20", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm20.findAll", query = "SELECT f FROM FcForm20 f")
    , @NamedQuery(name = "FcForm20.findById", query = "SELECT f FROM FcForm20 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm20.findByProfileId", query = "SELECT f FROM FcForm20 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm20.findByCpFat", query = "SELECT f FROM FcForm20 f WHERE f.cpFat = :cpFat")
    , @NamedQuery(name = "FcForm20.findByCpNd", query = "SELECT f FROM FcForm20 f WHERE f.cpNd = :cpNd")
    , @NamedQuery(name = "FcForm20.findByCpPs", query = "SELECT f FROM FcForm20 f WHERE f.cpPs = :cpPs")
    , @NamedQuery(name = "FcForm20.findByCpVil", query = "SELECT f FROM FcForm20 f WHERE f.cpVil = :cpVil")
    , @NamedQuery(name = "FcForm20.findByCpDD", query = "SELECT f FROM FcForm20 f WHERE f.cpDD = :cpDD")
    , @NamedQuery(name = "FcForm20.findByCpSt", query = "SELECT f FROM FcForm20 f WHERE f.cpSt = :cpSt")
    , @NamedQuery(name = "FcForm20.findByCpName", query = "SELECT f FROM FcForm20 f WHERE f.cpName = :cpName")
    , @NamedQuery(name = "FcForm20.findByCpAge", query = "SELECT f FROM FcForm20 f WHERE f.cpAge = :cpAge")
    , @NamedQuery(name = "FcForm20.findByCommit", query = "SELECT f FROM FcForm20 f WHERE f.commit = :commit")
    , @NamedQuery(name = "FcForm20.findByCpDay", query = "SELECT f FROM FcForm20 f WHERE f.cpDay = :cpDay")
    , @NamedQuery(name = "FcForm20.findByCpMon", query = "SELECT f FROM FcForm20 f WHERE f.cpMon = :cpMon")})
public class FcForm20 extends FcForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 50)
    @Column(name = "cpFat", length = 50)
    private String cpFat;
    @Size(max = 50)
    @Column(name = "cpNd", length = 50)
    private String cpNd;
    @Size(max = 50)
    @Column(name = "cpPs", length = 50)
    private String cpPs;
    @Size(max = 50)
    @Column(name = "cpVil", length = 50)
    private String cpVil;
    @Size(max = 50)
    @Column(name = "cpDD", length = 50)
    private String cpDD;
    @Size(max = 50)
    @Column(name = "cpSt", length = 50)
    private String cpSt;
    @Size(max = 50)
    @Column(name = "cpName", length = 50)
    private String cpName;
    @Size(max = 50)
    @Column(name = "cpAge", length = 50)
    private String cpAge;
    @Size(max = 50)
    @Column(name = "commit", length = 50)
    private String commit;
    @Size(max = 50)
    @Column(name = "cpDay", length = 50)
    private String cpDay;
    @Size(max = 50)
    @Column(name = "cpMon", length = 50)
    private String cpMon;

    public FcForm20() {
    }

    public FcForm20(Integer id) {
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

    public String getCpFat() {
        return cpFat;
    }

    public void setCpFat(String cpFat) {
        this.cpFat = cpFat;
    }

    public String getCpNd() {
        return cpNd;
    }

    public void setCpNd(String cpNd) {
        this.cpNd = cpNd;
    }

    public String getCpPs() {
        return cpPs;
    }

    public void setCpPs(String cpPs) {
        this.cpPs = cpPs;
    }

    public String getCpVil() {
        return cpVil;
    }

    public void setCpVil(String cpVil) {
        this.cpVil = cpVil;
    }

    public String getCpDD() {
        return cpDD;
    }

    public void setCpDD(String cpDD) {
        this.cpDD = cpDD;
    }

    public String getCpSt() {
        return cpSt;
    }

    public void setCpSt(String cpSt) {
        this.cpSt = cpSt;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpAge() {
        return cpAge;
    }

    public void setCpAge(String cpAge) {
        this.cpAge = cpAge;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FcForm20)) {
            return false;
        }
        FcForm20 other = (FcForm20) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm20[ id=" + id + " ]";
    }
    
}
