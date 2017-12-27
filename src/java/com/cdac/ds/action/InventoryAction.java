/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cdac.ds.action;

//import com.cdac.common.StringToDate;
import com.cdac.common.util.CurrentDateProvider;
import com.cdac.common.util.StringToDate;
import com.opensymphony.xwork2.ActionSupport;
import com.cdac.usermanagement.ORM.ItemMaster;
//import com.cdac.ds.bean.CatTree;---------->commented afer deleting bean package
import com.cdac.ds.dto.BOMItemDto;
import com.cdac.ds.dto.IssueDetail;
import com.cdac.ds.dto.ItemDto;
import com.cdac.ds.dto.LoanDto;
import com.cdac.ds.dto.RepTransDTO;
import com.cdac.ds.dto.TransDto;
import com.cdac.ds.service.InventoryService;
import com.cdac.usermanagement.ORM.ChildMaster;
import com.cdac.usermanagement.ORM.DistrictMaster;
import com.cdac.usermanagement.ORM.HomeMaster;
import com.cdac.usermanagement.ORM.MenuDetail;
import com.cdac.usermanagement.ORM.MenuMaster;
import com.cdac.usermanagement.ORM.ProductCatSubcat;
import com.cdac.usermanagement.ORM.TransactionDetails;
import com.einnovates.customtags.tree.TreeNode;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.xwork.StringEscapeUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author ksuresh
 */

public class InventoryAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,SessionAware {

    public InventoryAction() {
    }
    
    //utility methods start

