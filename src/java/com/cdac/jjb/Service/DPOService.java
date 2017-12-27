/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;

import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.EnquiryProcess;
import com.cdac.jjb.orm.RemandCaseDairy;
import com.cdac.jjb.orm.SocialInvestigation;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import java.util.List;
import java.util.Map;

/**
 *
 * @author suresh
 */
public interface DPOService {

   // public List<String,String> getAccusedDetails();
    public boolean saveDPOIntimation(SocialInvestigationOrder socialInvestigationOrder);

    public boolean saveSocInvest(SocialInvestigation socialInvestigation);

    public List<CC_Details_Dto> getSocOrderDetails();

    public CourtSurrender getCourtSurrender(String selAccId);

    public List<CourtSurrender> getAllCourtSurrender();

    public boolean saveRemCaseDiary(RemandCaseDairy remandCaseDiary);

    public String checkSIRecv(String accuId);

    public String checkPareInt(String trialName);

    public SocialInvestigationOrder getSocOrderFor(String trialName);

    public boolean saveTrialProcess(EnquiryProcess enquiryProcess);

    public Map<String, String> popAllRemCase();

    public RemandCaseDairy popRemCase(String remandId);

    public SocialInvestigation getSocialInvest(String siString);

    public List<EnquiryProcess> getAllTrials();

    public EnquiryProcess popTrialFor(String trialName);

    public SocialInvestigationOrder getSocOrderForAccu(String trialName);

   
}
