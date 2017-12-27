/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Actions;

import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.Service.DPOService;
import com.cdac.jjb.orm.SocialInvestigation;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import com.cdac.common.util.StringToDate;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author suresh
 */
public class PrelEnqAction  extends ActionSupport implements ServletRequestAware,ModelDriven,SessionAware
{ 

    /* forward name="success" path="" */
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
  
    
      public SocialInvestigation socialInvestigation=new SocialInvestigation();

    public SocialInvestigation getSocialInvestigation() {
        return socialInvestigation;
    }

    public void setSocialInvestigation(SocialInvestigation socialInvestigation) {
        this.socialInvestigation = socialInvestigation;
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
    private String sirName;

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }
public String showCCNum()
{
    return SUCCESS;
}
    private String disDate;

    public String getDisDate() {
        return disDate;
    }

    public void setDisDate(String disDate) {
        this.disDate = disDate;
    }
    @Override
     public String execute()
   {
       try
       {
           System.out.println("--->"+socialInvestigation.getCcNo());
           socialInvestigation.setDisposalDate(StringToDate.getStringToDate(disDate));
           socialInvestigation.setSocialInvestigationOrder(new SocialInvestigationOrder(socialInvestigation.getCcNo()));
           boolean result=dpoService1.saveSocInvest(socialInvestigation);        
           if (result) {
               return SUCCESS;
           } else {
               return ERROR;
           }
        
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return ERROR;
       }
   }
    
    private SocialInvestigation socInv;

    public SocialInvestigation getSocInv() {
        return socInv;
    }

    public void setSocInv(SocialInvestigation socInv) {
        this.socInv = socInv;
    }


   public String showDPORep()
   {
       setSocInv(dpoService1.getSocialInvest(sirName));
       
       return SUCCESS;
   }
  

      public Object getModel() {
        if(request.getParameter("formName")!=null&&request.getParameter("formName").equals("prel_form")) 
        {
            return socialInvestigation;
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
