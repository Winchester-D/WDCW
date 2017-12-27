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
@Table(name = "fc_form26", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm26.findAll", query = "SELECT f FROM FcForm26 f")
    , @NamedQuery(name = "FcForm26.findById", query = "SELECT f FROM FcForm26 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm26.findByProfileId", query = "SELECT f FROM FcForm26 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm26.findByCwCase", query = "SELECT f FROM FcForm26 f WHERE f.cwCase = :cwCase")
    , @NamedQuery(name = "FcForm26.findByCwOf", query = "SELECT f FROM FcForm26 f WHERE f.cwOf = :cwOf")
    , @NamedQuery(name = "FcForm26.findByCwPolice", query = "SELECT f FROM FcForm26 f WHERE f.cwPolice = :cwPolice")
    , @NamedQuery(name = "FcForm26.findByCwUs", query = "SELECT f FROM FcForm26 f WHERE f.cwUs = :cwUs")
    , @NamedQuery(name = "FcForm26.findByCwDate", query = "SELECT f FROM FcForm26 f WHERE f.cwDate = :cwDate")
    , @NamedQuery(name = "FcForm26.findByCwFir", query = "SELECT f FROM FcForm26 f WHERE f.cwFir = :cwFir")
    , @NamedQuery(name = "FcForm26.findByCwOfficer", query = "SELECT f FROM FcForm26 f WHERE f.cwOfficer = :cwOfficer")
    , @NamedQuery(name = "FcForm26.findByCwIo", query = "SELECT f FROM FcForm26 f WHERE f.cwIo = :cwIo")
    , @NamedQuery(name = "FcForm26.findByCwFro", query = "SELECT f FROM FcForm26 f WHERE f.cwFro = :cwFro")
    , @NamedQuery(name = "FcForm26.findByCwT", query = "SELECT f FROM FcForm26 f WHERE f.cwT = :cwT")
    , @NamedQuery(name = "FcForm26.findByCwFro1", query = "SELECT f FROM FcForm26 f WHERE f.cwFro1 = :cwFro1")
    , @NamedQuery(name = "FcForm26.findByCwFro2", query = "SELECT f FROM FcForm26 f WHERE f.cwFro2 = :cwFro2")
    , @NamedQuery(name = "FcForm26.findByCwFro3", query = "SELECT f FROM FcForm26 f WHERE f.cwFro3 = :cwFro3")
    , @NamedQuery(name = "FcForm26.findByCwFro4", query = "SELECT f FROM FcForm26 f WHERE f.cwFro4 = :cwFro4")
    , @NamedQuery(name = "FcForm26.findByCwFro5", query = "SELECT f FROM FcForm26 f WHERE f.cwFro5 = :cwFro5")
    , @NamedQuery(name = "FcForm26.findByCwFro6", query = "SELECT f FROM FcForm26 f WHERE f.cwFro6 = :cwFro6")
    , @NamedQuery(name = "FcForm26.findByCwFro7", query = "SELECT f FROM FcForm26 f WHERE f.cwFro7 = :cwFro7")})
public class FcForm26 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 30)
    @Column(name = "cwCase", length = 30)
    private String cwCase;
    @Size(max = 20)
    @Column(name = "cwOf", length = 20)
    private String cwOf;
    @Size(max = 30)
    @Column(name = "cwPolice", length = 30)
    private String cwPolice;
    @Size(max = 40)
    @Column(name = "cwUs", length = 40)
    private String cwUs;
    @Size(max = 40)
    @Column(name = "cwDate", length = 40)
    private String cwDate;
    @Size(max = 40)
    @Column(name = "cwFir", length = 40)
    private String cwFir;
    @Size(max = 40)
    @Column(name = "cwOfficer", length = 40)
    private String cwOfficer;
    @Size(max = 40)
    @Column(name = "cwIo", length = 40)
    private String cwIo;
    @Size(max = 40)
    @Column(name = "cwFro", length = 40)
    private String cwFro;
    @Size(max = 40)
    @Column(name = "cwT", length = 40)
    private String cwT;
    @Size(max = 40)
    @Column(name = "cwFro1", length = 40)
    private String cwFro1;
    @Size(max = 40)
    @Column(name = "cwFro2", length = 40)
    private String cwFro2;
    @Size(max = 40)
    @Column(name = "cwFro3", length = 40)
    private String cwFro3;
    @Size(max = 40)
    @Column(name = "cwFro4", length = 40)
    private String cwFro4;
    @Size(max = 40)
    @Column(name = "cwFro5", length = 40)
    private String cwFro5;
    @Size(max = 40)
    @Column(name = "cwFro6", length = 40)
    private String cwFro6;
    @Size(max = 40)
    @Column(name = "cwFro7", length = 40)
    private String cwFro7;

    public FcForm26() {
    }

    public FcForm26(Integer id) {
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

    public String getCwCase() {
        return cwCase;
    }

    public void setCwCase(String cwCase) {
        this.cwCase = cwCase;
    }

    public String getCwOf() {
        return cwOf;
    }

    public void setCwOf(String cwOf) {
        this.cwOf = cwOf;
    }

    public String getCwPolice() {
        return cwPolice;
    }

    public void setCwPolice(String cwPolice) {
        this.cwPolice = cwPolice;
    }

    public String getCwUs() {
        return cwUs;
    }

    public void setCwUs(String cwUs) {
        this.cwUs = cwUs;
    }

    public String getCwDate() {
        return cwDate;
    }

    public void setCwDate(String cwDate) {
        this.cwDate = cwDate;
    }

    public String getCwFir() {
        return cwFir;
    }

    public void setCwFir(String cwFir) {
        this.cwFir = cwFir;
    }

    public String getCwOfficer() {
        return cwOfficer;
    }

    public void setCwOfficer(String cwOfficer) {
        this.cwOfficer = cwOfficer;
    }

    public String getCwIo() {
        return cwIo;
    }

    public void setCwIo(String cwIo) {
        this.cwIo = cwIo;
    }

    public String getCwFro() {
        return cwFro;
    }

    public void setCwFro(String cwFro) {
        this.cwFro = cwFro;
    }

    public String getCwT() {
        return cwT;
    }

    public void setCwT(String cwT) {
        this.cwT = cwT;
    }

    public String getCwFro1() {
        return cwFro1;
    }

    public void setCwFro1(String cwFro1) {
        this.cwFro1 = cwFro1;
    }

    public String getCwFro2() {
        return cwFro2;
    }

    public void setCwFro2(String cwFro2) {
        this.cwFro2 = cwFro2;
    }

    public String getCwFro3() {
        return cwFro3;
    }

    public void setCwFro3(String cwFro3) {
        this.cwFro3 = cwFro3;
    }

    public String getCwFro4() {
        return cwFro4;
    }

    public void setCwFro4(String cwFro4) {
        this.cwFro4 = cwFro4;
    }

    public String getCwFro5() {
        return cwFro5;
    }

    public void setCwFro5(String cwFro5) {
        this.cwFro5 = cwFro5;
    }

    public String getCwFro6() {
        return cwFro6;
    }

    public void setCwFro6(String cwFro6) {
        this.cwFro6 = cwFro6;
    }

    public String getCwFro7() {
        return cwFro7;
    }

    public void setCwFro7(String cwFro7) {
        this.cwFro7 = cwFro7;
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
        if (!(object instanceof FcForm26)) {
            return false;
        }
        FcForm26 other = (FcForm26) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm26[ id=" + id + " ]";
    }
    
}
