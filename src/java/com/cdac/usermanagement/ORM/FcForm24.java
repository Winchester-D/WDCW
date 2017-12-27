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
@Table(name = "fc_form24", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm24.findAll", query = "SELECT f FROM FcForm24 f")
    , @NamedQuery(name = "FcForm24.findById", query = "SELECT f FROM FcForm24 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm24.findByProfileId", query = "SELECT f FROM FcForm24 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm24.findByCpNo", query = "SELECT f FROM FcForm24 f WHERE f.cpNo = :cpNo")
    , @NamedQuery(name = "FcForm24.findByCpRe", query = "SELECT f FROM FcForm24 f WHERE f.cpRe = :cpRe")
    , @NamedQuery(name = "FcForm24.findByCpSname", query = "SELECT f FROM FcForm24 f WHERE f.cpSname = :cpSname")
    , @NamedQuery(name = "FcForm24.findByCpGname", query = "SELECT f FROM FcForm24 f WHERE f.cpGname = :cpGname")
    , @NamedQuery(name = "FcForm24.findByCpCname", query = "SELECT f FROM FcForm24 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm24.findByCpCage", query = "SELECT f FROM FcForm24 f WHERE f.cpCage = :cpCage")
    , @NamedQuery(name = "FcForm24.findByCpCbirth", query = "SELECT f FROM FcForm24 f WHERE f.cpCbirth = :cpCbirth")
    , @NamedQuery(name = "FcForm24.findByCpReason", query = "SELECT f FROM FcForm24 f WHERE f.cpReason = :cpReason")
    , @NamedQuery(name = "FcForm24.findByCpPlace", query = "SELECT f FROM FcForm24 f WHERE f.cpPlace = :cpPlace")
    , @NamedQuery(name = "FcForm24.findByCpDate", query = "SELECT f FROM FcForm24 f WHERE f.cpDate = :cpDate")
    , @NamedQuery(name = "FcForm24.findByCpWname", query = "SELECT f FROM FcForm24 f WHERE f.cpWname = :cpWname")
    , @NamedQuery(name = "FcForm24.findByCpWaddress", query = "SELECT f FROM FcForm24 f WHERE f.cpWaddress = :cpWaddress")
    , @NamedQuery(name = "FcForm24.findByCpWname1", query = "SELECT f FROM FcForm24 f WHERE f.cpWname1 = :cpWname1")
    , @NamedQuery(name = "FcForm24.findByCpWaddress1", query = "SELECT f FROM FcForm24 f WHERE f.cpWaddress1 = :cpWaddress1")
    , @NamedQuery(name = "FcForm24.findByCpPlace1", query = "SELECT f FROM FcForm24 f WHERE f.cpPlace1 = :cpPlace1")
    , @NamedQuery(name = "FcForm24.findByCpDate1", query = "SELECT f FROM FcForm24 f WHERE f.cpDate1 = :cpDate1")})
public class FcForm24 extends FcForm implements Serializable {

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
    @Column(name = "cpNo", length = 20)
    private String cpNo;
    @Size(max = 40)
    @Column(name = "cpRe", length = 40)
    private String cpRe;
    @Size(max = 40)
    @Column(name = "cpSname", length = 40)
    private String cpSname;
    @Size(max = 40)
    @Column(name = "cpGname", length = 40)
    private String cpGname;
    @Size(max = 40)
    @Column(name = "cpCname", length = 40)
    private String cpCname;
    @Size(max = 20)
    @Column(name = "cpCage", length = 20)
    private String cpCage;
    @Size(max = 30)
    @Column(name = "cpCbirth", length = 30)
    private String cpCbirth;
    @Size(max = 70)
    @Column(name = "cpReason", length = 70)
    private String cpReason;
    @Size(max = 30)
    @Column(name = "cpPlace", length = 30)
    private String cpPlace;
    @Size(max = 30)
    @Column(name = "cpDate", length = 30)
    private String cpDate;
    @Size(max = 20)
    @Column(name = "cpWname", length = 20)
    private String cpWname;
    @Size(max = 70)
    @Column(name = "cpWaddress", length = 70)
    private String cpWaddress;
    @Size(max = 20)
    @Column(name = "cpWname1", length = 20)
    private String cpWname1;
    @Size(max = 70)
    @Column(name = "cpWaddress1", length = 70)
    private String cpWaddress1;
    @Size(max = 30)
    @Column(name = "cpPlace1", length = 30)
    private String cpPlace1;
    @Size(max = 30)
    @Column(name = "cpDate1", length = 30)
    private String cpDate1;

    public FcForm24() {
    }

    public FcForm24(Integer id) {
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

    public String getCpNo() {
        return cpNo;
    }

    public void setCpNo(String cpNo) {
        this.cpNo = cpNo;
    }

    public String getCpRe() {
        return cpRe;
    }

    public void setCpRe(String cpRe) {
        this.cpRe = cpRe;
    }

    public String getCpSname() {
        return cpSname;
    }

    public void setCpSname(String cpSname) {
        this.cpSname = cpSname;
    }

    public String getCpGname() {
        return cpGname;
    }

    public void setCpGname(String cpGname) {
        this.cpGname = cpGname;
    }

    public String getCpCname() {
        return cpCname;
    }

    public void setCpCname(String cpCname) {
        this.cpCname = cpCname;
    }

    public String getCpCage() {
        return cpCage;
    }

    public void setCpCage(String cpCage) {
        this.cpCage = cpCage;
    }

    public String getCpCbirth() {
        return cpCbirth;
    }

    public void setCpCbirth(String cpCbirth) {
        this.cpCbirth = cpCbirth;
    }

    public String getCpReason() {
        return cpReason;
    }

    public void setCpReason(String cpReason) {
        this.cpReason = cpReason;
    }

    public String getCpPlace() {
        return cpPlace;
    }

    public void setCpPlace(String cpPlace) {
        this.cpPlace = cpPlace;
    }

    public String getCpDate() {
        return cpDate;
    }

    public void setCpDate(String cpDate) {
        this.cpDate = cpDate;
    }

    public String getCpWname() {
        return cpWname;
    }

    public void setCpWname(String cpWname) {
        this.cpWname = cpWname;
    }

    public String getCpWaddress() {
        return cpWaddress;
    }

    public void setCpWaddress(String cpWaddress) {
        this.cpWaddress = cpWaddress;
    }

    public String getCpWname1() {
        return cpWname1;
    }

    public void setCpWname1(String cpWname1) {
        this.cpWname1 = cpWname1;
    }

    public String getCpWaddress1() {
        return cpWaddress1;
    }

    public void setCpWaddress1(String cpWaddress1) {
        this.cpWaddress1 = cpWaddress1;
    }

    public String getCpPlace1() {
        return cpPlace1;
    }

    public void setCpPlace1(String cpPlace1) {
        this.cpPlace1 = cpPlace1;
    }

    public String getCpDate1() {
        return cpDate1;
    }

    public void setCpDate1(String cpDate1) {
        this.cpDate1 = cpDate1;
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
        if (!(object instanceof FcForm24)) {
            return false;
        }
        FcForm24 other = (FcForm24) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm24[ id=" + id + " ]";
    }
    
}
