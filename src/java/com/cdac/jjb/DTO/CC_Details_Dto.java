/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.DTO;

/**
 *
 * @author suresh
 */
public class CC_Details_Dto {
    public String ccNo;
    public String firNo; 
    public Integer accusedId;
    public String accuName;

    public CC_Details_Dto(String ccNo,String firNo,Integer accusedId,String accuName)
    {
        this.ccNo=ccNo;
        this.firNo=firNo;
        this.accusedId=accusedId;
        this.accuName=accuName;
    }
    public String getAccuName() {
        return accuName;
    }

    public void setAccuName(String accuName) {
        this.accuName = accuName;
    }

    public Integer getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(Integer accusedId) {
        this.accusedId = accusedId;
    }

   

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    public String getFirNo() {
        return firNo;
    }

    public void setFirNo(String firNo) {
        this.firNo = firNo;
    }
    
    
    
}
