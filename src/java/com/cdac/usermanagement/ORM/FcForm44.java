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
@Table(name = "fc_form44", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm44.findAll", query = "SELECT f FROM FcForm44 f")
    , @NamedQuery(name = "FcForm44.findById", query = "SELECT f FROM FcForm44 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm44.findByProfileId", query = "SELECT f FROM FcForm44 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm44.findByCpCname", query = "SELECT f FROM FcForm44 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm44.findByCpGname", query = "SELECT f FROM FcForm44 f WHERE f.cpGname = :cpGname")
    , @NamedQuery(name = "FcForm44.findByCpResidence", query = "SELECT f FROM FcForm44 f WHERE f.cpResidence = :cpResidence")
    , @NamedQuery(name = "FcForm44.findByCpProfile", query = "SELECT f FROM FcForm44 f WHERE f.cpProfile = :cpProfile")
    , @NamedQuery(name = "FcForm44.findByCpCommittee", query = "SELECT f FROM FcForm44 f WHERE f.cpCommittee = :cpCommittee")
    , @NamedQuery(name = "FcForm44.findByCpSection", query = "SELECT f FROM FcForm44 f WHERE f.cpSection = :cpSection")
    , @NamedQuery(name = "FcForm44.findByCpTerm", query = "SELECT f FROM FcForm44 f WHERE f.cpTerm = :cpTerm")
    , @NamedQuery(name = "FcForm44.findByCpday", query = "SELECT f FROM FcForm44 f WHERE f.cpday = :cpday")
    , @NamedQuery(name = "FcForm44.findByCpMon", query = "SELECT f FROM FcForm44 f WHERE f.cpMon = :cpMon")
    , @NamedQuery(name = "FcForm44.findByCpYr", query = "SELECT f FROM FcForm44 f WHERE f.cpYr = :cpYr")
    , @NamedQuery(name = "FcForm44.findByCpInstitution", query = "SELECT f FROM FcForm44 f WHERE f.cpInstitution = :cpInstitution")
    , @NamedQuery(name = "FcForm44.findByCpIplace", query = "SELECT f FROM FcForm44 f WHERE f.cpIplace = :cpIplace")
    , @NamedQuery(name = "FcForm44.findByCpInst", query = "SELECT f FROM FcForm44 f WHERE f.cpInst = :cpInst")
    , @NamedQuery(name = "FcForm44.findByCpAuthority", query = "SELECT f FROM FcForm44 f WHERE f.cpAuthority = :cpAuthority")
    , @NamedQuery(name = "FcForm44.findByCpRdischarge", query = "SELECT f FROM FcForm44 f WHERE f.cpRdischarge = :cpRdischarge")
    , @NamedQuery(name = "FcForm44.findByCpDated", query = "SELECT f FROM FcForm44 f WHERE f.cpDated = :cpDated")
    , @NamedQuery(name = "FcForm44.findByCpDperson", query = "SELECT f FROM FcForm44 f WHERE f.cpDperson = :cpDperson")
    , @NamedQuery(name = "FcForm44.findByCpEdate", query = "SELECT f FROM FcForm44 f WHERE f.cpEdate = :cpEdate")
    , @NamedQuery(name = "FcForm44.findByCpConsent", query = "SELECT f FROM FcForm44 f WHERE f.cpConsent = :cpConsent")
    , @NamedQuery(name = "FcForm44.findByCpScname", query = "SELECT f FROM FcForm44 f WHERE f.cpScname = :cpScname")
    , @NamedQuery(name = "FcForm44.findByCpSi", query = "SELECT f FROM FcForm44 f WHERE f.cpSi = :cpSi")
    , @NamedQuery(name = "FcForm44.findByCpSaname", query = "SELECT f FROM FcForm44 f WHERE f.cpSaname = :cpSaname")
    , @NamedQuery(name = "FcForm44.findByCpChname", query = "SELECT f FROM FcForm44 f WHERE f.cpChname = :cpChname")
    , @NamedQuery(name = "FcForm44.findByCpDischarge", query = "SELECT f FROM FcForm44 f WHERE f.cpDischarge = :cpDischarge")})
