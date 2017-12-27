/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.orm;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Swetha
 */
@Entity
@Table(name = "remand_case_dairy", catalog = "jjb_final", schema = "")
@NamedQueries({
    @NamedQuery(name = "RemandCaseDairy.findAll", query = "SELECT r FROM RemandCaseDairy r"),
    @NamedQuery(name = "RemandCaseDairy.findByRemandId", query = "SELECT r FROM RemandCaseDairy r WHERE r.remandId = :remandId"),
    @NamedQuery(name = "RemandCaseDairy.findByAccuAge", query = "SELECT r FROM RemandCaseDairy r WHERE r.accuAge = :accuAge"),
    @NamedQuery(name = "RemandCaseDairy.findByDobCertificateType", query = "SELECT r FROM RemandCaseDairy r WHERE r.dobCertificateType = :dobCertificateType"),
    @NamedQuery(name = "RemandCaseDairy.findByRemandCdDate", query = "SELECT r FROM RemandCaseDairy r WHERE r.remandCdDate = :remandCdDate")})
public class RemandCaseDairy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "REMAND_ID")
    private Integer remandId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCU_AGE")
    private int accuAge;
    @Column(name = "DOB_CERTIFICATE_TYPE")
    private Integer dobCertificateType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REMAND_CD_DATE")
    @Temporal(TemporalType.DATE)
    private Date remandCdDate;
    @Lob
    @Size(max = 65535)
    @Column(name = "EXAMINED_WITNESS_DETAILS")
    private String examinedWitnessDetails;
    @JoinColumn(name = "ACCUSED_ID", referencedColumnName = "ACCUSED_ID")
    @ManyToOne(optional = false)
    private CourtSurrender accusedId;
    @JoinColumns({
        @JoinColumn(name = "FIR_NO", referencedColumnName = "FIR_NO"),
        @JoinColumn(name = "POLICE_STATION", referencedColumnName = "POLICE_STATION")})
    @ManyToOne(optional = false)
    private Fir fir;

    public RemandCaseDairy() {
    }

    public RemandCaseDairy(Integer remandId) {
        this.remandId = remandId;
    }

    public RemandCaseDairy(Integer remandId, int accuAge, Date remandCdDate) {
        this.remandId = remandId;
        this.accuAge = accuAge;
        this.remandCdDate = remandCdDate;
    }

    public Integer getRemandId() {
        return remandId;
    }

    public void setRemandId(Integer remandId) {
        this.remandId = remandId;
    }

    public int getAccuAge() {
        return accuAge;
    }

    public void setAccuAge(int accuAge) {
        this.accuAge = accuAge;
    }

    public Integer getDobCertificateType() {
        return dobCertificateType;
    }

    public void setDobCertificateType(Integer dobCertificateType) {
        this.dobCertificateType = dobCertificateType;
    }

    public Date getRemandCdDate() {
        return remandCdDate;
    }

    public void setRemandCdDate(Date remandCdDate) {
        this.remandCdDate = remandCdDate;
    }

    public String getExaminedWitnessDetails() {
        return examinedWitnessDetails;
    }

    public void setExaminedWitnessDetails(String examinedWitnessDetails) {
        this.examinedWitnessDetails = examinedWitnessDetails;
    }

    public CourtSurrender getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(CourtSurrender accusedId) {
        this.accusedId = accusedId;
    }

    public Fir getFir() {
        return fir;
    }

    public void setFir(Fir fir) {
        this.fir = fir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (remandId != null ? remandId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RemandCaseDairy)) {
            return false;
        }
        RemandCaseDairy other = (RemandCaseDairy) object;
        if ((this.remandId == null && other.remandId != null) || (this.remandId != null && !this.remandId.equals(other.remandId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.RemandCaseDairy[ remandId=" + remandId + " ]";
    }
    
}
