/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.DTO;

/**
 *
 * @author Swetha
 */
public class FIR_PS_DTO {
    private String firNo;
    private String policeStation;
    private int accusedId;
    private String accuName;

    public String getAccuName() {
        return accuName;
    }

    public void setAccuName(String accuName) {
        this.accuName = accuName;
    }

    public int getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(int accusedId) {
        this.accusedId = accusedId;
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

    public FIR_PS_DTO(String firNo, String policeStation, int accusedId, String accuName) {
        this.firNo = firNo;
        this.policeStation = policeStation;
        this.accusedId = accusedId;
        this.accuName = accuName;
    }

   
    
    
}
