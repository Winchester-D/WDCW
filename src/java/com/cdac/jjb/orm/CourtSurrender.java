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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "court_surrender", catalog = "jjb_final", schema = "")
@NamedQueries({
    @NamedQuery(name = "CourtSurrender.findAll", query = "SELECT c FROM CourtSurrender c"),
    @NamedQuery(name = "CourtSurrender.findByAccusedId", query = "SELECT c FROM CourtSurrender c WHERE c.accusedId = :accusedId"),
    @NamedQuery(name = "CourtSurrender.findByProceedingGdNo", query = "SELECT c FROM CourtSurrender c WHERE c.proceedingGdNo = :proceedingGdNo"),
    @NamedQuery(name = "CourtSurrender.findByAcodeAccu", query = "SELECT c FROM CourtSurrender c WHERE c.acodeAccu = :acodeAccu"),
    @NamedQuery(name = "CourtSurrender.findByAccuArrestDate", query = "SELECT c FROM CourtSurrender c WHERE c.accuArrestDate = :accuArrestDate"),
    @NamedQuery(name = "CourtSurrender.findByAccuArrestPs", query = "SELECT c FROM CourtSurrender c WHERE c.accuArrestPs = :accuArrestPs"),
    @NamedQuery(name = "CourtSurrender.findByAccuArrestDistrict", query = "SELECT c FROM CourtSurrender c WHERE c.accuArrestDistrict = :accuArrestDistrict"),
    @NamedQuery(name = "CourtSurrender.findByAccuSurrenderCourt", query = "SELECT c FROM CourtSurrender c WHERE c.accuSurrenderCourt = :accuSurrenderCourt"),
    @NamedQuery(name = "CourtSurrender.findByAccuActsSec", query = "SELECT c FROM CourtSurrender c WHERE c.accuActsSec = :accuActsSec"),
    @NamedQuery(name = "CourtSurrender.findByAccuArrestType", query = "SELECT c FROM CourtSurrender c WHERE c.accuArrestType = :accuArrestType"),
    @NamedQuery(name = "CourtSurrender.findByAccuName", query = "SELECT c FROM CourtSurrender c WHERE c.accuName = :accuName"),
    @NamedQuery(name = "CourtSurrender.findByAccuFatherName", query = "SELECT c FROM CourtSurrender c WHERE c.accuFatherName = :accuFatherName"),
    @NamedQuery(name = "CourtSurrender.findByAccuFirstAlias", query = "SELECT c FROM CourtSurrender c WHERE c.accuFirstAlias = :accuFirstAlias"),
    @NamedQuery(name = "CourtSurrender.findByAccuSecAlias", query = "SELECT c FROM CourtSurrender c WHERE c.accuSecAlias = :accuSecAlias"),
    @NamedQuery(name = "CourtSurrender.findByAccuNationality", query = "SELECT c FROM CourtSurrender c WHERE c.accuNationality = :accuNationality"),
    @NamedQuery(name = "CourtSurrender.findByAccuVoterIdNo", query = "SELECT c FROM CourtSurrender c WHERE c.accuVoterIdNo = :accuVoterIdNo"),
    @NamedQuery(name = "CourtSurrender.findByAccuPpNo", query = "SELECT c FROM CourtSurrender c WHERE c.accuPpNo = :accuPpNo"),
    @NamedQuery(name = "CourtSurrender.findByAccuPpIssuDate", query = "SELECT c FROM CourtSurrender c WHERE c.accuPpIssuDate = :accuPpIssuDate"),
    @NamedQuery(name = "CourtSurrender.findByAccuPpIssuPlace", query = "SELECT c FROM CourtSurrender c WHERE c.accuPpIssuPlace = :accuPpIssuPlace"),
    @NamedQuery(name = "CourtSurrender.findByAccuReligion", query = "SELECT c FROM CourtSurrender c WHERE c.accuReligion = :accuReligion"),
    @NamedQuery(name = "CourtSurrender.findByAccuCaste", query = "SELECT c FROM CourtSurrender c WHERE c.accuCaste = :accuCaste"),
    @NamedQuery(name = "CourtSurrender.findByAccuCasteType", query = "SELECT c FROM CourtSurrender c WHERE c.accuCasteType = :accuCasteType"),
    @NamedQuery(name = "CourtSurrender.findByAccuOccu", query = "SELECT c FROM CourtSurrender c WHERE c.accuOccu = :accuOccu"),
    @NamedQuery(name = "CourtSurrender.findByAccuDistrict", query = "SELECT c FROM CourtSurrender c WHERE c.accuDistrict = :accuDistrict"),
    @NamedQuery(name = "CourtSurrender.findByAccuPs", query = "SELECT c FROM CourtSurrender c WHERE c.accuPs = :accuPs"),
    @NamedQuery(name = "CourtSurrender.findByAccuPresentAddrPs", query = "SELECT c FROM CourtSurrender c WHERE c.accuPresentAddrPs = :accuPresentAddrPs"),
    @NamedQuery(name = "CourtSurrender.findByAccuCustodyDateTime", query = "SELECT c FROM CourtSurrender c WHERE c.accuCustodyDateTime = :accuCustodyDateTime"),
    @NamedQuery(name = "CourtSurrender.findByAccuCustodyPlace", query = "SELECT c FROM CourtSurrender c WHERE c.accuCustodyPlace = :accuCustodyPlace"),
    @NamedQuery(name = "CourtSurrender.findByAccuSearchArticle1", query = "SELECT c FROM CourtSurrender c WHERE c.accuSearchArticle1 = :accuSearchArticle1"),
    @NamedQuery(name = "CourtSurrender.findByAccuSearchArticle2", query = "SELECT c FROM CourtSurrender c WHERE c.accuSearchArticle2 = :accuSearchArticle2"),
    @NamedQuery(name = "CourtSurrender.findByAccuIntimationName", query = "SELECT c FROM CourtSurrender c WHERE c.accuIntimationName = :accuIntimationName"),
    @NamedQuery(name = "CourtSurrender.findByAccuIntimationRelation", query = "SELECT c FROM CourtSurrender c WHERE c.accuIntimationRelation = :accuIntimationRelation"),
    @NamedQuery(name = "CourtSurrender.findByAccuIntimationDateTime", query = "SELECT c FROM CourtSurrender c WHERE c.accuIntimationDateTime = :accuIntimationDateTime"),
    @NamedQuery(name = "CourtSurrender.findByAccuGender", query = "SELECT c FROM CourtSurrender c WHERE c.accuGender = :accuGender"),
    @NamedQuery(name = "CourtSurrender.findByAccuAge", query = "SELECT c FROM CourtSurrender c WHERE c.accuAge = :accuAge"),
    @NamedQuery(name = "CourtSurrender.findByAccuBuild", query = "SELECT c FROM CourtSurrender c WHERE c.accuBuild = :accuBuild"),
    @NamedQuery(name = "CourtSurrender.findByAccuHeight", query = "SELECT c FROM CourtSurrender c WHERE c.accuHeight = :accuHeight"),
    @NamedQuery(name = "CourtSurrender.findByAccuComplexion", query = "SELECT c FROM CourtSurrender c WHERE c.accuComplexion = :accuComplexion"),
    @NamedQuery(name = "CourtSurrender.findByAccuDeformities", query = "SELECT c FROM CourtSurrender c WHERE c.accuDeformities = :accuDeformities"),
    @NamedQuery(name = "CourtSurrender.findByAccuTeeth", query = "SELECT c FROM CourtSurrender c WHERE c.accuTeeth = :accuTeeth"),
    @NamedQuery(name = "CourtSurrender.findByAccuHair", query = "SELECT c FROM CourtSurrender c WHERE c.accuHair = :accuHair"),
    @NamedQuery(name = "CourtSurrender.findByAccuEyes", query = "SELECT c FROM CourtSurrender c WHERE c.accuEyes = :accuEyes"),
    @NamedQuery(name = "CourtSurrender.findByAccuHabits", query = "SELECT c FROM CourtSurrender c WHERE c.accuHabits = :accuHabits"),
    @NamedQuery(name = "CourtSurrender.findByAccuDressHabits", query = "SELECT c FROM CourtSurrender c WHERE c.accuDressHabits = :accuDressHabits"),
    @NamedQuery(name = "CourtSurrender.findByAccuLanguage", query = "SELECT c FROM CourtSurrender c WHERE c.accuLanguage = :accuLanguage"),
    @NamedQuery(name = "CourtSurrender.findByAccuBurnMark", query = "SELECT c FROM CourtSurrender c WHERE c.accuBurnMark = :accuBurnMark"),
    @NamedQuery(name = "CourtSurrender.findByAccuLeucoderma", query = "SELECT c FROM CourtSurrender c WHERE c.accuLeucoderma = :accuLeucoderma"),
    @NamedQuery(name = "CourtSurrender.findByAccuMole", query = "SELECT c FROM CourtSurrender c WHERE c.accuMole = :accuMole"),
    @NamedQuery(name = "CourtSurrender.findByAccuSear", query = "SELECT c FROM CourtSurrender c WHERE c.accuSear = :accuSear"),
    @NamedQuery(name = "CourtSurrender.findByAccuTatoo", query = "SELECT c FROM CourtSurrender c WHERE c.accuTatoo = :accuTatoo"),
    @NamedQuery(name = "CourtSurrender.findByAccuFpTaken", query = "SELECT c FROM CourtSurrender c WHERE c.accuFpTaken = :accuFpTaken"),
    @NamedQuery(name = "CourtSurrender.findByAccuLivingStat", query = "SELECT c FROM CourtSurrender c WHERE c.accuLivingStat = :accuLivingStat"),
    @NamedQuery(name = "CourtSurrender.findByAccuEduQua", query = "SELECT c FROM CourtSurrender c WHERE c.accuEduQua = :accuEduQua"),
    @NamedQuery(name = "CourtSurrender.findByAccuRealOccu", query = "SELECT c FROM CourtSurrender c WHERE c.accuRealOccu = :accuRealOccu"),
    @NamedQuery(name = "CourtSurrender.findByAccuIncomeGroup", query = "SELECT c FROM CourtSurrender c WHERE c.accuIncomeGroup = :accuIncomeGroup"),
    @NamedQuery(name = "CourtSurrender.findByAccuDangerous", query = "SELECT c FROM CourtSurrender c WHERE c.accuDangerous = :accuDangerous"),
    @NamedQuery(name = "CourtSurrender.findByAccuPrevJumpedBail", query = "SELECT c FROM CourtSurrender c WHERE c.accuPrevJumpedBail = :accuPrevJumpedBail"),
    @NamedQuery(name = "CourtSurrender.findByAccuGenArmed", query = "SELECT c FROM CourtSurrender c WHERE c.accuGenArmed = :accuGenArmed"),
    @NamedQuery(name = "CourtSurrender.findByAccuAccomplices", query = "SELECT c FROM CourtSurrender c WHERE c.accuAccomplices = :accuAccomplices"),
    @NamedQuery(name = "CourtSurrender.findByAccuKnownCri", query = "SELECT c FROM CourtSurrender c WHERE c.accuKnownCri = :accuKnownCri"),
    @NamedQuery(name = "CourtSurrender.findByAccuRecividist", query = "SELECT c FROM CourtSurrender c WHERE c.accuRecividist = :accuRecividist"),
    @NamedQuery(name = "CourtSurrender.findByAccuLikelyJumpBail", query = "SELECT c FROM CourtSurrender c WHERE c.accuLikelyJumpBail = :accuLikelyJumpBail"),
    @NamedQuery(name = "CourtSurrender.findByAccuLikelyThreaten", query = "SELECT c FROM CourtSurrender c WHERE c.accuLikelyThreaten = :accuLikelyThreaten"),
    @NamedQuery(name = "CourtSurrender.findByAccuWantedOtherCase", query = "SELECT c FROM CourtSurrender c WHERE c.accuWantedOtherCase = :accuWantedOtherCase"),
    @NamedQuery(name = "CourtSurrender.findByIoName", query = "SELECT c FROM CourtSurrender c WHERE c.ioName = :ioName"),
    @NamedQuery(name = "CourtSurrender.findByIoRank", query = "SELECT c FROM CourtSurrender c WHERE c.ioRank = :ioRank"),
    @NamedQuery(name = "CourtSurrender.findByCourtSurrPlace", query = "SELECT c FROM CourtSurrender c WHERE c.courtSurrPlace = :courtSurrPlace"),
    @NamedQuery(name = "CourtSurrender.findByCourtSurrDate", query = "SELECT c FROM CourtSurrender c WHERE c.courtSurrDate = :courtSurrDate"),
    @NamedQuery(name = "CourtSurrender.findByParentIntimationSent", query = "SELECT c FROM CourtSurrender c WHERE c.parentIntimationSent = :parentIntimationSent"),
    @NamedQuery(name = "CourtSurrender.findByAccuJjbPlace", query = "SELECT c FROM CourtSurrender c WHERE c.accuJjbPlace = :accuJjbPlace"),
    @NamedQuery(name = "CourtSurrender.findByAccuJjbDate", query = "SELECT c FROM CourtSurrender c WHERE c.accuJjbDate = :accuJjbDate")})
