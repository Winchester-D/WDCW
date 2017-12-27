/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdac.caseworker.Service;

import com.cdac.caseworker.DAO.CaseWorkerDAO;
import com.cdac.caseworker.DTO.AdmissiontoCHSHDTO;
import com.cdac.caseworker.DTO.CWCMeetingMinutesDTO;
import com.cdac.caseworker.DTO.CWCMinutesOverViewDTO;
import com.cdac.caseworker.DTO.ChildDTO;
import com.cdac.caseworker.DTO.StayingPeriodOfChildDTO;
import com.cdac.caseworker.DTO.TransferDischargeDTO;
import com.cdac.caseworker.DTO.caseHistoryDTO;
import com.cdac.caseworker.DTO.caseWorkDTO;
import com.cdac.caseworker.DTO.icpChildDTO;
import com.cdac.common.util.CurrentDateProvider;
import com.cdac.common.util.DistinctValueColumnTableMapper;
import com.cdac.common.util.RegExUtil;
import com.cdac.common.util.StringToDate;
import com.cdac.usermanagement.DAO.AdminDAO;
import com.cdac.usermanagement.ORM.CasehistoryAdolescenceDetails;
import com.cdac.usermanagement.ORM.CasehistoryAfteradmEducation;
import com.cdac.usermanagement.ORM.CasehistoryEmploymentDetails;
import com.cdac.usermanagement.ORM.CasehistoryFamily;
import com.cdac.usermanagement.ORM.CasehistoryFamilyCrimeDetails;
import com.cdac.usermanagement.ORM.CasehistoryFamilyDetails;
import com.cdac.usermanagement.ORM.CasehistoryPersonal;
import com.cdac.usermanagement.ORM.CasehistoryPrioradmEducation;
import com.cdac.usermanagement.ORM.CasehistorySocialhistoryPrioradm;
import com.cdac.usermanagement.ORM.ChildDetails;
import com.cdac.usermanagement.ORM.ChildDetailsPK;
import com.cdac.usermanagement.ORM.ChildMaster;
import com.cdac.usermanagement.ORM.ChildStatus;
import com.cdac.usermanagement.ORM.CwcHop;
import com.cdac.usermanagement.ORM.CwcMeetings;
import com.cdac.usermanagement.ORM.CwcMinutes;
import com.cdac.usermanagement.ORM.CwcSir;
import com.cdac.usermanagement.ORM.CwcSo;
import com.cdac.usermanagement.ORM.CwcUppi;
import com.cdac.usermanagement.ORM.DischargeRegister;
import com.cdac.usermanagement.ORM.DistrictMaster;
import com.cdac.usermanagement.ORM.FcChildTemp;
import com.cdac.usermanagement.ORM.HomeDetails;
import com.cdac.usermanagement.ORM.HomeMaster;
import com.cdac.usermanagement.ORM.IcpPersonalDetails;
import com.cdac.usermanagement.ORM.IcpPostRelease;
import com.cdac.usermanagement.ORM.IcpPreRelease;
import com.cdac.usermanagement.ORM.InterviewRegister;
//import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 *
 * @author Anupam
 */
@Transactional(readOnly=false)
public class CaseWorkerServiceImpl implements CaseWorkerService {

    private CaseWorkerDAO caseWorkerDAO ;
    
    //for Admission into CHOH 
    private ChildDetails childDetails=new ChildDetails();
     private ChildDetailsPK childDetailsPK =new ChildDetailsPK();
     //private String childDetails_ProfileId;
     private Date childDetails_dob;
     private String religion_other;

    public ChildDetails getChildDetails() {
        return childDetails;
    }

    public void setChildDetails(ChildDetails childDetails) {
        this.childDetails = childDetails;
    }

    public ChildDetailsPK getChildDetailsPK() {
        return childDetailsPK;
    }

    public void setChildDetailsPK(ChildDetailsPK childDetailsPK) {
        this.childDetailsPK = childDetailsPK;
    }

    public Date getChildDetails_dob() {
        return childDetails_dob;
    }

    public void setChildDetails_dob(Date childDetails_dob) {
        this.childDetails_dob = childDetails_dob;
    }

    public String getReligion_other() {
        return religion_other;
    }

    public void setReligion_other(String religion_other) {
        this.religion_other = religion_other;
    }
    
      

    public CaseWorkerDAO getCaseWorkerDAO() {
        return caseWorkerDAO;
    }

    public void setCaseWorkerDAO(CaseWorkerDAO caseWorkerDAO) {
        this.caseWorkerDAO = caseWorkerDAO;
    }

    public String addChild(ChildMaster childMaster, String homeId,String yearString) {
        
        int chSeqNo=caseWorkerDAO.getNextChildNo();

        
        String generatedChildId=homeId.substring(7,10)+yearString+"_"+String.format("%06d", chSeqNo);

        

        childMaster.setChildProfileId(generatedChildId);
        childMaster.setDistrictId(new DistrictMaster(homeId.substring(3,6))); //hard coded
        childMaster.setHomeId(new HomeMaster(homeId));
        childMaster.setStatus("active");
        childMaster.setCallfordpo("no");


        return caseWorkerDAO.save(childMaster);

    }

    public List<ChildMaster> getChildrenList(String homeId) {
       
        return caseWorkerDAO.fetchChildrenInAHome(homeId);
   }

    
    
    public List<FcChildTemp> getfoundchildrenreportlist(String foundhomeId){
    
     return caseWorkerDAO.getfoundchildrenreportlist(foundhomeId);
    }
     public List<ChildMaster> getChildrenList_status(String homeId) {
        
        return caseWorkerDAO.fetchChildrenInAHome_status(homeId);
   }
    
     @Transactional(readOnly=false,propagation= Propagation.REQUIRES_NEW)    //annotation added by anupam on 23-04-2012
    public String dischargeTransferService(String currentHomeId,TransferDischargeDTO transferDischargeDTO) {
        

        String result="error";
        String cwcJjbOrderDate=transferDischargeDTO.getCwcJjbOrderDate();
        String dischargeDate=transferDischargeDTO.getDateOfDischarge();


             //-------Date conversion  
             String od[]= cwcJjbOrderDate.split("/");
            cwcJjbOrderDate=od[1]+"/"+od[0]+"/"+od[2];   //// Later change the date conversion using common utility

            String dd[]= dischargeDate.split("/");
            dischargeDate=dd[1]+"/"+dd[0]+"/"+dd[2];


            ChildMaster childMaster=caseWorkerDAO.getExistingChild(transferDischargeDTO.getChildIdToBeTransDis());//new ChildMaster(transferDischargeDTO.getChildIdToBeTransDis());
            childMaster.setTransOrderNo(transferDischargeDTO.getCwcJjbNo());
            childMaster.setTransOrderDate(new Date(cwcJjbOrderDate));
            
            DischargeRegister dischargeRegister=new DischargeRegister(transferDischargeDTO.getChildIdToBeTransDis());
            dischargeRegister.setChildMaster(new ChildMaster(transferDischargeDTO.getChildIdToBeTransDis()));
            dischargeRegister.setTransDischargeDate(new Date(dischargeDate));
            dischargeRegister.setCwcJjbOrderNo(transferDischargeDTO.getCwcJjbNo());
            dischargeRegister.setOrderDate(new Date(cwcJjbOrderDate));
            dischargeRegister.setHomeId(currentHomeId);
            dischargeRegister.setRemarks(transferDischargeDTO.getRemarks());
            dischargeRegister.setActionTaken(transferDischargeDTO.getActionTaken());
            dischargeRegister.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
            dischargeRegister.setLastModifiedBy(transferDischargeDTO.getLastmodifiedBy());
            
            
        if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("transfer"))
            {
            //home transfer case
             //System.out.println("Transferred Home id --------------------***************"+transferDischargeDTO.getTransHomeId());   
            childMaster.setTransHomeId(transferDischargeDTO.getTransHomeId());
            dischargeRegister.setTransHomeId(transferDischargeDTO.getTransHomeId());
            childMaster.setStatus("transfer");


            }
            else if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("handover") || transferDischargeDTO.getActionTaken().equalsIgnoreCase("releaseOnBail"))
                {
                //discharge to parents case
                dischargeRegister.setPersonHandedOver(transferDischargeDTO.getHandoverPersonName());
                dischargeRegister.setRelationshipChild(transferDischargeDTO.getPersonRelation());
                dischargeRegister.setPersonAddress(transferDischargeDTO.getHandoverPersonaddress());
                dischargeRegister.setPersonContact(transferDischargeDTO.getPersonContact());
              //  dischargeRegister.setActionTaken(transferDischargeDTO.getActionTaken());
                childMaster.setStatus("inactive");
                }
        else if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("otherstate"))
                {
                //discharge to parents case
                dischargeRegister.setState(transferDischargeDTO.getState());
                dischargeRegister.setAddressOtherstate(transferDischargeDTO.getAddressOtherstate());
                dischargeRegister.setHomenameOtherstate(transferDischargeDTO.getHomenameOtherstate());
                dischargeRegister.setOfficerHome(transferDischargeDTO.getOfficerHome());
             //   dischargeRegister.setActionTaken(transferDischargeDTO.getActionTaken());
                childMaster.setStatus("otherstate");
                }
        
        //anupam added this code for ngo START
        
        else if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("ngo"))
                {
                dischargeRegister.setAddressOtherstate(transferDischargeDTO.getAddressOtherstate());
                dischargeRegister.setHomenameOtherstate(transferDischargeDTO.getHomenameOtherstate());
               
                childMaster.setStatus("NGO");
                }
        
        //anupam added this code for ngo END
        
         //anupam added this code for after Care START
        
        else if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("After Care Home"))
                {
                    System.out.println("INSIDE -----------------------------------------------------after care ");    
                dischargeRegister.setAddressOtherstate(transferDischargeDTO.getAddressOtherstate());
                dischargeRegister.setHomenameOtherstate(transferDischargeDTO.getHomenameOtherstate());
               
                childMaster.setStatus("After Care");
                }
        
        //anupam added this code for after care END
        
        //anupam added this code for islamic center START
        
        else if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("Islamic Centre"))
                {
                    System.out.println("INSIDE --------------------------------------------------------Islamic");    
                dischargeRegister.setAddressOtherstate(transferDischargeDTO.getAddressOtherstate());
                dischargeRegister.setHomenameOtherstate(transferDischargeDTO.getHomenameOtherstate());
               
                childMaster.setStatus("Islamic Center");
                }
        
        else if(transferDischargeDTO.getActionTaken().equalsIgnoreCase("othercountry"))
                {
                    System.out.println("INSIDE --------------------------------------------------------othercountry");    
                dischargeRegister.setState(transferDischargeDTO.getCountry());
                dischargeRegister.setPersonHandedOver(transferDischargeDTO.getHandedOverTo());
               
                childMaster.setStatus("othercountry");
                }
        
        //anupam added this code for after care END
        

            try {
        //System.out.println("  ----------------------------------- "+childMaster.getChildProfileId());
        //System.out.println("  ----------------------------------- "+childMaster.getTransHomeId());
            String result1 = caseWorkerDAO.updateChildMaster(childMaster);
            
            //transaction test by anupam
            //int i=1/0;
            
            String result2 = caseWorkerDAO.save(dischargeRegister);
            
            result=(result1.equals("success")&&result2.equals("success"))?"success":"error";

        //result = caseWorkerDAO.updateChildMaster(childMaster);

        } catch (Exception e) {
            //add roll back here
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
  
            e.printStackTrace();
        }

