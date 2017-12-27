/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Actions;

import com.cdac.jjb.Service.CourtSurrenderService;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.Fir;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import com.cdac.common.util.StringToDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ajay
 */
public class CourtSurrenderAction extends ActionSupport implements ModelDriven,ServletRequestAware,ServletResponseAware,SessionAware,ServletContextAware {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private CourtSurrender courtSurrender = new CourtSurrender();
    private int age;
    private String incomeGroup;

    public String getIncomeGroup() {
        return incomeGroup;
    }

    public void setIncomeGroup(String incomeGroup) {
        this.incomeGroup = incomeGroup;
    }

    public String getLivingStatus() {
        return livingStatus;
    }

    public void setLivingStatus(String livingStatus) {
        this.livingStatus = livingStatus;
    }
    private String livingStatus;

    public int getAge() {
        return age;
    }

    public void setAge(int accuAge) {
        this.age = accuAge;
    }
    public CourtSurrender getCourtSurrender() {
        return courtSurrender;
    }

    public void setCourtSurrender(CourtSurrender courtSurrender) {
        this.courtSurrender = courtSurrender;
    }
    CourtSurrenderService courtSurrenderService;
    static List firList=null;
    static List psList=null;
    List csViewList=new ArrayList();

    public List getCsViewList() {
        return csViewList;
    }

    public void setCsViewList(List csViewList) {
        this.csViewList = csViewList;
    }

    public List getFirList() {
        return firList;
    }

    public void setFirList(List firList) {
        this.firList = firList;
    }

    public List getPsList() {
        return psList;
    }

    public void setPsList(List psList) {
        this.psList = psList;
    }

    public CourtSurrenderService getCourtSurrenderService() {
        return courtSurrenderService;
    }

    public void setCourtSurrenderService(CourtSurrenderService courtSurrenderService) {
        this.courtSurrenderService = courtSurrenderService;
    }
    
    public String execute(){
        try
        {
          System.out.println("CourtSurrender.java : 42 : inside execute method");
          String st=courtSurrenderService.saveCourtSurrenderForm(courtSurrender);
          System.out.println("CourtSurrender.java : 44 : inside execute method");
          
          if(st==null)
              return ERROR;
          else
              return "success";
       }
       catch(Exception e)
       {
           e.printStackTrace();
           return ERROR;
       }
    }
    

