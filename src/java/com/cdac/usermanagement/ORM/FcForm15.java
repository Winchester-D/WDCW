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
@Table(name = "fc_form15", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm15.findAll", query = "SELECT f FROM FcForm15 f")
    , @NamedQuery(name = "FcForm15.findById", query = "SELECT f FROM FcForm15 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm15.findByProfileId", query = "SELECT f FROM FcForm15 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm15.findByWcCase", query = "SELECT f FROM FcForm15 f WHERE f.wcCase = :wcCase")
    , @NamedQuery(name = "FcForm15.findByWcRe", query = "SELECT f FROM FcForm15 f WHERE f.wcRe = :wcRe")
    , @NamedQuery(name = "FcForm15.findByWcRecord", query = "SELECT f FROM FcForm15 f WHERE f.wcRecord = :wcRecord")
    , @NamedQuery(name = "FcForm15.findByWc1", query = "SELECT f FROM FcForm15 f WHERE f.wc1 = :wc1")
    , @NamedQuery(name = "FcForm15.findByWc2", query = "SELECT f FROM FcForm15 f WHERE f.wc2 = :wc2")
    , @NamedQuery(name = "FcForm15.findByWc3", query = "SELECT f FROM FcForm15 f WHERE f.wc3 = :wc3")
    , @NamedQuery(name = "FcForm15.findByWc4", query = "SELECT f FROM FcForm15 f WHERE f.wc4 = :wc4")
    , @NamedQuery(name = "FcForm15.findByWc5", query = "SELECT f FROM FcForm15 f WHERE f.wc5 = :wc5")
    , @NamedQuery(name = "FcForm15.findByWc7", query = "SELECT f FROM FcForm15 f WHERE f.wc7 = :wc7")
    , @NamedQuery(name = "FcForm15.findByWc8", query = "SELECT f FROM FcForm15 f WHERE f.wc8 = :wc8")
    , @NamedQuery(name = "FcForm15.findByWc9", query = "SELECT f FROM FcForm15 f WHERE f.wc9 = :wc9")
    , @NamedQuery(name = "FcForm15.findByWc10", query = "SELECT f FROM FcForm15 f WHERE f.wc10 = :wc10")
    , @NamedQuery(name = "FcForm15.findByWc11", query = "SELECT f FROM FcForm15 f WHERE f.wc11 = :wc11")})
public class FcForm15 implements Serializable {

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
    @Column(name = "wcCase", length = 50)
    private String wcCase;
    @Size(max = 40)
    @Column(name = "wcRe", length = 40)
    private String wcRe;
    @Size(max = 50)
    @Column(name = "wcRecord", length = 50)
    private String wcRecord;
    @Size(max = 50)
    @Column(name = "wc1", length = 50)
    private String wc1;
    @Size(max = 50)
    @Column(name = "wc2", length = 50)
    private String wc2;
    @Size(max = 50)
    @Column(name = "wc3", length = 50)
    private String wc3;
    @Size(max = 50)
    @Column(name = "wc4", length = 50)
    private String wc4;
    @Size(max = 50)
    @Column(name = "wc5", length = 50)
    private String wc5;
    @Size(max = 50)
    @Column(name = "wc7", length = 50)
    private String wc7;
    @Size(max = 50)
    @Column(name = "wc8", length = 50)
    private String wc8;
    @Size(max = 50)
    @Column(name = "wc9", length = 50)
    private String wc9;
    @Size(max = 50)
    @Column(name = "wc10", length = 50)
    private String wc10;
    @Size(max = 50)
    @Column(name = "wc11", length = 50)
    private String wc11;

    public FcForm15() {
    }

    public FcForm15(Integer id) {
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

    public String getWcCase() {
        return wcCase;
    }

    public void setWcCase(String wcCase) {
        this.wcCase = wcCase;
    }

    public String getWcRe() {
        return wcRe;
    }

    public void setWcRe(String wcRe) {
        this.wcRe = wcRe;
    }

    public String getWcRecord() {
        return wcRecord;
    }

    public void setWcRecord(String wcRecord) {
        this.wcRecord = wcRecord;
    }

    public String getWc1() {
        return wc1;
    }

    public void setWc1(String wc1) {
        this.wc1 = wc1;
    }

    public String getWc2() {
        return wc2;
    }

    public void setWc2(String wc2) {
        this.wc2 = wc2;
    }

    public String getWc3() {
        return wc3;
    }

    public void setWc3(String wc3) {
        this.wc3 = wc3;
    }

    public String getWc4() {
        return wc4;
    }

    public void setWc4(String wc4) {
        this.wc4 = wc4;
    }

    public String getWc5() {
        return wc5;
    }

    public void setWc5(String wc5) {
        this.wc5 = wc5;
    }

    public String getWc7() {
        return wc7;
    }

    public void setWc7(String wc7) {
        this.wc7 = wc7;
    }

    public String getWc8() {
        return wc8;
    }

    public void setWc8(String wc8) {
        this.wc8 = wc8;
    }

    public String getWc9() {
        return wc9;
    }

    public void setWc9(String wc9) {
        this.wc9 = wc9;
    }

    public String getWc10() {
        return wc10;
    }

    public void setWc10(String wc10) {
        this.wc10 = wc10;
    }

    public String getWc11() {
        return wc11;
    }

    public void setWc11(String wc11) {
        this.wc11 = wc11;
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
        if (!(object instanceof FcForm15)) {
            return false;
        }
        FcForm15 other = (FcForm15) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm15[ id=" + id + " ]";
    }
    
}
