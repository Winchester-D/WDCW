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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "fir", catalog = "jjb_final", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fir.findAll", query = "SELECT f FROM Fir f"),
    @NamedQuery(name = "Fir.findByFirNo", query = "SELECT f FROM Fir f WHERE f.firPK.firNo = :firNo"),
    @NamedQuery(name = "Fir.findByPoliceStation", query = "SELECT f FROM Fir f WHERE f.firPK.policeStation = :policeStation"),
    @NamedQuery(name = "Fir.findByDistrict", query = "SELECT f FROM Fir f WHERE f.district = :district"),
    @NamedQuery(name = "Fir.findByFirDate", query = "SELECT f FROM Fir f WHERE f.firDate = :firDate"),
    @NamedQuery(name = "Fir.findByAct1", query = "SELECT f FROM Fir f WHERE f.act1 = :act1"),
    @NamedQuery(name = "Fir.findBySection1", query = "SELECT f FROM Fir f WHERE f.section1 = :section1"),
    @NamedQuery(name = "Fir.findByAct2", query = "SELECT f FROM Fir f WHERE f.act2 = :act2"),
    @NamedQuery(name = "Fir.findBySection2", query = "SELECT f FROM Fir f WHERE f.section2 = :section2"),
    @NamedQuery(name = "Fir.findByAct3", query = "SELECT f FROM Fir f WHERE f.act3 = :act3"),
    @NamedQuery(name = "Fir.findBySection3", query = "SELECT f FROM Fir f WHERE f.section3 = :section3"),
    @NamedQuery(name = "Fir.findByOtherActSec", query = "SELECT f FROM Fir f WHERE f.otherActSec = :otherActSec"),
    @NamedQuery(name = "Fir.findByOffenceDateTime", query = "SELECT f FROM Fir f WHERE f.offenceDateTime = :offenceDateTime"),
    @NamedQuery(name = "Fir.findByPsInfoRecDate", query = "SELECT f FROM Fir f WHERE f.psInfoRecDate = :psInfoRecDate"),
    @NamedQuery(name = "Fir.findByGenDairyRefEntryNo", query = "SELECT f FROM Fir f WHERE f.genDairyRefEntryNo = :genDairyRefEntryNo"),
    @NamedQuery(name = "Fir.findByGenDairyRefTime", query = "SELECT f FROM Fir f WHERE f.genDairyRefTime = :genDairyRefTime"),
    @NamedQuery(name = "Fir.findByTypeOfInfo", query = "SELECT f FROM Fir f WHERE f.typeOfInfo = :typeOfInfo"),
    @NamedQuery(name = "Fir.findByOffencePlacePsDist", query = "SELECT f FROM Fir f WHERE f.offencePlacePsDist = :offencePlacePsDist"),
    @NamedQuery(name = "Fir.findByOffencePlaceBeatNo", query = "SELECT f FROM Fir f WHERE f.offencePlaceBeatNo = :offencePlaceBeatNo"),
    @NamedQuery(name = "Fir.findByOutsideLimitPs", query = "SELECT f FROM Fir f WHERE f.outsideLimitPs = :outsideLimitPs"),
    @NamedQuery(name = "Fir.findByOutsideLimitPsDistrict", query = "SELECT f FROM Fir f WHERE f.outsideLimitPsDistrict = :outsideLimitPsDistrict"),
    @NamedQuery(name = "Fir.findByCName", query = "SELECT f FROM Fir f WHERE f.cName = :cName"),
    @NamedQuery(name = "Fir.findByCFatherName", query = "SELECT f FROM Fir f WHERE f.cFatherName = :cFatherName"),
    @NamedQuery(name = "Fir.findByCDob", query = "SELECT f FROM Fir f WHERE f.cDob = :cDob"),
    @NamedQuery(name = "Fir.findByCAge", query = "SELECT f FROM Fir f WHERE f.cAge = :cAge"),
    @NamedQuery(name = "Fir.findByCNationality", query = "SELECT f FROM Fir f WHERE f.cNationality = :cNationality"),
    @NamedQuery(name = "Fir.findByCPpNo", query = "SELECT f FROM Fir f WHERE f.cPpNo = :cPpNo"),
    @NamedQuery(name = "Fir.findByCPpDate", query = "SELECT f FROM Fir f WHERE f.cPpDate = :cPpDate"),
    @NamedQuery(name = "Fir.findByCPpIssuePlace", query = "SELECT f FROM Fir f WHERE f.cPpIssuePlace = :cPpIssuePlace"),
    @NamedQuery(name = "Fir.findByCOccu", query = "SELECT f FROM Fir f WHERE f.cOccu = :cOccu"),
    @NamedQuery(name = "Fir.findByInvoPropTotVal", query = "SELECT f FROM Fir f WHERE f.invoPropTotVal = :invoPropTotVal"),
    @NamedQuery(name = "Fir.findByUdCaseNo", query = "SELECT f FROM Fir f WHERE f.udCaseNo = :udCaseNo"),
    @NamedQuery(name = "Fir.findByIoName", query = "SELECT f FROM Fir f WHERE f.ioName = :ioName"),
    @NamedQuery(name = "Fir.findByIoRank", query = "SELECT f FROM Fir f WHERE f.ioRank = :ioRank"),
    @NamedQuery(name = "Fir.findByIoSjpu", query = "SELECT f FROM Fir f WHERE f.ioSjpu = :ioSjpu"),
    @NamedQuery(name = "Fir.findByTransferredPs", query = "SELECT f FROM Fir f WHERE f.transferredPs = :transferredPs"),
    @NamedQuery(name = "Fir.findByInchargeName", query = "SELECT f FROM Fir f WHERE f.inchargeName = :inchargeName"),
    @NamedQuery(name = "Fir.findByInchargeRank", query = "SELECT f FROM Fir f WHERE f.inchargeRank = :inchargeRank"),
    @NamedQuery(name = "Fir.findByInchargeNo", query = "SELECT f FROM Fir f WHERE f.inchargeNo = :inchargeNo"),
    @NamedQuery(name = "Fir.findByCourtDispachDateTime", query = "SELECT f FROM Fir f WHERE f.courtDispachDateTime = :courtDispachDateTime")})
