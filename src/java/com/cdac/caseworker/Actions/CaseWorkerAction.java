  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.caseworker.Actions;

import com.cdac.caseworker.DAO.CaseWorkerDAOImpl;
import com.cdac.caseworker.DTO.CWCMeetingMinutesDTO;
import com.cdac.caseworker.DTO.AdmissiontoCHSHDTO;
import com.cdac.caseworker.DTO.CHChildHouseholdDTO;
import com.cdac.caseworker.DTO.TransferDischargeDTO;
import com.cdac.caseworker.DTO.CHEmploymentDetailsDTO;
import com.cdac.caseworker.DTO.CHFamilyCrimeDetailsDTO;
import com.cdac.caseworker.DTO.CHAfterAdmEducationDTO;
import com.cdac.caseworker.DTO.CWCMinutesOverViewDTO;
import com.cdac.caseworker.DTO.ChildDTO;
import com.cdac.caseworker.DTO.StayingPeriodOfChildDTO;
import com.cdac.caseworker.DTO.F3dto;      
import com.cdac.usermanagement.ORM.FcForm;
import com.cdac.caseworker.DTO.F10dto;
import com.cdac.caseworker.DTO.F17dto;
//import com.cdac.caseworker.DTO.F20dto;
import com.cdac.caseworker.DTO.F21dto;
import com.cdac.caseworker.DTO.F22dto;
import com.cdac.caseworker.DTO.F23dto;
import com.cdac.caseworker.DTO.F24dto;
import com.cdac.caseworker.DTO.F32dto;
import com.cdac.caseworker.DTO.F33dto;
import com.cdac.caseworker.DTO.F34dto;
import com.cdac.caseworker.DTO.F35dto;
import com.cdac.caseworker.DTO.F36dto;
import com.cdac.caseworker.DTO.F37dto;
import com.cdac.caseworker.DTO.F381dto;
import com.cdac.caseworker.DTO.F382dto;
import com.cdac.caseworker.DTO.F383dto;
import com.cdac.caseworker.DTO.F39dto;
import com.cdac.caseworker.DTO.F42dto;
import com.cdac.caseworker.DTO.F44dto;
import com.cdac.caseworker.DTO.F45dto;
import com.cdac.caseworker.DTO.F8dto;
import com.cdac.caseworker.Service.CaseWorkerService;
import com.cdac.common.util.CurrentDateProvider;
import com.cdac.common.util.ServerMessageDTO;
import com.cdac.common.util.StringToDate;
import com.cdac.usermanagement.ORM.CwcMinutes;
import com.cdac.usermanagement.ORM.ChildDetails;
import com.cdac.usermanagement.ORM.ChildDetailsPK;
import com.cdac.usermanagement.ORM.ChildMaster;
import com.cdac.usermanagement.ORM.DistrictMaster;
import com.cdac.usermanagement.ORM.HomeDetails;
import com.cdac.usermanagement.Service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.cdac.usermanagement.ORM.InterviewRegister;
import com.cdac.usermanagement.ORM.InterviewRegisterPK;
import com.cdac.usermanagement.ORM.CasehistoryPersonal;
import com.cdac.usermanagement.ORM.CasehistoryPersonalPK;
import com.cdac.usermanagement.ORM.CasehistoryFamily;
import com.cdac.usermanagement.ORM.CasehistoryFamilyDetails;
import com.cdac.usermanagement.ORM.CasehistoryFamilyDetailsPK;
import com.cdac.usermanagement.ORM.CasehistoryAdolescenceDetails;
import com.cdac.usermanagement.ORM.CasehistoryAdolescenceDetailsPK;
import com.cdac.usermanagement.ORM.CasehistoryEmploymentDetails;
import com.cdac.usermanagement.ORM.CasehistoryPrioradmEducation;
import com.cdac.usermanagement.ORM.CasehistoryPrioradmEducationPK;
import com.cdac.usermanagement.ORM.CasehistoryFamilyCrimeDetails;
import com.cdac.usermanagement.ORM.CasehistoryAfteradmEducation;
import com.cdac.usermanagement.ORM.CasehistorySocialhistoryPrioradm;
import com.cdac.usermanagement.ORM.CasehistorySocialhistoryPrioradmPK;
import com.cdac.usermanagement.ORM.CwcHop;
import com.cdac.usermanagement.ORM.CwcMeetings;
import com.cdac.usermanagement.ORM.HomeMaster;
import com.cdac.usermanagement.ORM.CwcMinutes;
import com.cdac.usermanagement.ORM.CwcMinutesPK;
import com.cdac.usermanagement.ORM.CwcSir;
import com.cdac.usermanagement.ORM.CwcSo;
import com.cdac.usermanagement.ORM.CwcUppi;
import com.cdac.usermanagement.ORM.DischargeRegister;
import com.cdac.usermanagement.ORM.FcChildTemp;
import com.cdac.usermanagement.ORM.FcForm10;
import com.cdac.usermanagement.ORM.FcForm15;
import com.cdac.usermanagement.ORM.FcForm19;
import com.cdac.usermanagement.ORM.FcForm20;
import com.cdac.usermanagement.ORM.FcForm21;
import com.cdac.usermanagement.ORM.FcForm23;
import com.cdac.usermanagement.ORM.FcForm24;
import com.cdac.usermanagement.ORM.FcForm25;
import com.cdac.usermanagement.ORM.FcForm26;
import com.cdac.usermanagement.ORM.FcForm3;
import com.cdac.usermanagement.ORM.FcForm32;
import com.cdac.usermanagement.ORM.FcForm33;
import com.cdac.usermanagement.ORM.FcForm34;
import com.cdac.usermanagement.ORM.FcForm36;
import com.cdac.usermanagement.ORM.FcForm37;
import com.cdac.usermanagement.ORM.FcForm38;
import com.cdac.usermanagement.ORM.FcForm39;
import com.cdac.usermanagement.ORM.FcForm4;
import com.cdac.usermanagement.ORM.FcForm42;
import com.cdac.usermanagement.ORM.FcForm44;
import com.cdac.usermanagement.ORM.FcForm45;
import com.cdac.usermanagement.ORM.FcForm5;
import com.cdac.usermanagement.ORM.FcForm8;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfWriter;
import static com.opensymphony.xwork2.Action.SUCCESS;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.servlet.ServletOutputStream;
import javax.sql.DataSource;
//import net.sf.jasperreports.engine.fonts.FontFamily;
import javax.swing.GroupLayout.Alignment;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import sun.font.FontFamily;
import sun.font.SunLayoutEngine;

/**
 *
 * @author Ramu Parupalli
 */
public class CaseWorkerAction extends ActionSupport implements ServletRequestAware, ModelDriven, SessionAware, ServletResponseAware {

    private Map session;
    //spring DI  
    private CaseWorkerService caseWorkerService;
    private AdminService adminService; // for retriving home details
    private String message;

    private HttpServletRequest request;

    //stuff for model driven
    private ChildMaster childMaster = new ChildMaster();

    // for Saving casework details
    private ChildDetails childDetails = new ChildDetails();
    private ChildDetailsPK childDetailsPK = new ChildDetailsPK();
    private String childDetails_ProfileId;
    private Date childDetails_dob;
    private String religion_other;
    // private caseWorkDTO caseworkDTO=new caseWorkDTO();

    //For social Investigation
    // private List<ChildMaster> TranschildrenListInAHome;
    private List<ChildMaster> childrenListInAHome;//=new ArrayList<ChildMaster>();
    private ChildMaster child_select; //for selected child in a form
    private String childProfileId; //for getting fetched profile details

    private List<HomeDetails> homeList;

    //-----for admission at RHB/G/OHB/G
    private String dateTimeAdm_String;
    private String probableDischargeDate_String;
    private String intCwcJjbDate_String;
    private String orderDate_String;
    private String hour;
    private String minute;
    private String ampm;

    //-----for admission at CHB/G
    private String operation;
    private List<ChildMaster> transferedChildList;
    private ChildDetails transChildDetails;
    private String transChildId;
    private ChildMaster transChildMaster;
    private String test_case;
    private AdmissiontoCHSHDTO admissiontoCHSHDTO = new AdmissiontoCHSHDTO();

    //----for discharge
    private TransferDischargeDTO tansferDischargeDTO = new TransferDischargeDTO();
    private String userDistrictId;
    private List<String> homesInADistrict = new ArrayList<String>();
    private List<DistrictMaster> districtList;
    private String actionTaken;
    private Map districtMap;
    //For Casehistory personal data
    private Map<String, String> homesInADistrictMap = new HashMap<String, String>();

    private CasehistoryPersonal casehistoryPersonal = new CasehistoryPersonal();
    private CasehistoryPersonalPK casehistoryPersonalPK = new CasehistoryPersonalPK();
    private String localResidence_other;
    private String housingType_other;
    private String reasonLeavingFamily_other;
    private String verbalAbuse_other;
    private String sexualAbuse_other;
    private String otherAbuse_other;
    private String illtreatDenialFood_other;
    private String illtreatBeatenMercilessly_other;
    private String illtreatCauseInjury_other;
    private String illtreatOthers_other;
    private String exploitationChild_other;
    private String childStayPriorAdmission_other;
    private String hsbaOthers_data;
    private List<HomeMaster> homeMasters;
    private String homeId;
    /*Added by vinumol 08-03-2012*/
    private String testing;
    private List<DischargeRegister> child_profid_list = new ArrayList<DischargeRegister>();

    private String discharge_fromdate;
    private String discharge_todate;
    private String disreg_profid;
    private List<InterviewRegister> interviewRegisterChild;
    private List<CasehistoryPersonal> caseHistoryChildlist;
    private List<ChildMaster> admissionRegister_show;
    private String admission_fromdate;
    private String admission_todate;
    private List<ChildDetails> childPIDList;
    private DischargeRegister dreg = new DischargeRegister();
    /*Ended by vinumol 08-03-2012*/

 /*Added By Anupam on 3-7-2012 START*/
    private String childProfileIdAndDateOfCaseWork;

    private File childImage;

    private List<ChildDTO> childDTOList;

    private ServerMessageDTO serverMessage = new ServerMessageDTO();
    private Object fcForm36;

    public ServerMessageDTO getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(ServerMessageDTO serverMessage) {
        this.serverMessage = serverMessage;
    }

    public List<ChildDTO> getChildDTOList() {
        return childDTOList;
    }

    public void setChildDTOList(List<ChildDTO> childDTOList) {
        this.childDTOList = childDTOList;
    }

    public File getChildImage() {
        return childImage;
    }

    public void setChildImage(File childImage) {
        this.childImage = childImage;
    }

    public String getChildProfileIdAndDateOfCaseWork() {
        return childProfileIdAndDateOfCaseWork;
    }

    public void setChildProfileIdAndDateOfCaseWork(String childProfileIdAndDateOfCaseWork) {
        this.childProfileIdAndDateOfCaseWork = childProfileIdAndDateOfCaseWork;
    }

    /*Added By Anupam on 3-7-2012 END*/
    public DischargeRegister getDreg() {
        return dreg;
    }

    public void setDreg(DischargeRegister dreg) {
        this.dreg = dreg;
    }

    public String getAdmission_fromdate() {
        return admission_fromdate;
    }

    public void setAdmission_fromdate(String admission_fromdate) {
        this.admission_fromdate = admission_fromdate;
    }

    public String getAdmission_todate() {
        return admission_todate;
    }

    public void setAdmission_todate(String admission_todate) {
        this.admission_todate = admission_todate;
    }

    public List<CasehistoryPersonal> getCaseHistoryChildlist() {
        return caseHistoryChildlist;
    }

    public void setCaseHistoryChildlist(List<CasehistoryPersonal> caseHistoryChildlist) {
        this.caseHistoryChildlist = caseHistoryChildlist;
    }

    public List<ChildDetails> getChildPIDList() {
        return childPIDList;
    }

    public void setChildPIDList(List<ChildDetails> childPIDList) {
        this.childPIDList = childPIDList;
    }

    public List<DischargeRegister> getChild_profid_list() {
        return child_profid_list;
    }

    public void setChild_profid_list(List<DischargeRegister> child_profid_list) {
        this.child_profid_list = child_profid_list;
    }

    public String getDischarge_fromdate() {
        return discharge_fromdate;
    }

    public void setDischarge_fromdate(String discharge_fromdate) {
        this.discharge_fromdate = discharge_fromdate;
    }

    public String getDischarge_todate() {
        return discharge_todate;
    }

    public void setDischarge_todate(String discharge_todate) {
        this.discharge_todate = discharge_todate;
    }

    public String getDisreg_profid() {
        return disreg_profid;
    }

    public void setDisreg_profid(String disreg_profid) {
        this.disreg_profid = disreg_profid;
    }

    public List<InterviewRegister> getInterviewRegisterChild() {
        return interviewRegisterChild;
    }

    public void setInterviewRegisterChild(List<InterviewRegister> interviewRegisterChild) {
        this.interviewRegisterChild = interviewRegisterChild;
    }

    public String getTesting() {
        return testing;
    }

    public void setTesting(String testing) {
        this.testing = testing;
    }

    //anupam added this on 8-2-2012 START
    private List<CWCMinutesOverViewDTO> cwcMeetingOverViewDTOList;
    //anupam added this on 8-2-2012 END

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CasehistoryPersonal getCasehistoryPersonal() {
        return casehistoryPersonal;
    }

    public void setCasehistoryPersonal(CasehistoryPersonal casehistoryPersonal) {
        this.casehistoryPersonal = casehistoryPersonal;
    }

    public CasehistoryPersonalPK getCasehistoryPersonalPK() {
        return casehistoryPersonalPK;
    }

    public void setCasehistoryPersonalPK(CasehistoryPersonalPK casehistoryPersonalPK) {
        this.casehistoryPersonalPK = casehistoryPersonalPK;
    }

    public String getChildStayPriorAdmission_other() {
        return childStayPriorAdmission_other;
    }

    public void setChildStayPriorAdmission_other(String childStayPriorAdmission_other) {
        this.childStayPriorAdmission_other = childStayPriorAdmission_other;
    }

    public String getExploitationChild_other() {
        return exploitationChild_other;
    }

    public void setExploitationChild_other(String exploitationChild_other) {
        this.exploitationChild_other = exploitationChild_other;
    }

    public String getHousingType_other() {
        return housingType_other;
    }

    public void setHousingType_other(String housingType_other) {
        this.housingType_other = housingType_other;
    }

    public String getIlltreatBeatenMercilessly_other() {
        return illtreatBeatenMercilessly_other;
    }

    public void setIlltreatBeatenMercilessly_other(String illtreatBeatenMercilessly_other) {
        this.illtreatBeatenMercilessly_other = illtreatBeatenMercilessly_other;
    }

    public String getIlltreatCauseInjury_other() {
        return illtreatCauseInjury_other;
    }

    public void setIlltreatCauseInjury_other(String illtreatCauseInjury_other) {
        this.illtreatCauseInjury_other = illtreatCauseInjury_other;
    }

    public String getIlltreatDenialFood_other() {
        return illtreatDenialFood_other;
    }

    public void setIlltreatDenialFood_other(String illtreatDenialFood_other) {
        this.illtreatDenialFood_other = illtreatDenialFood_other;
    }

    public String getIlltreatOthers_other() {
        return illtreatOthers_other;
    }

    public void setIlltreatOthers_other(String illtreatOthers_other) {
        this.illtreatOthers_other = illtreatOthers_other;
    }

    public String getLocalResidence_other() {
        return localResidence_other;
    }

    public void setLocalResidence_other(String localResidence_other) {
        this.localResidence_other = localResidence_other;
    }

    public String getOtherAbuse_other() {
        return otherAbuse_other;
    }

    public void setOtherAbuse_other(String otherAbuse_other) {
        this.otherAbuse_other = otherAbuse_other;
    }

    public String getReasonLeavingFamily_other() {
        return reasonLeavingFamily_other;
    }

