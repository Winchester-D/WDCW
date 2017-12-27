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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "social_investigation", catalog = "jjb_final", schema = "")
@NamedQueries({
    @NamedQuery(name = "SocialInvestigation.findAll", query = "SELECT s FROM SocialInvestigation s"),
    @NamedQuery(name = "SocialInvestigation.findByCcNo", query = "SELECT s FROM SocialInvestigation s WHERE s.ccNo = :ccNo"),
    @NamedQuery(name = "SocialInvestigation.findBySerialNo", query = "SELECT s FROM SocialInvestigation s WHERE s.serialNo = :serialNo"),
    @NamedQuery(name = "SocialInvestigation.findByMagistrateCourt", query = "SELECT s FROM SocialInvestigation s WHERE s.magistrateCourt = :magistrateCourt"),
    @NamedQuery(name = "SocialInvestigation.findByCourtPlace", query = "SELECT s FROM SocialInvestigation s WHERE s.courtPlace = :courtPlace"),
    @NamedQuery(name = "SocialInvestigation.findByCourtDistrict", query = "SELECT s FROM SocialInvestigation s WHERE s.courtDistrict = :courtDistrict"),
    @NamedQuery(name = "SocialInvestigation.findByOffence", query = "SELECT s FROM SocialInvestigation s WHERE s.offence = :offence"),
    @NamedQuery(name = "SocialInvestigation.findByCrimeNumber", query = "SELECT s FROM SocialInvestigation s WHERE s.crimeNumber = :crimeNumber"),
    @NamedQuery(name = "SocialInvestigation.findByOffenName", query = "SELECT s FROM SocialInvestigation s WHERE s.offenName = :offenName"),
    @NamedQuery(name = "SocialInvestigation.findByOffenFatherName", query = "SELECT s FROM SocialInvestigation s WHERE s.offenFatherName = :offenFatherName"),
    @NamedQuery(name = "SocialInvestigation.findByOffenAge", query = "SELECT s FROM SocialInvestigation s WHERE s.offenAge = :offenAge"),
    @NamedQuery(name = "SocialInvestigation.findByOffenGender", query = "SELECT s FROM SocialInvestigation s WHERE s.offenGender = :offenGender"),
    @NamedQuery(name = "SocialInvestigation.findByOffenReligion", query = "SELECT s FROM SocialInvestigation s WHERE s.offenReligion = :offenReligion"),
    @NamedQuery(name = "SocialInvestigation.findByOffenCaste", query = "SELECT s FROM SocialInvestigation s WHERE s.offenCaste = :offenCaste"),
    @NamedQuery(name = "SocialInvestigation.findByDisposalDate", query = "SELECT s FROM SocialInvestigation s WHERE s.disposalDate = :disposalDate")})
