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
@Table(name = "fc_form37", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm37.findAll", query = "SELECT f FROM FcForm37 f")
    , @NamedQuery(name = "FcForm37.findById", query = "SELECT f FROM FcForm37 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm37.findByProfileId", query = "SELECT f FROM FcForm37 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm37.findByCpCname", query = "SELECT f FROM FcForm37 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm37.findByCpGname", query = "SELECT f FROM FcForm37 f WHERE f.cpGname = :cpGname")
    , @NamedQuery(name = "FcForm37.findByCpDate", query = "SELECT f FROM FcForm37 f WHERE f.cpDate = :cpDate")
    , @NamedQuery(name = "FcForm37.findByCpPurpose", query = "SELECT f FROM FcForm37 f WHERE f.cpPurpose = :cpPurpose")
    , @NamedQuery(name = "FcForm37.findByCpOname", query = "SELECT f FROM FcForm37 f WHERE f.cpOname = :cpOname")
    , @NamedQuery(name = "FcForm37.findByCpRupees", query = "SELECT f FROM FcForm37 f WHERE f.cpRupees = :cpRupees")
    , @NamedQuery(name = "FcForm37.findByCpPeriod", query = "SELECT f FROM FcForm37 f WHERE f.cpPeriod = :cpPeriod")
    , @NamedQuery(name = "FcForm37.findByCpBname", query = "SELECT f FROM FcForm37 f WHERE f.cpBname = :cpBname")})
public class FcForm37 extends FcForm implements Serializable {

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
    @Column(name = "cpCname", length = 40)
    private String cpCname;
    @Size(max = 40)
    @Column(name = "cpGname", length = 40)
    private String cpGname;
    @Size(max = 20)
    @Column(name = "cpDate", length = 20)
    private String cpDate;
    @Size(max = 50)
    @Column(name = "cpPurpose", length = 50)
    private String cpPurpose;
    @Size(max = 50)
    @Column(name = "cpOname", length = 50)
    private String cpOname;
    @Size(max = 20)
    @Column(name = "cpRupees", length = 20)
    private String cpRupees;
    @Size(max = 30)
    @Column(name = "cpPeriod", length = 30)
    private String cpPeriod;
    @Size(max = 50)
    @Column(name = "cpBname", length = 50)
    private String cpBname;

    public FcForm37() {
    }

    public FcForm37(Integer id) {
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

    public String getCpCname() {
        return cpCname;
    }

    public void setCpCname(String cpCname) {
        this.cpCname = cpCname;
    }

    public String getCpGname() {
        return cpGname;
    }

    public void setCpGname(String cpGname) {
        this.cpGname = cpGname;
    }

    public String getCpDate() {
        return cpDate;
    }

    public void setCpDate(String cpDate) {
        this.cpDate = cpDate;
    }

    public String getCpPurpose() {
        return cpPurpose;
    }

    public void setCpPurpose(String cpPurpose) {
        this.cpPurpose = cpPurpose;
    }

    public String getCpOname() {
        return cpOname;
    }

    public void setCpOname(String cpOname) {
        this.cpOname = cpOname;
    }

    public String getCpRupees() {
        return cpRupees;
    }

    public void setCpRupees(String cpRupees) {
        this.cpRupees = cpRupees;
    }

    public String getCpPeriod() {
        return cpPeriod;
    }

    public void setCpPeriod(String cpPeriod) {
        this.cpPeriod = cpPeriod;
    }

    public String getCpBname() {
        return cpBname;
    }

    public void setCpBname(String cpBname) {
        this.cpBname = cpBname;
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
        if (!(object instanceof FcForm37)) {
            return false;
        }
        FcForm37 other = (FcForm37) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm37[ id=" + id + " ]";
    }
    
}
