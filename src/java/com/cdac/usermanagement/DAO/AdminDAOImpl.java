package com.cdac.usermanagement.DAO;
//import com.cdac.commons.persistance.HibernateFactory;

import com.cdac.exceptions.AppException;
import com.cdac.usermanagement.ORM.ChildDetails;
import com.cdac.usermanagement.ORM.CwcDetail;
import com.cdac.usermanagement.ORM.CwcDetailPK;
import com.cdac.usermanagement.ORM.CwcHome;
import com.cdac.usermanagement.ORM.CwcHop;
import com.cdac.usermanagement.ORM.CwcMinutes;
import com.cdac.usermanagement.ORM.CwcSir;
import com.cdac.usermanagement.ORM.CwcSo;
import com.cdac.usermanagement.ORM.CwcUppi;
import com.cdac.usermanagement.ORM.DistrictMaster;
import com.cdac.usermanagement.ORM.FcChildTemp;
import com.cdac.usermanagement.ORM.FcForm;
import com.cdac.usermanagement.ORM.FcForm20;
import com.cdac.usermanagement.ORM.FcForm21;
import com.cdac.usermanagement.ORM.FcForm23;
import com.cdac.usermanagement.ORM.FcForm24;
import com.cdac.usermanagement.ORM.FcForm25;
import com.cdac.usermanagement.ORM.FcForm26;
import com.cdac.usermanagement.ORM.HomeDetails;
import com.cdac.usermanagement.ORM.HomeSequence;
import com.cdac.usermanagement.ORM.HomeMaster;
import com.cdac.usermanagement.ORM.RoleMaster;
import com.cdac.usermanagement.ORM.UserDetail;
import com.cdac.usermanagement.ORM.UserDetailPK;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import com.cdac.usermanagement.ORM.UserMaster;
import freemarker.core.Expression;     //anupam commented this on 3 aug 2012
import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.HibernateTemplate;
//import com.abc.exceptions.AppException;

public class AdminDAOImpl implements AdminDAO {

    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public UserMaster create(UserMaster um) throws AppException {
        try {

            hibernateTemplate.save(um);
            return um;
        } catch (HibernateException e) {
            throw new AppException(e.getCause().getMessage());
        }
    }

    public void delete(UserMaster um) throws AppException {
        try {

            hibernateTemplate.delete(um);
        } catch (HibernateException e) {
            throw new AppException(e.getCause().getMessage());
        }

    }

