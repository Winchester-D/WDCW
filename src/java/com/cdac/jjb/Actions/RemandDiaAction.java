/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Actions;

import com.cdac.jjb.Service.DPOService;
import com.cdac.jjb.Service.DPOServiceImpl;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.Fir;
import com.cdac.jjb.orm.RemandCaseDairy;
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
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

/**
 *
 * @author suresh
 */
public class RemandDiaAction extends ActionSupport implements ModelDriven,ServletRequestAware,SessionAware {

    private HttpServletRequest request;
    private HttpServletResponse response;
    
   
    private Map<String, Object> session;
    private DPOService dpoService1;

    public DPOService getDpoService1() {
        return dpoService1;
    }

    public void setDpoService1(DPOService dpoService1) {
        this.dpoService1 = dpoService1;
    }
   
    
    
      private Map<String,String> accList;

    public Map<String, String> getAccList() {
        return accList;
    }

    public void setAccList(Map<String, String> accList) {
        this.accList = accList;
    }
    
    private RemandCaseDairy remandCaseDiary=new RemandCaseDairy();

    public RemandCaseDairy getRemandCaseDiary() {
        return remandCaseDiary;
    }

    public void setRemandCaseDiary(RemandCaseDairy remandCaseDiary) {
        this.remandCaseDiary = remandCaseDiary;
    }

   

    
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
    private CourtSurrender cs;

    public CourtSurrender getCs() {
        return cs;
    }

    public void setCs(CourtSurrender cs) {
        this.cs = cs;
    }

    public String popRemDetails()
    {
        setCs(dpoService1.getCourtSurrender(selAccId));
        return SUCCESS;
    }
    private String remCDDate;

    public String getRemCDDate() {
        return remCDDate;
    }

    public void setRemCDDate(String remCDDate) {
        this.remCDDate = remCDDate;
    }
    private String policeStation;
    
    public String getPoliceStation() {
        return policeStation;
    }
    
    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }
    private String firNo;

    public String getFirNo() {
        return firNo;
    }

    public void setFirNo(String firNo) {
        this.firNo = firNo;
    }
    private String accId;

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

   

    @Override
    public String execute()
    {
        try{
        System.out.println("---->"+accId);
        remandCaseDiary.setRemandCdDate(StringToDate.getStringToDate(remCDDate));
        remandCaseDiary.setFir(new Fir(firNo, policeStation));
        remandCaseDiary.setAccusedId(new CourtSurrender(Integer.parseInt(accId)));
        boolean re=dpoService1.saveRemCaseDiary(remandCaseDiary);
            if (re) {
                return SUCCESS;
            } else {
                return ERROR;
            }
        
        }catch(Exception e)
        {
            e.printStackTrace();
            return ERROR;
        }
    }
    private String remandId;
    
    public String getRemandId() {
        return remandId;
    }
    
    public void setRemandId(String remandId) {
        this.remandId = remandId;
    }
    
    private RemandCaseDairy remCaseDia;

    public RemandCaseDairy getRemCaseDia() {
        return remCaseDia;
    }

    public void setRemCaseDia(RemandCaseDairy remCaseDia) {
        this.remCaseDia = remCaseDia;
    }

    public String showRemDetails()
    {
        RemandCaseDairy rcd=dpoService1.popRemCase(remandId);
        setRemCaseDia(rcd);
        System.out.println("rcd---->"+rcd);
        return SUCCESS;
            
    }
     public Object getModel() {
        try{
            if(request.getParameter("formName")!=null&&request.getParameter("formName").equals("frr_form"))  
            {   
                  return remandCaseDiary;
            }
        
        return "HELLO";
        }catch(Exception e)
        {
            e.printStackTrace();
            return "HELLO";
        }
    } 
    public Map<String,String> remMap;

    public Map<String, String> getRemMap() {
        return remMap;
    }

    public void setRemMap(Map<String, String> remMap) {
        this.remMap = remMap;
    }
     
    public String popRemCase()
    {
        setRemMap(dpoService1.popAllRemCase());
        return SUCCESS;
    }
     
     
    public void setSession(Map<String, Object> map) {
        this.session=map;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        this.request=hsr;
    }
}