    public void setReasonLeavingFamily_other(String reasonLeavingFamily_other) {
        this.reasonLeavingFamily_other = reasonLeavingFamily_other;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getSexualAbuse_other() {
        return sexualAbuse_other;
    }

    public void setSexualAbuse_other(String sexualAbuse_other) {
        this.sexualAbuse_other = sexualAbuse_other;
    }

    public String getVerbalAbuse_other() {
        return verbalAbuse_other;
    }

    public void setVerbalAbuse_other(String verbalAbuse_other) {
        this.verbalAbuse_other = verbalAbuse_other;
    }

    public String getHsbaOthers_data() {
        return hsbaOthers_data;
    }

    public void setHsbaOthers_data(String hsbaOthers_data) {
        this.hsbaOthers_data = hsbaOthers_data;
    }

    // End of Casehistory personal data
    // For Casehistory childhousehold details
    private CasehistoryFamily casehistoryFamily = new CasehistoryFamily();
    private List<CHChildHouseholdDTO> cHChildHouseholdDTO;
    private String[] nameRelative;
    private String[] relationship;
    private Integer[] age;
    private String[] health;
    private String[] occupation;
    private String[] handicap;
    private String[] education;
    private String[] income;
    private String[] historyMentalIllness;
    private String[] habit;
    private String[] socialization;
    private String[] gender;

    //anupam added on 29-02-2012 START
    private String childName;
    private String cwcNo;
    //anupam added on 29-02-2012 END

    public Map<String, String> getHomesInADistrictMap() {
        return homesInADistrictMap;
    }

    public void setHomesInADistrictMap(Map<String, String> homesInADistrictMap) {
        this.homesInADistrictMap = homesInADistrictMap;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        /*//System.out.println("-----------------setting child name -------- childName= "+childName+" "+childName.trim().equals(""));
        if(childName == null || childName.trim().equals(""))
            this.childName="NA";
        else*/
        this.childName = childName;
    }

    public String getCwcNo() {
        return cwcNo;
    }

    public void setCwcNo(String cwcNo) {
        /*if(cwcNo == null || cwcNo.trim().equals(""))
            this.cwcNo="NA";
        else*/
        this.cwcNo = cwcNo;
    }

    public Integer[] getAge() {
        return age;
    }

    public void setAge(Integer[] age) {
        this.age = age;
    }

    public List<CHChildHouseholdDTO> getcHChildHouseholdDTO() {
        return cHChildHouseholdDTO;
    }

    public void setcHChildHouseholdDTO(List<CHChildHouseholdDTO> cHChildHouseholdDTO) {
        this.cHChildHouseholdDTO = cHChildHouseholdDTO;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public String[] getHandicap() {
        return handicap;
    }

    public void setHandicap(String[] handicap) {
        this.handicap = handicap;
    }

    public String[] getHealth() {
        return health;
    }

    public void setHealth(String[] health) {
        this.health = health;
    }

    public String[] getIncome() {
        return income;
    }

    public void setIncome(String[] income) {
        this.income = income;
    }

    public String[] getNameRelative() {
        return nameRelative;
    }

    public void setNameRelative(String[] nameRelative) {
        this.nameRelative = nameRelative;
    }

    public String[] getOccupation() {
        return occupation;
    }

    public void setOccupation(String[] occupation) {
        this.occupation = occupation;
    }

    public String[] getRelationship() {
        return relationship;
    }

    public void setRelationship(String[] relationship) {
        this.relationship = relationship;
    }

    public CasehistoryFamily getCasehistoryFamily() {
        return casehistoryFamily;
    }

    public void setCasehistoryFamily(CasehistoryFamily casehistoryFamily) {
        this.casehistoryFamily = casehistoryFamily;
    }

    public String[] getGender() {
        return gender;
    }

    public void setGender(String[] gender) {
        this.gender = gender;
    }

    public String[] getHabit() {
        return habit;
    }

    public void setHabit(String[] habit) {
        this.habit = habit;
    }

    public String[] getHistoryMentalIllness() {
        return historyMentalIllness;
    }

    public void setHistoryMentalIllness(String[] historyMentalIllness) {
        this.historyMentalIllness = historyMentalIllness;
    }

    public String[] getSocialization() {
        return socialization;
    }

    public void setSocialization(String[] socialization) {
        this.socialization = socialization;
    }

    //end of Casehistory childhousehold details
    // Start of casehistiry family details
    private CasehistoryFamilyDetails casehistoryFamilyDetails = new CasehistoryFamilyDetails();
    private CasehistoryFamilyDetailsPK casehistoryFamilyDetailsPK = new CasehistoryFamilyDetailsPK();
    private String propertyFamilyVehicals_other;

    public CasehistoryFamilyDetails getCasehistoryFamilyDetails() {
        return casehistoryFamilyDetails;
    }

    public void setCasehistoryFamilyDetails(CasehistoryFamilyDetails casehistoryFamilyDetails) {
        this.casehistoryFamilyDetails = casehistoryFamilyDetails;
    }

    public CasehistoryFamilyDetailsPK getCasehistoryFamilyDetailsPK() {
        return casehistoryFamilyDetailsPK;
    }

    public void setCasehistoryFamilyDetailsPK(CasehistoryFamilyDetailsPK casehistoryFamilyDetailsPK) {
        this.casehistoryFamilyDetailsPK = casehistoryFamilyDetailsPK;
    }

    public String getPropertyFamilyVehicals_other() {
        return propertyFamilyVehicals_other;
    }

    public void setPropertyFamilyVehicals_other(String propertyFamilyVehicals_other) {
        this.propertyFamilyVehicals_other = propertyFamilyVehicals_other;
    }

    // End of casehistiry family details
    //Start of Casehistory Adolescence History
    private CasehistoryAdolescenceDetails casehistoryAdolescenceDetails = new CasehistoryAdolescenceDetails();
    private CasehistoryAdolescenceDetailsPK casehistoryAdolescenceDetailsPK = new CasehistoryAdolescenceDetailsPK();

    public CasehistoryAdolescenceDetails getCasehistoryAdolescenceDetails() {
        return casehistoryAdolescenceDetails;
    }

    public void setCasehistoryAdolescenceDetails(CasehistoryAdolescenceDetails casehistoryAdolescenceDetails) {
        this.casehistoryAdolescenceDetails = casehistoryAdolescenceDetails;
    }

    public CasehistoryAdolescenceDetailsPK getCasehistoryAdolescenceDetailsPK() {
        return casehistoryAdolescenceDetailsPK;
    }

    public void setCasehistoryAdolescenceDetailsPK(CasehistoryAdolescenceDetailsPK casehistoryAdolescenceDetailsPK) {
        this.casehistoryAdolescenceDetailsPK = casehistoryAdolescenceDetailsPK;
    }

    //End of Casehistory Adolescence History
    //Start of caseHistory Employment Details
    private CasehistoryEmploymentDetails casehistoryEmploymentDetails = new CasehistoryEmploymentDetails();
    private List<CHEmploymentDetailsDTO> cHEmploymentDetailsDTO;
    private String[] detailsEmployment;
    private String[] duration;
    private String[] wagesEarned;
    private String[] experienceatwork;
    private String[] detailsEmployment_other;

    public List<CHEmploymentDetailsDTO> getcHEmploymentDetailsDTO() {
        return cHEmploymentDetailsDTO;
    }

    public void setcHEmploymentDetailsDTO(List<CHEmploymentDetailsDTO> cHEmploymentDetailsDTO) {
        this.cHEmploymentDetailsDTO = cHEmploymentDetailsDTO;
    }

    public CasehistoryEmploymentDetails getCasehistoryEmploymentDetails() {
        return casehistoryEmploymentDetails;
    }

    public void setCasehistoryEmploymentDetails(CasehistoryEmploymentDetails casehistoryEmploymentDetails) {
        this.casehistoryEmploymentDetails = casehistoryEmploymentDetails;
    }

    public String[] getDetailsEmployment() {
        return detailsEmployment;
    }

    public void setDetailsEmployment(String[] detailsEmployment) {
        this.detailsEmployment = detailsEmployment;
    }

    public String[] getDetailsEmployment_other() {
        return detailsEmployment_other;
    }

    public void setDetailsEmployment_other(String[] detailsEmployment_other) {
        this.detailsEmployment_other = detailsEmployment_other;
    }

    public String[] getDuration() {
        return duration;
    }

    public void setDuration(String[] duration) {
        this.duration = duration;
    }

    public String[] getWagesEarned() {
        return wagesEarned;
    }

    public void setWagesEarned(String[] wagesEarned) {
        this.wagesEarned = wagesEarned;
    }

    public String[] getExperienceatwork() {
        return experienceatwork;
    }

    public void setExperienceatwork(String[] experienceatwork) {
        this.experienceatwork = experienceatwork;
    }

    //------------------End of caseHistory Employment Details------------------------------
    //************Start of casehistory Prior Admission Education Details********************
    private CasehistoryPrioradmEducation casehistoryPrioradmEducation = new CasehistoryPrioradmEducation();
    private CasehistoryPrioradmEducationPK casehistoryPrioradmEducationPK = new CasehistoryPrioradmEducationPK();
    private String reasonLeavingSchool_other;
    private String mediumInstruction_other;

    public CasehistoryPrioradmEducation getCasehistoryPrioradmEducation() {
        return casehistoryPrioradmEducation;
    }

    public void setCasehistoryPrioradmEducation(CasehistoryPrioradmEducation casehistoryPrioradmEducation) {
        this.casehistoryPrioradmEducation = casehistoryPrioradmEducation;
    }

    public CasehistoryPrioradmEducationPK getCasehistoryPrioradmEducationPK() {
        return casehistoryPrioradmEducationPK;
    }

    public void setCasehistoryPrioradmEducationPK(CasehistoryPrioradmEducationPK casehistoryPrioradmEducationPK) {
        this.casehistoryPrioradmEducationPK = casehistoryPrioradmEducationPK;
    }

    public String getMediumInstruction_other() {
        return mediumInstruction_other;
    }

    public void setMediumInstruction_other(String mediumInstruction_other) {
        this.mediumInstruction_other = mediumInstruction_other;
    }

    public String getReasonLeavingSchool_other() {
        return reasonLeavingSchool_other;
    }

    public void setReasonLeavingSchool_other(String reasonLeavingSchool_other) {
        this.reasonLeavingSchool_other = reasonLeavingSchool_other;
    }

    //************End of casehistory Prior Admission Education Details********************
    //^^^^^^^^^^^^^^Start of Casehistory Family Crime details^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    private CasehistoryFamilyCrimeDetails casehistoryFamilyCrimeDetails = new CasehistoryFamilyCrimeDetails();
    private List<CHFamilyCrimeDetailsDTO> cHFamilyCrimeDetailsDTO;

    private String[] name;
    private String[] relationship_crime;
    private String[] natureCrime;
    private String[] arrestMade;
    private String[] periodConfinement;
    private String[] punishment;

    public String[] getArrestMade() {
        return arrestMade;
    }

    public void setArrestMade(String[] arrestMade) {
        this.arrestMade = arrestMade;
    }

    public List<CHFamilyCrimeDetailsDTO> getcHFamilyCrimeDetailsDTO() {
        return cHFamilyCrimeDetailsDTO;
    }

    public void setcHFamilyCrimeDetailsDTO(List<CHFamilyCrimeDetailsDTO> cHFamilyCrimeDetailsDTO) {
        this.cHFamilyCrimeDetailsDTO = cHFamilyCrimeDetailsDTO;
    }

    public CasehistoryFamilyCrimeDetails getCasehistoryFamilyCrimeDetails() {
        return casehistoryFamilyCrimeDetails;
    }

    public void setCasehistoryFamilyCrimeDetails(CasehistoryFamilyCrimeDetails casehistoryFamilyCrimeDetails) {
        this.casehistoryFamilyCrimeDetails = casehistoryFamilyCrimeDetails;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getNatureCrime() {
        return natureCrime;
    }

    public void setNatureCrime(String[] natureCrime) {
        this.natureCrime = natureCrime;
    }

    public String[] getPeriodConfinement() {
        return periodConfinement;
    }

    public void setPeriodConfinement(String[] periodConfinement) {
        this.periodConfinement = periodConfinement;
    }

    public String[] getPunishment() {
        return punishment;
    }

    public void setPunishment(String[] punishment) {
        this.punishment = punishment;
    }

    public String[] getRelationship_crime() {
        return relationship_crime;
    }

    public void setRelationship_crime(String[] relationship_crime) {
        this.relationship_crime = relationship_crime;
    }

    //^^^^^^^^^^^^^^End of Casehistory Family Crime details^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 
    //#################Start of Casehistory After Admission Education Details####################
    private String[] typeAdmission;
    private Integer[] yearAdmission;
    private Integer[] yearCompletion;
    private String[] detailsAdmission;
    private String[] proficiency;
    private String[] nameAdmission;
    private CasehistoryAfteradmEducation casehistoryAfteradmEducation = new CasehistoryAfteradmEducation();
    private List<CHAfterAdmEducationDTO> cHAfterAdmEducationDTO;

    public List<CHAfterAdmEducationDTO> getcHAfterAdmEducationDTO() {
        return cHAfterAdmEducationDTO;
    }

    public void setcHAfterAdmEducationDTO(List<CHAfterAdmEducationDTO> cHAfterAdmEducationDTO) {
        this.cHAfterAdmEducationDTO = cHAfterAdmEducationDTO;
    }

    public CasehistoryAfteradmEducation getCasehistoryAfteradmEducation() {
        return casehistoryAfteradmEducation;
    }

    public void setCasehistoryAfteradmEducation(CasehistoryAfteradmEducation casehistoryAfteradmEducation) {
        this.casehistoryAfteradmEducation = casehistoryAfteradmEducation;
    }

    public String[] getDetailsAdmission() {
        return detailsAdmission;
    }

    public void setDetailsAdmission(String[] detailsAdmission) {
        this.detailsAdmission = detailsAdmission;
    }

    public String[] getNameAdmission() {
        return nameAdmission;
    }

    public void setNameAdmission(String[] nameAdmission) {
        this.nameAdmission = nameAdmission;
    }

    public String[] getProficiency() {
        return proficiency;
    }

    public void setProficiency(String[] proficiency) {
        this.proficiency = proficiency;
    }

    public String[] getTypeAdmission() {
        return typeAdmission;
    }

    public void setTypeAdmission(String[] typeAdmission) {
        this.typeAdmission = typeAdmission;
    }

    public Integer[] getYearAdmission() {
        return yearAdmission;
    }

    public void setYearAdmission(Integer[] yearAdmission) {
        this.yearAdmission = yearAdmission;
    }

    public Integer[] getYearCompletion() {
        return yearCompletion;
    }

    public void setYearCompletion(Integer[] yearCompletion) {
        this.yearCompletion = yearCompletion;
    }

    //################# End of Casehistory After Admission Education Details####################
//@@@@@@@@@@@@@@@@@@@@@ Start of  Case History Child Social History Details @@@@@@@@@@@@@@@@@@@@
    private CasehistorySocialhistoryPrioradm casehistorySocialhistoryPrioradm = new CasehistorySocialhistoryPrioradm();
    private CasehistorySocialhistoryPrioradmPK casehistorySocialhistoryPrioradmPK = new CasehistorySocialhistoryPrioradmPK();
    private String friendshipDetails_other;
    private String purposeMembership_other;

    public CasehistorySocialhistoryPrioradm getCasehistorySocialhistoryPrioradm() {
        return casehistorySocialhistoryPrioradm;
    }

    public void setCasehistorySocialhistoryPrioradm(CasehistorySocialhistoryPrioradm casehistorySocialhistoryPrioradm) {
        this.casehistorySocialhistoryPrioradm = casehistorySocialhistoryPrioradm;
    }

    public CasehistorySocialhistoryPrioradmPK getCasehistorySocialhistoryPrioradmPK() {
        return casehistorySocialhistoryPrioradmPK;
    }

    public void setCasehistorySocialhistoryPrioradmPK(CasehistorySocialhistoryPrioradmPK casehistorySocialhistoryPrioradmPK) {
        this.casehistorySocialhistoryPrioradmPK = casehistorySocialhistoryPrioradmPK;
    }

    public String getFriendshipDetails_other() {
        return friendshipDetails_other;
    }

    public void setFriendshipDetails_other(String friendshipDetails_other) {
        this.friendshipDetails_other = friendshipDetails_other;
    }

    public String getPurposeMembership_other() {
        return purposeMembership_other;
    }

    public void setPurposeMembership_other(String purposeMembership_other) {
        this.purposeMembership_other = purposeMembership_other;
    }

//@@@@@@@@@@@@@@@@@@@@@ End of  Case History Child Social History Details @@@@@@@@@@@@@@@@@@@@
    //------For Interview Register----------------------------------//
    private InterviewRegister interviewRegister = new InterviewRegister();
    private InterviewRegisterPK interviewRegisterPK = new InterviewRegisterPK();
    private String interviewDate_String;
    private String deliquentBehaviour_other;
    private String reasonDeliquentBehaviour_other;
    private String savingDetails_other;
    private String habits_drug;
    private List<InterviewRegister> interviewRegister_show;
    private String interviewTime_String;

    public String getInterviewTime_String() {
        return interviewTime_String;
    }

    public void setInterviewTime_String(String interviewTime_String) {
        this.interviewTime_String = interviewTime_String;
    }

    public String getInterviewDate_String() {
        return interviewDate_String;
    }

    public void setInterviewDate_String(String interviewDate_String) {
        this.interviewDate_String = interviewDate_String;
    }

    public InterviewRegister getInterviewRegister() {
        return interviewRegister;
    }

    public void setInterviewRegister(InterviewRegister interviewRegister) {
        this.interviewRegister = interviewRegister;
    }

    public InterviewRegisterPK getInterviewRegisterPK() {
        return interviewRegisterPK;
    }

    public void setInterviewRegisterPK(InterviewRegisterPK interviewRegisterPK) {
        this.interviewRegisterPK = interviewRegisterPK;
    }

    public List<InterviewRegister> getInterviewRegister_show() {
        return interviewRegister_show;
    }

    public void setInterviewRegister_show(List<InterviewRegister> interviewRegister_show) {
        this.interviewRegister_show = interviewRegister_show;
    }

    //------------End Interview Register
    public String getDeliquentBehaviour_other() {
        return deliquentBehaviour_other;
    }

    public void setDeliquentBehaviour_other(String deliquentBehaviour_other) {
        this.deliquentBehaviour_other = deliquentBehaviour_other;
    }

    public String getHabits_drug() {
        return habits_drug;
    }

    public void setHabits_drug(String habits_drug) {
        this.habits_drug = habits_drug;
    }

    public String getReasonDeliquentBehaviour_other() {
        return reasonDeliquentBehaviour_other;
    }

    public void setReasonDeliquentBehaviour_other(String reasonDeliquentBehaviour_other) {
        this.reasonDeliquentBehaviour_other = reasonDeliquentBehaviour_other;
    }

    public String getSavingDetails_other() {
        return savingDetails_other;
    }

    public void setSavingDetails_other(String savingDetails_other) {
        this.savingDetails_other = savingDetails_other;
    }

    private String formName;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getTest_case() {
        return test_case;
    }

    public void setTest_case(String test_case) {
        this.test_case = test_case;
    }

    public HttpServletRequest getServletRequest() {
        return request;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getUserDistrictId() {
        return userDistrictId;
    }

    public void setUserDistrictId(String userDistrictId) {
        this.userDistrictId = userDistrictId;
    }

    public String getDateTimeAdm_String() {
        return dateTimeAdm_String;
    }

    public void setDateTimeAdm_String(String dateTimeAdm_String) {
        this.dateTimeAdm_String = dateTimeAdm_String;
    }

    public String getProbableDischargeDate_String() {
        return probableDischargeDate_String;
    }

    public void setProbableDischargeDate_String(String probableDischargeDate_String) {
        this.probableDischargeDate_String = probableDischargeDate_String;
    }

    public ChildDetails getTransChildDetails() {
        return transChildDetails;
    }

    public void setTransChildDetails(ChildDetails transChildDetails) {
        this.transChildDetails = transChildDetails;
    }

    public AdmissiontoCHSHDTO getAdmissiontoCHSHDTO() {
        return admissiontoCHSHDTO;
    }

    public void setAdmissiontoCHSHDTO(AdmissiontoCHSHDTO admissiontoCHSHDTO) {
        this.admissiontoCHSHDTO = admissiontoCHSHDTO;
    }

    public List<String> getHomesInADistrict() {
        return homesInADistrict;
    }

    public void setHomesInADistrict(List<String> homesInADistrict) {
        this.homesInADistrict = homesInADistrict;
    }

    public List<DistrictMaster> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<DistrictMaster> districtList) {
        this.districtList = districtList;
    }

    public Map getDistrictMap() {
        return districtMap;
    }

    public void setDistrictMap(Map districtMap) {
        this.districtMap = districtMap;
    }

    public String getIntCwcJjbDate_String() {
        return intCwcJjbDate_String;
    }

    public void setIntCwcJjbDate_String(String intCwcJjbDate_String) {
        this.intCwcJjbDate_String = intCwcJjbDate_String;
    }

    public String getOrderDate_String() {
        return orderDate_String;
    }

    public void setOrderDate_String(String orderDate_String) {
        this.orderDate_String = orderDate_String;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public CaseWorkerService getCaseWorkerService() {
        return caseWorkerService;
    }

    public void setCaseWorkerService(CaseWorkerService caseWorkerService) {
        this.caseWorkerService = caseWorkerService;
    }

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    public ChildMaster getChildMaster() {
        return childMaster;
    }

    public void setChildMaster(ChildMaster childMaster) {
        this.childMaster = childMaster;
    }

    public List<ChildMaster> getChildrenListInAHome() {
        return childrenListInAHome;
    }

    public void setChildrenListInAHome(List<ChildMaster> childrenListInAHome) {
        this.childrenListInAHome = childrenListInAHome;
    }

    public List<HomeDetails> getHomeList() {
        return homeList;
    }

    public void setHomeList(List<HomeDetails> homeList) {
        this.homeList = homeList;
    }

    public TransferDischargeDTO getTansferDischargeDTO() {
        return tansferDischargeDTO;
    }

    public void setTansferDischargeDTO(TransferDischargeDTO tansferDischargeDTO) {
        this.tansferDischargeDTO = tansferDischargeDTO;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public List<ChildMaster> getTransferedChildList() {
        return transferedChildList;
    }

    public void setTransferedChildList(List<ChildMaster> transferedChildList) {
        this.transferedChildList = transferedChildList;
    }

    public ChildMaster getTransChildMaster() {
        return transChildMaster;
    }

    public void setTransChildMaster(ChildMaster transChildMaster) {
        this.transChildMaster = transChildMaster;
    }

    public String getTransChildId() {
        return transChildId;
    }

    public void setTransChildId(String transChildId) {
        this.transChildId = transChildId;
    }

    public ChildMaster getChild_select() {
        return child_select;
    }

    public void setChild_select(ChildMaster child_select) {
        this.child_select = child_select;
    }

    public String getChildProfileId() {
        return childProfileId;
    }

    public void setChildProfileId(String childProfileId) {
        this.childProfileId = childProfileId;
    }

    public ChildDetails getChildDetails() {
        return childDetails;
    }

    public void setChildDetails(ChildDetails childDetails) {
        this.childDetails = childDetails;
    }

    public String getChildDetails_ProfileId() {
        return childDetails_ProfileId;
    }

    public void setChildDetails_ProfileId(String childDetails_ProfileId) {
        this.childDetails_ProfileId = childDetails_ProfileId;
    }

    public ChildDetailsPK getChildDetailsPK() {
        return childDetailsPK;
    }

    public void setChildDetailsPK(ChildDetailsPK childDetailsPK) {
        this.childDetailsPK = childDetailsPK;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public Date getChildDetails_dob() {
        return childDetails_dob;
    }

    public void setChildDetails_dob(String childDetails_dob) {
        DateFormat dfopreg = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.childDetails_dob = dfopreg.parse(childDetails_dob);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        // this.childDetails_dob = childDetails_dob;
    }

    public String getReligion_other() {
        return religion_other;
    }

    public void setReligion_other(String religion_other) {
        this.religion_other = religion_other;
    }

    public List<HomeMaster> getHomeMasters() {
        return homeMasters;
    }

    public void setHomeMasters(List<HomeMaster> homeMasters) {
        this.homeMasters = homeMasters;
    }

    //for CWC Meetings minutes Register Start//
    private String dateofcwcmeeting;
    private String venue;
    private int noOfMembers;
    private String designation;
    private List<CWCMeetingMinutesDTO> cWCMeetingMinutesDTOs;
    private CwcMinutes cwcMinutes = new CwcMinutes();
    private CwcMinutesPK cwcMinutesPK = new CwcMinutesPK();
    private CwcMeetings cwcMeetings = new CwcMeetings();
    private List<Date> cwcMinuteslist;
    private String cwc_fromdate;
    private String cwc_todate;
    private String selectedMeetingdate;
    private FcForm3 fcForm3 = new FcForm3();
    private FcForm4 fcForm4 = new FcForm4();
    private FcForm5 fcForm5 = new FcForm5();
    private FcForm8 fcForm8 = new FcForm8();
   // private FcForm9 fcForm9 = new FcForm9();
    private FcForm10 fcForm10 = new FcForm10();
    private FcForm15 fcForm15 = new FcForm15();
    private FcChildTemp fcForm17 = new FcChildTemp();
    private FcForm19 fcForm19 = new FcForm19();
    private FcForm20 fcForm20 = new FcForm20();
    private FcForm21 fcForm21 = new FcForm21();
    //private FcForm22 fcForm22 = new FcForm22();
    private FcForm23 fcForm23 = new FcForm23();
    private FcForm24 fcForm24 = new FcForm24();
    private FcForm25 fcForm25 = new FcForm25();
    private FcForm26 fcForm26 = new FcForm26();
   // private FcForm30 fcForm30 = new FcForm30();
   // private FcForm31 fcForm31 = new FcForm31();
    private FcForm32 fcForm32 = new FcForm32();
    private FcForm33 fcForm33 = new FcForm33();
    private FcForm34 fcForm34 = new FcForm34();
    //private FcForm35 fcForm35 = new FcForm35();
    
    private FcForm37 fcForm37 = new FcForm37();
    private FcForm38 fcForm38 = new FcForm38();
    private FcForm39 fcForm39 = new FcForm39();
    private FcForm42 fcForm42 = new FcForm42();
    private FcForm44 fcForm44 = new FcForm44();
    private FcForm45 fcForm45 = new FcForm45();
    private List<CwcMinutes> minuteses;

    private String[] childProfileId_cwc;
    private String[] observations;
    private String[] actiontobeTaken;
    private String[] followUp;
    private String[] orderIssued;
    private String[] cwcJjbOrderNo;
    private String[] remarks;

    public List<ChildMaster> getAdmissionRegister_show() {
        return admissionRegister_show;
    }

    public void setAdmissionRegister_show(List<ChildMaster> admissionRegister_show) {
        this.admissionRegister_show = admissionRegister_show;
    }

    public List<CwcMinutes> getMinuteses() {
        return minuteses;
    }

    public void setMinuteses(List<CwcMinutes> minuteses) {
        this.minuteses = minuteses;
    }

    public String getSelectedMeetingdate() {
        return selectedMeetingdate;
    }

    public void setSelectedMeetingdate(String selectedMeetingdate) {
        this.selectedMeetingdate = selectedMeetingdate;
    }

    public String getCwc_fromdate() {
        return cwc_fromdate;
    }

    public void setCwc_fromdate(String cwc_fromdate) {
        this.cwc_fromdate = cwc_fromdate;
    }

    public String getCwc_todate() {
        return cwc_todate;
    }

    public void setCwc_todate(String cwc_todate) {
        this.cwc_todate = cwc_todate;
    }

    public List<Date> getCwcMinuteslist() {
        return cwcMinuteslist;
    }

    public void setCwcMinuteslist(List<Date> cwcMinuteslist) {
        this.cwcMinuteslist = cwcMinuteslist;
    }

    public CwcMeetings getCwcMeetings() {
        return cwcMeetings;
    }

    public void setCwcMeetings(CwcMeetings cwcMeetings) {
        this.cwcMeetings = cwcMeetings;
    }

    public String getDateofcwcmeeting() {
        return dateofcwcmeeting;
    }

    public void setDateofcwcmeeting(String dateofcwcmeeting) {
        this.dateofcwcmeeting = dateofcwcmeeting;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String[] getActiontobeTaken() {
        return actiontobeTaken;
    }

    public void setActiontobeTaken(String[] actiontobeTaken) {
        this.actiontobeTaken = actiontobeTaken;
    }

    public String[] getChildProfileId_cwc() {
        return childProfileId_cwc;
    }

    public void setChildProfileId_cwc(String[] childProfileId_cwc) {
        this.childProfileId_cwc = childProfileId_cwc;
    }

    public String[] getCwcJjbOrderNo() {
        return cwcJjbOrderNo;
    }

    public void setCwcJjbOrderNo(String[] cwcJjbOrderNo) {
        this.cwcJjbOrderNo = cwcJjbOrderNo;
    }

    public String[] getFollowUp() {
        return followUp;
    }

    public void setFollowUp(String[] followUp) {
        this.followUp = followUp;
    }

    public String[] getObservations() {
        return observations;
    }

    public void setObservations(String[] observations) {
        this.observations = observations;
    }

    public String[] getOrderIssued() {
        return orderIssued;
    }

    public void setOrderIssued(String[] orderIssued) {
        this.orderIssued = orderIssued;
    }

    public String[] getRemarks() {
        return remarks;
    }

    public void setRemarks(String[] remarks) {
        this.remarks = remarks;
    }

    public List<CWCMeetingMinutesDTO> getcWCMeetingMinutesDTOs() {
        return cWCMeetingMinutesDTOs;
    }

    public void setcWCMeetingMinutesDTOs(List<CWCMeetingMinutesDTO> cWCMeetingMinutesDTOs) {
        this.cWCMeetingMinutesDTOs = cWCMeetingMinutesDTOs;
    }

    public CwcMinutes getCwcMinutes() {
        return cwcMinutes;
    }

    public void setCwcMinutes(CwcMinutes cwcMinutes) {
        this.cwcMinutes = cwcMinutes;
    }

    public CwcMinutesPK getCwcMinutesPK() {
        return cwcMinutesPK;
    }

    public void setCwcMinutesPK(CwcMinutesPK cwcMinutesPK) {
        this.cwcMinutesPK = cwcMinutesPK;
    }

    public List<CWCMinutesOverViewDTO> getCwcMeetingOverViewDTOList() {
        return cwcMeetingOverViewDTOList;
    }

    public void setCwcMeetingOverViewDTOList(List<CWCMinutesOverViewDTO> cwcMeetingOverViewDTOList) {
        this.cwcMeetingOverViewDTOList = cwcMeetingOverViewDTOList;
    }

    /*Swetha added on 05-02-2013 for multilingual START*/
    public String en() {
//english
        return "success";
    }

    public String hi() {
//hindi
        System.out.println("hindi");
        return "success";
    }

    public String te() {
//telugu
        System.out.println("telugu");
        return "success";
    }

    /*Swetha added on 05-02-2013 for multilingual END*/
    //for CWC Meetings minutes Register End//

    /*---------------Case worker Methods start-----------------------------*/
    public String admissionIntoRH() {
        String result = "error";
        String homeIdFromSession = ActionContext.getContext().getSession().get("homeid").toString();
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        System.out.println("date string for admisiion ---------------------------> " + getDateTimeAdm_String());

        Date admDate = StringToDate.getStringToDate(getDateTimeAdm_String());
        // Date admDate=StringToDate.getStringToDateTime(getDateTimeAdm_String(), (getHour()+":"+getMinute()));
        String yearString = StringToDate.getYear(getDateTimeAdm_String());

        //Date prbDisDate=StringToDate.getStringToDate(getProbableDischargeDate_String());
        Date orDate = StringToDate.getStringToDate(getOrderDate_String());
        Date intDate = StringToDate.getStringToDate(getIntCwcJjbDate_String());
        //System.out.println("Inside ----------------------CaseWorkerAction.admissionIntoRH()--- ");
        //System.out.println("Home id from Session = "+homeIdFromSession);
        //System.out.println("name of child = "+childMaster.getChildName());
        //System.out.println("nature of child = "+childMaster.getChildNature());
        //System.out.println("caseWorkerService ---------> "+caseWorkerService);
        childMaster.setDateTimeAdm(admDate);
        //childMaster.setProbableDischargeDate(prbDisDate);
        childMaster.setOrderDate(orDate);
        childMaster.setIntCwcJjbDate(intDate);
        childMaster.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
        childMaster.setLastModifiedBy(userIdFromSession);
        result = caseWorkerService.addChild(childMaster, homeIdFromSession, yearString);

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("msg.succ.childAdmInRU"));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.childAdmInRU"));
        }
        return result;

        //return "success";
    }

    public String caseworkDetails_save() {
        String status = "error";
        try {
            //System.out.println("childDetails caste in save------------------->"+childDetails.getCaste());
            //System.out.println("childDetails Name in caseworksave------------------->"+childDetails.getChildName());
            childDetailsPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            childDetailsPK.setChildProfileId(childProfileId);
            childDetails.setChildDetailsPK(childDetailsPK);
            // childDetails.setDob(getChildDetails_dob());
            //System.out.println("religion------------------------->>>"+childDetails.getReligion());
            //System.out.println("religion_other------------------------->>>"+getReligion_other());
            if (childDetails.getReligion().equalsIgnoreCase("Other")) {
                childDetails.setReligion(getReligion_other());
            }
            status = caseWorkerService.saveCasework(childDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (status.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.CWDetSave", "SUCCESS", childProfileId));
        } else if (status.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.CWDetSave", "ERROR", childProfileId));
        }
        return status;
    }

    public String populateChildListforDischarge() {
        String result = "error";
        String homeId = ActionContext.getContext().getSession().get("homeid").toString();

        try {
            //System.out.println("home id from session = "+homeId);
            //System.out.println(" caseWorkerService = "+caseWorkerService);

            // if(test_case.equalsIgnoreCase("cwbs")){ //cwbs casework before select
            setChildrenListInAHome(caseWorkerService.getChildrenList(homeId));
            result = "success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /*found child venkat*/
    private List<FcChildTemp> foundchildrenlist;

    public List<FcChildTemp> getFoundchildrenlist() {
        return foundchildrenlist;
    }

    public void setFoundchildrenlist(List<FcChildTemp> foundchildrenlist) {
        this.foundchildrenlist = foundchildrenlist;
    }

    /*found child venkat end*/
    public String populateAll() {
        String result = "error";
        //System.out.println("---------- inside populateAllChildrenInAHome -------------");

        //get current home id
        //String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String foundhomeId = ActionContext.getContext().getSession().get("foundhomeid").toString();

        try {
            //System.out.println("home id from session = "+homeId);
            //System.out.println(" caseWorkerService = "+caseWorkerService);

            // if(test_case.equalsIgnoreCase("cwbs")){ //cwbs casework before select
            if (foundhomeId != null || foundhomeId != "" || foundhomeId != "--Please Select--") {
                setFoundchildrenlist(caseWorkerService.getfoundchildrenreportlist(foundhomeId));/*venkat new found children report list*/

            } else {
                setChildrenListInAHome(caseWorkerService.getChildrenList(homeId));
            }
            result = "success";

            // }
            /* else if(test_case.equalsIgnoreCase("cwas"))  //cwas casework after select
               {
                //System.out.println("inside----------------cwas");
                //System.out.println("fetched profile id----------------"+getChildProfileId());
                
                  setChildrenListInAHome(caseWorkerService.getChildrenList(homeId));
                   child_select=caseWorkerService.getChild_by_id(getChildProfileId());
                    result="success";
                   
               }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "success";
    }

    public String getCaseworkChildDetails() {
        String result = "error";

        String homeId = ActionContext.getContext().getSession().get("homeid").toString();
        try {
            setChildrenListInAHome(caseWorkerService.getChildrenList(homeId));
            child_select = caseWorkerService.getChild_by_id(getChildProfileId());
            result = "success";

        } catch (Exception e) {
            e.printStackTrace();
            result = "error";
        }

        return result;
    }

    public String getChildAndHomeLists() {

        String result = "error";

        try {
            //System.out.println("----------------------------before populating the list--------------------");
            //set the child list
            //populateAll();
            populateChildListforDischarge();
            //System.out.println("----------------------------after populating the list-------------------- "+childrenListInAHome);

            //set the home list
            setHomeList(adminService.getAllHomes());

            result = "success";

        } catch (Exception e) {

            e.printStackTrace();

        }

        return result;

    }

    public String discharge() {
        String status = "error";
        String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
        String currentUserId = ActionContext.getContext().getSession().get("userid").toString();
        getTansferDischargeDTO().setLastmodifiedBy(currentUserId);
        //System.out.println("home id in discharge ---------------------------------- > "+currentHomeId);
        //System.out.println("DTO in discharge ---------------------------------- > "+tansferDischargeDTO.getActionTaken());
        //System.out.println("Profile id is--------------------->>>>>>>"+getTansferDischargeDTO().getChildIdToBeTransDis());
        //System.out.println("Transfer Home id is--------------------->>>>>>>"+getTansferDischargeDTO().getTransHomeId());
        //System.out.println("Remarks--------------------->>>>>>>"+getTansferDischargeDTO().getRemarks());

        status = caseWorkerService.dischargeTransferService(currentHomeId, getTansferDischargeDTO());

        if (status.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.disSucc", "SUCCESS", getTansferDischargeDTO().getChildIdToBeTransDis()));
        } else if (status.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.discharge", "ERROR", getTansferDischargeDTO().getChildIdToBeTransDis()));
        }
        return status;

    }

    public String populateHomesInADistrict() {
////System.out.println("*** Inside populateHomesInADistrict() *** districtId="+getUserDistrictId());
        String result = "error";

        try {
            //String districtFromReq=request.getParameter("userDistrictId");
            //System.out.println("_______________________________>>>>>request  = "+getUserDistrictId());
            setHomesInADistrict(adminService.getHomesInADistrictList(getUserDistrictId()));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
////System.out.println(" return value from populateHomesInADistrict()----------------------> "+result);
        return result;

    }

    public String getDistricts() {
        //System.out.println("inside get districts---------------------> ");
        String result = "error";
        try {
            // List<DistrictMaster> temp=adminService.getDistrictList();
            // //System.out.println("Dist list returned---------------------> "+temp);
            Map dis_map = new HashMap();

            dis_map.put("ADI", getText("dis.adilabad"));
            dis_map.put("ANA", getText("dis.anantapur"));
            dis_map.put("CHI", getText("dis.chittoor"));
            dis_map.put("EGO", getText("dis.eastGoda"));
            dis_map.put("GUN", getText("dis.guntur"));
            dis_map.put("HYD", getText("dis.hyderabad"));
            dis_map.put("KAD", getText("dis.ysrDisKadapa"));
            dis_map.put("KAR", getText("dis.karimnagar"));
            dis_map.put("KHA", getText("dis.khammam"));
            dis_map.put("KRI", getText("dis.krishna"));
            dis_map.put("KUR", getText("dis.kurnool"));
            dis_map.put("MAH", getText("dis.mbNagar"));
            dis_map.put("MED", getText("dis.medak"));
            dis_map.put("NAL", getText("dis.nlgd"));
            dis_map.put("NEL", getText("dis.pottiSriRamNellore"));
            dis_map.put("NZB", getText("dis.nzmd"));
            dis_map.put("PRA", getText("dis.prakasam"));
            dis_map.put("RAN", getText("dis.rngrdy"));
            dis_map.put("SRI", getText("dis.sriKakulam"));
            dis_map.put("VIJ", getText("dis.vjngram"));
            dis_map.put("VIS", getText("dis.vskPatnam"));
            dis_map.put("VIJ", getText("dis.vjngram"));
            dis_map.put("WAR", getText("dis.wrgl"));
            dis_map.put("WGO", getText("dis.wg"));

            /* dis_list.add(getText("dis.adilabad","ADI"));
        dis_list.add(getText("dis.anantapur","ANA"));
        dis_list.add(getText("dis.chittoor","CHI"));
        dis_list.add(getText("dis.eastGoda","EGO"));
        dis_list.add(getText("dis.guntur","GUN"));
        dis_list.add(getText("dis.hyderabad","HYD"));
        dis_list.add(getText("dis.ysrDisKadapa","KAD"));
        dis_list.add(getText("dis.karimnagar","KAR"));
        dis_list.add(getText("dis.khammam","KHA"));
        dis_list.add(getText("dis.krishna","KRI"));
        dis_list.add(getText("dis.kurnool","KUR"));
        dis_list.add(getText("dis.mbNagar","MAH"));
        dis_list.add(getText("dis.medak","MED"));
        dis_list.add(getText("dis.nlgd","NAL"));
        dis_list.add(getText("dis.pottiSriRamNellore","NEL"));
        dis_list.add(getText("dis.nzmd","NZB"));
        dis_list.add(getText("dis.prakasam","PRA"));
        dis_list.add(getText("dis.rngrdy","RAN"));
        dis_list.add(getText("dis.sriKakulam","SRI"));
        dis_list.add(getText("dis.vjngram","VIJ"));
        dis_list.add(getText("dis.vskPatnam","VAS"));
        dis_list.add(getText("dis.wrgl","WAR"));
        dis_list.add(getText("dis.wg","WGO"));  */
            // setDistrictList(adminService.getDistrictList());
            setDistrictMap(dis_map);
            //System.out.println("district name---------------->>>>>"+getDistrictList().get(1));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    //------for admission at CHB/G
    public String admissionToCH() {
        String result = "error";

        try {
            String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
            setTransferedChildList(caseWorkerService.getTransferedChildListForThisHome(currentHomeId));
            //setTransChildDetails(caseWorkerService.);
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    public String getTransferredChildDetails() {
        String result = "error";

        try {
            //String currentHomeId=ActionContext.getContext().getSession().get("homeid").toString();
            //setTransferedChildList(caseWorkerService.getTransferedChildListForThisHome(currentHomeId));
            setTransChildMaster(caseWorkerService.getTransferredChildDetails(getTransChildId()));
            setTransChildDetails(caseWorkerService.getExistingChildDetails(getTransChildId()));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    public String getCaseworkViewChildDetails() {

        setTransChildDetails(caseWorkerService.getExistingChildDetailsBasedOnProfileIdAndEntryDate(getChildProfileIdAndDateOfCaseWork()));

        return "success";

    }

    public String admissionToCHSave() {
        //System.out.println("hello I am here in admissionToCHSave");
        String result = "error";
        String homeIdFromSession = ActionContext.getContext().getSession().get("homeid").toString();
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        getAdmissiontoCHSHDTO().setLastModifiedBy(userIdFromSession);
        //System.out.println("TransChildid  in action-------------------->>>"+admissiontoCHSHDTO.getTransChildId());
        return caseWorkerService.addChildtoCHSH(childMaster, homeIdFromSession, getAdmissiontoCHSHDTO());

    }

    public String interviewRegister_Save() {
        String result = "error";
        Date d1 = new Date();

        try {
            String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
            String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();
            interviewRegisterPK.setChildProfileId(childProfileId);
            Date inter_date = StringToDate.getStringToDate(getInterviewDate_String());
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date inter_time = sdf.parse((getInterviewTime_String().substring(11, 19)));
            ////System.out.println("VINUMOLSSSSSSSSSSSSSSSSSSS"+inter_time);
            //String time1=sdf.format(inter_time);

            // Date inter_time1=StringToDate.getStringToDate(inter_time);
            Calendar calendarA = Calendar.getInstance();
            calendarA.setTime(inter_date);

            Calendar calendarB = Calendar.getInstance();
            calendarB.setTime(inter_time);

            calendarA.set(Calendar.HOUR_OF_DAY, calendarB.get(Calendar.HOUR_OF_DAY));
            calendarA.set(Calendar.MINUTE, calendarB.get(Calendar.MINUTE));
            Date result1 = calendarA.getTime();
            //System.out.println("VINUMOLSSSSSSSSSSSSSSSSSSSuuuuuuuuuuuuuuuuuuu"+result1);

            interviewRegisterPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            //interviewRegisterPK.setInterviewDate(inter_date);
            interviewRegister.setInterviewRegisterPK(interviewRegisterPK);
            interviewRegister.setHomeId(currentHomeId);
            interviewRegister.setInterviewDate(result1);
            interviewRegister.setLastModifiedBy(userIdFromSession);
            result = caseWorkerService.saveInterViewDetails(interviewRegister);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveIntrDet", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveIntrDet", "ERROR", childProfileId));
        }

        return result;
    }

    //for CaseHistory it can be removed and can use getTransferredChildDetails()
    public String getch_ChildDetails() {
        String result = "error";
        System.out.println("in method--->getch_ChildDetails()");

        try {
            String homeId = ActionContext.getContext().getSession().get("homeid").toString();
            System.out.println("homeid-------->" + homeId);

            setTransChildMaster(caseWorkerService.getTransferredChildDetails(getChildProfileId()));
            setTransChildDetails(caseWorkerService.getExistingChildDetails(getChildProfileId()));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public String SaveCH_PersonalData() {
        String result = "error";
        try {
            String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();
            casehistoryPersonalPK.setChildProfileId(childProfileId);
            casehistoryPersonalPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistoryPersonal.setCasehistoryPersonalPK(casehistoryPersonalPK);

            if (casehistoryPersonal.getReligion().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setReligion(getReligion_other());
            }
            if (casehistoryPersonal.getLocalResidence().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setLocalResidence(getLocalResidence_other());
            }

            if (casehistoryPersonal.getHousingType().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setHousingType(getHousingType_other());
            }

            if (casehistoryPersonal.getReasonLeavingFamily().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setReasonLeavingFamily(getReasonLeavingFamily_other());
            }

            if (casehistoryPersonal.getVerbalAbuse().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setVerbalAbuse(getVerbalAbuse_other());
            }
            if (casehistoryPersonal.getSexualAbuse().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setSexualAbuse(getSexualAbuse_other());
            }

            /*  if(casehistoryPersonal.getOtherAbuse().equalsIgnoreCase("Others")){
                casehistoryPersonal.setOtherAbuse(getOtherAbuse_other());
                }*/
            if (casehistoryPersonal.getIlltreatDenialFood().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setIlltreatDenialFood(getIlltreatDenialFood_other());
            }

            if (casehistoryPersonal.getIlltreatBeatenMercilessly().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setIlltreatBeatenMercilessly(getIlltreatBeatenMercilessly_other());
            }
            if (casehistoryPersonal.getIlltreatCauseInjury().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setIlltreatCauseInjury(getIlltreatCauseInjury_other());
            }

            /* if(casehistoryPersonal.getIlltreatOthers().equalsIgnoreCase("Others")){
                casehistoryPersonal.setIlltreatOthers(getIlltreatOthers_other());
                } */
            if (casehistoryPersonal.getExploitationChild().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setExploitationChild(getExploitationChild_other());
            }

            if (casehistoryPersonal.getChildStayPriorAdmission().equalsIgnoreCase("Others")) {
                casehistoryPersonal.setChildStayPriorAdmission(getChildStayPriorAdmission_other());
            }
            /* if(getHsbaOthers_data()!=null)
                 {
                 casehistoryPersonal.setHsbaOthers(getHsbaOthers_data());
                 }*/

            System.out.println("Object value -------------------------------->" + casehistoryPersonal);

            casehistoryPersonal.setLastModifiedBy(userIdFromSession);
            result = caseWorkerService.saveCaseHistoryPersonal(casehistoryPersonal);

            System.out.println("result -------------------------------->" + result);

            if (result.equalsIgnoreCase("success")) {
                setMessage(getText("mess.succ.savePerDetCaseHis", "SUCCESS", childProfileId));
                serverMessage.setMessageValue(getText("mess.succ.savePerDetCaseHis", "SUCCESS", childProfileId));
                serverMessage.setMessageType("success");

            } else if (result.equalsIgnoreCase("error")) {
                setMessage(getText("mess.fail.savePerDetCaseHis", "ERROR", childProfileId));
                serverMessage.setMessageValue(getText("mess.fail.savePerDetCaseHis", "ERROR", childProfileId));
                serverMessage.setMessageType("success");
            }

            setServerMessage(serverMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("serverMessage value -------------------------------->" + serverMessage);

        return result;
    }

    public String saveCH_HouseHold() {
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();
        String result = "error";
        cHChildHouseholdDTO = new ArrayList<CHChildHouseholdDTO>(nameRelative.length);
        for (int i = 0; i < nameRelative.length; i++) {
            casehistoryFamily.setChildProfileId(childProfileId);
            casehistoryFamily.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistoryFamily.setLastModifiedBy(userIdFromSession);
            casehistoryFamily.setNameRelative(getNameRelative()[i]);
            casehistoryFamily.setRelationship(getRelationship()[i]);
            casehistoryFamily.setEducation(getEducation()[i]);
            casehistoryFamily.setIncome(getIncome()[i]);
            casehistoryFamily.setHandicap(getHandicap()[i]);
            casehistoryFamily.setOccupation(getOccupation()[i]);
            casehistoryFamily.setHealth(getHealth()[i]);
            casehistoryFamily.setAge(getAge()[i]);

            result = caseWorkerService.saveCasehistoryChildhousehold(casehistoryFamily);

        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveHouHoldDetCaseHis", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveHouHoldDetCaseHis", "ERROR", childProfileId));
        }

        return result;
    }

    public String saveCHFamilyDetails() {
        String result = "error";
        String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        try {
            casehistoryFamilyDetailsPK.setChildProfileId(childProfileId);
            casehistoryFamilyDetailsPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistoryFamilyDetails.setCasehistoryFamilyDetailsPK(casehistoryFamilyDetailsPK);
            casehistoryFamilyDetails.setLastModifiedBy(userIdFromSession);
            if (casehistoryFamilyDetails.getPropertyFamilyVehicals().equalsIgnoreCase("four_wheeler")) {
                casehistoryFamilyDetails.setPropertyFamilyVehicals(getPropertyFamilyVehicals_other());
            }
            result = caseWorkerService.savecasehistoryFamilyDetails(casehistoryFamilyDetails);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveFamDetCaseHis", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveFamDetCaseHis", "ERROR", childProfileId));
        }
        return result;
    }

    public String saveCHAdolscenceHistory() {
        String result = "error";
        //String currentHomeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        try {

            casehistoryAdolescenceDetailsPK.setChildProfileId(childProfileId);
            casehistoryAdolescenceDetailsPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistoryAdolescenceDetails.setCasehistoryAdolescenceDetailsPK(casehistoryAdolescenceDetailsPK);
            casehistoryAdolescenceDetails.setLastModifiedBy(userIdFromSession);
            ////System.out.println("get drug_abuse---------------------->>"+getHabits_drug());

            if (casehistoryAdolescenceDetails.getDeliquentBehaviour().equalsIgnoreCase("Others")) {
                casehistoryAdolescenceDetails.setDeliquentBehaviour(getDeliquentBehaviour_other());
            }
            if (casehistoryAdolescenceDetails.getReasonDeliquentBehaviour().equalsIgnoreCase("Others")) {
                casehistoryAdolescenceDetails.setReasonDeliquentBehaviour(getReasonDeliquentBehaviour_other());
            }

            if (casehistoryAdolescenceDetails.getSavingDetails().equalsIgnoreCase("Others")) {
                casehistoryAdolescenceDetails.setSavingDetails(getSavingDetails_other());
            }

            result = caseWorkerService.savecasehistoryAdolescenceHistory(casehistoryAdolescenceDetails);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveAdolDetCaseHis", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveAdolDetCaseHis", "ERROR", childProfileId));
        }
        return result;
    }

    public String saveCHEmploymentDetails() {
        String result = "error";

        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();
        cHEmploymentDetailsDTO = new ArrayList<CHEmploymentDetailsDTO>(detailsEmployment.length);
        //System.out.println("length----------------------->>>"+detailsEmployment.length);

        for (int i = 0; i < detailsEmployment.length; i++) {
            casehistoryEmploymentDetails.setChildProfileId(childProfileId);
            casehistoryEmploymentDetails.setLastModifiedBy(userIdFromSession);
            casehistoryEmploymentDetails.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistoryEmploymentDetails.setDetailsEmployment(getDetailsEmployment()[i]);
            casehistoryEmploymentDetails.setDuration(getDuration()[i]);
            casehistoryEmploymentDetails.setWagesEarned(getWagesEarned()[i]);
            casehistoryEmploymentDetails.setExperienceatwork(getExperienceatwork()[i]);
            result = caseWorkerService.savecasehistoryEmploymentDetails(casehistoryEmploymentDetails);
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveEmpDetCaseHis", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveEmpDetCaseHis", "ERROR", childProfileId));
        }

        return result;
    }

    public String saveCHPriorAdmEducationDetails() {
        String result = "error";
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        try {
            casehistoryPrioradmEducationPK.setChildProfileId(childProfileId);
            casehistoryPrioradmEducationPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistoryPrioradmEducation.setCasehistoryPrioradmEducationPK(casehistoryPrioradmEducationPK);
            casehistoryPrioradmEducation.setLastModifiedBy(userIdFromSession);
            if (casehistoryPrioradmEducation.getReasonLeavingSchool().equalsIgnoreCase("Others")) {
                casehistoryPrioradmEducation.setReasonLeavingSchool(getReasonLeavingSchool_other());
            }
            if (casehistoryPrioradmEducation.getMediumInstruction().equalsIgnoreCase("Others")) {
                casehistoryPrioradmEducation.setMediumInstruction(getMediumInstruction_other());
            }
            result = caseWorkerService.savecasehistoryPriorAdmEducationDetails(casehistoryPrioradmEducation);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.savePriAdmEduDetCH", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.savePriAdmEduDetCH", "ERROR", childProfileId));
        }

        return result;
    }

    public String saveCHFamilyCrimeDetails() {
        String result = "error";

        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();
        cHFamilyCrimeDetailsDTO = new ArrayList<CHFamilyCrimeDetailsDTO>(name.length);

        try {
            for (int i = 0; i < name.length; i++) {
                casehistoryFamilyCrimeDetails.setChildProfileId(childProfileId);
                casehistoryFamilyCrimeDetails.setLastModifiedBy(userIdFromSession);
                casehistoryFamilyCrimeDetails.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
                casehistoryFamilyCrimeDetails.setName(getName()[i]);
                casehistoryFamilyCrimeDetails.setRelationship(getRelationship_crime()[i]);
                casehistoryFamilyCrimeDetails.setNatureCrime(getNatureCrime()[i]);
                casehistoryFamilyCrimeDetails.setPeriodConfinement(getPeriodConfinement()[i]);
                casehistoryFamilyCrimeDetails.setPunishment(getPunishment()[i]);
                casehistoryFamilyCrimeDetails.setArrestMade(getArrestMade()[i]);

                result = caseWorkerService.savecasehistoryFamilyCrimeDetails(casehistoryFamilyCrimeDetails);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveFamCriDetCH", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveFamCriDetCH", "ERROR", childProfileId));
        }

        return result;
    }

    public String saveCHAfterAdmEducationDetails() {
        String result = "error";
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();
        cHAfterAdmEducationDTO = new ArrayList<CHAfterAdmEducationDTO>(yearAdmission.length);
        try {
            for (int i = 0; i < yearAdmission.length; i++) {
                casehistoryAfteradmEducation.setChildProfileId(childProfileId);
                casehistoryAfteradmEducation.setLastModifiedBy(userIdFromSession);
                casehistoryAfteradmEducation.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
                casehistoryAfteradmEducation.setYearAdmission(getYearAdmission()[i]);
                casehistoryAfteradmEducation.setTypeAdmission(getTypeAdmission()[i]);
                casehistoryAfteradmEducation.setNameAdmission(getNameAdmission()[i]);
                casehistoryAfteradmEducation.setDetailsAdmission(getDetailsAdmission()[i]);
                casehistoryAfteradmEducation.setProficiency(getProficiency()[i]);
                casehistoryAfteradmEducation.setYearCompletion(getYearCompletion()[i]);
                result = caseWorkerService.savecasehistoryAfterAdmEducationDetails(casehistoryAfteradmEducation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveEduDetAftAdmCH", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveEduDetAftAdmCH", "ERROR", childProfileId));
        }
        return result;
    }

    public String saveCHSocialHistoryDetails() {
        String result = "error";
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        try {

            casehistorySocialhistoryPrioradmPK.setChildProfileId(childProfileId);
            casehistorySocialhistoryPrioradmPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            casehistorySocialhistoryPrioradm.setCasehistorySocialhistoryPrioradmPK(casehistorySocialhistoryPrioradmPK);
            casehistorySocialhistoryPrioradm.setLastModifiedBy(userIdFromSession);
            if (casehistorySocialhistoryPrioradm.getFriendshipDetails().equalsIgnoreCase("Others")) {
                casehistorySocialhistoryPrioradm.setFriendshipDetails(getFriendshipDetails_other());
            }
            if (casehistorySocialhistoryPrioradm.getPurposeMembership().equalsIgnoreCase("other")) {
                casehistorySocialhistoryPrioradm.setPurposeMembership(getPurposeMembership_other());
            }

            result = caseWorkerService.savecasehistorySocialHistoryDetails(casehistorySocialhistoryPrioradm);

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveSocHisDetCH", "SUCCESS", childProfileId));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveSocHisDetCH", "ERROR", childProfileId));
        }
        return result;

    }

    public String getInterviewRegisterDetails() {
        String result = "error";
        String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
        String userIdFromSession = ActionContext.getContext().getSession().get("currentUser").toString();

        try {
            interviewRegister_show = caseWorkerService.getChildInterviewDetails(childProfileId);
            //System.out.println("List Size in interview register--------------->>>>>>"+interviewRegister_show.size());
            //System.out.println("list----------------------->>>>>>>"+interviewRegister_show);
            result = "success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    /* for cwc setting home ANUPAM START here*/
    public String getHomesInADist() {
        //ActionContext.getContext().getSession().put("homeid", caseWorkerService. );
        setHomeMasters(caseWorkerService.getHomesOfACwcDist(ActionContext.getContext().getSession().get("userid").toString()));
        return "success";

    }

    private String foundchildprofileid;

    public String getFoundchildprofileid() {
        return foundchildprofileid;
    }

    public void setFoundchildprofileid(String foundchildprofileid) {
        this.foundchildprofileid = foundchildprofileid;
    }

    public String putHomeIdInSession() {

        System.out.println(" putHomeIdInSession foundchildprofileid == " + foundchildprofileid);
          System.out.println("putHomeIdInSession****home id***->"+getHomeId());

        /*venkat for new found id's*/
 /*end of venkat code*/
        ActionContext.getContext().getSession().put("homeid", getHomeId());
        ActionContext.getContext().getSession().put("foundhomeid", foundchildprofileid);

        return populateAll();
    }

    //order:: transfer to cci
    private String cipiDay;
    private String cipiYear;

    //order: handover to parents
    private String cName;
    private String cpFat;
    private String cAge;
    private String cVil;
    private String cpDD;
    private String cpPs;
    private String cpName;
    private String cpPer;
    private String cpHome;
    private String cpNd;
    private String cpDay;
    private String cpMon;
    private String cpYr;
    //order:: social invest
    private String soDDNo;
    private String soBank;
    private String soYear;
    private String soPS;
    private String soName;
    private String soCareName;
    private String soCareAddr;
    private String soSaidPer;

    //order:: callfordpo
    private String sirFir;
    private String sirSec;
    private String sirPs;
    private String sirName;
    private String sirFat;
    private String sirAge;
    private String sirPl;
    private String sirRDt;
    private String sirDay;
    private String sirthDt;
    private String sirYr;
    //order:: pending inquiry

    private String pname;
    private String phouse;
    private String pstreet;
    private String pvilTwn;
    private String pdis;
    private String pstate;
    private String pchild;
    private String page;

    public String getSirAge() {
        return sirAge;
    }

    public void setSirAge(String sirAge) {
        this.sirAge = sirAge;
    }

    public String getSirDay() {
        return sirDay;
    }

    public void setSirDay(String sirDay) {
        this.sirDay = sirDay;
    }

    public String getSirFat() {
        return sirFat;
    }

    public void setSirFat(String sirFat) {
        this.sirFat = sirFat;
    }

    public String getSirFir() {
        return sirFir;
    }

    public void setSirFir(String sirFir) {
        this.sirFir = sirFir;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getSirPl() {
        return sirPl;
    }

    public void setSirPl(String sirPl) {
        this.sirPl = sirPl;
    }

    public String getSirPs() {
        return sirPs;
    }

    public void setSirPs(String sirPs) {
        this.sirPs = sirPs;
    }

    public String getSirRDt() {
        return sirRDt;
    }

    public void setSirRDt(String sirRDt) {
        this.sirRDt = sirRDt;
    }

    public String getSirSec() {
        return sirSec;
    }

    public void setSirSec(String sirSec) {
        this.sirSec = sirSec;
    }

    public String getSirYr() {
        return sirYr;
    }

    public void setSirYr(String sirYr) {
        this.sirYr = sirYr;
    }

    public String getSirthDt() {
        return sirthDt;
    }

    public void setSirthDt(String sirthDt) {
        this.sirthDt = sirthDt;
    }

    //order:: interm custody
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPchild() {
        return pchild;
    }

    public void setPchild(String pchild) {
        this.pchild = pchild;
    }

    public String getPdis() {
        return pdis;
    }

    public void setPdis(String pdis) {
        this.pdis = pdis;
    }

    public String getPstreet() {
        return pstreet;
    }

    public void setPstreet(String pstreet) {
        this.pstreet = pstreet;
    }

    public String getPhouse() {
        return phouse;
    }

    public void setPhouse(String phouse) {
        this.phouse = phouse;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPstate() {
        return pstate;
    }

    public void setPstate(String pstate) {
        this.pstate = pstate;
    }

    public String getPvilTwn() {
        return pvilTwn;
    }

    public void setPvilTwn(String pvilTwn) {
        this.pvilTwn = pvilTwn;
    }

    //oreder:::1
    public String getcAge() {
        return cAge;
    }

    public void setcAge(String cAge) {
        this.cAge = cAge;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcVil() {
        return cVil;
    }

    public void setcVil(String cVil) {
        this.cVil = cVil;
    }

    public String getCipiDay() {
        return cipiDay;
    }

    public void setCipiDay(String cipiDay) {
        this.cipiDay = cipiDay;
    }

    public String getCipiYear() {
        return cipiYear;
    }

    public void setCipiYear(String cipiYear) {
        this.cipiYear = cipiYear;
    }

    public String getCpDD() {
        return cpDD;
    }

    public void setCpDD(String cpDD) {
        this.cpDD = cpDD;
    }

    public String getCpDay() {
        return cpDay;
    }

    public void setCpDay(String cpDay) {
        this.cpDay = cpDay;
    }

    public String getCpFat() {
        return cpFat;
    }

    public void setCpFat(String cpFat) {
        this.cpFat = cpFat;
    }

    public String getCpHome() {
        return cpHome;
    }

    public void setCpHome(String cpHome) {
        this.cpHome = cpHome;
    }

    public String getCpMon() {
        return cpMon;
    }

    public void setCpMon(String cpMon) {
        this.cpMon = cpMon;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpNd() {
        return cpNd;
    }

    public void setCpNd(String cpNd) {
        this.cpNd = cpNd;
    }

    public String getCpPer() {
        return cpPer;
    }

    public void setCpPer(String cpPer) {
        this.cpPer = cpPer;
    }

    public String getCpPs() {
        return cpPs;
    }

    public void setCpPs(String cpPs) {
        this.cpPs = cpPs;
    }

    public String getCpYr() {
        return cpYr;
    }

    public void setCpYr(String cpYr) {
        this.cpYr = cpYr;
    }
    //oreder issued :: soc Inv ord

    public String getSoBank() {
        return soBank;
    }

    public void setSoBank(String soBank) {
        this.soBank = soBank;
    }

    public String getSoCareAddr() {
        return soCareAddr;
    }

    public void setSoCareAddr(String soCareAddr) {
        this.soCareAddr = soCareAddr;
    }

    public String getSoCareName() {
        return soCareName;
    }

    public void setSoCareName(String soCareName) {
        this.soCareName = soCareName;
    }

    public String getSoDDNo() {
        return soDDNo;
    }

    public void setSoDDNo(String soDDNo) {
        this.soDDNo = soDDNo;
    }

    public String getSoName() {
        return soName;
    }

    public void setSoName(String soName) {
        this.soName = soName;
    }

    public String getSoPS() {
        return soPS;
    }

    public void setSoPS(String soPS) {
        this.soPS = soPS;
    }

    public String getSoSaidPer() {
        return soSaidPer;
    }

    public void setSoSaidPer(String soSaidPer) {
        this.soSaidPer = soSaidPer;
    }

    public String getSoYear() {
        return soYear;
    }

    public void setSoYear(String soYear) {
        this.soYear = soYear;
    }

    public String SaveCWCMeetingsMinutes() {
        //System.out.println("Entry---------------->>>");
        String result = "error";
        cWCMeetingMinutesDTOs = new ArrayList<CWCMeetingMinutesDTO>();
        String homeid = ActionContext.getContext().getSession().get("homeid").toString();
        //System.out.println("before CWC ID---------------->>>");
        int cwcid = caseWorkerService.getCwcIdBasedOnUserIdAndStatus(ActionContext.getContext().getSession().get("userid").toString(), "active");
        System.out.println("CWC ID and date ---------------->>>" + cwcid + "  " + getDateofcwcmeeting());

        Date orderdate = StringToDate.getStringToDate("12/12/2016");//getDateofcwcmeeting());

        System.out.println("CWC ID and date ---------------->>>" + cwcid + "  " + orderdate);
        int meetingId = -1;
        try {

            getCwcMeetings().setMeetingDate(orderdate);
            getCwcMeetings().setCwcId(cwcid);
            getCwcMeetings().setNoOfMembers(noOfMembers);
            getCwcMeetings().setVenue(venue);

            //System.out.println("CWC Meetings---------------->>>"+getCwcMeetings());
            meetingId = caseWorkerService.saveMeeting(getCwcMeetings());
            //System.out.println("CWC Meetings Id---------------->>>"+meetingId);

            if (meetingId != -1) {

                for (int i = 0; i < orderIssued.length; i++) {

                    cwcMinutesPK.setMeetingId(meetingId);
                    cwcMinutesPK.setChildProfileId(childProfileId_cwc[i]);
                    cwcMinutes.setCwcMinutesPK(cwcMinutesPK);
                    cwcMinutes.setCwcId(cwcid);
                    cwcMinutes.setActiontobeTaken(actiontobeTaken[i]);
                    cwcMinutes.setCwcJjbOrderNo(cwcJjbOrderNo[i]);
                    cwcMinutes.setFollowUp(followUp[i]);
                    cwcMinutes.setObservations(observations[i]);
                    cwcMinutes.setOrderDate(orderdate);
                    cwcMinutes.setOrderIssued(orderIssued[i]);
                    cwcMinutes.setRemarks(remarks[i]);
                    cwcMinutes.setHomeId(homeid);

                    if (orderIssued[i].equals("Interviewagian")) {
                        System.out.println("case wrkr action:: order issued" + orderIssued[i]);
                        String res = caseWorkerService.InterChAgain(meetingId, cipiDay, cipiYear, cName, cpFat, cAge, cVil, cpDD, cpPs, cpName, cpPer, cpHome, cpNd, cpDay, cpMon, cpYr);

                    } else if (orderIssued[i].equals("transfer")) {
                        System.out.println("case wrkr action:: order issued" + orderIssued[i]);
                        String res = caseWorkerService.soGiven(meetingId, soDDNo, soBank, soYear, soPS, soName, soCareName, soCareAddr, soSaidPer);

                    } else if (orderIssued[i].equals("handover")) {
                        System.out.println("case wrkr action:: order issued" + orderIssued[i]);
                        System.out.println("case wrkr action:: order issued pname" + pname);
                        System.out.println("case wrkr action:: order issued phouse" + phouse);
                        System.out.println("case wrkr action:: order issued page" + page);
                        String res = caseWorkerService.pendInq(meetingId, pname, phouse, pstreet, pvilTwn, pdis, pstate, pchild, page);

                    } else if (orderIssued[i].equals("callfordpo")) {
                        System.out.println("case wrkr action:: order issued" + orderIssued[i]);
                        String res = caseWorkerService.saveCallFDpo(meetingId, sirDay, sirAge, sirFat, sirFir, sirName, sirPl, sirPs, sirRDt, sirSec, sirYr, sirthDt);

                    }
                    caseWorkerService.saveCWCMeetingsMinutes(cwcMinutes, childProfileId_cwc[i], ActionContext.getContext().getSession().get("userid").toString());

                }
                result = "success";
            } else {
                result = "error";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (result.equalsIgnoreCase("success")) {
            setMessage(getText("mess.succ.saveCWCMeetMin"));
        } else if (result.equalsIgnoreCase("error")) {
            setMessage(getText("mess.fail.saveCWCMeetMin"));
        }

        return result;
    }

    public String getMeetingDate() {
        String result = "error";
        //System.out.println(getCwc_fromdate()+"--"+getCwc_todate()+"--"+request.getParameter("homeId"));
        String userid = ActionContext.getContext().getSession().get("userid").toString();
        Date from_date = StringToDate.getStringToDate(getCwc_fromdate());
        Date to_date = StringToDate.getStringToDate(getCwc_todate());
        request.setAttribute("userid", userid);
        String homid = request.getParameter("homeId").trim();//ActionContext.getContext().getSession().get("homeid").toString();

        try {
            //setCwcMinuteslist(caseWorkerService.getCwcMinutesDates(homid, from_date, to_date));//commented by anupam on 8-2-2012

            setCwcMeetingOverViewDTOList(caseWorkerService.getCwcMinutesOverViewDTOs(homid, from_date, to_date));//commented by anupam on 8-2-2012

            //System.out.println("cwcminutesOVERVIEW list------------------------------>>"+cwcMeetingOverViewDTOList);
            //  ActionContext.getContext().getSession().put("homeid",homeId);
            setHomeId(homid);

            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     *
     * public List<CwcMinutes>getCWCMeetingMinutesDetails(String homeid,Date
     * selectdate);
     *
     * public CwcMeetings getCwcMeetingDetails(int meetingId);
     *
     * @return
     */
    public String getMeetingMinutes() {
        //System.out.println("in side ------------------------------>>getMeetingMinutes()");
        String result = "error";

        try {

            //----------Date stuff START
            String homeid = request.getParameter("homeid").trim();
            String theDate = getSelectedMeetingdate();
            String[] dateArr = theDate.split("/");
            theDate = dateArr[1] + "/" + dateArr[0] + "/" + "20" + dateArr[2];
            //System.out.println("the date----------------------------------------------------"+theDate);
            Date selectedDate = StringToDate.getStringToDate(theDate);

            //----------date stuff END
            //1.fetch the list of cwc minutes list
            setMinuteses(caseWorkerService.getCWCMeetingMinutesDetails(homeid, selectedDate));
            //getMinuteses().get(0).getCwcMinutesPK().getChildProfileId(); 
            //2.fetch meeting id from the list

            int meetingId = getMinuteses().get(0).getCwcMinutesPK().getMeetingId();

            //3.get the meeting details based on meeting id
            setCwcMeetings(caseWorkerService.getCwcMeetingDetails(meetingId));

            //System.out.println("------------------------------------------"+getMinuteses()+"----"+getCwcMeetings());
            result = "success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    private String mid;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    private List<CwcHop> ch;

    public List<CwcHop> getCh() {
        return ch;
    }

    public void setCh(List<CwcHop> ch) {
        this.ch = ch;
    }

    public String getMeetingJasper() {

        //cwcMinutes = adminService.ggetCWCMinutes(mid);
        System.out.println("case worker action--->getMeetingJasper" + mid);
        Object cm = (Object) adminService.getCWCMinutes(mid);

        System.out.println("cm class type***->" + cm.getClass().getSimpleName());

        if (cm instanceof CwcHop) {
            CwcHop ch1 = (CwcHop) cm;
            System.out.println("in action--CwcHop-->CaseWorkerAction-->" + ch1.getMeetingId());

            List cWCHop = new ArrayList();

            cWCHop.add(ch1);
            setCh(cWCHop);

        }
        //System.out.println("meeting id---->"+o2.getMeetingId());
        //System.out.println("cipi year----->"+o2.getCipiYear());

        return "handover";
        /*   else if(cm instanceof CwcUppi)
       {
           CwcUppi ci=(CwcUppi)cm;
           
           setO2(ci);
        //   return "uppi";
       }
       else if(cm instanceof CwcSir)
       {
           CwcSir cs=(CwcSir)cm;
           
           setO2(cs);
       //    return "callfordpo";
       }
       else if(cm instanceof CwcSo)
       {
           CwcSo cs=(CwcSo)cm;
           
           setO2(cs);
       //    return "interviewagian";
       }
       
       return "rep-success";*/
    }

    public void exportToPdf() { // no return type
        try {
            Document document = new Document();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PdfWriter.getInstance(document, baos);

            System.out.println("case worker action--->getMeetingJasper" + mid);
            Object cm = (Object) adminService.getCWCMinutes(mid);

            System.out.println("cm class type***->" + cm.getClass().getSimpleName());
            ServletOutputStream outputStream = hsr.getOutputStream();
            Font f = new Font(Font.getFamilyIndex("TIMES_ROMAN"), 12, Font.BOLD | Font.UNDERLINE);
            Font f1 = new Font(Font.getFamilyIndex("TIMES_ROMAN"), 12, Font.BOLD);
            if (cm instanceof CwcUppi) {
                CwcUppi ch1 = (CwcUppi) cm;
                System.out.println("in action--CwcHop-->CaseWorkerAction-->" + ch1.getMeetingId());
                document.open();
                //Font f=new Font(Font.getFamilyIndex("TIMES_ROMAN"), 12,    Font.BOLD|Font.UNDERLINE);
                //Font f=new Font(Font.UNDERLINE);

                Paragraph heading = new Paragraph("UNDERTAKING BY THE PARENT OR GUARDIAN OR FIT PERSON GIVEN INTERIM CUSTODY PENDING INQUIRY", f);
                Paragraph heading2 = new Paragraph("FORM 2", f);
                heading2.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading2);
                Paragraph heading3 = new Paragraph("[Rule 8 (7)]", f);
                heading3.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading3);
                heading.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading);

                Paragraph p = new Paragraph();

                Font georgia = FontFactory.getFont("georgia", 10f);

                String text = "The result can be seen below, which shows the text  having been written to the document but it looks a mess. Chunks have no concept of how to force a new line when the length exceeds the available width in  the document. Really, all they should be used for is  to change or set the style of a word or phrase inline.";
                Font brown = new Font(Font.COURIER, 9f, Font.NORMAL, new Color(163, 21, 21));
                Font lightblue = new Font(Font.COURIER, 9f, Font.NORMAL, new Color(43, 145, 175));
                Font courier = new Font(Font.COURIER, 9f);

                Chunk beginning = new Chunk(text, f);
                Phrase p1 = new Phrase(beginning);
                Chunk c1 = new Chunk("You can of course force a newline using \"", f);
                Chunk c2 = new Chunk("\n", brown);
                Chunk c3 = new Chunk("\" or ", f);
                Chunk c4 = new Chunk("Environment", lightblue);
                Chunk c5 = new Chunk(".NewLine", courier);
                Chunk c6 = new Chunk(", or even ", f);
                Chunk c7 = new Chunk("Chunk", lightblue);
                Chunk c8 = new Chunk(".NEWLINE", courier);
                Chunk c9 = new Chunk(" as part of the string you give a chunk.", f);

                Phrase p2 = new Phrase();

                p2.add(c9 + "fhdjkasfhkja" + c8);
                p2.add(c8);
                p2.add(c7);
                p2.add(c6);
                p2.add(c5);
                p2.add(c4);
                p2.add(c3);
                p2.add(c2);
                p2.add(c1);

                p1.add(c2);
                p1.add(c3);
                p1.add(c4);
                p1.add(c5);
                p1.add(c6);
                // document.add(p);

                //  document.add(new Paragraph("Whereas I, "));
                // document.add(p2);
                //  document.add(new Paragraph("Whereas I, "));
                // document.add(new Paragraph("Whereas I, "));
                //document.add(p1);  
                Phrase p4 = new Phrase();
                Chunk cp1 = new Chunk("Whereas I,..");

                p4.add(cp1);
                Chunk cp2 = new Chunk(ch1.getPName(), f1);
                p4.add(cp2);
                Chunk cp3 = new Chunk("...(Name) resident of House no... ");
                p4.add(cp3);
                Chunk cp31 = new Chunk(ch1.getPHouse(), f1);
                p4.add(cp31);
                Chunk cp32 = new Chunk("... Street.. ");
                p4.add(cp32);
                Chunk cp33 = new Chunk(ch1.getPStreet(), f1);
                p4.add(cp33);
                Chunk cp34 = new Chunk("...Village/Town..");
                p4.add(cp34);
                Chunk cp34_2 = new Chunk(ch1.getPVilTwn(), f1);
                p4.add(cp34_2);
                Chunk cp35 = new Chunk("..District..");
                p4.add(cp35);
                Chunk cp36 = new Chunk(ch1.getPDis(), f);
                p4.add(cp36);
                Chunk cp37 = new Chunk("...State……");
                p4.add(cp37);
                Chunk cp38 = new Chunk(ch1.getPState(), f);
                p4.add(cp38);

                //p4.add(new Chunk(" (Name) resident of House no "+new Chunk()+". Street "+new Chunk(ch1.getCpPs(), f)+".Village/Town"+ch1.getCVil()+".District"+ch1.getCpDD()+"………"));
                p4.add(new Chunk("..do hereby declare that I am willing to take charge of (name of the child)..." + new Paragraph(ch1.getPChild(), f).getContent() + "...aged……" + new Paragraph(ch1.getPAge(), f).getContent() + "...under the orders of the Board."));
                document.add(p4);
                Paragraph p5 = new Paragraph();
                Chunk cp9 = new Chunk("subject to the following terms and conditions:\n");
                p5.add(cp9);
                Chunk cp10 = new Chunk("1. That I have annexed true, correct and authentic identification and address proof of myself.");
                p5.add(cp10);
                document.add(p5);
                document.add(new Paragraph("2. That I undertake to produce him/her before the Board as and when required."));
                document.add(new Paragraph("3. That I shall do my best for the welfare and education of the child as long as he/ she remains in my charge and shall make proper provision for his/her maintenance."));
                document.add(new Paragraph("4. That in the event of his/her illness, he/she shall have proper medical attention in the nearest\n hospital and a report of it followed by a fitness certificate shall be submitted before the Board."));
                document.add(new Paragraph("5. That I shall do my best to ensure that the child will not be subjected to any form of abuse/ neglect or exploitation"));
                document.add(new Paragraph("6. That if his/her conduct requires further supervision or care and protection, I shall at once inform the Board."));
                document.add(new Paragraph("7. That if the child goes out of my charge or control, I shall immediately inform the Board."));
                document.add(new Paragraph("Date this ………………..day of …....20...\n\n"));
                document.add(new Paragraph("Signature of person executing the Undertaking/ Bond", f1));
                document.add(new Paragraph("(Signed before me)", f1));
                document.add(new Paragraph("Juvenile Justice Board", f1));

                document.close();

                baos.writeTo(outputStream);
                hsr.setHeader("Content-Disposition", "inline; filename=\"cci.pdf\"");
            } else if (cm instanceof CwcSir) {
                CwcSir ch1 = (CwcSir) cm;
                System.out.println("in action--CwcHop-->CaseWorkerAction-->" + ch1.getMeetingId());
                document.open();
                //Font f=new Font();
                // Font f=new Font(Font.getFamilyIndex("TIMES_ROMAN"), 12,    Font.BOLD|Font.UNDERLINE);
                Paragraph heading = new Paragraph("ORDER FOR SOCIAL INVESTIGATION REPORT OF CHILD IN NEED OF CARE AND PROTECTION", f);
                heading.setAlignment(Paragraph.ALIGN_CENTER);
                //document.add(heading);
                Paragraph heading2 = new Paragraph("FORM 21", f);
                heading2.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading2);
                Paragraph heading3 = new Paragraph("[Rule 19 (3)]", f);
                heading3.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading3);

                Paragraph m1 = new Paragraph();
                document.add(heading);
                document.add(new Paragraph("\n"));
                document.add(new Paragraph("To,"));

                document.add(new Paragraph("   Child Welfare Officer/ Social Worker/Case Worker/ Person in-charge of Home/ representative of Non- Governmental Organization\n"));
                //  Phrase pa1=new Phrase(new Chunk(ch1.getSirName(),f1));

                Chunk cdp1 = new Chunk("        Whereas a report under section 31(2) of the Juvenile Justice(Care and Protection of Children) Act,2015 has been received from...");
                Phrase pdp1 = new Phrase(cdp1);

                Chunk cdp2 = new Chunk(ch1.getSirPs(), f);
                Phrase pdp2 = new Phrase(cdp2);

                Chunk cdp3 = new Chunk("...in respect of (name of the child)…");
                Phrase pdp3 = new Phrase(cdp3);

                Chunk cdp4 = new Chunk(ch1.getSirName() + "", f);
                Phrase pdp4 = new Phrase(cdp4);

                Chunk cdp41 = new Chunk("...aged(approximate)…");
                Phrase pdp41 = new Phrase(cdp41);

                Chunk cdp42 = new Chunk(ch1.getSirAge() + "", f);
                Phrase pdp42 = new Phrase(cdp42);

                Chunk cdp43 = new Chunk("...son/daughter of…");
                Phrase pdp43 = new Phrase(cdp43);

                Chunk cdp44 = new Chunk(ch1.getSirFat(), f);
                Phrase pdp44 = new Phrase(cdp44);

                Chunk cdp45 = new Chunk("...residing at..");
                Phrase pdp45 = new Phrase(cdp45);

                Chunk cdp46 = new Chunk(ch1.getSirPl(), f);
                Phrase pdp46 = new Phrase(cdp46);

                Chunk cdp5 = new Chunk("...,who has been produced before the Committee under section 31 of the Juvenile Justice(Care and Protection of Children) Act,2015.");
                Phrase pdp5 = new Phrase(cdp5);

                //       Chunk cdp7=new Chunk(ch1.getSirPl()+"",f);
                //       Phrase pdp7=new Phrase(cdp7);
                m1.add(pdp1);
                m1.add(pdp2);
                m1.add(pdp3);
                m1.add(pdp4);
                m1.add(pdp41);
                m1.add(pdp42);
                m1.add(pdp43);
                m1.add(pdp44);
                m1.add(pdp45);
                m1.add(pdp46);
                m1.add(pdp5);

                document.add(m1);

                document.add(new Paragraph("      You are hereby directed to conduct Social Investigation as per Form22 for the above child.You are directed to enquire into socio economic and family background of the said child."));

                Chunk cdp91 = new Chunk("        You are directed to submit the Social Investigation Report on or before..");
                Phrase pdp91 = new Phrase(cdp91);

                Chunk cdp92 = new Chunk(ch1.getSirthDt(), f);
                Phrase pdp92 = new Phrase(cdp92);

                Chunk cdp93 = new Chunk("..(date)");
                Phrase pdp93 = new Phrase(cdp93);

                Paragraph p2 = new Paragraph();
                p2.add(pdp91);
                p2.add(pdp92);
                p2.add(pdp93);

                document.add(p2);

                //     document.add(new Paragraph(+pa1+"…(Name of the Child), son/daughter of…"+ch1.getSirFat()+""+ch1.getSirAge()+));
                //     document.add(new Paragraph("at……"+ch1.getSirPl()+));
                document.add(new Paragraph("Dated this …" + ch1.getSirRepDt() + "….day of ……" + ch1.getSirDay() + "…20" + ch1.getSirYr()));
                document.add(new Paragraph("\n\n(Signature)", f1));
                document.add(new Paragraph("\nChairperson/Member", f1));
                document.add(new Paragraph("\nChild Welfare Committee", f1));

                document.close();

                baos.writeTo(outputStream);
                hsr.setHeader("Content-Disposition", "inline; filename=\"SocInv.pdf\"");

            } else if (cm instanceof CwcSo) {
                CwcSo ch1 = (CwcSo) cm;
                System.out.println("in action--CwcHop-->CaseWorkerAction-->" + ch1.getMeetingId());

                document.open();

                Paragraph heading2 = new Paragraph("FORM 18", f);
                heading2.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading2);

                Paragraph heading3 = new Paragraph("[Rule 18(5),18(9) and 19(26)]", f);
                heading3.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading3);

                Paragraph heading = new Paragraph("ORDER OF PLACMENT OF A CHILD IN AN INSTITUTION", f);
                heading.setAlignment(Paragraph.ALIGN_CENTER);

                document.add(heading);

                Paragraph heading4 = new Paragraph("(Children's Home/Fit Facility/SAA)\n", f);
                heading4.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading4);

                Paragraph pso3 = new Paragraph();
                //document.add(heading);
                //document.add(new Paragraph("\n"));

                Phrase p1 = new Phrase(Chunk.NEWLINE);
                pso3.add(p1);

                // Phrase p11= new Phrase("(Children's Home/Fit Facility/SAA)\n");
                // pso3.add(p11);
                //   Phrase p22= new Phrase(new Chunk(ch1.getSoDDNo(), f));
                Phrase p23 = new Phrase("Case No....");
                Chunk c21 = new Chunk(ch1.getSoDDNo(), f);
                Phrase p221 = new Phrase(c21 + ".....");

                Phrase p2 = new Phrase("\nTo");
                Phrase p22 = new Phrase("\nThe Officer-in-Charge\n");

                // Phrase p24= new Phrase(new Chunk(ch1.getSoYear()+"", f));        
                // Phrase p25=new Phrase("………PS……");
                // Phrase p26=new Phrase(new Chunk(ch1.getSoPS(),f));
                pso3.add(p23);
                pso3.add(p221);
                pso3.add(p2);
                pso3.add(p22);//pso3.add(p24);pso3.add(p26);

                document.add(pso3);
                Chunk c1 = new Chunk("\n          Whereas on the ...");
                Phrase p11 = new Phrase(c1);

                Chunk c2 = new Chunk(ch1.getSoDDNo(), f);
                Phrase p12 = new Phrase(c2);

                Chunk c3 = new Chunk("...day of..");
                Phrase p13 = new Phrase(c3);

                Chunk c4 = new Chunk(ch1.getSoName(), f);
                Phrase p14 = new Phrase(c4);

                Chunk c5 = new Chunk(".20");
                Phrase p15 = new Phrase(c5);

                Chunk c6 = new Chunk(ch1.getSoYear() + "");
                Phrase p16 = new Phrase(c6);

                Chunk c7 = new Chunk(". (name of the child) ...");
                Phrase p17 = new Phrase(c7);

                Chunk c8 = new Chunk(ch1.getSoName(), f);
                Phrase p18 = new Phrase(c8);

                Chunk c9 = new Chunk("...son/daughter of..");
                Phrase p19 = new Phrase(c9);

                Chunk c10 = new Chunk(ch1.getSoName(), f);
                Phrase p20 = new Phrase(c10);

                Chunk c11 = new Chunk("...aged..");
                Phrase p21 = new Phrase(c11);

                Chunk c12 = new Chunk(ch1.getSoDDNo(), f);
                Phrase p33 = new Phrase(c12);

                Chunk c14 = new Chunk("..residing at..");
                Phrase p34 = new Phrase(c14);

                Chunk c15 = new Chunk(ch1.getSoCareAddr(), f);
                Phrase p35 = new Phrase(c15);

                Chunk c16 = new Chunk("..being in care and protection under the Juvenile Justice(care and protection) act 2015 is ordered by the Child Welfare Committee..");
                Phrase p36 = new Phrase(c16);

                Chunk c17 = new Chunk(ch1.getSoBank(), f);
                Phrase p37 = new Phrase(c17);

                Chunk c18 = new Chunk("..to be kept in the Children's Home/SAA/Fit Facility...");
                Phrase p38 = new Phrase(c18);

                Chunk c19 = new Chunk(ch1.getSoBank(), f);
                Phrase p39 = new Phrase(c19);

                Chunk c20 = new Chunk("..for a period of...");
                Phrase p40 = new Phrase(c20);

                Chunk c22 = new Chunk(ch1.getSoDDNo(), f);
                Phrase p442 = new Phrase(c22);

                Paragraph pso23 = new Paragraph();
                pso23.add(p11);
                pso23.add(p12);
                pso23.add(p13);
                pso23.add(p14);
                pso23.add(p15);
                pso23.add(p16);
                pso23.add(p17);
                pso23.add(p18);
                pso23.add(p19);
                pso23.add(p20);
                pso23.add(p21);
                pso23.add(p33);
                pso23.add(p34);
                pso23.add(p35);
                pso23.add(p36);
                pso23.add(p37);
                pso23.add(p38);
                pso23.add(p39);
                pso23.add(p40);
                pso23.add(p442);

                document.add(pso23);

                //Paragraph pso4= new Paragraph(ch1.getCwcMeetings().getMeetingDate()+"....day of ....20...");
                Paragraph pso4 = new Paragraph();
                Phrase p42 = new Phrase(new Chunk(ch1.getSoName(), f));
                //   Phrase p43=new Phrase(new Chunk(+ch1.getSoName()+"....son/daughter of......aged.....residing at..
                Phrase p44 = new Phrase(new Chunk("       This is to authorize and require you to recieve the said child in your charge,and to keep him/her in the Children's Home/ Fit Facility/ SAA..."));
                Chunk ch441 = new Chunk(ch1.getSoPS(), f);
                Phrase p441 = new Phrase(ch441);

                Phrase p45 = new Phrase(new Chunk("...for the aforesaid order to be carried into execution according to law.The concerned official shall upload the details in case of an orphan or abandoned child in the TrackChild/ relevant Web Portal.\n\n"));
                Phrase p46 = new Phrase(new Chunk("Given under my hand and the seal of Child Welfare Committee.\n"));
                Phrase p47 = new Phrase(new Chunk("This ..."));

                Chunk ch472 = new Chunk(ch1.getSoCareName(), f);
                Phrase p472 = new Phrase(ch472);

                Phrase p473 = new Phrase(new Chunk("..day of..20"));

                Chunk ch474 = new Chunk(ch1.getSoYear() + "", f);
                Phrase p474 = new Phrase(ch474);

                Phrase p51 = new Phrase(new Chunk("\n\n\n(Signature)", f1));
                Phrase p52 = new Phrase(new Chunk("\nChairperson/ Member", f1));
                Phrase p53 = new Phrase(new Chunk("\nChild Welfare Committee", f1));

                Phrase p61 = new Phrase(new Chunk("\n\nEncl:"));
                Phrase p62 = new Phrase(new Chunk("\nCopy of the orders,particulars of home and previous record,case history and individual care plan,as applicable:"));
                pso4.add(p44);
                pso4.add(p441);
                pso4.add(p45);
                pso4.add(p46);
                pso4.add(p47);
                pso4.add(p472);
                pso4.add(p473);
                pso4.add(p474);
                pso4.add(p51);
                pso4.add(p52);
                pso4.add(p53);

                pso4.add(p61);
                pso4.add(p62);
                document.add(pso4);

                /*
        Phrase p44=new Phrase(new Chunk(ch1.getSoName(),f));
        Phrase p45=new Phrase(new Chunk(". (address)..."));
        Phrase p46=new Phrase(new Chunk(ch1.getSoCareAddr(),f));
        Phrase p47=new Phrase(new Chunk("…on executing a bond by the said ………"));
        Phrase p48=new Phrase(new Chunk(ch1.getSoSaidPer(),f));
        Phrase p49=new Phrase(new Chunk("…. and the Board is satisfied that it is expedient to deal with the said child by making an order placing him/her under supervision."));        
        
        pso4.add(p42);pso4.add(p43);pso4.add(p44);pso4.add(p45);pso4.add(p46);pso4.add(p47);pso4.add(p48);pso4.add(p49);
        document.add(pso4);
      //  document.add(new Paragraph("Whereas …"+ch1.getSoName()+". (name of the child) is alleged to have committed an offence and is"));
      //  document.add(new Paragraph(""+ch1.getSoCareName()+".. (address)…"+ch1.getSoCareAddr()+"…on"));
      //  document.add(new Paragraph("executing a bond by the said …"+ch1.getSoName()+" and the Board is satisfied that it is expedient to"));
     //   document.add(new Paragraph("deal with the said child by making an order placing him/her under supervision."));
        Paragraph pso5 = new Paragraph(new Phrase(new Chunk("It is hereby ordered that the said child be placed under the supervision of …")));
        Phrase p51=new Phrase(new Chunk(ch1.getSoSaidPer(), f));
        Phrase p52=new Phrase(new Chunk("...a period of…"));
        Phrase p53=new Phrase(new Chunk(ch1.getSoYear()+"",f));
        Phrase p54=new Phrase(new Chunk("…subject to the following conditions:"));
        pso5.add(p51);pso5.add(p52);pso5.add(p53);pso5.add(p54);
        document.add(pso5);
        
        Paragraph pso6 = new Paragraph(new Phrase(new Chunk("1. That the child shall reside at…")));
        Phrase p61=new Phrase(new Chunk(ch1.getSoCareAddr(), f));
        Phrase p62=new Phrase(new Chunk("...a period of.."));
        Phrase p63=new Phrase(new Chunk(ch1.getSoYear()+"",f));
        Phrase p64=new Phrase(new Chunk("…..and shall be produced before the Board as and when directed."));
        pso6.add(p61);pso6.add(p62);pso6.add(p63);pso6.add(p64);
        document.add(pso6);
        
        
        Paragraph pso7 = new Paragraph(new Phrase(new Chunk("2. That the child shall not be allowed to quit the district jurisdiction of...")));
        Phrase p71=new Phrase(new Chunk(ch1.getSoCareAddr(), f));
        Phrase p72=new Phrase(new Chunk("..without the permission of the Board."));
        pso7.add(p71);pso7.add(p72);
        document.add(pso7);
        
        
        document.add(new Paragraph("3. That the child shall not be allowed to associate with such person who shall negatively influence the child"));
        document.add(new Paragraph("4. That the person under whose care the child is placed shall arrange for the proper care, education and welfare of the child."));
        document.add(new Paragraph("5. That the preventive measures will be taken by the person under whose care the child is placed to see that the child does not commit any offence punishable by any law in India."));
        document.add(new Paragraph("6. That the child shall be prevented from taking narcotic drugs or psychotropic substances or any other intoxicants. The person under whose supervision the child is placed shall report any such act of the child to the Board.\n\n\n"));
        document.add(new Paragraph("Dated this…………….day of…"+ch1.getSoCareAddr()+"... 20"+ch1.getSoYear()+"\n\n"));
        document.add(new Paragraph("(Signature)",f1));
        document.add(new Paragraph("Chairperson/Member",f1));
        document.add(new Paragraph("Child Welfare Commitee",f1));
        document.add(new Paragraph("Note: Additional, conditions, if any may be inserted by the Juvenile Justice Board. "));
                 */
                document.close();

                baos.writeTo(outputStream);
                hsr.setHeader("Content-Disposition", "inline; filename=\"SupOrd.pdf\"");
            } else if (cm instanceof CwcHop) {
                CwcHop ch1 = (CwcHop) cm;
                System.out.println("in action--CwcHop-->CaseWorkerAction-->" + ch1.getMeetingId());
                document.open();
                // Font f=new Font(Font.getFamilyIndex("TIMES_ROMAN"), 12,    Font.BOLD|Font.UNDERLINE);

                Paragraph heading = new Paragraph("UNDERTAKING BY THE PAERNT OR GUARDIAN OF 'FIT PERSON'", f);
                heading.setAlignment(Paragraph.ALIGN_CENTER);

                Paragraph heading2 = new Paragraph("FORM 20", f);
                heading2.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading2);
                Paragraph heading3 = new Paragraph("[Rule 18 (8) and 19(7)]", f);
                heading3.setAlignment(Paragraph.ALIGN_CENTER);
                document.add(heading3);

                document.add(heading);
                document.add(new Paragraph("\n"));

                document.add(new Paragraph(""));

                Phrase ph1 = new Phrase(new Chunk("           I.."));
                Chunk c11 = new Chunk(ch1.getCpFat(), f);
                Phrase ph2 = new Phrase(c11);

                Chunk c12 = new Chunk("..resident of House no..");
                Phrase ph3 = new Phrase(c12);

                Chunk ch4 = new Chunk(ch1.getCpNd(), f);
                Phrase ph4 = new Phrase(ch4);

                Chunk ch5 = new Chunk("..Street....");
                Phrase ph5 = new Phrase(ch5);

                Chunk ch6 = new Chunk(ch1.getCpPs(), f);
                Phrase ph6 = new Phrase(ch6);

                Chunk ch7 = new Chunk("......Village/Town...");
                Phrase ph7 = new Phrase(ch7);

                Chunk ch8 = new Chunk(ch1.getCVil(), f);
                Phrase ph8 = new Phrase(ch8);

                Chunk ch9 = new Chunk("...District..");
                Phrase ph9 = new Phrase(ch9);

                Chunk ch10 = new Chunk(ch1.getCpDD(), f);
                Phrase ph10 = new Phrase(ch10);

                Chunk ch11 = new Chunk(", …State...");
                Phrase ph11 = new Phrase(ch11);

                Chunk ch12 = new Chunk(ch1.getCpPs(), f);
                Phrase ph12 = new Phrase(ch12);

                Chunk ch13 = new Chunk("....do here by declare that I am willing to take charge of(name of child)…");
                Phrase ph13 = new Phrase(ch13);

                Chunk ch14 = new Chunk(ch1.getCName(), f);
                Phrase ph14 = new Phrase(ch14);

                Chunk ch15 = new Chunk("..aged……");
                Phrase ph15 = new Phrase(ch15);

                Chunk ch16 = new Chunk(ch1.getCAge(), f);
                Phrase ph16 = new Phrase(ch16);

                Chunk ch17 = new Chunk("..,Under the orders of the Child Welfare Committee……");
                Phrase ph17 = new Phrase(ch17);

                Chunk ch18 = new Chunk(ch1.getCVil(), f);
                Phrase ph18 = new Phrase(ch18);

                Chunk ch19 = new Chunk("....subject to the following terms and conditions:");
                Phrase ph19 = new Phrase(ch19);

                Paragraph prho1 = new Paragraph();
                prho1.add(ph1);
                prho1.add(ph2);
                prho1.add(ph3);
                prho1.add(ph4);
                prho1.add(ph5);
                prho1.add(ph6);
                prho1.add(ph7);
                prho1.add(ph8);
                prho1.add(ph9);
                prho1.add(ph10);
                prho1.add(ph11);
                prho1.add(ph12);
                prho1.add(ph13);
                prho1.add(ph14);
                prho1.add(ph15);
                prho1.add(ph16);
                prho1.add(ph17);
                prho1.add(ph18);
                prho1.add(ph19);

                document.add(prho1);

                document.add(new Paragraph("\n    1.If his conduct is unsatisfactory I shall at once inform the Committee."));
                document.add(new Paragraph("   2.I shall do my best for the welfare and education of the said child as long as he remains"));
                document.add(new Paragraph("      in my charge and shall make proper provision for his maintainance."));
                document.add(new Paragraph("   3.In the event of his/her illness,he shall have proper medical attention to the nearest hospital."));
                document.add(new Paragraph("   4.I agree to adhere to the conditions that may be imposed by the Committee from time to time "));
                document.add(new Paragraph("      and also too keep the Committee informed about the compliance as and when required."));
                document.add(new Paragraph("   5.I undertake to produce him/her before the Committee as and when required."));
                document.add(new Paragraph("   6.I shall inform the Committee immediately if the child goes out of my charge or control."));

                Chunk ch31 = new Chunk("\n\nDated this... ");
                Phrase ph31 = new Phrase(ch31);

                Chunk ch32 = new Chunk(ch1.getCipiDay(), f);
                Phrase ph32 = new Phrase(ch32);

                Chunk ch33 = new Chunk("..day of..20");
                Phrase ph33 = new Phrase(ch33);

                Chunk ch34 = new Chunk(ch1.getCipiYear(), f);
                Phrase ph34 = new Phrase(ch34);

                Paragraph prho3 = new Paragraph();
                prho3.add(ph31);
                prho3.add(ph32);
                prho3.add(ph33);
                prho3.add(ph34);

                document.add(prho3);

                Paragraph sign = new Paragraph("\n\nSignature", f1);
                sign.setAlignment(Paragraph.ALIGN_RIGHT);
                document.add(sign);

                Paragraph cwc = new Paragraph("Signed before Child Welfare Committee", f1);
                cwc.setAlignment(Paragraph.ALIGN_RIGHT);
                document.add(cwc);

                document.close();

                baos.writeTo(outputStream);
                hsr.setHeader("Content-Disposition", "inline; filename=\"handover.pdf\"");

            }
            hsr.setContentType("application/pdf");
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            //catch
        }

    }
    //added by anupam on 29-02-2012 START

    public String getLoggedInhome() {
        return ActionContext.getContext().getSession().get("homeid").toString();

    }

    public String admissionCheck() {
        String result = "notfound";
        List<ChildMaster> childMasters = new ArrayList<ChildMaster>();
        ////System.out.println("------inside admissionCheck------- childName = "+getChildName()+" ------ cwcNo = "+getCwcNo());
        if (getChildName().trim().equalsIgnoreCase("") && !getCwcNo().trim().equalsIgnoreCase("")) {
            ////System.out.println("------inside admissionCheck------- IF "); 
            childMasters = caseWorkerService.getChildBasedOnCwcNoInAHome(getLoggedInhome(), getCwcNo());
        } else if (getCwcNo().trim().equalsIgnoreCase("") && !getChildName().trim().equalsIgnoreCase("")) {
            ////System.out.println("------inside admissionCheck------- ELSE IF ");    
            childMasters = caseWorkerService.getChildBasedOnNameInAHome(getLoggedInhome(), getChildName());
        } else {
            ////System.out.println("------inside admissionCheck------- ELSE");    
            childMasters = caseWorkerService.getChildBasedOnCwcNoOrNameInAHome(getLoggedInhome(), getCwcNo(), getChildName());
        }

        if (!childMasters.isEmpty()) {
            setChildrenListInAHome(childMasters);
            result = "found";
        } else {
            result = "notfound";
        }

        setChildName(childName);
        String[] arr = {cwcNo};
        setCwcJjbOrderNo(arr);
        ////System.out.println("------inside admissionCheck------- return val =  "+result);     
        return result;

    }

    //added by anupam on 29-02-2012 END
    //added by anupam on 2-3-2012 START
    public String populateAvailableCaseWorkInAHome() {

        setChildrenListInAHome(caseWorkerService.populateAvailableCaseWorkInAHome(getLoggedInhome()));
        return "success";

    }

    //added by anupam on 2-3-2012 END
    /*---------------Case worker Methods End-----------------------------*/
    //Added by vinumol 08-03-2012
    public String getAdmissionRegisterDetails() {

        try {
            //System.out.println("this is viewAdmisionfirst");
            String child_homeid = getSession().get("homeid").toString();
            if (child_homeid == null ? "" == null : child_homeid.equals("")) {
                return "error";
            } else {
                if (testing.equalsIgnoreCase("viewadmissionfirst")) {
                    return "success";
                } else if (testing.equalsIgnoreCase("viewadmission_dateselect")) {
                    Date fromdate = StringToDate.getStringToDate(getAdmission_fromdate());
                    Date todate = StringToDate.getStringToDate(getAdmission_todate());
                    //System.out.println("The dates are...##################"+fromdate+"@@@@@@"+todate);
                    setChildrenListInAHome(caseWorkerService.viewAdmisiionChild_by_homeid(fromdate, todate, child_homeid));
                    ////System.out.println("The list is#################"+child_profid_list.get(0).getChildProfileId());

                    return "success";
                } else if (testing.equalsIgnoreCase("viewadmission_profidselect")) {
                    admissionRegister_show = caseWorkerService.getChildAdmissionDetails(childProfileId);
                    return "success";
                } else {
                    return "success";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    public String viewDischargeChildLists() {
        try {
            //System.out.println("this is viewDischargefirst");
            String childmaster_homeid = getSession().get("homeid").toString();
            if (childmaster_homeid == null ? "" == null : childmaster_homeid.equals("")) {
                return "error";
            } else {
                if (testing.equalsIgnoreCase("viewdischargefirst")) {
                    return "success";
                } else if (testing.equalsIgnoreCase("viewdischarge_dateselect")) {
                    Date fromdate = StringToDate.getStringToDate(getDischarge_fromdate());
                    Date todate = StringToDate.getStringToDate(getDischarge_todate());
                    //System.out.println("Tha dates are...##################"+fromdate+"@@@@@@"+todate);
                    setChild_profid_list(caseWorkerService.viewDischargeChild_by_homeid(fromdate, todate, childmaster_homeid));
                    ////System.out.println("The list is#################"+child_profid_list.get(0).getChildProfileId());

                    return "success";
                } else if (testing.equalsIgnoreCase("viewdischarge_profidselect")) {
                    dreg = caseWorkerService.viewDischargeChild_by_Id(disreg_profid);
                    return "success";
                } else {
                    return "success";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    public String getInterviewRegisterChildPID() {
        String result = "error";
        String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
        try {
            setInterviewRegisterChild(caseWorkerService.getInterviewRegisterChildPID(currentHomeId));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getCaseworkViewChildPID() {
        String result = "error";
        String homeId = ActionContext.getContext().getSession().get("homeid").toString();

        try {
            //for getting child details from Child_details

            setChildPIDList(caseWorkerService.getCaseworkViewChildPID(homeId));
            //System.out.println("The list is+++++++++++++++"+getChildPIDList().get(0).getChildName());
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    public String getCaseHistoryChildPid() {
        String result = "error";
        String currentHomeId = ActionContext.getContext().getSession().get("homeid").toString();
        try {
            setCaseHistoryChildlist(caseWorkerService.getCaseHistoryChildPid(currentHomeId));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    //Ended by vinumol 08-03-2012

    public Object getModel() {
        //throw new UnsupportedOperationException("Not supported yet.");
        try {

            //System.out.println("form_name------------------------->>>>>>***************************************"+request.getParameter("formName"));
            if (request.getParameter("formName").equalsIgnoreCase("casework")) {
                //System.out.println("childDetails Name------------------->"+childDetails.getChildName());
                return childDetails;
            } else if (request.getParameter("formName").equalsIgnoreCase("discharge")) {
                return tansferDischargeDTO;
            } else if (request.getParameter("formName").equalsIgnoreCase("RHAdmission")) {
                return childMaster;
            } else if (request.getParameter("formName").equalsIgnoreCase("CHSHAdmission")) {
                return childMaster;
            } else if (request.getParameter("formName").equalsIgnoreCase("InterviewReg")) {
                return interviewRegister;
            } else if (request.getParameter("formName").equalsIgnoreCase("ch_personal")) {
                return casehistoryPersonal;
            } else if (request.getParameter("formName").equalsIgnoreCase("chhousehold")) {
                return cHChildHouseholdDTO;
            } else if (request.getParameter("formName").equalsIgnoreCase("chfamily")) {
                return casehistoryFamilyDetails;
            } else if (request.getParameter("formName").equalsIgnoreCase("chadol")) {
                return casehistoryAdolescenceDetails;
            } else if (request.getParameter("formName").equalsIgnoreCase("chemployee")) {
                return cHEmploymentDetailsDTO;
            } else if (request.getParameter("formName").equalsIgnoreCase("chpreeducation")) {
                return casehistoryPrioradmEducation;
            } else if (request.getParameter("formName").equalsIgnoreCase("chfamilycrime")) {
                return cHFamilyCrimeDetailsDTO;
            } else if (request.getParameter("formName").equalsIgnoreCase("chaftereducation")) {
                return cHAfterAdmEducationDTO;
            } else if (request.getParameter("formName").equalsIgnoreCase("chsocial")) {
                return casehistorySocialhistoryPrioradm;
            } else if (request.getParameter("formName").equalsIgnoreCase("CWView")) {
                return childDetails;
            } else if (request.getParameter("formName").equalsIgnoreCase("Viewinterview")) {
                return interviewRegister;
            } else if (request.getParameter("formName").equalsIgnoreCase("cwcmeets")) {
                return cWCMeetingMinutesDTOs;
            } else if (request.getParameter("formName").equalsIgnoreCase("view_cwcmeetings")) {
                return cwcMinutes;
            } else if (request.getParameter("formName").equalsIgnoreCase("ViewCWCMeetingDetails")) {
                return cwcMinutes;
            } else if (request.getParameter("formName").equalsIgnoreCase("form3")) {
                return fcForm3;
            } else if (request.getParameter("formName").equalsIgnoreCase("form4")) {
                return fcForm4;
            } else if (request.getParameter("formName").equalsIgnoreCase("form5")) {
                return fcForm5;
            } else if (request.getParameter("formName").equalsIgnoreCase("form8")) {
                return fcForm8;
            //} else if (request.getParameter("formName").equalsIgnoreCase("form9")) {
            //    return fcForm9;
           // } else if (request.getParameter("formName").equalsIgnoreCase("form10")) {
           //     return fcForm10;
            } else if (request.getParameter("formName").equalsIgnoreCase("form15")) {
                return fcForm15;
            } else if (request.getParameter("formName").equalsIgnoreCase("form17")) {
                return fcForm17;
            } else if (request.getParameter("formName").equalsIgnoreCase("form19")) {
                return fcForm19;
            } else if (request.getParameter("formName").equalsIgnoreCase("form20")) {
                return fcForm20;
             } else if (request.getParameter("formName").equalsIgnoreCase("form21")) {
                return fcForm21;    
           // } else if (request.getParameter("formName").equalsIgnoreCase("form22")) {
            //    return fcForm22;    
            } else if (request.getParameter("formName").equalsIgnoreCase("form23")) {
                return fcForm23;    
            } else if (request.getParameter("formName").equalsIgnoreCase("form24")) {
                return fcForm24;
            } else if (request.getParameter("formName").equalsIgnoreCase("form25")) {
                return fcForm25;
            } else if (request.getParameter("formName").equalsIgnoreCase("form26")) {
                return fcForm26;
           // } else if (request.getParameter("formName").equalsIgnoreCase("form30")) {
           //     return fcForm30;
           // } else if (request.getParameter("formName").equalsIgnoreCase("form31")) {
           //     return fcForm31;
            } else if (request.getParameter("formName").equalsIgnoreCase("form32")) {
                return fcForm32;
            } else if (request.getParameter("formName").equalsIgnoreCase("form33")) {
                return fcForm33;
            } else if (request.getParameter("formName").equalsIgnoreCase("form34")) {
                return fcForm34;
           // } else if (request.getParameter("formName").equalsIgnoreCase("form35")) {
           //     return fcForm35;
            } else if (request.getParameter("formName").equalsIgnoreCase("form36")) {
                return fcForm36;
            } else if (request.getParameter("formName").equalsIgnoreCase("form37")) {
                return fcForm37;
          //  } else if (request.getParameter("formName").equalsIgnoreCase("form38")) {
           //     return fcForm38;
            } else if (request.getParameter("formName").equalsIgnoreCase("form39")) {
                return fcForm39;
            } else if (request.getParameter("formName").equalsIgnoreCase("form42")) {
                return fcForm42;
            } else if (request.getParameter("formName").equalsIgnoreCase("form44")) {
                return fcForm44;
            } else if (request.getParameter("formName").equalsIgnoreCase("form45")) {
                return fcForm45;
            } else {
                return "Hello";
            }

        } catch (NullPointerException e) {
            //System.out.println("NPE------------------------->>>>>>88888888888888888888888888888888888888888888888888888888");
            return "Hello";
        }

    }

    public CaseWorkerAction() {
    }

    //added by anupam 12-07-2012 START
    public String getListofOverStayedChildren() {

        System.out.println("ACTION ------------IN");
        List<StayingPeriodOfChildDTO> stl = caseWorkerService.getOverStayingChildren(ActionContext.getContext().getSession().get("homeid").toString(), 4);
        setStayingPeriodOfChildDTOList(stl);
        //Iterator<StayingPeriodOfChildDTO> i = stl.iterator();

        /*for (Iterator<StayingPeriodOfChildDTO> it = stl.iterator(); it.hasNext();) {
            StayingPeriodOfChildDTO stayingPeriodOfChildDTO = it.next();
            System.out.println(" ---------------- "+stayingPeriodOfChildDTO);
        }*/
        return "success";
    }

    private List<StayingPeriodOfChildDTO> stayingPeriodOfChildDTOList;

    public List<StayingPeriodOfChildDTO> getStayingPeriodOfChildDTOList() {
        return stayingPeriodOfChildDTOList;
    }

    public void setStayingPeriodOfChildDTOList(List<StayingPeriodOfChildDTO> stayingPeriodOfChildDTOList) {
        this.stayingPeriodOfChildDTOList = stayingPeriodOfChildDTOList;
    }

    //added by anupam 12-07-2012 END
    //added by suresh for ICP on 12-10-2012 start
    public String getICPChildMaster() {
        String homeId = ActionContext.getContext().getSession().get("homeid").toString();
        String result = "error";
        try {
            setTransChildMaster(caseWorkerService.getTransferredChildDetails(getChildProfileId()));
            setTransChildDetails(caseWorkerService.getExistingChildDetails(getChildProfileId()));
            result = "success";
        } catch (Exception e) {
            return "error";
        }

        return result;
    }
    //added by suresh for ICP on 12-10-2012 ends

    public String populateHomeNamesInADistMap() {

        setHomesInADistrictMap(caseWorkerService.getOtherHomesInADistrict(userDistrictId, getLoggedInhome()));

        return "success";

    }

    public String populateChildDTOforDischarge() {

        String result = "error";
        String homeId = ActionContext.getContext().getSession().get("homeid").toString();

        try {
            setChildDTOList(caseWorkerService.getChildDTOListByHomeAndStatus(homeId, "ACTIVE"));
            result = "success";

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    public String populateChildDTOforAdmission() {
        String result = "error";

        try {
            setChildDTOList(caseWorkerService.getChildDTOListByHomeAndStatus(homeId, "transfer"));
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

    List<F17dto> tdList = new ArrayList<F17dto>();

    public List<F17dto> getTdList() {
        return tdList;
    }

    public void setTdList(List<F17dto> tdList) {
        this.tdList = tdList;
    }

    public String dummyMethod() {
        //this method is kept only for multilingual strings access in a package
        System.out.println("dummy method");
        List<F17dto> ar = new ArrayList<F17dto>();

        F17dto td = new F17dto();
//        td.setMeetingId("CIPI-DAY");
        ar.add(td);

        setTdList(ar);

        return "success";
    }

    HttpServletResponse hsr;

    public void setServletResponse(HttpServletResponse hsr) {
        this.hsr = hsr;
    }

    /*to view the list of users by venkat 24/01/2016*/
    public String ViewNewReportFoundChild() {

              List<FcChildTemp> fctList = caseWorkerService.getfoundchildren();
        setFoundchildrenlist(fctList);
        System.out.println("reCumResOrd->" + getFoundchildrenlist());
        return "success";
    }

    private String[] foundlist = new String[40];

    public String[] getFoundlist() {

//        foundlist[0] = "male_2372017";
//        foundlist[1] = "f_141201737";
//        foundlist[2] = "m_2142017";
        return foundlist;
    }

    public void setFoundlist(String[] foundlist) {
        this.foundlist = foundlist;
    }

    private FcChildTemp foundreportlist;

    public FcChildTemp getFoundreportlist() {
        return foundreportlist;
    }

    public void setFoundreportlist(FcChildTemp foundreportlist) {
        this.foundreportlist = foundreportlist;
    }

    public String foundReportList() {

        System.out.println("foundreportlist");

        String childprofileid = request.getParameter("name");

        System.out.println(" childprofileid ==" + childprofileid);
        FcChildTemp qual_strm = adminService.foundreportlist(childprofileid);
        setFoundreportlist(qual_strm);
        //  setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    private Map<String, Object> reportMulParameter = new HashMap<>();

    public Map<String, Object> getReportMulParameter() {
        return reportMulParameter;
    }

    public void setReportMulParameter(Map<String, Object> reportMulParameter) {
        this.reportMulParameter = reportMulParameter;
    }
        /*--************************====************************====************************=== 
                   ====********************General Code **********************************==== 
        ************************====************************====************************====-*/ 
    private String profile_id;
    private InputStream inputStream;
    private List<FcForm> formList = new ArrayList<FcForm>();
    JRBeanCollectionDataSource dataSource;
    JasperReport jasperReport;
    JasperPrint jasperPrint;

    public String getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(String profile_id) {
        this.profile_id = profile_id;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public List<FcForm> getFormList() {
        return formList;
    }

    public void setFormList(List<FcForm> formList) {
        this.formList = formList;
    }
    //rajat
    /*--************************====************************====************************=== 
                   ====********************FORM 3 **********************************==== 
        ************************====************************====************************====-*/
    private List<F3dto> form3List = new ArrayList<F3dto>();

    public List<F3dto> getForm3List() {
        return form3List;
    }

    public void setForm3List(List<F3dto> form3List) {
        this.form3List = form3List;
    }

    public String getForm3() {
        System.out.println("rep required******->Form3");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form3.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F3dto f3dto = new F3dto();
            f3dto.setFirno("12");

            List<F3dto> fdList = new ArrayList<>();
            fdList.add(f3dto);

            setForm3List(fdList);

            System.out.println("---->" + getForm3List().size());
            System.out.println("---->" + getForm3List().get(0).getFirno());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm3List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is33 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is33);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private F3dto f3dto;

    public F3dto getF3dto() {
        return f3dto;
    }

    public void setF3dto(F3dto f3dto) {
        this.f3dto = f3dto;
    }

    public String getForm3data() {
        System.out.println("******************FORM 3*******************getForm10data");
        F3dto f3dtol = new F3dto();
        f3dtol.setFirno("Lippu");
        setF3dto(f3dtol);

        return SUCCESS;

    }

    public String form3desave() {
        String Firno = request.getParameter("Firno");
        System.out.println("Firno---->" + Firno);
        addActionMessage("Saved Form 3:PERIODIC REPORT BY PROBATION OFFICER WHEN A CHILD IS RELEASED ON PROBATION");
        return SUCCESS;
    }

    public String CCL_Meetings3Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 4 **********************************==== 
        ************************====************************====************************====-*/
    public String CCL_Meetings4Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 5 **********************************==== 
        ************************====************************====************************====-*/
    public String CCL_Meetings5Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 8 **********************************==== 
        ************************====************************====************************====-*/
 

   
   
    private List<F8dto> form8List = new ArrayList<F8dto>();

    public List<F8dto> getForm8List() {
        return form8List;
    }

    public void setForm8List(List<F8dto> form8List) {
        this.form8List = form8List;
    }
    public String getForm8() {
        System.out.println("rep required******->Form8");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form8.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F8dto f8dto = new F8dto();
            f8dto.setUt_child("12");

            List<F8dto> fdList = new ArrayList<>();
            fdList.add(f8dto);

            setForm8List(fdList);

            System.out.println("---->" + getForm8List().size());
            System.out.println("---->" + getForm8List().get(0).getUt_child());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm8List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is80 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is80);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private F8dto f8dto;

    public F8dto getF8dto() {
        return f8dto;
    }

    public void setF8dto(F8dto f8dto) {
        this.f8dto = f8dto;
    }

    public String getForm8data() {
        System.out.println("******************FORM 8*******************getForm8data");
        F8dto f8dtol = new F8dto();
        f8dtol.setUt_child("Lippu");
        setF8dto(f8dtol);

        return SUCCESS;

    }

    public String CCL_Form8desave() {
        String ut_child = request.getParameter("ut_child");
        
        /*
        System.out.println("UT_CHILD---->" + ut_child);
        String sql = "insert into fc_form8 (ut_cname,ut_child,ut_jjb,ut_sum,ut_rsw,ut_child2,ut_year,ut_date,"
                + "ut_sum2,ut_rsw2,ut_date2,ut_month,ut_year1,ut_cname2,ut_place,ut_person,ut_cname3,ut_sum3,ut_rsw3,"
                + "ut_date3,ut_month2,ut_year2,ut_cust) values('" + ut_child + "','','','','','','','','','','','','','','','','','','','','','','')";
        jdbcTemplate.execute(sql);
        
        */
        
        
        addActionMessage("Saved Form 8:PERIODIC REPORT BY PROBATION OFFICER WHEN A CHILD IS RELEASED ON PROBATION");
        return SUCCESS;
    }

    public String CCL_Meetings8Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 9 **********************************==== 
        ************************====************************====************************====-*/
    public String CCL_Meetings9Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 10 **********************************==== 
        ************************====************************====************************====-*/
    private List<F10dto> form10List = new ArrayList<F10dto>();

    public List<F10dto> getForm10List() {
        return form10List;
    }

    public void setForm10List(List<F10dto> form10List) {
        this.form10List = form10List;
    }
    public String getForm10() {
        System.out.println("rep required******->Form10");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form10.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F10dto f10dto = new F10dto();
            f10dto.setCpFirno("12");

            List<F10dto> fdList = new ArrayList<>();
            fdList.add(f10dto);

            setForm10List(fdList);

            System.out.println("---->" + getForm10List().size());
            System.out.println("---->" + getForm10List().get(0).getCpFirno());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm10List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is100 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is100);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private F10dto f10dto;

    public F10dto getF10dto() {
        return f10dto;
    }

    public void setF10dto(F10dto f10dto) {
        this.f10dto = f10dto;
    }

    public String getForm10data() {
        System.out.println("******************FORM 10*******************getForm10data");
        F10dto f10dtol = new F10dto();
        f10dtol.setCpFirno("Lippu");
        setF10dto(f10dtol);

        return SUCCESS;

    }

    public String form10desave() {
        String Firno = request.getParameter("cpFirno");
        System.out.println("Firno---->" + Firno);
        addActionMessage("Saved Form 10:PERIODIC REPORT BY PROBATION OFFICER WHEN A CHILD IS RELEASED ON PROBATION");
        return SUCCESS;
    }

    public String CCL_Meetings10Formde() {
        return SUCCESS;
    }

    public String CCL_Meetings10_1Formde() {
        return SUCCESS;
    }
    
     /*--************************====************************====************************=== 
                   ====********************FORM 15 **********************************==== 
        ************************====************************====************************====-*/
     public String getSummaryProfiles()
   {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildren();
        setFoundchildrenlist(fctList);
        System.out.println("reCumResOrd->" + getFoundchildrenlist());
        return "success";
    } 
    private List<FcForm15> form15List = new ArrayList<FcForm15>();

    public List<FcForm15> getForm15List() {
        return form15List;
    }

    public void setForm15List(List<FcForm15> form15List) {
        this.form15List = form15List;
    }
    public String getForm15() {
        System.out.println("rep required******->Form15");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form15.jrxml";
        System.out.println("rep name******->" + reportName);

        try {
            FcForm15 f15dto = new FcForm15();
            f15dto.setWcCase("68");

            List<FcForm15> fdList = new ArrayList<>();
            fdList.add(f15dto);

            setForm15List(fdList);

            System.out.println("---->" + getForm15List().size());
            System.out.println("---->" + getForm15List().get(0).getWcCase());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm15List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is150 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is150);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private FcForm15 f15dto;

    public FcForm15 getF15dto() {
        return f15dto;
    }

    public void setF15dto(FcForm15 f15dto) {
        this.f15dto = f15dto;
    }

    public String getForm15data() {
        System.out.println("******************FORM 15*******************getForm15data");
        FcForm15 f15dtol = new FcForm15();
        f15dtol.setWcCase("68");
        setF15dto(f15dtol);

        return SUCCESS;

    }

   public String form15desave() { 
        addActionMessage("Saved Form 15:CASE SUMMARY MAINTAINED BY THE CHILD WELFARE COMMITTEE");
        FcForm15 f155 = (FcForm15)getModel();
        
        System.out.println("Form 15 is Saved"+f155.getWc11());
        
        System.out.println("Form 15 is Saved"+f155.getWcCase());
        
        System.out.println("Form 15 is Saved"+f155.getWc1());
        
        f155.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f155);
        System.out.println("Form 15 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings15Formde() {
        return SUCCESS;
    }

   
      /*--************************====************************====************************=== 
                   ====********************FORM 17 **********************************==== 
        ************************====************************====************************====-*/
    private List<F17dto> chso;

    public List<F17dto> getChso() {
        return chso;
    }

    public void setChso(List<F17dto> chso) {
        this.chso = chso;
    }

    public String getReportSo() {
        F17dto td = new F17dto();
        System.out.println("td.setMeetingId(12345)");
        //td.setMeetingId("12345");

        List<F17dto> list = new ArrayList<F17dto>();
        list.add(td);
        setChso(list);
        return "handover";
    }

    private List<F17dto> chfcdtoList = new ArrayList<F17dto>();
    private F17dto chfcdto;

    public F17dto getChfcdto() {
        return chfcdto;
    }

    public void setChfcdto(F17dto chfcdto) {
        this.chfcdto = chfcdto;
    }

    public List<F17dto> getChfcdtoList() {
        return chfcdtoList;
    }

    public void setChfcdtoList(List<F17dto> chfcdtoList) {
        this.chfcdtoList = chfcdtoList;
    }

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    private String found_child = "36";
        public String getFound_child() {
        return found_child;
    }

    public void setFound_child(String found_child) {
        this.found_child = found_child;
    }
    public String getChildFcDet() {

        FcChildTemp fct = adminService.foundreportlist(getFound_child());

        F17dto f17dto = new F17dto();

        f17dto.setProfileId(fct.getProfileId());
        f17dto.setEducation("yes");
        f17dto.setDateProd("12-09-2017");
        f17dto.setTimeProd("10.00 am");
        f17dto.setPlaceProd("CWC Hyderabad");

        f17dto.setPersName("Ramu Parigi");
        f17dto.setPersAge("38");
        f17dto.setPersSex("Male");
        f17dto.setPersAddr("Tukaram Gate");
        f17dto.setPersCont("9863521478");
        f17dto.setPersOcu("Police person");
        f17dto.setPersOrg("CHB Hyderabad");

        f17dto.setChildName("Lippu");
        f17dto.setChildAge(fct.getAgeofchild());
        f17dto.setChildSex(fct.getGender());
        f17dto.setChildIdMarks("Mole on Chin at Left side");
        f17dto.setChildLang(fct.getLanguagesknown());

        f17dto.setParName("anjaiah");
        f17dto.setParAge("39");
        f17dto.setParAddr(fct.getAddofparents());
        f17dto.setParCont("9874563221");
        f17dto.setParOcu("Coolie");
        f17dto.setPlaceProd("Railway Station Secunderabad");

        //  chfcdto.setEducation(fct.getEducation());
        //  chfcdto.setProfileId(fct.getProfileId());
        List<F17dto> fdList = new ArrayList<>();
        fdList.add(f17dto);

        //setChfcdto.
        setChfcdtoList(fdList);
        // setChfcdtoList(chfcdtoList);       

        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form17.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            //1-I fill the dataSource with the Collection

            //     f17dto.setEducation(fct.getEducation());
            dataSource = new JRBeanCollectionDataSource(chfcdtoList);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is;
            is = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));

            setInputStream(is);
            //os.write(JasperExportManager.exportReportToPdf(jasperPrint));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
    public String form17desave() { 
        addActionMessage("Saved Form 17:REPORT TO BE SUBMITTED AT TIME OF PRODUCTION\nOF CHILD BEFORE THE COMMITTEE");
        FcChildTemp f177 = (FcChildTemp) getModel();
        f177.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f177);
        System.out.println("Form 17 is Saved");
        return SUCCESS;
    }
    public String CWC_Meetings17Formde() {
        return SUCCESS;
    }


    /*--************************====************************====************************=== 
                   ====********************FORM 19 **********************************==== 
        ************************====************************====************************====-*/
    public String getPendInqChild() {

        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("Interviewagain");

        setFoundchildrenlist(fctList);

        System.out.println("-pend enq->" + getFoundchildrenlist());
        return "success";

    }   
    private FcForm19 fc19 = new FcForm19();

    public FcForm19 getFc19() {
        return fc19;
    }

    public void setFc19(FcForm19 fc19) {
        this.fc19 = fc19;
    }

  
    public String getForm19() {
        String id = request.getParameter("pendEnqPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("id" + id);
        System.out.println("rep required******->Form19");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form19.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);
        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);         
            setFormList(fdList);
            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is191 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is191);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
   public String getForm19data() {
        System.out.println("******************FORM 19*******************getForm19data");

        FcForm19 f19dtol = new FcForm19();
        f19dtol.setCpName("Lippu");
        setFc19(f19dtol);
        return SUCCESS;

    }
    public String form19desave() {
        String cpName = request.getParameter("cpName");
        System.out.println("cpName---->" + cpName);
        addActionMessage("Saved Form 19:ORDER FOR PLACEMENT OF CHILD UNDER THE CARE OF A PARENT, GUARDIAN OR FIT PERSON PENDING INQUIRY");
        FcForm19 f199 = (FcForm19) getModel();
        f199.setProfileId(ActionContext.getContext().getSession().get("foundhomeid").toString());
        caseWorkerService.formSaveService(f199);
        System.out.println("Form 19 is Saved");

        return SUCCESS;
    }

    public String CWC_Meetings19desave() {
        return SUCCESS;
    }

    
    /*--************************====************************====************************=== 
                   ====********************FORM 20 **********************************==== 
        ************************====************************====************************====-*/
    public String getHandOver() {

        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("handover");

        setFoundchildrenlist(fctList);

        System.out.println("-hand over->" + getFoundchildrenlist());
        return "success";

    }
    private FcForm20 fc20 = new FcForm20();

    public FcForm20 getFc20() {
        return fc20;
    }

    public void setFc20(FcForm20 fc20) {
        this.fc20 = fc20;
    }
    public String getForm20() {
        String id = request.getParameter("form20Child");
        String tableName = request.getParameter("tableName");
        System.out.println("id" + id);
        System.out.println("rep required******->Form20");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form20.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);

            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is201 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is201);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    public String getForm20data() {
        System.out.println("******************FORM 20*******************getForm20data");

        FcForm20 f20dtol = new FcForm20();
        f20dtol.setCpName("Lippu");
        setFc20(f20dtol);
        return SUCCESS;

    }

    public String form20desave() {
        String cpName = request.getParameter("cpName");
        System.out.println("cpName---->" + cpName);
        addActionMessage("Saved Form 20:UNDERTAKING BY THE PARENT OR GUARDIAN OR 'FIT PERSON'");
        FcForm20 f200 = (FcForm20) getModel();
        f200.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f200);
        System.out.println("Form 20 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings20Formde() {
        return SUCCESS;
    }
    
    /*--************************====************************====************************=== 
                   ====********************FORM 21 **********************************==== 
        ************************====************************====************************====-*/
    public String getOrderFrSir() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");

        setFoundchildrenlist(fctList);

        System.out.println("-order--fr-sir->" + getFoundchildrenlist());
        return "success";
    }
    public String getForm21() {
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("id" + id);
        System.out.println("rep required******->Form21");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form21.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);

            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is211 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is211);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
    private FcForm21 f21dto;

    public FcForm21 getF21dto() {
        return f21dto;
    }

    public void setFcForm21(FcForm21 f21dto) {
        this.f21dto = f21dto;
    }

    public String getForm21data() {
        System.out.println("******************FORM 21*******************getForm21data");
        FcForm21 f21dtol = new FcForm21();
        f21dtol.setCpCname("Lippu");
        setFcForm21(f21dtol);

        return SUCCESS;

    }

    public String form21desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 21:ORDER FOR SOCIAL INVESTIGATION REPORT OF CHILD IN NEED OF CARE AND PROTECTION");
        FcForm21 f211 = (FcForm21) getModel();
        f211.setProfileId(ActionContext.getContext().getSession().get("foundhomeid").toString());
        caseWorkerService.formSaveService(f211);
        System.out.println("Form 21 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings21Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 22 **********************************==== 
        ************************====************************====************************====-*/
    public String getSir() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");

        setFoundchildrenlist(fctList);

        System.out.println("-surr-child->" + getFoundchildrenlist());
        return "success";
    }
    private List<F22dto> form22List = new ArrayList<F22dto>();

    public List<F22dto> getForm22List() {
        return form22List;
    }

    public void setForm22List(List<F22dto> form22List) {
        this.form22List = form22List;
    }

    public String getForm22() {
        System.out.println("rep required******->Form22");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form22.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {

            F22dto f22dto = new F22dto();

            List<F22dto> fdList = new ArrayList<>();
            fdList.add(f22dto);

            setForm22List(fdList);

            System.out.println("---->" + getForm22List().size());
            System.out.println("---->" + getForm22List().get(0));
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm22List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is201 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is201);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    public String DCPU_Meetings22Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings22_2Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings22_3Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings22_4Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings22_5Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings22_6Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings22_7Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 23 **********************************==== 
        ************************====************************====************************====-*/
    public String surrChild() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");

        setFoundchildrenlist(fctList);

        System.out.println("-surr-child->" + getFoundchildrenlist());
        return "success";
    }
    private FcForm23 fc23 = new FcForm23();

    public FcForm23 getFc23() {
        return fc23;
    }

    public void setFc23(FcForm23 fc23) {
        this.fc23 = fc23;
    }
    public String getForm23() {
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("id" + id);
        System.out.println("rep required******->Form23");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form23.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);

            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is231 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is231);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
   public String getForm23data() {
        System.out.println("******************FORM 29*******************getForm23data");

        FcForm23 f23dtol = new FcForm23();
        f23dtol.setCpAname("Lippu");
        setFc23(f23dtol);
        return SUCCESS;

    }

    public String form23desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 23:APPLICATION FOR SURRENDER OF CHILD");
        FcForm23 f233 = (FcForm23)getModel();   
//        Date d = new Date(request.getParameter("cpDate"));  
//        Date d1 = new Date(request.getParameter("cpDate1"));
//        f233.setCpDate(d);
//        f233.setCpDate(d1);
        f233.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f233);
        System.out.println("Form 23 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings23Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 24 **********************************==== 
        ************************====************************====************************====-*/
    public String deedSur() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("deed-surrender->" + getFoundchildrenlist());
        return "success";
    }
  private FcForm24 fc24 = new FcForm24();

    public FcForm24 getFc24() {
        return fc24;
    }

    public void setFc24(FcForm24 fc24) {
        this.fc24 = fc24;
    }

    private List<FcForm24> form24List = new ArrayList<FcForm24>();

    public List<FcForm24> getForm24List() {
        return form24List;
    }

    public void setForm24List(List<FcForm24> form24List) {
        this.form24List = form24List;
    }

    public String getForm24() {
        String id = request.getParameter("sirChildPdf");
        System.out.println("id" + id);
        String tableName = request.getParameter("tableName");
        System.out.println("rep required******->Form24");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form24.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);

            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is241 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is241);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
  private FcForm24 f24dto;

    public FcForm24 getFcForm24() {
        return f24dto;
    }

    public void setFcForm24(FcForm24 f24dto) {
        this.f24dto = f24dto;
    }

    public String getForm24data() {
        System.out.println("******************FORM 24*******************getForm24data");
        FcForm24 f24dtol = new FcForm24();
        f24dtol.setCpCname("Lippu");
        setFcForm24(f24dtol);

        return SUCCESS;

    }

    public String form24desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 24:DEED FOR SURRENDER");
        FcForm24 f244 = (FcForm24) getModel();
        f244.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f244);
        System.out.println("Form 24 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings24Formde() {
        return SUCCESS;
    }
    
         /*--************************====************************====************************=== 
                   ====********************FORM 25 **********************************==== 
        ************************====************************====************************====-*/
    public String certAdoption25() {

        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("Interviewagain");

        setFoundchildrenlist(fctList);

        System.out.println("-pend enq->" + getFoundchildrenlist());
        return "success";

    }
    private List<FcForm25> form25List = new ArrayList<FcForm25>();

    public List<FcForm25> getForm25List() {
        return form25List;
    }

    public void setForm25List(List<FcForm25> form25List) {
        this.form25List = form25List;
    }
    public String getForm25() {
        String id = request.getParameter("sirChildPdf");
          String tableName = request.getParameter("tableName");
        System.out.println("rep required******->Form25");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form25.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {

            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);


            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm25List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is201 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is201);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
    private FcForm25 f25dto;

    public FcForm25 getFcForm25() {
        return f25dto;
    }
    public void setFcForm25(FcForm25 f25dto) {
        this.f25dto = f25dto;
    }
    public String getForm25data() {
        System.out.println("******************FORM 25*******************getForm25data");
        FcForm25 f25dtol = new FcForm25();
        f25dtol.setAdRess("raj");
        setFcForm25(f25dtol);
        return SUCCESS;

    }
    public String form25desave() {
        String adRess = request.getParameter("adRess");
        System.out.println("adRess---->" + adRess);
        addActionMessage("Saved Form 25:ORDER FOR PLACEMENT OF CHILD UNDER THE CARE OF A PARENT, GUARDIAN OR FIT PERSON PENDING INQUIRY");
        System.out.println(getModel());
        FcForm25 f259 = (FcForm25) getModel();     
        f259.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f259);
        System.out.println("Form 25 is Saved");
        return SUCCESS;
    }
    public String CWC_Meetings25Formde() {
        return SUCCESS;
    }
    public String CWC_Meetings25desave() {
        return SUCCESS;
    }
    
            /*--************************====************************====************************=== 
                   ====********************FORM 26 **********************************==== 
        ************************====************************====************************====-*/

    private List<FcForm26> form26List = new ArrayList<FcForm26>();

    public List<FcForm26> getForm26List() {
        return form26List;
    }

    public void setForm26List(List<FcForm26> form26List) {
        this.form26List = form26List;
    }
    public String getForm26() {
        System.out.println("rep required******->Form26");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form26.jrxml";
    reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {

            FcForm26 f26dto = new FcForm26();
            f26dto.setCwCase("raj");

            List<FcForm26> fdList = new ArrayList<>();
            fdList.add(f26dto);

            setForm26List(fdList);

            System.out.println("---->" + getForm26List().size());
            System.out.println("---->" + getForm26List().get(0).getCwCase());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm26List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is201 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is201);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
    private FcForm26 f26dto;

    public FcForm26 getFcForm26() {
        return f26dto;
    }

    public void setFcForm26(FcForm26 f26dto) {
        this.f26dto = f26dto;
    }



    public String getForm26data() {
        System.out.println("******************FORM 26*******************getForm26data");
        FcForm26 f26dtol = new FcForm26();
        f26dtol.setCwCase("raj");
        setFcForm26(f26dtol);

        return SUCCESS;

    }
    public String form26desave() {
        addActionMessage("Saved Form 26:ORDER FOR PLACEMENT OF CHILD UNDER THE CARE OF A PARENT, GUARDIAN OR FIT PERSON PENDING INQUIRY");
        System.out.println(getModel());
        FcForm26 f269 = (FcForm26)getModel();
        f269.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f269);
        System.out.println("Form 26 is Saved");

        return SUCCESS;
    }
    public String CWC_Meetings26Formde() {
        return SUCCESS;
    }
    public String CWC_Meetings26desave() {
        return SUCCESS;
    }

 /*--************************====************************====************************=== 
                   ====********************FORM 30 **********************************==== 
        ************************====************************====************************====-*/
    
        public String DCPU_Meetings30Formde() {
        return SUCCESS;
    }
        public String DCPU_Meetings30_2Formde() {
        return SUCCESS;
    }
        public String DCPU_Meetings30_3Formde() {
        return SUCCESS;
    }
        public String DCPU_Meetings30_4Formde() {
        return SUCCESS;
    }
        public String DCPU_Meetings30_5Formde() {
        return SUCCESS;
    }
        
        
        /*--************************====************************====************************=== 
                   ====********************FORM 31 **********************************==== 
        ************************====************************====************************====-*/
    
        public String DCPU_Meetings31Formde() {
        return SUCCESS;
    }
        public String DCPU_Meetings31_2Formde() {
        return SUCCESS;
    }
 /*--************************====************************====************************=== 
                   ====********************FORM 32 **********************************==== 
        ************************====************************====************************====-*/
    public String ordFosCare() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("ord-Foster-Care->" + getFoundchildrenlist());
        return "success";
    }
    public String getForm32() {
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("rep required******->Form32");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form32.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);
        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);

            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is322 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is322);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    } 

    private FcForm32 f32dto;

    public FcForm32 getFcForm32() {
        return f32dto;
    }

    public void setFcForm32(FcForm32 f32dto) {
        this.f32dto = f32dto;
    }
  
    public String getForm32data() {
        System.out.println("******************FORM 32*******************getForm32data");
        FcForm32 f32dtol = new FcForm32();
        f32dtol.setName("Lippu");
        setFcForm32(f32dtol);

        return SUCCESS;

    }

    public String form32desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 32:APPLICATION FOR SURRENDER OF CHILD");
        FcForm32 f323 = (FcForm32)getModel();  
        f323.setProfileId(ActionContext.getContext().getSession().get("foundhomeid").toString());
        caseWorkerService.formSaveService(f323);
        System.out.println("Form is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings32Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 33 **********************************==== 
        ************************====************************====************************====-*/
    public String appFFIncl() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("-app-FF-Incl->" + getFoundchildrenlist());
        return "success";
    }
    public String getForm33() {
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("rep required******->Form33");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form33.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images\\govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);
            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is333 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is333);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
    private FcForm33 f33dto;
    public FcForm33 getFcForm33() {
        return f33dto;
    }

    public void setFcForm33(FcForm33 f33dto) {
        this.f33dto = f33dto;
    }

    public String getForm33data() {
        System.out.println("******************FORM 33*******************getForm33data");
        FcForm33 f33dtol = new FcForm33();
        setFcForm33(f33dtol);
        return SUCCESS;
    }

    public String form33desave() {
        String i = request.getParameter("i");
        System.out.println("i---->" + i);
        addActionMessage("Saved Form 33:UNDERTAKING BY THE FOSTER FAMILY/GROUP FOSTER CARE ORGANISATION");
        FcForm33 f333 = (FcForm33) getModel();
        f333.setProfileId(profile_id);
        caseWorkerService.formSaveService(f333);
        System.out.println("Form 33 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings33Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 34 **********************************==== 
        ************************====************************====************************====-*/
    public String recFosCare() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("-rec-Fos-care->" + getFoundchildrenlist());
        return "success";
    }
    private List<F34dto> form34List = new ArrayList<F34dto>();

    public List<F34dto> getForm34List() {
        return form34List;
    }

    public void setForm34List(List<F34dto> form34List) {
        this.form34List = form34List;
    }
    public String getForm34() {
        System.out.println("rep required******->Form34");
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form34.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);
        
        try {
           List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);

            System.out.println("---->" + getForm34List().size());
            System.out.println("---->" + getForm34List().get(0).getCpCname());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm34List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is344 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is344);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private F34dto f34dto;

    public F34dto getF34dto() {
        return f34dto;
    }

    public void setF34dto(F34dto f34dto) {
        this.f34dto = f34dto;
    }

    public String getForm34data() {
        System.out.println("******************FORM 34*******************getForm34data");
        F34dto f34dtol = new F34dto();
        f34dtol.setCpCname("Lippu");
        setF34dto(f34dtol);

        return SUCCESS;

    }

    public String form34desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 34:RECORD OF A CHILD IN FOSTER CARE");
        FcForm34 f344 = (FcForm34) getModel();
        f344.setProfileId(profile_id);
        caseWorkerService.formSaveService(f344);
        System.out.println("Form 34 is Saved");
        return SUCCESS;
    }

    public String DCPU_Meetings34Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 35 **********************************==== 
        ************************====************************====************************====-*/
    public String monInspFosCare() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("mon-Insp-Fos-Care->" + getFoundchildrenlist());
        return "success";
    }

    private List<F35dto> form35List = new ArrayList<F35dto>();

    public List<F35dto> getForm35List() {
        return form35List;
    }

    public void setForm35List(List<F35dto> form35List) {
        this.form35List = form35List;
    }
    public String getForm35() {
        System.out.println("rep required******->Form35");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form35.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F35dto f35dto = new F35dto();

            List<F35dto> fdList = new ArrayList<>();
            fdList.add(f35dto);

            setForm35List(fdList);

            System.out.println("---->" + getForm35List().size());
            System.out.println("---->" + getForm35List().get(0));
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm35List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is355 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is355);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private F35dto f35dto;

    public F35dto getF35dto() {
        return f35dto;
    }

    public void setF35dto(F35dto f35dto) {
        this.f35dto = f35dto;
    }

    public String getForm35data() {
        System.out.println("******************FORM 35*******************getForm35data");
        F35dto f35dtol = new F35dto();

        setF35dto(f35dtol);

        return SUCCESS;

    }

    public String form35desave() {
        String Name = request.getParameter("Name");
        System.out.println("Name---->" + Name);
        addActionMessage("Saved Form 35:MONTHLY INSPECTION OF FOSTER FAMILIES/GROUP FOSTER CARE");
        return SUCCESS;
    }

    public String DCPU_Meetings35Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings35_2Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings35_3Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings35_4Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings35_5Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings35_6Formde() {
        return SUCCESS;
    }

    public String DCPU_Meetings35_7Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 36 **********************************==== 
        ************************====************************====************************====-*/
    public String ordSponPl() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("ord-Spon-Pl->" + getFoundchildrenlist());
        return "success";
    }
    
    
    private FcForm36 fc36 = new FcForm36();
    
    public FcForm36 getFc36()
    {
        return fc36;
    }
    
    public void setFc36(FcForm36 fc36)
    {
        this.fc36 = fc36;
    }
    /*
    private List<FcForm36> form36List = new ArrayList<FcForm36>();
     
    public List<FcForm36> getForm36List()
    {
        return form36List;
    }
    
    public void setForm36List(List<FcForm36> form36List)
    {
        this.form36List = form36List;
    }
    */
    public String getForm36() {
        System.out.println("rep required******->Form36");
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form36.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);
            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is366 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is366);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private FcForm36 f36dto;

    public FcForm36 getFcForm36() {
        return f36dto;
    }

    public void setFcForm36(FcForm36 f36dto) {
        this.f36dto = f36dto;
    }

    public String getForm36data() {
        System.out.println("******************FORM 36*******************getForm36data");
        FcForm36 f36dtol = new FcForm36();
        f36dtol.setMr36("Lippu");
        setFcForm36(f36dtol);

        return SUCCESS;

    }

    public String form36desave() {
        String Name = request.getParameter("Name");
        System.out.println("Name---->" + Name);
        addActionMessage("Saved Form 36:ORDER OF AFTER CARE PLACEMENT");
        FcForm36 f366 = (FcForm36)getModel();
        f366.setProfileId(ActionContext.getContext().getSession().get("foundhomeid").toString());
        caseWorkerService.formSaveService(f366);
        System.out.println("Form 36 is saved");
        return SUCCESS;
    }

    public String CWC_Meetings36Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 37 **********************************==== 
        ************************====************************====************************====-*/
    public String ordAftCrPla() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("-ord--Aft-Cr-Pla->" + getFoundchildrenlist());
        return "success";
    }
    public String getForm37() {
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("rep required******->Form37");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form37.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
           List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);
            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is377 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is377);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
    private FcForm37 f37dto;

    public FcForm37 getFcForm37() {
        return f37dto;
    }
    public void setFcForm37(FcForm37 f37dto) {
        this.f37dto = f37dto;
    }
    public String getForm37data() {
        System.out.println("******************FORM 37*******************getForm37data");
        FcForm37 f37dtol = new FcForm37();
        f37dtol.setCpCname("Lippu");
        setFcForm37(f37dtol);
        return SUCCESS;
    }

    public String form37desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 37:ORDER OF AFTER CARE PLACEMENT");
        FcForm37 f377 = (FcForm37) getModel();
        f377.setProfileId(ActionContext.getContext().getSession().get("foundhomeid").toString());
        caseWorkerService.formSaveService(f377);
        System.out.println("Form 37 is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings37Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 38 **********************************==== 
        ************************====************************====************************====-*/
    public String utFosCare() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("-ut-Fos-Care->" + getFoundchildrenlist());
        return "success";
    }
    private List<F381dto> form381List = new ArrayList<F381dto>();

    public List<F381dto> getForm381List() {
        return form381List;
    }

    public void setForm381List(List<F381dto> form381List) {
        this.form381List = form381List;
    }
    private List<F382dto> form382List = new ArrayList<F382dto>();

    public List<F382dto> getForm382List() {
        return form382List;
    }

    public void setForm382List(List<F382dto> form382List) {
        this.form382List = form382List;
    }
    public String getForm38() {
        System.out.println("rep required******->Form38");
        String reportName1 = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form38.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName1);

        JRBeanCollectionDataSource dataSource1;
        JasperReport jasperReport1;
        JasperPrint jasperPrint1;

        try {
            F381dto f381dto = new F381dto();
            f381dto.setCpDname("381");
            ;

            List<F381dto> fdList1 = new ArrayList<>();
            fdList1.add(f381dto);

            setForm381List(fdList1);

            System.out.println("---->" + getForm381List().size());
            System.out.println("---->" + getForm381List().get(0).getCpDname());

            //1-I fill the dataSource with the Collection
            dataSource1 = new JRBeanCollectionDataSource(getForm381List(), false);

            //2-Compile the XML
            jasperReport1 = JasperCompileManager.compileReport(reportName1);

            //3-Fill the report with the datasource
            jasperPrint1 = JasperFillManager.fillReport(jasperReport1, reportMulParameter, dataSource1);

            //4-Export to PDF and save to disk
            InputStream is381 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint1));

            setInputStream(is381);
            System.out.println("ddh");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
    private F381dto f381dto;

    public F381dto getF381dto() {
        return f381dto;
    }

    public void setF381dto(F381dto f381dto) {
        this.f381dto = f381dto;
    }

    private F382dto f382dto;

    public F382dto getF382dto() {
        return f382dto;
    }

    public void setF382dto(F382dto f382dto) {
        this.f382dto = f382dto;
    }

    public String getForm38data() {
        System.out.println("******************FORM 38*******************getForm38data");
        F381dto f381dtol = new F381dto();
        f381dtol.setCpDname("Lippu");
        setF381dto(f381dtol);
        F382dto f382dtol = new F382dto();
        f382dtol.setCpBar("Lippu");
        setF382dto(f382dtol);

        return SUCCESS;

    }

    public String form38desave() {
        String cpDname = request.getParameter("cpDname");
        System.out.println("cpDname---->" + cpDname);
        addActionMessage("Saved Form 38:APPLICATION FOR FIT FACILITY INCLUDING GROUP FOSTER CARE");
        return SUCCESS;
    }

    public String CWC_Meetings38Formde() {
        return SUCCESS;
    }

    public String CWC_Meetings38_1Formde() {
        return SUCCESS;
    }

    public String CWC_Meetings38_2Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 39 **********************************==== 
        ************************====************************====************************====-*/
    public String certFFIncl() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("cert-FF-Incl->" + getFoundchildrenlist());
        return "success";
    }
    public String getForm39() {
        String id = request.getParameter("sirChildPdf");
        String tableName = request.getParameter("tableName");
        System.out.println("rep required******->Form39");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form39.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
         List<FcForm> fdList = adminService.selectChild(id,tableName);
            setFormList(fdList);
            System.out.println("---->" + getFormList().size());
            System.out.println("---->" + getFormList().get(0).getClass());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getFormList(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is399 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is399);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }

    private FcForm39 f39dto;

    public FcForm39 getF39dto() {
        return f39dto;
    }

    public void setFcForm39(FcForm39 f39dto) {
        this.f39dto = f39dto;
    }

    public String getForm39data() {
        System.out.println("******************FORM 39*******************getForm39data");
        FcForm39 f39dtol = new FcForm39();
        f39dtol.setDate139("24");
        setFcForm39(f39dtol);

        return SUCCESS;

    }

    public String form39desave() {
        String Date1 = request.getParameter("Date1");
        System.out.println("Date1---->" + Date1);
        addActionMessage("Saved Form 39:CERTIFICATE OF RECOGNITION OF FIT FACILITY INCLUDING GROUP FOSTER CARE");
        FcForm39 f399 = (FcForm39) getModel();
        f399.setProfileId(getProfile_id());
        caseWorkerService.formSaveService(f399);
        System.out.println("Form is Saved");
        return SUCCESS;
    }

    public String CWC_Meetings39Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 42 **********************************==== 
        ************************====************************====************************====-*/
    public String overProStay() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("overProStay->" + getFoundchildrenlist());
        return "success";
    }
    private List<F42dto> form42List = new ArrayList<F42dto>();

    public List<F42dto> getForm42List() {
        return form42List;
    }

    public void setForm42List(List<F42dto> form42List) {
        this.form42List = form42List;
    }
    public String getForm42() {
        System.out.println("rep required******->Form42");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form42.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F42dto f42dto = new F42dto();
            f42dto.setCpCname("Rajat");

            List<F42dto> fdList = new ArrayList<>();
            fdList.add(f42dto);

            setForm42List(fdList);

            System.out.println("---->" + getForm42List().size());
            System.out.println("---->" + getForm42List().get(0).getCpCname());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm42List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is422 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is422);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
    private F42dto f42dto;

    public F42dto getF42dto() {
        return f42dto;
    }

    public void setF42dto(F42dto f42dto) {
        this.f42dto = f42dto;
    }

    public String getForm42data() {
        System.out.println("******************FORM 42*******************getForm42data");
        F42dto f42dtol = new F42dto();
        f42dtol.setCpCname("Lippu");
        setF42dto(f42dtol);
        return SUCCESS;
    }

    public String form42desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 42:APPLICATION FOR SURRENDER OF CHILD");
        FcForm42 f422 = (FcForm42) getModel();
        f422.setProfileId(profile_id);
        caseWorkerService.formSaveService(f422);
        System.out.println("Form 42 is Saved");
        return SUCCESS;
    }

    public String CCL_Meetings42Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 44 **********************************==== 
        ************************====************************====************************====-*/
    public String reCumResOrd() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("reCumResOrd->" + getFoundchildrenlist());
        return "success";
    }
    private List<F44dto> form44List = new ArrayList<F44dto>();

