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
@Table(name = "fc_form10", catalog = "child_homes_new", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FcForm10.findAll", query = "SELECT f FROM FcForm10 f")
    , @NamedQuery(name = "FcForm10.findById", query = "SELECT f FROM FcForm10 f WHERE f.id = :id")
    , @NamedQuery(name = "FcForm10.findByProfileId", query = "SELECT f FROM FcForm10 f WHERE f.profileId = :profileId")
    , @NamedQuery(name = "FcForm10.findByCpFirno", query = "SELECT f FROM FcForm10 f WHERE f.cpFirno = :cpFirno")
    , @NamedQuery(name = "FcForm10.findByCpPstaion", query = "SELECT f FROM FcForm10 f WHERE f.cpPstaion = :cpPstaion")
    , @NamedQuery(name = "FcForm10.findByCpUsec", query = "SELECT f FROM FcForm10 f WHERE f.cpUsec = :cpUsec")
    , @NamedQuery(name = "FcForm10.findByCpMatter", query = "SELECT f FROM FcForm10 f WHERE f.cpMatter = :cpMatter")
    , @NamedQuery(name = "FcForm10.findByCpVs", query = "SELECT f FROM FcForm10 f WHERE f.cpVs = :cpVs")
    , @NamedQuery(name = "FcForm10.findByCpName", query = "SELECT f FROM FcForm10 f WHERE f.cpName = :cpName")
    , @NamedQuery(name = "FcForm10.findByCpAge", query = "SELECT f FROM FcForm10 f WHERE f.cpAge = :cpAge")
    , @NamedQuery(name = "FcForm10.findByCpDate", query = "SELECT f FROM FcForm10 f WHERE f.cpDate = :cpDate")
    , @NamedQuery(name = "FcForm10.findByCpCare", query = "SELECT f FROM FcForm10 f WHERE f.cpCare = :cpCare")
    , @NamedQuery(name = "FcForm10.findByCpPname", query = "SELECT f FROM FcForm10 f WHERE f.cpPname = :cpPname")
    , @NamedQuery(name = "FcForm10.findByCpRegno", query = "SELECT f FROM FcForm10 f WHERE f.cpRegno = :cpRegno")
    , @NamedQuery(name = "FcForm10.findByCpAgeapp", query = "SELECT f FROM FcForm10 f WHERE f.cpAgeapp = :cpAgeapp")
    , @NamedQuery(name = "FcForm10.findByCpGender", query = "SELECT f FROM FcForm10 f WHERE f.cpGender = :cpGender")
    , @NamedQuery(name = "FcForm10.findByCpTname", query = "SELECT f FROM FcForm10 f WHERE f.cpTname = :cpTname")
    , @NamedQuery(name = "FcForm10.findByCpTfname", query = "SELECT f FROM FcForm10 f WHERE f.cpTfname = :cpTfname")
    , @NamedQuery(name = "FcForm10.findByCpTreligion", query = "SELECT f FROM FcForm10 f WHERE f.cpTreligion = :cpTreligion")
    , @NamedQuery(name = "FcForm10.findByCpTeducation", query = "SELECT f FROM FcForm10 f WHERE f.cpTeducation = :cpTeducation")
    , @NamedQuery(name = "FcForm10.findByCpTvt", query = "SELECT f FROM FcForm10 f WHERE f.cpTvt = :cpTvt")
    , @NamedQuery(name = "FcForm10.findByCpTlk", query = "SELECT f FROM FcForm10 f WHERE f.cpTlk = :cpTlk")
    , @NamedQuery(name = "FcForm10.findByCpTncd", query = "SELECT f FROM FcForm10 f WHERE f.cpTncd = :cpTncd")
    , @NamedQuery(name = "FcForm10.findByCpTemp", query = "SELECT f FROM FcForm10 f WHERE f.cpTemp = :cpTemp")
    , @NamedQuery(name = "FcForm10.findByCpTdoa", query = "SELECT f FROM FcForm10 f WHERE f.cpTdoa = :cpTdoa")
    , @NamedQuery(name = "FcForm10.findByCpCds", query = "SELECT f FROM FcForm10 f WHERE f.cpCds = :cpCds")
    , @NamedQuery(name = "FcForm10.findByCpDay", query = "SELECT f FROM FcForm10 f WHERE f.cpDay = :cpDay")
    , @NamedQuery(name = "FcForm10.findByCpMon", query = "SELECT f FROM FcForm10 f WHERE f.cpMon = :cpMon")
    , @NamedQuery(name = "FcForm10.findByCpYr", query = "SELECT f FROM FcForm10 f WHERE f.cpYr = :cpYr")
    , @NamedQuery(name = "FcForm10.findByCpParent", query = "SELECT f FROM FcForm10 f WHERE f.cpParent = :cpParent")
    , @NamedQuery(name = "FcForm10.findByCpBehavior", query = "SELECT f FROM FcForm10 f WHERE f.cpBehavior = :cpBehavior")
    , @NamedQuery(name = "FcForm10.findByCpHstatus", query = "SELECT f FROM FcForm10 f WHERE f.cpHstatus = :cpHstatus")
    , @NamedQuery(name = "FcForm10.findByCpRelationcf", query = "SELECT f FROM FcForm10 f WHERE f.cpRelationcf = :cpRelationcf")
    , @NamedQuery(name = "FcForm10.findByCpRelationf", query = "SELECT f FROM FcForm10 f WHERE f.cpRelationf = :cpRelationf")
    , @NamedQuery(name = "FcForm10.findByCpSafety", query = "SELECT f FROM FcForm10 f WHERE f.cpSafety = :cpSafety")
    , @NamedQuery(name = "FcForm10.findByCpCdifficulty", query = "SELECT f FROM FcForm10 f WHERE f.cpCdifficulty = :cpCdifficulty")
    , @NamedQuery(name = "FcForm10.findByCpFdifficulty", query = "SELECT f FROM FcForm10 f WHERE f.cpFdifficulty = :cpFdifficulty")
    , @NamedQuery(name = "FcForm10.findByCpHhold", query = "SELECT f FROM FcForm10 f WHERE f.cpHhold = :cpHhold")
    , @NamedQuery(name = "FcForm10.findByCpVT", query = "SELECT f FROM FcForm10 f WHERE f.cpVT = :cpVT")
    , @NamedQuery(name = "FcForm10.findByCpMiscellaneous", query = "SELECT f FROM FcForm10 f WHERE f.cpMiscellaneous = :cpMiscellaneous")
    , @NamedQuery(name = "FcForm10.findByCpTime", query = "SELECT f FROM FcForm10 f WHERE f.cpTime = :cpTime")
    , @NamedQuery(name = "FcForm10.findByCpSname", query = "SELECT f FROM FcForm10 f WHERE f.cpSname = :cpSname")
    , @NamedQuery(name = "FcForm10.findByCpTpmet", query = "SELECT f FROM FcForm10 f WHERE f.cpTpmet = :cpTpmet")
    , @NamedQuery(name = "FcForm10.findByCpUnusual", query = "SELECT f FROM FcForm10 f WHERE f.cpUnusual = :cpUnusual")
    , @NamedQuery(name = "FcForm10.findByCpFeed", query = "SELECT f FROM FcForm10 f WHERE f.cpFeed = :cpFeed")
    , @NamedQuery(name = "FcForm10.findByCpPeerAtt", query = "SELECT f FROM FcForm10 f WHERE f.cpPeerAtt = :cpPeerAtt")
    , @NamedQuery(name = "FcForm10.findByCpChildAtt", query = "SELECT f FROM FcForm10 f WHERE f.cpChildAtt = :cpChildAtt")
    , @NamedQuery(name = "FcForm10.findByCpWork", query = "SELECT f FROM FcForm10 f WHERE f.cpWork = :cpWork")
    , @NamedQuery(name = "FcForm10.findByCpHours", query = "SELECT f FROM FcForm10 f WHERE f.cpHours = :cpHours")
    , @NamedQuery(name = "FcForm10.findByCpChattw", query = "SELECT f FROM FcForm10 f WHERE f.cpChattw = :cpChattw")
    , @NamedQuery(name = "FcForm10.findByCpViolation", query = "SELECT f FROM FcForm10 f WHERE f.cpViolation = :cpViolation")
    , @NamedQuery(name = "FcForm10.findByCpNreason", query = "SELECT f FROM FcForm10 f WHERE f.cpNreason = :cpNreason")
    , @NamedQuery(name = "FcForm10.findByCpRehab", query = "SELECT f FROM FcForm10 f WHERE f.cpRehab = :cpRehab")
    , @NamedQuery(name = "FcForm10.findByCName", query = "SELECT f FROM FcForm10 f WHERE f.cName = :cName")
    , @NamedQuery(name = "FcForm10.findByCpPrepare", query = "SELECT f FROM FcForm10 f WHERE f.cpPrepare = :cpPrepare")
    , @NamedQuery(name = "FcForm10.findByCpProbationD", query = "SELECT f FROM FcForm10 f WHERE f.cpProbationD = :cpProbationD")
    , @NamedQuery(name = "FcForm10.findByCpProbationM", query = "SELECT f FROM FcForm10 f WHERE f.cpProbationM = :cpProbationM")
    , @NamedQuery(name = "FcForm10.findByCpProbationY", query = "SELECT f FROM FcForm10 f WHERE f.cpProbationY = :cpProbationY")
    , @NamedQuery(name = "FcForm10.findByCpDonv", query = "SELECT f FROM FcForm10 f WHERE f.cpDonv = :cpDonv")
    , @NamedQuery(name = "FcForm10.findByCpAp", query = "SELECT f FROM FcForm10 f WHERE f.cpAp = :cpAp")})
