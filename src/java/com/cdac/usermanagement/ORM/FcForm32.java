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
@Table(name = "fc_form32", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm32.findAll", query = "SELECT f FROM FcForm32 f")
    , @NamedQuery(name = "FcForm32.findById", query = "SELECT f FROM FcForm32 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm32.findByProfileId", query = "SELECT f FROM FcForm32 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm32.findByName", query = "SELECT f FROM FcForm32 f WHERE f.name = :name")
    , @NamedQuery(name = "FcForm32.findByAge", query = "SELECT f FROM FcForm32 f WHERE f.age = :age")
    , @NamedQuery(name = "FcForm32.findByMr", query = "SELECT f FROM FcForm32 f WHERE f.mr = :mr")
    , @NamedQuery(name = "FcForm32.findByMrs", query = "SELECT f FROM FcForm32 f WHERE f.mrs = :mrs")
    , @NamedQuery(name = "FcForm32.findByMr1", query = "SELECT f FROM FcForm32 f WHERE f.mr1 = :mr1")
    , @NamedQuery(name = "FcForm32.findByMrs1", query = "SELECT f FROM FcForm32 f WHERE f.mrs1 = :mrs1")
    , @NamedQuery(name = "FcForm32.findByCno", query = "SELECT f FROM FcForm32 f WHERE f.cno = :cno")
    , @NamedQuery(name = "FcForm32.findByName1", query = "SELECT f FROM FcForm32 f WHERE f.name1 = :name1")
    , @NamedQuery(name = "FcForm32.findByName2", query = "SELECT f FROM FcForm32 f WHERE f.name2 = :name2")
    , @NamedQuery(name = "FcForm32.findByPeriod", query = "SELECT f FROM FcForm32 f WHERE f.period = :period")
    , @NamedQuery(name = "FcForm32.findByContact", query = "SELECT f FROM FcForm32 f WHERE f.contact = :contact")})
public class FcForm32 extends FcForm implements Serializable {

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
    @Column(name = "name", length = 40)
    private String name;
    @Size(max = 15)
    @Column(name = "age", length = 15)
    private String age;
    @Size(max = 50)
    @Column(name = "mr", length = 50)
    private String mr;
    @Size(max = 50)
    @Column(name = "mrs", length = 50)
    private String mrs;
    @Size(max = 50)
    @Column(name = "mr1", length = 50)
    private String mr1;
    @Size(max = 50)
    @Column(name = "mrs1", length = 50)
    private String mrs1;
    @Size(max = 20)
    @Column(name = "cno", length = 20)
    private String cno;
    @Size(max = 50)
    @Column(name = "name1", length = 50)
    private String name1;
    @Size(max = 50)
    @Column(name = "name2", length = 50)
    private String name2;
    @Size(max = 20)
    @Column(name = "period", length = 20)
    private String period;
    @Size(max = 20)
    @Column(name = "contact", length = 20)
    private String contact;

    public FcForm32() {
    }

    public FcForm32(Integer id) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMr() {
        return mr;
    }

    public void setMr(String mr) {
        this.mr = mr;
    }

    public String getMrs() {
        return mrs;
    }

    public void setMrs(String mrs) {
        this.mrs = mrs;
    }

    public String getMr1() {
        return mr1;
    }

    public void setMr1(String mr1) {
        this.mr1 = mr1;
    }

    public String getMrs1() {
        return mrs1;
    }

    public void setMrs1(String mrs1) {
        this.mrs1 = mrs1;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
        if (!(object instanceof FcForm32)) {
            return false;
        }
        FcForm32 other = (FcForm32) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm32[ id=" + id + " ]";
    }
    
}
