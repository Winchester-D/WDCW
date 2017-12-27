/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.orm;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "social_investigation_order", catalog = "jjb_final", schema = "")
@NamedQueries({
    @NamedQuery(name = "SocialInvestigationOrder.findAll", query = "SELECT s FROM SocialInvestigationOrder s"),
    @NamedQuery(name = "SocialInvestigationOrder.findByCcNo", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.ccNo = :ccNo"),
    @NamedQuery(name = "SocialInvestigationOrder.findByDistrictId", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.districtId = :districtId"),
    @NamedQuery(name = "SocialInvestigationOrder.findByIntimationSent", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.intimationSent = :intimationSent"),
    @NamedQuery(name = "SocialInvestigationOrder.findByDpoName", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.dpoName = :dpoName"),
    @NamedQuery(name = "SocialInvestigationOrder.findByDpoIntiOrderNo", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.dpoIntiOrderNo = :dpoIntiOrderNo"),
    @NamedQuery(name = "SocialInvestigationOrder.findBySubmitBeforeDate", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.submitBeforeDate = :submitBeforeDate"),
    @NamedQuery(name = "SocialInvestigationOrder.findByTimePeriod", query = "SELECT s FROM SocialInvestigationOrder s WHERE s.timePeriod = :timePeriod")})
public class SocialInvestigationOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CC_NO")
    private String ccNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DISTRICT_ID")
    private String districtId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "INTIMATION_SENT")
    private String intimationSent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "DPO_NAME")
    private String dpoName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "DPO_ADDRESS")
    private String dpoAddress;
    @Size(max = 20)
    @Column(name = "DPO_INTI_ORDER_NO")
    private String dpoIntiOrderNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUBMIT_BEFORE_DATE")
    @Temporal(TemporalType.DATE)
    private Date submitBeforeDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TIME_PERIOD")
    private String timePeriod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "socialInvestigationOrder")
    private List<EnquiryProcess> enquiryProcessList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "socialInvestigationOrder")
    private SocialInvestigation socialInvestigation;
    @JoinColumn(name = "ACCUSED_ID", referencedColumnName = "ACCUSED_ID")
    @ManyToOne(optional = false)
    private CourtSurrender accusedId;
    @JoinColumns({
        @JoinColumn(name = "FIR_NO", referencedColumnName = "FIR_NO"),
        @JoinColumn(name = "POLICE_STATION", referencedColumnName = "POLICE_STATION")})
    @ManyToOne(optional = false)
    private Fir fir;

    public SocialInvestigationOrder() {
    }

    public SocialInvestigationOrder(String ccNo) {
        this.ccNo = ccNo;
    }

    public SocialInvestigationOrder(String ccNo, String districtId, String intimationSent, String dpoName, String dpoAddress, Date submitBeforeDate, String timePeriod) {
        this.ccNo = ccNo;
        this.districtId = districtId;
        this.intimationSent = intimationSent;
        this.dpoName = dpoName;
        this.dpoAddress = dpoAddress;
        this.submitBeforeDate = submitBeforeDate;
        this.timePeriod = timePeriod;
    }

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getIntimationSent() {
        return intimationSent;
    }

    public void setIntimationSent(String intimationSent) {
        this.intimationSent = intimationSent;
    }

    public String getDpoName() {
        return dpoName;
    }

    public void setDpoName(String dpoName) {
        this.dpoName = dpoName;
    }

    public String getDpoAddress() {
        return dpoAddress;
    }

    public void setDpoAddress(String dpoAddress) {
        this.dpoAddress = dpoAddress;
    }

    public String getDpoIntiOrderNo() {
        return dpoIntiOrderNo;
    }

    public void setDpoIntiOrderNo(String dpoIntiOrderNo) {
        this.dpoIntiOrderNo = dpoIntiOrderNo;
    }

    public Date getSubmitBeforeDate() {
        return submitBeforeDate;
    }

    public void setSubmitBeforeDate(Date submitBeforeDate) {
        this.submitBeforeDate = submitBeforeDate;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public List<EnquiryProcess> getEnquiryProcessList() {
        return enquiryProcessList;
    }

    public void setEnquiryProcessList(List<EnquiryProcess> enquiryProcessList) {
        this.enquiryProcessList = enquiryProcessList;
    }

    public SocialInvestigation getSocialInvestigation() {
        return socialInvestigation;
    }

    public void setSocialInvestigation(SocialInvestigation socialInvestigation) {
        this.socialInvestigation = socialInvestigation;
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
        hash += (ccNo != null ? ccNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocialInvestigationOrder)) {
            return false;
        }
        SocialInvestigationOrder other = (SocialInvestigationOrder) object;
        if ((this.ccNo == null && other.ccNo != null) || (this.ccNo != null && !this.ccNo.equals(other.ccNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.SocialInvestigationOrder[ ccNo=" + ccNo + " ]";
    }
    
}
