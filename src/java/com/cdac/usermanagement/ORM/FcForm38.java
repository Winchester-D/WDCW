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
@Table(name = "fc_form38", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm38.findAll", query = "SELECT f FROM FcForm38 f")
    , @NamedQuery(name = "FcForm38.findById", query = "SELECT f FROM FcForm38 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm38.findByProfileId", query = "SELECT f FROM FcForm38 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm38.findByCpOname", query = "SELECT f FROM FcForm38 f WHERE f.cpOname = :cpOname")
    , @NamedQuery(name = "FcForm38.findByCpOrno", query = "SELECT f FROM FcForm38 f WHERE f.cpOrno = :cpOrno")
    , @NamedQuery(name = "FcForm38.findByCpOrdate", query = "SELECT f FROM FcForm38 f WHERE f.cpOrdate = :cpOrdate")
    , @NamedQuery(name = "FcForm38.findByCpOama", query = "SELECT f FROM FcForm38 f WHERE f.cpOama = :cpOama")
    , @NamedQuery(name = "FcForm38.findByCpOfax", query = "SELECT f FROM FcForm38 f WHERE f.cpOfax = :cpOfax")
    , @NamedQuery(name = "FcForm38.findByCpOtel", query = "SELECT f FROM FcForm38 f WHERE f.cpOtel = :cpOtel")
    , @NamedQuery(name = "FcForm38.findByCpOemail", query = "SELECT f FROM FcForm38 f WHERE f.cpOemail = :cpOemail")
    , @NamedQuery(name = "FcForm38.findByCpIaddress", query = "SELECT f FROM FcForm38 f WHERE f.cpIaddress = :cpIaddress")
    , @NamedQuery(name = "FcForm38.findByCpRefno", query = "SELECT f FROM FcForm38 f WHERE f.cpRefno = :cpRefno")
    , @NamedQuery(name = "FcForm38.findByCpDenial", query = "SELECT f FROM FcForm38 f WHERE f.cpDenial = :cpDenial")
    , @NamedQuery(name = "FcForm38.findByCpDname", query = "SELECT f FROM FcForm38 f WHERE f.cpDname = :cpDname")
    , @NamedQuery(name = "FcForm38.findByCpReason", query = "SELECT f FROM FcForm38 f WHERE f.cpReason = :cpReason")
    , @NamedQuery(name = "FcForm38.findByCpPaddress", query = "SELECT f FROM FcForm38 f WHERE f.cpPaddress = :cpPaddress")
    , @NamedQuery(name = "FcForm38.findByCpPtel", query = "SELECT f FROM FcForm38 f WHERE f.cpPtel = :cpPtel")
    , @NamedQuery(name = "FcForm38.findByCpPfax", query = "SELECT f FROM FcForm38 f WHERE f.cpPfax = :cpPfax")
    , @NamedQuery(name = "FcForm38.findByCpPemail", query = "SELECT f FROM FcForm38 f WHERE f.cpPemail = :cpPemail")
    , @NamedQuery(name = "FcForm38.findByCpCmrd", query = "SELECT f FROM FcForm38 f WHERE f.cpCmrd = :cpCmrd")
    , @NamedQuery(name = "FcForm38.findByCpCbstn", query = "SELECT f FROM FcForm38 f WHERE f.cpCbstn = :cpCbstn")
    , @NamedQuery(name = "FcForm38.findByCpCrstn", query = "SELECT f FROM FcForm38 f WHERE f.cpCrstn = :cpCrstn")
    , @NamedQuery(name = "FcForm38.findByCpClmrk", query = "SELECT f FROM FcForm38 f WHERE f.cpClmrk = :cpClmrk")
    , @NamedQuery(name = "FcForm38.findByCpInr", query = "SELECT f FROM FcForm38 f WHERE f.cpInr = :cpInr")
    , @NamedQuery(name = "FcForm38.findByCpIntlts", query = "SELECT f FROM FcForm38 f WHERE f.cpIntlts = :cpIntlts")
    , @NamedQuery(name = "FcForm38.findByCpInk", query = "SELECT f FROM FcForm38 f WHERE f.cpInk = :cpInk")
    , @NamedQuery(name = "FcForm38.findByCpIsrm", query = "SELECT f FROM FcForm38 f WHERE f.cpIsrm = :cpIsrm")
    , @NamedQuery(name = "FcForm38.findByCpIapob", query = "SELECT f FROM FcForm38 f WHERE f.cpIapob = :cpIapob")
    , @NamedQuery(name = "FcForm38.findByCpIdfire", query = "SELECT f FROM FcForm38 f WHERE f.cpIdfire = :cpIdfire")
    , @NamedQuery(name = "FcForm38.findByCpIdeqke", query = "SELECT f FROM FcForm38 f WHERE f.cpIdeqke = :cpIdeqke")
    , @NamedQuery(name = "FcForm38.findByCpIdoa", query = "SELECT f FROM FcForm38 f WHERE f.cpIdoa = :cpIdoa")
    , @NamedQuery(name = "FcForm38.findByCpIadw", query = "SELECT f FROM FcForm38 f WHERE f.cpIadw = :cpIadw")
    , @NamedQuery(name = "FcForm38.findByCpIshpc", query = "SELECT f FROM FcForm38 f WHERE f.cpIshpc = :cpIshpc")
    , @NamedQuery(name = "FcForm38.findByCpIshwd", query = "SELECT f FROM FcForm38 f WHERE f.cpIshwd = :cpIshwd")
    , @NamedQuery(name = "FcForm38.findByCpIshsa", query = "SELECT f FROM FcForm38 f WHERE f.cpIshsa = :cpIshsa")
    , @NamedQuery(name = "FcForm38.findByCpIshoa", query = "SELECT f FROM FcForm38 f WHERE f.cpIshoa = :cpIshoa")
    , @NamedQuery(name = "FcForm38.findByCpIara", query = "SELECT f FROM FcForm38 f WHERE f.cpIara = :cpIara")
    , @NamedQuery(name = "FcForm38.findByCpFodc", query = "SELECT f FROM FcForm38 f WHERE f.cpFodc = :cpFodc")
    , @NamedQuery(name = "FcForm38.findByCpSdsl", query = "SELECT f FROM FcForm38 f WHERE f.cpSdsl = :cpSdsl")
    , @NamedQuery(name = "FcForm38.findByCpSpo", query = "SELECT f FROM FcForm38 f WHERE f.cpSpo = :cpSpo")
    , @NamedQuery(name = "FcForm38.findByCpBa2yr", query = "SELECT f FROM FcForm38 f WHERE f.cpBa2yr = :cpBa2yr")
    , @NamedQuery(name = "FcForm38.findByCpBaam", query = "SELECT f FROM FcForm38 f WHERE f.cpBaam = :cpBaam")
    , @NamedQuery(name = "FcForm38.findByCpBlao", query = "SELECT f FROM FcForm38 f WHERE f.cpBlao = :cpBlao")
    , @NamedQuery(name = "FcForm38.findByCpBar1", query = "SELECT f FROM FcForm38 f WHERE f.cpBar1 = :cpBar1")
    , @NamedQuery(name = "FcForm38.findByCpBard", query = "SELECT f FROM FcForm38 f WHERE f.cpBard = :cpBard")
    , @NamedQuery(name = "FcForm38.findByCpBar", query = "SELECT f FROM FcForm38 f WHERE f.cpBar = :cpBar")
    , @NamedQuery(name = "FcForm38.findByCpIntlts2", query = "SELECT f FROM FcForm38 f WHERE f.cpIntlts2 = :cpIntlts2")
    , @NamedQuery(name = "FcForm38.findByCpInk2", query = "SELECT f FROM FcForm38 f WHERE f.cpInk2 = :cpInk2")
    , @NamedQuery(name = "FcForm38.findByCpIsrm2", query = "SELECT f FROM FcForm38 f WHERE f.cpIsrm2 = :cpIsrm2")
    , @NamedQuery(name = "FcForm38.findByCpIapob2", query = "SELECT f FROM FcForm38 f WHERE f.cpIapob2 = :cpIapob2")
    , @NamedQuery(name = "FcForm38.findByCpIdfire2", query = "SELECT f FROM FcForm38 f WHERE f.cpIdfire2 = :cpIdfire2")
    , @NamedQuery(name = "FcForm38.findByCpIdeqke2", query = "SELECT f FROM FcForm38 f WHERE f.cpIdeqke2 = :cpIdeqke2")
    , @NamedQuery(name = "FcForm38.findByCpIdoa2", query = "SELECT f FROM FcForm38 f WHERE f.cpIdoa2 = :cpIdoa2")
    , @NamedQuery(name = "FcForm38.findByCpIadw2", query = "SELECT f FROM FcForm38 f WHERE f.cpIadw2 = :cpIadw2")})
