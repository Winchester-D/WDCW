/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.orm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Swetha
 */
@Embeddable
public class EnquiryProcessPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRIAL_NO")
    private int trialNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CC_NO")
    private String ccNo;

    public EnquiryProcessPK() {
    }

    public EnquiryProcessPK(int trialNo, String ccNo) {
        this.trialNo = trialNo;
        this.ccNo = ccNo;
    }

    public int getTrialNo() {
        return trialNo;
    }

    public void setTrialNo(int trialNo) {
        this.trialNo = trialNo;
    }

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) trialNo;
        hash += (ccNo != null ? ccNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnquiryProcessPK)) {
            return false;
        }
        EnquiryProcessPK other = (EnquiryProcessPK) object;
        if (this.trialNo != other.trialNo) {
            return false;
        }
        if ((this.ccNo == null && other.ccNo != null) || (this.ccNo != null && !this.ccNo.equals(other.ccNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.EnquiryProcessPK[ trialNo=" + trialNo + ", ccNo=" + ccNo + " ]";
    }
    
}