public class SocialInvestigation implements Serializable {
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
    @Column(name = "SERIAL_NO")
    private String serialNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MAGISTRATE_COURT")
    private String magistrateCourt;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "COURT_PLACE")
    private String courtPlace;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "COURT_DISTRICT")
    private String courtDistrict;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "OFFENCE")
    private String offence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CRIME_NUMBER")
    private String crimeNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "OFFEN_NAME")
    private String offenName;
    @Size(max = 40)
    @Column(name = "OFFEN_FATHER_NAME")
    private String offenFatherName;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_ADDRESS")
    private String offenAddress;
    @Size(max = 20)
    @Column(name = "OFFEN_AGE")
    private String offenAge;
    @Size(max = 10)
    @Column(name = "OFFEN_GENDER")
    private String offenGender;
    @Size(max = 20)
    @Column(name = "OFFEN_RELIGION")
    private String offenReligion;
    @Size(max = 20)
    @Column(name = "OFFEN_CASTE")
    private String offenCaste;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_CHILDHOOD")
    private String offenChildhood;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_BEHAV")
    private String offenBehav;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_TEMPERMENT")
    private String offenTemperment;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_PHY_MEN_HIST")
    private String offenPhyMenHist;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_SCHOOL_REC")
    private String offenSchoolRec;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_EMP_HIST")
    private String offenEmpHist;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_PRES_OCCU")
    private String offenPresOccu;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_EMP_REPO")
    private String offenEmpRepo;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_ASSOCIATES")
    private String offenAssociates;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_SOC_ORG_CONTACT")
    private String offenSocOrgContact;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_HOME_CONDI")
    private String offenHomeCondi;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_FATHER")
    private String offenFather;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_MOTHER")
    private String offenMother;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_STEP_FATHER")
    private String offenStepFather;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_STEP_MOTHER")
    private String offenStepMother;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_BROTHERS")
    private String offenBrothers;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_SISTERS")
    private String offenSisters;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_WIFE")
    private String offenWife;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_CHILDREN")
    private String offenChildren;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_INTR_REL")
    private String offenIntrRel;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_INST_FAM_INTREST")
    private String offenInstFamIntrest;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_PARENT_REPO")
    private String offenParentRepo;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_FAM_ATTI")
    private String offenFamAtti;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_NEI_REPO")
    private String offenNeiRepo;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_HOME_SURR")
    private String offenHomeSurr;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_PREV_INST_REC")
    private String offenPrevInstRec;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_STATEMENT")
    private String offenStatement;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_REACT_ATTI")
    private String offenReactAtti;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_ASSETS")
    private String offenAssets;
    @Lob
    @Size(max = 65535)
    @Column(name = "OFFEN_LIABILITIES")
    private String offenLiabilities;
    @Lob
    @Size(max = 65535)
    @Column(name = "DPO_REMARKS")
    private String dpoRemarks;
    @Lob
    @Size(max = 65535)
    @Column(name = "DPO_NAME_ADDR")
    private String dpoNameAddr;
    @Lob
    @Size(max = 65535)
    @Column(name = "DPO_STATION")
    private String dpoStation;
    @Lob
    @Size(max = 65535)
    @Column(name = "DISPOSAL_NATURE")
    private String disposalNature;
    @Column(name = "DISPOSAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date disposalDate;
    @JoinColumn(name = "CC_NO", referencedColumnName = "CC_NO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SocialInvestigationOrder socialInvestigationOrder;

    public SocialInvestigation() {
    }

    public SocialInvestigation(String ccNo) {
        this.ccNo = ccNo;
    }

    public SocialInvestigation(String ccNo, String serialNo, String magistrateCourt, String courtPlace, String courtDistrict, String offence, String crimeNumber, String offenName) {
        this.ccNo = ccNo;
        this.serialNo = serialNo;
        this.magistrateCourt = magistrateCourt;
        this.courtPlace = courtPlace;
        this.courtDistrict = courtDistrict;
        this.offence = offence;
        this.crimeNumber = crimeNumber;
        this.offenName = offenName;
    }

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMagistrateCourt() {
        return magistrateCourt;
    }

    public void setMagistrateCourt(String magistrateCourt) {
        this.magistrateCourt = magistrateCourt;
    }

    public String getCourtPlace() {
        return courtPlace;
    }

    public void setCourtPlace(String courtPlace) {
        this.courtPlace = courtPlace;
    }

    public String getCourtDistrict() {
        return courtDistrict;
    }

    public void setCourtDistrict(String courtDistrict) {
        this.courtDistrict = courtDistrict;
    }

    public String getOffence() {
        return offence;
    }

    public void setOffence(String offence) {
        this.offence = offence;
    }

    public String getCrimeNumber() {
        return crimeNumber;
    }

    public void setCrimeNumber(String crimeNumber) {
        this.crimeNumber = crimeNumber;
    }

    public String getOffenName() {
        return offenName;
    }

    public void setOffenName(String offenName) {
        this.offenName = offenName;
    }

    public String getOffenFatherName() {
        return offenFatherName;
    }

    public void setOffenFatherName(String offenFatherName) {
        this.offenFatherName = offenFatherName;
    }

    public String getOffenAddress() {
        return offenAddress;
    }

    public void setOffenAddress(String offenAddress) {
        this.offenAddress = offenAddress;
    }

    public String getOffenAge() {
        return offenAge;
    }

    public void setOffenAge(String offenAge) {
        this.offenAge = offenAge;
    }

    public String getOffenGender() {
        return offenGender;
    }

    public void setOffenGender(String offenGender) {
        this.offenGender = offenGender;
    }

    public String getOffenReligion() {
        return offenReligion;
    }

    public void setOffenReligion(String offenReligion) {
        this.offenReligion = offenReligion;
    }

    public String getOffenCaste() {
        return offenCaste;
    }

    public void setOffenCaste(String offenCaste) {
        this.offenCaste = offenCaste;
    }

    public String getOffenChildhood() {
        return offenChildhood;
    }

    public void setOffenChildhood(String offenChildhood) {
        this.offenChildhood = offenChildhood;
    }

    public String getOffenBehav() {
        return offenBehav;
    }

    public void setOffenBehav(String offenBehav) {
        this.offenBehav = offenBehav;
    }

    public String getOffenTemperment() {
        return offenTemperment;
    }

    public void setOffenTemperment(String offenTemperment) {
        this.offenTemperment = offenTemperment;
    }

    public String getOffenPhyMenHist() {
        return offenPhyMenHist;
    }

    public void setOffenPhyMenHist(String offenPhyMenHist) {
        this.offenPhyMenHist = offenPhyMenHist;
    }

    public String getOffenSchoolRec() {
        return offenSchoolRec;
    }

    public void setOffenSchoolRec(String offenSchoolRec) {
        this.offenSchoolRec = offenSchoolRec;
    }

    public String getOffenEmpHist() {
        return offenEmpHist;
    }

    public void setOffenEmpHist(String offenEmpHist) {
        this.offenEmpHist = offenEmpHist;
    }

    public String getOffenPresOccu() {
        return offenPresOccu;
    }

    public void setOffenPresOccu(String offenPresOccu) {
        this.offenPresOccu = offenPresOccu;
    }

    public String getOffenEmpRepo() {
        return offenEmpRepo;
    }

    public void setOffenEmpRepo(String offenEmpRepo) {
        this.offenEmpRepo = offenEmpRepo;
    }

    public String getOffenAssociates() {
        return offenAssociates;
    }

    public void setOffenAssociates(String offenAssociates) {
        this.offenAssociates = offenAssociates;
    }

    public String getOffenSocOrgContact() {
        return offenSocOrgContact;
    }

    public void setOffenSocOrgContact(String offenSocOrgContact) {
        this.offenSocOrgContact = offenSocOrgContact;
    }

    public String getOffenHomeCondi() {
        return offenHomeCondi;
    }

    public void setOffenHomeCondi(String offenHomeCondi) {
        this.offenHomeCondi = offenHomeCondi;
    }

    public String getOffenFather() {
        return offenFather;
    }

    public void setOffenFather(String offenFather) {
        this.offenFather = offenFather;
    }

    public String getOffenMother() {
        return offenMother;
    }

    public void setOffenMother(String offenMother) {
        this.offenMother = offenMother;
    }

    public String getOffenStepFather() {
        return offenStepFather;
    }

    public void setOffenStepFather(String offenStepFather) {
        this.offenStepFather = offenStepFather;
    }

    public String getOffenStepMother() {
        return offenStepMother;
    }

    public void setOffenStepMother(String offenStepMother) {
        this.offenStepMother = offenStepMother;
    }

    public String getOffenBrothers() {
        return offenBrothers;
    }

    public void setOffenBrothers(String offenBrothers) {
        this.offenBrothers = offenBrothers;
    }

    public String getOffenSisters() {
        return offenSisters;
    }

    public void setOffenSisters(String offenSisters) {
        this.offenSisters = offenSisters;
    }

    public String getOffenWife() {
        return offenWife;
    }

    public void setOffenWife(String offenWife) {
        this.offenWife = offenWife;
    }

    public String getOffenChildren() {
        return offenChildren;
    }

    public void setOffenChildren(String offenChildren) {
        this.offenChildren = offenChildren;
    }

    public String getOffenIntrRel() {
        return offenIntrRel;
    }

    public void setOffenIntrRel(String offenIntrRel) {
        this.offenIntrRel = offenIntrRel;
    }

    public String getOffenInstFamIntrest() {
        return offenInstFamIntrest;
    }

    public void setOffenInstFamIntrest(String offenInstFamIntrest) {
        this.offenInstFamIntrest = offenInstFamIntrest;
    }

    public String getOffenParentRepo() {
        return offenParentRepo;
    }

    public void setOffenParentRepo(String offenParentRepo) {
        this.offenParentRepo = offenParentRepo;
    }

    public String getOffenFamAtti() {
        return offenFamAtti;
    }

    public void setOffenFamAtti(String offenFamAtti) {
        this.offenFamAtti = offenFamAtti;
    }

    public String getOffenNeiRepo() {
        return offenNeiRepo;
    }

    public void setOffenNeiRepo(String offenNeiRepo) {
        this.offenNeiRepo = offenNeiRepo;
    }

    public String getOffenHomeSurr() {
        return offenHomeSurr;
    }

    public void setOffenHomeSurr(String offenHomeSurr) {
        this.offenHomeSurr = offenHomeSurr;
    }

    public String getOffenPrevInstRec() {
        return offenPrevInstRec;
    }

    public void setOffenPrevInstRec(String offenPrevInstRec) {
        this.offenPrevInstRec = offenPrevInstRec;
    }

    public String getOffenStatement() {
        return offenStatement;
    }

    public void setOffenStatement(String offenStatement) {
        this.offenStatement = offenStatement;
    }

    public String getOffenReactAtti() {
        return offenReactAtti;
    }

    public void setOffenReactAtti(String offenReactAtti) {
        this.offenReactAtti = offenReactAtti;
    }

    public String getOffenAssets() {
        return offenAssets;
    }

    public void setOffenAssets(String offenAssets) {
        this.offenAssets = offenAssets;
    }

    public String getOffenLiabilities() {
        return offenLiabilities;
    }

    public void setOffenLiabilities(String offenLiabilities) {
        this.offenLiabilities = offenLiabilities;
    }

    public String getDpoRemarks() {
        return dpoRemarks;
    }

    public void setDpoRemarks(String dpoRemarks) {
        this.dpoRemarks = dpoRemarks;
    }

    public String getDpoNameAddr() {
        return dpoNameAddr;
    }

    public void setDpoNameAddr(String dpoNameAddr) {
        this.dpoNameAddr = dpoNameAddr;
    }

    public String getDpoStation() {
        return dpoStation;
    }

    public void setDpoStation(String dpoStation) {
        this.dpoStation = dpoStation;
    }

    public String getDisposalNature() {
        return disposalNature;
    }

    public void setDisposalNature(String disposalNature) {
        this.disposalNature = disposalNature;
    }

    public Date getDisposalDate() {
        return disposalDate;
    }

    public void setDisposalDate(Date disposalDate) {
        this.disposalDate = disposalDate;
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
        hash += (ccNo != null ? ccNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocialInvestigation)) {
            return false;
        }
        SocialInvestigation other = (SocialInvestigation) object;
        if ((this.ccNo == null && other.ccNo != null) || (this.ccNo != null && !this.ccNo.equals(other.ccNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.SocialInvestigation[ ccNo=" + ccNo + " ]";
    }
    
}
