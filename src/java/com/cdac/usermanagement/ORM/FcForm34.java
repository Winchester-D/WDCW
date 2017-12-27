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
@Table(name = "fc_form34", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm34.findAll", query = "SELECT f FROM FcForm34 f")
    , @NamedQuery(name = "FcForm34.findById", query = "SELECT f FROM FcForm34 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm34.findByProfileId", query = "SELECT f FROM FcForm34 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm34.findByCpCno", query = "SELECT f FROM FcForm34 f WHERE f.cpCno = :cpCno")
    , @NamedQuery(name = "FcForm34.findByCpCname", query = "SELECT f FROM FcForm34 f WHERE f.cpCname = :cpCname")
    , @NamedQuery(name = "FcForm34.findByCpCage", query = "SELECT f FROM FcForm34 f WHERE f.cpCage = :cpCage")
    , @NamedQuery(name = "FcForm34.findByCpCgender", query = "SELECT f FROM FcForm34 f WHERE f.cpCgender = :cpCgender")
    , @NamedQuery(name = "FcForm34.findByCpRname", query = "SELECT f FROM FcForm34 f WHERE f.cpRname = :cpRname")
    , @NamedQuery(name = "FcForm34.findByCpGname", query = "SELECT f FROM FcForm34 f WHERE f.cpGname = :cpGname")})
public class FcForm34 extends FcForm implements Serializable {

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
    @Column(name = "cpCno")
    private Integer cpCno;
    @Size(max = 80)
    @Column(name = "cpCname", length = 80)
    private String cpCname;
    @Column(name = "cpCage")
    private Integer cpCage;
    @Size(max = 30)
    @Column(name = "cpCgender", length = 30)
    private String cpCgender;
    @Lob
    @Size(max = 65535)
    @Column(name = "cpINameAddress", length = 65535)
    private String cpINameAddress;
    @Size(max = 80)
    @Column(name = "cpRname", length = 80)
    private String cpRname;
    @Size(max = 80)
    @Column(name = "cpGname", length = 80)
    private String cpGname;

    public FcForm34() {
    }

    public FcForm34(Integer id) {
        this.id = id;
    }

    public FcForm34(Integer id, String profileId) {
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

    public Integer getCpCno() {
        return cpCno;
    }

    public void setCpCno(Integer cpCno) {
        this.cpCno = cpCno;
    }

    public String getCpCname() {
        return cpCname;
    }

    public void setCpCname(String cpCname) {
        this.cpCname = cpCname;
    }

    public Integer getCpCage() {
        return cpCage;
    }

    public void setCpCage(Integer cpCage) {
        this.cpCage = cpCage;
    }

    public String getCpCgender() {
        return cpCgender;
    }

    public void setCpCgender(String cpCgender) {
        this.cpCgender = cpCgender;
    }

    public String getCpINameAddress() {
        return cpINameAddress;
    }

    public void setCpINameAddress(String cpINameAddress) {
        this.cpINameAddress = cpINameAddress;
    }

    public String getCpRname() {
        return cpRname;
    }

    public void setCpRname(String cpRname) {
        this.cpRname = cpRname;
    }

    public String getCpGname() {
        return cpGname;
    }

    public void setCpGname(String cpGname) {
        this.cpGname = cpGname;
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
        if (!(object instanceof FcForm34)) {
            return false;
        }
        FcForm34 other = (FcForm34) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm34[ id=" + id + " ]";
    }
    
}
