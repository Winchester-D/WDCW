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
@Table(name = "fc_form25", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm25.findAll", query = "SELECT f FROM FcForm25 f")
    , @NamedQuery(name = "FcForm25.findById", query = "SELECT f FROM FcForm25 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm25.findByProfileId", query = "SELECT f FROM FcForm25 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm25.findByAdRess", query = "SELECT f FROM FcForm25 f WHERE f.adRess = :adRess")
    , @NamedQuery(name = "FcForm25.findByAdChild", query = "SELECT f FROM FcForm25 f WHERE f.adChild = :adChild")
    , @NamedQuery(name = "FcForm25.findByAdBirth", query = "SELECT f FROM FcForm25 f WHERE f.adBirth = :adBirth")
    , @NamedQuery(name = "FcForm25.findByAdOrder", query = "SELECT f FROM FcForm25 f WHERE f.adOrder = :adOrder")
    , @NamedQuery(name = "FcForm25.findByAdDate", query = "SELECT f FROM FcForm25 f WHERE f.adDate = :adDate")})
public class FcForm25 implements Serializable {

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
    @Column(name = "adRess", length = 50)
    private String adRess;
    @Size(max = 50)
    @Column(name = "adChild", length = 50)
    private String adChild;
    @Size(max = 50)
    @Column(name = "adBirth", length = 50)
    private String adBirth;
    @Size(max = 50)
    @Column(name = "adOrder", length = 50)
    private String adOrder;
    @Size(max = 50)
    @Column(name = "adDate", length = 50)
    private String adDate;

    public FcForm25() {
    }

    public FcForm25(Integer id) {
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

    public String getAdRess() {
        return adRess;
    }

    public void setAdRess(String adRess) {
        this.adRess = adRess;
    }

    public String getAdChild() {
        return adChild;
    }

    public void setAdChild(String adChild) {
        this.adChild = adChild;
    }

    public String getAdBirth() {
        return adBirth;
    }

    public void setAdBirth(String adBirth) {
        this.adBirth = adBirth;
    }

    public String getAdOrder() {
        return adOrder;
    }

    public void setAdOrder(String adOrder) {
        this.adOrder = adOrder;
    }

    public String getAdDate() {
        return adDate;
    }

    public void setAdDate(String adDate) {
        this.adDate = adDate;
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
        if (!(object instanceof FcForm25)) {
            return false;
        }
        FcForm25 other = (FcForm25) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm25[ id=" + id + " ]";
    }
    
}