public class FcForm10 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 30)
    @Column(name = "profile_id", length = 30)
    private String profileId;
    @Size(max = 30)
    @Column(name = "cpFirno", length = 30)
    private String cpFirno;
    @Size(max = 30)
    @Column(name = "cpPstaion", length = 30)
    private String cpPstaion;
    @Size(max = 50)
    @Column(name = "cpUsec", length = 50)
    private String cpUsec;
    @Size(max = 50)
    @Column(name = "cpMatter", length = 50)
    private String cpMatter;
    @Size(max = 50)
    @Column(name = "cpVs", length = 50)
    private String cpVs;
    @Size(max = 50)
    @Column(name = "cpName", length = 50)
    private String cpName;
    @Size(max = 50)
    @Column(name = "cpAge", length = 50)
    private String cpAge;
    @Size(max = 50)
    @Column(name = "cpDate", length = 50)
    private String cpDate;
    @Size(max = 50)
    @Column(name = "cpCare", length = 50)
    private String cpCare;
    @Size(max = 50)
    @Column(name = "cpPname", length = 50)
    private String cpPname;
    @Size(max = 50)
    @Column(name = "cpRegno", length = 50)
    private String cpRegno;
    @Size(max = 50)
    @Column(name = "cpAgeapp", length = 50)
    private String cpAgeapp;
    @Size(max = 50)
    @Column(name = "cpGender", length = 50)
    private String cpGender;
    @Size(max = 50)
    @Column(name = "cpTname", length = 50)
    private String cpTname;
    @Size(max = 50)
    @Column(name = "cpTfname", length = 50)
    private String cpTfname;
    @Size(max = 50)
    @Column(name = "cpTreligion", length = 50)
    private String cpTreligion;
    @Size(max = 50)
    @Column(name = "cpTeducation", length = 50)
    private String cpTeducation;
    @Size(max = 50)
    @Column(name = "cpTvt", length = 50)
    private String cpTvt;
    @Size(max = 50)
    @Column(name = "cpTlk", length = 50)
    private String cpTlk;
    @Size(max = 50)
    @Column(name = "cpTncd", length = 50)
    private String cpTncd;
    @Size(max = 50)
    @Column(name = "cpTemp", length = 50)
    private String cpTemp;
    @Size(max = 50)
    @Column(name = "cpTdoa", length = 50)
    private String cpTdoa;
    @Size(max = 50)
    @Column(name = "cpCds", length = 50)
    private String cpCds;
    @Size(max = 50)
    @Column(name = "cpDay", length = 50)
    private String cpDay;
    @Size(max = 50)
    @Column(name = "cpMon", length = 50)
    private String cpMon;
    @Size(max = 50)
    @Column(name = "cpYr", length = 50)
    private String cpYr;
    @Size(max = 50)
    @Column(name = "cpParent", length = 50)
    private String cpParent;
    @Size(max = 50)
    @Column(name = "cpBehavior", length = 50)
    private String cpBehavior;
    @Size(max = 50)
    @Column(name = "cpHstatus", length = 50)
    private String cpHstatus;
    @Size(max = 50)
    @Column(name = "cpRelationcf", length = 50)
    private String cpRelationcf;
    @Size(max = 50)
    @Column(name = "cpRelationf", length = 50)
    private String cpRelationf;
    @Size(max = 50)
    @Column(name = "cpSafety", length = 50)
    private String cpSafety;
    @Size(max = 50)
    @Column(name = "cpCdifficulty", length = 50)
    private String cpCdifficulty;
    @Size(max = 50)
    @Column(name = "cpFdifficulty", length = 50)
    private String cpFdifficulty;
    @Size(max = 50)
    @Column(name = "cpHhold", length = 50)
    private String cpHhold;
    @Size(max = 50)
    @Column(name = "cpVT", length = 50)
    private String cpVT;
    @Size(max = 50)
    @Column(name = "cpMiscellaneous", length = 50)
    private String cpMiscellaneous;
    @Size(max = 50)
    @Column(name = "cpTime", length = 50)
    private String cpTime;
    @Size(max = 50)
    @Column(name = "cpSname", length = 50)
    private String cpSname;
    @Size(max = 50)
    @Column(name = "cpTpmet", length = 50)
    private String cpTpmet;
    @Size(max = 50)
    @Column(name = "cpUnusual", length = 50)
    private String cpUnusual;
    @Size(max = 50)
    @Column(name = "cpFeed", length = 50)
    private String cpFeed;
    @Size(max = 50)
    @Column(name = "cpPeerAtt", length = 50)
    private String cpPeerAtt;
    @Size(max = 50)
    @Column(name = "cpChildAtt", length = 50)
    private String cpChildAtt;
    @Size(max = 50)
    @Column(name = "cpWork", length = 50)
    private String cpWork;
    @Size(max = 50)
    @Column(name = "cpHours", length = 50)
    private String cpHours;
    @Size(max = 50)
    @Column(name = "cpChattw", length = 50)
    private String cpChattw;
    @Size(max = 50)
    @Column(name = "cpViolation", length = 50)
    private String cpViolation;
    @Size(max = 50)
    @Column(name = "cpNreason", length = 50)
    private String cpNreason;
    @Size(max = 50)
    @Column(name = "cpRehab", length = 50)
    private String cpRehab;
    @Size(max = 50)
    @Column(name = "cName", length = 50)
    private String cName;
    @Size(max = 50)
    @Column(name = "cpPrepare", length = 50)
    private String cpPrepare;
    @Size(max = 50)
    @Column(name = "cpProbationD", length = 50)
    private String cpProbationD;
    @Size(max = 50)
    @Column(name = "cpProbationM", length = 50)
    private String cpProbationM;
    @Size(max = 20)
    @Column(name = "cpProbationY", length = 20)
    private String cpProbationY;
    @Size(max = 50)
    @Column(name = "cpDonv", length = 50)
    private String cpDonv;
    @Size(max = 50)
    @Column(name = "cpAp", length = 50)
    private String cpAp;

    public FcForm10() {
    }

    public FcForm10(Integer id) {
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

    public String getCpFirno() {
        return cpFirno;
    }

    public void setCpFirno(String cpFirno) {
        this.cpFirno = cpFirno;
    }

    public String getCpPstaion() {
        return cpPstaion;
    }

    public void setCpPstaion(String cpPstaion) {
        this.cpPstaion = cpPstaion;
    }

    public String getCpUsec() {
        return cpUsec;
    }

    public void setCpUsec(String cpUsec) {
        this.cpUsec = cpUsec;
    }

    public String getCpMatter() {
        return cpMatter;
    }

    public void setCpMatter(String cpMatter) {
        this.cpMatter = cpMatter;
    }

    public String getCpVs() {
        return cpVs;
    }

    public void setCpVs(String cpVs) {
        this.cpVs = cpVs;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getCpAge() {
        return cpAge;
    }

    public void setCpAge(String cpAge) {
        this.cpAge = cpAge;
    }

    public String getCpDate() {
        return cpDate;
    }

    public void setCpDate(String cpDate) {
        this.cpDate = cpDate;
    }

    public String getCpCare() {
        return cpCare;
    }

    public void setCpCare(String cpCare) {
        this.cpCare = cpCare;
    }

    public String getCpPname() {
        return cpPname;
    }

    public void setCpPname(String cpPname) {
        this.cpPname = cpPname;
    }

    public String getCpRegno() {
        return cpRegno;
    }

    public void setCpRegno(String cpRegno) {
        this.cpRegno = cpRegno;
    }

    public String getCpAgeapp() {
        return cpAgeapp;
    }

    public void setCpAgeapp(String cpAgeapp) {
        this.cpAgeapp = cpAgeapp;
    }

    public String getCpGender() {
        return cpGender;
    }

    public void setCpGender(String cpGender) {
        this.cpGender = cpGender;
    }

    public String getCpTname() {
        return cpTname;
    }

    public void setCpTname(String cpTname) {
        this.cpTname = cpTname;
    }

    public String getCpTfname() {
        return cpTfname;
    }

    public void setCpTfname(String cpTfname) {
        this.cpTfname = cpTfname;
    }

    public String getCpTreligion() {
        return cpTreligion;
    }

    public void setCpTreligion(String cpTreligion) {
        this.cpTreligion = cpTreligion;
    }

    public String getCpTeducation() {
        return cpTeducation;
    }

    public void setCpTeducation(String cpTeducation) {
        this.cpTeducation = cpTeducation;
    }

    public String getCpTvt() {
        return cpTvt;
    }

    public void setCpTvt(String cpTvt) {
        this.cpTvt = cpTvt;
    }

    public String getCpTlk() {
        return cpTlk;
    }

    public void setCpTlk(String cpTlk) {
        this.cpTlk = cpTlk;
    }

    public String getCpTncd() {
        return cpTncd;
    }

    public void setCpTncd(String cpTncd) {
        this.cpTncd = cpTncd;
    }

    public String getCpTemp() {
        return cpTemp;
    }

    public void setCpTemp(String cpTemp) {
        this.cpTemp = cpTemp;
    }

    public String getCpTdoa() {
        return cpTdoa;
    }

    public void setCpTdoa(String cpTdoa) {
        this.cpTdoa = cpTdoa;
    }

    public String getCpCds() {
        return cpCds;
    }

    public void setCpCds(String cpCds) {
        this.cpCds = cpCds;
    }

    public String getCpDay() {
        return cpDay;
    }

    public void setCpDay(String cpDay) {
        this.cpDay = cpDay;
    }

    public String getCpMon() {
        return cpMon;
    }

    public void setCpMon(String cpMon) {
        this.cpMon = cpMon;
    }

    public String getCpYr() {
        return cpYr;
    }

    public void setCpYr(String cpYr) {
        this.cpYr = cpYr;
    }

    public String getCpParent() {
        return cpParent;
    }

    public void setCpParent(String cpParent) {
        this.cpParent = cpParent;
    }

    public String getCpBehavior() {
        return cpBehavior;
    }

    public void setCpBehavior(String cpBehavior) {
        this.cpBehavior = cpBehavior;
    }

    public String getCpHstatus() {
        return cpHstatus;
    }

    public void setCpHstatus(String cpHstatus) {
        this.cpHstatus = cpHstatus;
    }

    public String getCpRelationcf() {
        return cpRelationcf;
    }

    public void setCpRelationcf(String cpRelationcf) {
        this.cpRelationcf = cpRelationcf;
    }

    public String getCpRelationf() {
        return cpRelationf;
    }

    public void setCpRelationf(String cpRelationf) {
        this.cpRelationf = cpRelationf;
    }

    public String getCpSafety() {
        return cpSafety;
    }

    public void setCpSafety(String cpSafety) {
        this.cpSafety = cpSafety;
    }

    public String getCpCdifficulty() {
        return cpCdifficulty;
    }

    public void setCpCdifficulty(String cpCdifficulty) {
        this.cpCdifficulty = cpCdifficulty;
    }

    public String getCpFdifficulty() {
        return cpFdifficulty;
    }

    public void setCpFdifficulty(String cpFdifficulty) {
        this.cpFdifficulty = cpFdifficulty;
    }

    public String getCpHhold() {
        return cpHhold;
    }

    public void setCpHhold(String cpHhold) {
        this.cpHhold = cpHhold;
    }

    public String getCpVT() {
        return cpVT;
    }

    public void setCpVT(String cpVT) {
        this.cpVT = cpVT;
    }

    public String getCpMiscellaneous() {
        return cpMiscellaneous;
    }

    public void setCpMiscellaneous(String cpMiscellaneous) {
        this.cpMiscellaneous = cpMiscellaneous;
    }

    public String getCpTime() {
        return cpTime;
    }

    public void setCpTime(String cpTime) {
        this.cpTime = cpTime;
    }

    public String getCpSname() {
        return cpSname;
    }

    public void setCpSname(String cpSname) {
        this.cpSname = cpSname;
    }

    public String getCpTpmet() {
        return cpTpmet;
    }

    public void setCpTpmet(String cpTpmet) {
        this.cpTpmet = cpTpmet;
    }

    public String getCpUnusual() {
        return cpUnusual;
    }

    public void setCpUnusual(String cpUnusual) {
        this.cpUnusual = cpUnusual;
    }

    public String getCpFeed() {
        return cpFeed;
    }

    public void setCpFeed(String cpFeed) {
        this.cpFeed = cpFeed;
    }

    public String getCpPeerAtt() {
        return cpPeerAtt;
    }

    public void setCpPeerAtt(String cpPeerAtt) {
        this.cpPeerAtt = cpPeerAtt;
    }

    public String getCpChildAtt() {
        return cpChildAtt;
    }

    public void setCpChildAtt(String cpChildAtt) {
        this.cpChildAtt = cpChildAtt;
    }

    public String getCpWork() {
        return cpWork;
    }

    public void setCpWork(String cpWork) {
        this.cpWork = cpWork;
    }

    public String getCpHours() {
        return cpHours;
    }

    public void setCpHours(String cpHours) {
        this.cpHours = cpHours;
    }

    public String getCpChattw() {
        return cpChattw;
    }

    public void setCpChattw(String cpChattw) {
        this.cpChattw = cpChattw;
    }

    public String getCpViolation() {
        return cpViolation;
    }

    public void setCpViolation(String cpViolation) {
        this.cpViolation = cpViolation;
    }

    public String getCpNreason() {
        return cpNreason;
    }

    public void setCpNreason(String cpNreason) {
        this.cpNreason = cpNreason;
    }

    public String getCpRehab() {
        return cpRehab;
    }

    public void setCpRehab(String cpRehab) {
        this.cpRehab = cpRehab;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCpPrepare() {
        return cpPrepare;
    }

    public void setCpPrepare(String cpPrepare) {
        this.cpPrepare = cpPrepare;
    }

    public String getCpProbationD() {
        return cpProbationD;
    }

    public void setCpProbationD(String cpProbationD) {
        this.cpProbationD = cpProbationD;
    }

    public String getCpProbationM() {
        return cpProbationM;
    }

    public void setCpProbationM(String cpProbationM) {
        this.cpProbationM = cpProbationM;
    }

    public String getCpProbationY() {
        return cpProbationY;
    }

    public void setCpProbationY(String cpProbationY) {
        this.cpProbationY = cpProbationY;
    }

    public String getCpDonv() {
        return cpDonv;
    }

    public void setCpDonv(String cpDonv) {
        this.cpDonv = cpDonv;
    }

    public String getCpAp() {
        return cpAp;
    }

    public void setCpAp(String cpAp) {
        this.cpAp = cpAp;
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
        if (!(object instanceof FcForm10)) {
            return false;
        }
        FcForm10 other = (FcForm10) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdac.usermanagement.ORM.FcForm10[ id=" + id + " ]";
    }
    
}
