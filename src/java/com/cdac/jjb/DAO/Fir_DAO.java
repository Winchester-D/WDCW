/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.DAO;

import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.EnquiryProcess;
import com.cdac.jjb.orm.RemandCaseDairy;
import com.cdac.jjb.orm.SocialInvestigation;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import com.cdac.jjb.orm.Fir;
import com.cdac.jjb.DTO.FIR_PS_DTO;
import java.util.List;
import com.cdac.jjb.DTO.ParentalIntimation_DTO;


/**
 *
 * @author suresh
 */
public interface Fir_DAO {
    
    
    //ajay code start
    public int saveAccused(CourtSurrender cs);
    public List getAccusedByFIR(String firNo,String policeStation);
    public List getAccusedByProceedingNo(String proceedingNo);
    public  List<CC_Details_Dto> getCCAccusedList();
    public boolean savePrelEnquiry(SocialInvestigation socInv);

    public CourtSurrender getCourtSurrenById(String selAccId);

    public List<CourtSurrender> getAllCourtSurrender();
    public List<Object> getFirAndPolicsStationList();
    public List<Object> getViewCSFirAndPSList();
    
    //ajay code ends
    
    //swetha code start
    public String saveFirDet(Fir firForm);
    public List<FIR_PS_DTO> viewAllFirs();
    public ParentalIntimation_DTO getParInti_DisplayDet(int accid);
    public String saveParentalIntimation(ParentalIntimation_DTO pi_DTO);
    public List<Fir> getFIRFormDetails(String firNo,String policeStation);
    
//swetha code ends
    

    

    public boolean saveDPOSocialInvOrder(SocialInvestigationOrder socialInvestigationOrder);

    public boolean saveRemCaseDiary(RemandCaseDairy remandCaseDiary);

    public List<SocialInvestigation> getSocialInvFor(String ccNO);

    public SocialInvestigationOrder getSocialInvOrder(String ccNo);

    public boolean saveEnquiryProcess(EnquiryProcess enquiryProcess);

    public List<RemandCaseDairy> getAllRemCaseDiary();

    public RemandCaseDairy getRemCaseDiary(String remandId);

    public List<EnquiryProcess> getAllTrials();

    public EnquiryProcess getTrial(String trialName);

    public SocialInvestigationOrder getSocialInvForAccu(String trialName);

   
}