public class Fir implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FirPK firPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DISTRICT")
    private String district;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FIR_DATE")
    @Temporal(TemporalType.DATE)
    private Date firDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ACT1")
    private String act1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "SECTION1")
    private String section1;
    @Size(max = 40)
    @Column(name = "ACT2")
    private String act2;
    @Size(max = 40)
    @Column(name = "SECTION2")
    private String section2;
    @Size(max = 40)
    @Column(name = "ACT3")
    private String act3;
    @Size(max = 40)
    @Column(name = "SECTION3")
    private String section3;
    @Size(max = 40)
    @Column(name = "OTHER_ACT_SEC")
    private String otherActSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OFFENCE_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offenceDateTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PS_INFO_REC_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date psInfoRecDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "GEN_DAIRY_REF_ENTRY_NO")
    private String genDairyRefEntryNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GEN_DAIRY_REF_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date genDairyRefTime;
    @Size(max = 40)
    @Column(name = "TYPE_OF_INFO")
    private String typeOfInfo;
    @Size(max = 40)
    @Column(name = "OFFENCE_PLACE_PS_DIST")
    private String offencePlacePsDist;
    @Size(max = 40)
    @Column(name = "OFFENCE_PLACE_BEAT_NO")
    private String offencePlaceBeatNo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "OFFENCE_PLACE_ADDRESS")
    private String offencePlaceAddress;
    @Size(max = 30)
    @Column(name = "OUTSIDE_LIMIT_PS")
    private String outsideLimitPs;
    @Size(max = 20)
    @Column(name = "OUTSIDE_LIMIT_PS_DISTRICT")
    private String outsideLimitPsDistrict;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "C_NAME")
    private String cName;
    @Size(max = 50)
    @Column(name = "C_FATHER_NAME")
    private String cFatherName;
    @Column(name = "C_DOB")
    @Temporal(TemporalType.DATE)
    private Date cDob;
    @Size(max = 5)
    @Column(name = "C_AGE")
    private String cAge;
    @Size(max = 30)
    @Column(name = "C_NATIONALITY")
    private String cNationality;
    @Size(max = 10)
    @Column(name = "C_PP_NO")
    private String cPpNo;
    @Column(name = "C_PP_DATE")
    @Temporal(TemporalType.DATE)
    private Date cPpDate;
    @Size(max = 30)
    @Column(name = "C_PP_ISSUE_PLACE")
    private String cPpIssuePlace;
    @Size(max = 30)
    @Column(name = "C_OCCU")
    private String cOccu;
    @Lob
    @Size(max = 65535)
    @Column(name = "C_ADDRESS")
    private String cAddress;
    @Lob
    @Size(max = 65535)
    @Column(name = "SUSPECT_DETAILS")
    private String suspectDetails;
    @Lob
    @Size(max = 65535)
    @Column(name = "C_REPO_DELAY_REA")
    private String cRepoDelayRea;
    @Lob
    @Size(max = 65535)
    @Column(name = "INVO_PROP_PATICU")
    private String invoPropPaticu;
    @Size(max = 50)
    @Column(name = "INVO_PROP_TOT_VAL")
    private String invoPropTotVal;
    @Size(max = 40)
    @Column(name = "UD_CASE_NO")
    private String udCaseNo;
    @Lob
    @Size(max = 65535)
    @Column(name = "FIR_CONTENTS")
    private String firContents;
    @Size(max = 50)
    @Column(name = "IO_NAME")
    private String ioName;
    @Size(max = 40)
    @Column(name = "IO_RANK")
    private String ioRank;
    @Size(max = 30)
    @Column(name = "IO_SJPU")
    private String ioSjpu;
    @Size(max = 30)
    @Column(name = "TRANSFERRED_PS")
    private String transferredPs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "INCHARGE_NAME")
    private String inchargeName;
    @Size(max = 40)
    @Column(name = "INCHARGE_RANK")
    private String inchargeRank;
    @Size(max = 30)
    @Column(name = "INCHARGE_NO")
    private String inchargeNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COURT_DISPACH_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date courtDispachDateTime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fir")
    private List<CourtSurrender> courtSurrenderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fir")
    private List<SocialInvestigationOrder> socialInvestigationOrderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fir")
    private List<RemandCaseDairy> remandCaseDairyList;

    public Fir() {
    }

    public Fir(FirPK firPK) {
        this.firPK = firPK;
    }

    public Fir(FirPK firPK, String district, Date firDate, String act1, String section1, Date offenceDateTime, Date psInfoRecDate, String genDairyRefEntryNo, Date genDairyRefTime, String offencePlaceAddress, String cName, String inchargeName, Date courtDispachDateTime) {
        this.firPK = firPK;
        this.district = district;
        this.firDate = firDate;
        this.act1 = act1;
        this.section1 = section1;
        this.offenceDateTime = offenceDateTime;
        this.psInfoRecDate = psInfoRecDate;
        this.genDairyRefEntryNo = genDairyRefEntryNo;
        this.genDairyRefTime = genDairyRefTime;
        this.offencePlaceAddress = offencePlaceAddress;
        this.cName = cName;
        this.inchargeName = inchargeName;
        this.courtDispachDateTime = courtDispachDateTime;
    }

    public Fir(String firNo, String policeStation) {
        this.firPK = new FirPK(firNo, policeStation);
    }

    public FirPK getFirPK() {
        return firPK;
    }

    public void setFirPK(FirPK firPK) {
        this.firPK = firPK;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Date getFirDate() {
        return firDate;
    }

    public void setFirDate(Date firDate) {
        this.firDate = firDate;
    }

    public String getAct1() {
        return act1;
    }

    public void setAct1(String act1) {
        this.act1 = act1;
    }

    public String getSection1() {
        return section1;
    }

    public void setSection1(String section1) {
        this.section1 = section1;
    }

    public String getAct2() {
        return act2;
    }

    public void setAct2(String act2) {
        this.act2 = act2;
    }

    public String getSection2() {
        return section2;
    }

    public void setSection2(String section2) {
        this.section2 = section2;
    }

    public String getAct3() {
        return act3;
    }

    public void setAct3(String act3) {
        this.act3 = act3;
    }

    public String getSection3() {
        return section3;
    }

    public void setSection3(String section3) {
        this.section3 = section3;
    }

    public String getOtherActSec() {
        return otherActSec;
    }

    public void setOtherActSec(String otherActSec) {
        this.otherActSec = otherActSec;
    }

    public Date getOffenceDateTime() {
        return offenceDateTime;
    }

    public void setOffenceDateTime(Date offenceDateTime) {
        this.offenceDateTime = offenceDateTime;
    }

    public Date getPsInfoRecDate() {
        return psInfoRecDate;
    }

    public void setPsInfoRecDate(Date psInfoRecDate) {
        this.psInfoRecDate = psInfoRecDate;
    }

    public String getGenDairyRefEntryNo() {
        return genDairyRefEntryNo;
    }

    public void setGenDairyRefEntryNo(String genDairyRefEntryNo) {
        this.genDairyRefEntryNo = genDairyRefEntryNo;
    }

    public Date getGenDairyRefTime() {
        return genDairyRefTime;
    }

    public void setGenDairyRefTime(Date genDairyRefTime) {
        this.genDairyRefTime = genDairyRefTime;
    }

    public String getTypeOfInfo() {
        return typeOfInfo;
    }

    public void setTypeOfInfo(String typeOfInfo) {
        this.typeOfInfo = typeOfInfo;
    }

    public String getOffencePlacePsDist() {
        return offencePlacePsDist;
    }

    public void setOffencePlacePsDist(String offencePlacePsDist) {
        this.offencePlacePsDist = offencePlacePsDist;
    }

    public String getOffencePlaceBeatNo() {
        return offencePlaceBeatNo;
    }

    public void setOffencePlaceBeatNo(String offencePlaceBeatNo) {
        this.offencePlaceBeatNo = offencePlaceBeatNo;
    }

    public String getOffencePlaceAddress() {
        return offencePlaceAddress;
    }

    public void setOffencePlaceAddress(String offencePlaceAddress) {
        this.offencePlaceAddress = offencePlaceAddress;
    }

    public String getOutsideLimitPs() {
        return outsideLimitPs;
    }

    public void setOutsideLimitPs(String outsideLimitPs) {
        this.outsideLimitPs = outsideLimitPs;
    }

    public String getOutsideLimitPsDistrict() {
        return outsideLimitPsDistrict;
    }

    public void setOutsideLimitPsDistrict(String outsideLimitPsDistrict) {
        this.outsideLimitPsDistrict = outsideLimitPsDistrict;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCFatherName() {
        return cFatherName;
    }

    public void setCFatherName(String cFatherName) {
        this.cFatherName = cFatherName;
    }

    public Date getCDob() {
        return cDob;
    }

    public void setCDob(Date cDob) {
        this.cDob = cDob;
    }

    public String getCAge() {
        return cAge;
    }

    public void setCAge(String cAge) {
        this.cAge = cAge;
    }

    public String getCNationality() {
        return cNationality;
    }

    public void setCNationality(String cNationality) {
        this.cNationality = cNationality;
    }

    public String getCPpNo() {
        return cPpNo;
    }

    public void setCPpNo(String cPpNo) {
        this.cPpNo = cPpNo;
    }

    public Date getCPpDate() {
        return cPpDate;
    }

    public void setCPpDate(Date cPpDate) {
        this.cPpDate = cPpDate;
    }

    public String getCPpIssuePlace() {
        return cPpIssuePlace;
    }

    public void setCPpIssuePlace(String cPpIssuePlace) {
        this.cPpIssuePlace = cPpIssuePlace;
    }

    public String getCOccu() {
        return cOccu;
    }

    public void setCOccu(String cOccu) {
        this.cOccu = cOccu;
    }

    public String getCAddress() {
        return cAddress;
    }

    public void setCAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getSuspectDetails() {
        return suspectDetails;
    }

    public void setSuspectDetails(String suspectDetails) {
        this.suspectDetails = suspectDetails;
    }

    public String getCRepoDelayRea() {
        return cRepoDelayRea;
    }

    public void setCRepoDelayRea(String cRepoDelayRea) {
        this.cRepoDelayRea = cRepoDelayRea;
    }

    public String getInvoPropPaticu() {
        return invoPropPaticu;
    }

    public void setInvoPropPaticu(String invoPropPaticu) {
        this.invoPropPaticu = invoPropPaticu;
    }

    public String getInvoPropTotVal() {
        return invoPropTotVal;
    }

    public void setInvoPropTotVal(String invoPropTotVal) {
        this.invoPropTotVal = invoPropTotVal;
    }

    public String getUdCaseNo() {
        return udCaseNo;
    }

    public void setUdCaseNo(String udCaseNo) {
        this.udCaseNo = udCaseNo;
    }

    public String getFirContents() {
        return firContents;
    }

    public void setFirContents(String firContents) {
        this.firContents = firContents;
    }

    public String getIoName() {
        return ioName;
    }

    public void setIoName(String ioName) {
        this.ioName = ioName;
    }

    public String getIoRank() {
        return ioRank;
    }

    public void setIoRank(String ioRank) {
        this.ioRank = ioRank;
    }

    public String getIoSjpu() {
        return ioSjpu;
    }

    public void setIoSjpu(String ioSjpu) {
        this.ioSjpu = ioSjpu;
    }

    public String getTransferredPs() {
        return transferredPs;
    }

    public void setTransferredPs(String transferredPs) {
        this.transferredPs = transferredPs;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }

    public String getInchargeRank() {
        return inchargeRank;
    }

    public void setInchargeRank(String inchargeRank) {
        this.inchargeRank = inchargeRank;
    }

    public String getInchargeNo() {
        return inchargeNo;
    }

    public void setInchargeNo(String inchargeNo) {
        this.inchargeNo = inchargeNo;
    }

    public Date getCourtDispachDateTime() {
        return courtDispachDateTime;
    }

    public void setCourtDispachDateTime(Date courtDispachDateTime) {
        this.courtDispachDateTime = courtDispachDateTime;
    }

    public List<CourtSurrender> getCourtSurrenderList() {
        return courtSurrenderList;
    }

    public void setCourtSurrenderList(List<CourtSurrender> courtSurrenderList) {
        this.courtSurrenderList = courtSurrenderList;
    }

    public List<SocialInvestigationOrder> getSocialInvestigationOrderList() {
        return socialInvestigationOrderList;
    }

    public void setSocialInvestigationOrderList(List<SocialInvestigationOrder> socialInvestigationOrderList) {
        this.socialInvestigationOrderList = socialInvestigationOrderList;
    }

    public List<RemandCaseDairy> getRemandCaseDairyList() {
        return remandCaseDairyList;
    }

    public void setRemandCaseDairyList(List<RemandCaseDairy> remandCaseDairyList) {
        this.remandCaseDairyList = remandCaseDairyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (firPK != null ? firPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fir)) {
            return false;
        }
        Fir other = (Fir) object;
        if ((this.firPK == null && other.firPK != null) || (this.firPK != null && !this.firPK.equals(other.firPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.Fir[ firPK=" + firPK + " ]";
    }
    
}