    public UserMaster get(String uid) {
        UserMaster um = null;
        try {

            um = (UserMaster) ((hibernateTemplate.findByNamedQueryAndNamedParam("UserMaster.findByUserId", "userId", uid)).get(0));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return um;
    }

    public boolean save(UserMaster um) throws AppException {
        boolean result = false;
        try {
            System.out.println("Inside AdminDAO_backImpl......before begin()");
            hibernateTemplate.save(um); //changed from update
            System.out.println("Inside AdminDAO_backImpl......after hibernateTemplate.update(um);");

            System.out.println("Inside AdminDAO_backImpl......after ");

            result = true;
        } catch (HibernateException e) {
            result = false;
            //throw new AppException(e.getCause().getMessage());
            // e.printStackTrace();
        }
        return result;
    }

    public String save(UserDetail um) {
        String result = "error";
        try {

            hibernateTemplate.saveOrUpdate(um);
            result = "success";

        } catch (Exception e) {
            //throw new AppException(e.getCause().getMessage());
            e.printStackTrace();
        }

        System.out.println("value returned to servive fromm dao = " + result);
        return result;

    }

    @SuppressWarnings("unchecked")
    public List<UserMaster> list() throws AppException {
        try {
            List<UserMaster> list = (List<UserMaster>) hibernateTemplate.find("from Employee");

            return list;
        } catch (HibernateException e) {
            throw new AppException(e.getCause().getMessage());
        }
    }

    //updating
    public boolean update(UserMaster user) {
        System.out.println("----------------------------->updateUserMaster(UserMaster user)");
        boolean success = false;
        try {

            hibernateTemplate.saveOrUpdate(user);

            //DAO.close();//added by anupam to solve data inconsistency on 12 th march 2011
            success = true;
        } catch (HibernateException e) {
            success = false;
            //throw new AppException(e.getCause().getMessage());
            e.printStackTrace();

        }
        return success;
    }

    public boolean update(UserMaster user, boolean update) throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");

        System.out.println("----------------------------->updateUserMaster(UserMaster user,boolean update)");
        boolean success = false;
        try {

            hibernateTemplate.update(user);

            success = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return success;
    }

    /*----------------------Add Role with automatically generated roleID START--------------------------------------*/
    public boolean addRole(String roleName) throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("----------------------------->addRole(String roleName)");
        boolean success = false;

        try {
            /*
            I changed .hbm
             */

            RoleMaster role = new RoleMaster();
            //role.setRoleId(new Integer(roleNo));
            role.setRoleName(roleName);

            hibernateTemplate.save(role);

            success = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return success;
    }

    public boolean delete(String uid) throws AppException {
        // throw new UnsupportedOperationException("Not supported yet.");
        /**
         * Anupam implemented the method on 18th march
         *
         */
        boolean result = false;
        try {
            hibernateTemplate.delete(hibernateTemplate.get(UserMaster.class, uid));

            System.out.println("deletion successful for uid = " + uid);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    public UserMaster view(String uid) throws AppException {

        System.out.println("----------------------------->viewUserMaster(String userId)  ");

        UserMaster storeUser = null; //added by anupam 18th march

        try {
            List tempList = hibernateTemplate.find("from UserMaster u where u.userId = ?", uid.toString());

            Iterator i = tempList.iterator();
            if (i.hasNext()) {
                //fetch the user and typecast it
                storeUser = (UserMaster) (i.next());

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return storeUser;

    }

    public UserMaster view(String userId, boolean close) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean checkUniqueString(String field, String value) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean checkUniqueRole(String field, String value) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public RoleMaster viewRoleMaster(String id) throws AppException {
        System.out.println("----------------------------->viewRoleMaster(String userId1)");
        RoleMaster role = new RoleMaster();
        //Integer id=new Integer(roleid);
        try {
            try {

                List tempList = hibernateTemplate.find("from RoleMaster r where r.roleId=?", new Integer(id));

                Iterator i = tempList.iterator();

                if (i.hasNext()) {
                    role = (RoleMaster) (i.next());
                    System.out.println("inside viewRoleMaster if condition ---- > value fromm db --->" + role);
                }

            } catch (HibernateException e) {
                throw new AppException(e.getCause().getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return role;

    }

    public RoleMaster viewRoleMaster(String userId1, boolean close) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List viewUserMaster() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");

        return hibernateTemplate.find("from UserMaster");

    }

    public List viewRoleMaster() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<UserMaster> list = (List<UserMaster>) hibernateTemplate.find("from RoleMaster");
        return list;
    }

    public boolean addRolePrivileges(String roleNo, String moduleName, String privilege, String subModule) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addRole(String roleNo, String roleName) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList viewPrivilege(String roleId1) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");

        //Implemented by anupam on 18th march
        /**
         * Skipped 
         *
         */
    }

    public ArrayList viewPrivilege(String roleId1, String module) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList viewPrivilege(String roleId, String module, String subModule) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList getModulesForRole(String roleId) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List viewPrivilege1(String roleId) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
        //skipped 

    }

    public List viewPrivilege1(String roleId, String module) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List viewPrivilege1(String roleId, String module, String subModule) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean deletePrivilege(ArrayList module, ArrayList subModule, Integer roleId, ArrayList priv) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean checkUniqueRoleId(String field, String value) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String isLoginValid(String userId, String password1) throws AppException {

        System.out.println("----------------------------->isLoginValid(String userId,String password1)");

        //anupam commented the line below we dont
        //need an extra object here refernce is sufficient
        //This resolve the issue of user login even in case of login faliure(18th march)
        //UserMaster storeUser = new UserMaster();
        UserMaster storeUser = null;

        String isValid = "noMatch";
        try {

            List tempList = hibernateTemplate.find("from UserMaster u where u.userId = ?", userId.toString());

            //for an authentic enrty only one object will be in the list so lets retive it
            System.out.println("User master*******->" + tempList);
            System.out.println("User master*******1***->" + tempList.get(0));
            System.out.println("User master*******1***->" + ((UserMaster) tempList.get(0)).getPassword());
            Iterator i = tempList.iterator();
            if (i.hasNext()) {
                //fetch the user and typecast it
                storeUser = (UserMaster) (i.next());

            }

            String password = storeUser.getPassword();
            if (password.equals(password1)) {
                isValid = userId;
                System.out.println("login successful ---- user = " + storeUser);
            }

        } catch (org.hibernate.exception.GenericJDBCException e) {
            isValid = "ConnectError";

            e.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return isValid;

    }

    public boolean deleteUserMaster(String vendorNo) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<UserMaster> list(int firstResult, int maxResults) throws AppException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getUserDetail(String userId) throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("-----------------------------> getUserDetail(String userId)");
        //return hibernateTemplate.findByNamedQueryAndNamedParam("UserDetail.findByUserId", "userId", userId);
        return hibernateTemplate.findByNamedQueryAndNamedParam("UserDetail.findByUserIdAndActiveStatus", "userId", userId);
    }

    //method to fetch a cwc member Added om 25-11-2011
    public CwcDetail getCwcUserDetail(String cwcUserId) {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("-----------------------------> getCwcUserDetail(String cwcUserId)");
        //return hibernateTemplate.findByNamedQueryAndNamedParam("UserDetail.findByUserId", "userId", userId);
        return (CwcDetail) hibernateTemplate.findByNamedQueryAndNamedParam("CwcDetail.findByUserIdAndActiveStatus", "userId", cwcUserId).get(0);
    }

    /*-------methods for home management-------*/
    public String saveHome(HomeMaster homeSubcat) {

        String result = "error";

        try {
            System.out.println("inside saveHome() ------> START" + homeSubcat);

            hibernateTemplate.save(homeSubcat);

            System.out.println(" Object just saved has the following properties ----------------> " + homeSubcat.getHomeId());

            result = homeSubcat.getHomeId();
            System.out.println("inside saveHome() ------> END RECOMBINATION RESULT" + result);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return result;
    }

    public String saveHomeDetails(HomeDetails homeDetails) {
        String result = "error";
        try {
            System.out.println("inside saveHomeDetails() ------> START" + homeDetails);
            hibernateTemplate.save(homeDetails);
            result = "success";
            System.out.println("inside saveHomeDetails() ------> END" + homeDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List getCatagoryList() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        return hibernateTemplate.findByNamedQuery("ProductCatSubcat.findAll");
    }

    public Integer getNextHomeNumber() {
        //throw new UnsupportedOperationException("Not supported yet.");
        Integer homeSeq = null;
        try {
            HomeSequence homeSequence = new HomeSequence();
            hibernateTemplate.save(homeSequence);
            homeSeq = homeSequence.getHomeSeq();
        } catch (Exception e) {
            System.out.println("-----------Error in Generatring home sequence-------");
            e.printStackTrace();
        }
        return homeSeq;
    }

    public Integer getNextHomeNumberVersion2() {
        //throw new UnsupportedOperationException("Not supported yet.");
        Integer homeSeqNo = null;
        try {
            HomeSequence homeSequence = new HomeSequence();
            hibernateTemplate.save(homeSequence);
            homeSeqNo = homeSequence.getHomeSeq();
        } catch (Exception e) {
            System.out.println("--------------Error in side public Integer getNextHomeNumberVersion2()----- ");
            e.printStackTrace();
        }
        return homeSeqNo;
    }

    public List getUserListOfSpecificHome(String homeId) throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        List userListOfAHome = null;

        try {
            userListOfAHome = hibernateTemplate.findByNamedQueryAndNamedParam("UserDetail.findByHomeIdAndActiveStatus", "homeId", homeId.trim());

            System.out.println("$$getgetUserListOfSpecificHome------------------>" + userListOfAHome);
            Iterator i = userListOfAHome.iterator();
            while (i.hasNext()) {
                System.out.println("$$getgetUserListOfSpecificHome------------------>" + i.next().toString());
            }

        } catch (Exception e) {
            System.out.println("$$getgetUserListOfSpecificHome ERROR------------------>");
            e.printStackTrace();
        }

        return userListOfAHome;

    }

    public String saveRolesOfUsersOfAHome(List<UserDetail> userDetailRows) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result = null;
        try {

            if (userDetailRows.size() > 0) {
                //Iterator i=userDetail.iterator();

                hibernateTemplate.saveOrUpdateAll(userDetailRows);
                result = "assignRoleSuccess";
            }
        } catch (Exception e) {
            result = "assignRoleError";
            System.out.println("-------------ERROR IN ASSIGNING ROLE--------");
            e.printStackTrace();
        }

        return result;
    }

    public List<DistrictMaster> viewDistricts() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<DistrictMaster> districtList = new ArrayList<DistrictMaster>();

        try {
            districtList = hibernateTemplate.findByNamedQuery("DistrictMaster.findAll");
            System.out.println("District List=======================> " + districtList);
        } catch (Exception e) {
            //districtList.add("Error Fetching Districts");
            System.out.println("-------------ERROR IN DAO viewDistricts()--------");
            e.printStackTrace();
        }

        return districtList;

    }

    public List viewHomesOfADistrict(String districtId) throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<String> homesInADistrict = new ArrayList<String>();
        try {
            //homesInADistrict = hibernateTemplate.findByNamedQuery("HomeMaster.findHomesInADistrict",new DistrictMaster(districtId));
            homesInADistrict = hibernateTemplate.findByNamedQueryAndNamedParam("HomeMaster.findHomesInADistrict", "districtId", new DistrictMaster(districtId));
            System.out.println("District wise Home List=======================> " + homesInADistrict);
        } catch (Exception e) {
            homesInADistrict.add("Error while Fetching");
            System.out.println("-------------ERROR IN DAO viewHomesOfADistrict(String districtId)--------");
            e.printStackTrace();
        }
        if (homesInADistrict.isEmpty()) {
            homesInADistrict.add("NO HOMES");
        }
        return homesInADistrict;
    }

    public List<HomeDetails> viewAllHomes() throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        List<HomeDetails> homesInADistrict = new ArrayList<HomeDetails>();
        try {
            //homesInADistrict = hibernateTemplate.findByNamedQuery("HomeMaster.findHomesInADistrict",new DistrictMaster(districtId));
            homesInADistrict = hibernateTemplate.findByNamedQuery("HomeDetails.findAll");
            System.out.println("All Home List=======================> " + homesInADistrict);
        } catch (Exception e) {
            //homesInADistrict.add("Error while Fetching");
            System.out.println("-------------ERROR IN DAO viewAllHomes()--------");
            e.printStackTrace();
        }

        return homesInADistrict;
    }

    public String delete(List<UserDetail> udl) throws AppException {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result = "error";
        try {
            hibernateTemplate.deleteAll(udl);
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String update(List<UserDetail> udl) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result = "error";
        try {
            hibernateTemplate.saveOrUpdateAll(udl);
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<String> getHomesBasedOnDistAndType(String districtId, String type) {

        System.out.println("from service District Id---------------- > " + districtId);
        System.out.println("from service type ---------------- > " + type);

        String namedQuery = "all";

        if (type.trim().equalsIgnoreCase("oh")) {
            namedQuery = "HomeMaster.findOHomesInADistrict";
        } else if (type.trim().equalsIgnoreCase("sh")) {
            namedQuery = "HomeMaster.findSHomesInADistrict";
        } else if (type.trim().equalsIgnoreCase("ruch")) {
            namedQuery = "HomeMaster.findRCHomesInADistrict";
        } else if (type.trim().equalsIgnoreCase("all")) {
            namedQuery = "HomeMaster.findHomesInADistrict";
        }

        return hibernateTemplate.findByNamedQueryAndNamedParam(namedQuery, "districtId", new DistrictMaster(districtId));

    }

    public List<UserMaster> getHomeLessUsers() {
        List<UserMaster> userList = new ArrayList<UserMaster>();
        try {

            userList = hibernateTemplate.findByNamedQuery("UserMaster.findAllForAssignHome");
            System.out.println("--------------Error in DAO public List<UserMaster> getHomeLessUsers() ------------LIST = " + userList);
        } catch (Exception e) {
            System.out.println("--------------Error in DAO public List<UserMaster> getHomeLessUsers() ------------");
            e.printStackTrace();
        }
        return userList;
    }

    public String assignHome(List<UserDetail> userDetailList) {
        //throw new UnsupportedOperationException("Not supported yet.");
        String result = "error";

        try {

            for (UserDetail userDetail : userDetailList) {
                //hibernateTemplate.save(userDetail);        //bodified by anupam on 20th july 2011
                hibernateTemplate.saveOrUpdate(userDetail);
            }
            result = "success";
        } catch (Exception e) {
            System.out.println("--------------Error in DAO assignHome ------------");
            e.printStackTrace();
        }
        return result;
    }

    public List<UserDetail> getUserDetailsOfauser(String userId) {

        List<UserDetail> userDetailList = new ArrayList<UserDetail>();

        try {

            userDetailList = hibernateTemplate.findByNamedQueryAndNamedParam("UserDetail.findByUserIdAndActiveStatus", "userId", userId.trim());
        } catch (Exception e) {
            System.out.println("--------------Error in DAO assignHome ------------getUserDetailsOfauser(String userId)");
            e.printStackTrace();

        }

        return userDetailList;
    }

    public List<RoleMaster> getRoleList() {

        List<RoleMaster> roleList = null;

        try {
            roleList = hibernateTemplate.findByNamedQuery("RoleMaster.findAll");
        } catch (Exception e) {
            System.out.println("--------------Error in DAO getRoleList -----------");
            e.printStackTrace();
        }

        return roleList;
    }

    public List<UserMaster> getNonEmployeeList(String namedQuery) {
        List<UserMaster> userMasterList = new ArrayList<UserMaster>();

        try {

            userMasterList = hibernateTemplate.findByNamedQuery(namedQuery);

        } catch (Exception e) {
            System.out.println("--------------Error in DAO getNonEmployeeList(String namedQuery) -----------");
            e.printStackTrace();
        }

        return userMasterList;
    }

    public int saveToCWCHome(CwcHome cwcHome) {

        int result = -1;

        try {
            //hibernateTemplate.save(cwcHome);                
            hibernateTemplate.saveOrUpdate(cwcHome); // anupam changed this
            result = cwcHome.getCwcId();

        } catch (Exception e) {
            result = -1;
            //cleanup
            hibernateTemplate.delete(cwcHome);
            System.out.println("--------------Error in DAO getNonEmployeeList(String namedQuery) -----------");
            e.printStackTrace();
        }
        return result;

    }

    public String saveOrUpdateToCwcDetails(List<CwcDetail> cwcDetails) {

        String result = "error";

        try {
            System.out.println("************************************************* " + cwcDetails);
            hibernateTemplate.saveOrUpdateAll(cwcDetails);
            result = "success";
        } catch (Exception e) {
            hibernateTemplate.deleteAll(cwcDetails);
            System.out.println("--------------Error in DAO getNonEmployeeList(String namedQuery) -----------");
            e.printStackTrace();

        }
        return result;
    }

    public List<UserMaster> getUserMasterList(String userId) {

        List<UserMaster> userMasters = new ArrayList<UserMaster>();

        try {
            userMasters = hibernateTemplate.findByNamedQueryAndNamedParam("UserMaster.findByUserId", "userId", userId.trim());
        } catch (Exception e) {
            System.out.println("--------------Error in DAO getUserMasterList(String userId) -----------");
            e.printStackTrace();
        }
        return userMasters;
    }

    public UserDetail getUserDetailBasedOnUHR(UserDetailPK userDetailPK) {

        UserDetail userDetail = new UserDetail();

        try {
            userDetail = (UserDetail) hibernateTemplate.get(UserDetail.class, userDetailPK);
        } catch (Exception e) {
            System.out.println("--------------Error in DAO getUserDetailBasedOnUHR(UserDetailPK userDetailPK) -----------");
            e.printStackTrace();
        }
        return userDetail;
    }

    public List<DistrictMaster> getDistrictsWithOutCWC() {

        List<DistrictMaster> distListWithOutCWC = new ArrayList<DistrictMaster>();

        try {
            distListWithOutCWC = hibernateTemplate.findByNamedQuery("DistrictMaster.findDistWithOutCWC");
        } catch (Exception e) {
            System.out.println("--------------Error in DAO List<DistrictMaster> getDistrictsWithOutCWC() -----------");
            e.printStackTrace();
        }
        return distListWithOutCWC;
    }

    public List<DistrictMaster> getDistrictsWithCWC() {
        List<DistrictMaster> distListWithCWC = new ArrayList<DistrictMaster>();

        try {
            distListWithCWC = hibernateTemplate.findByNamedQuery("DistrictMaster.findDistWithCWC");
        } catch (Exception e) {
            System.out.println("--------------Error in DAO List<DistrictMaster> getDistrictsWithCWC() -----------");
            e.printStackTrace();
        }
        return distListWithCWC;
        //@NamedQuery(name = "DistrictMaster.findDistWithCWC", query = "SELECT d FROM DistrictMaster d WHERE d.districtId IN(SELECT d1.district FROM CwcHome d1 WHERE d1.status='active')"),
    }

    /**
     * This methos will take a parameter and based on the parameter return the
     * folllowing 1)if param is 'active' returns of active cwc's 2)if the param
     * is 'inactive' return the inactive cwc's 3)if the param is 'none' returns
     * the all the cwc's irrecpetive of any param.
     *
     * @param status
     * @return
     */
    public List<CwcHome> getCwcHomes(String status) {

        List<CwcHome> cwcHomes = new ArrayList<CwcHome>();

        try {
            //@NamedQuery(name = "CwcHome.findByStatus", query = "SELECT c FROM CwcHome c WHERE c.status = :status")})
            if (status.equalsIgnoreCase("none")) {
                cwcHomes = hibernateTemplate.findByNamedQuery("CwcHome.findAll");
            } else {
                cwcHomes = hibernateTemplate.findByNamedQueryAndNamedParam("CwcHome.findByStatus", "status", status.trim());
            }
        } catch (Exception e) {

            System.out.println("--------------Error in DAO List<DistrictMaster> getDistrictsWithOutCWC() -----------");
            e.printStackTrace();
        }
        return cwcHomes;
    }

    /**
     * This method returns the list of CwcDetails based on the cwc given.
     *
     * @param cwcId
     * @return List<CwcDetail>
     */
    public List<CwcDetail> getCwcDetailsBasedOnCwcId(int cwcId) {

        List<CwcDetail> cwcDetails = new ArrayList<CwcDetail>();

        try {
            //@NamedQuery(name = "CwcDetail.findByActiveStatusAndCwcId", query = "SELECT c FROM CwcDetail c WHEREc.status='active' AND c.cwcDetailPK.cwcId = :cwcId"),
            cwcDetails = hibernateTemplate.findByNamedQueryAndNamedParam("CwcDetail.findByActiveStatusAndCwcId", "cwcId", cwcId);
        } catch (Exception e) {
            System.out.println("--------------Error in DAO List<DistrictMaster> getDistrictsWithOutCWC() -----------");
            e.printStackTrace();
        }
        return cwcDetails;
    }

    public List<CwcHome> getCwcHomesByDistrictIdAndActiveStatus(String districtId) {

        //@NamedQuery(name = "CwcHome.findByDistrictIdAndActiveStatus", query = "SELECT c FROM CwcHome c WHERE c.status = 'active' AND c.district = :district"),
        List<CwcHome> cwcHomes = new ArrayList<CwcHome>();

        try {
            cwcHomes = hibernateTemplate.findByNamedQueryAndNamedParam("CwcHome.findByDistrictIdAndActiveStatus", "district", districtId);
        } catch (Exception e) {
            System.out.println("--------------Error in DAO List<DistrictMaster> getDistrictsWithOutCWC() -----------");
            e.printStackTrace();
        }
        return cwcHomes;
    }

    public String inactivteCwcMembers(List<CwcDetail> cwcDetails) {

        String result = "error";

        try {
            hibernateTemplate.saveOrUpdateAll(cwcDetails);
            result = "success";
        } catch (Exception e) {
            System.out.println("--------------Error in DAO inactivteCwcMembers(List<CwcDetail> cwcDetails) -----------");
            e.printStackTrace();
        }

        return result;
    }

    public String saveOrUpdateToUserDetails(List<UserDetail> userDetails) {
        String result = "error";

        try {
            hibernateTemplate.saveOrUpdateAll(userDetails);
            result = "success";
        } catch (Exception e) {
            System.out.println("--------------Error in DAO inactivteCwcMembers(List<CwcDetail> cwcDetails) -----------");
            e.printStackTrace();
        }

        return result;
    }

    public HomeDetails getHomeDetails(String homeId) {
        HomeDetails homeDetails = new HomeDetails();

        try {
            homeDetails = (HomeDetails) hibernateTemplate.get(HomeDetails.class, homeId.trim());
        } catch (Exception e) {
            System.out.println("--------------Error in DAO HomeDetails getHomeDetails(String homeId) -----------");
            e.printStackTrace();
        }
        return homeDetails;
    }

    public List<UserDetail> getUserDetailsInSlotOfTen(int start, int limit) {

        List<UserDetail> userDetails = new ArrayList<UserDetail>(limit);

        try {
            Session session = hibernateTemplate.getSessionFactory().openSession();

            Criteria criteria = session.createCriteria(UserDetail.class);

            criteria.add(org.hibernate.criterion.Expression.isNotNull("lastModifiedDate"));

            criteria.addOrder(Order.desc("lastModifiedDate"));

            criteria.setFirstResult(start);

            criteria.setMaxResults(limit);

            userDetails = criteria.list();

            for (UserDetail u : userDetails) {
                System.out.println(" ---- " + u);
            }
        } catch (Exception e) {
            System.out.println("-----------------------ERROR in Criteria Query------------------");
            e.printStackTrace();
        }

        return userDetails;
    }

    public List<ChildDetails> getChildOnName(String chname) {
        List<ChildDetails> cdList = null;
        try {
            cdList = (List<ChildDetails>) hibernateTemplate.find("SELECT c FROM ChildDetails c WHERE UCASE(c.childName) LIKE '%" + chname.toUpperCase() + "%'");
            System.out.println("cdList-----fdfdfd----->" + cdList.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cdList;
    }

    public boolean saveFcChildTemp(FcChildTemp fcct) {
        try {
            //FcChildTemp fc =  (FcChildTemp)hibernateTemplate.save(fcct);
            System.out.println("saveFcChildTemp AdminDAOIMPL");
            hibernateTemplate.save(fcct);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public Object getCWCMinutes(int mid) {
        System.out.println("mid****DAO****getCWCMinutes--*-->" + mid);
        CwcMinutes cwcmin = (CwcMinutes) hibernateTemplate.findByNamedQueryAndNamedParam("CwcMinutes.findByMeetingId", "meetingId", mid).get(0);

        System.out.println("handover*********order issued->" + cwcmin.getOrderIssued());
        Object o1 = null;
        if (cwcmin.getOrderIssued().equalsIgnoreCase("handover")) {
            System.out.println("handover*********->" + cwcmin.getCwcMinutesPK().getMeetingId());
            o1 = (CwcHop) hibernateTemplate.findByNamedQueryAndNamedParam("CwcHop.findByMeetingId", "meetingId", cwcmin.getCwcMinutesPK().getMeetingId()).get(0);
            System.out.println("handover*********->" + o1);
        } else if (cwcmin.getOrderIssued().equalsIgnoreCase("callfordpo")) {
            o1 = (CwcSir) hibernateTemplate.findByNamedQueryAndNamedParam("CwcSir.findByMeetingId", "meetingId", cwcmin.getCwcMinutesPK().getMeetingId()).get(0);
        } else if (cwcmin.getOrderIssued().equalsIgnoreCase("Interviewagian")) {
            o1 = (CwcSo) hibernateTemplate.findByNamedQueryAndNamedParam("CwcSo.findByMeetingId", "meetingId", cwcmin.getCwcMinutesPK().getMeetingId()).get(0);
        } else if (cwcmin.getOrderIssued().equalsIgnoreCase("transfer")) {
            o1 = (CwcUppi) hibernateTemplate.findByNamedQueryAndNamedParam("CwcUppi.findByMeetingId", "meetingId", cwcmin.getCwcMinutesPK().getMeetingId()).get(0);

        }

        return o1;
    }

    public List<String> getReportFoundChild() {

        System.out.println("AdminDAOIMPL getReportFoundChild");
        List<String> Flist = (List<String>) hibernateTemplate.find("select fc.profileId from FcChildTemp fc");
        if (Flist != null) {
            System.out.println("Flist" + Flist.size());
        }
        return Flist;
    }

    /**
     *
     * @param childprofileid
     * @return
     */
    @Override
    public FcChildTemp foundreportlist(String childprofileid) {

        System.out.println("found report list admindaoimpl");
        FcChildTemp Flist = (FcChildTemp) hibernateTemplate.find("SELECT f FROM FcChildTemp f where profileId = '" + childprofileid + "'").get(0);

        if (Flist != null) {
            System.out.println("foundreportlist " + Flist.getFirstName());
        }
        System.out.println("foundreportlist " + Flist.getFirstName());
        return Flist;
    }

    /**
     *
     * @param id
     * @param tableName
     * @return
     */
    @Override
    public List <FcForm> selectChildDAO(String id , String tableName) {
        System.out.println("found report list admindaoimpl");
        List<String> Flistp = (List<String>) hibernateTemplate.find("SELECT profileId FROM FcChildTemp f where id = '" + id + "'");
        String profile_id = Flistp.get(0);
        List<FcForm> Flist = (List<FcForm>) hibernateTemplate.find("SELECT fc FROM "+tableName+" fc where profileId = '" + profile_id + "'");
        return Flist;
    }
}
