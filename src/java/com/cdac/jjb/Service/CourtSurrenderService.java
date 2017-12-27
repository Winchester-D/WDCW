/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.Service;


import com.cdac.jjb.orm.CourtSurrender;
import java.util.List;

/**
 *
 * @author ajay
 */
public interface CourtSurrenderService {
    public String saveCourtSurrenderForm(CourtSurrender cs);
    public List getCourtSurrenderFormByFIR(String firNo,String policaStation);
    public List getCourtSurrenderFormByProceedingNo(String proceedingNo);
    public List getFirAndPolicsStationList();
    public List getViewCSFirAndPSList();
    
}
