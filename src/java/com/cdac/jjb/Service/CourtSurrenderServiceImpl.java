/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;

import com.cdac.jjb.DAO.Fir_DAO;
import com.cdac.jjb.orm.CourtSurrender;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ajay
 */
public class CourtSurrenderServiceImpl implements CourtSurrenderService{
    
    private Fir_DAO courtSurrenderDAO;

    public Fir_DAO getCourtSurrenderDAO() {
        return courtSurrenderDAO;
    }

    public void setCourtSurrenderDAO(Fir_DAO courtSurrenderDAO) {
        this.courtSurrenderDAO = courtSurrenderDAO;
    }

    public String saveCourtSurrenderForm(CourtSurrender cs) {
        String status=null;
        int i = courtSurrenderDAO.saveAccused(cs);
        if(i!=0)
            status = "success";
        return status;
          
    }

    public List getCourtSurrenderFormByFIR(String firNo,String policeStation) {
       List csForm =null;
       csForm = courtSurrenderDAO.getAccusedByFIR(firNo,policeStation);
       return csForm;
    }

    public List getCourtSurrenderFormByProceedingNo(String proceedingNo) {
        List csForm =null;
        csForm = courtSurrenderDAO.getAccusedByProceedingNo(proceedingNo);
        return csForm;
    }

    public List getFirAndPolicsStationList() {
        List firAndPloceStn=null;
        List firAndPSStnList=new ArrayList();
        List firList=new ArrayList();
        List PSList=new ArrayList();
        try {
            firAndPloceStn = courtSurrenderDAO.getFirAndPolicsStationList();
            if(firAndPloceStn.size()!=0){
                for(Object l : firAndPloceStn){
                    Object[] firArray = (Object[])l;
                    firList.add(firArray[0]);
                    PSList.add(firArray[1]);
                    System.out.println("CourtSurrenderServiceImpl.java : 60 : "+firArray[0]+" : "+firArray[1]);
                }
                firAndPSStnList.add(firList);
                firAndPSStnList.add(PSList);
            }
            
            return firAndPSStnList;
        } catch (Exception e) {
            System.out.println("CourtSurrenderServiceImpl.java : 54 : "+e.getMessage());
            return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //getViewCSFirAndPSList
    }
    
    //---------------------------------------------------------
    
    public List getViewCSFirAndPSList() {
        List firAndPloceStn=null;
        List firAndPSStnList=new ArrayList();
        List firList=new ArrayList();
        List PSList=new ArrayList();
        try {
            firAndPloceStn = courtSurrenderDAO.getViewCSFirAndPSList();
            if(firAndPloceStn.size()!=0){
                for(Object l : firAndPloceStn){
                    Object[] firArray = (Object[])l;
                    firList.add(firArray[0]);
                    PSList.add(firArray[1]);
                    System.out.println("CourtSurrenderServiceImpl.java : 90 : "+firArray[0]+" : "+firArray[1]);
                }
                firAndPSStnList.add(firList);
                firAndPSStnList.add(PSList);
            }
            
            return firAndPSStnList;
        } catch (Exception e) {
            System.out.println("CourtSurrenderServiceImpl.java : 98 : "+e.getMessage());
            return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //getViewCSFirAndPSList
    }
    
}
