/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;
import com.cdac.jjb.DAO.Fir_DAO;
import com.cdac.jjb.orm.Fir;
import com.cdac.jjb.DTO.FIR_PS_DTO;
import com.cdac.jjb.DTO.ParentalIntimation_DTO;
import java.util.List;
/**
 *
 * @author Swetha
 */
public class ParentalIntimation_ServiceImpl implements ParentalIntimation_Service{
    private Fir_DAO firDAO;

    public Fir_DAO getFirDAO() {
        return firDAO;
    }

    public void setFirDAO(Fir_DAO firDAO) {
        this.firDAO = firDAO;
    }
    
    public List<FIR_PS_DTO> viewAllFirs()
    {
       List<FIR_PS_DTO> fir_list=null;
        try
        {
        fir_list=firDAO.viewAllFirs();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return fir_list;
    }
    
    public ParentalIntimation_DTO getParInti_DisplayDet(int accid)
    {
        ParentalIntimation_DTO piDTO=null;
        try
        {
            piDTO=firDAO.getParInti_DisplayDet(accid);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return piDTO;
    }
    
    public String saveParentalIntimation(ParentalIntimation_DTO pi_DTO)
    {
        String saveResult="error";
        try
        {
            System.out.println("service error...");
            saveResult=firDAO.saveParentalIntimation(pi_DTO);
            System.out.println("service1 error...");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return saveResult;
    }
}
