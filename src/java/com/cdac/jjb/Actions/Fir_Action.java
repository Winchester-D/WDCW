/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Actions;

import com.cdac.common.util.StringToDate;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import com.cdac.jjb.Service.Fir_Service;
import com.cdac.jjb.orm.FirPK;
import com.cdac.jjb.orm.Fir;

/**
 *
 * @author Swetha
 */
public class Fir_Action extends ActionSupport implements ModelDriven,ServletRequestAware,ServletResponseAware {

    
     private HttpServletRequest request;
     private HttpServletResponse response;
     private Map session;
     
     private Fir_Service firService;
     private FirPK firFormPK=new FirPK();
     private Fir firForm=new Fir();
     private String fir_police_station;
     private String fir_fir_No;
     private String fir_fir_date;
     private String fir_offence_date;
     private String fir_offence_time;
     private String fir_ps_info_rec_date;
     private String fir_ps_info_rec_time;
     private String fir_gen_dairy_ref_time;
     private String fir_c_pp_date;
     private String fir_court_dispach_date;
     private String fir_court_dispach_time;
     private String fir_c_dob;

    public String getFir_c_dob() {
        return fir_c_dob;
    }

    public void setFir_c_dob(String fir_c_dob) {
        this.fir_c_dob = fir_c_dob;
    }

    public String getFir_c_pp_date() {
        return fir_c_pp_date;
    }

    public void setFir_c_pp_date(String fir_c_pp_date) {
        this.fir_c_pp_date = fir_c_pp_date;
    }

    public String getFir_court_dispach_date() {
        return fir_court_dispach_date;
    }

    public void setFir_court_dispach_date(String fir_court_dispach_date) {
        this.fir_court_dispach_date = fir_court_dispach_date;
    }

    public String getFir_court_dispach_time() {
        return fir_court_dispach_time;
    }

    public void setFir_court_dispach_time(String fir_court_dispach_time) {
        this.fir_court_dispach_time = fir_court_dispach_time;
    }

    public String getFir_fir_No() {
        return fir_fir_No;
    }

    public void setFir_fir_No(String fir_fir_No) {
        this.fir_fir_No = fir_fir_No;
    }

    public String getFir_fir_date() {
        return fir_fir_date;
    }

    public void setFir_fir_date(String fir_fir_date) {
        this.fir_fir_date = fir_fir_date;
    }

    public String getFir_gen_dairy_ref_time() {
        return fir_gen_dairy_ref_time;
    }

    public void setFir_gen_dairy_ref_time(String fir_gen_dairy_ref_time) {
        this.fir_gen_dairy_ref_time = fir_gen_dairy_ref_time;
    }

    public String getFir_offence_date() {
        return fir_offence_date;
    }

    public void setFir_offence_date(String fir_offence_date) {
        this.fir_offence_date = fir_offence_date;
    }

    public String getFir_offence_time() {
        return fir_offence_time;
    }

    public void setFir_offence_time(String fir_offence_time) {
        this.fir_offence_time = fir_offence_time;
    }

    public String getFir_police_station() {
        return fir_police_station;
    }

    public void setFir_police_station(String fir_police_station) {
        this.fir_police_station = fir_police_station;
    }

    public String getFir_ps_info_rec_date() {
        return fir_ps_info_rec_date;
    }

    public void setFir_ps_info_rec_date(String fir_ps_info_rec_date) {
        this.fir_ps_info_rec_date = fir_ps_info_rec_date;
    }

    public String getFir_ps_info_rec_time() {
        return fir_ps_info_rec_time;
    }

    public void setFir_ps_info_rec_time(String fir_ps_info_rec_time) {
        this.fir_ps_info_rec_time = fir_ps_info_rec_time;
    }

    public Fir getFirForm() {
        return firForm;
    }

    public void setFirForm(Fir firForm) {
        this.firForm = firForm;
    }

    public FirPK getFirFormPK() {
        return firFormPK;
    }

