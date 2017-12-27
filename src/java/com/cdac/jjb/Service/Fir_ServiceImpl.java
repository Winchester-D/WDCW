/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;

import com.cdac.jjb.DAO.Fir_DAO;
import com.cdac.jjb.orm.Fir;
import java.util.List;

/**
 *
 * @author Swetha
 */
public class Fir_ServiceImpl implements Fir_Service{
    private Fir_DAO firDAO;

    public Fir_DAO getFirDAO() {
        return firDAO;
    }

    public void setFirDAO(Fir_DAO firDAO) {
        this.firDAO = firDAO;
    }
    
    public String saveFirDet(Fir firForm)
    {
        String serviceResult="error";
        try
        {
        serviceResult=firDAO.saveFirDet(firForm);
        }
        catch(Exception e)
        {
           e.printStackTrace(); 
        }
        return serviceResult;
    }
    
    public List getFIRDetails(String firNo,String policeStation) {
       List firForm =null;
       try{
       firForm = firDAO.getFIRFormDetails(firNo,policeStation);
       }catch(Exception e){
           System.out.println("Fir_ServiceImpl.java : 45 : Exception Message"+e.getMessage());
       }
       return firForm;
    }

    
    
}
