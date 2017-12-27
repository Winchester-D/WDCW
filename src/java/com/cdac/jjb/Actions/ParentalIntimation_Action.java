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
import com.cdac.jjb.Service.ParentalIntimation_Service;
import com.cdac.jjb.orm.FirPK;
import com.cdac.jjb.orm.Fir;
import com.cdac.jjb.DTO.FIR_PS_DTO;
import com.cdac.jjb.DTO.ParentalIntimation_DTO;

/**
 *
 * @author Swetha
 */
public class ParentalIntimation_Action extends ActionSupport implements ModelDriven,ServletRequestAware,ServletResponseAware{
    
    private HttpServletRequest request;
     private HttpServletResponse response;
     private Map session;
     private ParentalIntimation_Service parentalIntimationService;
     private List<FIR_PS_DTO> firNoPS_List;
     private int profile_id;
     private ParentalIntimation_DTO parIntDTO;
     private String instName;
     private String jjbPlace;
     private String jjbAppointDate;
     private String jjbTime;
     private String chargeReason;
   
     
    public String getChargeReason() {
        return chargeReason;
    }

    public void setChargeReason(String chargeReason) {
        this.chargeReason = chargeReason;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getJjbAppointDate() {
        return jjbAppointDate;
    }

    public void setJjbAppointDate(String jjbAppointDate) {
        this.jjbAppointDate = jjbAppointDate;
    }

    public String getJjbPlace() {
        return jjbPlace;
    }

    public void setJjbPlace(String jjbPlace) {
        this.jjbPlace = jjbPlace;
    }

    public String getJjbTime() {
        return jjbTime;
    }

    public void setJjbTime(String jjbTime) {
        this.jjbTime = jjbTime;
    }
                     

    public ParentalIntimation_DTO getParIntDTO() {
        return parIntDTO;
    }

    public void setParIntDTO(ParentalIntimation_DTO parIntDTO) {
        this.parIntDTO = parIntDTO;
    }
     

    public int getProfile_id() {
        return profile_id;
    }

    public void setProfile_id(int profile_id) {
        this.profile_id = profile_id;
    }
     

    public List<FIR_PS_DTO> getFirNoPS_List() {
        return firNoPS_List;
    }

    public void setFirNoPS_List(List<FIR_PS_DTO> firNoPS_List) {
        this.firNoPS_List = firNoPS_List;
    }

    public ParentalIntimation_Service getParentalIntimationService() {
        return parentalIntimationService;
    }

    public void setParentalIntimationService(ParentalIntimation_Service parentalIntimationService) {
        this.parentalIntimationService = parentalIntimationService;
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

    public Object getModel() {
        return "hello";
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setServletResponse(HttpServletResponse hsr) {
        response=hsr;
    }
    
    public String fetchAllFirs()
    {
        String fetchResult="error";
        try
        {
            firNoPS_List=parentalIntimationService.viewAllFirs();
            if(firNoPS_List.isEmpty())
            {
                fetchResult="error";
            }
            else
            {
                fetchResult="success";
            }
        }catch(Exception e)
        {
            fetchResult="error";
        }
        return fetchResult;
    }
    
    public String displayParentalIntimation()
    {
        String parentalResult="error";
        System.out.println(getProfile_id());
        try
        {
           parIntDTO= parentalIntimationService.getParInti_DisplayDet(getProfile_id());
           parentalResult="success";
        }catch(Exception e)
        {
            parentalResult="error";
        }
        
        return parentalResult;
    }
    
    public String saveParentalIntimation()
    {
        System.out.println("Action error...");
        String parIntSaveResult="error";
        ParentalIntimation_DTO temp_parInti=new ParentalIntimation_DTO();
        try
        {
            temp_parInti.setAccusedId(getProfile_id());
            temp_parInti.setParentIntimationSent("yes");
            temp_parInti.setAccuPlacedInst(getInstName());
            temp_parInti.setAccuJjbPlace(getJjbPlace());
            String temp_jjb_time=getJjbTime().substring(11,16);;
            temp_parInti.setAccuJjbDate(StringToDate.getStringToDateTime(getJjbAppointDate(),temp_jjb_time));
            temp_parInti.setAccuChargeReason(getChargeReason());
            System.out.println("Action error2...");
            parentalIntimationService.saveParentalIntimation(temp_parInti);
            
           parIntSaveResult="success"; 
        }catch(Exception e)
        {
            e.printStackTrace();
            parIntSaveResult="error";
        }
        
        return parIntSaveResult;
        
    }
    
}