    public void setFirFormPK(FirPK firFormPK) {
        this.firFormPK = firFormPK;
    }
     

    public Fir_Service getFirService() {
        return firService;
    }

    public void setFirService(Fir_Service firService) {
        this.firService = firService;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

   
    public String saveFirDet()
    {
        String result="error";
        try
        { 
        System.out.println("error here");    
        System.out.println(firForm.getAct1());
        firFormPK.setFirNo(getFir_fir_No());
        firFormPK.setPoliceStation(getFir_police_station());
        firForm.setFirPK(getFirFormPK());
        firForm.setFirDate(StringToDate.getStringToDate(getFir_fir_date()));
            System.out.println("===================================== "+getFir_offence_time());
        String temp_fir_offence_time=getFir_offence_time().substring(11,16);
        //System.out.println(temp_fir_offence_time);
        firForm.setOffenceDateTime(StringToDate.getStringToDateTime(getFir_offence_date(),temp_fir_offence_time ));
        String temp_ps_info_rec_time=getFir_ps_info_rec_time().substring(11,16);
        firForm.setPsInfoRecDate(StringToDate.getStringToDateTime(getFir_ps_info_rec_date(),temp_ps_info_rec_time ));
        String temp_gen_dairy_ref_time= getFir_gen_dairy_ref_time().substring(11,16);
        firForm.setGenDairyRefTime(StringToDate.getStringToDateTime(getFir_fir_date(),temp_gen_dairy_ref_time));
        String temp_c_dob=getFir_c_dob();
        if(temp_c_dob.length()>0)
        {
          firForm.setCDob(StringToDate.getStringToDate(getFir_c_dob()));
        }
        else
        {
            firForm.setCDob(null);
        }
        String temp_c_pp_date=getFir_c_pp_date();
        if(temp_c_pp_date.length()>0)
        {
            firForm.setCPpDate(StringToDate.getStringToDate(getFir_c_pp_date()));
        }
         else
        {
            firForm.setCPpDate(null);
        }
        String temp_court_dispach_time=getFir_court_dispach_time().substring(11,16);
        firForm.setCourtDispachDateTime(StringToDate.getStringToDateTime(getFir_court_dispach_date(), temp_court_dispach_time));
        result=firService.saveFirDet(firForm);
        return result;
        }catch(NullPointerException e)
        {
            e.printStackTrace();
            return result;
        }
    }

    public Object getModel() {
        String form_name;
        try{
            form_name=request.getParameter("formName").toString();
            System.out.println(form_name);
            if(form_name.equals("frr_form"))
            {
                System.out.println("hello");
                return firForm;
            }
            else
            {
               return "hello"; 
            }
            
        }catch(NullPointerException e)
        {
         return "hello";
        }
   }
    
    public void setServletRequest(HttpServletRequest hsr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        request=hsr;
    }

    public void setServletResponse(HttpServletResponse hsr) {
        //throw new UnsupportedOperationException("Not supported yet.");
        response=hsr;
    }
    
     public String viewFirForm(){
       String[] ps_fir =null; 
         try {
              String psFir = request.getParameter("psFir");
              ps_fir = psFir.split("--------->");
         } catch (NullPointerException e) {
             System.out.println("Fir_Action.java : 280 : viewFirForm : Exception Message : "+e.getMessage());
             return "error";
         }
         catch (Exception e) {
             System.out.println("Fir_Action.java : 284 : viewFirForm : Exception Message : "+e.getMessage());
             return "error";
         }
        if(ps_fir.length!=0){
            try{
                firForm = (Fir)firService.getFIRDetails(ps_fir[1], ps_fir[0]).get(0);
                setFirForm(firForm);
                System.out.println("Fir_Action.java : 291 : "+firForm.getAct1());
            }catch(Exception e){
                System.out.println("Fir_Action.java : 287 : viewFirForm : Exception Message : "+e.getMessage());
                return "error";
            }
            return "success";
        }
        return "error";
    }
    
}
