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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaitanya
 */
@Entity
@Table(name = "fc_form33", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm33.findAll", query = "SELECT f FROM FcForm33 f")
    , @NamedQuery(name = "FcForm33.findById", query = "SELECT f FROM FcForm33 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm33.findByProfileId", query = "SELECT f FROM FcForm33 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm33.findByI33", query = "SELECT f FROM FcForm33 f WHERE f.i33 = :i33")
    , @NamedQuery(name = "FcForm33.findByStreet33", query = "SELECT f FROM FcForm33 f WHERE f.street33 = :street33")
    , @NamedQuery(name = "FcForm33.findByVillage33", query = "SELECT f FROM FcForm33 f WHERE f.village33 = :village33")
    , @NamedQuery(name = "FcForm33.findByDistrict33", query = "SELECT f FROM FcForm33 f WHERE f.district33 = :district33")
    , @NamedQuery(name = "FcForm33.findByState33", query = "SELECT f FROM FcForm33 f WHERE f.state33 = :state33")
    , @NamedQuery(name = "FcForm33.findByHome33", query = "SELECT f FROM FcForm33 f WHERE f.home33 = :home33")
    , @NamedQuery(name = "FcForm33.findByOrg33", query = "SELECT f FROM FcForm33 f WHERE f.org33 = :org33")
    , @NamedQuery(name = "FcForm33.findByName33", query = "SELECT f FROM FcForm33 f WHERE f.name33 = :name33")
    , @NamedQuery(name = "FcForm33.findByAge33", query = "SELECT f FROM FcForm33 f WHERE f.age33 = :age33")
    , @NamedQuery(name = "FcForm33.findByDate33", query = "SELECT f FROM FcForm33 f WHERE f.date33 = :date33")
    , @NamedQuery(name = "FcForm33.findByDay33", query = "SELECT f FROM FcForm33 f WHERE f.day33 = :day33")})
public class FcForm33 extends FcForm implements Serializable {

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
    @Size(max = 40)
    @Column(name = "i33", length = 40)
    private String i33;
    @Lob
    @Size(max = 65535)
    @Column(name = "hno33", length = 65535)
    private String hno33;
    @Size(max = 80)
    @Column(name = "street33", length = 80)
    private String street33;
    @Size(max = 80)
    @Column(name = "village33", length = 80)
    private String village33;
    @Size(max = 80)
    @Column(name = "district33", length = 80)
    private String district33;
    @Size(max = 80)
    @Column(name = "state33", length = 80)
    private String state33;
    @Size(max = 120)
    @Column(name = "home33", length = 120)
    private String home33;
    @Size(max = 250)
    @Column(name = "org33", length = 250)
    private String org33;
    @Lob
    @Size(max = 65535)
    @Column(name = "add33", length = 65535)
    private String add33;
    @Size(max = 80)
    @Column(name = "name33", length = 80)
    private String name33;
    @Column(name = "age33")
    private Integer age33;
    @Lob
    @Size(max = 65535)
    @Column(name = "commit33", length = 65535)
    private String commit33;
    @Size(max = 40)
    @Column(name = "date33", length = 40)
    private String date33;
    @Size(max = 25)
    @Column(name = "day33", length = 25)
    private String day33;

    public FcForm33() {
    }

    public FcForm33(Integer id) {
        this.id = id;
    }

    public FcForm33(Integer id, String profileId) {
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

    public String getI33() {
        return i33;
    }

    public void setI33(String i33) {
        this.i33 = i33;
    }

    public String getHno33() {
        return hno33;
    }

    public void setHno33(String hno33) {
        this.hno33 = hno33;
    }

    public String getStreet33() {
        return street33;
    }

    public void setStreet33(String street33) {
        this.street33 = street33;
    }

    public String getVillage33() {
        return village33;
    }

    public void setVillage33(String village33) {
        this.village33 = village33;
    }

    public String getDistrict33() {
        return district33;
    }

    public void setDistrict33(String district33) {
        this.district33 = district33;
    }

    public String getState33() {
        return state33;
    }

    public void setState33(String state33) {
        this.state33 = state33;
    }

    public String getHome33() {
        return home33;
    }

    public void setHome33(String home33) {
        this.home33 = home33;
    }

    public String getOrg33() {
        return org33;
    }

    public void setOrg33(String org33) {
        this.org33 = org33;
    }

    public String getAdd33() {
        return add33;
    }

    public void setAdd33(String add33) {
        this.add33 = add33;
    }

    public String getName33() {
        return name33;
    }

    public void setName33(String name33) {
        this.name33 = name33;
    }

    public Integer getAge33() {
        return age33;
    }

    public void setAge33(Integer age33) {
        this.age33 = age33;
    }

    public String getCommit33() {
        return commit33;
    }

    public void setCommit33(String commit33) {
        this.commit33 = commit33;
    }

    public String getDate33() {
        return date33;
    }

    public void setDate33(String date33) {
        this.date33 = date33;
    }

    public String getDay33() {
        return day33;
    }

    public void setDay33(String day33) {
        this.day33 = day33;
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
        if (!(object instanceof FcForm33)) {
            return false;
        }
        FcForm33 other = (FcForm33) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm33[ id=" + id + " ]";
    }
    
}
