/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Actions;

import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.Service.DPOService;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.EnquiryProcess;
import com.cdac.jjb.orm.EnquiryProcessPK;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import com.cdac.common.util.StringToDate;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author suresh
 */
public class TrialProcessAction  extends ActionSupport implements ServletRequestAware,ModelDriven,SessionAware
{ 
    private DPOService dpoService1;

    public DPOService getDpoService1() {
        return dpoService1;
    }

    public void setDpoService1(DPOService dpoService1) {
        this.dpoService1 = dpoService1;
    }

   
    
    
    //private static final String SUCCESS = "success";
    private String formName;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }
    
    private HttpServletRequest request;
    private Map session;
    private String trialName;

    public String getTrialName() {
        return trialName;
    }

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    private CourtSurrender cs;

    public CourtSurrender getCs() {
        return cs;
    }

    public void setCs(CourtSurrender cs) {
        this.cs = cs;
    }

    private String dpoSent;

    public String getDpoSent() {
        return dpoSent;
    }

    public void setDpoSent(String dpoSent) {
        this.dpoSent = dpoSent;
    }

    
    private String parIntiSent;

    public String getParIntiSent() {
        return parIntiSent;
    }

    public void setParIntiSent(String parIntiSent) {
        this.parIntiSent = parIntiSent;
    }

    private String sno;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }
    
    
    private EnquiryProcess enquiryProcess=new EnquiryProcess();

    public EnquiryProcess getEnquiryProcess() {
        return enquiryProcess;
    }

    public void setEnquiryProcess(EnquiryProcess enquiryProcess) {
        this.enquiryProcess = enquiryProcess;
    }

   
   

    public String getCourtSurren()
    {
        setCs(dpoService1.getCourtSurrender(trialName));
        setParIntiSent(dpoService1.checkPareInt(trialName));
        System.out.println("---->"+cs+"------accuname"+cs.getAccuName());
        
        String tn=dpoService1.getSocOrderForAccu(trialName).getCcNo();
        
        setSno(dpoService1.getSocOrderFor(tn).getCcNo());
        setDpoSent(dpoService1.checkSIRecv(tn));
        
        return SUCCESS;
    }
     private String dateOfNextHearing;

    public String getDateOfNextHearing() {
        return dateOfNextHearing;
    }

    public void setDateOfNextHearing(String dateOfNextHearing) {
        this.dateOfNextHearing = dateOfNextHearing;
    }

   
    protected String trialDate_str;

    public String getTrialDate_str() {
        return trialDate_str;
    }

    public void setTrialDate_str(String trialDate_str) {
        this.trialDate_str = trialDate_str;
    }


    @Override
    public String execute()
    {
        try
                {
 
                 //   System.out.println("nh date--->"+dateOfNextHearing);
        
        if(!dateOfNextHearing.equals(""))            
             enquiryProcess.setNextHearingDate(StringToDate.getStringToDate(dateOfNextHearing));
        
        
        enquiryProcess.setTrialDate(StringToDate.getStringToDate(trialDate_str));
        boolean res=dpoService1.saveTrialProcess(enquiryProcess);
                    if (res) {
                         return SUCCESS;                
                    } else {
                        return ERROR;
                    }
        
                }
        catch(Exception e)
        {
         e.printStackTrace();
         return  ERROR;
        }
        
    }
    private List<CC_Details_Dto> ccList;

    public List<CC_Details_Dto> getCcList() {
        return ccList;
    }

    public void setCcList(List<CC_Details_Dto> ccList) {
        this.ccList = ccList;
    }

    public String popCCDetails()
    {
       List<CC_Details_Dto> cList= dpoService1.getSocOrderDetails();
       setCcList(cList);
       return SUCCESS;
    }
    
    private Map<String,String> epMap;

    public Map<String, String> getEpMap() {
        return epMap;
    }

    public void setEpMap(Map<String, String> epMap) {
        this.epMap = epMap;
    }

   
    
    public String popTrial()
    {
        List<EnquiryProcess> trList=dpoService1.getAllTrials();
        
        Map<String,String> l_epMap=new HashMap<String, String>();
        
        for (EnquiryProcess enqPr : trList) {
              l_epMap.put(String.valueOf(enqPr.getEnquiryProcessPK().getTrialNo()),enqPr.getEnquiryProcessPK().getCcNo()+"-->"+enqPr.getTrialDate()+"-->"+enqPr.getSocialInvestigationOrder().getAccusedId().getAccuName());            
        }
        
        setEpMap(l_epMap);
        
        return SUCCESS;
    }
    private EnquiryProcess epData;

    public EnquiryProcess getEpData() {
        return epData;
    }

    public void setEpData(EnquiryProcess epData) {
        this.epData = epData;
    }

     public String showTrial()
     {
         EnquiryProcess ep=dpoService1.popTrialFor(trialName);
         setEpData(ep);
         return SUCCESS;
         
     }
     public Object getModel() {
         
        if(request.getParameter("formName")!=null&&request.getParameter("formName").equals("te_form")) 
        {
            String name=request.getParameter("ccNo");
            System.out.println("tr process action*** ccno-->"+name);
            
            EnquiryProcessPK epk =new EnquiryProcessPK();
            epk.setCcNo(name);
            
            enquiryProcess.setEnquiryProcessPK(epk);
            return enquiryProcess;
        }
        return "HELLO";
    }

    public void setSession(Map<String, Object> map) {
        this.session=map;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }

}
