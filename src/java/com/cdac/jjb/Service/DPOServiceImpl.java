/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;

import com.cdac.jjb.DAO.Fir_DAO;
import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.EnquiryProcess;
import com.cdac.jjb.orm.RemandCaseDairy;
import com.cdac.jjb.orm.SocialInvestigation;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import com.cdac.common.util.StringToDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author suresh
 */
public class DPOServiceImpl implements DPOService{

    private Fir_DAO dataDao;

    public Fir_DAO getDataDao() {
        return dataDao;
    }

    public void setDataDao(Fir_DAO dataDao) {
        this.dataDao = dataDao;
    }
    
   /* public Object getAccusedDetails() {
        List<CourtSurrender> cslist=viewAll;
    }
   */ 
    public boolean saveDPOIntimation(SocialInvestigationOrder socialInvestigationOrder) {
        System.out.println("-->"+socialInvestigationOrder.getDpoName());
        
        socialInvestigationOrder.setIntimationSent("YES");
        return dataDao.saveDPOSocialInvOrder(socialInvestigationOrder);
    }

    public boolean saveSocInvest(SocialInvestigation socialInvestigation) {
        try {
             dataDao.savePrelEnquiry(socialInvestigation);
       
       return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
      
    }

    public List<CC_Details_Dto> getSocOrderDetails() {
        return dataDao.getCCAccusedList();
    }

    public CourtSurrender getCourtSurrender(String selccNO) {
        return dataDao.getCourtSurrenById(selccNO);
    }

    public List<CourtSurrender> getAllCourtSurrender() {
        return dataDao.getAllCourtSurrender();
    }

    public boolean saveRemCaseDiary(RemandCaseDairy remandCaseDiary) {
        return dataDao.saveRemCaseDiary(remandCaseDiary);
    }

    public String checkSIRecv(String accuId) {
        List<SocialInvestigation> silist = dataDao.getSocialInvFor(accuId);
        
        if (silist.isEmpty()) {
             return "No";
        } else {
            return "Yes";
        }
    }

    public String checkPareInt(String trialName) {
        CourtSurrender cs = dataDao.getCourtSurrenById(trialName);
        
        if (cs.getParentIntimationSent()!=null && cs.getParentIntimationSent().equalsIgnoreCase("yes") ) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public SocialInvestigationOrder getSocOrderFor(String trialName) {
        return dataDao.getSocialInvOrder(trialName);
    }

    public boolean saveTrialProcess(EnquiryProcess enquiryProcess) {
        if((enquiryProcess.getChargeSheetFiled().equalsIgnoreCase("no"))&&(enquiryProcess.getCaseTerminated().equalsIgnoreCase("yes")))
        {
            enquiryProcess.setBailGranted("no");
            enquiryProcess.setOrderIssued(3);
            enquiryProcess.setFinalOrderFineDet(8);
        }
        return dataDao.saveEnquiryProcess(enquiryProcess);
    }

    public Map<String, String> popAllRemCase() {
        Map<String, String> remMap=new HashMap<String, String>();
        try {
           List<RemandCaseDairy> rcd_list=dataDao.getAllRemCaseDiary();
           if(rcd_list!=null)
           {
                  for (RemandCaseDairy rcd : rcd_list) {
                      
                      remMap.put(String.valueOf(rcd.getRemandId()), rcd.getFir().getFirPK().getFirNo()+"-->"+rcd.getFir().getFirPK().getPoliceStation()+"-->"+rcd.getAccusedId().getAccuName());
                      
               }
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
           return  remMap;
    }

    public RemandCaseDairy popRemCase(String remandId) {
        return dataDao.getRemCaseDiary(remandId);
    }

    public SocialInvestigation getSocialInvest(String sirInput) {
        List<SocialInvestigation> siList=dataDao.getSocialInvFor(sirInput);
        if(siList.isEmpty())
            return null;
        else
            return siList.get(0);
    }

    public List<EnquiryProcess> getAllTrials() {
        return dataDao.getAllTrials();
    }

    public EnquiryProcess popTrialFor(String trialName) {
         return dataDao.getTrial(trialName);
    }

    public SocialInvestigationOrder getSocOrderForAccu(String trialName) {
        return dataDao.getSocialInvForAccu(trialName);
    }

    

    
    
}
