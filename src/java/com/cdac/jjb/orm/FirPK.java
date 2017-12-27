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
public class FirPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FIR_NO")
    private String firNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "POLICE_STATION")
    private String policeStation;

    public FirPK() {
    }

    public FirPK(String firNo, String policeStation) {
        this.firNo = firNo;
        this.policeStation = policeStation;
    }

    public String getFirNo() {
        return firNo;
    }

    public void setFirNo(String firNo) {
        this.firNo = firNo;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (firNo != null ? firNo.hashCode() : 0);
        hash += (policeStation != null ? policeStation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FirPK)) {
            return false;
        }
        FirPK other = (FirPK) object;
        if ((this.firNo == null && other.firNo != null) || (this.firNo != null && !this.firNo.equals(other.firNo))) {
            return false;
        }
        if ((this.policeStation == null && other.policeStation != null) || (this.policeStation != null && !this.policeStation.equals(other.policeStation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.FirPK[ firNo=" + firNo + ", policeStation=" + policeStation + " ]";
    }
    
}
