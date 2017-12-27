/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.jjb.DAO;

import com.cdac.jjb.DTO.CC_Details_Dto;
import com.cdac.jjb.orm.CourtSurrender;
import com.cdac.jjb.orm.EnquiryProcess;
import com.cdac.jjb.orm.RemandCaseDairy;
import com.cdac.jjb.orm.SocialInvestigation;
import com.cdac.jjb.orm.SocialInvestigationOrder;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.cdac.jjb.orm.Fir;
import org.hibernate.HibernateException;
import com.cdac.jjb.DTO.FIR_PS_DTO;
import com.cdac.jjb.DTO.ParentalIntimation_DTO;

/**
 *
 * @author suresh
 */
public class Fir_DAOImpl implements Fir_DAO{

     private HibernateTemplate hibernateTemplate;
    private String remandId;
    public void setSessionFactory(SessionFactory sessionFactory){
     this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
    
    //ajay code start
    
    public int saveAccused(CourtSurrender cs) {
        int i=0;
        try{ 
             i = (Integer)hibernateTemplate.save(cs);
        }catch(Exception e){
            e.printStackTrace();
        }
        return i;
       
    }

    public List getAccusedByFIR(String firNo,String policeStation) {
        List<CourtSurrender> csList = new ArrayList<CourtSurrender>();
        try {
            String query = "SELECT cs FROM CourtSurrender cs WHERE cs.fir.firPK.firNo = ? AND cs.fir.firPK.policeStation = ? ";
            csList = hibernateTemplate.find(query,new Object[]{firNo,policeStation});
        } catch (Exception e) {
                e.printStackTrace();
        }
        return csList;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAccusedByProceedingNo(String proceedingNo) {
        List<CourtSurrender> csList = new ArrayList<CourtSurrender>();
        try {
            csList = hibernateTemplate.findByNamedQueryAndNamedParam("CourtSurrender.findByProceedingGdNo","proceedingGdNo" ,proceedingNo);
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return csList;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
     public CourtSurrender getCourtSurrenById(String selAccId) {
        try {
            return (CourtSurrender)hibernateTemplate.find("from CourtSurrender cs where cs.accusedId = "+Integer.parseInt(selAccId)).get(0);
        } catch (Exception e) {
            System.out.println("Fir_DAOImpl.java : 113 : "+e.getMessage());
            return null;
        }
    }

    public List<CourtSurrender> getAllCourtSurrender() {
        try {
            return hibernateTemplate.find("from CourtSurrender cs");
        } catch (Exception e) {
            
            System.out.println("Fir_DAOImpl.java : 118 : "+e.getMessage());
            return null;
        }
    }
    
    public List<Object> getFirAndPolicsStationList(){
        try {
            return hibernateTemplate.find("SELECT f.firPK.firNo,f.firPK.policeStation FROM Fir f");
        } catch (Exception e) {
            System.out.println("Fir_DAOImpl.java : 121 : "+e.getMessage());
            return null;
        }
    }
    
    public List<Object> getViewCSFirAndPSList(){
        try {
            return hibernateTemplate.find("SELECT fl.fir.firPK.firNo,fl.fir.firPK.policeStation  from CourtSurrender fl");
        } catch (Exception e) {
            System.out.println("Fir_DAOImpl.java : 121 : "+e.getMessage());
            return null;
        }
    }
    
    //ajay code ends  
    //swetha code start
     public String saveFirDet(Fir firForm)
    {
        String firAddResult="error";
        try
        {
            hibernateTemplate.save(firForm);
            firAddResult="success";
            
        }catch(HibernateException e)
        {
            firAddResult="error";
        }
        return firAddResult;
    }
    
    public List<FIR_PS_DTO> viewAllFirs()
    {
        List<FIR_PS_DTO> fir_list=null;
        try
        {
          String query = "Select new com.cdac.jjb.DTO.FIR_PS_DTO(fl.fir.firPK.firNo,fl.fir.firPK.policeStation,fl.accusedId,fl.accuName) from CourtSurrender fl";
        fir_list = hibernateTemplate.find(query);  
        }catch(HibernateException e)
        {
            e.printStackTrace();
        }
        return fir_list;
    }
    
    public ParentalIntimation_DTO getParInti_DisplayDet(int accid)
    {
        List<ParentalIntimation_DTO> piDTOList=null;
        ParentalIntimation_DTO piDTO=null;
        try
        {
            String query = "Select new com.cdac.jjb.DTO.ParentalIntimation_DTO(pi.accusedId,pi.accuName,pi.accuAge,pi.accuIntimationName,pi.accuAddress,pi.accuActsSec,pi.accuCustodyDateTime,pi.parentIntimationSent,pi.accuPlacedInst,pi.accuJjbPlace,pi.accuJjbDate,pi.accuChargeReason) from CourtSurrender pi where pi.accusedId = ?";
            piDTOList=hibernateTemplate.find(query,accid);
            if(piDTOList.get(0)!=null)
            {
                piDTO=piDTOList.get(0);
            }
        }catch(HibernateException e)
        {
            e.printStackTrace();
        }
        return piDTO;
        
    }
    
    public String saveParentalIntimation(ParentalIntimation_DTO pi_DTO)
    {
        List<CourtSurrender> piDTOList=null;
        CourtSurrender courtSurr=null;
        String updateResult="error";
        System.out.println("DAO error...");
        try
        {
            String query = "from CourtSurrender pi where pi.accusedId = ?";
            piDTOList=hibernateTemplate.find(query,pi_DTO.getAccusedId());
            System.out.println("find query error...");
            if(piDTOList.get(0)!=null)
            {
                courtSurr=piDTOList.get(0);
                courtSurr.setParentIntimationSent(pi_DTO.getParentIntimationSent());
                courtSurr.setAccuPlacedInst(pi_DTO.getAccuPlacedInst());
                courtSurr.setAccuJjbPlace(pi_DTO.getAccuJjbPlace());
                courtSurr.setAccuJjbDate(pi_DTO.getAccuJjbDate());
                courtSurr.setAccuChargeReason(pi_DTO.getAccuChargeReason());
                hibernateTemplate.update(courtSurr);
                updateResult="success";
            }
            else
            {
                System.out.println("retrieval error...");
                updateResult="success";
            }
        }catch(HibernateException e)
        {
            e.printStackTrace();
            updateResult="success";
        }
        return updateResult;
    }
    
    //swetha code ends
    public boolean savePrelEnquiry(SocialInvestigation socInv) {
        try {
            hibernateTemplate.save(socInv);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
   /* public List<FIR_PS_DTO> viewAllFirs()
    {
        List<FIR_PS_DTO> fir_list=null;
        try
        {
          String query = "Select new com.cdac.jjb.DTO.FIR_PS_DTO(fl.fir.firPK.firNo,fl.fir.firPK.policeStation,fl.accusedId,fl.accuName) from CourtSurrender fl";
        fir_list = hibernateTemplate.find(query);  
        }catch(HibernateException e)
        {
            e.printStackTrace();
        }
        return fir_list;
    }
*/
    public List<CC_Details_Dto> getCCAccusedList() {
        try
        {
 
            
            return  hibernateTemplate.find("select  new com.cdac.jjb.DTO.CC_Details_Dto(sio.ccNo,sio.fir.firPK.firNo,sio.accusedId.accusedId,sio.accusedId.accuName)  from SocialInvestigationOrder sio");
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

  
    public boolean saveDPOSocialInvOrder(SocialInvestigationOrder socialInvestigationOrder) {
        try {
            System.out.println("--->dao-->"+socialInvestigationOrder.getDistrictId());
            hibernateTemplate.save(socialInvestigationOrder);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveRemCaseDiary(RemandCaseDairy remandCaseDiary) {
         try {
            System.out.println("--->dao-->"+remandCaseDiary.getFir());
            hibernateTemplate.save(remandCaseDiary);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<SocialInvestigation> getSocialInvFor(String ccNo) {
         try {
            return hibernateTemplate.find("from  SocialInvestigation si where si.ccNo = '"+ccNo+"'");
        } catch (Exception e) {
            System.out.println("Fir_DAOImpl.java : 113 : "+e.getMessage());
            return null;
        }
    }

    public SocialInvestigationOrder getSocialInvOrder(String trialName) {
        try {
            
            List<SocialInvestigationOrder> sio_list=   (List<SocialInvestigationOrder>)hibernateTemplate.find("from  SocialInvestigationOrder sio where sio.ccNo = '"+trialName+"'");
            if(sio_list.isEmpty())
            {
               return null;
            }
            else        
                return sio_list.get(0);
        } catch (Exception e) {
            System.out.println("Fir_DAOImpl.java : 113 : "+e.getMessage());
            return null;
        }
    }

    public boolean saveEnquiryProcess(EnquiryProcess enquiryProcess) {
        try {
            System.out.println("--->dao-->"+enquiryProcess);
            hibernateTemplate.save(enquiryProcess);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<RemandCaseDairy> getAllRemCaseDiary() {
        try {
            return hibernateTemplate.find("from RemandCaseDairy rcd");
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
    }

  
    public RemandCaseDairy getRemCaseDiary(String remandId) {
         try {
            return (RemandCaseDairy)hibernateTemplate.find("from RemandCaseDairy rcd where rcd.remandId = "+remandId).get(0);
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
    }

    public List<EnquiryProcess> getAllTrials() {
       try
        {
            return (List<EnquiryProcess>)hibernateTemplate.find("from EnquiryProcess ep");
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
    }

    public EnquiryProcess getTrial(String trialName) {
         try {
                    
          
             
             List<EnquiryProcess> epList=(List<EnquiryProcess>)hibernateTemplate.find("from EnquiryProcess ep where ep.enquiryProcessPK.trialNo = '"+trialName+"'");
             if(epList.isEmpty())
             {
                 return null;
             }
             else
             {
                     //  System.out.println("ep----->"+epList);
                      return epList.get(0);
             }
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
        }
    }

    public List getFIRFormDetails(String firNo,String policeStation) {
        List<Fir> firList = new ArrayList<Fir>();
        try {
            String query = "SELECT f FROM Fir f WHERE f.firPK.firNo = ? AND f.firPK.policeStation = ? ";
            firList = hibernateTemplate.find(query,new Object[]{firNo,policeStation});
        } catch (Exception e) {
                e.printStackTrace();
        }
        return firList;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SocialInvestigationOrder getSocialInvForAccu(String trialName) {
        try {
            
            List<SocialInvestigationOrder> sio_list=   (List<SocialInvestigationOrder>)hibernateTemplate.find("from  SocialInvestigationOrder sio where sio.accusedId.accusedId = "+Integer.parseInt(trialName));
            if(sio_list.isEmpty())
            {
               return null;
            }
            else        
                return sio_list.get(0);
        } catch (Exception e) {
            System.out.println("Fir_DAOImpl.java : 113 : "+e.getMessage());
            return null;
        }
    }
    
}
