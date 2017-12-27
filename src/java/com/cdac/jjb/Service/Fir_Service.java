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
public interface Fir_Service {
    public String saveFirDet(Fir firForm);
    public List getFIRDetails(String firNo,String policeStation); 
      
}