    public void setServletRequest(HttpServletRequest hsr) {
        this.request = hsr;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setServletResponse(HttpServletResponse hsr) {
        this.response = hsr;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSession(Map<String, Object> map) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setServletContext(ServletContext sc) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Object getModel() {
        Object object=null;
        try {
             // if(request.getParameter("CourtSurrenderForm").equalsIgnoreCase("CourtSurrenderForm")){
                 
                System.out.println("CourtSurrenderAction.java : 113 : accuActsSec : "+request.getParameter("accuActsSec"));
                System.out.println("CourtSurrenderAction.java : 113 : age : "+request.getParameter("accuAge1"));
               int incomeGroup = (request.getParameter("accuIncomeGroup1")!=null && !(request.getParameter("accuIncomeGroup1").isEmpty()))?Integer.parseInt(request.getParameter("accuIncomeGroup1")):-1;
               int livingState = (request.getParameter("accuLivingStat1")!=null && !((request.getParameter("accuLivingStat1")).isEmpty()))?Integer.parseInt(request.getParameter("accuLivingStat1")):-1; 
               int accuAge = (request.getParameter("accuAge1")!=null && !(request.getParameter("accuAge1").isEmpty()))?Integer.parseInt(request.getParameter("accuAge1")):-1;
               String accuArrestTime = (request.getParameter("accu_arrest_time")!=null && !(request.getParameter("accu_arrest_time").isEmpty()))? request.getParameter("accu_arrest_time"):"00:00";
               System.out.println("CourtSurrenderAction.java : 118 : arrest time : "+accuArrestTime);
               //Date accuArrestDate = (request.getParameter("accuArrestDate1")!=null)?StringToDate.getStringToDateTime(request.getParameter("accuArrestDate1"),accuArrestTime):null; 
               Date accuArrestDate = (request.getParameter("accuArrestDate1")!=null && !(request.getParameter("accuArrestDate1").isEmpty()))?StringToDate.getStringToDateTime(accuArrestTime.replace("T", " ")):null; 
               Date accuPpIssuDate = (request.getParameter("accuPpIssuDate1")!=null && !(request.getParameter("accuPpIssuDate1").isEmpty()))?StringToDate.getStringToDate(request.getParameter("accuPpIssuDate1")):null; 
               String accuCustodyTime = (request.getParameter("custodyTime")!=null && !(request.getParameter("custodyTime").isEmpty()))? request.getParameter("custodyTime"):"00:00";
               //Date accuCustodyDateTime = (request.getParameter("accuCustodyDateTime1")!=null)?StringToDate.getStringToDateTime(request.getParameter("accuCustodyDateTime1"),accuCustodyTime):null; 
               Date accuCustodyDateTime = (request.getParameter("accuCustodyDateTime1")!=null && !(request.getParameter("accuCustodyDateTime1").isEmpty()))?StringToDate.getStringToDateTime(accuCustodyTime.replace("T", " ")):null; 
               String accuIntimationTime = (request.getParameter("intimatedTime")!=null && !(request.getParameter("intimatedTime").isEmpty()))? request.getParameter("intimatedTime"):"00:00";
               //Date accuIntimationDateTime = (request.getParameter("accuIntimationDateTime1")!=null)?StringToDate.getStringToDateTime(request.getParameter("accuIntimationDateTime1"),accuIntimationTime):null; 
               Date accuIntimationDateTime = (request.getParameter("accuIntimationDateTime1")!=null && !(request.getParameter("accuIntimationDateTime1").isEmpty()))?StringToDate.getStringToDateTime(accuIntimationTime.replace("T", " ")):null; 
               Date courtSurrDate = (request.getParameter("courtSurrDate1")!=null && !(request.getParameter("courtSurrDate1").isEmpty()))?StringToDate.getStringToDate(request.getParameter("courtSurrDate1")):null; 
               String ps = request.getParameter("ps");
               String firno = request.getParameter("firNo");
               courtSurrender.setAccuAge(accuAge);
               courtSurrender.setAccuIncomeGroup(incomeGroup);
               courtSurrender.setAccuLivingStat(livingState);
               courtSurrender.setAccuArrestDate(accuArrestDate);
               courtSurrender.setAccuPpIssuDate(accuPpIssuDate);
               courtSurrender.setAccuCustodyDateTime(accuCustodyDateTime);
               courtSurrender.setAccuIntimationDateTime(accuIntimationDateTime);
               courtSurrender.setCourtSurrDate(courtSurrDate); 
               courtSurrender.setFir(new Fir(firno, ps));
               object=courtSurrender;
              /*}else{
                  return "hello";
              }*/
       // }
            return object;
        } catch (NullPointerException e) {
                //e.printStackTrace();
                return "hello";
        }
    }
    
    public String getFIRAndPoliceStationList(){
        List firAndPoliceList = courtSurrenderService.getFirAndPolicsStationList();
        if(firAndPoliceList!=null && firAndPoliceList.size()!=0){ 
         firList = (List)firAndPoliceList.get(0);
         psList = (List)firAndPoliceList.get(1);
         Iterator itr1 = firList.iterator();
         Iterator itr2 = psList.iterator();
         while(itr1.hasNext() && itr2.hasNext()){
             csViewList.add(itr2.next()+"--------->"+itr1.next());
         }
         setCsViewList(csViewList);
            return "success";
        }else
            return "error";
    }
    //-----------------------Fir and PS List From CourtSurrender Table for CourtSurrender View
    
    public String getViewCSFIRAndPSList(){
        List firAndPoliceList = courtSurrenderService.getViewCSFirAndPSList();
        if(firAndPoliceList!=null && firAndPoliceList.size()!=0){ 
         firList = (List)firAndPoliceList.get(0);
         psList = (List)firAndPoliceList.get(1);
         Iterator itr1 = firList.iterator();
         Iterator itr2 = psList.iterator();
         while(itr1.hasNext() && itr2.hasNext()){
             csViewList.add(itr2.next()+"--------->"+itr1.next());
         }
         setCsViewList(csViewList);
            return "success";
        }else
            return "error";
    }
    
    //---------------------------------To display details for court surrender form-----------------------------------------------
    public String viewCourtSurrenderForm(){
      String result=null;
        try {
            System.out.println("CourtSurrenderAction.java : 164 : PS : "+request.getParameter("psFir"));
            String psFir = request.getParameter("psFir");
            String[] ps_fir = psFir.split("--------->");
            List viewCSForm = courtSurrenderService.getCourtSurrenderFormByFIR(ps_fir[1],ps_fir[0]);
            courtSurrender = (CourtSurrender)viewCSForm.get(0);
            age =courtSurrender.getAccuAge();
            incomeGroup = getIncomeGroup(courtSurrender.getAccuIncomeGroup());
            livingStatus = getLivingStatus(courtSurrender.getAccuLivingStat());
            setAge(age);
            setIncomeGroup(incomeGroup);
            setLivingStatus(livingStatus);
            System.out.println("CourtSurrenderAction.java : 205 :  "+courtSurrender.getAccuAge());
            setCourtSurrender(courtSurrender);
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
            result="error";
        }
        return result ;
    }
    
    public String getLivingStatus(int livingStatusCode){
    String living_Status=null;
        switch(livingStatusCode){
            case 1 : living_Status="Living alone";
                break;
            case 2 : living_Status="living with family";
                break;
            case 3 : living_Status="living with associate in pucca house";
                break;
            case 4 : living_Status="Hotel";
                break;
            case 5 : living_Status="Hostel";
                break;
            case 6 : living_Status="Katcha house";
                break;
            case 7 : living_Status="Thatched house";
                break;
            case 8 : living_Status="Slum";
                break;
            case 9 : living_Status="Homeless";
                break;
            case 10 : living_Status="Harbourer";
                break;
            default : living_Status="Not Available";
                break;
    }  
    return living_Status;
    }
    
    public String getIncomeGroup(int incomeCode){
        String income_Group=null;
        switch(incomeCode){
            case 1 : income_Group="Economically Weaker Section(Annual Income below Rs.25000/-)";
                break;
            case 2 : income_Group="Lower Income(Rs.25001/- to Rs.50000/-)";
                break;
            case 3 : income_Group="Lower middle income(Rs.50001/- to Rs.100000/-)";
                break;
            case 4 : income_Group="middle income(Rs.100000/- to Rs.200000/-)";
                break;
            case 5 : income_Group="Upper middle income(Rs.200000/- to Rs.300000/-)";
                break;
            case 6 : income_Group="Upper income(Above Rs.300000/-)";
                break;
            default:income_Group="Not Available";
                break;
         }
        return income_Group;
    }
}
