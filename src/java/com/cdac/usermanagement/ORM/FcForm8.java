/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.usermanagement.ORM;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaitanya
 */
@Entity
@Table(name = "fc_form8", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm8.findAll", query = "SELECT f FROM FcForm8 f")
    , @NamedQuery(name = "FcForm8.findById", query = "SELECT f FROM FcForm8 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm8.findByProfileId", query = "SELECT f FROM FcForm8 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm8.findByUtCname", query = "SELECT f FROM FcForm8 f WHERE f.utCname = :utCname")
    , @NamedQuery(name = "FcForm8.findByUtChild", query = "SELECT f FROM FcForm8 f WHERE f.utChild = :utChild")
    , @NamedQuery(name = "FcForm8.findByUtJjb", query = "SELECT f FROM FcForm8 f WHERE f.utJjb = :utJjb")
    , @NamedQuery(name = "FcForm8.findByUtSum", query = "SELECT f FROM FcForm8 f WHERE f.utSum = :utSum")
    , @NamedQuery(name = "FcForm8.findByUtRsw", query = "SELECT f FROM FcForm8 f WHERE f.utRsw = :utRsw")
    , @NamedQuery(name = "FcForm8.findByUtChild2", query = "SELECT f FROM FcForm8 f WHERE f.utChild2 = :utChild2")
    , @NamedQuery(name = "FcForm8.findByUtYear", query = "SELECT f FROM FcForm8 f WHERE f.utYear = :utYear")
    , @NamedQuery(name = "FcForm8.findByUtDate", query = "SELECT f FROM FcForm8 f WHERE f.utDate = :utDate")
    , @NamedQuery(name = "FcForm8.findByUtSum2", query = "SELECT f FROM FcForm8 f WHERE f.utSum2 = :utSum2")
    , @NamedQuery(name = "FcForm8.findByUtRsw2", query = "SELECT f FROM FcForm8 f WHERE f.utRsw2 = :utRsw2")
    , @NamedQuery(name = "FcForm8.findByUtDate2", query = "SELECT f FROM FcForm8 f WHERE f.utDate2 = :utDate2")
    , @NamedQuery(name = "FcForm8.findByUtMonth", query = "SELECT f FROM FcForm8 f WHERE f.utMonth = :utMonth")
    , @NamedQuery(name = "FcForm8.findByUtYear1", query = "SELECT f FROM FcForm8 f WHERE f.utYear1 = :utYear1")
    , @NamedQuery(name = "FcForm8.findByUtCname2", query = "SELECT f FROM FcForm8 f WHERE f.utCname2 = :utCname2")
    , @NamedQuery(name = "FcForm8.findByUtPlace", query = "SELECT f FROM FcForm8 f WHERE f.utPlace = :utPlace")
    , @NamedQuery(name = "FcForm8.findByUtPerson", query = "SELECT f FROM FcForm8 f WHERE f.utPerson = :utPerson")
    , @NamedQuery(name = "FcForm8.findByUtCname3", query = "SELECT f FROM FcForm8 f WHERE f.utCname3 = :utCname3")
    , @NamedQuery(name = "FcForm8.findByUtSum3", query = "SELECT f FROM FcForm8 f WHERE f.utSum3 = :utSum3")
    , @NamedQuery(name = "FcForm8.findByUtRsw3", query = "SELECT f FROM FcForm8 f WHERE f.utRsw3 = :utRsw3")
    , @NamedQuery(name = "FcForm8.findByUtDate3", query = "SELECT f FROM FcForm8 f WHERE f.utDate3 = :utDate3")
    , @NamedQuery(name = "FcForm8.findByUtMonth2", query = "SELECT f FROM FcForm8 f WHERE f.utMonth2 = :utMonth2")
    , @NamedQuery(name = "FcForm8.findByUtYear2", query = "SELECT f FROM FcForm8 f WHERE f.utYear2 = :utYear2")
    , @NamedQuery(name = "FcForm8.findByUtCust", query = "SELECT f FROM FcForm8 f WHERE f.utCust = :utCust")})