public class FcForm44 implements Serializable {

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
    @Size(max = 80)
    @Column(name = "cpResidence", length = 80)
    private String cpResidence;
    @Size(max = 30)
    @Column(name = "cpProfile", length = 30)
    private String cpProfile;
    @Size(max = 50)
    @Column(name = "cpCommittee", length = 50)
    private String cpCommittee;
    @Size(max = 40)
    @Column(name = "cpSection", length = 40)
    private String cpSection;
    @Size(max = 20)
    @Column(name = "cpTerm", length = 20)
    private String cpTerm;
    @Size(max = 20)
    @Column(name = "cpday", length = 20)
    private String cpday;
    @Size(max = 20)
    @Column(name = "cpMon", length = 20)
    private String cpMon;
    @Size(max = 20)
    @Column(name = "cpYr", length = 20)
    private String cpYr;
    @Size(max = 40)
    @Column(name = "cpInstitution", length = 40)
    private String cpInstitution;
    @Size(max = 80)
    @Column(name = "cpIplace", length = 80)
    private String cpIplace;
    @Size(max = 50)
    @Column(name = "cpInst", length = 50)
    private String cpInst;
    @Size(max = 50)
    @Column(name = "cpAuthority", length = 50)
    private String cpAuthority;
    @Size(max = 50)
    @Column(name = "cpRdischarge", length = 50)
    private String cpRdischarge;
    @Size(max = 50)
    @Column(name = "cpDated", length = 50)
    private String cpDated;
    @Size(max = 50)
    @Column(name = "cpDperson", length = 50)
    private String cpDperson;
    @Size(max = 50)
    @Column(name = "cpEdate", length = 50)
    private String cpEdate;
    @Size(max = 50)
    @Column(name = "cpConsent", length = 50)
    private String cpConsent;
    @Size(max = 50)
    @Column(name = "cpScname", length = 50)
    private String cpScname;
    @Size(max = 50)
    @Column(name = "cpSi", length = 50)
    private String cpSi;
    @Size(max = 50)
    @Column(name = "cpSaname", length = 50)
    private String cpSaname;
    @Size(max = 50)
    @Column(name = "cpChname", length = 50)
    private String cpChname;
    @Size(max = 40)
    @Column(name = "cpDischarge", length = 40)
    private String cpDischarge;

    public FcForm44() {
    }

    public FcForm44(Integer id) {
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

    public String getCpResidence() {
        return cpResidence;
    }

    public void setCpResidence(String cpResidence) {
        this.cpResidence = cpResidence;
    }

    public String getCpProfile() {
        return cpProfile;
    }

    public void setCpProfile(String cpProfile) {
        this.cpProfile = cpProfile;
    }

    public String getCpCommittee() {
        return cpCommittee;
    }

    public void setCpCommittee(String cpCommittee) {
        this.cpCommittee = cpCommittee;
    }

    public String getCpSection() {
        return cpSection;
    }

    public void setCpSection(String cpSection) {
        this.cpSection = cpSection;
    }

    public String getCpTerm() {
        return cpTerm;
    }

    public void setCpTerm(String cpTerm) {
        this.cpTerm = cpTerm;
    }

    public String getCpday() {
        return cpday;
    }

    public void setCpday(String cpday) {
        this.cpday = cpday;
    }

    public String getCpMon() {
        return cpMon;
    }

    public void setCpMon(String cpMon) {
        this.cpMon = cpMon;
    }

    public String getCpYr() {
        return cpYr;
    }

    public void setCpYr(String cpYr) {
        this.cpYr = cpYr;
    }

    public String getCpInstitution() {
        return cpInstitution;
    }

    public void setCpInstitution(String cpInstitution) {
        this.cpInstitution = cpInstitution;
    }

    public String getCpIplace() {
        return cpIplace;
    }

    public void setCpIplace(String cpIplace) {
        this.cpIplace = cpIplace;
    }

    public String getCpInst() {
        return cpInst;
    }

    public void setCpInst(String cpInst) {
        this.cpInst = cpInst;
    }

    public String getCpAuthority() {
        return cpAuthority;
    }

    public void setCpAuthority(String cpAuthority) {
        this.cpAuthority = cpAuthority;
    }

    public String getCpRdischarge() {
        return cpRdischarge;
    }

    public void setCpRdischarge(String cpRdischarge) {
        this.cpRdischarge = cpRdischarge;
    }

    public String getCpDated() {
        return cpDated;
    }

    public void setCpDated(String cpDated) {
        this.cpDated = cpDated;
    }

    public String getCpDperson() {
        return cpDperson;
    }

    public void setCpDperson(String cpDperson) {
        this.cpDperson = cpDperson;
    }

    public String getCpEdate() {
        return cpEdate;
    }

    public void setCpEdate(String cpEdate) {
        this.cpEdate = cpEdate;
    }

    public String getCpConsent() {
        return cpConsent;
    }

    public void setCpConsent(String cpConsent) {
        this.cpConsent = cpConsent;
    }

    public String getCpScname() {
        return cpScname;
    }

    public void setCpScname(String cpScname) {
        this.cpScname = cpScname;
    }

    public String getCpSi() {
        return cpSi;
    }

    public void setCpSi(String cpSi) {
        this.cpSi = cpSi;
    }

    public String getCpSaname() {
        return cpSaname;
    }

    public void setCpSaname(String cpSaname) {
        this.cpSaname = cpSaname;
    }

    public String getCpChname() {
        return cpChname;
    }

    public void setCpChname(String cpChname) {
        this.cpChname = cpChname;
    }

    public String getCpDischarge() {
        return cpDischarge;
    }

    public void setCpDischarge(String cpDischarge) {
        this.cpDischarge = cpDischarge;
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
        if (!(object instanceof FcForm44)) {
            return false;
        }
        FcForm44 other = (FcForm44) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm44[ id=" + id + " ]";
    }
    
}
