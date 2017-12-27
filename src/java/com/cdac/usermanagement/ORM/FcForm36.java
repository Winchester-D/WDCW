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
@Table(name = "fc_form36", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm36.findAll", query = "SELECT f FROM FcForm36 f")
    , @NamedQuery(name = "FcForm36.findById", query = "SELECT f FROM FcForm36 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm36.findByProfileId", query = "SELECT f FROM FcForm36 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm36.findByName36", query = "SELECT f FROM FcForm36 f WHERE f.name36 = :name36")
    , @NamedQuery(name = "FcForm36.findByAge36", query = "SELECT f FROM FcForm36 f WHERE f.age36 = :age36")
    , @NamedQuery(name = "FcForm36.findByMr36", query = "SELECT f FROM FcForm36 f WHERE f.mr36 = :mr36")
    , @NamedQuery(name = "FcForm36.findByMrs36", query = "SELECT f FROM FcForm36 f WHERE f.mrs36 = :mrs36")
    , @NamedQuery(name = "FcForm36.findByNeeds36", query = "SELECT f FROM FcForm36 f WHERE f.needs36 = :needs36")
    , @NamedQuery(name = "FcForm36.findByRs36", query = "SELECT f FROM FcForm36 f WHERE f.rs36 = :rs36")
    , @NamedQuery(name = "FcForm36.findByRss36", query = "SELECT f FROM FcForm36 f WHERE f.rss36 = :rss36")
    , @NamedQuery(name = "FcForm36.findByPeriod36", query = "SELECT f FROM FcForm36 f WHERE f.period36 = :period36")
    , @NamedQuery(name = "FcForm36.findByChild36", query = "SELECT f FROM FcForm36 f WHERE f.child36 = :child36")
    , @NamedQuery(name = "FcForm36.findByOp36", query = "SELECT f FROM FcForm36 f WHERE f.op36 = :op36")})
public class FcForm36 extends FcForm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 80)
    @Column(name = "name36", length = 80)
    private String name36;
    @Size(max = 3)
    @Column(name = "age36", length = 3)
    private String age36;
    @Size(max = 15)
    @Column(name = "mr36", length = 15)
    private String mr36;
    @Size(max = 15)
    @Column(name = "mrs36", length = 15)
    private String mrs36;
    @Size(max = 120)
    @Column(name = "needs36", length = 120)
    private String needs36;
    @Size(max = 50)
    @Column(name = "rs36", length = 50)
    private String rs36;
    @Size(max = 50)
    @Column(name = "rss36", length = 50)
    private String rss36;
    @Size(max = 50)
    @Column(name = "period36", length = 50)
    private String period36;
    @Size(max = 50)
    @Column(name = "child36", length = 50)
    private String child36;
    @Size(max = 30)
    @Column(name = "op36", length = 30)
    private String op36;

    public FcForm36() {
    }

    public FcForm36(Integer id) {
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

    public String getName36() {
        return name36;
    }

    public void setName36(String name36) {
        this.name36 = name36;
    }

    public String getAge36() {
        return age36;
    }

    public void setAge36(String age36) {
        this.age36 = age36;
    }

    public String getMr36() {
        return mr36;
    }

    public void setMr36(String mr36) {
        this.mr36 = mr36;
    }

    public String getMrs36() {
        return mrs36;
    }

    public void setMrs36(String mrs36) {
        this.mrs36 = mrs36;
    }

    public String getNeeds36() {
        return needs36;
    }

    public void setNeeds36(String needs36) {
        this.needs36 = needs36;
    }

    public String getRs36() {
        return rs36;
    }

    public void setRs36(String rs36) {
        this.rs36 = rs36;
    }

    public String getRss36() {
        return rss36;
    }

    public void setRss36(String rss36) {
        this.rss36 = rss36;
    }

    public String getPeriod36() {
        return period36;
    }

    public void setPeriod36(String period36) {
        this.period36 = period36;
    }

    public String getChild36() {
        return child36;
    }

    public void setChild36(String child36) {
        this.child36 = child36;
    }

    public String getOp36() {
        return op36;
    }

    public void setOp36(String op36) {
        this.op36 = op36;
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
        if (!(object instanceof FcForm36)) {
            return false;
        }
        FcForm36 other = (FcForm36) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm36[ id=" + id + " ]";
    }
    
}