    public List<F44dto> getForm44List() {
        return form44List;
    }

    public void setForm44List(List<F44dto> form44List) {
        this.form44List = form44List;
    }
    public String getForm44() {
        System.out.println("rep required******->Form44");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form44.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F44dto f44dto = new F44dto();
            f44dto.setCpCname("Rajat");

            List<F44dto> fdList = new ArrayList<>();
            fdList.add(f44dto);

            setForm44List(fdList);

            System.out.println("---->" + getForm44List().size());
            System.out.println("---->" + getForm44List().get(0).getCpCname());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm44List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is442 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is442);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
    private F44dto f44dto;

    public F44dto getF44dto() {
        return f44dto;
    }

    public void setF44dto(F44dto f44dto) {
        this.f44dto = f44dto;
    }

    public String getForm44data() {
        System.out.println("******************FORM 44*******************getForm44data");
        F44dto f44dtol = new F44dto();
        f44dtol.setCpCname("Lippu");
        setF44dto(f44dtol);
        return SUCCESS;
    }

    public String form44desave() {
        String cpCname = request.getParameter("cpCname");
        System.out.println("cpCname---->" + cpCname);
        addActionMessage("Saved Form 44:RELEASE CUM RESTORATION ORDER");
        return SUCCESS;
    }

    public String CCL_Meetings44Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************FORM 45 **********************************==== 
        ************************====************************====************************====-*/
    public String escOrd() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildrenreportStatus("callfordpo");
        setFoundchildrenlist(fctList);
        System.out.println("reCumResOrd->" + getFoundchildrenlist());
        return "success";
    }
    private List<F45dto> form45List = new ArrayList<F45dto>();

    public List<F45dto> getForm45List() {
        return form45List;
    }

    public void setForm45List(List<F45dto> form45List) {
        this.form45List = form45List;
    }
    public String getForm45() {
        System.out.println("rep required******->Form45");
        String reportName = request.getServletContext().getRealPath("/") + "WEB-INF/classes/reports/Form45.jrxml";
        reportMulParameter.put("TSLOGO_LOC", request.getServletContext().getRealPath("/") + "images/govt.png");
        System.out.println("rep name******->" + reportName);

        try {
            F45dto f45dto = new F45dto();
            f45dto.setCpCaseno("Rajat");

            List<F45dto> fdList = new ArrayList<>();
            fdList.add(f45dto);

            setForm45List(fdList);

            System.out.println("---->" + getForm45List().size());
            System.out.println("---->" + getForm45List().get(0).getCpCaseno());
            //1-I fill the dataSource with the Collection
            dataSource = new JRBeanCollectionDataSource(getForm45List(), false);

            //2-Compile the XML
            jasperReport = JasperCompileManager.compileReport(reportName);

            //3-Fill the report with the datasource
            jasperPrint = JasperFillManager.fillReport(jasperReport, reportMulParameter, dataSource);

            //4-Export to PDF and save to disk
            //JasperExportManager.exportReportToPdf(jasperPrint);
            InputStream is452 = new ByteArrayInputStream(JasperExportManager.exportReportToPdf(jasperPrint));
            setInputStream(is452);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;

    }
    private F45dto f45dto;

    public F45dto getF45dto() {
        return f45dto;
    }

    public void setF45dto(F45dto f45dto) {
        this.f45dto = f45dto;
    }

    public String getForm45data() {
        System.out.println("******************FORM 45*******************getForm45data");
        F45dto f45dtol = new F45dto();
        f45dtol.setCpCaseno("Lippu");
        setF45dto(f45dtol);
        return SUCCESS;
    }

    public String form45desave() {
        String cpCaseno = request.getParameter("cpCaseno");
        System.out.println("cpCname---->" + cpCaseno);
        addActionMessage("Saved Form 45:ESCORT ORDER");
        return SUCCESS;
    }

    public String CCL_Meetings45Formde() {
        return SUCCESS;
    }

    /*--************************====************************====************************=== 
                   ====********************END**********************************==== 
        ************************====************************====************************====-*/
    public String getReportFoundChild() {
        List<FcChildTemp> fctList = caseWorkerService.getfoundchildren();
        setFoundchildrenlist(fctList);
        System.out.println("reCumResOrd->" + getFoundchildrenlist());
        return "success";
    }
    public String getHandOverChild() {
        System.out.println("getReportFoundChild");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        //  System.out.println("foundlist.get(0).getAddofparents();"+foundlist.get(0).getAddofparents());
        return SUCCESS;
    }

    private List<FcChildTemp> sirChList = new ArrayList<>();

    public List<FcChildTemp> getSirChList() {
        return sirChList;
    }

    public void setSirChList(List<FcChildTemp> sirChList) {
        this.sirChList = sirChList;
    }

    public String getOrderFrSirde() {
        System.out.println("getRgetOrderFrSi   ");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String getSirde() {
        System.out.println("getSirde(){  ");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String surrChildde() {
        System.out.println("surrChildde(");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String deedSurde() {
        System.out.println("deedSurde(){ ");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String ordFosCarede() {
        System.out.println("ordFosCarede");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String utFosCarede() {
        System.out.println("utFosCarede(");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String recFosCarede() {
        System.out.println("recFosCarede");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String monInspFosCarede() {
        System.out.println("monInspFosCa");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String ordSponPlde() {
        System.out.println("ordSponPlde(");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String ordAftCrPlade() {
        System.out.println("ordAftCrPlad");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String appFFInclde() {
        System.out.println("appFFInclde(");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public String certFFInclde() {
        System.out.println("certFFInclde");
        Map<String, String[]> qual_strm = adminService.getReportFoundChild();
        setFoundlist(qual_strm.get("q"));
        return SUCCESS;
    }

    public HttpServletResponse getHsr() {
        return hsr;
    }

    public void setHsr(HttpServletResponse hsr) {
        this.hsr = hsr;
    }

}