public class CourtSurrender implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCUSED_ID")
    private Integer accusedId;
    @Size(max = 30)
    @Column(name = "PROCEEDING_GD_NO")
    private String proceedingGdNo;
    @Size(max = 10)
    @Column(name = "ACODE_ACCU")
    private String acodeAccu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCU_ARREST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accuArrestDate;
    @Size(max = 30)
    @Column(name = "ACCU_ARREST_PS")
    private String accuArrestPs;
    @Size(max = 30)
    @Column(name = "ACCU_ARREST_DISTRICT")
    private String accuArrestDistrict;
    @Size(max = 30)
    @Column(name = "ACCU_SURRENDER_COURT")
    private String accuSurrenderCourt;
    @Size(max = 50)
    @Column(name = "ACCU_ACTS_SEC")
    private String accuActsSec;
    @Size(max = 50)
    @Column(name = "ACCU_ARREST_TYPE")
    private String accuArrestType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ACCU_NAME")
    private String accuName;
    @Size(max = 50)
    @Column(name = "ACCU_FATHER_NAME")
    private String accuFatherName;
    @Size(max = 50)
    @Column(name = "ACCU_FIRST_ALIAS")
    private String accuFirstAlias;
    @Size(max = 50)
    @Column(name = "ACCU_SEC_ALIAS")
    private String accuSecAlias;
    @Size(max = 30)
    @Column(name = "ACCU_NATIONALITY")
    private String accuNationality;
    @Size(max = 30)
    @Column(name = "ACCU_VOTER_ID_NO")
    private String accuVoterIdNo;
    @Size(max = 20)
    @Column(name = "ACCU_PP_NO")
    private String accuPpNo;
    @Column(name = "ACCU_PP_ISSU_DATE")
    @Temporal(TemporalType.DATE)
    private Date accuPpIssuDate;
    @Size(max = 30)
    @Column(name = "ACCU_PP_ISSU_PLACE")
    private String accuPpIssuPlace;
    @Size(max = 30)
    @Column(name = "ACCU_RELIGION")
    private String accuReligion;
    @Size(max = 30)
    @Column(name = "ACCU_CASTE")
    private String accuCaste;
    @Size(max = 30)
    @Column(name = "ACCU_CASTE_TYPE")
    private String accuCasteType;
    @Size(max = 30)
    @Column(name = "ACCU_OCCU")
    private String accuOccu;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_ADDRESS")
    private String accuAddress;
    @Size(max = 30)
    @Column(name = "ACCU_DISTRICT")
    private String accuDistrict;
    @Size(max = 30)
    @Column(name = "ACCU_PS")
    private String accuPs;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_PRESENT_ADDR")
    private String accuPresentAddr;
    @Size(max = 30)
    @Column(name = "ACCU_PRESENT_ADDR_PS")
    private String accuPresentAddrPs;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_INJURIES")
    private String accuInjuries;
    @Column(name = "ACCU_CUSTODY_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accuCustodyDateTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ACCU_CUSTODY_PLACE")
    private String accuCustodyPlace;
    @Size(max = 100)
    @Column(name = "ACCU_SEARCH_ARTICLE1")
    private String accuSearchArticle1;
    @Size(max = 100)
    @Column(name = "ACCU_SEARCH_ARTICLE2")
    private String accuSearchArticle2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ACCU_INTIMATION_NAME")
    private String accuIntimationName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ACCU_INTIMATION_RELATION")
    private String accuIntimationRelation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCU_INTIMATION_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accuIntimationDateTime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ACCU_GENDER")
    private String accuGender;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACCU_AGE")
    private int accuAge;
    @Size(max = 30)
    @Column(name = "ACCU_BUILD")
    private String accuBuild;
    @Size(max = 20)
    @Column(name = "ACCU_HEIGHT")
    private String accuHeight;
    @Size(max = 20)
    @Column(name = "ACCU_COMPLEXION")
    private String accuComplexion;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_IDENT_MARKS")
    private String accuIdentMarks;
    @Size(max = 40)
    @Column(name = "ACCU_DEFORMITIES")
    private String accuDeformities;
    @Size(max = 30)
    @Column(name = "ACCU_TEETH")
    private String accuTeeth;
    @Size(max = 30)
    @Column(name = "ACCU_HAIR")
    private String accuHair;
    @Size(max = 30)
    @Column(name = "ACCU_EYES")
    private String accuEyes;
    @Size(max = 100)
    @Column(name = "ACCU_HABITS")
    private String accuHabits;
    @Size(max = 40)
    @Column(name = "ACCU_DRESS_HABITS")
    private String accuDressHabits;
    @Size(max = 40)
    @Column(name = "ACCU_LANGUAGE")
    private String accuLanguage;
    @Size(max = 40)
    @Column(name = "ACCU_BURN_MARK")
    private String accuBurnMark;
    @Size(max = 30)
    @Column(name = "ACCU_LEUCODERMA")
    private String accuLeucoderma;
    @Size(max = 40)
    @Column(name = "ACCU_MOLE")
    private String accuMole;
    @Size(max = 30)
    @Column(name = "ACCU_SEAR")
    private String accuSear;
    @Size(max = 50)
    @Column(name = "ACCU_TATOO")
    private String accuTatoo;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_OTHER_FEATURES")
    private String accuOtherFeatures;
    @Size(max = 5)
    @Column(name = "ACCU_FP_TAKEN")
    private String accuFpTaken;
    @Column(name = "ACCU_LIVING_STAT")
    private Integer accuLivingStat;
    @Size(max = 50)
    @Column(name = "ACCU_EDU_QUA")
    private String accuEduQua;
    @Size(max = 50)
    @Column(name = "ACCU_REAL_OCCU")
    private String accuRealOccu;
    @Column(name = "ACCU_INCOME_GROUP")
    private Integer accuIncomeGroup;
    @Size(max = 5)
    @Column(name = "ACCU_DANGEROUS")
    private String accuDangerous;
    @Size(max = 5)
    @Column(name = "ACCU_PREV_JUMPED_BAIL")
    private String accuPrevJumpedBail;
    @Size(max = 5)
    @Column(name = "ACCU_GEN_ARMED")
    private String accuGenArmed;
    @Size(max = 5)
    @Column(name = "ACCU_ACCOMPLICES")
    private String accuAccomplices;
    @Size(max = 5)
    @Column(name = "ACCU_KNOWN_CRI")
    private String accuKnownCri;
    @Size(max = 5)
    @Column(name = "ACCU_RECIVIDIST")
    private String accuRecividist;
    @Size(max = 5)
    @Column(name = "ACCU_LIKELY_JUMP_BAIL")
    private String accuLikelyJumpBail;
    @Size(max = 5)
    @Column(name = "ACCU_LIKELY_THREATEN")
    private String accuLikelyThreaten;
    @Size(max = 5)
    @Column(name = "ACCU_WANTED_OTHER_CASE")
    private String accuWantedOtherCase;
    @Lob
    @Size(max = 65535)
    @Column(name = "NAME_ADDR_WITNESS1")
    private String nameAddrWitness1;
    @Lob
    @Size(max = 65535)
    @Column(name = "NAME_ADD_WITNESS2")
    private String nameAddWitness2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IO_NAME")
    private String ioName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "IO_RANK")
    private String ioRank;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "COURT_SURR_PLACE")
    private String courtSurrPlace;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COURT_SURR_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date courtSurrDate;
    @Size(max = 5)
    @Column(name = "PARENT_INTIMATION_SENT")
    private String parentIntimationSent;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_PLACED_INST")
    private String accuPlacedInst;
    @Size(max = 40)
    @Column(name = "ACCU_JJB_PLACE")
    private String accuJjbPlace;
    @Column(name = "ACCU_JJB_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accuJjbDate;
    @Lob
    @Size(max = 65535)
    @Column(name = "ACCU_CHARGE_REASON")
    private String accuChargeReason;
    @JoinColumns({
        @JoinColumn(name = "FIR_NO", referencedColumnName = "FIR_NO"),
        @JoinColumn(name = "POLICE_STATION", referencedColumnName = "POLICE_STATION")})
    @ManyToOne(optional = false)
    private Fir fir;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accusedId")
    private List<SocialInvestigationOrder> socialInvestigationOrderList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accusedId")
    private List<RemandCaseDairy> remandCaseDairyList;

    public CourtSurrender() {
    }

    public CourtSurrender(Integer accusedId) {
        this.accusedId = accusedId;
    }

    public CourtSurrender(Integer accusedId, Date accuArrestDate, String accuName, String accuCustodyPlace, String accuIntimationName, String accuIntimationRelation, Date accuIntimationDateTime, String accuGender, int accuAge, String ioName, String ioRank, String courtSurrPlace, Date courtSurrDate) {
        this.accusedId = accusedId;
        this.accuArrestDate = accuArrestDate;
        this.accuName = accuName;
        this.accuCustodyPlace = accuCustodyPlace;
        this.accuIntimationName = accuIntimationName;
        this.accuIntimationRelation = accuIntimationRelation;
        this.accuIntimationDateTime = accuIntimationDateTime;
        this.accuGender = accuGender;
        this.accuAge = accuAge;
        this.ioName = ioName;
        this.ioRank = ioRank;
        this.courtSurrPlace = courtSurrPlace;
        this.courtSurrDate = courtSurrDate;
    }

    public Integer getAccusedId() {
        return accusedId;
    }

    public void setAccusedId(Integer accusedId) {
        this.accusedId = accusedId;
    }

    public String getProceedingGdNo() {
        return proceedingGdNo;
    }

    public void setProceedingGdNo(String proceedingGdNo) {
        this.proceedingGdNo = proceedingGdNo;
    }

    public String getAcodeAccu() {
        return acodeAccu;
    }

    public void setAcodeAccu(String acodeAccu) {
        this.acodeAccu = acodeAccu;
    }

    public Date getAccuArrestDate() {
        return accuArrestDate;
    }

    public void setAccuArrestDate(Date accuArrestDate) {
        this.accuArrestDate = accuArrestDate;
    }

    public String getAccuArrestPs() {
        return accuArrestPs;
    }

    public void setAccuArrestPs(String accuArrestPs) {
        this.accuArrestPs = accuArrestPs;
    }

    public String getAccuArrestDistrict() {
        return accuArrestDistrict;
    }

    public void setAccuArrestDistrict(String accuArrestDistrict) {
        this.accuArrestDistrict = accuArrestDistrict;
    }

    public String getAccuSurrenderCourt() {
        return accuSurrenderCourt;
    }

    public void setAccuSurrenderCourt(String accuSurrenderCourt) {
        this.accuSurrenderCourt = accuSurrenderCourt;
    }

    public String getAccuActsSec() {
        return accuActsSec;
    }

    public void setAccuActsSec(String accuActsSec) {
        this.accuActsSec = accuActsSec;
    }

    public String getAccuArrestType() {
        return accuArrestType;
    }

    public void setAccuArrestType(String accuArrestType) {
        this.accuArrestType = accuArrestType;
    }

    public String getAccuName() {
        return accuName;
    }

    public void setAccuName(String accuName) {
        this.accuName = accuName;
    }

    public String getAccuFatherName() {
        return accuFatherName;
    }

    public void setAccuFatherName(String accuFatherName) {
        this.accuFatherName = accuFatherName;
    }

    public String getAccuFirstAlias() {
        return accuFirstAlias;
    }

    public void setAccuFirstAlias(String accuFirstAlias) {
        this.accuFirstAlias = accuFirstAlias;
    }

    public String getAccuSecAlias() {
        return accuSecAlias;
    }

    public void setAccuSecAlias(String accuSecAlias) {
        this.accuSecAlias = accuSecAlias;
    }

    public String getAccuNationality() {
        return accuNationality;
    }

    public void setAccuNationality(String accuNationality) {
        this.accuNationality = accuNationality;
    }

    public String getAccuVoterIdNo() {
        return accuVoterIdNo;
    }

    public void setAccuVoterIdNo(String accuVoterIdNo) {
        this.accuVoterIdNo = accuVoterIdNo;
    }

    public String getAccuPpNo() {
        return accuPpNo;
    }

    public void setAccuPpNo(String accuPpNo) {
        this.accuPpNo = accuPpNo;
    }

    public Date getAccuPpIssuDate() {
        return accuPpIssuDate;
    }

    public void setAccuPpIssuDate(Date accuPpIssuDate) {
        this.accuPpIssuDate = accuPpIssuDate;
    }

    public String getAccuPpIssuPlace() {
        return accuPpIssuPlace;
    }

    public void setAccuPpIssuPlace(String accuPpIssuPlace) {
        this.accuPpIssuPlace = accuPpIssuPlace;
    }

    public String getAccuReligion() {
        return accuReligion;
    }

    public void setAccuReligion(String accuReligion) {
        this.accuReligion = accuReligion;
    }

    public String getAccuCaste() {
        return accuCaste;
    }

    public void setAccuCaste(String accuCaste) {
        this.accuCaste = accuCaste;
    }

    public String getAccuCasteType() {
        return accuCasteType;
    }

    public void setAccuCasteType(String accuCasteType) {
        this.accuCasteType = accuCasteType;
    }

    public String getAccuOccu() {
        return accuOccu;
    }

    public void setAccuOccu(String accuOccu) {
        this.accuOccu = accuOccu;
    }

    public String getAccuAddress() {
        return accuAddress;
    }

    public void setAccuAddress(String accuAddress) {
        this.accuAddress = accuAddress;
    }

    public String getAccuDistrict() {
        return accuDistrict;
    }

    public void setAccuDistrict(String accuDistrict) {
        this.accuDistrict = accuDistrict;
    }

    public String getAccuPs() {
        return accuPs;
    }

    public void setAccuPs(String accuPs) {
        this.accuPs = accuPs;
    }

    public String getAccuPresentAddr() {
        return accuPresentAddr;
    }

    public void setAccuPresentAddr(String accuPresentAddr) {
        this.accuPresentAddr = accuPresentAddr;
    }

    public String getAccuPresentAddrPs() {
        return accuPresentAddrPs;
    }

    public void setAccuPresentAddrPs(String accuPresentAddrPs) {
        this.accuPresentAddrPs = accuPresentAddrPs;
    }

    public String getAccuInjuries() {
        return accuInjuries;
    }

    public void setAccuInjuries(String accuInjuries) {
        this.accuInjuries = accuInjuries;
    }

    public Date getAccuCustodyDateTime() {
        return accuCustodyDateTime;
    }

    public void setAccuCustodyDateTime(Date accuCustodyDateTime) {
        this.accuCustodyDateTime = accuCustodyDateTime;
    }

    public String getAccuCustodyPlace() {
        return accuCustodyPlace;
    }

    public void setAccuCustodyPlace(String accuCustodyPlace) {
        this.accuCustodyPlace = accuCustodyPlace;
    }

    public String getAccuSearchArticle1() {
        return accuSearchArticle1;
    }

    public void setAccuSearchArticle1(String accuSearchArticle1) {
        this.accuSearchArticle1 = accuSearchArticle1;
    }

    public String getAccuSearchArticle2() {
        return accuSearchArticle2;
    }

    public void setAccuSearchArticle2(String accuSearchArticle2) {
        this.accuSearchArticle2 = accuSearchArticle2;
    }

    public String getAccuIntimationName() {
        return accuIntimationName;
    }

    public void setAccuIntimationName(String accuIntimationName) {
        this.accuIntimationName = accuIntimationName;
    }

    public String getAccuIntimationRelation() {
        return accuIntimationRelation;
    }

    public void setAccuIntimationRelation(String accuIntimationRelation) {
        this.accuIntimationRelation = accuIntimationRelation;
    }

    public Date getAccuIntimationDateTime() {
        return accuIntimationDateTime;
    }

    public void setAccuIntimationDateTime(Date accuIntimationDateTime) {
        this.accuIntimationDateTime = accuIntimationDateTime;
    }

    public String getAccuGender() {
        return accuGender;
    }

    public void setAccuGender(String accuGender) {
        this.accuGender = accuGender;
    }

    public int getAccuAge() {
        return accuAge;
    }

    public void setAccuAge(int accuAge) {
        this.accuAge = accuAge;
    }

    public String getAccuBuild() {
        return accuBuild;
    }

    public void setAccuBuild(String accuBuild) {
        this.accuBuild = accuBuild;
    }

    public String getAccuHeight() {
        return accuHeight;
    }

    public void setAccuHeight(String accuHeight) {
        this.accuHeight = accuHeight;
    }

    public String getAccuComplexion() {
        return accuComplexion;
    }

    public void setAccuComplexion(String accuComplexion) {
        this.accuComplexion = accuComplexion;
    }

    public String getAccuIdentMarks() {
        return accuIdentMarks;
    }

    public void setAccuIdentMarks(String accuIdentMarks) {
        this.accuIdentMarks = accuIdentMarks;
    }

    public String getAccuDeformities() {
        return accuDeformities;
    }

    public void setAccuDeformities(String accuDeformities) {
        this.accuDeformities = accuDeformities;
    }

    public String getAccuTeeth() {
        return accuTeeth;
    }

    public void setAccuTeeth(String accuTeeth) {
        this.accuTeeth = accuTeeth;
    }

    public String getAccuHair() {
        return accuHair;
    }

    public void setAccuHair(String accuHair) {
        this.accuHair = accuHair;
    }

    public String getAccuEyes() {
        return accuEyes;
    }

    public void setAccuEyes(String accuEyes) {
        this.accuEyes = accuEyes;
    }

    public String getAccuHabits() {
        return accuHabits;
    }

    public void setAccuHabits(String accuHabits) {
        this.accuHabits = accuHabits;
    }

    public String getAccuDressHabits() {
        return accuDressHabits;
    }

    public void setAccuDressHabits(String accuDressHabits) {
        this.accuDressHabits = accuDressHabits;
    }

    public String getAccuLanguage() {
        return accuLanguage;
    }

    public void setAccuLanguage(String accuLanguage) {
        this.accuLanguage = accuLanguage;
    }

    public String getAccuBurnMark() {
        return accuBurnMark;
    }

    public void setAccuBurnMark(String accuBurnMark) {
        this.accuBurnMark = accuBurnMark;
    }

    public String getAccuLeucoderma() {
        return accuLeucoderma;
    }

    public void setAccuLeucoderma(String accuLeucoderma) {
        this.accuLeucoderma = accuLeucoderma;
    }

    public String getAccuMole() {
        return accuMole;
    }

    public void setAccuMole(String accuMole) {
        this.accuMole = accuMole;
    }

    public String getAccuSear() {
        return accuSear;
    }

    public void setAccuSear(String accuSear) {
        this.accuSear = accuSear;
    }

    public String getAccuTatoo() {
        return accuTatoo;
    }

    public void setAccuTatoo(String accuTatoo) {
        this.accuTatoo = accuTatoo;
    }

    public String getAccuOtherFeatures() {
        return accuOtherFeatures;
    }

    public void setAccuOtherFeatures(String accuOtherFeatures) {
        this.accuOtherFeatures = accuOtherFeatures;
    }

    public String getAccuFpTaken() {
        return accuFpTaken;
    }

    public void setAccuFpTaken(String accuFpTaken) {
        this.accuFpTaken = accuFpTaken;
    }

    public Integer getAccuLivingStat() {
        return accuLivingStat;
    }

    public void setAccuLivingStat(Integer accuLivingStat) {
        this.accuLivingStat = accuLivingStat;
    }

    public String getAccuEduQua() {
        return accuEduQua;
    }

    public void setAccuEduQua(String accuEduQua) {
        this.accuEduQua = accuEduQua;
    }

    public String getAccuRealOccu() {
        return accuRealOccu;
    }

    public void setAccuRealOccu(String accuRealOccu) {
        this.accuRealOccu = accuRealOccu;
    }

    public Integer getAccuIncomeGroup() {
        return accuIncomeGroup;
    }

    public void setAccuIncomeGroup(Integer accuIncomeGroup) {
        this.accuIncomeGroup = accuIncomeGroup;
    }

    public String getAccuDangerous() {
        return accuDangerous;
    }

    public void setAccuDangerous(String accuDangerous) {
        this.accuDangerous = accuDangerous;
    }

    public String getAccuPrevJumpedBail() {
        return accuPrevJumpedBail;
    }

    public void setAccuPrevJumpedBail(String accuPrevJumpedBail) {
        this.accuPrevJumpedBail = accuPrevJumpedBail;
    }

    public String getAccuGenArmed() {
        return accuGenArmed;
    }

    public void setAccuGenArmed(String accuGenArmed) {
        this.accuGenArmed = accuGenArmed;
    }

    public String getAccuAccomplices() {
        return accuAccomplices;
    }

    public void setAccuAccomplices(String accuAccomplices) {
        this.accuAccomplices = accuAccomplices;
    }

    public String getAccuKnownCri() {
        return accuKnownCri;
    }

    public void setAccuKnownCri(String accuKnownCri) {
        this.accuKnownCri = accuKnownCri;
    }

    public String getAccuRecividist() {
        return accuRecividist;
    }

    public void setAccuRecividist(String accuRecividist) {
        this.accuRecividist = accuRecividist;
    }

    public String getAccuLikelyJumpBail() {
        return accuLikelyJumpBail;
    }

    public void setAccuLikelyJumpBail(String accuLikelyJumpBail) {
        this.accuLikelyJumpBail = accuLikelyJumpBail;
    }

    public String getAccuLikelyThreaten() {
        return accuLikelyThreaten;
    }

    public void setAccuLikelyThreaten(String accuLikelyThreaten) {
        this.accuLikelyThreaten = accuLikelyThreaten;
    }

    public String getAccuWantedOtherCase() {
        return accuWantedOtherCase;
    }

    public void setAccuWantedOtherCase(String accuWantedOtherCase) {
        this.accuWantedOtherCase = accuWantedOtherCase;
    }

    public String getNameAddrWitness1() {
        return nameAddrWitness1;
    }

    public void setNameAddrWitness1(String nameAddrWitness1) {
        this.nameAddrWitness1 = nameAddrWitness1;
    }

    public String getNameAddWitness2() {
        return nameAddWitness2;
    }

    public void setNameAddWitness2(String nameAddWitness2) {
        this.nameAddWitness2 = nameAddWitness2;
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

    public String getCourtSurrPlace() {
        return courtSurrPlace;
    }

    public void setCourtSurrPlace(String courtSurrPlace) {
        this.courtSurrPlace = courtSurrPlace;
    }

    public Date getCourtSurrDate() {
        return courtSurrDate;
    }

    public void setCourtSurrDate(Date courtSurrDate) {
        this.courtSurrDate = courtSurrDate;
    }

    public String getParentIntimationSent() {
        return parentIntimationSent;
    }

    public void setParentIntimationSent(String parentIntimationSent) {
        this.parentIntimationSent = parentIntimationSent;
    }

    public String getAccuPlacedInst() {
        return accuPlacedInst;
    }

    public void setAccuPlacedInst(String accuPlacedInst) {
        this.accuPlacedInst = accuPlacedInst;
    }

    public String getAccuJjbPlace() {
        return accuJjbPlace;
    }

    public void setAccuJjbPlace(String accuJjbPlace) {
        this.accuJjbPlace = accuJjbPlace;
    }

    public Date getAccuJjbDate() {
        return accuJjbDate;
    }

    public void setAccuJjbDate(Date accuJjbDate) {
        this.accuJjbDate = accuJjbDate;
    }

    public String getAccuChargeReason() {
        return accuChargeReason;
    }

    public void setAccuChargeReason(String accuChargeReason) {
        this.accuChargeReason = accuChargeReason;
    }

    public Fir getFir() {
        return fir;
    }

    public void setFir(Fir fir) {
        this.fir = fir;
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
        hash += (accusedId != null ? accusedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CourtSurrender)) {
            return false;
        }
        CourtSurrender other = (CourtSurrender) object;
        if ((this.accusedId == null && other.accusedId != null) || (this.accusedId != null && !this.accusedId.equals(other.accusedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.jjb.orm.CourtSurrender[ accusedId=" + accusedId + " ]";
    }
    
}
