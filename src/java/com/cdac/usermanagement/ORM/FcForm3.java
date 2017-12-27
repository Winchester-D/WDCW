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
import javax.persistence.Id;
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
@Table(name = "fc_form3", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm3.findAll", query = "SELECT f FROM FcForm3 f")
    , @NamedQuery(name = "FcForm3.findById", query = "SELECT f FROM FcForm3 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm3.findByProfileId", query = "SELECT f FROM FcForm3 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm3.findBySoPl", query = "SELECT f FROM FcForm3 f WHERE f.soPl = :soPl")
    , @NamedQuery(name = "FcForm3.findBySoYr", query = "SELECT f FROM FcForm3 f WHERE f.soYr = :soYr")
    , @NamedQuery(name = "FcForm3.findBySoPs", query = "SELECT f FROM FcForm3 f WHERE f.soPs = :soPs")
    , @NamedQuery(name = "FcForm3.findBySoChild", query = "SELECT f FROM FcForm3 f WHERE f.soChild = :soChild")
    , @NamedQuery(name = "FcForm3.findBySoName", query = "SELECT f FROM FcForm3 f WHERE f.soName = :soName")
    , @NamedQuery(name = "FcForm3.findBySoAddr", query = "SELECT f FROM FcForm3 f WHERE f.soAddr = :soAddr")
    , @NamedQuery(name = "FcForm3.findBySoChild2", query = "SELECT f FROM FcForm3 f WHERE f.soChild2 = :soChild2")
    , @NamedQuery(name = "FcForm3.findBySoSper", query = "SELECT f FROM FcForm3 f WHERE f.soSper = :soSper")
    , @NamedQuery(name = "FcForm3.findBySoPrd", query = "SELECT f FROM FcForm3 f WHERE f.soPrd = :soPrd")
    , @NamedQuery(name = "FcForm3.findBySoRspl", query = "SELECT f FROM FcForm3 f WHERE f.soRspl = :soRspl")
    , @NamedQuery(name = "FcForm3.findBySoPrd2", query = "SELECT f FROM FcForm3 f WHERE f.soPrd2 = :soPrd2")
    , @NamedQuery(name = "FcForm3.findBySoJrd", query = "SELECT f FROM FcForm3 f WHERE f.soJrd = :soJrd")
    , @NamedQuery(name = "FcForm3.findBySoDate", query = "SELECT f FROM FcForm3 f WHERE f.soDate = :soDate")
    , @NamedQuery(name = "FcForm3.findBySoDay", query = "SELECT f FROM FcForm3 f WHERE f.soDay = :soDay")
    , @NamedQuery(name = "FcForm3.findBySoYr2", query = "SELECT f FROM FcForm3 f WHERE f.soYr2 = :soYr2")})
public class FcForm3 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "profile_id", nullable = false, length = 30)
    private String profileId;
    @Size(max = 80)
    @Column(name = "so_pl", length = 80)
    private String soPl;
    @Size(max = 80)
    @Column(name = "so_yr", length = 80)
    private String soYr;
    @Size(max = 80)
    @Column(name = "so_ps", length = 80)
    private String soPs;
    @Size(max = 80)
    @Column(name = "so_child", length = 80)
    private String soChild;
    @Size(max = 80)
    @Column(name = "so_name", length = 80)
    private String soName;
    @Size(max = 80)
    @Column(name = "so_addr", length = 80)
    private String soAddr;
    @Size(max = 80)
    @Column(name = "so_child2", length = 80)
    private String soChild2;
    @Size(max = 80)
    @Column(name = "so_sper", length = 80)
    private String soSper;
    @Size(max = 80)
    @Column(name = "so_prd", length = 80)
    private String soPrd;
    @Size(max = 80)
    @Column(name = "so_rspl", length = 80)
    private String soRspl;
    @Size(max = 80)
    @Column(name = "so_prd2", length = 80)
    private String soPrd2;
    @Size(max = 80)
    @Column(name = "so_jrd", length = 80)
    private String soJrd;
    @Size(max = 80)
    @Column(name = "so_date", length = 80)
    private String soDate;
    @Size(max = 80)
    @Column(name = "so_day", length = 80)
    private String soDay;
    @Column(name = "so_yr2")
    private Integer soYr2;

    public FcForm3() {
    }

    public FcForm3(Integer id) {
        this.id = id;
    }

    public FcForm3(Integer id, String profileId) {
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

    public String getSoPl() {
        return soPl;
    }

    public void setSoPl(String soPl) {
        this.soPl = soPl;
    }

    public String getSoYr() {
        return soYr;
    }

    public void setSoYr(String soYr) {
        this.soYr = soYr;
    }

    public String getSoPs() {
        return soPs;
    }

    public void setSoPs(String soPs) {
        this.soPs = soPs;
    }

    public String getSoChild() {
        return soChild;
    }

    public void setSoChild(String soChild) {
        this.soChild = soChild;
    }

    public String getSoName() {
        return soName;
    }

    public void setSoName(String soName) {
        this.soName = soName;
    }

    public String getSoAddr() {
        return soAddr;
    }

    public void setSoAddr(String soAddr) {
        this.soAddr = soAddr;
    }

    public String getSoChild2() {
        return soChild2;
    }

    public void setSoChild2(String soChild2) {
        this.soChild2 = soChild2;
    }

    public String getSoSper() {
        return soSper;
    }

    public void setSoSper(String soSper) {
        this.soSper = soSper;
    }

    public String getSoPrd() {
        return soPrd;
    }

    public void setSoPrd(String soPrd) {
        this.soPrd = soPrd;
    }

    public String getSoRspl() {
        return soRspl;
    }

    public void setSoRspl(String soRspl) {
        this.soRspl = soRspl;
    }

    public String getSoPrd2() {
        return soPrd2;
    }

    public void setSoPrd2(String soPrd2) {
        this.soPrd2 = soPrd2;
    }

    public String getSoJrd() {
        return soJrd;
    }

    public void setSoJrd(String soJrd) {
        this.soJrd = soJrd;
    }

    public String getSoDate() {
        return soDate;
    }

    public void setSoDate(String soDate) {
        this.soDate = soDate;
    }

    public String getSoDay() {
        return soDay;
    }

    public void setSoDay(String soDay) {
        this.soDay = soDay;
    }

    public Integer getSoYr2() {
        return soYr2;
    }

    public void setSoYr2(Integer soYr2) {
        this.soYr2 = soYr2;
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
        if (!(object instanceof FcForm3)) {
            return false;
        }
        FcForm3 other = (FcForm3) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm3[ id=" + id + " ]";
    }
    
}
