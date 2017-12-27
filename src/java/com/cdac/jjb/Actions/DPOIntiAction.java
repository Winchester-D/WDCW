/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suresh
 */
package com.cdac.jjb.Actions;

import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.Service.DPOService;
import com.cdac.jjb.Service.DPOServiceImpl;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.EnquiryProcess;
import com.cdac.jjb.orm.Fir;
import com.cdac.jjb.orm.SocialInvestigation;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import com.cdac.common.util.StringToDate;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;


public class DPOIntiAction extends ActionSupport implements ServletRequestAware,ModelDriven,SessionAware
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
  
    private Map<String,String> accList;

    public Map<String, String> getAccList() {
        return accList;
    }

    public void setAccList(Map<String, String> accList) {
        this.accList = accList;
    }

    
    private SocialInvestigationOrder socInvestOrder=new SocialInvestigationOrder();

    public SocialInvestigationOrder getSocInvestOrder() {
        return socInvestOrder;
    }

    public void setSocInvestOrder(SocialInvestigationOrder socInvestOrder) {
        this.socInvestOrder = socInvestOrder;
    }


    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
   public String popAccused()
   {
       
      // List acc_child_lst=new ArrayList();// = new ArrayList();//dpoService.getAccusedDetails();
       
       Map accMap=new HashMap();
       
       List<CourtSurrender> csList=dpoService1.getAllCourtSurrender();
      
      // accMap.put("select", "Select Accused");
       for (Iterator<CourtSurrender> it = csList.iterator(); it.hasNext();) {
           CourtSurrender cs = it.next();
           accMap.put(cs.getAccusedId(), cs.getFir().getFirPK().getFirNo()+"-->"+cs.getFir().getFirPK().getPoliceStation()+"-->"+cs.getAccuName());
        }
       
       setAccList(accMap);
       return SUCCESS;
   }
   
   
    private String selAccId;

    public String getSelAccId() {
        return selAccId;
    }

    public void setSelAccId(String selAccId) {
        this.selAccId = selAccId;
    }

    private String accChildName;

    public String getAccChildName() {
        return accChildName;
    }

    public void setAccChildName(String accChildName) {
        this.accChildName = accChildName;
    }
    
    private String accFir;

    public String getAccFir() {
        return accFir;
    }

    public void setAccFir(String accFir) {
        this.accFir = accFir;
    }

    private String accPS;

    public String getAccPS() {
        return accPS;
    }

    public void setAccPS(String accPS) {
        this.accPS = accPS;
    }

    private CourtSurrender cs;

    public CourtSurrender getCs() {
        return cs;
    }

    public void setCs(CourtSurrender cs) {
        this.cs = cs;
    }


   public String showDPOIntiForm()
   {
       String selAccId=request.getParameter("selAccId");
       System.out.println("*******");
       CourtSurrender cs=dpoService1.getCourtSurrender(selAccId);
       setCs(cs);
       return SUCCESS;
   }
   
    private String submitBeforeDate;

    public String getSubmitBeforeDate() {
        return submitBeforeDate;
    }

    public void setSubmitBeforeDate(String submitBeforeDate) {
        this.submitBeforeDate = submitBeforeDate;
    }
    private String sBDate;

    public String getSBDate() {
        return sBDate;
    }

    public void setSBDate(String sBDate) {
        this.sBDate = sBDate;
    }
    private String acc_id;
    
    public String getAcc_id() {
        return acc_id;
    }
    
    public void setAcc_id(String acc_id) {
        this.acc_id = acc_id;
    }
    
   

    
   public String execute()
   {
       try
       {
           System.out.println("--->"+socInvestOrder.getCcNo());
           socInvestOrder.setSubmitBeforeDate(StringToDate.getStringToDate(sBDate));
           socInvestOrder.setAccusedId(new CourtSurrender(Integer.parseInt(acc_id)));
           socInvestOrder.setFir(new Fir(accFir, accPS));
           boolean result=dpoService1.saveDPOIntimation(socInvestOrder);        
       return SUCCESS;
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return ERROR;
       }
   }
    private List<CC_Details_Dto> ccDto;

    public List<CC_Details_Dto> getCcDto() {
        return ccDto;
    }

    public void setCcDto(List<CC_Details_Dto> ccDto) {
        this.ccDto = ccDto;
    }

    public String popDPOInti()
    {
        List<CC_Details_Dto> lccDto = dpoService1.getSocOrderDetails();
        setCcDto(lccDto);
        return SUCCESS;
    }
    private String dpoIp;

    public String getDpoIp() {
        return dpoIp;
    }

    public void setDpoIp(String dpoIp) {
        this.dpoIp = dpoIp;
    }

    private SocialInvestigationOrder ViewDpoInti;

    public SocialInvestigationOrder getViewDpoInti() {
        return ViewDpoInti;
    }

    public void setViewDpoInti(SocialInvestigationOrder ViewDpoInti) {
        this.ViewDpoInti = ViewDpoInti;
    }

    
     public String showDPOInti()
     {
         setViewDpoInti(dpoService1.getSocOrderFor(dpoIp));
         return SUCCESS;
     }
    public Object getModel() {
        try{
            if(request.getParameter("formName")!=null&&request.getParameter("formName").equals("dpoi_form"))  
            {   
                
          
           // socInvestOrder.setAccusedId(dpoService1.getCourtSurrender(accusedId));    
            return socInvestOrder;
        }
        else if(request.getParameter("formName")!=null&&request.getParameter("formName").equals("DpoIpForm")) 
        {
            return "HELLO";
        }
        return "HELLO";
        }catch(Exception e)
        {
            e.printStackTrace();
            return "HELLO";
        }
    }

    public void setSession(Map<String, Object> map) {
        this.session=map;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }
}