    private InventoryService inventoryService;
    ServletContext sc; 
    public InventoryService getInventoryService() {
        return inventoryService;
    }
    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
    
  
    public String getLoggedInhome()
    {
           //  return ActionContext.getContext().getSession().get("homeid").toString(); 
    
           return  getSession().get("homeid").toString();
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
    
    public void setServletContext(ServletContext sc) 
    {
     this.sc=sc  ;
    }
    /*utility methods ends*/
    
    /*utility internal methods start*/
    
     /**
      populates all categories under selected top category
     */
  
     public String popAllSubCat()
     {
     
         String topcat_select=getAddcat_prodcat_select();
         System.out.println("==inside popAllSubcat()=== category selected::"+topcat_select);
         Map<String,String> retMap;
         if(!topcat_select.equals("select"))
         {
         
             System.out.println("rl(in popAllSubcat())--"+ActionContext.getContext().getLocale().getLanguage());
             retMap=inventoryService.popAllSubCat(topcat_select);
         
        try {
            //for populating topcat
            setAddcat_prodcat_pop(inventoryService.populate_top_cat(getLoggedInhome()));
           // setAddcat_prodcat_pop_object(inventoryService.populate_top_cat_object());
        } catch (Exception ex) {
           // java.util.logging.Logger.getLogger(InventoryAction.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
         }
         else
         {
        
       
             retMap=new HashMap<String,String>();
         
         }
         System.out.println("==in InvAction==popAllSubCat()===after service map returned=="+retMap);
         
         setRemoveitem_subcat_pop(retMap);
         
         //setRemoveit
         
         return "popsubcat-success";
         
     }
     /**
        populate sub category except Ration for Item Issue reg
      */
     
     public String popSubCatExRation()
     {
           
         String topcat_select=getAddcat_prodcat_select();
         System.out.println("==inside popAllSubcat()=== category selected::"+topcat_select);
         Map<String,String> retMap;
         if(!topcat_select.equals("select"))
         {
         
             System.out.println("rl(in popAllSubcat())--"+ActionContext.getContext().getLocale().getLanguage());
             retMap=inventoryService.popAllSubCat(topcat_select);
         
         
        try {
            //for populating topcat
            setAddcat_prodcat_pop(inventoryService.populate_top_cat(getLoggedInhome()));
           // setAddcat_prodcat_pop_object(inventoryService.populate_top_cat_object());
        } catch (Exception ex) {
           // java.util.logging.Logger.getLogger(InventoryAction.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
         }
         else
         {
        
       
             retMap=new HashMap<String,String>();
         
         }
        
         if(retMap.containsValue("Kitchen and diet-->ration"))
         {
             retMap.remove(getKeyByValue(retMap, "Kitchen and diet-->ration"));
         }
         else if(retMap.containsValue("Kitchen and diet-->Ration"))
         {
             retMap.remove(getKeyByValue(retMap, "Kitchen and diet-->Ration"));
         }
         else if(retMap.containsValue("Kitchen And Diet-->Ration"))
         {
             retMap.remove(getKeyByValue(retMap, "Kitchen And Diet-->Ration"));
         }
          System.out.println("==in InvAction==popAllSubCat()===after service map returned=="+retMap);
         
         setRemoveitem_subcat_pop(retMap);
         
         //setRemoveit
         
         return "popsubcat-success";
     }
     
    private  static <T, E> T getKeyByValue(Map<T, E> map, E value) {
    for (Entry<T, E> entry : map.entrySet()) {
        if (value.equals(entry.getValue())) {
            return entry.getKey();
        }
    }
    return null;
   }
     /**
      populates sub categories under selected category
      */
     public String popSelectCategory()
     {
         System.out.println("selected sub cat for remove item is::"+getRemoveitem_items_select());
         List<ProductCatSubcat> removeCatDetails=new ArrayList<ProductCatSubcat>();            
            
            for(String str:getRemoveitem_items_select())
            {
                removeCatDetails.addAll(inventoryService.populate_subCategory(str));
                
            }            
         
            //for populating topcat
                setAddcat_prodcat_pop(inventoryService.populate_top_cat(getLoggedInhome()));
            //for sub cat    
              Map  retMap=inventoryService.popAllSubCat(getAddcat_prodcat_select());
              setRemoveitem_subcat_pop(retMap);
                setRemoveitem_items_selectnames(inventoryService.getListCatNamesForCatNo(getRemoveitem_items_select()));
             System.out.println("*******In Inv Action****subcat for subcat list retrieved**********"+removeCatDetails);
             
            System.out.println("rl(addcat())--"+ActionContext.getContext().getLocale().getLanguage());
          setRemove_cat_detail(removeCatDetails);
         
         return "popselectcat-success";
         
         
     }
      public String populate()
    {
        //System.out.println("inside INVENTORY ACTION:: poulate::getItem"+getItem());
     
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        if(getItem().equalsIgnoreCase("category"))
        {
          
          setAddcat_prodcat_pop(inventoryService.populate_top_cat(homeId));
          setTopcatgory(getAddcat_prodcat_pop());

        
        }
        //now
        setRemove_item_detail(null);
        return "populate-category";
    }
    public String populate_medi_other()
    {
         if(getItem().equalsIgnoreCase("category"))
        {
          
          setAddcat_prodcat_pop_object(inventoryService.populate_top_cat_object());
          setTopcatgory(getAddcat_prodcat_pop());

        
        }
        //now
        setRemove_item_detail(null);
        return "populate-category";
    }
    
      /*utility internal methods ends*/   
    /**
     * Loans starts     
     */
 
    private Map<String, String> allHomesForLoan;

    public Map<String, String> getAllHomesForLoan() {
        return allHomesForLoan;
    }

    public void setAllHomesForLoan(Map<String, String> allHomesForLoan) {
        this.allHomesForLoan = allHomesForLoan;
    }
    public String populateLoan()
    {
         if(getItem().equalsIgnoreCase("category"))
        {         
          
          setAddcat_prodcat_pop(inventoryService.populate_top_cat(getLoggedInhome()));
          setTopcatgory(getAddcat_prodcat_pop());
          Map<String,String> homesMap=inventoryService.getAllHomesExcept(getLoggedInhome());    
          homesMap.put("other", "Others");
          setAllHomesForLoan(homesMap); 
         
        }
        //now
        setRemove_item_detail(null);
        return "populate-category";
    }
    public String loan_date;
    public String LoanGiveOrTake;
    public String loan_homeId;
    public String loan_remarks;

    public String getLoanGiveOrTake() {
        return LoanGiveOrTake;
    }

    public void setLoanGiveOrTake(String LoanGiveOrTake) {
        this.LoanGiveOrTake = LoanGiveOrTake;
    }

    public String getLoan_date() {
        return loan_date;
    }

    public void setLoan_date(String loan_date) {
        this.loan_date = loan_date;
    }

    public String getLoan_homeId() {
        return loan_homeId;
    }

    public void setLoan_homeId(String loan_homeId) {
        this.loan_homeId = loan_homeId;
    }

    public String getLoan_remarks() {
        return loan_remarks;
    }

    public void setLoan_remarks(String loan_remarks) {
        this.loan_remarks = loan_remarks;
    }
    
    public String saveLoan()
    {
         try
        {
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
        System.out.println("***in inv action***in savloan()***");
        System.out.println("***in inv action***in saveloan()***"+getLoan_date()+"----"+getLoan_homeId()+"--"+getLoan_remarks());
        
        boolean save=inventoryService.saveLoan(homeId,getLoan_date(),getLoanGiveOrTake(),getLoan_homeId(),getLoan_remarks(),getReceiptitemChecked(),getReceiptitem_qoh(),getReceiptitem_remarks(),userId);
         
        if(save) 
           {
               setMessage(getText("mess.succ.loanSaved"));
               return "loan-success";
           }
            else
            {
                
                 setMessage(getText("mess.fail.loansSave"));
                  return  "loan-failure";
            }
        }
         catch(Exception e)
         {
             setMessage(getText("mess.exec"));
             e.printStackTrace();
             return  "loan-failure";
         }
    }
    
     //view loan start
    public String viewLoan()
    {
        try {
             String homeId=ActionContext.getContext().getSession().get("homeid").toString();
         if(!getViewIssue_fromDate().equals("")||!getViewIssue_toDate().equals(""))// &&getViewDonation_toDate()!=null)
         {  
            Date fromDate=StringToDate.getStringToDate(getViewIssue_fromDate());
            Date toDate  =StringToDate.getStringToDate(getViewIssue_toDate());
            
            List<TransDto> dtoList = new ArrayList<TransDto>();
                    
              dtoList.addAll(inventoryService.viewDonation(homeId,fromDate,toDate,"LOAN GIVEN")); 
              dtoList.addAll(inventoryService.viewDonation(homeId,fromDate,toDate,"LOAN TAKEN")); 
              dtoList.addAll(inventoryService.viewDonation(homeId,fromDate,toDate,"LOAN CLEARED")); 
              dtoList.addAll(inventoryService.viewDonation(homeId,fromDate,toDate,"LOAN CREDITED")); 
            
            //sorting dtos by Trans date
            
            int i, j,n=dtoList.size();TransDto t;
              for(i = 0; i < n; i++){
              for(j = 1; j < (n-i); j++){
              if(dtoList.get(j-1).getTm().getTransDate() .after( dtoList.get(j).getTm().getTransDate()))
              {
              t = dtoList.get(j-1);
              dtoList.set(j-1, dtoList.get(j)) ;
             dtoList.set(j,t);
              }
              }
              }
            
            setTransDtoList(dtoList);
            
           
         }
         else
        {
            setMessage(getText("mess.datesIncorr"));
           
         }
                return "viewLoan-success";     
         
        } catch (Exception e) {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewLoan-failure";
        }
    }
    
    //view loan ends
    
    /**
     * Loans ends
     */
    
    /**
     * Payback starts
     */
    private String PaybackMakeOrAccecpt;

    public String getPaybackMakeOrAccecpt() {
        return PaybackMakeOrAccecpt;
    }

    public void setPaybackMakeOrAccecpt(String PaybackMakeOrAccecpt) {
        this.PaybackMakeOrAccecpt = PaybackMakeOrAccecpt;
    }

    private List<LoanDto> loanPrevList;

    public List<LoanDto> getLoanPrevList() {
        return loanPrevList;
    }

    public void setLoanPrevList(List<LoanDto> loanPrevList) {
        this.loanPrevList = loanPrevList;
    }
    
    //for displaying in payback
    public String popLoans()
    {
        String pbtype=getPaybackMakeOrAccecpt();
        System.out.println("payback type"+pbtype+"===");
        List<LoanDto> loansList;
         if(pbtype==null)
        {
             loansList=null;
        }
        else
        {
             loansList=inventoryService.getLoansOfType(getLoggedInhome(),pbtype);
             setLoanPrevList(loansList);
        }
        
        return "populate-prevloans";
    }
    public List<String> loanTransId;

    public List<String> getLoanTransId() {
        return loanTransId;
    }

    public void setLoanTransId(List<String> loanTransId) {
        this.loanTransId = loanTransId;
    }
    
    private String payBack_date;

    public String getPayBack_date() {
        return payBack_date;
    }

    public void setPayBack_date(String payBack_date) {
        this.payBack_date = payBack_date;
    }
    private String payBack_remarks;

    public String getPayBack_remarks() {
        return payBack_remarks;
    }

    public void setPayBack_remarks(String payBack_remarks) {
        this.payBack_remarks = payBack_remarks;
    }

    public String savePayBack()
    {
        try
        {
        String pbtype=getPaybackMakeOrAccecpt();
        boolean save=inventoryService.savePayBack(pbtype,loanTransId,StringToDate.getStringToDate(payBack_date),payBack_remarks);
        
        if (save) {
             setMessage(getText("mess.succ.payBackSave"));
               return "payback-success";
        } else {
             setMessage(getText("mess.fail.payBackSave"));
                  return  "payback-failure";
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec.payBackSave"));
            return  "payback-failure";
        }
    }
     /**
     * Payback ends
     */
    
    /**
     * Diet Report start
     */
    public String report_month;
    public String report_year;

    public String getReport_month() {
        return report_month;
    }

    public void setReport_month(String report_month) {
        this.report_month = report_month;
    }

    public String getReport_year() {
        return report_year;
    }

    public void setReport_year(String report_year) {
        this.report_year = report_year;
    }
    
    private PdfWriter pw1;

    public PdfWriter getPw1() {
        return pw1;
    }

    public void setPw1(PdfWriter pw1) {
        this.pw1 = pw1;
    }

    
 public String reportItext()
    {
        /*
        System.out.println("method------------>reportIText");
        Document doc=new  Document(PageSize.A1,0,0,15,0);
        
        
        List<String> monthlist=new ArrayList<String>();
       monthlist.add(getText("label.mon.jan"));
       monthlist.add(getText("label.mon.feb"));
       monthlist.add(getText("label.mon.mar"));
       monthlist.add(getText("label.mon.apr"));
       monthlist.add(getText("label.mon.may"));
       monthlist.add(getText("label.mon.jun"));
       monthlist.add(getText("label.mon.jul"));
       monthlist.add(getText("label.mon.aug"));
       monthlist.add(getText("label.mon.sep"));
       monthlist.add(getText("label.mon.oct"));
       monthlist.add(getText("label.mon.nov"));
       monthlist.add(getText("label.mon.dec"));
       
//         List<String> monthlist_h=new ArrayList<String>();
//      
//       monthlist_h.add("जनवरी");
//       monthlist_h.add("फरवरी");
//       monthlist_h.add("मार्च");
//       monthlist_h.add("अप्रैल");
//       monthlist_h.add("मई");
//       monthlist_h.add("जून");
//       monthlist_h.add("जुलाई");
//       monthlist_h.add("अगस्त");
//       monthlist_h.add("सितंबर");
//       monthlist_h.add("अक्टूबर");
//       monthlist_h.add("नवम्बर");
//       monthlist_h.add("दिसम्बर");
       
         
       int days[]={31,29,31,30,31,30,31,31,30,31,30,31};
       
        
       
        try {
            
            response.setContentType("text/html");
            
            
            Map<Integer,int[]> num_child=inventoryService.getNumChilds(getLoggedInhome(),getReport_month(),getReport_year());
         
            ServletOutputStream sos=response.getOutputStream();
            PdfWriter pw1_local =PdfWriter.getInstance(doc, sos);
            
            doc.open();
            
//            Font headfont =FontFactory.getFont("Times New Roman", 36, Font.BOLD);
            //Font cheadfont=FontFactory.getFont("Times New Roman", 16,Font.BOLD);
//            Font messfont =FontFactory.getFont("Times New Roman", 12,Font.NORMAL);
            
            System.out.println("path---------->"+request.getRealPath("/") +"locale------------->"+getLocale()+"language----------->"+request.getLocale().getLanguage());
            
            
            String fontFile;
            
              if(getLocale().toString().equals("hi"))
              {
                  System.out.println("in locale--->in hindi");
                  fontFile= request.getRealPath("/WEB-INF/photos")+"/mangalb.ttf";
              }
              else if(getLocale().toString().equals("te"))
              {
                  System.out.println("in locale--->in telugu");
                  fontFile=request.getRealPath("/WEB-INF/photos")+"/gautamib.ttf";
              }
              else
              {
                  System.out.println("in locale--->english");
                  fontFile=request.getRealPath("/WEB-INF/photos")+"/ANTQUAB.ttf";
              }
            // create base font for the specified font
            BaseFont baseFont = BaseFont.createFont(fontFile, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font lfont = new Font(baseFont, 36);
            Font cheadfont=new Font(baseFont, 16); 
            
            List param=new ArrayList();
            param.add(monthlist.get(Integer.parseInt(getReport_month())-1));
            param.add(getReport_year());
            String heading1=getText("mess.head.dietReport", param);
            Paragraph heading=new Paragraph(StringEscapeUtils.unescapeHtml(heading1),lfont);
            
            
         //   Paragraph heading_h=new Paragraph(monthlist_h.get(Integer.parseInt(getReport_month())-1)+":"+getReport_year()+StringEscapeUtils.unescapeHtml(getText("message.rep.Heading")),hindifont);
            Paragraph mtext=new Paragraph(StringEscapeUtils.unescapeHtml(getText("message.rep.QuaninKGs")),cheadfont);
            
            heading.setAlignment(Element.ALIGN_CENTER);
            
            doc.add(heading);
           
            
            mtext.setAlignment(Element.ALIGN_RIGHT);
            mtext.setIndentationRight(200f);
            doc.add(mtext);
            doc.add(new Paragraph("\n\n"));
            
            List<ItemMaster> item_list= inventoryService.getRationItems(getLoggedInhome());
            
            PdfPTable table=new PdfPTable(5+item_list.size());
            table.setSpacingBefore(5f);
            table.addCell(new PdfPCell(new Phrase(StringEscapeUtils.unescapeHtml(getText("label.date")),cheadfont)));
            table.addCell(new PdfPCell(new Phrase(StringEscapeUtils.unescapeHtml(getText("label.srChilds")),cheadfont)));
            table.addCell(new PdfPCell(new Phrase(StringEscapeUtils.unescapeHtml(getText("label.jrChilds")),cheadfont)));         
            table.addCell(new PdfPCell(new Phrase(StringEscapeUtils.unescapeHtml(getText("label.total")),cheadfont)));
            
            for(int i=0;i<item_list.size();i++)
            {
                table.addCell(new PdfPCell(new Phrase(item_list.get(i).getItemName().toLowerCase(),cheadfont)));
            }
            
            table.addCell(new PdfPCell(new Phrase("Dy Super")));
            
           List<TransactionDetails> tdlist;
            
           boolean wflag=true;
            for(int i=1;i<=days[Integer.parseInt(getReport_month())-1];i++)
            {
                
               table.addCell(new PdfPCell(new Phrase(""+i,cheadfont)));              
               table.addCell(new PdfPCell(new Phrase(""+num_child.get(i)[0])));
               table.addCell(new PdfPCell(new Phrase(""+num_child.get(i)[1])));         
               table.addCell(new PdfPCell(new Phrase(""+(num_child.get(i)[0]+num_child.get(i)[1]))));
                
                  Calendar date=Calendar.getInstance();
                  date.set(Integer.parseInt(report_year),Integer.parseInt(report_month)-1, i);
                  tdlist=inventoryService.getAllRationTransactions(date.getTime());
               
                  for(int j=0;j<item_list.size();j++)
                 {
                     
                   boolean flag=false;
                     for(int k=0;k<tdlist.size();k++)
                     {
                        //System.out.println("i==="+i+"###--td item------>"+item_list.get(j).getItemName()+"#####--quan-->"+tdlist.get(k).getQuantity());
                         if(item_list.get(j).getItemNo().equals(tdlist.get(k).getItemMaster().getItemNo()))
                         {
                             wflag=false;
                             flag=true;
                             
                            table.addCell(new PdfPCell(new Phrase(String.valueOf(tdlist.get(k).getQuantity()/1000))));
                           break;
                         }
                     }
                     if(!flag)
                     {
                         table.addCell(new PdfPCell(new Phrase("-")));
                     }
                     
                 }
                     table.addCell(new PdfPCell(new Phrase("")));
            }
            
            
//             PdfReader reader=new PdfReader(pw.)
//             PdfStamper stamp = new PdfStamper(doc, response.getOutputStream());
            
            
            doc.add(table);
             if(wflag)
             {
                 try
                 {
                Image image1 = Image.getInstance(request.getRealPath("/WEB-INF/photos")+"/watermark.jpg");
               //  java.text.MessageFormat image1=new MessageFormat(getText(""))  ;   
                image1.setAbsolutePosition(600,1600);
                doc.add(image1);
                 }
                catch(FileNotFoundException fe)
                {
                    System.out.println("image not found--->COPY WATERMARK FILE IN ::: project->build->web->photos ---folder");
                }
             }
           
             doc.close();
             
             sos.flush();
                         
             //PdfWriter pw =PdfWriter.getInstance(doc, response.getOutputStream());
             //System.out.println("documnent----------------->"+doc.rightMargin());
             System.out.println("return ---------->success");
                setPw1(pw1_local);
             
             return SUCCESS;
            
        } catch (Exception ex) {
            System.out.println("exe------------------->"+ex);
            ex.printStackTrace();
            return "end";
        }
       // System.out.println("------------------->end");
       */
        
        //HTML report for MULTi-LINGUAL//
      try {
            List<String> monthlist=new ArrayList<String>();
                   monthlist.add(getText("label.mon.jan"));
                   monthlist.add(getText("label.mon.feb"));
                   monthlist.add(getText("label.mon.mar"));
                   monthlist.add(getText("label.mon.apr"));
                   monthlist.add(getText("label.mon.may"));
                   monthlist.add(getText("label.mon.jun"));
                   monthlist.add(getText("label.mon.jul"));
                   monthlist.add(getText("label.mon.aug"));
                   monthlist.add(getText("label.mon.sep"));
                   monthlist.add(getText("label.mon.oct"));
                   monthlist.add(getText("label.mon.nov"));
                   monthlist.add(getText("label.mon.dec"));
                   
                   int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
       
            response.setContentType("text/html");
            Map<Integer,int[]> num_child=inventoryService.getNumChilds(getLoggedInhome(),getReport_month(),getReport_year());
            ServletOutputStream sos=response.getOutputStream();
            
            List param=new ArrayList();
            param.add(monthlist.get(Integer.parseInt(getReport_month())-1));
            param.add(getReport_year());
            String heading1=getText("mess.head.dietReport", param);
            List<ItemMaster> item_list= inventoryService.getRationItems(getLoggedInhome());
            
            sos.print("<html><body>");
            sos.print("<h1 style='text-align:center;font-style:bold;'>"+heading1+"</h1>");
            sos.print("<h3 style='text-align:right;font-style:italic;'>"+getText("message.rep.QuaninKGs")+"</h3>");
            sos.print("<center><table border='1'><tr>");
            sos.print("<td style='max-width: 10px;'><h3 style='display: block;-moz-transform: rotate(-90deg);'>"+getText("th.srNo")+"</h3></td><td style='max-width: 10px;'><h3 style='display: block;-moz-transform: rotate(-90deg);'>"+getText("label.srChilds")+"</h3></td><td style='max-width: 10px;'><h3 style='display: block;-moz-transform: rotate(-90deg);'>"+getText("label.jrChilds")+"</h3></td><td style='max-width: 10px;'><h3 style='display: block;-moz-transform: rotate(-90deg);'>"+getText("label.total")+"</h3></td>");
           
         for (int i = 0; i < item_list.size(); i++) {
               String str=item_list.get(i).getItemName();
               sos.print("<th style='min-width: 16px;'>"); 
               for(int j=str.length()-1;j>=0;j--)
               {
                   sos.print("<h3 style='display: block;-moz-transform: rotate(-90deg); padding: 0px 0px 0px 0px; margin: 0px;'>"+str.charAt(j) +"</h3>");   
               }
               sos.print("</th>");
            }
            sos.print("<th style='max-width: 10px;'><h3 style='display: block;-moz-transform: rotate(-90deg);filter: flipv fliph;padding: 60px 1px;'>DySuper(Sign)</h3></th></thead></tr>");
            
            List<TransactionDetails> tdlist;
            
            boolean wflag=true;
            sos.print("<tbody>");
            boolean isLeap;
            
            if(Integer.parseInt(getReport_year())%4==0)
                isLeap=true;
            else
                isLeap=false;
            
            int daysInMon;
            
            if((isLeap)&&(Integer.parseInt(getReport_month())==2))
                daysInMon=29;
            else
                daysInMon=days[Integer.parseInt(getReport_month())-1];
                        
                        
            for(int i=1;i<=daysInMon;i++)
            {
                
               sos.print("<tr style='width: 1.2em;'><td>"+i+"</td>");              
               if(num_child.get(i)!=null)
               {
                   sos.print("<td>"+num_child.get(i)[0]+"</td>");
                   sos.print("<td>"+num_child.get(i)[1]+"</td>");     
                   sos.print("<td>"+(num_child.get(i)[0]+num_child.get(i)[1])+"</td>");
               }
               else
               {
                   sos.print("<td>&nbsp;</td>");
                   sos.print("<td>&nbsp;</td>");     
                   sos.print("<td>&nbsp;</td>");
               }
            
                  Calendar date=Calendar.getInstance();
                  date.set(Integer.parseInt(report_year),Integer.parseInt(report_month)-1, i);
                  tdlist=inventoryService.getAllRationTransactions(date.getTime(),getLoggedInhome());
               
                  for(int j=0;j<item_list.size();j++)
                 {
                     
                   boolean flag=false;
                     for(int k=0;k<tdlist.size();k++)
                     {
                         if(item_list.get(j).getItemNo().equals(tdlist.get(k).getItemMaster().getItemNo()))
                         {
                             wflag=false;
                             flag=true;
                             double val=(tdlist.get(k).getQuantity());
                            //sos.print("<td style='width: 1.2em;'>"+String.format("%.2f",val)+"</td>");
                              sos.print("<td style='width:1.2em;'>"+String.format("%.3f",val)+"</td>");
                           break;
                         }
                     }
                     if(!flag)
                     {
                         sos.print("<td>-</td>");
                     }
                     
                 }
                     sos.print("<td>&nbsp</td></tr>");
                     
                    
            }
                sos.print("</tbody></table></center>");
                
                     if(wflag)
                     {
                        System.out.println("REALPATH----------->"+sc.getRealPath("/")+"WEB-INF/photos/");
                        sos.print("<img src='"+sc.getRealPath("/") +"WEB-INF\\photos\\watermark.jpg' alt='Data Not Available' style='position:absolute;left:650px;top:650px;'/> ");
                     }
            sos.print("</body></html>");    
            sos.flush();
            sos.close();
             return SUCCESS;
            
        } catch (Exception ex) {
            System.out.println("exe------------------->"+ex);
            ex.printStackTrace();
            return "end";
        }
    }
       /**
     *   Display Google Map starts
     */
    //suresh added 13-01-2011 start
    
    public String displayMap()
    {
      //  List<DistrictMaster> districtList=inventoryService.displayMap();
        //List<DistrictMaster> districtList=new ArrayList<DistrictMaster>();
        /*
        for (Iterator<DistrictMaster> it = districtList.iterator(); it.hasNext();) {
            DistrictMaster dm = it.next();
            
            if(dm.getDistrictId().equals("ADI"))
            {
                dm.setDistrictName(getText("label.dis.adilabad"));
            }
            else if(dm.getDistrictId().equals("ANA"))
            {
                dm.setDistrictName(getText("label.dis.anantapur"));
            }
            else if(dm.getDistrictId().equals("CHI"))
            {
                dm.setDistrictName(getText("label.dis.chitoor"));
            }
            else if(dm.getDistrictId().equals("EGO"))
            {
                dm.setDistrictName(getText("label.dis.eastGoda"));
            }
            else if(dm.getDistrictId().equals("GUN"))
            {
                dm.setDistrictName(getText("label.dis.gun"));
            }
            else if(dm.getDistrictId().equals("HYD"))
            {
                dm.setDistrictName(getText("label.dis.hyd"));
            }
            else if(dm.getDistrictId().equals("KAD"))
            {
                dm.setDistrictName(getText("label.dis.kad"));
            }
            else if(dm.getDistrictId().equals("KAR"))
            {
                dm.setDistrictName(getText("label.dis.kar"));
            }
            else if(dm.getDistrictId().equals("KHA"))
            {
                dm.setDistrictName(getText("label.dis.kha"));
            }
            else if(dm.getDistrictId().equals("KRI"))
            {
                dm.setDistrictName(getText("label.dis.kri"));
            }
            else if(dm.getDistrictId().equals("KUR"))
            {
                dm.setDistrictName(getText("label.dis.kur"));
            }
            else if(dm.getDistrictId().equals("MAH"))
            {
                dm.setDistrictName(getText("label.dis.mah"));
            }
            else if(dm.getDistrictId().equals("MED"))
            {
                dm.setDistrictName(getText("label.dis.med"));
            }
            else if(dm.getDistrictId().equals("NAL"))
            {
                dm.setDistrictName(getText("label.dis.nal"));
            }
            else if(dm.getDistrictId().equals("NEL"))
            {
                dm.setDistrictName(getText("label.dis.nel"));
            }
            else if(dm.getDistrictId().equals("NZB"))
            {
                dm.setDistrictName(getText("label.dis.nzb"));
            }
            else if(dm.getDistrictId().equals("PRA"))
            {
                dm.setDistrictName(getText("label.dis.pra"));
            }
            else if(dm.getDistrictId().equals("RAN"))
            {
                dm.setDistrictName(getText("label.dis.ran"));
            }
            else if(dm.getDistrictId().equals("SRI"))
            {
                dm.setDistrictName(getText("label.dis.sri"));
            }
            else if(dm.getDistrictId().equals("VIJ"))
            {
                dm.setDistrictName(getText("label.dis.vij"));
            }
            else if(dm.getDistrictId().equals("VIS"))
            {
                dm.setDistrictName(getText("label.dis.vis"));
            }
            else if(dm.getDistrictId().equals("WAR"))
            {
                dm.setDistrictName(getText("label.dis.war"));
            }
            else if(dm.getDistrictId().equals("WGO"))
            {
                dm.setDistrictName(getText("label.dis.wgo"));
            }
            
            
        }
        
        
        */
        /*
        Map<String,List<HomeMaster>> home_district1=inventoryService.popDistrict_home(districtList);
        
                
        setDistrictDetails(districtList);
        setHome_district(home_district1);
        
        Iterator dis_itr=districtList.iterator();
        
        while(dis_itr.hasNext())
        {
            String dis_id=((DistrictMaster)dis_itr.next()).getDistrictId();
                        
            List home_list=home_district1.get(dis_id);
            
            Iterator home_itr=home_list.iterator();
           
            while(home_itr.hasNext())
            {
                 String home_id=((HomeMaster)home_itr.next()).getHomeId();
                 //System.out.println("%%%%%%homeid------------>"+home_id);
                 List numChilds=inventoryService.countChild_home(home_id);
                 
                 System.out.println("%%%homeID---------->"+home_id+"--------------num of childs------>"+numChilds.size());
                 
                 num_of_child.put(home_id,numChilds.size());
                
            }
        }
                */
        boolean isNet;
         try {
        final URL url = new URL("http://www.google.com");
        final URLConnection conn = url.openConnection();
        conn.connect();
        isNet =true;
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        isNet = false;
    }
       if(isNet)  
        return SUCCESS;
       else
           return "success_img";
    }

    //for child details Google map
    public String popChild_home()
    {
        System.out.println("in-----------------------method=popChild_home()------------------home str="+home);
        
        List<ChildMaster> home_child1=inventoryService.countChild_home(home);
        
        setHome_child(home_child1);
        displayMap1();
        
       // System.out.println("<---------------size="+getHome().size()+"-------------obj="+getHome()+"--------------child="+getHome().get(0));
        return SUCCESS;
    }
  
   //for list of child at home in Google map
    private List<ChildMaster> home_child;

    public List<ChildMaster> getHome_child() {
        return home_child;
    }

    public void setHome_child(List<ChildMaster> home_child) {
        this.home_child = home_child;
    }
    
    
    
    public String home;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
    //for leftmenu of Google map
     private List<DistrictMaster> districtDetails;

    public List<DistrictMaster> getDistrictDetails() {
        return districtDetails;
    }

    public void setDistrictDetails(List<DistrictMaster> districtDetails) {
        this.districtDetails = districtDetails;
    }
    
    
    private void displayMap1()
    {
        List<DistrictMaster> districtList=inventoryService.displayMap();
        
        Map<String,List<HomeMaster>> home_district1=inventoryService.popDistrict_home(districtList);
        
                
        setDistrictDetails(districtList);
        setHome_district(home_district1);
        
        
        Iterator dis_itr=districtList.iterator();
        
        while(dis_itr.hasNext())
        {
            String dis_id=((DistrictMaster)dis_itr.next()).getDistrictId();
                        
            List home_list=home_district1.get(dis_id);
            
            Iterator home_itr=home_list.iterator();
           
            while(home_itr.hasNext())
            {
                 String home_id=((HomeMaster)home_itr.next()).getHomeId();
                 //System.out.println("%%%%%%homeid------------>"+home_id);
                 List numChilds=inventoryService.countChild_home(home_id);
                 
                 System.out.println("%%%homeID---------->"+home_id+"--------------num of childs----**************-->"+numChilds.size());
                 
                 num_of_child.put(home_id,numChilds.size());
                
            }
        }
        
        //return SUCCESS;
    }

   Map<String,List<HomeMaster>> home_district;

    public Map<String, List<HomeMaster>> getHome_district() {
        return home_district;
    }

    public void setHome_district(Map<String, List<HomeMaster>> home_district) {
        this.home_district = home_district;
    }
 

     private Map num_of_child=new HashMap();

    public Map getNum_of_child() {
        return num_of_child;
    }

    public void setNum_of_child(Map num_of_child) {
        this.num_of_child = num_of_child;
    }
 /**
     *Display Google Map ends
     */
    
     
  

    
    

    /**
     * Tailoring start
     */
    public String saveTailoringIssue()
    {
        try
        {
           
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
       // System.out.println("In inv action:::saveTailoringIssne()::date"+getTailor_issue_date()+":"+getTailor_issue_letterno()+":"+getTailor_issue_address()+":"+getTail_item_checked()+":"+getTail_rawcloth_quan()+":"+getTail_rawcloth_remarks());
         System.out.println("In inv action:::saveTailoringIssne()::date"+getTailor_issue_date()+":"+getTailor_issue_letterno()+":"+getTailor_issue_address()+":"+getIssue_item_chk()+":"+getIssue_item_quantity()+":"+getIssue_item_remarks());
        
        String msg=inventoryService.saveTailoringIssue(StringToDate.getStringToDate(getTailor_issue_date()),homeId,getTailor_issue_letterno(),getTailor_issue_address(),getIssue_item_chk(),getIssue_item_quantity(),getIssue_item_remarks(),userId);
        if(!msg.equalsIgnoreCase("trans detail failed"))
        {
            setMessage(msg);  
            return "tailorIssue-success";
        }
        else
        {
            setMessage(getText("mess.fail.tailIssSaved", "ERROR"));
            return "tailorIssue-failure";
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec.tailIssSave", "ERROR"));
            return "tailorIssue-failure";
            
        }
    }
    public String saveTailoringReceive()
    {
        try
        {
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
        //System.out.println("In inv action:::saveTailoringReceive()::date"+getTailor_receive_date()+":"+getTailor_receive_letterno()+":"+getTailor_receive_address()+":"+getTail_itemrecv_checked()+":"+getTail_stichcloth_quan()+":"+getTail_stichcloth_remarks());
        System.out.println("In inv action:::saveTailoringReceive()::date"+getTailor_receive_date()+":"+getTailor_receive_letterno()+":"+getTailor_receive_address()+":"+getReceiptitemChecked()+":"+getReceiptitem_qoh()+":"+getReceiptitem_remarks());
        
        if(inventoryService.saveTailoringReceive(StringToDate.getStringToDate(
            getTailor_receive_date()),homeId,getTailor_receive_letterno(),getTailor_receive_address(),getReceiptitemChecked(),getReceiptitem_qoh(),getReceiptitem_remarks(),userId))
        {
        setMessage(getText("mess.succ.tailRecSave", "OK"));
        return "tailorReceive-success";
        }
        else
        {
            setMessage(getText("mess.fail.tailRecSave","ERROR"));
            return "tailorReceive-failure";
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec.tailRecSave", "ERROR"));
            return "tailorReceive-failure";
        }
    }
    //view tailoring start
         public String viewTailoring()
    {
        try {
           
          String homeId=ActionContext.getContext().getSession().get("homeid").toString();
         if(!getViewTail_fromDate().equals("")||!getViewTail_toDate().equals(""))// &&getViewDonation_toDate()!=null)
         {  
            Date fromDate=StringToDate.getStringToDate(getViewTail_fromDate());
            Date toDate  =StringToDate.getStringToDate(getViewTail_toDate());
            
            List<TransDto> dtoList=new ArrayList<TransDto>();
            
            List<TransDto> dtoList1 = inventoryService.viewDonation(homeId,fromDate,toDate,"TAILOR ISSUE"); 
            List<TransDto> dtoList2 = inventoryService.viewDonation(homeId,fromDate,toDate,"TAILOR RECEIPT"); 
            
            dtoList.addAll(dtoList1);
            dtoList.addAll(dtoList2);
            //sorting dtos by Trans date
            
            int i, j,n=dtoList.size();TransDto t;
  for(i = 0; i < n; i++){
  for(j = 1; j < (n-i); j++){
  if(dtoList.get(j-1).getTm().getTransDate() .after( dtoList.get(j).getTm().getTransDate()))
  {
  t = dtoList.get(j-1);
  dtoList.set(j-1, dtoList.get(j)) ;
 dtoList.set(j,t);
  }
  }
  }
            
            setTransDtoList(dtoList);
            
           
         }
         else
        {
            setMessage(getText("mess.datesIncorr"));
           
         }
                return "viewIssue-success";     
            
        } catch (Exception e) {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewIssue-failure";
        }
     
    }
    //view tailoring ends
    /**
     * Tailoring ends
     */
     /**
     * 
     * BOM chart sart
     */
        public String popRation()
    {
        String result="error";
        try {
            List<BOMItemDto> bdto=inventoryService.populateRationBOM(getLoggedInhome());
       
       
        
         setDietChart_items(bdto);
                 
         result="dietchart-success";
        } catch (Exception e) {
            e.printStackTrace();
            result="error";
            setMessage(getText("mess.bom.noItems"));
        }
        return result;
        
    }
    public String popRationForBom()
    {
        String result;
        try {
            setBomItem(null);
        System.out.println("in inv action::popRationForBOM::catnum==="+getRemoveitem_items_select());
        if(getRemoveitem_items_select()==null)
        {
            setBomItem(null);
        }
        else
        {
            List<String> catnum=getRemoveitem_items_select();
        List<ItemMaster> rationItem=inventoryService.getItemDetails_im(catnum);
        
      //  System.out.println("in inv action::popRationForBOM::ration items"+rationItem);
        
       List<BOMItemDto> blist=inventoryService.populateBOM(getLoggedInhome(),rationItem);
        
        setBomItem(blist);
        }
        
        
        result="rationBOM-success";
        } catch (Exception e) {
            e.printStackTrace();
            result="error";
            
        }
        return result;
        
    }
    public String saveBOM()
    {
        
        System.out.println("item nos"+getBomItemNo()+"inside save bom"+getBom_quanntity());
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
        try
        {
        if(inventoryService.saveBOMItems(getBomItemNo(),getBom_quanntity(),userId,getLoggedInhome()))
        {
             setMessage("Entered BOM details are saved");
             return"saveBOM-success";
        }
        else
        {
            setMessage("BOM Insertion Failed");
            return "saveBOM-failure";
        }
        }
        catch(Exception e)
        {
             e.printStackTrace();   
             setMessage(getText("mess.exec"));
             return "saveBOM-failure";
             
        }
        
    }
    
    /**
     * 
     * BOM chart ends 
     */
    
    /**
     * Diet Issue start
     */
    private String dietItem_size;

    public String getDietItem_size() {
        return dietItem_size;
    }

    public void setDietItem_size(String dietItem_size) {
        this.dietItem_size = dietItem_size;
    }
    
    private List act_issued;

    public List getAct_issued() {
        return act_issued;
    }

    public void setAct_issued(List act_issued) {
        this.act_issued = act_issued;
    }


    public String saveDietIssue()
    {
        try
        {
        System.out.println("In inv action:::save DietIssne() ");
        
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
        System.out.println("home id"+homeId);
        Date diet_issue_date=StringToDate.getStringToDate(getDietIssue_date());
        System.out.println("date"+dietIssue_date);
        int diet_issue_srchild=Integer.parseInt(getDietReg_srChilds().trim());
        System.out.println("sr child"+dietReg_srChilds);
        int diet_issue_jrchild=Integer.parseInt(getDietReg_jrChilds().trim());
        System.out.println("jr child"+dietReg_jrChilds);
        
        
        List<String> diet_issue_list=getDiet_itemNo();
        System.out.println("lsit item nums"+diet_issue_list);
        
        
        System.out.println("date homeid srChild jrChild issueList-------->"+dietIssue_date+homeId+dietReg_srChilds+dietReg_jrChilds+"---checked itemNO_itr---->"+diet_itemNo+"---num of items--->"+dietItem_size+"---act Issued list--->"+act_issued);
        
        String msg= inventoryService.saveDietIssueItems(diet_issue_date,homeId,diet_issue_srchild,diet_issue_jrchild,diet_issue_list,userId,act_issued);
        
        System.out.println("savedietIssue()::msg="+msg);

          if(!msg.equalsIgnoreCase("trans detail failed"))
          {
            setMessage(msg);  
            return "saveDiet-success";
          }
        else
          {
            setMessage(getText("mess.fail.saveDietIss"));                
            return "saveDiet-failure";
          }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec"));                
            return "saveDiet-failure";
        }
        
    }
    /**
     * Diet Issue ends
     */
    /**
     * veiw diet isuue details
     */
    private String viewDietIssue_date;

    public String getViewDietIssue_date() {
        return viewDietIssue_date;
    }

    public void setViewDietIssue_date(String viewDietIssue_date) {
        this.viewDietIssue_date = viewDietIssue_date;
    }
    
    private TransDto tdto=null;

    public TransDto getTdto() {
        return tdto;
    }

    public void setTdto(TransDto tdto) {
        this.tdto = tdto;
    }
    
    
        public String viewDietIssue()
       {
        try
        {
            if(getViewDietIssue_date()!=null&&(!getViewDietIssue_date().equals("")))
            {
              Date view_date=StringToDate.getStringToDate(getViewDietIssue_date());
              tdto=inventoryService.viewDietIssue(view_date,getLoggedInhome());
              return "viewDiet-success";
            }
            else
            {
                setMessage("");
                return "viewDiet-success";
            }
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage("Exception Occured");                
            return "viewDiet-failure";
        }
        
    }

    /**
     * Receipts start
     */
    //save receipt start
    public String saveReceipt()
    {
        try
        {
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
        System.out.println("***in inv action***in saveRceipt()***");
        System.out.println("***in inv action***in saveRceipt()***"+getReceipt_date()+"----"+getReceipt_from()+"--"+getReceipt_remarks());
        
        //List<DonationOrReceiptItem> imlist=new LinkedList<DonationOrReceiptItem>();
        
        
        System.out.println("***in inv action***in saveRceipt()***no of checkboxes="+getReceiptitemChecked());
        System.out.println("***in inv action***in saveRceipt()***no of map of quan==="+getReceiptitem_qoh()+"--map of remarks--"+getReceiptitem_remarks());
        
        Date recvDate=StringToDate.getStringToDate(getReceipt_date());
         String invno=getInvoice_no();
            Date invdate=StringToDate.getStringToDate(getInvoice_date());
        
        boolean save=false;
           
            System.out.println("INV acrion-----inv no----->"+invno+"---recpt from---->"+getReceipt_from());
           save=inventoryService.savePurchaseItems(recvDate,homeId,getReceiveOrPurchase(),invno,invdate ,getReceipt_from(), getReceipt_remarks(), getReceiptitemChecked(),getReceiptitem_qoh(),getReceiptitem_remarks(),userId);
           if(save)
           {
               
                       if(getReceiveOrPurchase().equalsIgnoreCase("p"))
                              setMessage(getText("mess.succ.purSave"));
                       else if(getReceiveOrPurchase().equalsIgnoreCase("r"))
                              setMessage(getText("mess.succ.recSave"));
               
                return "receipt-success";
           }
             else
            {
                        if(getReceiveOrPurchase().equalsIgnoreCase("p"))
                             setMessage(getText("mess.fail.purSave"));
                        else if(getReceiveOrPurchase().equalsIgnoreCase("r"))
                              setMessage(getText("mess.fail.recFail"));
                
                
                  return  "receipt-failure";
            }
      
        }
        catch(Exception e)
        {
            setMessage(getText("mess.exec"));
            return  "receipt-failure";
        }
    }
    //save receipt ends
    //view receipt start
        public String viewReceipt()
    {
        try {
            String homeId=ActionContext.getContext().getSession().get("homeid").toString();
          if(!getViewReceipt_fromDate().equals("")||!getViewReceipt_toDate().equals(""))// &&getViewDonation_toDate()!=null)
          {     
            Date fromDate=StringToDate.getStringToDate(getViewReceipt_fromDate());
            Date toDate  =StringToDate.getStringToDate(getViewReceipt_toDate());
            
            List<TransDto> dtoList1 = inventoryService.viewDonation(homeId,fromDate,toDate,"RECEIPT"); 
            List<TransDto> dtoList2 = inventoryService.viewDonation(homeId,fromDate,toDate,"PURCHASE");
            
            List<TransDto> dtoList =new ArrayList<TransDto>();
            
            dtoList.addAll(dtoList1);
            dtoList.addAll(dtoList2);
            
            
            //sorting dtos by Trans date
            
            int i, j,n=dtoList.size();TransDto t;
  for(i = 0; i < n; i++){
  for(j = 1; j < (n-i); j++){
  if(dtoList.get(j-1).getTm().getTransDate() .after( dtoList.get(j).getTm().getTransDate()))
  {
  t = dtoList.get(j-1);
  dtoList.set(j-1, dtoList.get(j)) ;
 dtoList.set(j,t);
  }
  }
  }
            
            setTransDtoList(dtoList);
            
            
         }
         else
        {
            setMessage("Exception in view donation");
           
         }
                return "viewReceipt-success";     
            
                    
                    
            
        } catch (Exception e) {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewReceipt-failure";
        }
        
    }
    //view receipt ends
    /**
     * Receipts ends
     */

     /**
      * Donations start
      saves the donation details
      */
    public String saveDonation()
    {
        try
        {
        
        System.out.println("***in inv action***in saveDonation()***"+donation_date+"--"+donation_from+"--"+donation_remarks);
        
      // List<HomeItemQoh> imlist=new LinkedList<HomeItemQoh>();
        
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        System.out.println("***in inv action***in saveDonation()***no of checkboxes="+getDonation_item_chk());
        System.out.println("***in inv action***in saveDoantion()***no of map of quan==="+getDonation_item_quantity()+"--map of remarks--"+getDonation_remarks());
  
        Date donDate=StringToDate.getStringToDate(getDonation_date());
        
        if(inventoryService.saveDonationItem(donDate,homeId,getDonation_from().trim(),getDonation_remarks().trim(),getDonation_item_chk(),getDonation_item_quantity(),getDonation_item_remarks(),userId))
        {
          setMessage(getText("mess.succ.DonSaved"));              
          return "donation-success";
        }
        else
        {
            setMessage(getText("mess.fail.donSave"));
            return "donation-failure";
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "donation-failure";
            
        }
         
    }
    public String viewDonation()
    {
        try {
           
                  String homeId=ActionContext.getContext().getSession().get("homeid").toString();
         if(!getViewDonation_fromDate().equals("")||!getViewDonation_toDate().equals(""))// &&getViewDonation_toDate()!=null)
         {  
            Date fromDate=StringToDate.getStringToDate(getViewDonation_fromDate());
            Date toDate  =StringToDate.getStringToDate(getViewDonation_toDate());
            
            List<TransDto> dtoList = inventoryService.viewDonation(homeId,fromDate,toDate,"DONATION"); 
            
            //sorting dtos by Trans date
            
            int i, j,n=dtoList.size();TransDto t;
  for(i = 0; i < n; i++){
  for(j = 1; j < (n-i); j++){
  if(dtoList.get(j-1).getTm().getTransDate() .after( dtoList.get(j).getTm().getTransDate()))
  {
  t = dtoList.get(j-1);
  dtoList.set(j-1, dtoList.get(j)) ;
 dtoList.set(j,t);
  }
  }
  }
            
            setTransDtoList(dtoList);
            
           
         }
         else
        {
            setMessage(getText("mess.datesIncorr"));
           
         }
                return "viewDonation-success";     
            
        } catch (Exception e) {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewDonation-failure";
        }
     
    }
   

   /**
     * Donatios ends
     */
   
    
    /**
     * Issues starts
     */
    public String popIssuedTo()
    {
       String str=getIssue_to_radio();
       String homeid=ActionContext.getContext().getSession().get("homeid").toString();
        
        System.out.println("----1----home id--"+homeid+"--string--"+str);
        
        if(str==null)
        {
             str="start";
        }
        else  if(str.equalsIgnoreCase("sh"))
        {
            try
            {
              List l=inventoryService.popStakeHolders(homeid);
//            List list_stake_holders1=new ArrayList();
//            list_stake_holders1.add("case worker---name in home");
//            list_stake_holders1.add("Super--name in home");
//            list_stake_holders1.add("doctor--name in home");
//            list_stake_holders1.add("head master--name in home");
             
            setList_stake_holders(l);
            System.out.println("--stake holders--"+getList_stake_holders());
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(str.equalsIgnoreCase("in"))
        {
           // List list_child_idnames1=new ArrayList();

           // list_child_idnames1=inventoryService.popChilds(homeid);
            setList_child_idnames(inventoryService.popChilds(homeid));
            
           // System.out.println("--childs--"+list_child_idnames1);
        }
       System.out.println("----2---home id--"+homeid+"--string--"+str);
        setIssue_to_radio(str);
        
        return "pop-issuedto-success";
        

        
    }
    private String shname_other_issued;

    public String getShname_other_issued() {
        return shname_other_issued;
    }

    public void setShname_other_issued(String shname_other_issued) {
        this.shname_other_issued = shname_other_issued;
    }

    private String shdesig_other_issued;

    public String getShdesig_other_issued() {
        return shdesig_other_issued;
    }

    public void setShdesig_other_issued(String shdesig_other_issued) {
        this.shdesig_other_issued = shdesig_other_issued;
    }
    public String saveIssue()
    {
        try
        {
         System.out.println("***in inv action***in saveIssue()***"+issue_date+"--"+issue_to_radio+"--"+issue_remarks);
         
         String homeId=ActionContext.getContext().getSession().get("homeid").toString();
         String userId=ActionContext.getContext().getSession().get("userid").toString();
        
      // List<HomeItemQoh> imlist=new LinkedList<HomeItemQoh>();
        
        
        System.out.println("***in inv action***in saveDonation()***no of checkboxes="+getIssue_item_chk());
        System.out.println("***in inv action***in saveDoantion()***no of map of quan==="+getIssue_item_quantity()+"--map of remarks--"+getIssue_item_remarks());
  
        Date issDate=StringToDate.getStringToDate(getIssue_date());
        
        List issue_to=new ArrayList();
        
        if(getIssue_to_radio().equals("in"))
        {
             Iterator itr=getSelect_childs_ids().iterator();
             
             while(itr.hasNext())
             {
             String str=(String)itr.next();
             issue_to.add((str).substring(0, str.indexOf("-->")));
             
             }
        }
        else if(getIssue_to_radio().equals("sh"))
        {
            if(((String)getSelect_stake_holders().get(0)).equalsIgnoreCase("Others"))
            {
                
                //issue_to.add(getShname_other_issued()+"("+getShdesig_other_issued()+")");
                issue_to.add("Others");
                
            }
            else
            {
                issue_to.addAll(getSelect_stake_holders());
            }
            
        }
        
        System.out.println("Issued to got--------->"+issue_to);
        
        String msg=inventoryService.saveIssueItem(issDate,homeId,getIssue_to_radio(),issue_to,getIssue_remarks(),getIssue_item_chk(),getIssue_item_quantity(),getIssue_item_remarks(),userId);
        if(!msg.equalsIgnoreCase("trans detail failed"))
        {
          setMessage(msg);              
          return "issue-success";
        }
        else
        {
            setMessage("mess.fail.saveIss"); 
            return "issue-failure";
        }
        }catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec")); 
            return "issue-failure";
            
        }
    }
    
    //view issue start
    private IssueDetail issueInmates;

    public IssueDetail getIssueInmates() {
        return issueInmates;
    }

    public void setIssueInmates(IssueDetail issueInmates) {
        this.issueInmates = issueInmates;
    }
    public String viewIssueDetail()
    {
       String transId=request.getParameter("transId");
       String itemNo=request.getParameter("itemNo");
       IssueDetail id= inventoryService.viewIssueDetail(transId,itemNo);      
       
       
       
       if(id==null)
       {
           return ERROR;
       }
       else
       {
 
           setIssueInmates(id);
       
        return SUCCESS;
       }
        
    }
     public String viewIssue()
    {
        try {
           
          String homeId=ActionContext.getContext().getSession().get("homeid").toString();
         if(!getViewIssue_fromDate().equals("")||!getViewIssue_toDate().equals(""))// &&getViewDonation_toDate()!=null)
         {  
            Date fromDate=StringToDate.getStringToDate(getViewIssue_fromDate());
            Date toDate  =StringToDate.getStringToDate(getViewIssue_toDate());
            
            List<TransDto> dtoList = inventoryService.viewDonation(homeId,fromDate,toDate,"ISSUE"); 
            
            //sorting dtos by Trans date
            
            int i, j,n=dtoList.size();TransDto t;
  for(i = 0; i < n; i++){
  for(j = 1; j < (n-i); j++){
  if(dtoList.get(j-1).getTm().getTransDate() .after( dtoList.get(j).getTm().getTransDate()))
  {
  t = dtoList.get(j-1);
  dtoList.set(j-1, dtoList.get(j)) ;
 dtoList.set(j,t);
  }
  }
  }
            
            setTransDtoList(dtoList);
            
           
         }
         else
        {
            setMessage(getText("mess.datesIncorr"));
           
         }
                return "viewIssue-success";     
            
        } catch (Exception e) {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewIssue-failure";
        }
     
    }
    //view issue ends
    /** 
     * Issues ends
     */
    
    
  /**
     * Category Management start
     * Add Category start
     * adds the entered category
     */
    //addtopcat start
      public String addTopCat()
    {
        try
        {
            
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
            
        if(inventoryService.addTopcat(newtopcat_name, newtopcat_type,userId,homeId))
        {
            setMessage(getText("mess.succ.topCatSave", "OK", newtopcat_name));//"Top Category <"+newtopcat_name+"> added successfully");                
            return "addcat-success";
        }
        else
        {
            setMessage("Addition of Top Category <"+newtopcat_name+"> failed");                
            return "addcat-failure";
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage("Exception Occured in  Top Category <"+newtopcat_name+"> insertion");                
            return "addcat-failure";
                    
       }
            
    }
      //add topcat ends
      //add cat start
    public String addCat()
    {
        System.out.println("==inside INVENTORY ACTION:: addcat===subcat==size="+getRemoveitem_items_select().size());
        
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
          try{
            if(inventoryService.addCategory(getRemoveitem_items_select().get(0),getAddcat_newcat_name().trim(),getAddcat_newcat_itemType().trim(),userId,getLoggedInhome()))
            {
                 System.out.println("==inside INVENTORY ACTION::catgory inserted==");
                 setMessage(getText("mess.succ.subCatSave","OK",getAddcat_newcat_name()));//"Sub category <"+getAddcat_newcat_name().trim()+"> added successfully");
                 return "addcat-success";
            }
           else
           {
                System.out.println("==inside INVENTORY ACTION::catgory not inserted==");
                setMessage(getText("mess.fail.subCatSave", "ERROR", getAddcat_newcat_name()));//"Sub category insertion failed");
                return "addcat-failure";
           }
     

        }catch(Exception ae){
            ae.printStackTrace();
            setMessage(getText("mess.exec"));
            return "addcat-failure";
        }


    } 
    //add cat ends
    //removes catgory start
     

    public String removeCat()
    {
       
         System.out.println("==inside INVENTORY ACTION:: remove category===subcat num"+getRemovecat_chk());
          try{
                   String msg=inventoryService.removeCategory(getRemovecat_chk());
           
                 System.out.println("==inside INVENTORY ACTION::catgory removed==");
                 setMessage(msg);
                 return "removecat-success";
          
//                System.out.println("==inside INVENTORY ACTION::catgory not removed==");
//                setMessage("Removal Catgetory(s) failed.");
//                return "removecat-failure";
         
           //   }
        }catch(Exception ae){
            ae.printStackTrace();
            setMessage(getText("mess.exec"));
            return "removecat-failure";
        }


    }
    //remove cat ends
    //view cat starts
     /**
     gives the category tree for topcat selected(view cat) or from topcat(view item)
     */
    public String viewCat()
    {
       try {
              String viewcat=null;
            if(getItem().equalsIgnoreCase("Category")) 
            {
                   viewcat= "cat";//getAddcat_prodcat_select();
            }
            else if(getItem().equalsIgnoreCase("Item"))  
            {
                   viewcat= "item";
            }
            
            
            System.out.println("--quried for--"+viewcat);
            TreeNode retList = inventoryService.viewCategoryTree(viewcat,getLoggedInhome());
            
            setTreeNode(retList);
           request.setAttribute("retList", retList);
           
            return "viewcat-success";
        } catch (Exception ex) {
          //  java.util.logging.Logger.getLogger(InventoryAction.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewCat-failure";
        }
      
        
    }
    //view cat ends
     /**
     *  Category Management ends
     */
    
    
    /**
     * Item Management start
     * Add Item start
     adds the entered item
     */
    
  /*  public String addItem()
    {
        //System.out.println("==inside INVENTORY ACTION:: addItem===subcatname"+getRemovecat_subsel_cat());
          try{

              String homeId=ActionContext.getContext().getSession().get("homeid").toString();
              String userId=ActionContext.getContext().getSession().get("userid").toString();
              //String homeId=ActionContext.getContext().getSession().get("homeid").toString();
              System.out.println("------------------------------------------------> homeId in inventory = "+homeId);
             
              System.out.println("---prod sub category selected---- size---"+getRemoveitem_items_select()+"--mfg date--"+additem_newitem_mfgDate+"--expDate--"+additem_newitem_expDate);
              
              Date mfgDate=null,expDate=null;
              //if(additem_newitem_mfgDate!=null&&!additem_newitem_mfgDate.equals(""))
              if(!additem_newitem_mfgDate.equalsIgnoreCase("N.A"))
                    mfgDate=StringToDate.getStringToDate(additem_newitem_mfgDate);
              
              //if(additem_newitem_expDate!=null&&!additem_newitem_expDate.equals(""))
              if(!additem_newitem_expDate.equalsIgnoreCase("N.A"))
                    expDate=StringToDate.getStringToDate(additem_newitem_expDate);
              
              if(inventoryService.addItem(homeId,getRemoveitem_items_select().get(0),getAdditem_newitem_itemName().trim(),getAdditem_newitem_itemSpec().trim(),Float.parseFloat(getAdditem_newitem_itemQoh().trim()),getAdditem_newitem_itemUom(),Float.parseFloat(getAdditem_newitem_itemPrice().trim()),getAdditem_newitem_itemRemarks().trim(),mfgDate,expDate,userId))
             {
                 System.out.println("==inside INVENTORY ACTION:::additem():::item inserted==");
                 setMessage("Item  added successfully");
                return "additem-success";
             }
           else
           {
                System.out.println("==inside INVENTORY ACTION::additem():::item not inserted==");
                setMessage("Item  additoin failed");
                
                return "additem-failure";
           }

          }catch(Exception ae){
              ae.printStackTrace();
              setMessage("Exception Occured");
              return "additem-failure";}

        

    }  */
     private int ratCatNo;

    public int getRatCatNo() {
        return ratCatNo;
    }

    public void setRatCatNo(int ratCatNo) {
        this.ratCatNo = ratCatNo;
    }
    public String addItem1()
    {
        try{

             // String homeId=(String)getSession().get("homeid");
              //String homeId=ActionContext.getContext().getSession().get("homeid").toString();
              //System.out.println("------------------------------------------------> homeId in inventory = "+homeId);
            
            String userId=ActionContext.getContext().getSession().get("userid").toString();
             
              System.out.println("---prod sub category selected---- size---"+getRemoveitem_items_select()+"--mfg date--"+additem_newitem_mfgDate+"--expDate--"+additem_newitem_expDate);
              
              Date mfgDate=null,expDate=null;
              if(!additem_newitem_mfgDate.equalsIgnoreCase(""))
                    mfgDate=StringToDate.getStringToDate(additem_newitem_mfgDate);
              
              //if(additem_newitem_expDate!=null&&!additem_newitem_expDate.equals(""))
              if(!additem_newitem_expDate.equalsIgnoreCase(""))
                    expDate=StringToDate.getStringToDate(additem_newitem_expDate);
              
           int pcs=inventoryService.addItem1(getRemoveitem_items_select().get(0),getAdditem_newitem_itemName().trim(),getAdditem_newitem_itemSpec().trim(),getAdditem_newitem_itemUom(),Float.parseFloat(getAdditem_newitem_itemPrice().trim()),getAdditem_newitem_itemRemarks().trim(),mfgDate,expDate,userId);
              if(pcs==-2)
              {
                  System.out.println("==Item Already Exists==");
                  setMessage("Item Name="+getAdditem_newitem_itemName()+", With Specification="+getAdditem_newitem_itemSpec()+", of UOM="+getAdditem_newitem_itemUom()+" already exists");
                  return "additem-failure";
              }
             else if(pcs!=-1)
             {
                 if(pcs!=0)
                 {
                     //setIsRation(true);
                      setRatCatNo(pcs);
                             
                 
                 System.out.println("==inside INVENTORY ACTION:::additem():::item inserted==");
                 setMessage(getText("mess.succ.addItem", "OK", getAdditem_newitem_itemName()));
                 return "ration-success";
                 }
                 else
                 {
                      System.out.println("==inside INVENTORY ACTION:::additem():::item inserted==");
                      setMessage(getText("mess.succ.addItem", "OK", getAdditem_newitem_itemName()));
                      return "additem-success";
                 }
             }
           else
           {
                System.out.println("==inside INVENTORY ACTION::additem():::item not inserted==");
                setMessage(getText("mess.fail.additem", "ERROR", getAdditem_newitem_itemName()));
                return "additem-failure";
           }

          }catch(Exception ae){
              ae.printStackTrace();
              setMessage(getText("mess.exec"));
              return "additem-failure";}
    }
   
  
    /**
     gives the item details under selected category for view item
     */
    
    public String viewItemDetail()
    {
       
             try{
            String leafcat=request.getParameter("leafcat");
            
            System.out.println("leafcat-------->"+leafcat);
             int endIndex;
            
//            if(leafcat.startsWith("&#"))
//            {
//                 endIndex = leafcat.indexOf("&#40;");
//            }
//            else
//            {
//                endIndex = leafcat.indexOf('(');
//            }
             
             endIndex=leafcat.lastIndexOf("&#40;");
            System.out.println("leaf cat starts with &#"+leafcat.startsWith("&#")+"End Index----->"+endIndex);
            String selleafcat=leafcat.substring(0, endIndex);
            String homeId=ActionContext.getContext().getSession().get("homeid").toString();
            System.out.println("selected leaf category is::"+selleafcat+"--homeid--"+homeId);
            
            setLeafcat_select(selleafcat);
            List<ItemDto> l=inventoryService.getItemDetails_view(homeId,selleafcat);
             System.out.println("*******In Inv Action****list retrieved**********"+l);
            setItemDetails(l);
            
           
       
            return "viewItem-success";
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "viewItem-failure";
        }
    }
    
    //Enter QOH start for item start
    public String modifyItemDetail()
    {
        String homeid=ActionContext.getContext().getSession().get("homeid").toString();
        System.out.println("sub cat nums"+getRemoveitem_items_select()+"--homeid--"+homeid);
        List<ItemDto> l=inventoryService.getItemDetailsByCatList(homeid,getRemoveitem_items_select());
            setItemDetails(l);
            
            setRemoveitem_items_selectnames(inventoryService.getListCatNamesForCatNo(getRemoveitem_items_select()));
            
            return "viewItem-success";
        
    }
    public String modifyItem_qoh()
    {
         //System.out.println("list of item nums"+getModifyItem_itemNo());
        String homeId=ActionContext.getContext().getSession().get("homeid").toString();
        String userId=ActionContext.getContext().getSession().get("userid").toString();
        
        try
        {
            String msg=inventoryService.modifyItemDetails_qoh(getModifyItem_itemNo(),homeId,getModifyItem_qoh(),userId);
        if(msg!=null)
        {
                 setMessage(msg);
                 return "modifyItem-success";
        }
        else
        {
                 setMessage(getText("mess.fail.entQuan"));
                 return "modifyItem-failure"; 
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "modifyItem-failure"; 
        }
        
    }
    //Enter QOH for item ends
    /**
     gives the item  details under selected category for remove item
     */
    public String popSelectItem()
    {
            String homeid=ActionContext.getContext().getSession().get("homeid").toString();  
            System.out.println("selected sub cat for remove item is::"+getRemoveitem_items_select());
            List<ItemDto> removeItemDetails=new ArrayList<ItemDto>();
                if(getRemoveitem_items_select()!=null)  
                {
                removeItemDetails.addAll(inventoryService.getItemDetailsByCatList(homeid,getRemoveitem_items_select()));
                 setAddcat_prodcat_pop(inventoryService.populate_top_cat(getLoggedInhome()));
                 setRemoveitem_subcat_pop(inventoryService.popAllSubCat(getAddcat_prodcat_select()));
            
             setRemoveitem_items_selectnames(inventoryService.getListCatNamesForCatNo(getRemoveitem_items_select()));
             System.out.println("*******In Inv Action****list retrieved**********"+removeItemDetails);
                }
            setRemove_item_detail(removeItemDetails);
            
            return "viewItem-success";
        
    }
    
    
    //delete item start   
    /**
      deletes the list of item checked.on clicking delete submit
     */
    public String listDeleteItem()
    {
        List<ItemDto> deleteList=new LinkedList<ItemDto>();
        System.out.println("***In side listDeleteItems()***item checked***"+getItemChecked());
        String homeid=ActionContext.getContext().getSession().get("homeid").toString();
        deleteList.addAll(inventoryService.getItemDetails(homeid,getItemChecked()));
        
        setDeleteItemList(deleteList);

        
        return "deleteItem-confirm";
        
    }
    /**
     deletes the item on clicking of delete icon
     */
    public String getDeleteItem()
    {
        String itemNo=request.getParameter("itemChecked");
         System.out.println("***get delete items***item no***"+itemNo);
         List tList=new ArrayList();tList.add(itemNo);
        List<ItemDto> deleteList=new LinkedList<ItemDto>();
        
        ItemMaster im=inventoryService.getItemByItemNo(itemNo);
        
        String homeid=ActionContext.getContext().getSession().get("homeid").toString();
        System.out.println("***get delete items***item no***"+itemNo+"***itemName***"+im.getItemName()); 
        
        deleteList.addAll(inventoryService.getItemDetails(homeid,tList));
      //  deleteList.add(itemName);
        
        setDeleteItemList(deleteList);
        return "deleteItem-confirm";
       
    }
   /**
     removes list of items checked by user after confirmation.
   */
    public String removeItem()
    {
        try
        {
         System.out.println("==inside INVENTORY ACTION:: remove item===to bedeleted subcat nums are"+getDeleteItemNo());
         
         if(inventoryService.removeItemList(getDeleteItemNo()))
         {
              setMessage(getText("mess.succ.itemRem"));
              return "removeitem-success";
         }
         else
         {
             setMessage(getText("mess.fail.itemRem"));
             return "removeitem-failure";
         }  
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "removeitem-failure";
        }
   
    }
    public String cancelRemove()
    {
           setDeleteItemNo(null);
           setMessage(getText("mess.canItemRem"));
           return "removeitem-success";
        
    }
    //delete item ends
    /**
     * Item Management ends
     */
    
    
    public String execute() throws Exception {
        throw new UnsupportedOperationException("Not supported yet execute.");
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

  
  
      //add category getteres and setters
    public String getAddcat_newcat_itemType() {
        return addcat_newcat_itemType;
    }

    public void setAddcat_newcat_itemType(String addcat_newcat_itemType) {
        this.addcat_newcat_itemType = addcat_newcat_itemType;
    }

    public String getAddcat_newcat_name() {
        return addcat_newcat_name;
    }

    public void setAddcat_newcat_name(String addcat_newcat_name) {
        this.addcat_newcat_name = addcat_newcat_name;
    }

    public Map<Integer, String> getAddcat_prodcat_pop() {
        return addcat_prodcat_pop;
    }

    public void setAddcat_prodcat_pop(Map<Integer, String> addcat_prodcat_pop) {
        this.addcat_prodcat_pop = addcat_prodcat_pop;
    }

    

    public String getAddcat_prodcat_select() {
        return addcat_prodcat_select;
    }

    public void setAddcat_prodcat_select(String addcat_prodcat_select) {
        this.addcat_prodcat_select = addcat_prodcat_select;
    }

    public List getAddcat_subcat_pop() {
        return addcat_subcat_pop;
    }

    public void setAddcat_subcat_pop(List addcat_subcat_pop) {
        this.addcat_subcat_pop = addcat_subcat_pop;
    }

    public String getAddcat_subcat_select() {
        return addcat_subcat_select;
    }

    public void setAddcat_subcat_select(String addcat_subcat_select) {
        this.addcat_subcat_select = addcat_subcat_select;
    }

    public String getAddcat_prodcat_hidden() {
        return addcat_prodcat_hidden;
    }

    public void setAddcat_prodcat_hidden(String addcat_prodcat_hidden) {
        this.addcat_prodcat_hidden = addcat_prodcat_hidden;
    }

    
//remove cat gets&sets

   


    public String getRemovecat_category() {
        return removecat_category;
    }

    public void setRemovecat_category(String removecat_category) {
        this.removecat_category = removecat_category;
    }

   
    public List getRemovecat_sub_category() {
        return removecat_sub_category;
    }

    public void setRemovecat_sub_category(List removecat_sub_category) {
        this.removecat_sub_category = removecat_sub_category;
    }

    public List getRemovecat_subsubcat_pop() {
        return removecat_subsubcat_pop;
    }

    public void setRemovecat_subsubcat_pop(List removecat_subsubcat_pop) {
        this.removecat_subsubcat_pop = removecat_subsubcat_pop;
    }

    public String getRemovecat_subsubcat_select() {
        return removecat_subsubcat_select;
    }

    public void setRemovecat_subsubcat_select(String removecat_subsubcat_select) {
        this.removecat_subsubcat_select = removecat_subsubcat_select;
    }



   
    public String getRemovecat_subsel_cat() {
        return removecat_subsel_cat;
    }

    public void setRemovecat_subsel_cat(String removecat_subsel_cat) {
        this.removecat_subsel_cat = removecat_subsel_cat;
    }


    public String getRemovecat_subcat_select() {
        return removecat_subcat_select;
    }

    public void setRemovecat_subcat_select(String removecat_subcat_select) {
        this.removecat_subcat_select = removecat_subcat_select;
    }

    public List<String> getRemovecat_chk() {
        return removecat_chk;
    }

    public void setRemovecat_chk(List<String> removecat_chk) {
        this.removecat_chk = removecat_chk;
    }

   
     

    //add item get&set 's

    public String getAdditem_newitem_itemName() {
        return additem_newitem_itemName;
    }

    public void setAdditem_newitem_itemName(String additem_newitem_itemName) {
        this.additem_newitem_itemName = additem_newitem_itemName;
    }

    public String getAdditem_newitem_itemPrice() {
        return additem_newitem_itemPrice;
    }

    public void setAdditem_newitem_itemPrice(String additem_newitem_itemPrice) {
        this.additem_newitem_itemPrice = additem_newitem_itemPrice;
    }

    public String getAdditem_newitem_itemQoh() {
        return additem_newitem_itemQoh;
    }

    public void setAdditem_newitem_itemQoh(String additem_newitem_itemQoh) {
        this.additem_newitem_itemQoh = additem_newitem_itemQoh;
    }

    public String getAdditem_newitem_itemRemarks() {
        return additem_newitem_itemRemarks;
    }

    public void setAdditem_newitem_itemRemarks(String additem_newitem_itemRemarks) {
        this.additem_newitem_itemRemarks = additem_newitem_itemRemarks;
    }

    public String getAdditem_newitem_itemSpec() {
        return additem_newitem_itemSpec;
    }

    public void setAdditem_newitem_itemSpec(String additem_newitem_itemSpec) {
        this.additem_newitem_itemSpec = additem_newitem_itemSpec;
    }

    public String getAdditem_newitem_itemUom() {
        return additem_newitem_itemUom;
    }

    public void setAdditem_newitem_itemUom(String additem_newitem_itemUom) {
        this.additem_newitem_itemUom = additem_newitem_itemUom;
    }

    public String getAdditem_newitem_expDate() {
        return additem_newitem_expDate;
    }

    public void setAdditem_newitem_expDate(String additem_newitem_expDate) {
        this.additem_newitem_expDate = additem_newitem_expDate;
    }

    public String getAdditem_newitem_mfgDate() {
        return additem_newitem_mfgDate;
    }

    public void setAdditem_newitem_mfgDate(String additem_newitem_mfgDate) {
        this.additem_newitem_mfgDate = additem_newitem_mfgDate;
    }
    
   //remove item get's & set's

    public List<ProductCatSubcat> getRemove_cat_detail() {
        return remove_cat_detail;
    }

    public void setRemove_cat_detail(List<ProductCatSubcat> remove_cat_detail) {
        this.remove_cat_detail = remove_cat_detail;
    }

    public String getRemoveitem_subsubcat_select() {
        return removeitem_subsubcat_select;
    }

    public void setRemoveitem_subsubcat_select(String removeitem_subsubcat_select) {
        this.removeitem_subsubcat_select = removeitem_subsubcat_select;
    }

    public List<String> getRemoveitem_items_selectnames() {
        return removeitem_items_selectnames;
    }

    public void setRemoveitem_items_selectnames(List<String> removeitem_items_selectnames) {
        this.removeitem_items_selectnames = removeitem_items_selectnames;
    }
    public List getRemovecat_items_pop() {
        return removecat_items_pop;
    }

    public void setRemovecat_items_pop(List removecat_items_pop) {
        this.removecat_items_pop = removecat_items_pop;
    }

    public String getRemovecat_items_select() {
        return removecat_items_select;
    }

    public void setRemovecat_items_select(String removecat_items_select) {
        this.removecat_items_select = removecat_items_select;
    }

   

    public Map getRemoveitem_subcat_pop() {
        return removeitem_subcat_pop;
    }

    public void setRemoveitem_subcat_pop(Map removeitem_subcat_pop) {
        this.removeitem_subcat_pop = removeitem_subcat_pop;
    }

    public List<ItemDto> getRemove_item_detail() {
        return remove_item_detail;
    }

    public void setRemove_item_detail(List<ItemDto> remove_item_detail) {
        this.remove_item_detail = remove_item_detail;
    }

    

    public List<String> getItem_remove_check() {
        return item_remove_check;
    }

    public void setItem_remove_check(List<String> item_remove_check) {
        this.item_remove_check = item_remove_check;
    }

    public List<String> getItemChecked() {
        return itemChecked;
    }

    public void setItemChecked(List<String> itemChecked) {
        this.itemChecked = itemChecked;
    }
    
    
    //remove item sub

    public String[] getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String[] checkbox) {
        this.checkbox = checkbox;
    }

    public List<ItemDto> getDeleteItemList() {
        return deleteItemList;
    }

    public void setDeleteItemList(List<ItemDto> deleteItemList) {
        this.deleteItemList = deleteItemList;
    }

  

    public List<String> getDeleteItemNo() {
        return deleteItemNo;
    }

    public void setDeleteItemNo(List<String> deleteItemNo) {
        this.deleteItemNo = deleteItemNo;
    }

    public List<String> getRemoveitem_items_select() {
        return removeitem_items_select;
    }

    public void setRemoveitem_items_select(List<String> removeitem_items_select) {
        this.removeitem_items_select = removeitem_items_select;
    }

    public Map<Integer, String> getTopcatgory() {
        return topcatgory;
    }

    public void setTopcatgory(Map<Integer, String> topcatgory) {
        this.topcatgory = topcatgory;
    }

   
    
    //view item

    public List<ItemDto> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<ItemDto> itemDetails) {
        this.itemDetails = itemDetails;
    }
   

    public String getLeafcat_select() {
        return leafcat_select;
    }

    public void setLeafcat_select(String leafcat_select) {
        this.leafcat_select = leafcat_select;
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }
    
    
    
    //donate item

    public List getPop_items() {
        return pop_items;
    }

    public void setPop_items(List pop_items) {
        this.pop_items = pop_items;
    }

    public String getDonation_date() {
        return donation_date;
    }

    public void setDonation_date(String donation_date) {
        this.donation_date = donation_date;
    }

   

    public String getDonation_from() {
        return donation_from;
    }

    public void setDonation_from(String donation_from) {
        this.donation_from = donation_from;
    }

     public String getDonation_remarks() {
        return donation_remarks;
    }

    public void setDonation_remarks(String donation_remarks) {
        this.donation_remarks = donation_remarks;
    }

    public List<String> getDonation_item_chk() {
        return donation_item_chk;
    }

    public void setDonation_item_chk(List<String> donation_item_chk) {
        this.donation_item_chk = donation_item_chk;
    }

    public Map<String, String> getDonation_item_quantity() {
        return donation_item_quantity;
    }

    public void setDonation_item_quantity(Map<String, String> donation_item_quantity) {
        this.donation_item_quantity = donation_item_quantity;
    }

    public Map<String, String> getDonation_item_remarks() {
        return donation_item_remarks;
    }

    public void setDonation_item_remarks(Map<String, String> donation_item_remarks) {
        this.donation_item_remarks = donation_item_remarks;
    }
    
    
    
    //receipt register 

    public List<String> getReceiptitemChecked() {
        return receiptitemChecked;
    }

    public void setReceiptitemChecked(List<String> receiptitemChecked) {
        this.receiptitemChecked = receiptitemChecked;
    }

    public Map<String, String> getReceiptitem_qoh() {
        return receiptitem_qoh;
    }

    public void setReceiptitem_qoh(Map<String, String> receiptitem_qoh) {
        this.receiptitem_qoh = receiptitem_qoh;
    }

    public Map<String, String> getReceiptitem_remarks() {
        return receiptitem_remarks;
    }

    public void setReceiptitem_remarks(Map<String, String> receiptitem_remarks) {
        this.receiptitem_remarks = receiptitem_remarks;
    }

    public String getReceipt_date() {
        return receipt_date;
    }

    public void setReceipt_date(String receipt_date) {
        this.receipt_date = receipt_date;
    }

   

    public String getReceipt_from() {
        return receipt_from;
    }

    public void setReceipt_from(String receipt_from) {
        this.receipt_from = receipt_from;
    }

   

    public String getReceipt_remarks() {
        return receipt_remarks;
    }

    public void setReceipt_remarks(String receipt_remarks) {
        this.receipt_remarks = receipt_remarks;
    }

    public List<String> getItemnumChecked() {
        return itemnumChecked;
    }

    public void setItemnumChecked(List<String> itemnumChecked) {
        this.itemnumChecked = itemnumChecked;
    }

    public List<String> getItemCheckedIndex() {
        return itemCheckedIndex;
    }

    public void setItemCheckedIndex(List<String> itemCheckedIndex) {
        this.itemCheckedIndex = itemCheckedIndex;
    }

    private String invoice_no;

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        System.out.println("set inv no------------->"+invoice_no);
        this.invoice_no = invoice_no;
    }

    private String invoice_date;

    public String getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(String invoice_date) {
        this.invoice_date = invoice_date;
    }
    private String receive_from_radio;

    public String getReceive_from_radio() {
        return receive_from_radio;
    }

    public void setReceive_from_radio(String receive_from_radio) {
        this.receive_from_radio = receive_from_radio;
    }
    private String ReceiveOrPurchase;

    public String getReceiveOrPurchase() {
        return ReceiveOrPurchase;
    }

    public void setReceiveOrPurchase(String ReceiveOrPurchase) {
        this.ReceiveOrPurchase = ReceiveOrPurchase;
    }
    

    //category items
    private String select_category;
    private Map<Integer,String> topcatgory;
     //ADD CATEGORY ITEMS
    private Map<Integer,String> addcat_prodcat_pop;
    private List addcat_subcat_pop=new ArrayList();

    private String addcat_prodcat_select;
    private String addcat_subcat_select;
    private String addcat_newcat_name;
    private String addcat_newcat_itemType;
    
    private String addcat_prodcat_hidden;
   
    //REMOVE CATEGORY ITEMS
    private String removecat_category;
    private String removecat_subsel_cat;
    //private String removecat_subsel_subsel_cat;
    private List removecat_sub_category=new ArrayList();
    private List removecat_subsubcat_pop=new ArrayList();
    //private List removecat_sub_sub_category=new ArrayList();
    private String removecat_subcat_select;
    private String removecat_subsubcat_select;
    private List<ProductCatSubcat> remove_cat_detail;
    private List<String> removecat_chk;
    


    //add item
    //private String additem_subcat_select;
    private String  additem_newitem_itemName;
    private String  additem_newitem_itemSpec;
    private String additem_newitem_itemQoh;
    private String additem_newitem_itemUom;
    private String additem_newitem_itemPrice;
    private String additem_newitem_itemRemarks;
    private String additem_subsubcat_select;
    private String additem_newitem_mfgDate;
    private String additem_newitem_expDate;

    //remove item
    private String removeitem_subsubcat_select;
    private List removecat_items_pop;
    private String removecat_items_select;
    private List<String> removeitem_items_select;
    private Map<String,String> removeitem_subcat_pop;
    private List<ItemDto> remove_item_detail;
    private List<String> item_remove_check;
    private List<String> itemChecked=new ArrayList<String>();
    private List<String> deleteItemNo=new ArrayList<String>();
    private List<String> removeitem_items_selectnames;
    
    
    //remove item sub
    private String[] checkbox;
    private List<ItemDto> deleteItemList=new ArrayList<ItemDto>();
      
     
    

    //view item
    private String leafcat_select;
    private List<ItemDto> itemDetails;
    private TreeNode treeNode;

    //donation item
    private List pop_items=new ArrayList();
    private String donation_date;
    private String donation_from;
    private String donation_remarks;
    private List<String> donation_item_chk;
    private Map<String,String> donation_item_quantity;
    private Map<String,String> donation_item_remarks;
    
    private String viewDonation_fromDate;
    private String viewDonation_toDate;
    
    private List<TransDto> transDtoList=null;
    
    
    
    //receipt item
    private List<String> receiptitemChecked;
    private Map<String,String> receiptitem_qoh;
    private Map<String,String> receiptitem_remarks;
    
    private String   receipt_date;
    private String   receipt_from;
    private String   receipt_remarks;
    private List<String>  itemnumChecked;
    
    private List<String> itemCheckedIndex;
   
    private String viewReceipt_fromDate;
    private String viewReceipt_toDate;
    
    //modify Item properties
    
    protected List<String> modifyItem_itemNo;

    /**
     * Get the value of modifyItem_itemNo
     *
     * @return the value of modifyItem_itemNo
     */
    public List<String> getModifyItem_itemNo() {
        return modifyItem_itemNo;
    }

    /**
     * Set the value of modifyItem_itemNo
     *
     * @param modifyItem_itemNo new value of modifyItem_itemNo
     */
    public void setModifyItem_itemNo(List<String> modifyItem_itemNo) {
        this.modifyItem_itemNo = modifyItem_itemNo;
    }

    
    private Map<String,String> modifyItem_itemName;

    /**
     * Get the value of modifyItem_itemName
     *
     * @return the value of modifyItem_itemName
     */
    public Map<String,String> getModifyItem_itemName() {
        return modifyItem_itemName;
    }

    /**
     * Set the value of modifyItem_itemName
     *
     * @param modifyItem_itemName new value of modifyItem_itemName
     */
    public void setModifyItem_itemName(Map<String,String> modifyItem_itemName) {
        this.modifyItem_itemName = modifyItem_itemName;
    }

    protected Map<String,String> modifyItem_itemSpec;

    /**
     * Get the value of modifyItem_itemSpec
     *
     * @return the value of modifyItem_itemSpec
     */
    public Map<String,String> getModifyItem_itemSpec() {
        return modifyItem_itemSpec;
    }

    /**
     * Set the value of modifyItem_itemSpec
     *
     * @param modifyItem_itemSpec new value of modifyItem_itemSpec
     */
    public void setModifyItem_itemSpec(Map<String,String> modifyItem_itemSpec) {
        this.modifyItem_itemSpec = modifyItem_itemSpec;
    }

    private Map<String,String>  modifyItem_qoh;

    public Map<String, String> getModifyItem_qoh() {
        return modifyItem_qoh;
    }

    public void setModifyItem_qoh(Map<String, String> modifyItem_qoh) {
        this.modifyItem_qoh = modifyItem_qoh;
    }

    

  
    protected Map<String,String> modifyItem_remarks;

    /**
     * Get the value of modifyItem_remarks
     *
     * @return the value of modifyItem_remarks
     */
    public Map<String,String> getModifyItem_remarks() {
        return modifyItem_remarks;
    }

    /**
     * Set the value of modifyItem_remarks
     *
     * @param modifyItem_remarks new value of modifyItem_remarks
     */
    public void setModifyItem_remarks(Map<String,String> modifyItem_remarks) {
        this.modifyItem_remarks = modifyItem_remarks;
    }

    protected Map<String,String> modifyItem_mfgDate;

    /**
     * Get the value of modifyItem_mfgDate
     *
     * @return the value of modifyItem_mfgDate
     */
    public Map<String,String> getModifyItem_mfgDate() {
        return modifyItem_mfgDate;
    }

    /**
     * Set the value of modifyItem_mfgDate
     *
     * @param modifyItem_mfgDate new value of modifyItem_mfgDate
     */
    public void setModifyItem_mfgDate(Map<String,String> modifyItem_mfgDate) {
        this.modifyItem_mfgDate = modifyItem_mfgDate;
    }

    protected Map<String,String> modifyItem_expDate;

    /**
     * Get the value of modifyItem_expDate
     *
     * @return the value of modifyItem_expDate
     */
    public Map<String,String> getModifyItem_expDate() {
        return modifyItem_expDate;
    }

    /**
     * Set the value of modifyItem_expDate
     *
     * @param modifyItem_expDate new value of modifyItem_expDate
     */
    public void setModifyItem_expDate(Map<String,String> modifyItem_expDate) {
        this.modifyItem_expDate = modifyItem_expDate;
    }

    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

    public void setServletResponse(HttpServletResponse hsr) {
        response=hsr;
    }
     public Map getSession() {
        return session;
    }

     public void setSession(Map session) {
        this.session = session;
    }

    /*public CatTree getRetList() {
        return retList;
    }

    public void setRetList(CatTree retList) {
        this.retList = retList;
    } ---------->commented afer deleting bean package */
   //enter top category
    private String newtopcat_name;

    /**
     * Get the value of newtopcat_name
     *
     * @return the value of newtopcat_name
     */
    public String getNewtopcat_name() {
        return newtopcat_name;
    }

    /**
     * Set the value of newtopcat_name
     *
     * @param newtopcat_name new value of newtopcat_name
     */
    public void setNewtopcat_name(String newtopcat_name) {
        this.newtopcat_name = newtopcat_name;
    }
    private String newtopcat_type;

    /**
     * Get the value of newtopcat_type
     *
     * @return the value of newtopcat_type
     */
    public String getNewtopcat_type() {
        return newtopcat_type;
    }

    /**
     * Set the value of newtopcat_type
     *
     * @param newtopcat_type new value of newtopcat_type
     */
    public void setNewtopcat_type(String newtopcat_type) {
        this.newtopcat_type = newtopcat_type;
    }

    //Issue Register properties
    private String issue_date;

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    private String issue_to_radio;

    public String getIssue_to_radio() {
        return issue_to_radio;
    }

    public void setIssue_to_radio(String issue_to_radio) {
        this.issue_to_radio = issue_to_radio;
    }
    private String issue_remarks;

    public String getIssue_remarks() {
        return issue_remarks;
    }

    public void setIssue_remarks(String issue_remarks) {
        this.issue_remarks = issue_remarks;
    }

    private List list_stake_holders;

    public List getList_stake_holders() {
        return list_stake_holders;
    }

    public void setList_stake_holders(List list_stake_holders) {
        this.list_stake_holders = list_stake_holders;
    }
    private List list_child_idnames;

    public List getList_child_idnames() {
        return list_child_idnames;
    }

    public void setList_child_idnames(List list_child_idnames) {
        this.list_child_idnames = list_child_idnames;
    }

    private List issue_item_chk;

    public List getIssue_item_chk() {
        return issue_item_chk;
    }

    public void setIssue_item_chk(List issue_item_chk) {
        this.issue_item_chk = issue_item_chk;
    }
    
    private Map<String,String> issue_item_quantity;

    public Map<String, String> getIssue_item_quantity() {
        return issue_item_quantity;
    }

    public void setIssue_item_quantity(Map<String, String> issue_item_quantity) {
        this.issue_item_quantity = issue_item_quantity;
    }
    
    
    private Map<String,String> issue_item_remarks;

    public Map<String, String> getIssue_item_remarks() {
        return issue_item_remarks;
    }

    public void setIssue_item_remarks(Map<String, String> issue_item_remarks) {
        this.issue_item_remarks = issue_item_remarks;
    }
    
    private List select_childs_ids;

    public List getSelect_childs_ids() {
        return select_childs_ids;
    }

    public void setSelect_childs_ids(List select_childs_ids) {
        this.select_childs_ids = select_childs_ids;
    }
    
    private List select_stake_holders;

    public List getSelect_stake_holders() {
        return select_stake_holders;
    }

    public void setSelect_stake_holders(List select_stake_holders) {
        this.select_stake_holders = select_stake_holders;
    }
    
    //view Issue
    private String viewIssue_fromDate;
    private String viewIssue_toDate;

    public String getViewIssue_fromDate() {
        return viewIssue_fromDate;
    }

    public void setViewIssue_fromDate(String viewIssue_fromDate) {
        this.viewIssue_fromDate = viewIssue_fromDate;
    }

    public String getViewIssue_toDate() {
        return viewIssue_toDate;
    }

    public void setViewIssue_toDate(String viewIssue_toDate) {
        this.viewIssue_toDate = viewIssue_toDate;
    }
    
    
    
    //Diet Chart
    private List<BOMItemDto> dietChart_items;

    public List<BOMItemDto> getDietChart_items() {
        return dietChart_items;
    }

    public void setDietChart_items(List<BOMItemDto> dietChart_items) {
        this.dietChart_items = dietChart_items;
    }
    //BOM items
    
    private List<BOMItemDto> bomItem;

    public List<BOMItemDto> getBomItem() {
        return bomItem;
    }

    public void setBomItem(List<BOMItemDto> bomItem) {
        this.bomItem = bomItem;
    }

   
    
    private Map<String,String> bom_quanntity;

    public Map<String, String> getBom_quanntity() {
        return bom_quanntity;
    }

    public void setBom_quanntity(Map<String, String> bom_quanntity) {
        this.bom_quanntity = bom_quanntity;
    }

   
    private List<String> bomItemNo;

    public List<String> getBomItemNo() {
        return bomItemNo;
    }

    public void setBomItemNo(List<String> bomItemNo) {
        this.bomItemNo = bomItemNo;
    }

   //DietIsssue Register
    
    private String dietIssue_date;

    public String getDietIssue_date() {
        return dietIssue_date;
    }

    public void setDietIssue_date(String dietIssue_date) {
        this.dietIssue_date = dietIssue_date;
    }

    private String dietReg_srChilds;

    public String getDietReg_srChilds() {
        return dietReg_srChilds;
    }

    public void setDietReg_srChilds(String dietReg_srChilds) {
        this.dietReg_srChilds = dietReg_srChilds;
    }
    private String dietReg_jrChilds;

    public String getDietReg_jrChilds() {
        return dietReg_jrChilds;
    }

    public void setDietReg_jrChilds(String dietReg_jrChilds) {
        this.dietReg_jrChilds = dietReg_jrChilds;
    }
    private List<String> diet_itemNo;

    public List<String> getDiet_itemNo() {
        return diet_itemNo;
    }

    public void setDiet_itemNo(List<String> diet_itemNo) {
        this.diet_itemNo = diet_itemNo;
    }

    //Tailoring Issue
    private String tailor_issue_date;

    public String getTailor_issue_date() {
        return tailor_issue_date;
    }

    public void setTailor_issue_date(String tailor_issue_date) {
        this.tailor_issue_date = tailor_issue_date;
    }

    private String tailor_issue_letterno;

    public String getTailor_issue_letterno() {
        return tailor_issue_letterno;
    }

    public void setTailor_issue_letterno(String tailor_issue_letterno) {
        this.tailor_issue_letterno = tailor_issue_letterno;
    }

    private List tail_item_checked;

    public List getTail_item_checked() {
        return tail_item_checked;
    }

    public void setTail_item_checked(List tail_item_checked) {
        this.tail_item_checked = tail_item_checked;
    }

    private List tail_rawcloth_list;

    public List getTail_rawcloth_list() {
        return tail_rawcloth_list;
    }

    public void setTail_rawcloth_list(List tail_rawcloth_list) {
        this.tail_rawcloth_list = tail_rawcloth_list;
    }

    
    private Map<String, String> tail_rawcloth_name;

    public Map<String, String> getTail_rawcloth_name() {
        return tail_rawcloth_name;
    }

    public void setTail_rawcloth_name(Map<String, String> tail_rawcloth_name) {
        this.tail_rawcloth_name = tail_rawcloth_name;
    }

    private Map<String, String> tail_rawcloth_quan;

    public Map<String, String> getTail_rawcloth_quan() {
        return tail_rawcloth_quan;
    }

    public void setTail_rawcloth_quan(Map<String, String> tail_rawcloth_quan) {
        this.tail_rawcloth_quan = tail_rawcloth_quan;
    }

    private Map<String, String> tail_rawcloth_remarks;

    public Map<String, String> getTail_rawcloth_remarks() {
        return tail_rawcloth_remarks;
    }

    public void setTail_rawcloth_remarks(Map<String, String> tail_rawcloth_remarks) {
        this.tail_rawcloth_remarks = tail_rawcloth_remarks;
    }

    private List<ItemDto> tailorRawClothItems;

    public List<ItemDto> getTailorRawClothItems() {
        return tailorRawClothItems;
    }

    public void setTailorRawClothItems(List<ItemDto> tailorRawClothItems) {
        this.tailorRawClothItems = tailorRawClothItems;
    }
    private String tailor_issue_address;

    public String getTailor_issue_address() {
        return tailor_issue_address;
    }

    public void setTailor_issue_address(String tailor_issue_address) {
        this.tailor_issue_address = tailor_issue_address;
    }
    private Date getTailor_issue_letterdate;

    public Date getGetTailor_issue_letterdate() {
        return getTailor_issue_letterdate;
    }

    public void setGetTailor_issue_letterdate(Date getTailor_issue_letterdate) {
        this.getTailor_issue_letterdate = getTailor_issue_letterdate;
    }
// Tailor receive register
    private List<ItemDto> tailorStichClothItems;

    public List<ItemDto> getTailorStichClothItems() {
        return tailorStichClothItems;
    }

    public void setTailorStichClothItems(List<ItemDto> tailorStichClothItems) {
        this.tailorStichClothItems = tailorStichClothItems;
    }
    
    private String tailor_receive_date;

    public String getTailor_receive_date() {
        return tailor_receive_date;
    }

    public void setTailor_receive_date(String tailor_receive_date) {
        this.tailor_receive_date = tailor_receive_date;
    }

    private String tailor_receive_letterno;

    public String getTailor_receive_letterno() {
        return tailor_receive_letterno;
    }

    public void setTailor_receive_letterno(String tailor_receive_letterno) {
        this.tailor_receive_letterno = tailor_receive_letterno;
    }

    private String tailor_receive_address;

    public String getTailor_receive_address() {
        return tailor_receive_address;
    }

    public void setTailor_receive_address(String tailor_receive_address) {
        this.tailor_receive_address = tailor_receive_address;
    }

    private List<String> tail_itemrecv_checked;

    public List<String> getTail_itemrecv_checked() {
        return tail_itemrecv_checked;
    }

    public void setTail_itemrecv_checked(List<String> tail_itemrecv_checked) {
        this.tail_itemrecv_checked = tail_itemrecv_checked;
    }

    private Map<String, String> tail_stichcloth_quan;

    public Map<String, String> getTail_stichcloth_quan() {
        return tail_stichcloth_quan;
    }

    public void setTail_stichcloth_quan(Map<String, String> tail_stichcloth_quan) {
        this.tail_stichcloth_quan = tail_stichcloth_quan;
    }

    private Map<String, String> tail_stichcloth_remarks;

    public Map<String, String> getTail_stichcloth_remarks() {
        return tail_stichcloth_remarks;
    }

    public void setTail_stichcloth_remarks(Map<String, String> tail_stichcloth_remarks) {
        this.tail_stichcloth_remarks = tail_stichcloth_remarks;
    }
    
    private Map<Integer,Object> addcat_prodcat_pop_object;

    public Map<Integer, Object> getAddcat_prodcat_pop_object() {
        return addcat_prodcat_pop_object;
    }

    public void setAddcat_prodcat_pop_object(Map<Integer,Object> addcat_prodcat_pop_object) {
        this.addcat_prodcat_pop_object = addcat_prodcat_pop_object;
    }

    //view donation start
    
    public String getViewDonation_fromDate() {
        return viewDonation_fromDate;
    }

    public void setViewDonation_fromDate(String viewDonation_fromDate) {
        this.viewDonation_fromDate = viewDonation_fromDate;
    }

    public String getViewDonation_toDate() {
        return viewDonation_toDate;
    }

    public void setViewDonation_toDate(String viewDonation_toDate) {
        this.viewDonation_toDate = viewDonation_toDate;
    }

    public List<TransDto> getTransDtoList() {
        return transDtoList;
    }

    public void setTransDtoList(List<TransDto> transDtoList) {
        this.transDtoList = transDtoList;
    }

    

    
    
    
    
    //view donation ends
    //view receipt starts
    public String getViewReceipt_fromDate() {
        return viewReceipt_fromDate;
    }

    public void setViewReceipt_fromDate(String viewReceipt_fromDate) {
        this.viewReceipt_fromDate = viewReceipt_fromDate;
    }

    public String getViewReceipt_toDate() {
        return viewReceipt_toDate;
    }

    public void setViewReceipt_toDate(String viewReceipt_toDate) {
        this.viewReceipt_toDate = viewReceipt_toDate;
    }
    
    //view receipt ends
    //view tailoring start
    private String viewTail_fromDate;

    public String getViewTail_fromDate() {
        return viewTail_fromDate;
    }

    public void setViewTail_fromDate(String viewTail_fromDate) {
        this.viewTail_fromDate = viewTail_fromDate;
    }

    private String viewTail_toDate;

    public String getViewTail_toDate() {
        return viewTail_toDate;
    }

    public void setViewTail_toDate(String viewTail_toDate) {
        this.viewTail_toDate = viewTail_toDate;
    }

    
    
    
    //view tailoring ends
 
    //success or failure message

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    //view category
    // CatTree retList; ---------->commented afer deleting bean package


    //common for all methods
     private HttpServletRequest request;
     private HttpServletResponse response;
     private Map session;
         //spring DI
     
    // private Logger log=Logger.getLogger(InventoryAction.class);
     private String Item;
     private String message;
   
     public String modifyItem()
    {
        
        System.out.println("list of item nums"+getModifyItem_itemNo());
        
        try
        {
        if(inventoryService.modifyItemDetails(getModifyItem_itemNo(),getModifyItem_itemName(),getModifyItem_itemSpec(), getModifyItem_remarks(), getModifyItem_mfgDate(), getModifyItem_expDate()))
        {
                 setMessage(getText("mess.succ.modItem"));
                 return "modifyItem-success";
        }
        else
        {
                 setMessage(getText("mess.fail.modItem"));
                 return "modifyItem-failure"; 
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setMessage(getText("mess.exec"));
            return "modifyItem-failure"; 
        }
    }
     
       private String[] nameMenu;
     private String[] menuType;

    public String[] getMenuType() {
        return menuType;
    }

    public void setMenuType(String[] menuType) {
        this.menuType = menuType;
    }

    public String[] getNameMenu() {
        return nameMenu;
    }

    public void setNameMenu(String[] nameMenu) {
        this.nameMenu = nameMenu;
    }
     
     
     
     public String saveMenuItem()
     {
         
         String homeId=getLoggedInhome();
         String msg=inventoryService.addMenuItem(nameMenu,menuType,homeId);
         if(msg==null)
         {
             setMessage("Items not saved.Enter all names and types");
             return ERROR;    
         }
         else
         {
         if(msg.equals("success"))
         {
             setMessage("Menu Items added successfully");
             return SUCCESS;
         }
         else
         {
             setMessage("Addition of Menu Items failed");
             return ERROR;
         }
         }
     }
     public List<MenuMaster> break_list=new ArrayList<MenuMaster>();
     public List<MenuMaster> lunch_list=new ArrayList<MenuMaster>();
     public List<MenuMaster> snacks_list=new ArrayList<MenuMaster>();
     public List<MenuMaster> dinner_list=new ArrayList<MenuMaster>();

    public List<MenuMaster> getBreak_list() {
        return break_list;
    }

    public void setBreak_list(List<MenuMaster> break_list) {
        this.break_list = break_list;
    }

    public List<MenuMaster> getDinner_list() {
        return dinner_list;
    }

    public void setDinner_list(List<MenuMaster> dinner_list) {
        this.dinner_list = dinner_list;
    }

    public List<MenuMaster> getLunch_list() {
        return lunch_list;
    }

    public void setLunch_list(List<MenuMaster> lunch_list) {
        this.lunch_list = lunch_list;
    }

    public List<MenuMaster> getSnacks_list() {
        return snacks_list;
    }

    public void setSnacks_list(List<MenuMaster> snacks_list) {
        this.snacks_list = snacks_list;
    }
     
    private int numChilds;

    public int getNumChilds() {
        return numChilds;
    }

    public void setNumChilds(int numChilds) {
        this.numChilds = numChilds;
    }

     
     
     
     public String populateMenu()
     {
         String homeId=getLoggedInhome();
         System.out.println("populateMenu()----homeId--->"+homeId);
         List<MenuMaster> item_list=inventoryService.getMenuMap(homeId);
         System.out.println("populateMenu()----item list--->"+item_list);
         if(item_list!=null)
         {
         for (int i = 0; i < item_list.size(); i++) {
             MenuMaster mm = item_list.get(i);
             
             if(mm.getType().equals("Break Fast"))
             {
                 break_list.add(mm);
             }
             else if(mm.getType().equals("Lunch"))
             {
                 lunch_list.add(mm);
             }
             else if(mm.getType().equals("Snacks"))
             {
                 snacks_list.add(mm);
             }
             else if(mm.getType().equals("Dinner"))
             {
                 dinner_list.add(mm);
             }
             
         }
         
         
             int numChilds=(int)inventoryService.numChild_menu(homeId);
           
           setNumChilds(numChilds);
         return  SUCCESS;
         }
         else
         {
             return ERROR;
         }
         
         
     }
     private List<String> bitem_check=null;
     private List<String> litem_check=null;
     private List<String> sitem_check=null;
     private List<String> ditem_check=null;
     
     private String break_qty;
     private String lunch_qty;
     private String snacks_qty;
     private String dinner_qty;

    public List getBitem_check() {
        return bitem_check;
    }

    public void setBitem_check(List bitem_check) {
        this.bitem_check = bitem_check;
    }

    public List getDitem_check() {
        return ditem_check;
    }

    public void setDitem_check(List ditem_check) {
        this.ditem_check = ditem_check;
    }

    public List getLitem_check() {
        return litem_check;
    }

    public void setLitem_check(List litem_check) {
        this.litem_check = litem_check;
    }

    public List getSitem_check() {
        return sitem_check;
    }

    public void setSitem_check(List sitem_check) {
        this.sitem_check = sitem_check;
    }

    

    public String getBreak_qty() {
        return break_qty;
    }

    public void setBreak_qty(String break_qty) {
        this.break_qty = break_qty;
    }

    public String getDinner_qty() {
        return dinner_qty;
    }

    public void setDinner_qty(String dinner_qty) {
        this.dinner_qty = dinner_qty;
    }

    public String getLunch_qty() {
        return lunch_qty;
    }

    public void setLunch_qty(String lunch_qty) {
        this.lunch_qty = lunch_qty;
    }

    public String getSnacks_qty() {
        return snacks_qty;
    }

    public void setSnacks_qty(String snacks_qty) {
        this.snacks_qty = snacks_qty;
    }

   
     
     private String menu_date;

    public String getMenu_date() {
        return menu_date;
    }

    public void setMenu_date(String menu_date) {
        this.menu_date = menu_date;
    }

    
     
     
     
     public String saveMenuDetail()
     {
         try
         {
      //    System.out.println("BREAK QTY--->"+bitem_check+"==SNACKS QTY------------->"+sitem_check.size()+"---SIZE---->"+sitem_check.get(0));
             if(menu_date.equals(""))
             {
                 setMessage("Menu Date can not be Empty");
                 return ERROR;
             }
             else
             {
          String msg=inventoryService.saveMenuDetail(StringToDate.getStringToDate(menu_date),bitem_check,litem_check,sitem_check,ditem_check,break_qty,lunch_qty,snacks_qty,dinner_qty);
          
           if(msg.equals("err_numChild"))
           {
               setMessage("Number of Childs can not be Empty");
               return ERROR;
           }
            
               setMessage("Menu Details Saved Sucessfully");
               return msg;
          
         
             }
         }
        
         catch(Exception e)
         {
             e.printStackTrace();
             return ERROR;
         }
         
     }
     private String viewMenu_date;
     public String getViewMenu_date() {
        return viewMenu_date;
    }

    public void setViewMenu_date(String viewMenu_date) {
        this.viewMenu_date = viewMenu_date;
    }
    
    private List<MenuDetail> mdList;

    public List<MenuDetail> getMdList() {
        return mdList;
    }

    public void setMdList(List<MenuDetail> mdList) {
        this.mdList = mdList;
    }
    
    
    public String viewMenu()
     {
         if(!viewMenu_date.equals(""))
         {
                 List<MenuDetail> mdlist=inventoryService.viewMenuDetail(viewMenu_date,getLoggedInhome()); 
         
                 setMdList(mdlist);
         }
                 return SUCCESS;
    }
    
     
    private String newItemNo;

    public String getNewItemNo() {
        return newItemNo;
    }

    public void setNewItemNo(String newItemNo) {
        this.newItemNo = newItemNo;
    }
    
    private String newItem_Bom;

    public String getNewItem_Bom() {
        return newItem_Bom;
    }

    public void setNewItem_Bom(String newItem_Bom) {
        this.newItem_Bom = newItem_Bom;
    }
    
    
    public String saveSingleBOM()
    {
           boolean save=inventoryService.saveSinBOM(Integer.parseInt(getNewItemNo()),Double.parseDouble(getNewItem_Bom()),getLoggedInhome(),(String)getSession().get("userid"),CurrentDateProvider.getCurrentDate());
           if(save)
           {
               setMessage("BOM(Scale) added sucessfully");
               return SUCCESS;
           }
           else
           {
               return  ERROR;
           }
    }
    
    private String trRepMon;
    private String trRepYear;
    private String trType;

    public String getTrRepMon() {
        return trRepMon;
    }

    public void setTrRepMon(String trRepMon) {
        this.trRepMon = trRepMon;
    }

    public String getTrRepYear() {
        return trRepYear;
    }

    public void setTrRepYear(String trRepYear) {
        this.trRepYear = trRepYear;
    }

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType;
    }
    
    private List<RepTransDTO> repTransList;
    public List<RepTransDTO> getRepTransList() {
        return repTransList;
    }

    public void setRepTransList(List<RepTransDTO> repTransList) {
        this.repTransList = repTransList;
    }

    
    public String repTransJSON()
    {
        try{
           List<RepTransDTO> repDto= inventoryService.getRepTransJSON(getLoggedInhome(),getTrRepMon(),getTrRepYear(),getTrType());
           
           setRepTransList(repDto);
           
            return SUCCESS;
        }catch(Exception e)
        {
            e.printStackTrace();
            return ERROR;
        }
           
          
    }
     /* public String popTailorIssue()
    {
        
       List<ItemDto> rawClothItems=inventoryService.populate_rawCloth_items();
       
       setTailorRawClothItems(rawClothItems);
       
       
       return SUCCESS;
       
       
       
    }*/
 /*  public String popItem()
    {
        System.out.println("==inside INVENTORY ACTION:: pop item===");
        //List l=new ArrayList();
        try{
            if(getRemoveitem_subsubcat_select()!=null)
            {
                System.out.println("==inside INVENTORY ACTION::poopulating item=="+getRemoveitem_subsubcat_select());
                List l=inventoryService.populate_item(getRemoveitem_subsubcat_select());
                System.out.println("==inside INVENTORY ACTION::poopulated subcat=="+getRemoveitem_subsubcat_select());
                System.out.println("***list retrieved***"+l);
                setRemovecat_items_pop(l);
            }




       // addcat_sub_category=inventoryService.populate_sub_cat(getAddcat_category());
        // System.out.println("==inside INVENTORY ACTION::***subcat list size**"+addcat_prodcat_select.size()+"***item1**"+addcat_sub_category.get(0)+"***item2**"+addcat_sub_category.get(1));
        }catch(Exception ae)
        {
           ae.printStackTrace();
        }
       // session.put("addCat_subCatItems", getAddcat_subcat_pop());
        
      //  request.getSession().setAttribute("removeCat_popItems", getRemovecat_items_pop());
        return "popItem";

    }
     
     */

}