return result;
        
    }
  
    public ChildMaster getChild_by_id(String childprofid) throws Exception
    {
        ChildMaster childmaster=new ChildMaster();
        try {
            childmaster=caseWorkerDAO.getChild_by_id(childprofid);
                    
        } catch (Exception e) {
            System.out.println("***ERROR***SERVICE");
            e.printStackTrace();
        }
        return childmaster;
    }

    public List<ChildMaster> getTransferedChildListForThisHome(String currentHomeId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.fetchTransferedChildList(currentHomeId);
    }

    public ChildMaster getTransferredChildDetails(String childProfileId) {
        //throw new UnsupportedOperationException("Not supported yet.");

        return caseWorkerDAO.getExistingChild(childProfileId);
    }

      public String saveCasework(ChildDetails childDetails) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result="error";
        try {
          
            
            result=caseWorkerDAO.saveCasework(childDetails);
           
        } catch (Exception e) {            
             // result="error";
            e.printStackTrace();
          
        }
        return result;
        
    }

    public ChildDetails getExistingChildDetails(String childProfileId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.getExistingChildDetails(childProfileId.trim());
        
    }

    public List<ChildMaster> getTransChildrenList(String homeId) {
       return caseWorkerDAO.fetchTransferedChildList(homeId);
    }

   @Transactional(readOnly=false,propagation= Propagation.REQUIRES_NEW)    //annotation added by anupam on 01-01-2014
    public String addChildtoCHSH(ChildMaster childMaster, String homeId, AdmissiontoCHSHDTO admissiontoCHSHDTO) {
        
         String result="error";
        
       try {
         ChildMaster childMaster1=caseWorkerDAO.getExistingChild(admissiontoCHSHDTO.getTransChildId());//new ChildMaster(transferDischargeDTO.getChildIdToBeTransDis());
        childMaster1.setStatus("inactive");
         
        
        childMaster1.setLastModifiedBy(admissiontoCHSHDTO.getLastModifiedBy());
        childMaster1.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
        
        
        int chSeqNo=caseWorkerDAO.getNextChildNo();

     
            System.out.println("--------------------------------Date time Admission = "+admissiontoCHSHDTO.getChildDetails_dob());
     
    Date admDate=StringToDate.getStringToDate(admissiontoCHSHDTO.getDateTimeAdm());
    String yearString=StringToDate.getYear(admissiontoCHSHDTO.getDateTimeAdm());
    
    Date probDisDate=StringToDate.getStringToDate(admissiontoCHSHDTO.getProbableDischargeDate_String());
    Date orderDate=StringToDate.getStringToDate(admissiontoCHSHDTO.getOrderDate_String());
    
    //if(admissiontoCHSHDTO.getChildDetails_dob()!=null)
    Date dob=(admissiontoCHSHDTO.getChildDetails_dob()==null)?null:StringToDate.getStringToDate(admissiontoCHSHDTO.getChildDetails_dob());
        
      
        String generatedChildId=homeId.substring(7,10)+yearString+"_"+String.format("%06d", chSeqNo);
        
        
        // for CHOH Admission Details in child Master
        childMaster.setChildProfileId(generatedChildId);
        childMaster.setDistrictId(new DistrictMaster(homeId.substring(3,6))); //hard coded
        childMaster.setHomeId(new HomeMaster(homeId));
        childMaster.setStatus("active");
        childMaster.setCallfordpo("no");
        childMaster.setChildName(admissiontoCHSHDTO.getChildName());
        childMaster.setChildSurname(admissiontoCHSHDTO.getChildSurname());
        childMaster.setDateTimeAdm(admDate);
        childMaster.setAge(admissiontoCHSHDTO.getAge());
        childMaster.setGender(admissiontoCHSHDTO.getGender());
        childMaster.setChildNature(admissiontoCHSHDTO.getChildNature());
        childMaster.setDisabled(admissiontoCHSHDTO.getDisabled());
        childMaster.setNatureDisability(admissiontoCHSHDTO.getNatureDisability());
        childMaster.setAdmThrough(admissiontoCHSHDTO.getAdmThrough());
        childMaster.setNameAuthPer(admissiontoCHSHDTO.getNameAuthPer());
        childMaster.setCwcJjbOrderNo(admissiontoCHSHDTO.getCwcJjbOrderNo());
        childMaster.setOrderDate(orderDate);
        childMaster.setReasonAdm(admissiontoCHSHDTO.getReasonAdm());
        childMaster.setProvisionLaw(admissiontoCHSHDTO.getProvisionLaw());
        childMaster.setIdentificationMarks(admissiontoCHSHDTO.getIdentificationMarks());
        childMaster.setPropertyPossessed(admissiontoCHSHDTO.getPropertyPossessed());
        childMaster.setRecommCaseworker(admissiontoCHSHDTO.getRecommCaseworker());
        childMaster.setRecommCwc(admissiontoCHSHDTO.getRecommCwc());
        childMaster.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
        childMaster.setProbableDischargeDate(probDisDate);
        childMaster.setPeriodStay(admissiontoCHSHDTO.getPeriodStay());
        childMaster.setOldProfileId(admissiontoCHSHDTO.getTransChildId());
        childMaster.setLastModifiedBy(admissiontoCHSHDTO.getLastModifiedBy());
        
        //For saving CHOH Admission details in Child Details
        
        
        
         childDetailsPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
         childDetailsPK.setChildProfileId(generatedChildId);
         childDetails.setChildDetailsPK(childDetailsPK);
         childDetails.setDob(dob);
         childDetails.setReligion(admissiontoCHSHDTO.getReligion());
        if(childDetails.getReligion().equalsIgnoreCase("Other")){        
        childDetails.setReligion(admissiontoCHSHDTO.getReligion_other());
        }
        childDetails.setChildName(admissiontoCHSHDTO.getChildName());
        childDetails.setChildSurname(admissiontoCHSHDTO.getChildSurname());
        childDetails.setCaste(admissiontoCHSHDTO.getCaste());
        childDetails.setSubcaste(admissiontoCHSHDTO.getSubcaste());
        childDetails.setAge(admissiontoCHSHDTO.getAge());
        childDetails.setFatherName(admissiontoCHSHDTO.getFatherName());
        childDetails.setFatherOccup(admissiontoCHSHDTO.getFatherOccup());
        childDetails.setMotherName(admissiontoCHSHDTO.getMotherName());
        childDetails.setMotherOccup(admissiontoCHSHDTO.getMotherOccup());
        childDetails.setNoBrothers(admissiontoCHSHDTO.getNoBrothers());
        childDetails.setNoSister(admissiontoCHSHDTO.getNoSister());
        childDetails.setLanguagesKnown(admissiontoCHSHDTO.getLanguagesKnown());
        childDetails.setAddrParents(admissiontoCHSHDTO.getAddrParents());
        childDetails.setIntrRelatives(admissiontoCHSHDTO.getIntrRelatives());
        childDetails.setIdentifiedProblemsChild(admissiontoCHSHDTO.getIdentifiedProblemsChild());
        childDetails.setEduStatus(admissiontoCHSHDTO.getEduStatus());
        childDetails.setLastModifiedBy(admissiontoCHSHDTO.getLastModifiedBy());
          
        
            String result1 = caseWorkerDAO.updateChildMaster(childMaster1);
            System.out.println("result1--------------->"+result1);
            
           String result2=  caseWorkerDAO.save(childMaster);
           System.out.println("result2--------------->"+result2);
           String result3=caseWorkerDAO.saveCasework(childDetails);
           System.out.println("result3--------------->"+result3);
            result=((result1.equals("success")&&result2.equals("success"))&& result3.equals("success"))?"success":"error";
        
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
        }
       
        return result;
    }
   
   /*----------------------NEW SHCH ADMISSION METHOD---------START-----------*/
   @Transactional(readOnly=false,propagation= Propagation.REQUIRES_NEW)    //annotation added by anupam on 01-01-2014
    public String addChildtoCHSH_NEW(ChildMaster childMaster, String homeId, AdmissiontoCHSHDTO admissiontoCHSHDTO) {
        
         String result="error";
        
       try {
         ChildMaster childMaster1=null;
          
         if(!(admissiontoCHSHDTO.getTransChildId().equalsIgnoreCase("none"))){
        childMaster1=caseWorkerDAO.getExistingChild(admissiontoCHSHDTO.getTransChildId());//new ChildMaster(transferDischargeDTO.getChildIdToBeTransDis());
        childMaster1.setStatus("inactive");
         
        
        childMaster1.setLastModifiedBy(admissiontoCHSHDTO.getLastModifiedBy());
        childMaster1.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
         }
        
        int chSeqNo=caseWorkerDAO.getNextChildNo();

     
            //System.out.println("--------------------------------Date time Admission = "+admissiontoCHSHDTO.getChildDetails_dob());
     
    Date admDate=StringToDate.getStringToDate(admissiontoCHSHDTO.getDateTimeAdm());
    String yearString=StringToDate.getYear(admissiontoCHSHDTO.getDateTimeAdm());
    
    Date probDisDate=(admissiontoCHSHDTO.getProbableDischargeDate_String()==null)?null:StringToDate.getStringToDate(admissiontoCHSHDTO.getProbableDischargeDate_String());
    Date orderDate=StringToDate.getStringToDate(admissiontoCHSHDTO.getOrderDate_String());
    
    //if(admissiontoCHSHDTO.getChildDetails_dob()!=null)
    Date dob=(admissiontoCHSHDTO.getChildDetails_dob()==null)?null:StringToDate.getStringToDate(admissiontoCHSHDTO.getChildDetails_dob());
        
      
        String generatedChildId=homeId.substring(7,10)+yearString+"_"+String.format("%06d", chSeqNo);
        
        
        // for CHOH Admission Details in child Master
        childMaster.setChildProfileId(generatedChildId);
        childMaster.setDistrictId(new DistrictMaster(homeId.substring(3,6))); //hard coded
        childMaster.setHomeId(new HomeMaster(homeId));
        childMaster.setStatus("active");
        childMaster.setCallfordpo("no");
        childMaster.setChildName(admissiontoCHSHDTO.getChildName());
        childMaster.setChildSurname(admissiontoCHSHDTO.getChildSurname());
        childMaster.setDateTimeAdm(admDate);
        childMaster.setAge(admissiontoCHSHDTO.getAge());
        childMaster.setGender(admissiontoCHSHDTO.getGender());
        childMaster.setChildNature(admissiontoCHSHDTO.getChildNature());
        childMaster.setDisabled(admissiontoCHSHDTO.getDisabled());
        childMaster.setNatureDisability(admissiontoCHSHDTO.getNatureDisability());
        childMaster.setAdmThrough(admissiontoCHSHDTO.getAdmThrough());
        childMaster.setNameAuthPer(admissiontoCHSHDTO.getNameAuthPer());
        childMaster.setCwcJjbOrderNo(admissiontoCHSHDTO.getCwcJjbOrderNo());
        childMaster.setOrderDate(orderDate);
        childMaster.setReasonAdm(admissiontoCHSHDTO.getReasonAdm());
        childMaster.setProvisionLaw(admissiontoCHSHDTO.getProvisionLaw());
        childMaster.setIdentificationMarks(admissiontoCHSHDTO.getIdentificationMarks());
        childMaster.setPropertyPossessed(admissiontoCHSHDTO.getPropertyPossessed());
        childMaster.setRecommCaseworker(admissiontoCHSHDTO.getRecommCaseworker());
        childMaster.setRecommCwc(admissiontoCHSHDTO.getRecommCwc());
        childMaster.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
        childMaster.setProbableDischargeDate(probDisDate);
        childMaster.setPeriodStay(admissiontoCHSHDTO.getPeriodStay());
        childMaster.setOldProfileId(admissiontoCHSHDTO.getTransChildId());
        childMaster.setLastModifiedBy(admissiontoCHSHDTO.getLastModifiedBy());
        
        //For saving CHOH Admission details in Child Details
        
        
        
         childDetailsPK.setLastModifiedDate(CurrentDateProvider.getCurrentDate());
         childDetailsPK.setChildProfileId(generatedChildId);
         childDetails.setChildDetailsPK(childDetailsPK);
         childDetails.setDob(dob);
         childDetails.setReligion(admissiontoCHSHDTO.getReligion());
        if(childDetails.getReligion().equalsIgnoreCase("Other")){        
        childDetails.setReligion(admissiontoCHSHDTO.getReligion_other());
        }
        childDetails.setChildName(admissiontoCHSHDTO.getChildName());
        childDetails.setChildSurname(admissiontoCHSHDTO.getChildSurname());
        childDetails.setCaste(admissiontoCHSHDTO.getCaste());
        childDetails.setSubcaste(admissiontoCHSHDTO.getSubcaste());
        childDetails.setAge(admissiontoCHSHDTO.getAge());
        childDetails.setFatherName(admissiontoCHSHDTO.getFatherName());
        childDetails.setFatherOccup(admissiontoCHSHDTO.getFatherOccup());
        childDetails.setMotherName(admissiontoCHSHDTO.getMotherName());
        childDetails.setMotherOccup(admissiontoCHSHDTO.getMotherOccup());
        childDetails.setNoBrothers(admissiontoCHSHDTO.getNoBrothers());
        childDetails.setNoSister(admissiontoCHSHDTO.getNoSister());
        childDetails.setLanguagesKnown(admissiontoCHSHDTO.getLanguagesKnown());
        childDetails.setAddrParents(admissiontoCHSHDTO.getAddrParents());
        childDetails.setIntrRelatives(admissiontoCHSHDTO.getIntrRelatives());
        childDetails.setIdentifiedProblemsChild(admissiontoCHSHDTO.getIdentifiedProblemsChild());
        childDetails.setEduStatus(admissiontoCHSHDTO.getEduStatus());
        childDetails.setLastModifiedBy(admissiontoCHSHDTO.getLastModifiedBy());
          
        
            String result1 ="error"; 
            
            if(childMaster1 != null)
            result1 = caseWorkerDAO.updateChildMaster(childMaster1);
            else
                result1="success";
            
            System.out.println("result1--------------->"+result1);
            
           String result2=  caseWorkerDAO.save(childMaster);
           System.out.println("result2--------------->"+result2);
           String result3=caseWorkerDAO.saveCasework(childDetails);
           System.out.println("result3--------------->"+result3);
            result=((result1.equals("success")&&result2.equals("success"))&& result3.equals("success"))?"success":"error";
        
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            e.printStackTrace();
        }
       
        return result;
    }
   /*-------------*/
    public String saveInterViewDetails(InterviewRegister interviewRegister) {
        String result="error";
        try {
               
            result=caseWorkerDAO.saveInterviewRegister(interviewRegister);
                   
        } catch (Exception e) {            
               e.printStackTrace();
          
        }
        return result;
        
    }

    public String saveCaseHistoryPersonal(CasehistoryPersonal casehistoryPersonal) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result="error";
        try {
            
            result=caseWorkerDAO.saveCaseHistoryPersonal(casehistoryPersonal);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
        
    }

    public String saveCasehistoryChildhousehold(CasehistoryFamily casehistoryFamily) {
       // throw new UnsupportedOperationException("Not supported yet.");
        
        
        return caseWorkerDAO.saveCasehistoryChildHouseholdDetails(casehistoryFamily);
    }

    public String savecasehistoryFamilyDetails(CasehistoryFamilyDetails casehistoryFamilyDetails) {
       // throw new UnsupportedOperationException("Not supported yet.");
        
        return caseWorkerDAO.saveCasehistoryFamilyDetails(casehistoryFamilyDetails);
    }

    public String savecasehistoryAdolescenceHistory(CasehistoryAdolescenceDetails casehistoryAdolescenceDetails) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.saveCasehistoryAdolscenceHistory(casehistoryAdolescenceDetails);
    }

    public String savecasehistoryEmploymentDetails(CasehistoryEmploymentDetails casehistoryEmploymentDetails) {
       // throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.saveCasehistoryEmploymentDetails(casehistoryEmploymentDetails);
        
        
    }

    public String savecasehistoryPriorAdmEducationDetails(CasehistoryPrioradmEducation casehistoryPrioradmEducation) {
      //  throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.saveCasehistoryPriorAdmEducationDetails(casehistoryPrioradmEducation);
    }

    public String savecasehistoryFamilyCrimeDetails(CasehistoryFamilyCrimeDetails casehistoryFamilyCrimeDetails) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.saveCasehistoryFamilyCrimeDetails(casehistoryFamilyCrimeDetails);
    }

    public String savecasehistoryAfterAdmEducationDetails(CasehistoryAfteradmEducation casehistoryAfteradmEducation) {
       // throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.saveCasehistoryAfterAdmEducationDetails(casehistoryAfteradmEducation);
    }

    public String savecasehistorySocialHistoryDetails(CasehistorySocialhistoryPrioradm casehistorySocialhistoryPrioradm) {
       // throw new UnsupportedOperationException("Not supported yet.");
        return caseWorkerDAO.saveCasehistorySocialHistoryDetails(casehistorySocialhistoryPrioradm);
    }


    
    
    public String saveChildStatus(ChildStatus childStatus, String chiprofid, String userid) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result="error";
        
             ChildMaster childMaster1=caseWorkerDAO.getExistingChild(chiprofid);//new ChildMaster(transferDischargeDTO.getChildIdToBeTransDis());
            if(childStatus.getType().equalsIgnoreCase("runaway"))
            {
            childMaster1.setStatus("runaway");
            }
           else if(childStatus.getType().equalsIgnoreCase("missing"))
            {
            childMaster1.setStatus("missing");
            }
           else if(childStatus.getType().equalsIgnoreCase("shortleave"))
            {
            childMaster1.setStatus("shortleave");
            }
           else if(childStatus.getType().equalsIgnoreCase("residential"))
            {
            childMaster1.setStatus("residential");
            }
           else if(childStatus.getType().equalsIgnoreCase("runawaycameback"))
            {
            childMaster1.setStatus("active");
            }
           else if(childStatus.getType().equalsIgnoreCase("missingfound"))
            {
            childMaster1.setStatus("active");
            }
           else if(childStatus.getType().equalsIgnoreCase("shortleavereturn"))
            {
            childMaster1.setStatus("active");
            }
           else if(childStatus.getType().equalsIgnoreCase("residentialreturned"))
            {
            childMaster1.setStatus("active");
            }
        childMaster1.setLastModifiedBy(userid);
        
        childMaster1.setLastModifiedDate(CurrentDateProvider.getCurrentDate());            
            
        String name=childMaster1.getChildName();
        String surname=childMaster1.getChildSurname();
        childStatus.setChildName(name);
        childStatus.setChildSurname(surname);
        try {
        
         String result1 = caseWorkerDAO.updateChildMaster(childMaster1);
            String result2 = caseWorkerDAO.saveChildStatus(childStatus);
            
            result=(result1.equals("success")&&result2.equals("success"))?"success":"error";

        
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<InterviewRegister> getChildInterviewDetails(String chprofid) {
       return caseWorkerDAO.getChildInterviewDetails(chprofid);
    }
/* Anupam Start here */
    public List<HomeMaster> getHomesOfACwcDist(String userId) {
        
        List<HomeMaster> homeMasters=new ArrayList<HomeMaster>();
        
        try {
            //get the cwc id
            int cwcId=caseWorkerDAO.getCwcIdBasedOnUserIdAndStatus(userId, "active");
            
            if(cwcId!=-1)
            {
            //get the district id of the cwc
                String districtId=caseWorkerDAO.getDistrictidByCwcid(cwcId);
                
                //get the homeMaster
                homeMasters=caseWorkerDAO.getHomesInAdistrict(districtId);
                
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return homeMasters;
        
    }

    public int saveMeeting(CwcMeetings cwcMeetings) {
        
        return caseWorkerDAO.saveMeeting(cwcMeetings);
        
    }

    public int getCwcIdBasedOnUserIdAndStatus(String userId, String status) {
        return caseWorkerDAO.getCwcIdBasedOnUserIdAndStatus(userId, status);
    }

    public String saveCWCMeetingsMinutes(CwcMinutes cwcMinutes,String chprofid,String userid) {
        
         String result="error";
        
             ChildMaster childMaster2=caseWorkerDAO.getExistingChild(chprofid);//new ChildMaster(transferDischargeDTO.getChildIdToBeTransDis());
            if(cwcMinutes.getOrderIssued().equalsIgnoreCase("callfordpo"))
            {
            childMaster2.setCallfordpo("yes");
            }
          
        childMaster2.setLastModifiedBy(userid);
        
        childMaster2.setLastModifiedDate(CurrentDateProvider.getCurrentDate());            
            
             try {
        
         String result1 = caseWorkerDAO.updateChildMaster(childMaster2);
            String result2 = caseWorkerDAO.saveCWCMeetingsMinutes(cwcMinutes);
            
            result=(result1.equals("success")&&result2.equals("success"))?"success":"error";
 
             }
             catch(Exception e)
             {
                 
              e.printStackTrace();   
             }
             return result;
    }

    public List<Date> getCwcMinutesDates(String homeid, Date fromdate, Date todate) {
        //System.out.println("CWC Meeting minutes------------in service=====>>"+homeid+"  "+fromdate+" "+todate);
       return caseWorkerDAO.getCwcMinutesDates(homeid, fromdate, todate);
    }

    public List<CwcMinutes> getCWCMeetingMinutesDetails(String homeid, Date selectdate) {
        
        return caseWorkerDAO.getCWCMeetingMinutesDetails(homeid, selectdate);
      
    }

    public CwcMeetings getCwcMeetingDetails(int meetingId) {
        return caseWorkerDAO.getCwcMeetingDetails(meetingId);
    }
    
    // start by vinumol
      
    public List<CasehistoryPersonal> getChildHistory_by_id(String childProfileId)
    {
         return caseWorkerDAO.getChildHistory_by_id(childProfileId);

    }
	 
    
    public List<caseHistoryDTO> getChildHistoryFromDto_by_id(String childProfileId)
    {
        //CasehistoryPersonal chp=new CasehistoryPersonal();
        List<caseHistoryDTO> chdtolist =new ArrayList<caseHistoryDTO>();
        
        List<CasehistoryPersonal> chplist =new ArrayList<CasehistoryPersonal>();
        List<CasehistoryFamily> chfamily=new ArrayList<CasehistoryFamily>();
        List<CasehistoryFamilyDetails> cfdlist=new ArrayList<CasehistoryFamilyDetails>();
        List<CasehistoryFamilyCrimeDetails> crimelist=new ArrayList<CasehistoryFamilyCrimeDetails>(); 
        List<CasehistoryAdolescenceDetails> adlist=new  ArrayList<CasehistoryAdolescenceDetails>();
        List<CasehistoryEmploymentDetails> emplist= new ArrayList<CasehistoryEmploymentDetails>();
        List<CasehistoryPrioradmEducation> pedulist=new ArrayList<CasehistoryPrioradmEducation>();
        List<CasehistoryAfteradmEducation> alist=new ArrayList<CasehistoryAfteradmEducation>();
       // List<CasehistorySocialhistoryPrioradm> slist=new ArrayList<CasehistorySocialhistoryPrioradm>();
        
        
        
        chplist=caseWorkerDAO.getChildHistory_by_id(childProfileId);
         
         //System.out.println("The child personal list in service implimenation"+chplist);
         caseHistoryDTO cdto= new  caseHistoryDTO();
         if(!chplist.isEmpty())
         {
             for(CasehistoryPersonal cp:chplist)
             {
            //System.out.println("The child personal list in service implimentation's FOR LOOP"+cp.getChildName());
            cdto.setChildName(cp.getChildName());
            //System.out.println("AFTER SET METHOD"+cdto.getChildName());
            cdto.setGender(cp.getGender());
            cdto.setAgeAdmission(cp.getAgeAdmission());
            cdto.setAgePresent(cp.getAgePresent());
            cdto.setReligion(cp.getReligion());
            cdto.setLocalResidence(cp.getLocalResidence());
            cdto.setCaste(cp.getCaste());
            cdto.setSubcaste(cp.getSubcaste());
            cdto.setNativeDistrict(cp.getNativeDistrict());
            cdto.setNativeState(cp.getNativeState());
            cdto.setHousingType(cp.getHousingType());
            cdto.setHousingSpace(cp.getHousingSpace());
            cdto.setHouseOwnership(cp.getHouseOwnership());
            cdto.setBroughtbeforeCwc(cp.getBroughtbeforeCwc());
            cdto.setReasonLeavingFamily(cp.getReasonLeavingFamily());
            cdto.setVerbalAbuse(cp.getVerbalAbuse());
            cdto.setPhysicalAbuse(cp.getPhysicalAbuse());
            cdto.setSexualAbuse(cp.getSexualAbuse());
            cdto.setOtherAbuse(cp.getOtherAbuse());
            cdto.setIlltreatDenialFood(cp.getIlltreatDenialFood());
            cdto.setIlltreatBeatenMercilessly(cp.getIlltreatBeatenMercilessly());
            cdto.setIlltreatCauseInjury(cp.getIlltreatCauseInjury());
            cdto.setIlltreatOthers(cp.getIlltreatOthers());
            cdto.setExploitationChild(cp.getExploitationChild());
            cdto.setHsbaRespiratory(cp.getHsbaRespiratory());
            cdto.setHsbaHearing(cp.getHsbaHearing());
            cdto.setHsbaEye(cp.getHsbaEye());
            cdto.setHsbaDental(cp.getHsbaDental());
            cdto.setHsbaCordiac(cp.getHsbaCordiac());
            cdto.setHsbaSkin(cp.getHsbaSkin());
            cdto.setHsbaSexualDiseases(cp.getHsbaSexualDiseases());
            cdto.setHsbaNeurological(cp.getHsbaNeurological());
            cdto.setHsbaMentalHandicap(cp.getHsbaMentalHandicap());
            cdto.setHsbaPhysicalHandicap(cp.getHsbaPhysicalHandicap());
            cdto.setHsbaOthers(cp.getHsbaOthers());
            cdto.setChildStayPriorAdmission(cp.getChildStayPriorAdmission());   
            cdto.setVpmcPriorInsti(cp.getVpmcPriorInsti());
            cdto.setVpmcAfterInsti(cp.getVpmcAfterInsti());
            cdto.setVchfPriorInsti(cp.getVchfPriorInsti());
            cdto.setVchfAfterInsti(cp.getVchfAfterInsti());
            cdto.setCwpPriorInsti(cp.getCwpPriorInsti());
            cdto.setCwpAfterInsti(cp.getCwpAfterInsti());
             }
         }
         
            chplist=null;            
            chfamily=caseWorkerDAO.getCasehistoryFamily(childProfileId);
            //System.out.println("getting child family history"+chfamily);
            if(!chfamily.isEmpty())
            {
                List<CasehistoryFamily> myCHFamily=new ArrayList<CasehistoryFamily>();
                for (Iterator<CasehistoryFamily> it = chfamily.iterator(); it.hasNext();) {
                    CasehistoryFamily casehistoryFamily = it.next();
                    myCHFamily.add(casehistoryFamily);    
                }
                
                 cdto.setCl(myCHFamily);                    
              
            }
            cfdlist=caseWorkerDAO.getCasehistoryFamilyDetails(childProfileId);
            if(!cfdlist.isEmpty())
            {
               for(CasehistoryFamilyDetails cf:cfdlist)
             {
                 cdto.setFamilyType(cf.getFamilyType());
                 //System.out.println("AFTER SET METHOD FAMILY************"+cdto.getFamilyType());
                 cdto.setFmRelation(cf.getFmRelation());
                 cdto.setFcRelation(cf.getFcRelation());
                 cdto.setMcRelation(cf.getMcRelation());
                 cdto.setFsRelation(cf.getFsRelation());
                 cdto.setMsRelation(cf.getMsRelation());
                 cdto.setJsRelation(cf.getJsRelation());
                 cdto.setPropertyFamilyLanded(cf.getPropertyFamilyLanded());
                 cdto.setPropertyFamilyHousehold(cf.getPropertyFamilyHousehold());
                 cdto.setPropertyFamilyVehicals(cf.getPropertyFamilyVehicals());
                 cdto.setPropertyFamilyOthers(cf.getPropertyFamilyOthers());
                 cdto.setMarriageDetailsParents(cf.getMarriageDetailsParents());
                 cdto.setMarriageDetailsBrothers(cf.getMarriageDetailsBrothers());
                 cdto.setMarriageDetailsSisters(cf.getMarriageDetailsSisters());
                 cdto.setSocialActivityFamily(cf.getSocialActivityFamily());
                 cdto.setParentalCareJuvnileBeforeAdmission(cf.getParentalCareJuvnileBeforeAdmission());
             }
            }
            cfdlist=null;
            crimelist=caseWorkerDAO.getCasehistoryFamilyCrimeDetails(childProfileId);
            if(!crimelist.isEmpty())
            {
                
                List<CasehistoryFamilyCrimeDetails> myCHFCList=new ArrayList<CasehistoryFamilyCrimeDetails>();
                for (Iterator<CasehistoryFamilyCrimeDetails> it = crimelist.iterator(); it.hasNext();) {
                    CasehistoryFamilyCrimeDetails casehistoryFamilyCrimeDetails = it.next();
                    myCHFCList.add(casehistoryFamilyCrimeDetails);
                }
                cdto.setCrimelist(myCHFCList);                    
             
            }
            crimelist=null;
           
            adlist=caseWorkerDAO.getCasehistoryAdolescenceDetails(childProfileId);
            CasehistoryAdolescenceDetails ad=new CasehistoryAdolescenceDetails();
            if(!adlist.isEmpty())
            {
            ad=adlist.get(0);
            System.out.println("in cw service--------------->"+ad);
            
        //    if(!myAdlDet.isEmpty())
        //    {
        //       for(CasehistoryAdolescenceDetails ad:myAdlDet)
         //      {
               cdto.setPuberty(ad.getPuberty());
               cdto.setDeliquentBehaviour(ad.getDeliquentBehaviour());
               cdto.setReasonDeliquentBehaviour(ad.getReasonDeliquentBehaviour());
               cdto.setDrugAbuse(ad.getDrugAbuse());
               cdto.setHobbies(ad.getHobbies());
               cdto.setHabits(ad.getHabits());
               cdto.setIncomeUtilization(ad.getIncomeUtilization());
               cdto.setSavingDetails(ad.getSavingDetails());
               cdto.setWorkingHours(ad.getWorkingHours()); 
        //       }
        //     }
            }
            emplist=caseWorkerDAO.getCasehistoryEmploymentDetails(childProfileId);
            if(!emplist.isEmpty())
            {
                List<CasehistoryEmploymentDetails> myEmpDetList=new ArrayList<CasehistoryEmploymentDetails>();
                for (Iterator<CasehistoryEmploymentDetails> it = emplist.iterator(); it.hasNext();) {
                    CasehistoryEmploymentDetails casehistoryEmploymentDetails = it.next();
                    myEmpDetList.add(casehistoryEmploymentDetails);
                    
                }
                cdto.setEmplist(myEmpDetList);                        
            }
            emplist=null;
            pedulist=caseWorkerDAO.getCasehistoryPrioradmEducationDetails(childProfileId);
            if(!pedulist.isEmpty())
            {
                for(CasehistoryPrioradmEducation ped:pedulist)
                {
                 cdto.setEducationPriorAdmission(ped.getEducationPriorAdmission()); 
                 cdto.setReasonLeavingSchool(ped.getReasonLeavingSchool());
                 cdto.setDetailsSchoolStudied(ped.getDetailsSchoolStudied());
                 cdto.setMediumInstruction(ped.getMediumInstruction());
                }
                                 
            }
            pedulist=null;
            alist=caseWorkerDAO.getCasehistoryAfteradmEducationDetails(childProfileId);
             if(!alist.isEmpty())
            {
                List<CasehistoryAfteradmEducation> myAftEduList=new ArrayList<CasehistoryAfteradmEducation>();
                // myAftEduList.addAll(alist);
                for (Iterator<CasehistoryAfteradmEducation> it = alist.iterator(); it.hasNext();) {
                    CasehistoryAfteradmEducation casehistorySocialhistoryaftadm = it.next();
                    myAftEduList.add(casehistorySocialhistoryaftadm);
                    
                    
                }
                 
                 cdto.setAedulist(myAftEduList);
            //System.out.println("the list from dto %%%%%%%%%%%%"+cdto.getAedulist().get(0).getNameAdmission());
            }
            alist=null; 
          //  slist=caseWorkerDAO.getCasehistorySocialPrioradm(childProfileId);
            /* 
        try {
            ChildMaster cm=caseWorkerDAO.getChild_by_id(childProfileId);
            System.out.println("--------child master------->"+cm+"-----"+cm.getChildName());
            
            slist=cm.getCasehistorySocialhistoryPrioradmList();
            
            // System.out.println("--------child master------->"+cm+"-----"+cm.getChildName());
            
           
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(CaseWorkerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            if(!slist.isEmpty())
            {
                 System.out.println("list----------"+"    one --------"+slist.get(0));
                 for (int i = 0; i < slist.size(); i++) {
                   slist.get(i).setCasehistorySocialhistoryPrioradmPK(null);
                   slist.get(i).setChildMaster(null);
                }
                 
                List<CasehistorySocialhistoryPrioradm> mySocHisList=new ArrayList<CasehistorySocialhistoryPrioradm>();
                for (Iterator<CasehistorySocialhistoryPrioradm> it = slist.iterator(); it.hasNext();) {
                    CasehistorySocialhistoryPrioradm casehistorySocialhistoryPrioradm = it.next();
                    mySocHisList.add(casehistorySocialhistoryPrioradm);   
                }
                cdto.setShlist(mySocHisList);
                //System.out.println("the SOCIAL HISTORY List from dto %%%%%%%%%%%%"+cdto.getShlist().get(0).getFriendsMajority());
            }
             * 
             */
          //  slist=null;
            chdtolist.add(cdto);
            // }
             
        // }
         
         return chdtolist;
    }
    
 

    public List<caseWorkDTO> getCaseworkFromDto(String homeId, String childProfileId) 
    {
       
       List<ChildDetails> cdList=new ArrayList<ChildDetails>();
       List<caseWorkDTO> cwdtoList=new ArrayList<caseWorkDTO>();
       caseWorkDTO cwdto= new caseWorkDTO();
       List<HomeDetails> hdList=new ArrayList<HomeDetails>();
       
       //HomeDetails hd=new HomeDetails();
       cdList=caseWorkerDAO.getChildDetails(childProfileId);
       HomeMaster hm=caseWorkerDAO.getHomeMaster(homeId);
       if(!cdList.isEmpty())
         {
             for(ChildDetails c:cdList)
             {
                 cwdto.setChildProfileId(childProfileId);
              cwdto.setChildName(c.getChildName()); 
              cwdto.setReligion(c.getReligion());
              cwdto.setAge(c.getAge());
              cwdto.setEduStatus(c.getEduStatus());
              cwdto.setFatherName(c.getFatherName());
              cwdto.setFatherOccup(c.getFatherOccup());
              cwdto.setMotherName(c.getMotherName());
              cwdto.setMotherOccup(c.getMotherOccup());
              cwdto.setNoBrothers(c.getNoBrothers());
              cwdto.setNoSister(c.getNoSister());
              cwdto.setIntrRelatives(c.getIntrRelatives());
              cwdto.setDob(c.getDob());
              cwdto.setCaste(c.getCaste());
              cwdto.setSubcaste(c.getSubcaste());
              cwdto.setLanguagesKnown(c.getLanguagesKnown());
              cwdto.setAddrParents(c.getAddrParents());
              cwdto.setIdentifiedProblemsChild(c.getIdentifiedProblemsChild());
              
              hdList=caseWorkerDAO.getHomeDetail(homeId);
              if(!cdList.isEmpty())
         {
             for(HomeDetails h:hdList)
                     {
              cwdto.setHomeAddress(h.getHomeAddress());
                                   h.getHomeMaster().getHomeName();
                 }
             }
              cwdto.setHomeName(hm.getHomeName());
              cwdto.setHomeAddrMat(hm.getDistrictId().getStateName()+"."+hm.getDistrictId().getDistrictId());
              //cwdto.setHdlist(hdList);
             ////System.out.println("Vinumol Praveen####################"+ hd.getHomeAddress());
             cwdtoList.add(cwdto);
             }
             
             }
       
    return cwdtoList;
    }
    
    //end by vinumol

   //Added by Vinumol 5/2/2011
    public List<ChildMaster> getChildAdmissionDetails(String childProfileId) {
         return caseWorkerDAO.getChildAdmissionDetails(childProfileId);
    }
    //Ended by vinumol 5/2/11
    
    //anupam added this on 8-2-2012 START
    
     public List<CWCMinutesOverViewDTO> getCwcMinutesOverViewDTOs(String homeid, Date fromdate, Date todate) {
     
         List<CWCMinutesOverViewDTO> cMinutesOverViewDTOs = caseWorkerDAO.getCwcMinutesOverViewDTOs(homeid, fromdate, todate);
         
         //System.out.println("INSIDE SERVICE getCwcMinutesOverViewDTOs");
         
         Iterator i = cMinutesOverViewDTOs.iterator();
         while(i.hasNext())
         {
         CWCMinutesOverViewDTO cMinutesOverViewDTO = (CWCMinutesOverViewDTO)i.next();
         
         //System.out.println(cMinutesOverViewDTO+" --- "+cMinutesOverViewDTO.getOrderDate()+" --- "+cMinutesOverViewDTO.getNoOfProfilesVisited());
         }
                
         
         return cMinutesOverViewDTOs;
    }
     
    //anupam added this on 8-2-2012 END

 //anupam added this on 29-02-2012 START

    public List<ChildMaster> getChildBasedOnCwcNoInAHome(String homeId, String cwcJjbNo) {
        return caseWorkerDAO.getChildBasedOnCwcNoInAHome(homeId, cwcJjbNo);
    }

    public List<ChildMaster> getChildBasedOnCwcNoOrNameInAHome(String homeId, String cwcJjbNo, String childName) {
        return caseWorkerDAO.getChildBasedOnCwcNoOrNameInAHome(homeId, cwcJjbNo, childName);
    }

    public List<ChildMaster> getChildBasedOnNameInAHome(String homeId, String childName) {
        return caseWorkerDAO.getChildBasedOnNameInAHome(homeId, childName);
    }
    
   //anupam added this on 29-02-2012 END      
    
    //anupam added this on 02-03-2012 START

    public List<ChildMaster> populateAvailableCaseWorkInAHome(String homeId) {
        return caseWorkerDAO.populateAvailableCaseWorkInAHome(homeId);
    }

    public List<ChildMaster> populateOnlyInterviewedChildOfAHome(String homeId) {
        return caseWorkerDAO.populateOnlyInterviewedChildOfAHome(homeId);
    }
//Added by vinumol 0n 08-03-2012
    
    public List<ChildMaster> viewAdmisiionChild_by_homeid(Date fromdate, Date todate, String child_homeid) {
        return caseWorkerDAO.viewAdmisiionChild_by_homeid(fromdate,todate,child_homeid);
    }

    
    public List<ChildDetails> getCaseworkViewChildPID(String homeId) {
        return caseWorkerDAO.getCaseworkViewChildPID(homeId);
    }

  
    public List<InterviewRegister> getInterviewRegisterChildPID(String currentHomeId) {
         return caseWorkerDAO.getInterviewRegisterChildPID(currentHomeId);
    }

    
    public List<DischargeRegister> viewDischargeChild_by_homeid(Date fromdate, Date todate, String childmaster_homeid) {
        return caseWorkerDAO.viewDischargeChild_by_homeid(fromdate,todate,childmaster_homeid);
    }

   
    public DischargeRegister viewDischargeChild_by_Id(String disreg_profid) {
        return caseWorkerDAO.viewDischargeChild_by_Id(disreg_profid);
    }

    
    public List<CasehistoryPersonal> getCaseHistoryChildPid(String currentHomeId) {
        return caseWorkerDAO.getCaseHistoryChildPid(currentHomeId);
    }
    
    
    //Ended by vinumol 0n 08-03-2012

   

    @Override
    public ChildDetails getExistingChildDetailsBasedOnProfileIdAndEntryDate(String childProfileIdAndDateOfCaseWork) {
        
        ChildDetails childDetails = null;
        
        //Split the received string with respect to comma seperator 
        String[] tokens = childProfileIdAndDateOfCaseWork.split(",");
        
       
        //System.out.println("size of array = "+tokens.length);
       
         //if the size of string[] is greater than 2 return null       
         //else take 2 String values with inn array , 1st one is profileId and 
        if(tokens.length == 2){
            
            String childProfileId = tokens[0].trim();           
            
            
        //2nd one is last_modified/entry Date String which needs to be converted in java.util.Date     
            
            Date entryDate =StringToDate.getStringToDateTime(tokens[1].trim());
            
           
            
        //construct a ChildDetailsPK object with the childProfileId and lastModified/entry Date            
           ChildDetailsPK childDetailsPK = new ChildDetailsPK(childProfileId, entryDate);
        
        
        //call the DAO method  passing childDetailsPK as parameter and return the chaildDetails object
        childDetails = caseWorkerDAO.getExistingChildDetailsBasedOnChildDetailsPK(childDetailsPK); 
        
        }
        
        return childDetails;
        
    }
        
      //added by anupam on 12-07-2012 START
    
    //added by anupam on 12-07-2012 START

    @Override
    public List<StayingPeriodOfChildDTO> getOverStayingChildren(String homeId, int minimumPeriodOfStayInMonths) {
        System.out.println("SERVICE ------------IN");
        return caseWorkerDAO.getOverStayingChildren(homeId, minimumPeriodOfStayInMonths);
    }

    //anupam added on 23-10-2012 START
    @Override
    public String saveChangedChildDetails(Map parameterMap) {
        
        String result = "Data NOT updated , Please try again";  
        
        
        try{
            //1.get the profile id
        String childProfileId = ((String [])parameterMap.get("childProfileId"))[0].trim();    
        
           //2.Get the childMaster corresponding to id
        ChildMaster oldChildMaster = caseWorkerDAO.getChild_by_id(childProfileId);
        
           //3.iterate throught the map and set necessary properties
        Set s = parameterMap.keySet();
        
        for (Iterator it = s.iterator(); it.hasNext();) {
            Object key = it.next();
            String value = ((String[])parameterMap.get(key))[0].trim();
            System.out.println(" key = "+key+" value = "+((String[])parameterMap.get(key))[0]);
            
            BeanUtils.setProperty(oldChildMaster, key.toString(), value);
           
        }
        
        
           //4.save the updated object in the 
        caseWorkerDAO.updateObject(oldChildMaster);
        
        result = oldChildMaster.getChildName()+"'s"+ " record updated Successfully";
        
        }
        catch(Exception e){
            System.out.println("ERROR "+e);
        }
        
        
        return result;
    }
    
     //anupam added on 23-10-2012 END
 
    //added by suresh on 11-10-2012 start
    
    @Override
    public boolean saveIcpPersonalDetails(IcpPersonalDetails icpPersonelDetails) {
       return caseWorkerDAO.saveIcpPersonalDetails(icpPersonelDetails);
    }

    @Override
    public boolean saveIcpPreRelease(IcpPreRelease icpPreRelease) {
       return caseWorkerDAO.saveIcpPreRelease(icpPreRelease);
    }

    @Override
    public boolean saveIcpPostRelease(IcpPostRelease icpPostRelease) {
        return caseWorkerDAO.saveIcpPostRelease(icpPostRelease);
    }

    @Override
    public icpChildDTO getICPFromDto(String homeId,String childProfileId){
               icpChildDTO icpDto=new icpChildDTO();
               
               IcpPersonalDetails ipd=caseWorkerDAO.getIcpPersonelDetails(childProfileId);
               
               if(ipd!=null)
               {
               icpDto.setChild_name(ipd.getFirstName()+" "+ipd.getLastName());
               icpDto.setChild_age(ipd.getAge());
               icpDto.setChild_sex(ipd.getSex());
               icpDto.setFather_name(ipd.getFatherName());
               icpDto.setMother_name(ipd.getMotherName());
               icpDto.setNationality(ipd.getNationality());
               icpDto.setChild_religion(ipd.getReligion());
               icpDto.setChild_cast(ipd.getCaste());
               icpDto.setChild_subcaste(ipd.getSubcaste());
               icpDto.setChild_eduAttain(ipd.getEducationAttainment());
               icpDto.setHealth_needs(ipd.getHealthNeeds());
               icpDto.setEmoTrain_needs(ipd.getEmoTrainNeeds());
               icpDto.setLeaCreate_play(ipd.getLeaCreatePlay());
               icpDto.setAttach_rel(ipd.getAttachRelation());
               icpDto.setRelig_beliefs(ipd.getReligBeliefs());
               icpDto.setProt_allAbuse(ipd.getProtectNeglMalt());
               icpDto.setSocial_stream(ipd.getSocialMainStream());
               icpDto.setFollow_postAction(ipd.getFollowupPostRel());
               }
               
               IcpPreRelease ipre=caseWorkerDAO.getIcpPreRelease(childProfileId);
               
               IcpPostRelease ipost=caseWorkerDAO.getIcpPostRelease(childProfileId);
               if(ipre!=null)
               {
                 if(ipre.getReleaseType().equalsIgnoreCase("fr"))
                 {
                      icpDto.setRelease_type("Final Release");
                 }
                 else if(ipre.getReleaseType().equalsIgnoreCase("tr"))
                 {
                     icpDto.setRelease_type("Transfer");
                 }
               icpDto.setPlace_transfer(ipre.getDetailsPlaceTrans());
               icpDto.setAuthority_responsible(ipre.getConcernAuthority());
               icpDto.setDetails_place(ipre.getDetailsPlacement());
               icpDto.setDate_release(ipre.getDateRelease());
               icpDto.setDate_repatriot(ipre.getDateRepatriation());
               icpDto.setRequisition_escort(ipre.getRequisitionEscort());
               icpDto.setIdentify_escort(ipre.getIdentifyEscort());
               icpDto.setRehabi_placement(ipre.getRehabilationPlan());
               icpDto.setSponser_require(ipre.getSponserReqment());
               if(ipre.getIdentOffPostrel().equals("po"))
               {
                    icpDto.setIdent_officer("Probation Officer");
               }
               else if(ipre.getIdentOffPostrel().equals("cw"))
               {
                   icpDto.setIdent_officer("Case Worker");
               }
               else if(ipre.getIdentOffPostrel().equals("sw"))
               {
                   icpDto.setIdent_officer("Social Worker");
               }
               else if(ipre.getIdentOffPostrel().equals("ngo"))
               {
                   icpDto.setIdent_officer("Non-Govermental Organization");
               }
               icpDto.setMou_sa_is(ipre.getMouPostrel());
               icpDto.setIdent_sponser(ipre.getIdentOfSponser());
               icpDto.setMou_childSponser(ipre.getMouSponser());
               icpDto.setChild_savAcc(ipre.getDetailsSavAcc());
               icpDto.setChild_earnBelong(ipre.getDetailsEarnBel());
               icpDto.setChild_awarReward(ipre.getDetailsAwards());
               icpDto.setChild_option(ipre.getOptionChild());
               icpDto.setOther_info(ipre.getAnyOtherInfo());
               
               }
               if(ipost!=null)
               {
               icpDto.setStatus_bankAcc(ipost.getStatusBankAcc());
               icpDto.setEarning_handedOver(ipost.getEarningsHandedOver());
               icpDto.setChild_placement(ipost.getPlacementChild());
               icpDto.setChild_familyBehav(ipost.getFamilyBehaviour());
               icpDto.setSocial_milieu(ipost.getSocialMilieuChild());
               icpDto.setHow_skillUsed(ipost.getChildUsingSkills());
               icpDto.setWhether_school(ipost.getChildAdmitSchool());
               icpDto.setDate_admit(ipost.getDateAdmit());
               icpDto.setName_school(ipost.getNameSchool());
                 }
               return icpDto;
               
    }
    
    
    
    //added by suresh on 11-10-2012 ends

    

    public Map<String, String> getOtherHomesInADistrict(String districtId, String homeId) {
        /*fetch the data from data layer*/
        Map<String,String> homeAddressMap = caseWorkerDAO.getHomeWithAddressInADistrict(districtId);
        /*if map is not empty filter out the logged in home*/
        homeAddressMap.remove(homeId);
        System.out.println("map in service layer = "+homeAddressMap);
        
        /*return vaule*/
        return homeAddressMap;
    }
    
    /*integrating admission view report 2-1-2014*/
    
    public List<ChildDTO> getChildDTOListByName(String homeId, String name) {
        
        return caseWorkerDAO.fetchChildrenBasedOnName(homeId.trim(), name.trim());
    }

    public List<ChildDTO> getChildDTOListBy2Dates(String homeId, String fromDate, String toDate) {
        return caseWorkerDAO.fetchChildrenBasedOn2Dates(homeId.trim(), StringToDate.getStringToDate(fromDate.trim()), StringToDate.getStringToDate(toDate.trim()));
    }

    public List<ChildDTO> getChildDTOListByCaste(String homeId, String childCaste) {
        return caseWorkerDAO.fetchChildrenBasedOnCaste(homeId.trim(), childCaste.trim());
    }

    public List<ChildDTO> getChildDTOListByMonthAndYear(String homeId, int month, int year) {
        return caseWorkerDAO.fetchChildrenBasedOnMonthAndYear(homeId.trim(), month, year) ;
    }

    public List<ChildDTO> getChildDTOListByNature(String homeId, String childNature) {
        return caseWorkerDAO.fetchChildrenBasedOnNature(homeId.trim(), childNature.trim());
    }

    public List<ChildDTO> getChildDTOListByHomeAndStatus(String homeId, String status) {
        return caseWorkerDAO.fetchChidrenDTOInaHomeByStatus(homeId, status);
    }

    public List<String> getDistinctValues(String columnName) {
        
        return caseWorkerDAO.fetchDistinctValuesOfATableColumn(DistinctValueColumnTableMapper.columnTableMap.get(columnName),columnName);
                       
        
    }

    public List<String> getDistinctValuesStartingWithPattern(String columnName, String pattern) {
        return caseWorkerDAO.fetchDistinctValuesOfATableColumnMatchingString(DistinctValueColumnTableMapper.columnTableMap.get(columnName),columnName, pattern.toUpperCase());
    }

    public Map<String, Integer> fetchChildMasterReports(String homeId, String parameter) {
        
        if(parameter.equalsIgnoreCase("status"))
            return caseWorkerDAO.fetchChildMasterReportsForStatus(homeId,parameter);
        else if(parameter.equalsIgnoreCase("dataentry")){
        
            Map<String,Integer> temp = new TreeMap<String, Integer>(caseWorkerDAO.fetchChildMasterDataEntryReport());
            
            
                             for(Iterator<Map.Entry<String,Integer>>it=temp.entrySet().iterator();it.hasNext();){
                             Map.Entry<String, Integer> entry = it.next();
                             String homeKey = entry.getKey();
                             
                             if (RegExUtil.statrsWith(homeKey, "RU")) {
                                 int recordCount = entry.getValue();
                                 System.out.println("recordCount = "+recordCount);                        
                                 String corrCHKey = RegExUtil.replcaeAtbeginning(homeKey,"RU", "CH");
                                 System.out.println(homeKey+" --- "+corrCHKey);
                                 recordCount = recordCount + temp.get(corrCHKey);
                                 System.out.print("NEW recordCount = "+recordCount);
                                   temp.put(corrCHKey,recordCount);
                                  // temp.remove(corrRUKey);
                                  it.remove();
                             }
                         }
                             

            return temp;
            
        }
        
        else if(parameter.equalsIgnoreCase("provisionLaw"))
        {
            System.out.println("crime***");
           Map temp = caseWorkerDAO.fetchChildMasterReports(homeId, parameter);
           temp.remove("NA");
           temp.remove("NOT APPLICABLE");
           return temp;
        }
            
        else
            return caseWorkerDAO.fetchChildMasterReports(homeId, parameter);
    }

    public String saveCallFDpo(int meeting_id,String sirDay, String sirAge, String sirFat, String sirFir, String sirName, String sirPl, String sirPs, String sirRDt, String sirSec, String sirYr, String sirthDt) {
        System.out.println("service::save Call F Dpo:::meeting_id"+meeting_id+sirRDt);
       CwcSir cwc_sir = new CwcSir(meeting_id);
       
       cwc_sir.setSirAge(Integer.parseInt(sirAge));
       cwc_sir.setSirName(sirName);
       cwc_sir.setSirDay(sirDay);
       cwc_sir.setSirFat(sirFat); 
       cwc_sir.setSirFir(sirFir); 
       cwc_sir.setSirPl(sirPl);
       cwc_sir.setSirPs(sirPs);
       cwc_sir.setCwcMeetings(new CwcMeetings(meeting_id));
        try {
            cwc_sir.setSirRepDt(new SimpleDateFormat("MM/dd/yyyy").parse(sirRDt));
        } catch (ParseException ex) {
            Logger.getLogger(CaseWorkerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       cwc_sir.setSirSec(sirSec);
       cwc_sir.setSirYr(sirYr);
       cwc_sir.setSirthDt(sirthDt);
       
       
       boolean s = caseWorkerDAO.saveCaseSir(cwc_sir);
        
       if(s)
           return "y";
       else
           return "n";
         
        //Cwc
        
     //   caseWorkerDAO.save();
        
    }

//    public String saveCallFDpo(String meetingId, String sirDay, String sirAge, String sirFat, String sirFir, String sirName, String sirPl, String sirPs, String sirRDt, String sirSec, String sirYr, String sirthDt) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    public String InterChAgain(int meeting_id,String cipiDay, String cipiYear, String cName, String cpFat, String cAge, String cVil, String cpDD, String cpPs, String cpName, String cpPer, String cpHome, String cpNd, String cpDay, String cpMon, String cpYr) {
         System.out.println("service::save Call F Dpo:::meeting_id"+meeting_id);
       CwcHop cwc_sir = new CwcHop(meeting_id);
       
       cwc_sir.setCipiDay(cipiDay);
       cwc_sir.setCipiYear(cipiYear);
       cwc_sir.setCName(cName);
       cwc_sir.setCpFat(cpFat);
       cwc_sir.setCAge(cAge);
       cwc_sir.setCVil(cVil);
       cwc_sir.setCpDD(cpDD);
       cwc_sir.setCpPs(cpPs);
       cwc_sir.setCpName(cpName);
       cwc_sir.setCpPer(cpPer);
       cwc_sir.setCpHome(cpHome);
       cwc_sir.setCpNd(cpNd);
       cwc_sir.setCpDay(cpDay);
       cwc_sir.setCpMon(cpMon);
       cwc_sir.setCpYr(cpYr);
       cwc_sir.setCwcMeetings(new CwcMeetings(meeting_id));
       
       
       
       boolean s = caseWorkerDAO.saveInterChAgain(cwc_sir);
        
       if(s)
           return "y";
       else
           return "n";
    }

    public String soGiven(int meeting_id, String soDDNo, String soBank, String soYear, String soPS, String soName, String soCareName, String soCareAddr, String soSaidPer) {
           System.out.println("service::save SO given:::meeting_id"+meeting_id);
       CwcSo  cwc_sir = new CwcSo(meeting_id);
       
       cwc_sir.setSoBank(soBank);
       cwc_sir.setSoDDNo(soDDNo);
       cwc_sir.setSoYear(Integer.parseInt(soYear));
       cwc_sir.setSoPS(soPS);
       cwc_sir.setSoName(soName);
       cwc_sir.setSoCareName(soCareName);
       cwc_sir.setSoCareAddr(soCareAddr);
       cwc_sir.setSoSaidPer(soSaidPer);
       
       cwc_sir.setCwcMeetings(new CwcMeetings(meeting_id));
       
       
       
       boolean s = caseWorkerDAO.saveSoGiven(cwc_sir);
        
       if(s)
           return "y";
       else
           return "n";
    }

   
    
    public String pendInq(int meeting_id, String pName, String pHouse, String pStreet, String pVilTwn, String pDis, String pState, String pChild, String pAge) {
           System.out.println("service::save SO given:::meeting_id"+meeting_id+":::pAge"+pAge);
       CwcUppi  cwc_sir = new CwcUppi(meeting_id);
       
       cwc_sir.setPAge(pAge);
       cwc_sir.setPChild(pChild);
       cwc_sir.setPDis(pDis);
       cwc_sir.setPHouse(pHouse);
       cwc_sir.setPName(pName);
       cwc_sir.setPState(pState);
       cwc_sir.setPStreet(pStreet);
       cwc_sir.setPVilTwn(pVilTwn);
       
       cwc_sir.setCwcMeetings(new CwcMeetings(meeting_id));
       
       
       
       boolean s = caseWorkerDAO.savePendInq(cwc_sir);
        
       if(s)
           return "y";
       else
           return "n";
    }
           @Override
    public List<FcChildTemp> getfoundchildren() {
        return caseWorkerDAO.getFoundChildren();
    }    

    @Override
    public List<FcChildTemp> getfoundchildrenreportStatus(String status) {
        return caseWorkerDAO.fetchFcChildByStatus(status);
    }

    /**
     *
     * @param fcForm
     * @param fcForm19
     * @return
     */
    @Override
    public boolean formSaveService(Object fcForm) {
        return caseWorkerDAO.saveFormDAO(fcForm);
    } 
}