public class FcForm38 implements Serializable {

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
    @Column(name = "cpOname", length = 80)
    private String cpOname;
    @Size(max = 80)
    @Column(name = "cpOrno", length = 80)
    private String cpOrno;
    @Size(max = 80)
    @Column(name = "cpOrdate", length = 80)
    private String cpOrdate;
    @Size(max = 80)
    @Column(name = "cpOama", length = 80)
    private String cpOama;
    @Lob
    @Size(max = 65535)
    @Column(name = "cpOaddress", length = 65535)
    private String cpOaddress;
    @Size(max = 80)
    @Column(name = "cpOfax", length = 80)
    private String cpOfax;
    @Size(max = 80)
    @Column(name = "cpOtel", length = 80)
    private String cpOtel;
    @Size(max = 80)
    @Column(name = "cpOemail", length = 80)
    private String cpOemail;
    @Size(max = 80)
    @Column(name = "cpIaddress", length = 80)
    private String cpIaddress;
    @Size(max = 80)
    @Column(name = "cpRefno", length = 80)
    private String cpRefno;
    @Size(max = 80)
    @Column(name = "cpDenial", length = 80)
    private String cpDenial;
    @Size(max = 80)
    @Column(name = "cpDname", length = 80)
    private String cpDname;
    @Size(max = 80)
    @Column(name = "cpReason", length = 80)
    private String cpReason;
    @Size(max = 80)
    @Column(name = "cpPaddress", length = 80)
    private String cpPaddress;
    @Size(max = 80)
    @Column(name = "cpPtel", length = 80)
    private String cpPtel;
    @Size(max = 80)
    @Column(name = "cpPfax", length = 80)
    private String cpPfax;
    @Size(max = 80)
    @Column(name = "cpPemail", length = 80)
    private String cpPemail;
    @Size(max = 80)
    @Column(name = "cpCmrd", length = 80)
    private String cpCmrd;
    @Size(max = 80)
    @Column(name = "cpCbstn", length = 80)
    private String cpCbstn;
    @Size(max = 80)
    @Column(name = "cpCrstn", length = 80)
    private String cpCrstn;
    @Size(max = 80)
    @Column(name = "cpClmrk", length = 80)
    private String cpClmrk;
    @Size(max = 80)
    @Column(name = "cpInr", length = 80)
    private String cpInr;
    @Size(max = 80)
    @Column(name = "cpIntlts", length = 80)
    private String cpIntlts;
    @Size(max = 80)
    @Column(name = "cpInk", length = 80)
    private String cpInk;
    @Size(max = 80)
    @Column(name = "cpIsrm", length = 80)
    private String cpIsrm;
    @Size(max = 80)
    @Column(name = "cpIapob", length = 80)
    private String cpIapob;
    @Size(max = 80)
    @Column(name = "cpIdfire", length = 80)
    private String cpIdfire;
    @Size(max = 80)
    @Column(name = "cpIdeqke", length = 80)
    private String cpIdeqke;
    @Size(max = 80)
    @Column(name = "cpIdoa", length = 80)
    private String cpIdoa;
    @Size(max = 80)
    @Column(name = "cpIadw", length = 80)
    private String cpIadw;
    @Size(max = 80)
    @Column(name = "cpIshpc", length = 80)
    private String cpIshpc;
    @Size(max = 80)
    @Column(name = "cpIshwd", length = 80)
    private String cpIshwd;
    @Size(max = 80)
    @Column(name = "cpIshsa", length = 80)
    private String cpIshsa;
    @Size(max = 80)
    @Column(name = "cpIshoa", length = 80)
    private String cpIshoa;
    @Size(max = 80)
    @Column(name = "cpIara", length = 80)
    private String cpIara;
    @Size(max = 80)
    @Column(name = "cpFodc", length = 80)
    private String cpFodc;
    @Size(max = 80)
    @Column(name = "cpSdsl", length = 80)
    private String cpSdsl;
    @Size(max = 80)
    @Column(name = "cpSpo", length = 80)
    private String cpSpo;
    @Size(max = 80)
    @Column(name = "cpBa2yr", length = 80)
    private String cpBa2yr;
    @Size(max = 80)
    @Column(name = "cpBaam", length = 80)
    private String cpBaam;
    @Size(max = 80)
    @Column(name = "cpBlao", length = 80)
    private String cpBlao;
    @Size(max = 80)
    @Column(name = "cpBar1", length = 80)
    private String cpBar1;
    @Size(max = 80)
    @Column(name = "cpBard", length = 80)
    private String cpBard;
    @Size(max = 80)
    @Column(name = "cpBar", length = 80)
    private String cpBar;
    @Size(max = 80)
    @Column(name = "cpIntlts2", length = 80)
    private String cpIntlts2;
    @Size(max = 80)
    @Column(name = "cpInk2", length = 80)
    private String cpInk2;
    @Size(max = 80)
    @Column(name = "cpIsrm2", length = 80)
    private String cpIsrm2;
    @Size(max = 80)
    @Column(name = "cpIapob2", length = 80)
    private String cpIapob2;
    @Size(max = 80)
    @Column(name = "cpIdfire2", length = 80)
    private String cpIdfire2;
    @Size(max = 80)
    @Column(name = "cpIdeqke2", length = 80)
    private String cpIdeqke2;
    @Size(max = 80)
    @Column(name = "cpIdoa2", length = 80)
    private String cpIdoa2;
    @Size(max = 80)
    @Column(name = "cpIadw2", length = 80)
    private String cpIadw2;

