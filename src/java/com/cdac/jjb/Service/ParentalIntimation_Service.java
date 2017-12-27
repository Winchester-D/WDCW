/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;
import com.cdac.jjb.DAO.Fir_DAO;
import com.cdac.jjb.orm.Fir;
import com.cdac.jjb.DTO.FIR_PS_DTO;
import java.util.List;
import com.cdac.jjb.DTO.ParentalIntimation_DTO;
/**
 *
 * @author Swetha
 */
public interface ParentalIntimation_Service {
    public List<FIR_PS_DTO> viewAllFirs();
    public ParentalIntimation_DTO getParInti_DisplayDet(int accid);
    public String saveParentalIntimation(ParentalIntimation_DTO pi_DTO);
}
