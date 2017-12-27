/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.DTO;

import java.util.Date;

/**
 *
 * @author Swetha
 */
public class ParentalIntimation_DTO {
    private int accusedId;
    private String accuName;
    private int accuAge;
    private String accuIntimationName;
    private String accuAddress;
    private String accuActsSec;
    private Date accuCustodyDateTime;
    private String parentIntimationSent;
    private String accuPlacedInst;
    private String accuJjbPlace;
    private Date accuJjbDate;
    private String accuChargeReason;

    public String getAccuActsSec() {
        return accuActsSec;
    }

    public void setAccuActsSec(String accuActsSec) {
        this.accuActsSec = accuActsSec;
    }

    public String getAccuAddress() {
        return accuAddress;
    }

    public void setAccuAddress(String accuAddress) {
        this.accuAddress = accuAddress;
    }

    public int getAccuAge() {
        return accuAge;
    }

    public void setAccuAge(int accuAge) {
        this.accuAge = accuAge;
    }

    public String getAccuChargeReason() {
        return accuChargeReason;
    }

    public void setAccuChargeReason(String accuChargeReason) {
        this.accuChargeReason = accuChargeReason;
    }

    public Date getAccuCustodyDateTime() {
        return accuCustodyDateTime;
    }

    public void setAccuCustodyDateTime(Date accuCustodyDateTime) {
        this.accuCustodyDateTime = accuCustodyDateTime;
    }

    public String getAccuIntimationName() {
        return accuIntimationName;
    }

    public void setAccuIntimationName(String accuIntimationName) {
        this.accuIntimationName = accuIntimationName;
    }

    public Date getAccuJjbDate() {
        return accuJjbDate;
    }

    public void setAccuJjbDate(Date accuJjbDate) {
        this.accuJjbDate = accuJjbDate;
    }

    public String getAccuJjbPlace() {
        return accuJjbPlace;
    }

    public void setAccuJjbPlace(String accuJjbPlace) {
        this.accuJjbPlace = accuJjbPlace;
    }

    public String getAccuName() {
        return accuName;
    }

    public void setAccuName(String accuName) {
        this.accuName = accuName;
    }

    public String getAccuPlacedInst() {
        return accuPlacedInst;
    }

    public void setAccuPlacedInst(String accuPlacedInst) {
        this.accuPlacedInst = accuPlacedInst;
    }

    public int getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(int accusedId) {
        this.accusedId = accusedId;
    }

    public String getParentIntimationSent() {
        return parentIntimationSent;
    }

    public void setParentIntimationSent(String parentIntimationSent) {
        this.parentIntimationSent = parentIntimationSent;
    }

    public ParentalIntimation_DTO(int accusedId, String accuName, int accuAge, String accuIntimationName, String accuAddress, String accuActsSec, Date accuCustodyDateTime) {
        this.accusedId = accusedId;
        this.accuName = accuName;
        this.accuAge = accuAge;
        this.accuIntimationName = accuIntimationName;
        this.accuAddress = accuAddress;
        this.accuActsSec = accuActsSec;
        this.accuCustodyDateTime = accuCustodyDateTime;
    }
    public ParentalIntimation_DTO(int accusedId, String accuName, int accuAge, String accuIntimationName, String accuAddress, String accuActsSec, Date accuCustodyDateTime, String  parentIntimationSent,String accuPlacedInst,String accuJjbPlace,Date accuJjbDate,String accuChargeReason ) {
        this.accusedId = accusedId;
        this.accuName = accuName;
        this.accuAge = accuAge;
        this.accuIntimationName = accuIntimationName;
        this.accuAddress = accuAddress;
        this.accuActsSec = accuActsSec;
        this.accuCustodyDateTime = accuCustodyDateTime;
        this.parentIntimationSent=parentIntimationSent;
        this.accuPlacedInst = accuPlacedInst;
        this.accuJjbPlace = accuJjbPlace;
        this.accuJjbDate = accuJjbDate;
        this.accuChargeReason = accuChargeReason;
    }

    public ParentalIntimation_DTO() {
    }
    
    
}
