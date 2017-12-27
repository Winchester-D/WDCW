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
@Table(name = "fc_form42", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm42.findAll", query = "SELECT f FROM FcForm42 f")
    , @NamedQuery(name = "FcForm42.findById", query = "SELECT f FROM FcForm42 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm42.findByProfileId", query = "SELECT f FROM FcForm42 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm42.findByCpCname", query = "SELECT f FROM FcForm42 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm42.findByCpIname", query = "SELECT f FROM FcForm42 f WHERE f.cpIname = :cpIname")
    , @NamedQuery(name = "FcForm42.findByCpCwpo", query = "SELECT f FROM FcForm42 f WHERE f.cpCwpo = :cpCwpo")
    , @NamedQuery(name = "FcForm42.findByCpfrom", query = "SELECT f FROM FcForm42 f WHERE f.cpfrom = :cpfrom")
    , @NamedQuery(name = "FcForm42.findByCpPstation", query = "SELECT f FROM FcForm42 f WHERE f.cpPstation = :cpPstation")
    , @NamedQuery(name = "FcForm42.findByCpTime", query = "SELECT f FROM FcForm42 f WHERE f.cpTime = :cpTime")
    , @NamedQuery(name = "FcForm42.findByCpMtime", query = "SELECT f FROM FcForm42 f WHERE f.cpMtime = :cpMtime")
    , @NamedQuery(name = "FcForm42.findByCpArticles", query = "SELECT f FROM FcForm42 f WHERE f.cpArticles = :cpArticles")
    , @NamedQuery(name = "FcForm42.findByCpDateday", query = "SELECT f FROM FcForm42 f WHERE f.cpDateday = :cpDateday")
    , @NamedQuery(name = "FcForm42.findByCpDatemon", query = "SELECT f FROM FcForm42 f WHERE f.cpDatemon = :cpDatemon")
    , @NamedQuery(name = "FcForm42.findByCpDateyr", query = "SELECT f FROM FcForm42 f WHERE f.cpDateyr = :cpDateyr")})
public class FcForm42 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 50)
    @Column(name = "cpCname", length = 50)
    private String cpCname;
    @Size(max = 50)
    @Column(name = "cpIname", length = 50)
    private String cpIname;
    @Size(max = 40)
    @Column(name = "cpCwpo", length = 40)
    private String cpCwpo;
    @Size(max = 40)
    @Column(name = "cpfrom", length = 40)
    private String cpfrom;
    @Size(max = 50)
    @Column(name = "cpPstation", length = 50)
    private String cpPstation;
    @Size(max = 20)
    @Column(name = "cpTime", length = 20)
    private String cpTime;
    @Size(max = 20)
    @Column(name = "cpMtime", length = 20)
    private String cpMtime;
    @Size(max = 50)
    @Column(name = "cpArticles", length = 50)
    private String cpArticles;
    @Size(max = 20)
    @Column(name = "cpDateday", length = 20)
    private String cpDateday;
    @Size(max = 20)
    @Column(name = "cpDatemon", length = 20)
    private String cpDatemon;
    @Size(max = 20)
    @Column(name = "cpDateyr", length = 20)
    private String cpDateyr;

    public FcForm42() {
    }

    public FcForm42(Integer id) {
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

    public String getCpIname() {
        return cpIname;
    }

    public void setCpIname(String cpIname) {
        this.cpIname = cpIname;
    }

    public String getCpCwpo() {
        return cpCwpo;
    }

    public void setCpCwpo(String cpCwpo) {
        this.cpCwpo = cpCwpo;
    }

    public String getCpfrom() {
        return cpfrom;
    }

    public void setCpfrom(String cpfrom) {
        this.cpfrom = cpfrom;
    }

    public String getCpPstation() {
        return cpPstation;
    }

    public void setCpPstation(String cpPstation) {
        this.cpPstation = cpPstation;
    }

    public String getCpTime() {
        return cpTime;
    }

    public void setCpTime(String cpTime) {
        this.cpTime = cpTime;
    }

    public String getCpMtime() {
        return cpMtime;
    }

    public void setCpMtime(String cpMtime) {
        this.cpMtime = cpMtime;
    }

    public String getCpArticles() {
        return cpArticles;
    }

    public void setCpArticles(String cpArticles) {
        this.cpArticles = cpArticles;
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

    public String getCpDateyr() {
        return cpDateyr;
    }

    public void setCpDateyr(String cpDateyr) {
        this.cpDateyr = cpDateyr;
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
        if (!(object instanceof FcForm42)) {
            return false;
        }
        FcForm42 other = (FcForm42) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm42[ id=" + id + " ]";
    }
    
}