    public FcForm38() {
    }

    public FcForm38(Integer id) {
        this.id = id;
    }

    public FcForm38(Integer id, String profileId) {
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

    public String getCpOname() {
        return cpOname;
    }

    public void setCpOname(String cpOname) {
        this.cpOname = cpOname;
    }

    public String getCpOrno() {
        return cpOrno;
    }

    public void setCpOrno(String cpOrno) {
        this.cpOrno = cpOrno;
    }

    public String getCpOrdate() {
        return cpOrdate;
    }

    public void setCpOrdate(String cpOrdate) {
        this.cpOrdate = cpOrdate;
    }

    public String getCpOama() {
        return cpOama;
    }

    public void setCpOama(String cpOama) {
        this.cpOama = cpOama;
    }

    public String getCpOaddress() {
        return cpOaddress;
    }

    public void setCpOaddress(String cpOaddress) {
        this.cpOaddress = cpOaddress;
    }

    public String getCpOfax() {
        return cpOfax;
    }

    public void setCpOfax(String cpOfax) {
        this.cpOfax = cpOfax;
    }

    public String getCpOtel() {
        return cpOtel;
    }

    public void setCpOtel(String cpOtel) {
        this.cpOtel = cpOtel;
    }

    public String getCpOemail() {
        return cpOemail;
    }

    public void setCpOemail(String cpOemail) {
        this.cpOemail = cpOemail;
    }

    public String getCpIaddress() {
        return cpIaddress;
    }

    public void setCpIaddress(String cpIaddress) {
        this.cpIaddress = cpIaddress;
    }

    public String getCpRefno() {
        return cpRefno;
    }

    public void setCpRefno(String cpRefno) {
        this.cpRefno = cpRefno;
    }

    public String getCpDenial() {
        return cpDenial;
    }

    public void setCpDenial(String cpDenial) {
        this.cpDenial = cpDenial;
    }

    public String getCpDname() {
        return cpDname;
    }

    public void setCpDname(String cpDname) {
        this.cpDname = cpDname;
    }

    public String getCpReason() {
        return cpReason;
    }

    public void setCpReason(String cpReason) {
        this.cpReason = cpReason;
    }

    public String getCpPaddress() {
        return cpPaddress;
    }

    public void setCpPaddress(String cpPaddress) {
        this.cpPaddress = cpPaddress;
    }

    public String getCpPtel() {
        return cpPtel;
    }

    public void setCpPtel(String cpPtel) {
        this.cpPtel = cpPtel;
    }

    public String getCpPfax() {
        return cpPfax;
    }

    public void setCpPfax(String cpPfax) {
        this.cpPfax = cpPfax;
    }

    public String getCpPemail() {
        return cpPemail;
    }

    public void setCpPemail(String cpPemail) {
        this.cpPemail = cpPemail;
    }

    public String getCpCmrd() {
        return cpCmrd;
    }

    public void setCpCmrd(String cpCmrd) {
        this.cpCmrd = cpCmrd;
    }

    public String getCpCbstn() {
        return cpCbstn;
    }

    public void setCpCbstn(String cpCbstn) {
        this.cpCbstn = cpCbstn;
    }

    public String getCpCrstn() {
        return cpCrstn;
    }

    public void setCpCrstn(String cpCrstn) {
        this.cpCrstn = cpCrstn;
    }

    public String getCpClmrk() {
        return cpClmrk;
    }

    public void setCpClmrk(String cpClmrk) {
        this.cpClmrk = cpClmrk;
    }

    public String getCpInr() {
        return cpInr;
    }

    public void setCpInr(String cpInr) {
        this.cpInr = cpInr;
    }

    public String getCpIntlts() {
        return cpIntlts;
    }

    public void setCpIntlts(String cpIntlts) {
        this.cpIntlts = cpIntlts;
    }

    public String getCpInk() {
        return cpInk;
    }

    public void setCpInk(String cpInk) {
        this.cpInk = cpInk;
    }

    public String getCpIsrm() {
        return cpIsrm;
    }

    public void setCpIsrm(String cpIsrm) {
        this.cpIsrm = cpIsrm;
    }

    public String getCpIapob() {
        return cpIapob;
    }

    public void setCpIapob(String cpIapob) {
        this.cpIapob = cpIapob;
    }

    public String getCpIdfire() {
        return cpIdfire;
    }

    public void setCpIdfire(String cpIdfire) {
        this.cpIdfire = cpIdfire;
    }

    public String getCpIdeqke() {
        return cpIdeqke;
    }

    public void setCpIdeqke(String cpIdeqke) {
        this.cpIdeqke = cpIdeqke;
    }

    public String getCpIdoa() {
        return cpIdoa;
    }

    public void setCpIdoa(String cpIdoa) {
        this.cpIdoa = cpIdoa;
    }

    public String getCpIadw() {
        return cpIadw;
    }

    public void setCpIadw(String cpIadw) {
        this.cpIadw = cpIadw;
    }

    public String getCpIshpc() {
        return cpIshpc;
    }

    public void setCpIshpc(String cpIshpc) {
        this.cpIshpc = cpIshpc;
    }

    public String getCpIshwd() {
        return cpIshwd;
    }

    public void setCpIshwd(String cpIshwd) {
        this.cpIshwd = cpIshwd;
    }

    public String getCpIshsa() {
        return cpIshsa;
    }

    public void setCpIshsa(String cpIshsa) {
        this.cpIshsa = cpIshsa;
    }

    public String getCpIshoa() {
        return cpIshoa;
    }

    public void setCpIshoa(String cpIshoa) {
        this.cpIshoa = cpIshoa;
    }

    public String getCpIara() {
        return cpIara;
    }

    public void setCpIara(String cpIara) {
        this.cpIara = cpIara;
    }

    public String getCpFodc() {
        return cpFodc;
    }

    public void setCpFodc(String cpFodc) {
        this.cpFodc = cpFodc;
    }

    public String getCpSdsl() {
        return cpSdsl;
    }

    public void setCpSdsl(String cpSdsl) {
        this.cpSdsl = cpSdsl;
    }

    public String getCpSpo() {
        return cpSpo;
    }

    public void setCpSpo(String cpSpo) {
        this.cpSpo = cpSpo;
    }

    public String getCpBa2yr() {
        return cpBa2yr;
    }

    public void setCpBa2yr(String cpBa2yr) {
        this.cpBa2yr = cpBa2yr;
    }

    public String getCpBaam() {
        return cpBaam;
    }

    public void setCpBaam(String cpBaam) {
        this.cpBaam = cpBaam;
    }

    public String getCpBlao() {
        return cpBlao;
    }

    public void setCpBlao(String cpBlao) {
        this.cpBlao = cpBlao;
    }

    public String getCpBar1() {
        return cpBar1;
    }

    public void setCpBar1(String cpBar1) {
        this.cpBar1 = cpBar1;
    }

    public String getCpBard() {
        return cpBard;
    }

    public void setCpBard(String cpBard) {
        this.cpBard = cpBard;
    }

    public String getCpBar() {
        return cpBar;
    }

    public void setCpBar(String cpBar) {
        this.cpBar = cpBar;
    }

    public String getCpIntlts2() {
        return cpIntlts2;
    }

    public void setCpIntlts2(String cpIntlts2) {
        this.cpIntlts2 = cpIntlts2;
    }

    public String getCpInk2() {
        return cpInk2;
    }

    public void setCpInk2(String cpInk2) {
        this.cpInk2 = cpInk2;
    }

    public String getCpIsrm2() {
        return cpIsrm2;
    }

    public void setCpIsrm2(String cpIsrm2) {
        this.cpIsrm2 = cpIsrm2;
    }

    public String getCpIapob2() {
        return cpIapob2;
    }

    public void setCpIapob2(String cpIapob2) {
        this.cpIapob2 = cpIapob2;
    }

    public String getCpIdfire2() {
        return cpIdfire2;
    }

    public void setCpIdfire2(String cpIdfire2) {
        this.cpIdfire2 = cpIdfire2;
    }

    public String getCpIdeqke2() {
        return cpIdeqke2;
    }

    public void setCpIdeqke2(String cpIdeqke2) {
        this.cpIdeqke2 = cpIdeqke2;
    }

    public String getCpIdoa2() {
        return cpIdoa2;
    }

    public void setCpIdoa2(String cpIdoa2) {
        this.cpIdoa2 = cpIdoa2;
    }

    public String getCpIadw2() {
        return cpIadw2;
    }

    public void setCpIadw2(String cpIadw2) {
        this.cpIadw2 = cpIadw2;
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
        if (!(object instanceof FcForm38)) {
            return false;
        }
        FcForm38 other = (FcForm38) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm38[ id=" + id + " ]";
    }
    
}