public class FcForm8 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 50)
    @Column(name = "ut_cname", length = 50)
    private String utCname;
    @Size(max = 50)
    @Column(name = "ut_child", length = 50)
    private String utChild;
    @Size(max = 50)
    @Column(name = "ut_jjb", length = 50)
    private String utJjb;
    @Size(max = 50)
    @Column(name = "ut_sum", length = 50)
    private String utSum;
    @Size(max = 50)
    @Column(name = "ut_rsw", length = 50)
    private String utRsw;
    @Size(max = 50)
    @Column(name = "ut_child2", length = 50)
    private String utChild2;
    @Size(max = 20)
    @Column(name = "ut_year", length = 20)
    private String utYear;
    @Size(max = 50)
    @Column(name = "ut_date", length = 50)
    private String utDate;
    @Size(max = 20)
    @Column(name = "ut_sum2", length = 20)
    private String utSum2;
    @Size(max = 50)
    @Column(name = "ut_rsw2", length = 50)
    private String utRsw2;
    @Size(max = 50)
    @Column(name = "ut_date2", length = 50)
    private String utDate2;
    @Size(max = 50)
    @Column(name = "ut_month", length = 50)
    private String utMonth;
    @Size(max = 50)
    @Column(name = "ut_year1", length = 50)
    private String utYear1;
    @Size(max = 50)
    @Column(name = "ut_cname2", length = 50)
    private String utCname2;
    @Size(max = 50)
    @Column(name = "ut_place", length = 50)
    private String utPlace;
    @Size(max = 50)
    @Column(name = "ut_person", length = 50)
    private String utPerson;
    @Size(max = 50)
    @Column(name = "ut_cname3", length = 50)
    private String utCname3;
    @Size(max = 50)
    @Column(name = "ut_sum3", length = 50)
    private String utSum3;
    @Size(max = 50)
    @Column(name = "ut_rsw3", length = 50)
    private String utRsw3;
    @Size(max = 50)
    @Column(name = "ut_date3", length = 50)
    private String utDate3;
    @Size(max = 50)
    @Column(name = "ut_month2", length = 50)
    private String utMonth2;
    @Size(max = 50)
    @Column(name = "ut_year2", length = 50)
    private String utYear2;
    @Size(max = 50)
    @Column(name = "ut_cust", length = 50)
    private String utCust;

    public FcForm8() {
    }

    public FcForm8(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getUtCname() {
        return utCname;
    }

    public void setUtCname(String utCname) {
        this.utCname = utCname;
    }

    public String getUtChild() {
        return utChild;
    }

    public void setUtChild(String utChild) {
        this.utChild = utChild;
    }

    public String getUtJjb() {
        return utJjb;
    }

    public void setUtJjb(String utJjb) {
        this.utJjb = utJjb;
    }

    public String getUtSum() {
        return utSum;
    }

    public void setUtSum(String utSum) {
        this.utSum = utSum;
    }

    public String getUtRsw() {
        return utRsw;
    }

    public void setUtRsw(String utRsw) {
        this.utRsw = utRsw;
    }

    public String getUtChild2() {
        return utChild2;
    }

    public void setUtChild2(String utChild2) {
        this.utChild2 = utChild2;
    }

    public String getUtYear() {
        return utYear;
    }

    public void setUtYear(String utYear) {
        this.utYear = utYear;
    }

    public String getUtDate() {
        return utDate;
    }

    public void setUtDate(String utDate) {
        this.utDate = utDate;
    }

    public String getUtSum2() {
        return utSum2;
    }

    public void setUtSum2(String utSum2) {
        this.utSum2 = utSum2;
    }

    public String getUtRsw2() {
        return utRsw2;
    }

    public void setUtRsw2(String utRsw2) {
        this.utRsw2 = utRsw2;
    }

    public String getUtDate2() {
        return utDate2;
    }

    public void setUtDate2(String utDate2) {
        this.utDate2 = utDate2;
    }

    public String getUtMonth() {
        return utMonth;
    }

    public void setUtMonth(String utMonth) {
        this.utMonth = utMonth;
    }

    public String getUtYear1() {
        return utYear1;
    }

    public void setUtYear1(String utYear1) {
        this.utYear1 = utYear1;
    }

    public String getUtCname2() {
        return utCname2;
    }

    public void setUtCname2(String utCname2) {
        this.utCname2 = utCname2;
    }

    public String getUtPlace() {
        return utPlace;
    }

    public void setUtPlace(String utPlace) {
        this.utPlace = utPlace;
    }

    public String getUtPerson() {
        return utPerson;
    }

    public void setUtPerson(String utPerson) {
        this.utPerson = utPerson;
    }

    public String getUtCname3() {
        return utCname3;
    }

    public void setUtCname3(String utCname3) {
        this.utCname3 = utCname3;
    }

    public String getUtSum3() {
        return utSum3;
    }

    public void setUtSum3(String utSum3) {
        this.utSum3 = utSum3;
    }

    public String getUtRsw3() {
        return utRsw3;
    }

    public void setUtRsw3(String utRsw3) {
        this.utRsw3 = utRsw3;
    }

    public String getUtDate3() {
        return utDate3;
    }

    public void setUtDate3(String utDate3) {
        this.utDate3 = utDate3;
    }

    public String getUtMonth2() {
        return utMonth2;
    }

    public void setUtMonth2(String utMonth2) {
        this.utMonth2 = utMonth2;
    }

    public String getUtYear2() {
        return utYear2;
    }

    public void setUtYear2(String utYear2) {
        this.utYear2 = utYear2;
    }

    public String getUtCust() {
        return utCust;
    }

    public void setUtCust(String utCust) {
        this.utCust = utCust;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FcForm8)) {
            return false;
        }
        FcForm8 other = (FcForm8) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm8[ id=" + id + " ]";
    }
    
}
