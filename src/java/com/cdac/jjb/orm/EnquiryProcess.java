/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.orm;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
@Table(name = "enquiry_process", catalog = "jjb_final", schema = "")
@NamedQueries({
    @NamedQuery(name = "EnquiryProcess.findAll", query = "SELECT e FROM EnquiryProcess e"),
    @NamedQuery(name = "EnquiryProcess.findByTrialNo", query = "SELECT e FROM EnquiryProcess e WHERE e.enquiryProcessPK.trialNo = :trialNo"),
    @NamedQuery(name = "EnquiryProcess.findByCcNo", query = "SELECT e FROM EnquiryProcess e WHERE e.enquiryProcessPK.ccNo = :ccNo"),
    @NamedQuery(name = "EnquiryProcess.findByTrialDate", query = "SELECT e FROM EnquiryProcess e WHERE e.trialDate = :trialDate"),
    @NamedQuery(name = "EnquiryProcess.findByChargeSheetFiled", query = "SELECT e FROM EnquiryProcess e WHERE e.chargeSheetFiled = :chargeSheetFiled"),
    @NamedQuery(name = "EnquiryProcess.findByCaseTerminated", query = "SELECT e FROM EnquiryProcess e WHERE e.caseTerminated = :caseTerminated"),
    @NamedQuery(name = "EnquiryProcess.findByBailGranted", query = "SELECT e FROM EnquiryProcess e WHERE e.bailGranted = :bailGranted"),
    @NamedQuery(name = "EnquiryProcess.findByBailOptions", query = "SELECT e FROM EnquiryProcess e WHERE e.bailOptions = :bailOptions"),
    @NamedQuery(name = "EnquiryProcess.findByOrderIssued", query = "SELECT e FROM EnquiryProcess e WHERE e.orderIssued = :orderIssued"),
    @NamedQuery(name = "EnquiryProcess.findByOrderIssuedDetails", query = "SELECT e FROM EnquiryProcess e WHERE e.orderIssuedDetails = :orderIssuedDetails"),
    @NamedQuery(name = "EnquiryProcess.findByFinalOrderFineDet", query = "SELECT e FROM EnquiryProcess e WHERE e.finalOrderFineDet = :finalOrderFineDet"),
    @NamedQuery(name = "EnquiryProcess.findByFineDetails", query = "SELECT e FROM EnquiryProcess e WHERE e.fineDetails = :fineDetails"),
    @NamedQuery(name = "EnquiryProcess.findByNextHearingDate", query = "SELECT e FROM EnquiryProcess e WHERE e.nextHearingDate = :nextHearingDate")})
public class EnquiryProcess implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnquiryProcessPK enquiryProcessPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRIAL_DATE")
    @Temporal(TemporalType.DATE)
    private Date trialDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CHARGE_SHEET_FILED")
    private String chargeSheetFiled;
    @Size(max = 5)
    @Column(name = "CASE_TERMINATED")
    private String caseTerminated;
    @Lob
    @Size(max = 65535)
    @Column(name = "TERMINATED_REMARKS")
    private String terminatedRemarks;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "BAIL_GRANTED")
    private String bailGranted;
    @Column(name = "BAIL_OPTIONS")
    private Integer bailOptions;
    @Column(name = "ORDER_ISSUED")
    private Integer orderIssued;
    @Column(name = "ORDER_ISSUED_DETAILS")
    private Integer orderIssuedDetails;
    @Column(name = "FINAL_ORDER_FINE_DET")
    private Integer finalOrderFineDet;
    @Column(name = "FINE_DETAILS")
    private Integer fineDetails;
    @Column(name = "NEXT_HEARING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextHearingDate;
    @Lob
    @Size(max = 65535)
    @Column(name = "OBSERVATIONS")
    private String observations;
    @JoinColumn(name = "CC_NO", referencedColumnName = "CC_NO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SocialInvestigationOrder socialInvestigationOrder;

    public EnquiryProcess() {
    }

    public EnquiryProcess(EnquiryProcessPK enquiryProcessPK) {
        this.enquiryProcessPK = enquiryProcessPK;
    }

    public EnquiryProcess(EnquiryProcessPK enquiryProcessPK, Date trialDate, String chargeSheetFiled, String bailGranted) {
        this.enquiryProcessPK = enquiryProcessPK;
        this.trialDate = trialDate;
        this.chargeSheetFiled = chargeSheetFiled;
        this.bailGranted = bailGranted;
    }

    public EnquiryProcess(int trialNo, String ccNo) {
        this.enquiryProcessPK = new EnquiryProcessPK(trialNo, ccNo);
    }

    public EnquiryProcessPK getEnquiryProcessPK() {
        return enquiryProcessPK;
    }

    public void setEnquiryProcessPK(EnquiryProcessPK enquiryProcessPK) {
        this.enquiryProcessPK = enquiryProcessPK;
    }

    public Date getTrialDate() {
        return trialDate;
    }

    public void setTrialDate(Date trialDate) {
        this.trialDate = trialDate;
    }

    public String getChargeSheetFiled() {
        return chargeSheetFiled;
    }

    public void setChargeSheetFiled(String chargeSheetFiled) {
        this.chargeSheetFiled = chargeSheetFiled;
    }

    public String getCaseTerminated() {
        return caseTerminated;
    }

    public void setCaseTerminated(String caseTerminated) {
        this.caseTerminated = caseTerminated;
    }

    public String getTerminatedRemarks() {
        return terminatedRemarks;
    }

    public void setTerminatedRemarks(String terminatedRemarks) {
        this.terminatedRemarks = terminatedRemarks;
    }

    public String getBailGranted() {
        return bailGranted;
    }

    public void setBailGranted(String bailGranted) {
        this.bailGranted = bailGranted;
    }

    public Integer getBailOptions() {
        return bailOptions;
    }

    public void setBailOptions(Integer bailOptions) {
        this.bailOptions = bailOptions;
    }

    public Integer getOrderIssued() {
        return orderIssued;
    }

    public void setOrderIssued(Integer orderIssued) {
        this.orderIssued = orderIssued;
    }

    public Integer getOrderIssuedDetails() {
        return orderIssuedDetails;
    }

    public void setOrderIssuedDetails(Integer orderIssuedDetails) {
        this.orderIssuedDetails = orderIssuedDetails;
    }

    public Integer getFinalOrderFineDet() {
        return finalOrderFineDet;
    }

    public void setFinalOrderFineDet(Integer finalOrderFineDet) {
        this.finalOrderFineDet = finalOrderFineDet;
    }

    public Integer getFineDetails() {
        return fineDetails;
    }

    public void setFineDetails(Integer fineDetails) {
        this.fineDetails = fineDetails;
    }

    public Date getNextHearingDate() {
        return nextHearingDate;
    }

    public void setNextHearingDate(Date nextHearingDate) {
        this.nextHearingDate = nextHearingDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public SocialInvestigationOrder getSocialInvestigationOrder() {
        return socialInvestigationOrder;
    }

    public void setSocialInvestigationOrder(SocialInvestigationOrder socialInvestigationOrder) {
        this.socialInvestigationOrder = socialInvestigationOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enquiryProcessPK != null ? enquiryProcessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnquiryProcess)) {
            return false;
        }
        EnquiryProcess other = (EnquiryProcess) object;
        if ((this.enquiryProcessPK == null && other.enquiryProcessPK != null) || (this.enquiryProcessPK != null && !this.enquiryProcessPK.equals(other.enquiryProcessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.EnquiryProcess[ enquiryProcessPK=" + enquiryProcessPK + " ]";
    }
    
}
