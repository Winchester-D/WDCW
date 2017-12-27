-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 18, 2017 at 11:41 AM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `jjb_final`
--

-- --------------------------------------------------------

--
-- Table structure for table `court_surrender`
--

CREATE TABLE IF NOT EXISTS `court_surrender` (
  `ACCUSED_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIR_NO` varchar(20) NOT NULL,
  `POLICE_STATION` varchar(30) NOT NULL,
  `PROCEEDING_GD_NO` varchar(30) DEFAULT NULL,
  `ACODE_ACCU` varchar(10) DEFAULT NULL,
  `ACCU_ARREST_DATE` datetime NOT NULL,
  `ACCU_ARREST_PS` varchar(30) DEFAULT NULL,
  `ACCU_ARREST_DISTRICT` varchar(30) DEFAULT NULL,
  `ACCU_SURRENDER_COURT` varchar(30) DEFAULT NULL,
  `ACCU_ACTS_SEC` varchar(50) DEFAULT NULL,
  `ACCU_ARREST_TYPE` varchar(50) DEFAULT NULL,
  `ACCU_NAME` varchar(50) NOT NULL,
  `ACCU_FATHER_NAME` varchar(50) DEFAULT NULL,
  `ACCU_FIRST_ALIAS` varchar(50) DEFAULT NULL,
  `ACCU_SEC_ALIAS` varchar(50) DEFAULT NULL,
  `ACCU_NATIONALITY` varchar(30) DEFAULT NULL,
  `ACCU_VOTER_ID_NO` varchar(30) DEFAULT NULL,
  `ACCU_PP_NO` varchar(20) DEFAULT NULL,
  `ACCU_PP_ISSU_DATE` date DEFAULT NULL,
  `ACCU_PP_ISSU_PLACE` varchar(30) DEFAULT NULL,
  `ACCU_RELIGION` varchar(30) DEFAULT NULL,
  `ACCU_CASTE` varchar(30) DEFAULT NULL,
  `ACCU_CASTE_TYPE` varchar(30) DEFAULT NULL,
  `ACCU_OCCU` varchar(30) DEFAULT NULL,
  `ACCU_ADDRESS` text,
  `ACCU_DISTRICT` varchar(30) DEFAULT NULL,
  `ACCU_PS` varchar(30) DEFAULT NULL,
  `ACCU_PRESENT_ADDR` text,
  `ACCU_PRESENT_ADDR_PS` varchar(30) DEFAULT NULL,
  `ACCU_INJURIES` text,
  `ACCU_CUSTODY_DATE_TIME` timestamp NULL DEFAULT NULL,
  `ACCU_CUSTODY_PLACE` varchar(100) NOT NULL,
  `ACCU_SEARCH_ARTICLE1` varchar(100) DEFAULT NULL,
  `ACCU_SEARCH_ARTICLE2` varchar(100) DEFAULT NULL,
  `ACCU_INTIMATION_NAME` varchar(40) NOT NULL,
  `ACCU_INTIMATION_RELATION` varchar(30) NOT NULL,
  `ACCU_INTIMATION_DATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ACCU_GENDER` varchar(10) NOT NULL,
  `ACCU_AGE` int(11) NOT NULL,
  `ACCU_BUILD` varchar(30) DEFAULT NULL,
  `ACCU_HEIGHT` varchar(20) DEFAULT NULL,
  `ACCU_COMPLEXION` varchar(20) DEFAULT NULL,
  `ACCU_IDENT_MARKS` text,
  `ACCU_DEFORMITIES` varchar(40) DEFAULT NULL,
  `ACCU_TEETH` varchar(30) DEFAULT NULL,
  `ACCU_HAIR` varchar(30) DEFAULT NULL,
  `ACCU_EYES` varchar(30) DEFAULT NULL,
  `ACCU_HABITS` varchar(100) DEFAULT NULL,
  `ACCU_DRESS_HABITS` varchar(40) DEFAULT NULL,
  `ACCU_LANGUAGE` varchar(40) DEFAULT NULL,
  `ACCU_BURN_MARK` varchar(40) DEFAULT NULL,
  `ACCU_LEUCODERMA` varchar(30) DEFAULT NULL,
  `ACCU_MOLE` varchar(40) DEFAULT NULL,
  `ACCU_SEAR` varchar(30) DEFAULT NULL,
  `ACCU_TATOO` varchar(50) DEFAULT NULL,
  `ACCU_OTHER_FEATURES` text,
  `ACCU_FP_TAKEN` varchar(5) DEFAULT NULL,
  `ACCU_LIVING_STAT` int(11) DEFAULT NULL,
  `ACCU_EDU_QUA` varchar(50) DEFAULT NULL,
  `ACCU_REAL_OCCU` varchar(50) DEFAULT NULL,
  `ACCU_INCOME_GROUP` int(11) DEFAULT NULL,
  `ACCU_DANGEROUS` varchar(5) DEFAULT NULL,
  `ACCU_PREV_JUMPED_BAIL` varchar(5) DEFAULT NULL,
  `ACCU_GEN_ARMED` varchar(5) DEFAULT NULL,
  `ACCU_ACCOMPLICES` varchar(5) DEFAULT NULL,
  `ACCU_KNOWN_CRI` varchar(5) DEFAULT NULL,
  `ACCU_RECIVIDIST` varchar(5) DEFAULT NULL,
  `ACCU_LIKELY_JUMP_BAIL` varchar(5) DEFAULT NULL,
  `ACCU_LIKELY_THREATEN` varchar(5) DEFAULT NULL,
  `ACCU_WANTED_OTHER_CASE` varchar(5) DEFAULT NULL,
  `NAME_ADDR_WITNESS1` text,
  `NAME_ADD_WITNESS2` text,
  `IO_NAME` varchar(50) NOT NULL,
  `IO_RANK` varchar(40) NOT NULL,
  `COURT_SURR_PLACE` varchar(30) NOT NULL,
  `COURT_SURR_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `PARENT_INTIMATION_SENT` varchar(5) DEFAULT NULL,
  `ACCU_PLACED_INST` text,
  `ACCU_JJB_PLACE` varchar(40) DEFAULT NULL,
  `ACCU_JJB_DATE` timestamp NULL DEFAULT NULL,
  `ACCU_CHARGE_REASON` text,
  PRIMARY KEY (`ACCUSED_ID`),
  KEY `fk_fir_details` (`FIR_NO`,`POLICE_STATION`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=44 ;

--
-- Dumping data for table `court_surrender`
--

INSERT INTO `court_surrender` (`ACCUSED_ID`, `FIR_NO`, `POLICE_STATION`, `PROCEEDING_GD_NO`, `ACODE_ACCU`, `ACCU_ARREST_DATE`, `ACCU_ARREST_PS`, `ACCU_ARREST_DISTRICT`, `ACCU_SURRENDER_COURT`, `ACCU_ACTS_SEC`, `ACCU_ARREST_TYPE`, `ACCU_NAME`, `ACCU_FATHER_NAME`, `ACCU_FIRST_ALIAS`, `ACCU_SEC_ALIAS`, `ACCU_NATIONALITY`, `ACCU_VOTER_ID_NO`, `ACCU_PP_NO`, `ACCU_PP_ISSU_DATE`, `ACCU_PP_ISSU_PLACE`, `ACCU_RELIGION`, `ACCU_CASTE`, `ACCU_CASTE_TYPE`, `ACCU_OCCU`, `ACCU_ADDRESS`, `ACCU_DISTRICT`, `ACCU_PS`, `ACCU_PRESENT_ADDR`, `ACCU_PRESENT_ADDR_PS`, `ACCU_INJURIES`, `ACCU_CUSTODY_DATE_TIME`, `ACCU_CUSTODY_PLACE`, `ACCU_SEARCH_ARTICLE1`, `ACCU_SEARCH_ARTICLE2`, `ACCU_INTIMATION_NAME`, `ACCU_INTIMATION_RELATION`, `ACCU_INTIMATION_DATE_TIME`, `ACCU_GENDER`, `ACCU_AGE`, `ACCU_BUILD`, `ACCU_HEIGHT`, `ACCU_COMPLEXION`, `ACCU_IDENT_MARKS`, `ACCU_DEFORMITIES`, `ACCU_TEETH`, `ACCU_HAIR`, `ACCU_EYES`, `ACCU_HABITS`, `ACCU_DRESS_HABITS`, `ACCU_LANGUAGE`, `ACCU_BURN_MARK`, `ACCU_LEUCODERMA`, `ACCU_MOLE`, `ACCU_SEAR`, `ACCU_TATOO`, `ACCU_OTHER_FEATURES`, `ACCU_FP_TAKEN`, `ACCU_LIVING_STAT`, `ACCU_EDU_QUA`, `ACCU_REAL_OCCU`, `ACCU_INCOME_GROUP`, `ACCU_DANGEROUS`, `ACCU_PREV_JUMPED_BAIL`, `ACCU_GEN_ARMED`, `ACCU_ACCOMPLICES`, `ACCU_KNOWN_CRI`, `ACCU_RECIVIDIST`, `ACCU_LIKELY_JUMP_BAIL`, `ACCU_LIKELY_THREATEN`, `ACCU_WANTED_OTHER_CASE`, `NAME_ADDR_WITNESS1`, `NAME_ADD_WITNESS2`, `IO_NAME`, `IO_RANK`, `COURT_SURR_PLACE`, `COURT_SURR_DATE`, `PARENT_INTIMATION_SENT`, `ACCU_PLACED_INST`, `ACCU_JJB_PLACE`, `ACCU_JJB_DATE`, `ACCU_CHARGE_REASON`) VALUES
(1, '8/2013', 'tukaramgate', '', 'A1', '2014-11-26 09:00:00', 'Tukaramgate', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Tamatto Pavan Singh @ Dammer', 'T.Ram Singh', 'Dammer', '', 'Nepal', '', '', NULL, '', '', 'Tomatto', 'Nepali', 'Private Job', 'R/o.H.No.10-3-162/ GF, Amedkarnagar. Teachers colony, East Maredpally, Sec-bad', 'Hyd', 'Tukaramgate', 'R/o.H.No.10-3-162/ GF, Amedkarnagar. Teachers colony, East Maredpally, Sec-bad', 'Tukaramgate', '', '2013-12-02 00:00:00', 'MCH, Park, Teachers Colony,Sec-bad', '', '', 'Ram Singh', 'Father', '2014-11-26 08:30:00', 'Male', 15, 'lean', '160', 'Fair', '', '', '', '', '', '', '', '', '', '', '', '', 'OM Tattp ', '', 'Yes', 1, '', '', 1, 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'No', 'No', '', '', 'N.Venkatesham', 'Sub-Inspector of Police', 'Tukaramgate', '2013-02-12 00:00:00', 'yes', 'OHB', 'Vth addl CMM  at Hyderabad', '2013-02-12 12:45:00', '379 IPC '),
(2, '228/2013', 'kulsumapura', '', 'BJ3', '2014-11-28 09:45:00', 'Kulsumpur', 'Hyderabad', 'Nil', 'U/s 379 IPC', 'Arrested and forwarded', 'Mohd, Ghouse', 'Mohd. Pasha', '', '', 'Indian', '', '', NULL, '', '', '', '', '', 'H.No.13-3-1103/20, joshiwadi, Jiyaguda, Hyderabad', 'Hyderabad', 'kulsumpura', 'H.No.13-3-1103/20, joshiwadi, Jiyaguda, Hyderabad', 'kulsumpura', 'Nil', '2014-11-28 09:45:00', 'Sabzimandi, Jiyaguda', 'NIL', 'NIL', 'Mohd.Pasha', 'Father', '2014-11-28 10:00:00', 'M', 10, 'Stout', '140', 'Medium', 'A mole on the middle of the chest', '', '', '', '', '', '', '', '', '', '', '', '', 'Nil', 'No', 2, 'Nil', 'Nil', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Md.Pasha', '', 'Y.V.Santa Rao', 'Sl of Police', 'Kulsumpura', '2013-12-30 00:00:00', NULL, NULL, NULL, NULL, NULL),
(3, '228/2013', 'kulsumapura', '', 'BJ1', '2014-11-28 12:10:00', 'Kulsumpur', 'Hyderabad', 'Nil', '379 IPC', 'Arrested and forwarded', 'Syed.Ashraf', 'Syed.Arif', '', '', '', '', '', NULL, '', 'Islam', '', '', '', 'H.No.13-3-1103/20, joshiwadi, Jiyaguda, Hyderabad', 'Hyderabad', '', 'H.No.13-3-1103/20, joshiwadi, Jiyaguda, Hyderabad', '', 'NIL', '2014-11-28 09:15:00', 'Sabzimandi, Jiyaguda', 'NIL', 'NIL', 'Syed.Arif', 'Father', '2014-11-28 10:00:00', '', 10, 'lean', '140', 'dark', 'A mole on  the left side  chin', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 2, '', '', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Syed.Arif', '', 'Y.V.Santa Rao', 'Sl of Police', 'Kulsumpura', '2013-12-13 00:00:00', 'yes', 'OHB,Saifabad', 'Vth addl CMM  at Hyderabad', '2013-12-13 10:00:00', 'In Cr. no228/2011 U/s 379 IPC'),
(4, '136/2013', 'Madannapet', '', 'BJ1', '2014-12-11 10:00:00', 'Madannapet', 'Hyderabad', '', '380 IPC', '', 'Mohd Samad Ahmed', 'Mohd Mahamood Ahmed', 'faisal', 'nil', 'Indian', '', '', NULL, '', 'Islam', 'Muslim', 'OC', 'Student', 'R/o.H.No.17-1-130/61. Ramchandra Nagar, Madannapet, Hyd', 'Hyderabad', 'Madannapet', 'Do', '', 'Medical Certificate enclosed herewith', '2014-12-11 10:00:00', '', 'Nothing found expect wearing cloths', '', 'Mohd Mahmood Ahmed', 'Father', '2014-12-11 10:00:00', 'M', 17, 'Medium', '5''6', 'Fair', 'A mole on the right side of nose', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Yes', 2, 'Degree 1st year', 'Student', -1, 'No', 'No', 'No', 'No', 'No', 'Yes', 'Yes', 'No', 'No', 'Sri.Mohd Maqsud Ahmed S/o. Late Mohd Aziz, ramchandra nagar Hyd', '', 'Sri.K.P.V.Raju', 'Addl.Inspector of Police', 'Madannapet', '2013-07-20 00:00:00', NULL, NULL, NULL, NULL, NULL),
(5, '244/2014', 'Shahinayathgunj', '', '', '2014-12-11 16:00:00', 'Shahinayathgunj', 'Hyderabad', 'Nil', '379 IPC', '', 'Chetan Bhati', 'Ramesh Bhati', 'Laddu', 'nil', 'Indian', '', '', NULL, '', 'Hindu', 'Marwadi', 'nil', 'Private Job', 'R/o. H.No.15-8-141, Labour Adda, Begumbazar, Hyderabad', 'Hyderabad', 'Shahinayathgunj', 'H.No.15-8-141, Labour Adda, Begumbazar, Hyderabad', 'Shahinayathgunj', 'Nil', '2014-12-11 14:00:00', 'At Near Owntwadi grave Yard Begumbazar, Hyd', '', '', 'Sri.Ramesh Bhati', 'Father', '2014-12-11 14:00:00', 'M', 16, 'Thin Build', '5''3', 'Fair', 'A Mole on the right cheek', '', 'regular', 'black', 'black', 'Inhaling the synthetic rubber adhesive and consuming K.F. Beer', 'Shirt andpant', 'hindi/Marwadi', '', '', 'A mole on the cheek', '', '', '', 'Yes', 2, 'Illiterate', 'Centering work', 6, 'No', 'No', 'No', 'No', 'Yes', 'No', 'Yes', 'Yes', 'No', 'Sri.Ramesh, Hyderabad', '', 'Sri.M.Shankar', 'Sub-Inspector of Police', 'PS Shahinayathgunz', '2014-08-09 00:00:00', NULL, NULL, NULL, NULL, NULL),
(6, '119/2013', 'Bhavani Nagar', '', 'BJ1', '2014-12-11 13:30:00', 'Bhavaninagar', 'Hyderabad', '', ' 457, 380 IPc', '', 'Mohd Nadeem', 'Mohd shareef', 'Naeem', '', 'Indian', '', '', NULL, '', 'Muslim', 'Muslim', 'nil', 'Nil', 'H.No.18-8-534/128/A27/14, Edibazar, Kumarwadi, Bhavaninagar, Hyd', 'Hyd', 'Bhavaninagar', 'DO', 'Bhavaninagar', 'Yes', '2014-12-11 13:15:00', 'At Anand Hotel, Bhavaninagar', '', '', 'Sri.Naveed Ul Haq', 'Uncle', '2014-12-11 12:00:00', 'M', 15, 'Normal', '162 cm', 'Medium', 'A mole on the right side rib', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Yes', 2, '6th class', '', -1, 'No', 'No', 'No', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'Naveed ul haq, S/o.Mamood ali khan, reinbazar, hyderabad', '', 'Sri.P.Shankar', 'Inspector of police', 'PS Bhavaninagar', '2013-08-31 00:00:00', NULL, NULL, NULL, NULL, NULL),
(7, '356/2014', 'Malakpet', '', '', '2014-12-11 15:00:00', 'PS Malakpet', 'Hyderabad', 'Hon''ble V ACMM Court, HYD', '379 IPC', '', 'Prabhu', 'Sanjeeva', 'Prabhu', '', 'Indian', '', '', NULL, '', 'Christian', 'Madiga', 'SC', 'Student', 'H.No.16-11-476, Indranagar, Moosarambagh, Malakpet, Hyderabad', 'Hyderabad', 'Malakpet', 'DO', 'Malakpet', 'Nil', '2014-12-11 08:00:00', 'SBI Colony, Moosarambagh Malakpet', 'Nothing found expect wearing cloths', '', 'Sri.Sanjeeva', 'Father', '2014-12-11 10:00:00', 'M', 17, 'Medium', '5.4', 'Medium', 'A mole on the neck', '', 'regular', 'black', 'black', 'Cosuming beer', 'pant, Shirt', 'Telugu/Hindi', '', '', '', '', '', '', 'Yes', 2, '9th class', 'Student', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'Prabhu malakpet hyd', '', 'Sri.B.Raju Naik', 'Sub-Inspector of Police', 'Malakapet Hyd', '2014-07-11 00:00:00', NULL, NULL, NULL, NULL, NULL),
(8, '469/2013', 'Chikkadapally', '', '', '2014-12-11 12:30:00', 'Chikkadapally', 'Hyderabad', '', '337 IPC', '', 'Mohammed Riyaz', 'Late Mohd Rafi', '', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', 'Private Job', 'R/o Jyothi Nagar, Domalaguda', 'Hyderabad', 'Chikkadapally', 'DO', 'Chikkadapally', 'Nil', '2014-12-11 12:00:00', 'Domalaguda', '', '', 'Md.Munni', 'Mother', '2014-12-11 12:00:00', 'M', 17, 'Normal', '5.0', 'Medium', 'A mole the right hand', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, -1, '7th class', 'private job', -1, 'No', 'No', 'No', NULL, 'No', 'No', 'No', 'No', 'No', '', '', 'G.Janardhan', 'Sl of Police', 'PS Chikkadapally', '2014-07-28 00:00:00', NULL, NULL, NULL, NULL, NULL),
(9, '248/2014', 'Shahinayathgunj', '', 'BJ1', '2014-12-11 16:30:00', 'Shahinayathgunj', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Chetan Bhati', 'Ramesh Bhati', 'La', '', 'Indian', '', '', NULL, '', 'Hindu', 'Marwadi', '', 'Private Job', 'R/o H.No.15-8-141, Labour Adda Begumbazar, Hyd', 'Hyderabad', 'Shahinayathgunj', 'DO', '', 'Nil', '2014-12-11 14:00:00', 'At Near Owntwadi grave Yard Begumbazar, Hyd', '', '', 'Sri.Ramesh Bhati', 'Father', '2014-12-11 11:00:00', 'M', 16, 'Thin Build', '5.3', 'Fair', 'A Mole on the right cheek', '', 'regular', 'black', 'black', 'Inhaling the synthetic rubber adhesive and consuming K.F. Beer', 'pant, Shirt', 'hindi/Marwadi', '', '', 'A mole on the cheek', '', '', '', 'Yes', 2, 'Illiterate', 'Centering work', 6, 'No', 'No', 'No', 'No', 'Yes', 'No', 'Yes', 'Yes', 'No', 'Sri.Ramesh, Hyderabad', '', 'Sri.M.Shankar', 'Sub-Inspector of Police', 'Begumbazar', '2014-08-09 00:00:00', 'yes', 'Observation Home for Boys Saidabad Hyd', 'JJB Hyderabad', '2014-08-08 16:00:00', 'Nil'),
(10, '170/2014', 'Shahinayathgunj', '', 'BJ1', '2014-12-11 16:30:00', 'Shahinayathgunj', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Chetan Bhati', 'Ramesh Bhati', 'Laddu', '', '', '', '', NULL, '', 'Hindu', 'Marwadi', '', 'Private Job', 'H.No.15-8-141, Labour adda, Begumbazar,hyd', 'Hyderabad', 'Shahinayathgunj', 'Do', 'Shahinayathgunj', 'Nil', '2014-12-11 14:00:00', 'At Near Owntwadi grave Yard Begumbazar, Hyd', '', '', 'Sri.Ramesh Bhati', 'Father', '2014-12-11 14:00:00', 'M', 16, 'Thin Build', '5.3', 'Fair', 'A Mole on the right cheek', '', 'regular', 'black', 'black', 'Inhaling the synthetic rubber adhesive and consuming K.F. Beer', 'pant, Shirt', 'hindi/Marwadi', '', '', 'A mole on the cheek', '', '', '', 'Yes', 2, 'Illiterate', 'Centering work', 6, 'No', 'No', 'No', 'No', 'Yes', 'No', 'Yes', 'Yes', 'No', 'Sri.Ramesh, Hyderabad', '', 'Sri.M.Shankar', 'Sub-Inspector of Police', 'Begumbazar', '2014-08-09 00:00:00', NULL, NULL, NULL, NULL, NULL),
(11, '216/2012', 'Kanchanbagh', '', 'BJ1', '2014-12-11 11:45:00', 'Kanchanbagh', 'Hyderabad', '', '382 IPC', 'Arrested and forwarded', 'Mohd Akber', 'Mohd Siddique', 'Fizan', '', 'Indian', '', '', NULL, '', 'Muslim', 'Muslim', '', 'Plumber', 'H.No.18-8-187/22, Phisalbanda, Santhoshanagar, Hyd', 'Hyderabad', 'Santhoshnagar', 'Do', '', 'Enclosed Medical Fitness Certificate', '2014-12-11 07:00:00', 'Gandhistatu, Champapet', 'Nothing found expect wearing cloths', '', 'Smt.Nasrin begum', 'Mother', '2014-12-11 11:00:00', 'M', 17, 'slim', '5.6', 'dark', 'A mole on the right shoulder', '', 'normal', 'black', 'black', '', 'pant, Shirt', 'Hindi', '', '', '', '', '', '', 'Yes', 2, 'Nil', 'Plumber', -1, 'Yes', 'No', 'No', 'No', 'No', 'No', 'No', 'No', NULL, '', '', 'Sri.P.Srinivas', 'Sub-Inspector of Police', 'Kanchanbagh', '2013-09-04 00:00:00', NULL, NULL, NULL, NULL, NULL),
(12, '278/2013', 'Charminar', '', 'A1', '2014-12-22 18:30:00', 'Charminar', 'hyderabd', 'Nil', '382,309 IPC', '', 'Mohd Salman', 'Mohd Jani', 'salman', '', 'Indian', '', '', NULL, '', 'Muslim', 'BC-D', '', 'Book Seller', 'moin bagh, Barani sab ki dargah,santosh nagar,Hyd', 'Hyderabad', 'charminar', 'Do', 'charminar', 'medical certificate enclosed', '2014-12-22 14:45:00', 'Charminar', 'NIL', 'NIL', 'Mohd. Haji', 'brother', '2014-12-22 14:45:00', 'M', 19, 'Medium', '5.5', 'sallow', 'mole on fore head', '', '32', 'black', 'black', 'alcohal', 'pant, Shirt', 'Urdu/Hindi', '', '', 'A mole on fore head', '', '', '', 'Yes', -1, 'first class', 'book seller', 2, 'No', 'No', 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'Haji', '', 'Mohamed Maqdoom Ali', 'Sub-Inspector of Police', 'P.S Charminar', '2013-10-04 00:00:00', 'yes', '', 'JJB Hyderabad', '2013-10-04 15:00:00', 'Nil'),
(13, '147/2013', 'Habeebnagar', '', '', '2014-12-22 11:45:00', 'Habeebnagar', 'Hyderabad', '', '323, 506, 34 IPC', 'Arrested and forwarded', 'G.Nihanth Kumar', 'G.Krishna', 'Sonu', '', 'Indian', '', '', NULL, '', 'Hindu', '', '', 'Student', 'R/o H.No.11-1-249, Bhoiguda Kaman, Aghapura Dhobi Galli, Hyderabad', 'Hyderabad', 'Habeebnagar', 'R/o H.No.11-1-249, Bhoiguda Kaman, Aghapura Dhobi Galli, Hyderabad', 'Habeebnagar', 'nil', '2014-12-22 09:30:00', 'Near Matha Idol Bhoiguda Kaman', '', '', 'Sri.G.Krishna', 'Father', '2014-12-22 09:30:00', 'M', 17, 'thin', '178', 'Medium', 'A Mole on the right hand fore arm', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, -1, 'Degree pursuing', 'Student', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 'Sri.V.Ramakrishna Reddy', 'Sub-Inspector of Police', '', '2013-10-08 00:00:00', 'yes', 'Nil', 'JJB Hyderabad', '2013-10-08 11:45:00', 'Nil'),
(14, '117/2013', 'Nallakunta', '', '', '2014-12-22 17:45:00', 'Nallakunta', 'Hyderabad', '', '382 IPC', 'Arrested and forwarded', 'Salimella Susheel Chary', 'S.Venugopal', 'Nikhil', '', 'Indian', '', '', NULL, '', 'Hindu', 'Goldsmith', '', 'Working in shalini hospital', 'H.No.3-1-573/1, Kachibarthi, Nimboliadda, Kachiguda, Hyd', 'Hyderabad', 'Kachiguda', 'H.No.3-1-573/1, Kachibarthi, Nimboliadda, Kachiguda, Hyd', 'Kachiguda', 'nil', '2014-12-22 06:00:00', 'Nallakunta Railway bridge', 'Nothing found expect wearing cloths', '', 'S.Venugopal', 'Father', '2014-12-22 06:00:00', 'M', 19, 'lean', '5.8', 'Fair', 'A mole on the right ring finger', '', 'white', 'black', 'black', 'smoke , light drink KF Ben', 'pant, Shirt', 'Telugu/Hindi', 'at right leg', '', 'Men in col no 6', '', 'an left hand in chainees language as nikhil', '', 'Yes', 2, 'intermediate discontinue', 'Shalini hospital worker', 6, 'No', 'No', 'No', 'Yes', 'No', 'Yes', 'Yes', NULL, NULL, 'S.Venugopal age 42 years, securitygaurd', '', 'V.Venkateshwar Rao', 'Sub-Inspector of Police', 'Hyderabad', '2013-06-13 00:00:00', NULL, NULL, NULL, NULL, NULL),
(15, '289/2013', 'Marredpally', '', '', '2014-12-22 14:00:00', 'Maredpally', 'Hyderaad', '', '337 , 279 IPC and Sec 180 of MV Act', 'Arrested and forwarded', 'Bontha Surender', 'Bontha Venkanna', '', '', 'Indian', '', '', NULL, '', 'Hindu', 'BC(Vaddra)', 'BC', 'Student 1st year', 'Firmaguda,Wardhanna pet,Warangal-506313', '', 'Wardhannapet', 'Azadchandra shekar Nagar,Addagutta,Sec-ad', 'Thukaramgate', 'No', '2014-12-22 13:00:00', 'Maredpally', '', '', 'Komala', 'Mother', '2014-12-22 13:00:00', 'M', 17, 'Normal', '166', 'Medium', 'A mole on the chest', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 1, 'inter 1st year', 'Student', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Smt Komala', '', 'J.Niranjan Rao', 'Sub-Inspecter', 'Hyderabad', '2013-10-26 00:00:00', NULL, NULL, NULL, NULL, NULL),
(16, '124/2013', 'Kamatipura', '', '', '2014-12-22 12:10:00', 'Kamatipura', 'Hyderaad', '', '337 IPC', 'Arrested and forwarded', 'Syed Wajid', 'Syed Azam', '', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', 'Band Worker', 'R/o H.No 19-3-598/3,Gazi Banda,Inside Dargha Shara Zul Kathal,MisrrigunjHyderabad', 'Hyderabad', 'kamatipura', 'Do', 'Kamatipura', 'No', '2014-12-22 12:10:00', 'Kamatipura', '', '', 'Syed Azam', 'Father', '2014-12-22 12:10:00', 'M', 16, 'Lean', '5.0', 'Normal', 'A mole on the left side neck', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 2, 'Illiterate', 'Band Worker', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Syed Azam', '', 'K.Ravi Kumar', 'Sub-Inspecter', 'Hyderabad', '2013-12-19 00:00:00', NULL, NULL, NULL, NULL, NULL),
(17, '232/2013', 'Reinbazar', '', '', '2014-12-22 16:00:00', 'Reinbazar', 'Hyderaad', '', '324 IPC', 'Arrested and forwarded', 'Mohd.Ahmed Mohinuddin Dawood', 'Mohd Ibrahim Dawood', '', '', 'Indian', '', '', NULL, '', 'Muslim', '', 'OC', 'Student', 'Block No 2,9-3,Saidabad,Blice lines,Saidabad,Hyderabad', 'Hyderabad', 'Saidabad', '', '', 'Nill', '2014-12-22 15:30:00', 'Near Chanchalguda Govt school', '', '', 'Parvin Sultan', 'Mother', '2014-12-22 15:30:00', 'M', 14, 'Lean', '4.5', 'Dark', 'A mole on the index finger', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 2, '6th class', 'Student', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'Smt Parvin Sultana', '', 'P.Ramesh', 'Sub-Inspecter', 'Hyderabad', '2013-11-20 00:00:00', NULL, NULL, NULL, NULL, NULL),
(18, '212/2013', 'Mangalhat', '', '', '2014-12-23 10:00:00', 'Mangalhat', 'Hyderabad', '', '342 506 34 IPC', 'Arrested and forwarded', 'Sheetal Sing', 'Vinod Sing', '', '', 'Indian', '', '', NULL, '', 'Hindu', 'Lodha', 'BC', 'Student', 'H.No.14-10-51/1 Jinsichowrahi Mangalhat Hyderabad', 'Hyderabad', 'Mangalhat', 'H.No.14-10-51/1 Jinsichowrahi Mangalhat Hyderabad', 'Mangalhat', 'Nil', '2014-12-23 10:00:00', 'at mesldence', '', '', 'Lalithaai', 'Mother', '2014-12-23 10:00:00', 'M', 16, 'Medium', '5.7', 'Medium', 'A mole on the right hand', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No', 2, 'Intermediate', 'Student', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Smt.Lalithaai @ Lalli ', '', 'Sri.Jagadishwar rao', 'SI', 'Mangalhat', '2013-10-07 00:00:00', NULL, NULL, NULL, NULL, NULL),
(19, '114/2013', 'Shahinayathgunj', '', 'BJ1', '2014-12-23 11:00:00', 'Shahinayathgunj', 'Hyderabad', '', '435 IPC', 'Arrested and forwarded', 'S.Saikumar', 'Gopal', 'Sai', '', 'Indian', '', '', NULL, '', 'Hindu', 'Chakali', 'BC', 'Dhobi', 'R/o Chudibazar Near Ganesh Temple Shahinayathguni hyderaad', 'Hyderabad', 'S', 'R/o Chudibazar Near Ganesh Temple Shahinayathguni hyderaad', 'Shahinayathgunj', 'Nil', '2014-12-23 11:00:00', 'Shahinayathgunj', '', '', 'M.Suresh', 'Uncle', '2014-12-23 11:00:00', 'M', 17, 'leam', '155 cms', 'black', 'A mole on the right hand', '', '', '', '', '', '', '', '', '', '', '', '', '', 'Yes', 2, '7th class', '', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'M.Suresh', '', 'Pandary', 'SI', 'Shahinayathgunj', '2013-05-24 00:00:00', NULL, NULL, NULL, NULL, NULL),
(20, '60/2013', 'Abids', '', 'BJ1', '2014-12-23 14:00:00', 'Abids', 'Hyderabad', '', '382 511 IPC', 'Arrested and forwarded', 'Syed Nabed ahmed', 'Kaleel abdul majid', 'Farhan', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', 'Student', 'H No.20-4-209/1/5/1 kkilwath charminar', 'Hyderabad', 'hussainialam', 'H No.20-4-209/1/5/1 kkilwath charminar', 'hussainialam', 'nil', '2014-12-23 14:30:00', 'Jagadish market', '', '', 'Khaleel abdul majid', 'father', '2014-12-23 14:30:00', 'M', 17, 'Medium', '5.2', 'fair', 'a mole on the left side of the sholder', '', 'normal', 'black', 'black', '', 'paint shirt', '', '', '', '', '', '', '', NULL, 2, 'Intermediate 1st year', '', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Khaleel abdul majid', '', 'Md.Qasim ali', 'SI', 'abids', '2013-02-26 00:00:00', NULL, NULL, NULL, NULL, NULL),
(21, '228/2013', 'kulsumapura', '', 'BJ1', '2014-12-23 12:10:00', 'Kusulpura', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Syed Ashraf', 'Syed Arif', '', '', '', '', '', NULL, '', 'Islam', '', '', '', 'H No.13-3-1049/103 Indira Nagar Jiyaguda', 'Hyderabad', 'Kusulpura', 'H No.13-3-1049/103 Indira Nagar Jiyaguda', 'Kusulpura', 'nil', '2014-12-23 09:15:00', 'Sabzimandi jiyaguda', 'Nil', '', 'Syed Arif', 'father', '2014-12-23 09:30:00', 'M', 10, 'Lean', '140 cms', 'Dark', 'A mole on the chin', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No', 2, '', '', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Syed Arif', '', 'Y.V.Santa rao', 'SI', 'Kusulpura', '2013-12-31 00:00:00', NULL, NULL, NULL, NULL, NULL),
(22, '349/2013', 'Chikkadapally', '', '', '2014-12-23 11:00:00', 'Chikadapally', 'Hyderabad', '', '307 34 IPC', 'Arrested and forwarded', 'B.Bantu', 'Balraju', '', '', 'Indian', '', '', NULL, '', 'Hindu', '', '', '', 'R/o Sri Mayuri Theater lane Near RTC X Road Chikkadapally Hyd', 'Hyderabad', 'Chikkadapally', 'R/o Sri Mayuri Theater lane Near RTC X Road Chikkadapally Hyd', 'Chikkadapally', 'as per medically examined ', '2014-12-23 08:15:00', 'Chikkadapally', '', '', 'Rukkamma', 'aunty', '2014-12-23 08:15:00', 'M', 12, 'Medium', '5.1', 'black', 'A mole on the lest medial finger', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, -1, '', 'Rag picker', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Rukkamma', '', 'V.Pradeep Kumar', 'SI', 'Chikkadapally', '2013-09-23 00:00:00', NULL, NULL, NULL, NULL, NULL),
(23, '281/2013', 'GANDHINAGAR', '', '', '2014-12-23 19:20:00', 'Gandhi nagar', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Mohd Sameer', 'Mohd Moulana', '', '', 'Indian', '', '', NULL, '', 'Muslim', 'Muslim', 'OC', '', 'Navapet (V) Janagama (M) Warangar', 'Warangal', 'Warangal', 'H.No.1-9-346 Ramnagar Gundu Ramnagar Hyd', 'Nallakunta', 'Nil', '2014-12-23 19:20:00', 'Nallakunta', 'Nil', '', 'Parveen', 'Mother', '2014-12-23 19:20:00', 'M', 11, 'Medium', '159 cms', 'fair', 'a mole on the right side of the check', 'normal', 'black', 'black', 'black & White', 'Smoke', 'paint shirt', 'Telugu Hindi', '', '', 'right side of check', '', 'both hands', '', 'Yes', 2, '4th class', 'Student', 2, 'No', 'Yes', 'Yes', 'Yes', 'Yes', 'Yes', 'No', 'No', 'Yes', '', '', 'N.Karuna kumar', 'SI', 'Gandhi nagar', '2013-11-11 00:00:00', NULL, NULL, NULL, NULL, NULL),
(24, '59/2013', 'Saifabad', '', 'BJ1', '2014-12-24 22:45:00', 'Saifabad', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Mohd Saifuodin', 'Mohd Saleemudin', 'Saif', '', 'Indian', '', '', NULL, '', 'Muslim', 'OC', '', '', 'H.No.11-2-305 Nampally Govt Hospital Premises', 'Hyderabad', 'Habeebnagar', 'H.No.11-2-305 Nampally Govt Hospital Premises', 'Habeebnagar', 'Nil', '2014-12-24 20:00:00', 'at mind compound khairatabad hyd', '', '', 'Mohd Saleem', 'father', '2014-12-24 10:00:00', 'M', 17, 'normal', '5.5', 'fair', 'A mole on the right side neck', '', '', '', '', '', 'paint shirt', '', '', '', '', '', '', '', 'Yes', 2, 'Intermediate 1st year', '', -1, 'No', 'No', 'No', 'Yes', 'Yes', 'No', 'No', 'No', 'Yes', '', '', 'Kishan sing', 'Station House Officer', 'Saifabad', '2013-04-19 00:00:00', 'yes', 'H.No.11-4-352 Bazarghat Nampally Hyd', 'JJB Hyderabad', '2013-04-18 20:00:00', 'nil'),
(25, '59/2013', 'Saifabad', '', 'BJ2', '2014-12-24 22:45:00', 'Saifabad', 'Hyderabad', '', '379 IPC', 'Arrested and forwarded', 'Faisal bin ali', 'Ali bin Abdullah', 'Amer bin ali', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', '', 'H.No.11-4-352 Bazarghat back side Himalaya Hotel Hyd', 'Hyderabad', 'Nampally', 'H.No.11-4-352 Bazarghat back side Himalaya Hotel Hyd', 'Nampally', 'Nil', '2014-12-24 20:00:00', 'at mind compound khairatabad hyd', '', '', 'Ali bin Abdullah', 'father', '2014-12-24 11:00:00', 'M', 17, 'normal', '5.5', 'fair', 'a mole on the right arm', '', '', '', '', '', 'paint shirt', '', '', '', '', '', '', '', 'Yes', 2, 'Intermediate 1st year', '', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Ali bin Abdullah', '', 'Kishan sing', 'Station House Officer', 'Saifabad', '2013-04-19 00:00:00', NULL, NULL, NULL, NULL, NULL),
(26, '140/2014', 'Habeebnagar', '', 'BJ-1', '2014-12-24 11:00:00', 'Habeebnagar', 'Hyderabad', '', '160 IPC', 'Arrested and forwarded', 'Sameer baig', 'Hameed baig', '', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', 'Student', 'H.No.11-3-363 Mallepally Hyd', 'Hyderabad', 'Habeebnagar', 'H.No.11-3-363 Mallepally Hyd', 'Habeebnagar', 'injuries on his left side fore head and left hand.', '2014-12-24 10:30:00', 'Nil', '', '', 'Afsara', 'Mother', '2014-12-24 10:30:00', 'M', 16, 'Medium', '169 cms', 'fair', 'a mole the middle of the right hand', '', '', 'black', 'Normal', '', 'paint shirt', '', '', '', 'a mole on the middle of the right hand', '', '', '', NULL, 2, '', 'Student', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Afsara (Mother)', '', 'Sri.G.Venkanna', 'SI', 'Habeebnagar', '2014-07-17 00:00:00', 'yes', 'Observation Home at Saidabad Hyderaad', 'JJB Hyderabad', '2014-07-17 11:00:00', 'Nil'),
(27, '77/2013', 'Nallakunta', '', '', '2014-12-24 15:00:00', 'Nallakunata', 'Hyderabad', '', '382 IPC', 'Arrested and forwarded', 'Saleemella Susheel Chary', 'Venugopal', 'Nikhil', '', 'Indian', '', '', NULL, '', 'Hindu', '', '', '', 'H.No.3-1-573/1 Opp Martha temple Nimoliadda Kachguda Hyd', 'Hyderabad', 'Nallakunta', 'Nimoliadda Kachguda Hyd', 'Nallakunta', 'Nil', '2014-12-24 15:00:00', 'Nallakunta', 'Nil', '', 'Venugopal', 'father', '2014-12-24 15:00:00', 'M', 17, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 2, '', 'Nil', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 'G.Nareshkumar', 'SI', 'nallakunta', '2013-06-20 00:00:00', 'yes', 'Nil', 'JJB Hyderabad', '2013-06-20 15:00:00', 'Nil'),
(28, '56/2014', 'Musheerabad', '', 'BJ-1', '2014-12-26 13:00:00', 'Musheerabad', 'Hyderabad', '', '337 IPC & 181 MV Act', 'Arrested and forwarded', 'Mohd Abrar', 'S/o Mohd Aziz', 'Abrar', '', 'Indian', '', '', NULL, '', 'Muslim', 'Muslim', '', '', 'H.No.1-4-307/11/A Bholakpur Musheerabad Hyd', 'Hyderabad', 'Musheerabad', 'H.No.1-4-307/11/A Bholakpur Musheerabad Hyd', 'Musheerabad', 'Nil', '2014-12-26 12:00:00', 'PS Musheerabad', 'Nil', '', 'Sri.Md.Khaja Moinuddin', 'Uncle', '2014-12-26 12:00:00', 'M', 15, 'Medium', '5.6', 'black', 'A mole on the ringht cheek', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No', 2, '6th class', 'Mechanic', 3, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Sri.Md.Khaja Moinuddin', '', 'Mohd Amjad', 'Sub-Inspector of Police', 'Musheerabad', '2014-02-28 00:00:00', NULL, NULL, NULL, NULL, NULL),
(29, '266/2014', 'Asifnagar', '', '', '2014-12-26 17:00:00', 'Asifnagar', 'Hyderabad', '', '338 IPC', 'Arrested and forwarded', 'Aziz Ur Rahman', 'Abdul Jabbar', '', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', 'Student', 'H.No.12-1-160/4 Syed Aliguda Hyd', 'Hyderabad', 'Asifnagar', 'H.No.12-1-160/4 Syed Aliguda Hyd', 'Asifnagar', 'Nil', '2014-12-26 17:00:00', 'PS Asifnagar', 'Nil', '', 'Abdul Jabbar', 'father', '2014-12-26 17:00:00', 'M', 17, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No', 2, '', 'Student', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Yes', 'No', 'Abdul Jabbar', '', 'Sri.M.Rajashekhar', 'Sub-Inspector of Police', 'Hyderabad', '2014-11-11 00:00:00', NULL, NULL, NULL, NULL, NULL),
(30, '218/2013', 'Dabeerpura', '', 'BJ-1', '2014-12-26 10:00:00', '', 'Hyderabad', '', '186 427 341 IPC', 'Arrested and forwarded', 'Mohd Samiullah', 'Md.Rafarhullah', '', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', '', 'H.No.16-8-870 aiza college chanchalguda hyd', 'Hyderabad', 'chanchalguda', '', '', 'nil', '2014-12-26 09:00:00', 'PS Dabeerpura', 'Nil', '', 'Md.Rafarhullah', 'father', '2014-12-26 09:00:00', 'M', 17, 'Medium', '168 cms', 'fair', '', '', '', '', '', '', '', 'Urdu English', '', '', '', '', '', '', NULL, 2, '', 'Student', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Md.Rafarhullah', '', 'Sri.B.Vijaya bhaskar reddy', 'Sub-Inspector of Police', 'Hyderabad', '2014-07-22 00:00:00', NULL, NULL, NULL, NULL, NULL),
(31, '2/2014', 'Banjara Hills', '', 'BJ-1', '2014-12-27 09:30:00', 'Banjara Hills', 'Hyderabad', 'V Addl CMM Court Hyd', '448 354(D)', 'Arrested and forwarded', 'Bainla Sridhar', 'Paramaiah', '', '', 'Indian', '', '', NULL, '', 'Hindu', 'Mala', 'SC', '', 'R/o Shaikpet Darga Film Nagar Jubilee Hills Hyd', 'Hyderabad', 'Banjara Hills', 'D.No.9-20 Yellakonda Vikarabad RR Dist', '', 'No visile external injuries accused is eing sent for examination before producing Hon''ble Court.', '2014-12-27 09:00:00', 'ABN Darga Filmnagar Hyd', 'Nil', '', 'Sri.K.Yadagiri', 'Brother in law', '2014-12-27 09:00:00', 'M', 17, 'lean', '5', 'Medium', 'A mole on the left side of nose', '', 'White', 'black', 'black', 'Drink', 'paint shirt', 'Telugu ', '', '', '', '', '', '', NULL, 2, '10th', 'Student', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'B.Sridhar', '', 'B.Bhaskar Rao', 'Sub-Inspector of Police', 'PS Banjara Hills', '2014-01-02 00:00:00', 'yes', 'Nil', 'JJB Hyderabad', '2014-01-02 10:30:00', 'Nil'),
(32, '9/2014', 'Chilkalguda', '', 'BJ-1', '2014-12-27 16:00:00', 'Chilkalguda', 'Hyderabad', '', '363 376 IPC', 'Arrested and forwarded', 'P.Sravan', 'P.Raju', 'Ravi', '', 'Indian', '', '', NULL, '', 'Hindu', '', 'SC', 'Bike Mechanic', 'H.No.12-11-197/9 Warasigutta chilkalguda secunderabad', 'Hyderabad', 'Chilkalguda', 'H.No.12-11-197/9 Warasigutta chilkalguda secunderabad', 'Chilkalguda', 'Good', '2014-12-27 16:00:00', 'Chilkalguda', 'Nil', '', 'Shivakumar', 'Uncle', '2014-12-27 16:00:00', 'M', 16, 'Lean', '5.9', 'black', 'A black mole on the right hand', '', 'Intent', 'black', 'black', '', 'paint shirt', 'Telugu ', '', '', '', '', '', '', NULL, 2, '', 'bike mechanic', -1, 'Yes', 'No', 'No', 'Yes', 'No', 'No', 'No', 'No', 'No', 'T.Shivakumar', '', 'MD.Khaja ', 'Sub-Inspector of Police', 'PS Chilkarguda', '2014-01-18 00:00:00', NULL, NULL, NULL, NULL, NULL),
(33, '244/2014', 'Chikkadapally', '', 'A1', '2014-12-29 11:00:00', 'Chikkadapally', 'Hyderabad', '', '337 IPC', 'Arrested and released on bail or PR bond', 'I.Bhargav', 'Bikshapathi', '', '', 'Indian', '', '', NULL, '', 'Hindu', '', 'BC A', 'Student', 'Quarter No.7 Block C Shanthi Nagar Police Quaters AC Guards', 'Hyderabad', 'Chikkadapally', 'Quarter No.7 Block C Shanthi Nagar Police Quaters AC Guards', 'Chikkadapally', 'nil', '2014-12-29 10:45:00', 'Chikkadapally', 'Nil', '', 'I.Bikshapathi', 'Father', '2014-12-29 10:45:00', 'M', 17, 'normal', '5.1', 'Medium', 'A mole on the right side of neck', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No', -1, 'Intermediate 2nd year', 'Student', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Sri.I.Bikshapathi', '', 'MD.Ghiasuddin', 'HC CIVIL', 'PS Chikkadapally', '2014-05-01 00:00:00', 'yes', 'I.Bikshapathi S/o Dasharatharamaiah\r\nR/o Qtr No.7 lock C Shanthi Nagar Police Quarter AC Guard Hyd', 'JJB Hyderabad', '2014-05-01 11:00:00', 'Nil'),
(34, '100/2014', 'Narayanaguda', '', 'A1', '2014-12-29 15:00:00', 'Narayanguda', 'Hyderabad', '', '279 427 IPC', 'Arrested and released on bail or PR bond', 'Anshul Jain', 'Ajay Jain', 'Anshul', '', 'Indian', '', '', NULL, '', 'Jains', 'OC', '', 'Student', 'H.N.5-5-1044 Flt No.301 Raj Towers Apartments Goshamahal Hyd', 'Hyderabad', 'Narayanguda', 'H.N.5-5-1044 Flt No.301 Raj Towers Apartments Goshamahal Hyd', 'Narayanguda', 'Nil', '2014-12-29 14:45:00', 'PS Narayanguda', 'Nil', '', 'Sri.Ajay Jain', 'Father', '2014-12-29 02:45:00', 'M', 17, 'Stout', '5.7', 'Medium', 'A scar mark on the right leg', '', '', '', '', '', '', '', '', '', '', '', '', 'Nil', 'No', 2, 'Intermediate 1st year', 'Student', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Ajay jain', '', 'Sri.Ramlal', 'Sub-Inspector of Police', 'PS Narayanguda', '2014-02-26 00:00:00', NULL, NULL, NULL, NULL, NULL),
(35, '05/2014', 'Tappachabutra', '', '', '2014-12-29 18:00:00', 'Tappachabutra', 'Hyderabad', '', '338 IPC', 'Arrested and forwarded', 'Mote Nikhil @ Nikhil', 'Narsing rao', '', '', 'Indian', '', '', NULL, '', 'Hindu', '', 'BC', 'Student', 'H.No.13-5-431/5/C/1 Tallagadda Karwan Hyd', 'Hyderabad', 'Tappachautra', 'H.No.13-5-431/5/C/1 Tallagadda Karwan Hyd', 'Tappachautra', 'Nil', '2014-12-29 18:00:00', 'PS Tappachautra', 'Nil', '', 'M.Narsing Rao', 'Father', '2014-12-29 18:00:00', 'M', 17, 'Medium', '5.7', 'black', 'A mole on the left leg thigh', '', '', '', '', '', '', '', '', '', '', '', '', '', 'No', 2, 'Intermediate 2nd year', 'Student', -1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'M V S M', '', 'Sri.A.Nagaraju', 'Sub-Inspector of Police', 'PS Tappachautra', '2014-01-06 00:00:00', NULL, NULL, NULL, NULL, NULL),
(36, '250/2013', 'Hussainialam', '15', 'BJ-1', '2015-01-02 19:45:00', 'Hussainialam', 'Hyderaad', '', '380 IPC', 'Arrested and forwarded', 'Mohd Ali', 'Md.Mujeebuddin', 'Ali', '', 'Indian', '', '', NULL, '', 'Muslim', '', '', 'Band Play', 'H.No.20-4-576/1 Khilawath Hussainialam Hyd', 'Hyderabad', 'Hussainialam', 'H.No.20-4-576/1 Khilawath Hussainialam Hyd', 'Hussainialam', 'Nil', '2015-01-02 10:00:00', 'Hussainialam', 'Excepting wearing cloths no valuable were found', '', 'Maqbool Begum', 'Mother', '2015-01-02 10:00:00', 'M', 15, 'Normal', '5.2', 'Black', 'A mole on the right side of the chest', '', 'regular', 'Black', 'Black', '', 'Pant shirt', 'Hindi', '', '', '', '', '', '', NULL, 2, '7th class', 'Band Worker', 1, 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'No', 'No', '', '', 'K.Ramesh Goud', 'Sub-Inspecter', 'PS Hussainialam', '2013-12-29 00:00:00', 'yes', 'Nil', 'V ACMM Court Hyderabad', '2013-12-30 10:30:00', 'Nil'),
(37, '238/2014', 'Shahinayathgunj', '', 'BJ-1', '2015-01-02 11:30:00', 'Shahinayathgunj', 'Hyderaad', '', '381 IPC', 'Arrested and forwarded', 'Madumohe singh', 'Gavrango singh', 'Raju', '', 'Indian', '', '', NULL, '', 'Hindu', '', '', 'Navkar Plastic', 'Mou-Kachuadi -V Komarda-Post Thana Balasore dist Odisha state', '', '', 'H.No.13-1-432 back side Mangalhat PS Hyd', 'Mangalhat', 'Nil', '2015-01-02 09:30:00', 'at nearH.No.13-1-432 back side Mangalhat PS Hyd', 'Nil', '', 'Bhagaban Singh', 'Father', '2015-01-02 09:30:00', 'M', 17, 'Thin Build', '5.5', 'Medium', 'A mole on the left side abdominal', '', 'regular', 'Black', 'Black', 'Smoking cigaretes', '', 'Hindi/Odisha', '', '', '', '', '', '', 'Yes', 2, '', 'Private Survent', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'Yes', 'Yes', 'No', 'Bhagaban singh', '', 'M.Shankar', 'Sub-Inspecter', 'PS Shahinayathgunj', '2014-07-01 00:00:00', 'yes', 'Nil', 'V ACMM Court Hyderabad', '2014-08-01 10:30:00', 'Nil'),
(38, '349/2014', 'Malakpet', '', 'BJ-1', '2015-01-02 15:00:00', 'Malakpet', 'Hyderaad', 'Hon''le V ACMM Court Hyd', '379 IPC', 'Arrested and forwarded', 'M.Prabhu', 'Sanjeeva', 'Prabhu', '', 'Indian', '', '', NULL, '', 'Christian', '', 'SC', 'Student', 'H.No.16-11-476 Indranagar Moosaramag Malakpet Hyd', 'Hyderabad', 'Malakpet', 'H.No.16-11-476 Indranagar Moosaramag Malakpet Hyd', 'Malakpet', 'Nil', '2015-01-02 08:00:00', 'SBI Colony Malakpet', 'Nothing found excepting wearing clothes', '', 'Sanjeeva', 'Father', '2015-01-02 08:00:00', 'M', 17, 'Normal', '5.4', 'Medium', 'a mole on the neck', '', 'regular', 'Black', 'Black', 'Consuming beer', 'Pant shirt', 'Hindi / Telugu', '', '', '', '', '', '', 'Yes', 2, '9th class', 'Student', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'Sri.Sanjeeva', '', 'Sri.B.Rajunaik', 'Sub-Inspecter', 'Malakpet', '2014-07-11 00:00:00', 'yes', 'Observation Home Saidabad Hyderabad', 'V ACMM Court Hyderabad', '2014-07-11 15:30:00', 'Nil'),
(39, '349/2014', 'Malakpet', '', 'BJ-2', '2015-01-02 15:00:00', 'Malakpet', 'Hyderaad', 'Hon''le V ACMM Court Hyd', '379 IPC', 'Arrested and forwarded', 'G.Sachin', 'Ramulu', '', '', 'Indian', '', '', NULL, '', 'Hindu', 'Mala', 'SC', 'Student', 'H.No.16-11-100/A Band Basthi Moosarambag Malakpet Hyd', 'Hyderabad', 'Malakpet', 'H.No.16-11-100/A Band Basthi Moosarambag Malakpet Hyd', 'Malakpet', 'Nil', '2015-01-02 08:00:00', 'SBI Colony Malakpet', 'Nothing found excepting wearing clothes', '', 'Sathyamma', 'Mother', '2015-01-02 08:00:00', 'M', 16, 'Normal', '5.3', 'Medium', 'a mole on the chest', '', 'regular', 'Black', 'Black', '', 'Pant shirt', 'Hindi / Telugu', '', '', '', '', '', '', 'Yes', 2, '9th class', 'Student', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'Yes', 'No', 'No', 'Smt.Sathyamma', '', 'Sri.B.Rajunaik', 'Sub-Inspecter of Police', 'Malakpet', '2014-07-11 00:00:00', 'yes', 'Observation Home \r\nSaidabad\r\nHyderabad', 'V ACMM Court Hyderabad', '2014-07-11 15:30:00', 'Nil'),
(40, '246/2014', 'Shahinayathgunj', '', 'BJ-1', '2015-01-03 16:30:00', 'Shahinayathgunj', 'Hyderabad', 'V Addl CMM Court Hyd', '379 IPC', 'Arrested and forwarded', 'Chetan Bhati', 'Ramesh Bhati', 'Laddu', '', 'Indian', '', '', NULL, '', 'Hindu', 'Marwadi', '', 'Pvt Work', 'H.No.15-8-141 Labour Adda Begumbazar Hyd', 'Hyderabad', 'shahinayathgunj', 'H.No.15-8-141 Labour Adda Begumbazar Hyd', 'shahinayathgunj', 'Nil', '2015-01-03 14:00:00', 'at near Owntwadi Hyd', 'Nil', '', 'Ramesh Bhati', 'Father', '2015-01-03 14:00:00', 'M', 16, 'Thin Build', '5.3', 'Fair', 'A mole on right Cheek', '', 'normal', 'black', 'black', 'Inhaling the synthetic rubber adhesive and consuming beer', 'paint shirt', 'Marwadi/Hindi', '', '', 'A mole on right Cheek', '', '', '', 'Yes', 2, 'Illiterate', 'Centering Work', 1, 'No', 'No', 'No', 'No', 'Yes', 'No', 'Yes', 'Yes', 'No', 'Ramesh Bhati', '', 'M.Shankar', 'Sub-Inspector of Police', 'PS Shahinayathgunj', '2014-08-09 00:00:00', NULL, NULL, NULL, NULL, NULL),
(41, '9/2014', 'Shahinayathgunj', '', 'BJ-1', '2015-01-05 11:00:00', 'Shahinayathgunj', 'Hyderaad', '', '338 IPC', 'Arrested and forwarded', 'Manik', 'Prabhu', 'Heera', '', 'Indian', '', '', NULL, '', 'Hindu', '', 'BC', 'Auto Driver', 'H.No.14-10-617, Jinsi Chowrahi, Dholpet, Hyd', 'Hyderabad', '', 'H.No.14-10-617, Jinsi Chowrahi, Dholpet, Hyd', '', 'Nil', '2015-01-05 11:00:00', 'Dhoolpet', '', '', 'Babu rao', 'Elder Brother', '2015-01-05 11:00:00', 'M', 18, 'Lean', '5.6', 'Medium', '', '', 'Teech Cut', 'Black', 'Brown', 'Chooing Sagar Gutka', 'Pant shirt', '', '', '', '', '', '', '', 'No', 2, '', 'Auto Driver', 1, 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'No', 'Babu Rao', '', 'R.Krishnam Raju', 'Sub-Inspecter of Police', 'PS Shahinayathgunj', '2014-03-11 00:00:00', 'yes', 'Baburao\r\nH.No.14-10-617, JinsiChowrahi, Dhoolpet, Hyd', 'V ACMM Court Hyderabad', NULL, 'Nil'),
(42, '888/2014', 'Madannapet', '', '', '2015-01-06 08:00:00', '', '', '', '379 IPC', 'Arrested but released on Anticipatory Bail', 'test', '', '', '', '', '', '', NULL, '', '', '', '', '', '', '', '', '', '', '', '2015-01-06 09:00:00', 'test', '', '', 'test', 'Father', '2015-01-06 09:00:00', 'M', 8, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, -1, '', '', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 'test', 'Sl-CIVIL', 'hyd', '2013-12-19 00:00:00', 'yes', 'jjb', 'ctest', '2014-11-26 09:00:00', 'ctest'),
(43, '111/2015', 'pstest', '123', '', '2015-01-12 22:00:00', '', '', '', 'testcdac,11     ', '', 'ctest', '', '', '', '', '', '', NULL, '', '', '', '', '', '', '', '', '', '', '', '2015-01-12 22:00:00', 'ctest', '', '', 'ctest', 'ctest', '2015-01-12 23:00:00', 'M', 7, '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, -1, '', '', -1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '', '', 'ctest', '1111', 'ctest', '2015-01-13 00:00:00', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `enquiry_process`
--

CREATE TABLE IF NOT EXISTS `enquiry_process` (
  `TRIAL_NO` int(11) NOT NULL AUTO_INCREMENT,
  `CC_NO` varchar(20) NOT NULL,
  `TRIAL_DATE` date NOT NULL,
  `CHARGE_SHEET_FILED` varchar(5) NOT NULL,
  `CASE_TERMINATED` varchar(5) DEFAULT NULL,
  `TERMINATED_REMARKS` text,
  `BAIL_GRANTED` varchar(5) NOT NULL,
  `BAIL_OPTIONS` int(11) DEFAULT NULL,
  `ORDER_ISSUED` int(11) DEFAULT NULL,
  `ORDER_ISSUED_DETAILS` int(11) DEFAULT NULL,
  `FINAL_ORDER_FINE_DET` int(11) DEFAULT NULL,
  `FINE_DETAILS` int(5) DEFAULT NULL COMMENT 'fine paid details(optional)',
  `NEXT_HEARING_DATE` timestamp NULL DEFAULT NULL,
  `OBSERVATIONS` text,
  PRIMARY KEY (`TRIAL_NO`,`CC_NO`),
  KEY `CC_NO` (`CC_NO`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `enquiry_process`
--

INSERT INTO `enquiry_process` (`TRIAL_NO`, `CC_NO`, `TRIAL_DATE`, `CHARGE_SHEET_FILED`, `CASE_TERMINATED`, `TERMINATED_REMARKS`, `BAIL_GRANTED`, `BAIL_OPTIONS`, `ORDER_ISSUED`, `ORDER_ISSUED_DETAILS`, `FINAL_ORDER_FINE_DET`, `FINE_DETAILS`, `NEXT_HEARING_DATE`, `OBSERVATIONS`) VALUES
(1, '01/14', '2013-02-20', 'no', 'no', '', 'no', NULL, 3, NULL, 5, NULL, NULL, 'releaed under Lok-addalat'),
(2, '368/2014', '2014-12-18', 'yes', 'yes', '', 'yes', 1, 1, 2, NULL, NULL, '2014-12-18 00:00:00', 'Nil'),
(3, '31/2014', '2013-12-27', 'yes', NULL, '', 'yes', 1, NULL, NULL, NULL, NULL, '2014-07-30 00:00:00', 'In review of the above DPO commanded the Hon''ble court that the boy sent govt special home for boys to forget all his bad habbits and further rehabilitation for a periled of 1 year u/s 15(g) of JJ Act 2000. '),
(4, '70/2014', '2014-08-28', 'yes', NULL, '', 'yes', 1, NULL, NULL, NULL, NULL, '2014-03-12 00:00:00', 'He is a student\r\nHaving fixed place of abode\r\n'),
(5, '94/2014', '2014-08-01', 'yes', NULL, '', 'no', NULL, 3, NULL, 2, NULL, '2014-08-06 00:00:00', 'nil'),
(6, '22/15', '2015-01-07', 'no', 'yes', 'ctest', 'no', NULL, 3, NULL, 1, NULL, '2015-01-07 00:00:00', 'ctest'),
(7, '293/2014', '2015-01-08', 'no', 'no', '', 'no', NULL, 1, 2, NULL, NULL, '2015-01-09 00:00:00', 'testing'),
(8, '293/2014', '2015-01-09', 'no', 'no', '', 'no', NULL, 2, NULL, NULL, NULL, '2015-01-10 00:00:00', 'testing'),
(9, '293/2014', '2015-01-10', 'yes', NULL, '', 'no', NULL, 2, NULL, NULL, NULL, '2015-01-11 00:00:00', 'testing'),
(10, '293/2014', '2015-01-11', 'yes', NULL, '', 'yes', 1, NULL, NULL, NULL, NULL, '2015-01-12 00:00:00', 'testing'),
(11, '293/2014', '2015-01-12', 'yes', NULL, '', 'no', NULL, 3, NULL, 4, NULL, NULL, 'testing'),
(12, '368/2014', '2015-01-08', 'yes', NULL, '', 'no', NULL, 3, NULL, 4, 2, '2015-01-22 00:00:00', 'dfdfdf'),
(13, '62/2014', '2015-01-08', 'no', 'no', '', 'no', NULL, NULL, NULL, NULL, NULL, NULL, 'dfasf'),
(14, '297/2014', '2015-01-08', 'no', 'no', '', 'no', NULL, 1, 2, NULL, NULL, '2015-01-09 00:00:00', 'testing'),
(15, '297/2014', '2015-01-09', 'no', 'no', '', 'no', NULL, 2, NULL, NULL, NULL, '2015-01-10 00:00:00', 'testing'),
(16, '297/2014', '2015-01-10', 'no', 'no', '', 'yes', 1, NULL, NULL, NULL, NULL, '2015-01-11 00:00:00', 'testing'),
(17, '297/2014', '2015-01-11', 'no', 'no', '', 'no', NULL, 3, NULL, 4, 3, NULL, 'testing'),
(18, '73/2014', '2015-01-09', 'no', 'yes', 'testing', 'no', NULL, 3, NULL, 8, NULL, NULL, ''),
(19, '222/2015', '2015-01-16', 'yes', NULL, '', 'yes', 4, NULL, NULL, NULL, NULL, NULL, '');

-- --------------------------------------------------------

--
-- Table structure for table `fir`
--

CREATE TABLE IF NOT EXISTS `fir` (
  `FIR_NO` varchar(20) NOT NULL,
  `POLICE_STATION` varchar(30) NOT NULL,
  `DISTRICT` varchar(20) NOT NULL,
  `FIR_DATE` date NOT NULL,
  `ACT1` varchar(40) NOT NULL,
  `SECTION1` varchar(40) NOT NULL,
  `ACT2` varchar(40) DEFAULT NULL,
  `SECTION2` varchar(40) DEFAULT NULL,
  `ACT3` varchar(40) DEFAULT NULL,
  `SECTION3` varchar(40) DEFAULT NULL,
  `OTHER_ACT_SEC` varchar(40) DEFAULT NULL,
  `OFFENCE_DATE_TIME` datetime NOT NULL,
  `PS_INFO_REC_DATE` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `GEN_DAIRY_REF_ENTRY_NO` varchar(40) NOT NULL,
  `GEN_DAIRY_REF_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `TYPE_OF_INFO` varchar(40) DEFAULT NULL,
  `OFFENCE_PLACE_PS_DIST` varchar(40) DEFAULT NULL,
  `OFFENCE_PLACE_BEAT_NO` varchar(40) DEFAULT NULL,
  `OFFENCE_PLACE_ADDRESS` text NOT NULL,
  `OUTSIDE_LIMIT_PS` varchar(30) DEFAULT NULL,
  `OUTSIDE_LIMIT_PS_DISTRICT` varchar(20) DEFAULT NULL,
  `C_NAME` varchar(50) NOT NULL,
  `C_FATHER_NAME` varchar(50) DEFAULT NULL,
  `C_DOB` date DEFAULT NULL,
  `C_AGE` varchar(5) DEFAULT NULL,
  `C_NATIONALITY` varchar(30) DEFAULT NULL,
  `C_PP_NO` varchar(10) DEFAULT NULL,
  `C_PP_DATE` date DEFAULT NULL,
  `C_PP_ISSUE_PLACE` varchar(30) DEFAULT NULL,
  `C_OCCU` varchar(30) DEFAULT NULL,
  `C_ADDRESS` text,
  `SUSPECT_DETAILS` text,
  `C_REPO_DELAY_REA` text,
  `INVO_PROP_PATICU` text,
  `INVO_PROP_TOT_VAL` varchar(50) DEFAULT NULL,
  `UD_CASE_NO` varchar(40) DEFAULT NULL,
  `FIR_CONTENTS` text,
  `IO_NAME` varchar(50) DEFAULT NULL,
  `IO_RANK` varchar(40) DEFAULT NULL,
  `IO_SJPU` varchar(30) DEFAULT NULL,
  `TRANSFERRED_PS` varchar(30) DEFAULT NULL,
  `INCHARGE_NAME` varchar(50) NOT NULL,
  `INCHARGE_RANK` varchar(40) DEFAULT NULL,
  `INCHARGE_NO` varchar(30) DEFAULT NULL,
  `COURT_DISPACH_DATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`FIR_NO`,`POLICE_STATION`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fir`
--

INSERT INTO `fir` (`FIR_NO`, `POLICE_STATION`, `DISTRICT`, `FIR_DATE`, `ACT1`, `SECTION1`, `ACT2`, `SECTION2`, `ACT3`, `SECTION3`, `OTHER_ACT_SEC`, `OFFENCE_DATE_TIME`, `PS_INFO_REC_DATE`, `GEN_DAIRY_REF_ENTRY_NO`, `GEN_DAIRY_REF_TIME`, `TYPE_OF_INFO`, `OFFENCE_PLACE_PS_DIST`, `OFFENCE_PLACE_BEAT_NO`, `OFFENCE_PLACE_ADDRESS`, `OUTSIDE_LIMIT_PS`, `OUTSIDE_LIMIT_PS_DISTRICT`, `C_NAME`, `C_FATHER_NAME`, `C_DOB`, `C_AGE`, `C_NATIONALITY`, `C_PP_NO`, `C_PP_DATE`, `C_PP_ISSUE_PLACE`, `C_OCCU`, `C_ADDRESS`, `SUSPECT_DETAILS`, `C_REPO_DELAY_REA`, `INVO_PROP_PATICU`, `INVO_PROP_TOT_VAL`, `UD_CASE_NO`, `FIR_CONTENTS`, `IO_NAME`, `IO_RANK`, `IO_SJPU`, `TRANSFERRED_PS`, `INCHARGE_NAME`, `INCHARGE_RANK`, `INCHARGE_NO`, `COURT_DISPACH_DATE_TIME`) VALUES
('05/2014', 'Tappachabutra', 'JJB Hyderabad', '2014-01-04', 'IPC', '338', '', '', '', '', '', '2014-01-04 07:45:00', '2014-01-04 17:00:00', 'nil', '2014-01-04 17:00:00', 'written', '1 km, North-East', '3', 'Near Ramesh Medical Store, Jyothi Rao Phule Circle, Karwan, Hyd', '', '', 'Sri.K.Ashwini', 'S/o.Ramesh', NULL, '29', 'INDIAN', '', NULL, '', 'Private Job', 'H.No.12-2-417/50, Sharada Nagar Colony, Hyd', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.P.Yadagiri', 'Sub-Inspector of Police', 'nil', '2014-01-06 15:15:00'),
('100/2014', 'Narayanaguda', 'JJB Hyderabad', '2014-02-26', 'IPC', '279, 427', '', '', '', '', '', '2014-02-26 04:00:00', '2014-02-26 12:30:00', '1', '2014-02-26 12:30:00', 'written', '2km, West', '3', 'Opposit Tanishq Jewellers, Street No.2, Himayath Nagar, Hyd', '', '', 'Sri.J.satosh', 'S/o.J.Gopal', NULL, '24', 'INDIAN', '', NULL, '', 'Businessman', 'Domalaguda, Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.S.Daniel Shatikumar', 'SI-CIVIL', 'SI', '2014-02-28 16:00:00'),
('102/2014', 'Begumpet', 'JJB Hyderabad', '2014-03-09', 'IPC', '337', '', '', '', '', '', '2014-03-09 18:15:00', '2014-03-09 21:30:00', '1', '2014-03-09 21:30:00', 'written', '2 km East', '3', 'Near Parade Ground Parking Place, Begumpet, Hyd', '', '', 'Sri.M.Manikant', 'S/o. M.Srinivas', NULL, '21', 'INDIAN', '', NULL, '', 'Student', 'H .No.9-2-591, Regimental Bazar, Secunderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.P.Pramod Kumar', 'SI-CIVIL', 'SI 700397', '2014-03-28 11:00:00'),
('103/2013', 'Nallakunta', 'JJB Hyderabad', '2013-04-25', 'IPC', '382', '', '', '', '', '', '2013-04-25 07:45:00', '2013-04-25 09:00:00', '1', '2013-04-25 09:00:00', 'Telugu hand written', '2 K.M.,South-East', '', 'Tilak nagar, Narsing home lane, Tilak Nagar, Nallakunta, Hyd', '', '', 'Smt. G.Jaya Sree', 'W/o. G.Prabhakar', NULL, NULL, 'INDIAN', '', NULL, '', 'Beautication', 'R/o. H.No.3-13-14, Madhura Nagar, Ramanthapur, Ranga Reddy Dist, Hyd', 'Two unknow persons', 'No Delay', 'Gold Mangalasutram  and gold chain weghit about 3.5 tulas', '', '', 'IN THE COURT OF THE HON''BLE IV ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'Sri. V.Venkateshwara Rao', 'Sub-Inspector of Police', '', '', 'Sri. V.Venkateshwara Rao', 'sub inspector of Police', '', '2013-04-26 10:00:00'),
('111/2015', 'pstest', 'JJB Adilabad', '2015-01-12', 'testcdac', '11', '', '', '', '', '', '2015-01-12 22:00:00', '2015-01-12 22:00:00', '123', '2015-01-12 21:00:00', '', '', '', 'ctest', '', '', 'ctest', '', NULL, '', '', '', NULL, '', '', '', '', '', '', '', '', '', '', '', '', '', 'ctest', '123', '12', '2015-01-15 21:00:00'),
('114/2013', 'Shahinayathgunj', 'JJB Hyderabad', '2013-05-23', 'IPC', '435', '', '', '', '', '', '2013-05-23 15:45:00', '2013-05-23 16:30:00', '2', '2013-05-23 16:30:00', 'written', '1/2 K.M.,North-West', '1', 'at the open  place, beside CSW, Building', '', '', 'Sri K.Jaipal, pc 4919 of Goshamahal ', '', NULL, NULL, 'INDIAN', '', NULL, '', 'police officer', 'Hyderbad, A.P', '', 'No Delay', 'NIL', 'NIL', '', '', 'Pandari', 'Sl-CIVIL', '', '', 'CH.Dhana Raj', 'HC-CIVIL', 'HC-6367', '2013-05-24 00:00:00'),
('117/2013', 'Nallakunta', 'JJB Hyderabad', '2013-05-12', 'IPC', '382', '', '', '', '', '', '2013-05-12 08:45:00', '2013-05-12 09:30:00', 'nil', '2013-05-12 09:30:00', 'written', '', '', 'At Under Nallakunta rilway Bridge one way Nallakunta Hyderabad', '', '', 'Smt.G.Swarnalatha', 'G.Subramanyasharma', NULL, '60', 'INDIAN', '', NULL, '', 'House wife', 'Fl.No.304, B-Block, May Flower Hights, Opp Noma Function Hall Mallapur Rangareddy', '', '', 'Gold Necklece weight about 20 to 30 grams', '90,000/-', '', '', '', '', '', '', 'Sri. V.Venkateshwara Rao', 'Sub-Inspector of Police', 'nil', '2013-05-13 11:45:00'),
('119/2013', 'Bhavani Nagar', 'JJB Hyderabad', '2013-08-12', 'IPC', '457, 380', '', '', '', '', '', '2013-08-08 16:00:00', '2013-08-12 09:00:00', 'nil', '2013-08-12 09:00:00', 'written', '1km South', '1', 'At H.No.18-8-485/7/A, Kumariwadi, Bhavani Nagar, Hyderabad', '', '', 'Smt.Rizwana Nausheen', 'W/o.Sujath Nawaz Khan', NULL, '28', 'INDIAN', '', NULL, '', 'House wife', 'H.No.18-8-485/7/A, Kumariwadi, Bhavani Nagar, Hyderabad', '', '', 'Gold Articles, Wg 10gr, Worh Rs.45,000/-', '45,000/-', '', '', '', '', '', '', 'Sri.P.Shankar', 'Addl.Inspector of Police', 'nil', '2013-08-13 11:30:00'),
('124/2013', 'Kamatipura', 'JJB Hyderabad', '2013-12-18', 'IPC', '337', '', '', '', '', '', '2013-12-18 17:00:00', '2013-12-18 19:00:00', '1', '2013-12-18 19:00:00', 'written', '1 Km South-East', '2', 'Misrigunj, Bahadurpura, Hyderabad', '', '', 'Sri.Khaja Muniruddin Mosin', 'Khaja Nasiruddin', NULL, '49', 'INDIAN', '', NULL, '', 'Businessman', '19-2-11/93, Dargah Do Pahad Shah, Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'K.Ravikumar', 'SI', '600007', '2014-01-01 13:00:00'),
('130/2013', 'Narayanguda', 'JJB Hyderabad', '2013-03-16', 'IPC', '379', '', '', '', '', '', '2013-03-16 00:20:00', '2013-03-16 18:30:00', '1', '2013-03-16 18:30:00', 'written', '2 K.M.,WEST', '2', 'Infront of  H.No.3-6-420/1,  Street/no.3, Hyderabad', '', '', 'Sri. Syde  Fazaluddin', 'S/o.Syed  Moinuddin', NULL, NULL, 'INDIAN', '', NULL, '', 'Businessman', 'Infront of  H.No.3-6-420/1,  Street/no.3, Hyderabad', '', 'No Delay', '', '', '', 'IN THE COURT OF THE HON''BLE IX ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'Mr.Mallikarjun', 'Sl-CIVIL', '', '', 'V. R.K.Naidu', 'HC-CIVIL', 'HC-3115', '2013-03-18 10:00:00'),
('136/2013', 'Madannapet', 'JJB Hyderabad', '2013-07-19', 'IPC', '380', '', '', '', '', '', '2013-07-16 17:20:00', '2013-07-19 18:30:00', 'nil', '2013-07-19 18:30:00', 'written', '1 Km South-West', '3', 'H.No.17-1-30/117/5/1, Ramchandra Nagar, Madannapet, Hyd', '', '', 'Sri.Alia Kausar', 'W/o.Syed Iqbal Ali', NULL, '50', 'INDIAN', '', NULL, '', 'House wife', 'H.No.17-1-30/117/5/1, Ramchandra Nagar, Madannapet, Hyd', '', '', 'Net Cash an amount Rs.10,00,000/-', '10,00,000/-', '', '', '', '', '', '', 'Sri.P.Srinivasa Rao', 'Sub-Inspector of Police', 'nil', '2013-07-20 10:00:00'),
('139/2012', 'Reinbazar', 'JJB Hyderabad', '2012-05-27', 'IPC', '337', '', '', '', '', '', '2012-05-27 16:00:00', '2012-05-27 17:00:00', '2', '2012-05-27 17:00:00', 'Oral', '500 meters, South-East', '2', 'Near Hardware shop, Showkath Jund Devdi Road, Yakuthpura, Hyd', '', '', 'Sri.Hassan Bin Sayeed Chawoosh', 'S/o.Syed Bin Abdul Khader', NULL, '30', 'INDIAN', '', NULL, '', 'Businessman', 'H.No.17-8-239, Chawni Nade Ali Baig, Yakuthpura, Hyd', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.T.Karunakar', 'HC-CIVIL', '6956', '2012-05-28 11:00:00'),
('140/2014', 'Habeebnagar', 'JJB Hyderabad', '2014-07-11', 'IPC', '160', '', '', '', '', '', '2014-07-11 16:00:00', '2014-07-11 17:00:00', 'Nil', '2014-07-11 17:00:00', 'English Typed Complaint ', '', '', 'Near Jet Cafe. Seetharambagh. Nampally Hyd', '', '', 'Sri.B.Srinivas PC 6325 of Habeebnagar', '', NULL, '', '', '', NULL, '', 'Police Constable ', 'Hyd', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'Sri.G.Venkanna', 'Sub-Inspector of Police', 'Nil', '2014-07-14 13:30:00'),
('147/2013', 'Habeebnagar', 'JJB Hyderabad', '2013-10-07', 'IPC', '323, 506, 384, 34', '', '', '', '', '', '2013-10-07 19:00:00', '2013-10-07 20:00:00', '', '2013-10-07 10:00:00', 'English Typed Complaint', '', '', 'Opposit House to the Hanuman Temple, Bhoiguda, Aghapura, Hyd', '', '', 'Sri.B.Ranjith Kumar', '', NULL, '18', 'INDIAN', '', NULL, '', 'Worker at Fathemaidan Club Hyd', 'Opposit House of Hanuman Temple, Bhoiguda, Aghapura, Nampally, Hyd', '', '', 'NIL', '1000/-', '', '', '', '', '', '', 'Sri.G.Buchaiah', 'HC 2644', '2644', '2013-10-09 10:00:00'),
('1530', 'Banjarahills', 'JJB Hyderabad', '2014-12-23', '', '379', '', '', '', '', '', '2014-12-23 19:00:00', '2014-12-23 19:00:00', '0', '2014-12-23 19:00:00', 'WRITTEN', 'Banjarahills', '', 'at Grave Yard ,Punjagutta,NFCL.,Banjarahills', '', '', 'Sri Dilip', '', NULL, '', 'INDIAN', '', NULL, '', 'Head Constable', 'O/o.PS Bajarahills.Road No.3 Banjarahills,hyd ', '', '', 'nill', 'nill', '', '', '', '', '', '', 'G.Ravinder', 'Sub-inspecter of police', 'nill', '2014-12-23 19:00:00'),
('17/2013', 'Marredpally', 'JJB Hyderabad', '2013-01-19', 'IPC', '454, 380,511', '', '', '', '', '', '2013-01-17 11:30:00', '2013-01-19 18:00:00', 'nil', '2013-01-19 18:00:00', 'written', '1/2 k.m. North', '21', '148 EWSH, Santhoshnagar, hyderabad', '', '', 'Smt.Fareesa Naaz', 'Syed Musharraf ali', NULL, '44', 'INDIAN', '', NULL, '', 'Bank Employee', 'H.No.148 EWSH, Nwe Santhoshnagar Colony, Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.K.Nageshwara Rao', 'ASI', 'ASI', '2013-04-04 11:00:00'),
('170/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-05-29', 'IPC', '379', '', '', '', '', '', '2014-05-14 01:00:00', '2014-05-29 16:30:00', '2', '2014-05-29 16:30:00', 'written', '500 Metrs, West', '1', 'Infront of H.No.14-2-180/1, Near Old PS Shahinayathgunj, Nampally, Hyd', '', '', 'Sri.Vishnu Gopal Nagla', 'S/o.Mohanlal Nagla', NULL, '19', 'INDIAN', '', NULL, '', 'Employed in Private Firms', 'H.No.14-2-180/1, Near Old PS Shahinayathgunj, Nampally, Hyd', '', '', 'Bike Reg No.AP 09 AV1577', '10000/-', '', '', '', '', '', '', 'Sri.M.Shankar', 'SI-CIVIL', 'CIVIL', '2014-05-30 16:30:00'),
('174/2014', 'Jubilee Hills', 'JJB Hyderabad', '2014-02-22', 'IPC', '337', '', '', '', '', '', '2014-02-21 23:00:00', '2014-02-22 14:00:00', 'nil', '2014-02-22 14:00:00', 'Telugu Written Statement', '0.8 Km, Norh', '3', 'Near Vacs Bakery, Road No.10, Jubilee Hills, Hyd', '', '', 'Smt.Motor Shamala', 'W/o.Raju', NULL, '38', 'INDIAN', '', NULL, '', 'Cook', 'R/o.Gayathri Hills, Jubilee Hills, Hyd', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.K.Veerabhadra Kumar', 'SI', 'nil', '2014-02-22 16:40:00'),
('2/2014', 'Banjara Hills', 'JJB Hyderabad', '2014-01-01', 'IPC', '448 354(D)', '', '', '', '', '', '2014-01-01 01:00:00', '2014-01-01 21:00:00', 'Nil', '2014-01-01 21:00:00', 'Telugu Written', '4 km South', '', 'At 8-2-815 BJR Nagar Film Nagar Jubilee Hills Hyd', '', '', 'Sri.P.Raju', 'P.Narsing', NULL, '35', 'Indian', '', NULL, '', 'Employed in private forms ', 'R/o 8-2-815 BJR Nagar Film Nagar Jubilee Hills Hyd', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'Sri.S.Santhosham', 'Sub-Inspector of Police', 'Nil', '2014-01-02 12:00:00'),
('212/2013', 'Mangalhat', 'JJB Hyderabad', '2013-09-01', 'IPC', '324', 'IPC', '34', '', '', '', '2013-08-31 19:00:00', '2013-09-01 01:00:00', '1', '2013-09-01 01:00:00', 'written', '1 K.M.,South-East', '3', 'H.NO.14-10-42, Jinsichowrahi, Mangalhat, Hyd', '', '', 'Smt. AnithaBahi', 'W/o.Suraj Singh', NULL, NULL, 'INDIAN', '', NULL, '', 'House wife', 'H.NO.14-10-42, Jinsichowrahi, Mangalhat, Hyd', 'Smt.Lalli, Vinod Singh,Seethal Singh', 'No Delay', '', '0', '', 'IN THE COURT OF THE HON''BLE XVI ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'G.Venkateshwarlu', 'Asst.Sub-Inspector of Police', '', '', 'G.Venkateshwarlu', 'Asst.Sub-Inspector of Police', '', '2013-09-01 10:00:00'),
('216/2012', 'Kanchanbagh', 'JJB Hyderabad', '2012-09-14', 'IPC', '382', '', '', '', '', '', '2012-09-14 13:15:00', '2012-09-14 16:00:00', '2', '2012-09-14 16:00:00', 'written', '3 km, East', '3', 'Near H.No.9-6-133, Yadagiri Nagar, Hyd', '', '', 'Smt.Ramreddy Krishna Tulasi Kumari', 'W/o.Somaiah', NULL, '50', 'INDIAN', '', NULL, '', 'House wife', '12, Yadagiri Nagar, Champapet, Hyderabad', '', '', 'Two lines of Gold Mangalasutram', '45000/-', '', '', '', '', '', '', 'Sri.S.Balaswamy', 'SI-CIVIL', 'PSI', '2012-09-15 16:25:00'),
('218/2013', 'Dabeerpura', 'JJB Hyderabad', '2013-12-13', 'IPC', '186 427 341', '', '', '', '', '', '2013-12-13 17:20:00', '2013-12-13 20:00:00', '1', '2013-12-13 20:00:00', 'Written', '1 km East', '1', 'Near Nawab Shah Alamkhan College Chanchalguda Dabeerpura Hyd', '', '', 'Sri.J.Susheel', '', NULL, '', '', '', NULL, '', '', '', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'Sri.Mirza Wahed Baig', 'Sub-Inspector of Police', 'Nil', '2013-12-16 12:00:00'),
('228/2013', 'kulsumapura', 'JJB Hyderabad', '2013-12-30', 'IPC', '379', '', '', '', '', '', '2013-12-30 11:00:00', '2013-12-30 11:00:00', '1', '2013-12-30 11:00:00', 'written', '1 KM, South', '1', 'H.No.13-3-1103/12, Qumaraqi Gumbad, Jiyaguda, hyd', '', '', 'Sri. D.Bhanu kiran', 'D.Satyanarayana', NULL, NULL, 'INDIAN', '', NULL, '', 'Salesman', 'H.No.13-3-1103/12, Qumaraqi Gumbad, Jiyaguda, hyd', 'unknown persons', 'No Delay', 'Net cash an amount of Rs.70,000/-', '70000', '', '', 'Registed a case U/s 379 IPC', 'Y.V. Santa Rao', 'sub inspector of Police', 'Kulsumpura', 'Y.V. Santa Rao', 'sub inspector of Police', '5632', '2013-12-31 11:30:00'),
('232/2013', 'Reinbazar', 'JJB Hyderabad', '2013-11-09', 'IPC', '324', '', '', '', '', '', '2013-11-09 23:50:00', '2013-11-09 23:50:00', '1', '2013-11-09 23:50:00', 'written', '1 Km,East', '2', 'Chanchalguda Govt.School, chachalguda, hyd', '', '', 'Mohd. Yakub', 'S/o.Md Jahangir', NULL, NULL, 'INDIAN', '', NULL, '', '', 'H.No.17-2-7, ner Rethi Ki Masjid, Yakuthpura, Hyd', 'Dhawood, age:15, saidbad', 'No Delay', '', '', '', '', 'Ramesh P', 'Sl-CIVIL', '', '', 'Mohd Ghouse Moinuddin', 'HC-CIVIL', 'HC-6579', '2013-11-11 10:00:00'),
('236/2013', 'Nallakunta', 'JJB Hyderabad', '2013-11-25', 'IPC', '379', '', '', '', '', '', '2013-11-23 04:00:00', '2013-11-25 16:30:00', 'nil', '2013-11-25 16:30:00', 'written', '1 KM, West', '', 'Near Narendra Park, Nallakunta, Hyd', '', '', 'Sri.Ch.Dharma Teja', 'Srinivasa Reddy', NULL, '21', 'INDIAN', '', NULL, '', 'B Tech Student', 'R/o H.No.2-2-112/3/E, Fl No.5, Ratna Residency, Ramalayam Street, New Nallakunta, Hyd', '', '', 'Puslar 220 DTS-1 AP11AQ7849', '98,000/-', '', '', '', '', '', '', 'V.Venkateshwar Rao', 'Sub-Inspector of Police', 'nil', '2013-12-05 11:00:00'),
('236/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-07-25', 'IPC', '379', '', '', '', '', '', '2014-07-24 15:00:00', '2014-07-25 13:00:00', '2', '2014-07-25 13:00:00', 'written', '1 Km,East', '', 'Premises No. 15-8-128, Chawla Building, Begumbazar, hyd', '', '', 'Sri.Arvind Bhati', 'S/o Ramesh chand Bhati', NULL, '34', 'INDIAN', '', NULL, '', 'Businessman', 'H.No. 15-6-177, Kolsawadi, Begumbazar, Hyderabad', '', '', 'One Cell Phone', 'NIL', '', '', '', '', '', '', 'Sri.M.Shankar', 'SI-CIVIL', 'CIVIL', '2014-08-14 11:00:00'),
('238/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-07-29', 'IPC', '381', '', '', '', '', '', '2014-07-29 14:30:00', '2014-07-29 15:30:00', '1', '2014-07-29 15:30:00', 'Written', '', '3', 'at Navakar Plastic Feelkhana Nampally Hyd', '', '', 'Sri.V.Dinesh Banda', 'Venkthawarmal banda', NULL, '42', 'Indian', '', NULL, '', 'Business', 'Anu Mension Kandaswamylane Hanuman tekadi Hyde', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'M.Shankar', 'Sub-Inspector of Police', 'Nil', '2014-07-30 16:10:00'),
('244/2014', 'Chikkadapally', 'JJB Hyderabad', '2014-04-29', 'IPC', '337', '', '', '', '', '', '2014-04-29 10:00:00', '2014-04-29 16:00:00', '', '2014-04-29 16:00:00', 'written', '1 Km South-West', '', 'At Opposite to Sahara Bakery, RTC X Roads, Chikkadapally, Hyd', '', '', 'Sri.V.Rama Krishna', 'S/o.Late Ramulu', NULL, '37', 'INDIAN', '', NULL, '', 'others', 'Medipally, Vinayaka Nagar Colony, Road No.1, Ghatkesar Mandal, Rangareddy', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.Md.Ghiasuddin', 'HC-CIVIL', 'HC 3590', '2014-05-01 13:15:00'),
('244/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-08-04', 'IPC', '379', '', '', '', '', '', '2014-08-03 22:00:00', '2014-08-04 18:00:00', '1', '2014-08-04 18:00:00', 'written', '1/2 Km,East', '3', 'In fron of H.No.15-7-491, Begum Bazar Post Office, Nampally, Hyderabad', '', '', 'Sri.N.Mahender Kumar', 'S/o.N.Badrinarayan', NULL, '30', 'INDIAN', '', NULL, '', 'Businessman', '1st floor, H.No.15-7-491, Begum Bazar Post Office, Nampally, Hyderabad', '', '', 'Bike Honda Twister Reg No.AP09 CH3904', '55,000/-', '', '', '', '', '', '', 'Sri.M.Shankar', 'SI-CIVIL', 'nil', '2014-08-09 11:00:00'),
('246/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-08-05', 'IPC', '379', '', '', '', '', '', '2014-08-04 07:00:00', '2014-08-05 15:00:00', '0', '2014-08-05 15:00:00', 'Written', '1 km south', '2', 'In front of H.No.14-7-69/70 Shankar Bazar Nampally Hyd', '', '', 'Deendayal', 'Late Dhanraj ji', NULL, '51', 'Indian', '', NULL, '', 'Employed in private forms ', 'H.No.14-7-69/70 Shankar Bazar Nampally Hyd', '', '', 'Honda Shine bike Reg No.AP13M8435', 'Nil', '', '', '', '', '', '', 'Sri.M.Shankar', 'Sub-Inspector of Police', 'Nil', '2014-08-06 14:30:00'),
('248/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-08-06', 'IPC', '379', '', '', '', '', '', '2014-08-05 22:30:00', '2014-08-06 14:30:00', '2', '2014-08-06 14:30:00', 'written', '1 km, South-West', '2', 'In front of H.No.14-6-164, Chudi Bazar, Nampally, Hyderabad', '', '', 'Sri.V.Bhiva Ral', 'S/o.S.Ramprasad', NULL, '30', 'INDIAN', '', NULL, '', 'Businessman', 'H.No.14-6-164, Chudi Bazar, Nampally, Hyderabad', '', '', 'Two Wheeler Honda Shine No.AP13 N 4174', '60,000/-', '', '', '', '', '', '', 'Sri.M.Shankar', 'SI-CIVIL', 'CIVIL', '2014-08-07 12:30:00'),
('249/2014', 'GANDHINAGAR', 'JJB Hyderabad', '2014-06-26', 'IPC', '379', '', '', '', '', '', '2014-06-20 07:00:00', '2014-06-26 18:00:00', '2', '2014-06-26 18:00:00', 'written', '1.5 Km, South', '2', 'Gandhinagar, Secunderabad, Hyd', '', '', 'Sri.Mutyalu Srinivas', 'S/o.Mutyalu Narsima', NULL, '32', 'INDIAN', '', NULL, '', 'Govt.Official Non-Gazetted', 'H.No.13-1-52, Mangalghat, Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.Laxmi Naryana', 'SI-CIVIL', 'SI', '2014-07-11 10:30:00'),
('250/2013', 'Hussainialam', 'JJB Hyderabad', '2013-12-27', 'IPC', '380', '', '', '', '', '', '2013-12-26 23:30:00', '2013-12-27 11:15:00', '2', '2013-12-27 11:15:00', 'written', '1 Km,East', '1', 'H.No.20-4-569, Beside Fathima Clinic, Khilwath, Hussaini Alam, Hyd', '', '', 'Sri.Syed Hameed Ahmed', 'S/o.Syed Latheef Ahmed', NULL, '41', 'INDIAN', '', NULL, '', 'Businessman', 'H.No.20-4-569, Beside Fathima Clinic, Khilwath, Hussaini Alam, Hyd', '', '', 'Some Gold Ornaments', 'NIL', '', '', '', '', '', '', 'Sri.K.Ramesh Goud', 'SI-CIVIL', 'SI800', '2013-12-28 16:00:00'),
('26/2013', 'Nallakunta', 'JJB Hyderabad', '2013-01-29', 'IPC', '382', '', '', '', '', '', '2013-01-29 19:30:00', '2013-01-29 20:30:00', '1', '2013-01-29 20:30:00', 'written', '1 KM, West', '', 'Back side lane of Seetha Ramakaym Tmple,Vidyanagar, Hyd', '', '', 'Smt. V.  Mani', 'W/o. V.Koteshwar Rao', NULL, NULL, 'INDIAN', '', NULL, '', 'Nursing  Superisor', 'R/o. H.No.1-9-290/3/335, Near, Saibaba Temple, Vidyanagar, hyd', '', 'No Delay', 'Gold Mangalasutram about  three tulas', '3', '', 'IN THE COURT OF THE HON''BLE XVI ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'Sri. G.Naresh Kumar', 'Sub-Inspector of Police', '', '', 'Sri. G.Naresh Kumar', 'Sub-Inspector of Police', '', '2013-01-29 10:00:00'),
('265/2014', 'GANDHINAGAR', 'JJB Hyderabad', '2014-07-11', 'IPC', '379', '', '', '', '', '', '2014-07-09 06:00:00', '2014-07-11 22:00:00', '1', '2014-07-11 22:00:00', 'written', '2.5 km, South', '55', 'Children park, Uppar Tankbund, Secunderabad, Hyd', '', '', 'Sri.A.Sundaram', 'S/o.A.Thirupal', NULL, '27', 'INDIAN', '', NULL, '', 'Mason', 'Prakash Nagar, Begumpet, Secunderabad, Hyd', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.Amar', 'SI-CIVIL', 'SI', '2014-07-15 11:00:00'),
('266/2014', 'Asifnagar', 'JJB Hyderabad', '2014-10-06', 'IPC', '337', '', '', '', '', '', '2014-10-06 18:15:00', '2014-10-06 23:30:00', 'Nil', '2014-10-06 23:30:00', 'Written complaint in Telugu', '1 km in south', '1', 'At Chandra Wine shop Asifnagar Hyd ', '', '', 'Sri.Md.ilal Ahmed', 'S/o.Md.Maqbool Ahmed', NULL, '34', 'Indian', '', NULL, '', 'business', 'H.No.12-1-584/7 Syed Aliguda Murad Nagar Asifnagar Hyd', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'Sri.B.Mahedar', 'Sub-Inspector of Police', 'Nil', '2014-10-07 14:00:00'),
('266/2014', 'GANDHINAGAR', 'JJB Hyderabad', '2014-07-12', 'IPC', '379', '', '', '', '', '', '2014-07-11 17:00:00', '2014-07-12 13:00:00', '1', '2014-07-12 13:00:00', 'written', '1 KM, West', '2', 'R.P.Road, Secunderabad', '', '', 'Sri.Sambaiahhann Durai', 'S/o.Sambaiah', NULL, '43', 'INDIAN', '', NULL, '', '', 'Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.M.Sadanand Rao', 'ASI', 'ASI 101085', '2014-07-14 10:30:00'),
('278/2013', 'Charminar', 'JJB Hyderabad', '2013-10-04', 'IPC', '382, 309', '', '', '', '', '', '2013-10-04 14:00:00', '2013-10-04 15:00:00', '1', '2013-10-04 15:00:00', 'written', '', '', 'Infront of AH Zariwala shop, Lad Bazar, Charminar, Hyd', '', '', 'Smt.Sunitha', 'Venkat', NULL, '36', 'INDIAN', '', NULL, '', 'nil', 'R/o Villa 207, Hindu Fourtune Fields, KPHB Phase 13, Hyd', '', '', 'IPhone A-4', 'NIL', '', '', '', '', '', '', 'Mahamud Makmud Ali', 'SI-CIVIL', 'nil', '2013-10-05 16:00:00'),
('281/2013', 'GANDHINAGAR', 'JJB Hyderabad', '2013-11-06', 'IPC', '379', '', '', '', '', '', '2013-10-02 07:00:00', '2013-11-06 18:30:00', '2', '2013-11-06 18:30:00', '', '', '', 'H.NO.1-2-607/23/1B, AMBEDKARNAGAR, NTR STADIUM, HYDERBAD', '', '', 'Sri.N.Venkatasiva', 'venkateshlu', NULL, '25', 'INDIAN', '', NULL, '', '', '', '', '', 'Bajaj pulsar AP04 AF9618', '50,000/-', '', '', '', '', '', '', 'G.Venkata Rao', 'ASI', 'nil', '2013-11-11 14:00:00'),
('289/2013', 'Marredpally', 'JJB Hyderabad', '2013-10-06', 'IPC', '337', 'IPC', '379', '', '', '', '2013-10-06 17:45:00', '2013-10-06 20:00:00', '1', '2013-10-06 20:00:00', 'written', '1/2 K.M', '2', 'Near Reddy Wines, West Marredpally, Hyd', '', '', 'Sri. A. Ganesh Yadav', 'Sri. Krishna Yadav', NULL, NULL, 'INDIAN', '', NULL, '', 'Auto Driver', 'H.No.10-1-175/6, Nehru nagar, Marredpally, Hyd', 'Driver of the Tractor Bearing No.AP-15Y-7440', 'No Delay', 'NIL', '', '', '', 'Sri.J.Niranjan Rao', 'Sl-CIVIL', '', '', 'Sri.J.Niranjan Rao', 'Sl-CIVIL', '', '2013-10-07 10:00:00'),
('332/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-10-31', 'IPC', '379', '', '', '', '', '', '2014-10-31 19:00:00', '2014-10-31 23:30:00', '22', '2014-10-31 23:30:00', 'written', '1/2 k.m. North', '1', 'Goshamahal Police Ground, Goshamahal, Nampally, Hyd', '', '', 'Sri.Man Mohan attal', 'S/o.Krishna Attal', NULL, '42', 'INDIAN', '', NULL, '', 'Businessman', 'H.No.10-3-563/5, Vujaya Nagar Colony, Hyderabad', '', '', 'Net Cash an Amount Rs.10300/-', '10300/-', '', '', '', '', '', '', 'Sri Hari', 'HC', 'HC 3984', '2014-11-03 14:30:00'),
('344/2014', 'Narayanaguda', 'JJB Hyderabad', '2014-07-05', 'IPC', '324, 34', '', '', '', '', '', '2014-07-05 17:45:00', '2014-07-05 23:00:00', '1', '2014-07-05 23:00:00', 'written', '2 km West', '3', 'Near Woodland Showroom, Himayatha Nagar, Hyd', '', '', 'Sri.Dr.Syed Mohammed Ali Ahmed', 'S/o.Dr.Syed Mustafa Ahmed', NULL, '27', 'INDIAN', '', NULL, '', 'Medical Practitioner', 'H.No.3-6-196/197, No.401, Prime Plaza, Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.M.Gangadharam Reddy', 'HC-CIVIL', 'HC 7178', '2014-07-07 10:30:00'),
('349/2013', 'Chikkadapally', 'JJB Hyderabad', '2013-09-22', 'IPC', '324', 'IPC', '34', '', '', '', '2013-09-21 15:00:00', '2013-09-22 15:00:00', '1', '2013-09-22 15:00:00', 'written', '200 mtrs,South', '', 'near Srimayuri theater, RTC X Road', '', '', 'Sri Syed llyas', 'Syed Anwar', NULL, NULL, 'INDIAN', '', NULL, '', 'others', 'Risalagudda, musheerabad, hyd', '', 'No Delay', '', '', '', '', 'V.Pradeep Kumar', 'Sl-CIVIL', 'Sl of Police', 'Chikkadapally', 'V.Pradeep Kumar', 'Sl-CIVIL', 'Sl of Police', '2013-09-23 10:00:00'),
('349/2014', 'Malakpet', 'JJB Hyderabad', '2014-07-08', 'IPC', '379', '', '', '', '', '', '2014-07-05 18:00:00', '2014-07-08 13:00:00', 'nil', '2014-07-08 13:00:00', 'written', '1.5 km, East', '1', 'In Parking Place of Chandana Brothers, Dilsukhnagar, Malakpet, Hyd', '', '', 'Sri.V.Ram Mohan', 'S/o.V.Laxmana Swamy', NULL, '55', 'INDIAN', '', NULL, '', 'others', 'H.No.1-5-746/A, Dhanalaxmi Towers, Kothapet, Rangareddy, Hyd', '', '', 'Access BC III Two Wheeler vehicle bearing no AP29AU1412', 'NIL', '', '', '', '', '', '', 'Sri.L.Ramesh Nayak', 'SI-CIVIL', 'SI 700085', '2014-07-11 12:15:00'),
('356/2014', 'Malakpet', 'JJB Hyderabad', '2014-07-10', 'IPC', '379', '', '', '', '', '', '2014-07-06 18:00:00', '2014-07-10 14:00:00', '5', '2014-07-10 14:00:00', 'written', '1.5 KM, North-East', '2', 'At Shalivahana Nagar Park, Moosarambagh, Malakpet, Hyd', '', '', 'Sri.K.Basva Reddy', 'S/o.Venkatrami Reddy', NULL, '45', 'INDIAN', '', NULL, '', 'Businessman', 'H.No.2-53, Satyanarayanapuram Colony, Chaitanypuri, Rangareddy Hyd', '', '', 'Two Wheeler Hero Hond Reg No. AP11 P4338', 'NIL', '', '', '', '', '', '', 'Sri.S.Naresh', 'SI-CIVIL', 'SI608664', '2014-07-12 11:00:00'),
('357/2013', 'Narayanaguda', 'JJB Hyderabad', '2013-08-21', 'IPC', '379', '', '', '', '', '', '2013-08-10 20:00:00', '2013-08-22 17:00:00', '1', '2013-08-21 17:00:00', 'written', '1 KM, North', '3', 'Parking cellar of fair view plaza, Himayathnagar, Hyd', '', '', 'Sri. K. Prveen Kumar', 'S/o.Late K.Bhadrappa', NULL, NULL, 'INDIAN', '', NULL, '', 'Businessman', 'Flat .no.101,plot.no.90, Old Vasavi Nagar, Karkhana, secundrabad', '', 'No Delay', 'Yamaha FZS AP-29-AW-5952', '', '', 'IN THE COURT OF THE HON''BLE IX ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'venkteshwarulu', 'HC-Civil', '', '', 'V. R.K.Naidu', 'HC-CIVIL', 'HC-3115', '2013-08-22 10:00:00'),
('363/2013', 'Gopalapuram', 'JJB Hyderabad', '2013-11-23', 'IPC', '379', '', '', '', '', '', '2013-11-14 11:40:00', '2013-11-23 20:00:00', '1', '2013-11-23 20:00:00', 'written', '', '', 'At Sangeeth X Roads traffic signal, Secunderabad, Hyd', '', '', 'Sri.P.Sathish Kumar', 'Late Laxminarayana', NULL, '27', 'INDIAN', '', NULL, '', 'nil', 'H.No.10-324/4, Prashanth Nagar, Moulali, Rangareddy ', '', '', 'One Sony Make 32i LET TV', '47,900/-', '', '', '', '', '', '', 'Sri.Ramaswamy', 'SI-CIVIL', 'nil', '2013-11-26 13:00:00'),
('384/2014', 'Musheerabad', 'JJB Hyderabad', '2014-11-03', 'IPC', '379', '', '', '', '', '', '2004-11-01 18:00:00', '2014-11-03 11:35:00', '1', '2014-11-03 11:35:00', 'Written', '2 km', '6', 'At in front of Ushamayuri Theater Musheerabad Hyd', '', '', 'Sri.Mohd Mahaboob', 'Mohd bhuran', NULL, '24', 'Indian', '', NULL, '', 'Mechanic', 'H.No.1-6-227/13/1. Ramnagar Musheerabad Hyd', '', '', 'Two Wheeler bike Reg No.AP09CH5819', 'Nil', '', '', '', '', '', '', 'Sri.S.Raman ', 'Sub-Inspector of Police', 'Nil', '2014-11-13 15:00:00'),
('385/2014', 'Musheerabad', 'JJB Hyderabad', '2014-11-03', 'IPC', '379', '', '', '', '', '', '2014-10-30 22:00:00', '2014-11-03 15:20:00', '2', '2014-11-03 15:20:00', 'Written', '2 km East', '0', 'at in front of H.No.1-7-574/25/g/1 Musheerabad Geminicolony Hyd', '', '', 'Sri.G.Srinivas', 'Late G.Devaiah', NULL, '42', 'Indian', '', NULL, '', '', 'H.No.1-7-574/25/g/1 Musheerabad Geminicolony Hyd', '', '', 'Two Wheeler bike Reg No.AP09AW9293', 'Nil', '', '', '', '', '', '', 'Sri.S.Raman ', 'Sub-Inspector of Police', 'Nil', '2014-11-05 10:30:00'),
('387/2014', 'Musheerabad', 'JJB Hyderabad', '2014-11-04', 'IPC', '379', '', '', '', '', '', '2014-11-04 07:00:00', '2014-11-04 00:35:00', '2', '2014-11-04 12:35:00', 'written', '2 km North-East', '2', 'Infront of H.No.1-5-509/1, Sagarlal Hospital, Musheerabad, Hyd', '', '', 'Sri.G.Vinod Kumar', 'S/o.G.Krishna', NULL, '30', 'INDIAN', '', NULL, '', 'Technician', 'H.No.1-5-509/1, Sagarlal Hospital, Musheerabad, Hyd', '', '', 'Two Wheeler, No.AP29 AD3215', 'NIL', '', '', '', '', '', '', 'Sri.Salvadi Raman', 'Sub-Inspector of Police', 'nil', '2014-11-05 10:30:00'),
('389/2014', 'Banjara Hills', 'JJB Hyderabad', '2014-04-11', 'IPC', '379', '', '', '', '', '', '2014-04-09 07:00:00', '2014-04-11 18:30:00', 'nil', '2014-04-11 10:00:00', 'English Typed Complaint', '6 km South', '', 'H No.10-5-385/B, 1st Lancer, Ahmed Nagar, Banjrahills, Hyd', '', '', 'Sri.Md.Saleem', 'S/o Md.Nazeeruddin', NULL, '32', 'INDIAN', '', NULL, '', 'Businessman', 'H No.10-5-385/B, 1st Lancer, Ahmed Nagar, Banjrahills, Hyd', '', '', 'Unicorn Motor Cycle No AP09 AZ1904', 'NIL', '', '', '', '', '', '', 'Sri.L.Srinivas', 'Asst.Sub-Inspector of Police', 'nil', '2014-04-23 11:00:00'),
('39/2013', 'Nallakunta', 'JJB Hyderabad', '2013-02-12', 'IPC', '382', '', '', '', '', '', '2013-02-12 14:30:00', '2013-02-12 15:30:00', '1', '2013-02-12 15:30:00', 'written', '2 KM, South', '', 'At mother Dairy New Nallakunta, hyd', '', '', 'Smt. R.Padmaja', 'R.Venkteshwra Rao', NULL, NULL, 'INDIAN', '', NULL, '', 'House wife', 'R/o.  H.No.2-2-1075/27/1, Bagh  amberpet, Hyd', 'Two unknow persons', 'No Delay', 'NIL', '', '', 'IN THE COURT OF THE HON''BLE SPECIAL EXECUTIVE METROPOLITAN MAGASTRATE AT HYD', 'Sri. V.Venkateshwara Rao', 'Sub-Inspector of Police', '', '', 'Sri. V.Venkateshwara Rao', 'sub inspector of Police', '', '2013-02-14 10:00:00'),
('413/2012', 'Narayanaguda', 'JJB Hyderabad', '2012-12-22', 'IPC', '379', '', '', '', '', '', '2012-12-19 23:40:00', '2012-12-22 11:45:00', '1', '2012-12-22 11:45:00', '', '', '', '1-1-187/7/8,VIVEK NAGAR CHIKADPALLY HYD', '', '', 'Sri.G.Ramakanth', 'Sri.G.Manikrao', NULL, '26', 'INDIAN', '', NULL, '', 'Employed in Private Firms', '', '', '', 'TVS Apache AP09-BQ8923', '60,000/-', '', '', '', '', '', '', 'V. R.K.Naidu', 'HC-CIVIL', 'HC-3115', '2012-12-24 10:30:00'),
('44/2013', 'Nallakunta', 'JJB Hyderabad', '2013-02-17', 'IPC', '382', '', '', '', '', '', '2013-02-17 10:00:00', '2013-02-17 00:30:00', '1', '2013-02-17 00:30:00', 'written', '2 K.M.,South-East', '', 'Near Nallakunta Railway track', '', '', 'Sri. Tangiraala Satyanarayana', 'S/o.Late T.V.K. Somayajulu', NULL, NULL, 'INDIAN', '', NULL, '', 'Vastu Consultant', 'R/o. flat.no.101, Uma mansion, new  Nallakunta, hyd', 'unknown accused', 'No Delay', 'Blck beat chain of 10 grms and piee of chain about 8grms', '', '', 'IN THE COURT OF THE HON''BLE IV ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'V.Venkateshwar Rao', 'Sub-Inspector of Police', '', '', 'V.Venkateshwar Rao', 'sub inspector of Police', '', '2013-02-17 10:00:00'),
('444/2013', 'Begumpet', 'JJB Hyderabad', '2013-11-26', 'IPC', '379', '', '', '', '', '', '2013-11-17 12:30:00', '2013-11-26 11:00:00', '3', '2013-11-26 11:00:00', '', '1.5 KM, North', '3', 'Near by straw berry hotel, Paigha colony, Begumpet, hyderabad', '', '', 'sri.A.Satyanarayana', 'Late A.Mallaiah', NULL, '65', 'INDIAN', '', NULL, '', 'Employed in Private Firms', 'H.No.2-4-27, Beside tadbund Hanuman temple, Kummaraguta, Secunderabad', '', '', 'Bike Splender Plus AP10 R7553', 'NIL', '', '', '', '', '', '', 'Sri.S.Bramha Chary', 'SI-CIVIL', 'nil', '2013-12-06 11:00:00'),
('469/2013', 'Chikkadapally', 'JJB Hyderabad', '2013-12-23', 'IPC', '337', '', '', '', '', '', '2013-12-23 00:30:00', '2013-12-23 04:30:00', '5', '2013-12-23 04:30:00', 'written', '3 km South-West', '5', 'At JB Apartments, Domalaguda, Hyderabad', '', '', 'Sri.A.Shekar', 'S/o.Late A.Ushaiah', NULL, '35', 'INDIAN', '', NULL, '', 'Labourer', 'H.No.1-2-77, Domalaguda, Chikkapally, Hyderabad', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.A.Narsimha Rao', 'SI-CIVIL', 'SI OF POLICE', '2014-07-31 11:00:00'),
('56/2014', 'Musheerabad', 'JJB Hyderabad', '2013-02-24', 'IPC', '337', '', '', '', '', '', '2014-02-24 15:00:00', '2014-02-24 23:30:00', '1', '2013-02-24 23:30:00', 'Written', '2 km', '5', 'at beside Royal Sea Hotel Opp Apollo Pharmacy Musheerabad Hyd', '', '', 'Sri.A.Naresh', 'S/o A.Nagaraju', NULL, '24', 'Indian', '', NULL, '', '', 'H.No.1-3-92/2 Tallabasthi Kavadiguda Hyd', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'Sri.G.Nageswara rao', 'HC', '3063', '2014-02-25 13:25:00'),
('59/2013', 'Saifabad', 'JJB Hyderabad', '2013-01-29', 'IPC', '379', '', '', '', '', '', '2013-01-08 11:00:00', '2013-01-29 06:30:00', '1', '2013-01-29 06:30:00', 'Written', 'about 1km North East', '1', 'Neat Shanti sweet house saifabad hyderabad', '', '', 'Sri.G.Nagaraju', 'S/o G.Venkatadri', NULL, '43', 'Indian', '', NULL, '', 'Employed in private forms ', 'R/o H.No.6-3-1247/307/4 Rajnagar MS Makta Hyderabad', '', '', 'Spender plus bike No.AP24 S3442', 'Nil', '', '', '', '', '', '', 'Sri.Kishan Sing', 'HC CIVIL', 'HC-6837', '2013-01-31 15:00:00'),
('60/2013', 'Abids', 'JJB Hyderabad', '2013-02-23', 'IPC', '382', 'IPC', '511', '', '', '', '2013-02-23 17:00:00', '2013-02-23 21:30:00', '2', '2013-02-23 21:30:00', 'written', '1K.M.,North-West', '2', 'Near Mercury Hotel, Chiragali Lane, Abids, Hyd', '', '', 'Narender Sangai', 'Late Gopilal Sangai', NULL, NULL, 'INDIAN', '', NULL, '', 'Businessman', 'H/no.19-1-924/A/64, Murali Nagar,Near Murali Gumbaj, Puranapool, Hyd.', 'Yamaha FZ bearingn no. AP12L 5477 driver and pillion driver', 'No Delay', '', '', '', '', 'Mohamed Qasim Ali', 'Sl-CIVIL', 'MQA', '', 'Mohamed Qasim Ali', 'Sl-CIVIL', 'MQA', '2013-02-23 21:30:00'),
('77/2013', 'Nallakunta', 'JJB Hyderabad', '2013-03-31', 'IPC', '382', '', '', '', '', '', '2013-03-31 17:00:00', '2013-03-31 18:45:00', '1', '2013-03-31 18:45:00', 'written', '2 K.M.,WEST', '', 'Near Pochamma Temple, Nallakunta, Hyd', '', '', 'Sri. Sanjay Kulkarni', 'S/o.Srinivas kulkarni', NULL, NULL, 'INDIAN', '', NULL, '', 'Agency Development Manger', 'R/o. H.No.2-1-558, Nallakunta , Hyderabad', 'Two unknow persons', 'No Delay', 'Gold Mangalasutram  and gold chain weghit about 3 tulas', '', '', 'IN THE COURT OF THE HON''BLE IV ADDL CHIEF METROPOLITAN MAGASTRATE AT HYD', 'Sri. G.Naresh Kumar', 'Sub-Inspector of Police', '', '', 'Sri. G.Naresh Kumar', 'sub inspector of Police', '', '2013-04-01 10:00:00'),
('8/2013', 'tukaramgate', 'JJB Hyderabad', '2013-01-30', 'IPC', '379', '', '', '', '', '', '2013-01-22 10:00:00', '2013-01-30 13:00:00', '1', '2013-01-30 13:00:00', 'written', '1 KM, South', '2', 'SBI Bank, East Marredpally, Secunderabad, Hyderabad-A.P', '', '', 'Sri Ali Asgar Harawala', 'S/o. Yahya M', NULL, NULL, 'INDIAN', '', NULL, '', 'Employed in Private Firms', '33-279, Khorakiwala Mansion, RTC Colony, Thirmulagherry', '', 'No Delay', 'NIL', 'NIL', '', '', '', '', '', '', 'Appala Naidu', 'Sl-CIVIL', 'Sl-NZ 603851', '2013-01-31 13:00:00'),
('863/2013', 'Panjagutta', 'JJB Hyderabad', '2013-10-08', 'IPC', '509', '', '', '', '', '', '2013-10-08 16:30:00', '2013-10-08 16:30:00', '7', '2013-10-08 16:30:00', 'written', '1/2 Km,East', '2', 'Sri Sai Nidhi Residency,8-3-966/7,Flat No-303,Nagarjuna Nagar Colony,Hyd', '', '', 'Smt B.Neelima', 'V.V.N Raju', NULL, NULL, 'INDIAN', '', NULL, '', '', 'Sri Sai Nidhi Residency,8-3-966/7,Flat No-303,Nagarjuna Nagar Colony,Hyd', 'Mr.Pratheek', 'No Delay', '', '', '', '', 'Mr.Satyanarayana', 'Sl', '', '', 'Mr.Satyanarayana', '', 'Sl', '2013-10-08 10:00:00'),
('888/2014', 'Madannapet', 'JJB Krishna', '2015-01-06', 'test', '379', 'IPC', '121', '', '', 'ipc 345,ipc456,ipc 367', '2015-01-06 09:45:00', '2015-01-06 09:45:00', '111', '2015-01-06 09:10:00', 'written', '1.5 KM, North', '2', 'Opposit House to the Hanuman Temple, Bhoiguda, Aghapura, Hyd', '', '', 'ctest', 'test', NULL, '30', 'INDIAN', '12', NULL, '', '', '', '', '', 'Bajaj pulsar AP04 AF9618', '0', '', 'no sheets attached', 'ctest', 'Test Rank', 'test', 'test', 'test', 'Test Rank', '1111', '2015-01-07 10:00:00'),
('9/2014', 'Chilkalguda', 'JJB Hyderabad', '2014-01-05', 'IPC', 'Girl Missing', '', '', '', '', '', '2014-01-03 20:30:00', '2014-01-05 20:30:00', '2', '2014-01-05 20:30:00', 'Written', '2 km South-East', '2', '11-3-664/261 New Ashoknagar Parasigutta Secunderabad Hyd', '', '', 'Sri.M.Srinivas', 'M.Mallaiah', NULL, '38', 'Indian', '', NULL, '', '', 'H.No.11-3-664/261 New Ashoknagar Parasigutta Secunderabad Hyd', '', '', 'Nil', 'Nil', '', '', '', '', '', '', 'Sri.N.Rambabu', 'Sub-Inspector of Police', 'SI 608839', '2014-01-05 12:00:00'),
('9/2014', 'Shahinayathgunj', 'JJB Hyderabad', '2014-01-14', 'IPC', '337', '', '', '', '', '', '2014-01-14 21:00:00', '2014-01-14 23:30:00', '1', '2014-01-14 23:30:00', 'written', '1 Km South-West', '2', 'On road at Jummarath Bazar Out Post, Nampally, Hyderabad', '', '', 'Sri.D.Raj Kumar', 'S/o.D.Satyanarayana', NULL, '62', 'INDIAN', '', NULL, '', 'Employed in Private Firms', 'H.No.13-2-601/93, CIB Quarters Raheempura, Nampally, Hyd', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.Ch.Dhanaraj', 'HC-CIVIL', 'HC-6367', '2014-01-17 14:00:00'),
('91/2013', 'Kalapathar', 'JJB Hyderabad', '2013-08-31', 'IPC', '324, 34', '', '', '', '', '', '2013-08-30 19:30:00', '2013-08-31 00:30:00', '1', '2013-08-31 00:30:00', 'written', '1 Km,East', '1', 'At Macca Function Hall, Kalapathar, Hyderabad', '', '', 'Sri.Ismail Khan', 'S/o.Shareef Khan', NULL, '23', 'INDIAN', '', NULL, '', 'others', 'R/o.Ismail Nagar, Bandlaguda, Chandrayangutta, Hyd', '', '', 'NIL', 'NIL', '', '', '', '', '', '', 'Sri.P.Rambabu', 'SI-CIVIL', 'SI608131', '2013-08-31 17:15:00');

-- --------------------------------------------------------

--
-- Table structure for table `remand_case_dairy`
--

CREATE TABLE IF NOT EXISTS `remand_case_dairy` (
  `REMAND_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIR_NO` varchar(20) NOT NULL,
  `POLICE_STATION` varchar(30) NOT NULL,
  `ACCUSED_ID` int(11) NOT NULL,
  `ACCU_AGE` int(11) NOT NULL,
  `DOB_CERTIFICATE_TYPE` int(11) DEFAULT NULL,
  `REMAND_CD_DATE` date NOT NULL,
  `EXAMINED_WITNESS_DETAILS` text,
  PRIMARY KEY (`REMAND_ID`),
  KEY `ACCUSED_ID` (`ACCUSED_ID`),
  KEY `fk_remand_fir_det` (`FIR_NO`,`POLICE_STATION`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Dumping data for table `remand_case_dairy`
--

INSERT INTO `remand_case_dairy` (`REMAND_ID`, `FIR_NO`, `POLICE_STATION`, `ACCUSED_ID`, `ACCU_AGE`, `DOB_CERTIFICATE_TYPE`, `REMAND_CD_DATE`, `EXAMINED_WITNESS_DETAILS`) VALUES
(1, '8/2013', 'tukaramgate', 1, 0, 4, '2013-02-13', ''),
(3, '228/2013', 'kulsumapura', 2, 0, 3, '2013-12-30', 'D.Sri Bhanu kiran,s/o D.Satya narayana'),
(4, '278/2013', 'Charminar', 12, 0, 4, '2013-10-04', '1).Smt.Suneeta Veeramachaneni W/o Sri Venkat Veeramachaneni\r\n2).Smt.Sabitha w/o Satyakalyan\r\n3).Sri.Srinivasa Reddy PC of PS.Charminar.\r\n4).Sri.Mohd.Hameed s/o Mohd Moosa\r\n5).Sri.Mohd.Rabbani s/o Mohd Abdul Wahed\r\n6).Mohd.Maqdoom ali S.I of Police PS Charminar'),
(5, '147/2013', 'Habeebnagar', 13, 0, 1, '2013-10-08', '1).Sri.B.Ranjith Kumar s/o Dayanand age 18 years. Occ: Worker at fathemaidan club. R/o Opp Hanuman Temple bhoiguda kaman aghapura hyde. (Complaint) \r\n2).Sri.B.Ramchander s/o Late Rangaiah age 40 years Occ: Business R/o H.No.11-1-425/1 Bhoiguda kaman Aghapura Hyd. (Eye Witness)\r\n3).Sri.P.Raju s/o Gangaram age 44 years Occ: Pvt Job. R/o H.No.11-1-558 Bhoiguda kaman Aghapura Hyd.\r\n4).Sri.M.Ashok Kumar s/o M.Danaiah age 44 years Occ: Business. R/o H.No.11-1-482 Dhobighat Aghapura Hyd.'),
(6, '140/2014', 'Habeebnagar', 26, 0, 3, '2014-07-17', '1).Sri.B.Srinivas PC-6325 of PS Habeebnagar Hyd\r\n2).Sri.Vijayaraj Yadav PC 3850 of PS Habeebnagar Hyd\r\n3).Sri.G.Venkanna SI of Police PS Habeebnagar Hyd'),
(7, '59/2013', 'Saifabad', 25, 0, 3, '2013-04-19', '1).Sri.G.Nagaraju\r\n2).Sri.Abdul Rehaman\r\n3).Mohd Ismail\r\n4).Sri.Kishan singh\r\n5).Sri.J.sreenu'),
(8, '77/2013', 'Nallakunta', 27, 0, 0, '2013-06-20', '1).Sri.Sanjay Kulkarni\r\n2).Sri.V.Prasadbabu\r\n3).Sri.Hendry\r\n4).Shak Saleem\r\n5).V.Venkateshwara rao'),
(9, '147/2013', 'Habeebnagar', 13, 0, 0, '2013-10-08', '1).Ranjith Kumar\r\n2).B.Ramchander\r\n3).P.Raju\r\n4).M.Ashok Kumar\r\n5).T.Srinivas'),
(10, '278/2013', 'Charminar', 12, 0, 3, '2013-10-04', '1).Smt.Sunitha\r\n2).Smt.Saitha\r\n3.Sri.Srinivasareddy\r\n4).Sri.Mohd Hameed\r\n5).Sri.Mohd Raani\r\n6).Sri.Mohd Magmud Ali'),
(11, '56/2014', 'Musheerabad', 28, 0, 4, '2014-02-28', '1).Sri.A.Naresh S/o Nagaraju\r\n2).Sri.A.Nagaraju /S.o Yadaiah\r\n3).Smt.A.Yadamma W/o Nagaraju\r\n4).Sri.A.Naresh S/o Yadagiri\r\n5).Sri.G.Nageshwara Rao HC 3063'),
(12, '266/2014', 'Asifnagar', 29, 0, 1, '2014-11-11', '1).Sri.Md.Bilal Ahmed S/o Mohd Maqbool Ahmed\r\n2).Sri.Patel Asedinia S/o Abdul Razzaq\r\n3).Sri.Renuke Vittal S/o Tukaram\r\n4).Sri.Mohd Maqbool Ahmed S/o late Quatel Ahamad\r\n5).Sri.Mohd Ashfaq S/o Md Afser\r\n6).Sri.Meer Siddiq Ali S/o Anwaruddin Khan\r\n7).Sri.Dr.P.G.V.Prasad E.M.D Mediciti Hospital\r\n8).Sri.B.Mahender SI Asifnagar\r\n9).Sri.M.Rajashekhar SI Asifnagar'),
(13, '248/2014', 'Shahinayathgunj', 9, 0, 3, '2014-08-09', '1).Sri.S.Bhiv Raj S/o Ramprasad\r\n2).Sri.Vishnu Gopal Nagla S/o Mohanlal Nagla\r\n3).Sri.Md Saleem S/o Md Sardar\r\n4).Sri.Md.Maqbool Hussain S/o Md.Liyaqath Hussain\r\n5).Sri.B.N.Reddy PC 8279 PS Shahinayathgunj\r\n6).Sri.Nagesh Goud PC 9355 PS Shahinayathgunj\r\n7).Sri.Md.Sultan HC 2671 PS Shahinayathgunj\r\n8).Sri.M.Shankar SI PS Shahinayathgunj'),
(14, '218/2013', 'Dabeerpura', 30, 0, 1, '2014-07-22', '1).Sri.D.Jaganath S/o Maisaiah\r\n2).Sri.J.N.Gupta S/o Madhava rao\r\n3).Sri.Dr.Mahammed yousuf ali (Principal of Nawashah alamkhan college)\r\n4).Sri.M.A.Basit S/o Qader\r\n5).Sri.Md.Abdul sammad S/o Ismail\r\n6).Sri.Mirza Wahed baig IS PS Dabeerpura\r\n7).Sri.B.Vijayhaskar Reddy IS PS Dabeerpura'),
(15, '2/2014', 'Banjara Hills', 31, 0, 1, '2014-01-02', '1).Sri.P.Raju S/o Narsing\r\n2).Kum.P.Soumya D/o P.Raju\r\n3).Sri.Siddagoni Gangaiah S/o Ramalingam\r\n4).Sri.S.Santhosham SI PS Banjara Hills\r\n5).Sri.B.Bhaskar Rao SI PS Banjara Hills'),
(16, '9/2014', 'Chilkalguda', 32, 0, 4, '2014-01-18', '1).Sri.M.Srinivas S/o Mallaiah\r\n2).Smt.M.Vijaya Laxmi W/o Srinivas\r\n3).Kum.M.Sravani D/o Srinivas\r\n4).Sri.M.Sunilkumar S/o Someshwar\r\n5).Sri.M.Nagaraj S/o Veera Bhadra\r\n6).Dr.Sravanthi Asst Profesor Gandhi Hospital\r\n'),
(17, '244/2014', 'Chikkadapally', 33, 0, 3, '2014-05-01', '1).Sri.V.Rama Krishna \r\n2).Sri.J.Rambabu \r\n3).Sri.B.Ravi\r\n4).Sri.Dr.Sandeep\r\n5).Sri.MD.Ghiasuddin\r\n6).Sri.DV.Narayanareddy'),
(18, '100/2014', 'Narayanaguda', 34, 0, 2, '2014-02-26', '1).Sri.J.Santhosh\r\n2).Sri.Omprakash singh\r\n3).Sri.Abdul Majid\r\n4).Sri.Abdul Razak\r\n5).Sri.Daulath Singh\r\n6).Sri.Shaik Khaja\r\n7).Sri.Sudheer Kumar\r\n8).Sri.G.S.Daniel SI PS Narayanguda\r\n9).Sri.Ramlal IS PS Narayanguda'),
(19, '05/2014', 'Tappachabutra', 35, 0, 3, '2014-01-06', '1).Sri.R.Ashwin\r\n2).Sri.K.Ramesh\r\n3).Sri.Dr.Megha Vinod Chandran\r\n4).Sri.P.Yadagiri SI PS Tappachabutra\r\n5).Sri.A.Nagaraju SI PS Tappachabutra'),
(20, '244/2014', 'Shahinayathgunj', 5, 0, 3, '2014-08-09', '1).Sri.N.Mahender Kumar\r\n2).Sri.Deendayal Upadyay\r\n3).Sri.Anilkumar Upadyay\r\n4).Sri.Mohd Saleem\r\n5).Sri.Mohd Maqbool Hussain\r\n6).Sri.Nagesh Goud'),
(21, '250/2013', 'Hussainialam', 36, 0, 4, '2013-12-29', '1).Sri.Syed Hammed Ahmed\r\n2).Smt.Hathiya begum\r\n3).Sri.Hohd Saleem\r\n4).Sri.Syed Maqbool Hussain\r\n5)Sri.Syed Rasheed\r\n6).Sri.G.Vamsi PS Hussainalam\r\n7).Sri.K.Ramesh Goud SI PS Hussainialam'),
(22, '238/2014', 'Shahinayathgunj', 37, 0, 4, '2014-07-01', '1).Sri.V.Dinesh Banda\r\n2).Sri.Mohd Saleem\r\n3).Sri.Mohd Maqbool Hussain\r\n4).Sri.Mir Viqar ali\r\n5.Sri.Satish Kumar\r\n6).Sri.M.Shankar IS PS Shahinayathgunj'),
(23, '349/2014', 'Malakpet', 38, 0, 3, '2014-07-11', '1).Sri.V.Ram Mohan Rao\r\n2).Sri.Syed Irfan\r\n3).Sri.M.Balu\r\n4).Sri.K.Manik Reddy HC PS Malakpet\r\n5).Sri.Prakash PC PS Malakpet\r\n6).Sri.Surender PC PS Malakpet\r\n7).Sri.L.Ramesh Naik SI PS Malakpet\r\nSri.B.Raju Naik SI PS Malakpet'),
(24, '349/2014', 'Malakpet', 39, 0, 4, '2014-07-11', '1).Sri.V.Ram Mohan rao\r\n2).Sri.Syed Irfan\r\n3).Sri.M.Balu\r\n4).Sri.KManik Reddy\r\n5).Sri.Prakash PC PS Malakpet\r\n6).Sri.Surender PC PS Malakpet\r\n7).Sri.L.Ramesh Naik SI PS Malakpet\r\n8).Sri.B.Raju Naik IS PS Malakpet'),
(25, '9/2014', 'Shahinayathgunj', 41, 0, 3, '2014-03-11', '1).Sri.D.Rajkumar\r\n2).Sri.D.Jayaram\r\n3).Sri.T.Sathish\r\n4).Sri.T.Rathansingh\r\n5).Sri.Dr.Randheer Kumar\r\n6).Sri.CH.Dhanraj\r\n7).Sri.R.Krishnam Raju'),
(26, '888/2014', 'Madannapet', 42, 0, 4, '2015-01-14', 'rere'),
(27, '111/2015', 'pstest', 43, 0, NULL, '2015-01-14', ''),
(28, '119/2013', 'Bhavani Nagar', 6, 0, NULL, '2017-12-18', 'fdfd');

-- --------------------------------------------------------

--
-- Table structure for table `section_desc`
--

CREATE TABLE IF NOT EXISTS `section_desc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(400) NOT NULL,
  `ratings` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dumping data for table `section_desc`
--

INSERT INTO `section_desc` (`id`, `name`, `ratings`) VALUES
(1, 'Acts done by several persons in furtherance of common intention', 34),
(2, ' Rash driving or riding on a public way', 279),
(3, 'Mischief causing damage to the amount of fifty rupees', 427),
(4, 'Punishment for voluntarily causing hurt', 323),
(5, 'Punishment for theft.-- Whoever commits theft shall be punished with imprisonment ,or with fine, or with both.', 379),
(6, 'Punishment for criminal intimidation', 506),
(7, 'Punishment for extortion', 384),
(8, 'Voluntarily causing hurt by dangerous weapons or means', 324),
(9, 'Causing hurt by act endangering life or personal safety of others', 337),
(10, 'Causing grievous hurt by act endangering life or personal safety of others', 338),
(11, 'Theft in dwelling house, etc', 380),
(12, 'Theft after preparation made for causing death, hurt or restraint in order to the committing of the theft', 382),
(13, 'Attempt to commit suicide(Not Applicable as per latest hearing)', 309),
(14, 'Mischief by destroying or moving etc.cause damage to amount of one hundred', 435),
(15, 'Lurking house-trespass or house-breaking in order to commit offence', 454),
(16, 'Punishment for attempting to commit offences punishable with imprisonment for life or other', 511),
(17, 'Lurking house trespass or house-breaking by night in order to commit offence', 457),
(19, 'Word, gesture or act intended to insult the modesty of a woman', 509);

-- --------------------------------------------------------

--
-- Table structure for table `social_investigation`
--

CREATE TABLE IF NOT EXISTS `social_investigation` (
  `CC_NO` varchar(20) NOT NULL,
  `SERIAL_NO` varchar(20) NOT NULL,
  `MAGISTRATE_COURT` varchar(50) NOT NULL,
  `COURT_PLACE` varchar(40) NOT NULL,
  `COURT_DISTRICT` varchar(30) NOT NULL,
  `OFFENCE` varchar(50) NOT NULL,
  `CRIME_NUMBER` varchar(40) NOT NULL,
  `OFFEN_NAME` varchar(40) NOT NULL,
  `OFFEN_FATHER_NAME` varchar(40) DEFAULT NULL,
  `OFFEN_ADDRESS` text,
  `OFFEN_AGE` varchar(20) DEFAULT NULL,
  `OFFEN_GENDER` varchar(10) DEFAULT NULL,
  `OFFEN_RELIGION` varchar(20) DEFAULT NULL,
  `OFFEN_CASTE` varchar(20) DEFAULT NULL,
  `OFFEN_CHILDHOOD` text,
  `OFFEN_BEHAV` text,
  `OFFEN_TEMPERMENT` text,
  `OFFEN_PHY_MEN_HIST` text,
  `OFFEN_SCHOOL_REC` text,
  `OFFEN_EMP_HIST` text,
  `OFFEN_PRES_OCCU` text,
  `OFFEN_EMP_REPO` text,
  `OFFEN_ASSOCIATES` text,
  `OFFEN_SOC_ORG_CONTACT` text,
  `OFFEN_HOME_CONDI` text,
  `OFFEN_FATHER` text,
  `OFFEN_MOTHER` text,
  `OFFEN_STEP_FATHER` text,
  `OFFEN_STEP_MOTHER` text,
  `OFFEN_BROTHERS` text,
  `OFFEN_SISTERS` text,
  `OFFEN_WIFE` text,
  `OFFEN_CHILDREN` text,
  `OFFEN_INTR_REL` text,
  `OFFEN_INST_FAM_INTREST` text,
  `OFFEN_PARENT_REPO` text,
  `OFFEN_FAM_ATTI` text,
  `OFFEN_NEI_REPO` text,
  `OFFEN_HOME_SURR` text,
  `OFFEN_PREV_INST_REC` text,
  `OFFEN_STATEMENT` text,
  `OFFEN_REACT_ATTI` text,
  `OFFEN_ASSETS` text,
  `OFFEN_LIABILITIES` text,
  `DPO_REMARKS` text,
  `DPO_NAME_ADDR` text,
  `DPO_STATION` text,
  `DISPOSAL_NATURE` text,
  `DISPOSAL_DATE` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`CC_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `social_investigation`
--

INSERT INTO `social_investigation` (`CC_NO`, `SERIAL_NO`, `MAGISTRATE_COURT`, `COURT_PLACE`, `COURT_DISTRICT`, `OFFENCE`, `CRIME_NUMBER`, `OFFEN_NAME`, `OFFEN_FATHER_NAME`, `OFFEN_ADDRESS`, `OFFEN_AGE`, `OFFEN_GENDER`, `OFFEN_RELIGION`, `OFFEN_CASTE`, `OFFEN_CHILDHOOD`, `OFFEN_BEHAV`, `OFFEN_TEMPERMENT`, `OFFEN_PHY_MEN_HIST`, `OFFEN_SCHOOL_REC`, `OFFEN_EMP_HIST`, `OFFEN_PRES_OCCU`, `OFFEN_EMP_REPO`, `OFFEN_ASSOCIATES`, `OFFEN_SOC_ORG_CONTACT`, `OFFEN_HOME_CONDI`, `OFFEN_FATHER`, `OFFEN_MOTHER`, `OFFEN_STEP_FATHER`, `OFFEN_STEP_MOTHER`, `OFFEN_BROTHERS`, `OFFEN_SISTERS`, `OFFEN_WIFE`, `OFFEN_CHILDREN`, `OFFEN_INTR_REL`, `OFFEN_INST_FAM_INTREST`, `OFFEN_PARENT_REPO`, `OFFEN_FAM_ATTI`, `OFFEN_NEI_REPO`, `OFFEN_HOME_SURR`, `OFFEN_PREV_INST_REC`, `OFFEN_STATEMENT`, `OFFEN_REACT_ATTI`, `OFFEN_ASSETS`, `OFFEN_LIABILITIES`, `DPO_REMARKS`, `DPO_NAME_ADDR`, `DPO_STATION`, `DISPOSAL_NATURE`, `DISPOSAL_DATE`) VALUES
('01/14', '1', 'V A.C.M.M Court', 'V A.C.M.M Court', 'JJB Hyderabad', '379 IPC', '08/2013', 'Tommato Pavan Singh@Dammer', '', 'H.No 10-3-162,\r\nAmbedkar Nagar,\r\nTeacher''s colony,\r\nEast maredpally,\r\nsecundrabad', '15', 'male', 'nepali', 'Tommato', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('22/15', '4', 'ctett', 'ctest', 'JJB Anantpur', 'ctest', 'ctest', 'ctestctest', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('222/2015', '111', 'ctest', 'meg test', 'JJB Mehboobnagar', 'off test', '123', 'off test', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('293/2014', 'Nil', 'V Addl. CMM Juvenile Court Hyderabad', 'Principal Magistrate ', 'JJB Hyderabad', '379 IPC', '248/2014', 'Chethan Bhati', 'Ramesh Bhati', 'H.No.15-8-141, Laour adda Begumbazar, Hyd', '16', 'Male', 'Hindu', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('31/2014', '', 'V Addl. CMM Juvenile Court Hyderabad', 'Principal Magistrate ', 'JJB Hyderabad', '380 IPC', '250/2013', 'Mohd Ali', 'Md.Mujeebuddin', 'R/o.20-4-576/1 Khilwath Hussainialam Hyd', '15', 'Male', 'Muslim', 'Muslim', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '2014-07-30 00:00:00'),
('359/2014', 'Nil', 'V Addl. CMM Juvenile Court Hyderabad', 'Principal Magistrate ', 'JJB Hyderabad', '379', '59/2013', 'Faisal Bin Ali', 'Ali bin Abdullah', 'H.No.11-4-352, Bazarghat, Nampally Hyd', '17', 'Male', 'Muslim', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('365/2014', 'Nil', 'V Addl. CMM Juvenile Court Hyderabad', 'Principal Magistrate ', 'JJB Hyderabad', '186, 427, 341', '218/2013', 'Md.Samiullah', 'Md.Rafathullah', 'H.No.16-8-870 New Malakpet Hyderabad', '17', 'Male', 'Muslim', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('368/2014', '140/2014', 'JJB', 'Principal Magistrate ', 'JJB Hyderabad', '160 IPC', '140/2014', 'Sameer baig', 'Hameed baig', 'H.No.11-3-363 Maleepally Hyd', '16', 'Male', 'Muslim', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('70/2014', 'Nil', 'V Addl. CMM Juvenile Court Hyderabad', 'Principal Magistrate ', 'JJB Hyderabad', '448, 354(D) IPC', '02/2014', 'Bainla Sreedhar', 'Paramaiah', 'R/o.8-1-293/A/7, Durga Dwarakanagar Colony, Hyd', '17', 'Male', 'Hindu', 'SC-Bainla', 'Normal birth & Normal grouth', 'Normal & No bad haits', 'Soft Temperment', 'Physically Fit & Mentally Sound', 'Inter 1st year CEC from Lalbahadur Jr College', 'Student', 'Education', '', 'Moves with filmnagar friends', 'No contact', 'Living in rented house 1BHK with RCC Room', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '2014-12-19 00:00:00'),
('73/2014', 'Nil', 'V. Addl.CMM Juvenile Court Hyderabad', 'Principal Magistrate', 'JJB Hyderabad', '338 IPC & Sec.117(13) & 196(a) of MV Act', '09/2014', 'Manik', 'Prabhu', 'H.No.14-10-617, Jinsichowrahi, Dhoolpet, Hyd', '18', 'male', 'Hindu', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL),
('94/2014', 'Nil', 'V Addl. CMM Juvenile Court Hyderabad', 'Principal Magistrate ', 'JJB Hyderabad', '379 IPC', '238/2014', 'Madumohe Singh', 'Gavrango Singh', 'H.No.13-1-432 back side Mangalhat PS Hyderabad', '17', 'Male', 'Hindu', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `social_investigation_order`
--

CREATE TABLE IF NOT EXISTS `social_investigation_order` (
  `CC_NO` varchar(20) NOT NULL,
  `DISTRICT_ID` varchar(20) NOT NULL,
  `FIR_NO` varchar(20) NOT NULL,
  `POLICE_STATION` varchar(30) NOT NULL,
  `ACCUSED_ID` int(11) NOT NULL,
  `INTIMATION_SENT` varchar(5) NOT NULL,
  `DPO_NAME` varchar(40) NOT NULL,
  `DPO_ADDRESS` text NOT NULL,
  `DPO_INTI_ORDER_NO` varchar(20) DEFAULT NULL,
  `SUBMIT_BEFORE_DATE` date NOT NULL,
  `TIME_PERIOD` varchar(20) NOT NULL,
  PRIMARY KEY (`CC_NO`),
  KEY `ACCUSED_ID` (`ACCUSED_ID`),
  KEY `fk_siorder_fir_det` (`FIR_NO`,`POLICE_STATION`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `social_investigation_order`
--

INSERT INTO `social_investigation_order` (`CC_NO`, `DISTRICT_ID`, `FIR_NO`, `POLICE_STATION`, `ACCUSED_ID`, `INTIMATION_SENT`, `DPO_NAME`, `DPO_ADDRESS`, `DPO_INTI_ORDER_NO`, `SUBMIT_BEFORE_DATE`, `TIME_PERIOD`) VALUES
('01/14', 'JJB Hyderabad', '8/2013', 'tukaramgate', 1, 'YES', 'The DPO', 'RIP Office,saidabad', '08/2013', '2013-05-12', '3 months'),
('22/15', 'JJB Krishna', '888/2014', 'Madannapet', 42, 'YES', 'test dpo', 'vijayawada', '236', '2015-04-06', '3 months'),
('222/2015', 'JJB Kurnool', '111/2015', 'pstest', 43, 'YES', 'the dpo', 'addr', NULL, '2015-03-19', '3 months'),
('239/2014', 'JJB Hyderabad', '56/2014', 'Musheerabad', 28, 'YES', 'Regional Inspector of Probation', 'Saidabad\r\nHyd', 'Nil', '2014-05-28', ''),
('293/2014', 'JJB Hyderabad', '248/2014', 'Shahinayathgunj', 9, 'YES', 'Regional Inspector of Probation', 'Saidabad \r\nHyd', 'Nil', '2014-11-08', ''),
('297/2014', 'JJB Hyderabad', '349/2014', 'Malakpet', 38, 'YES', 'THE DPO', 'Rangareddy Dist', '00', '2014-07-11', ''),
('3/2014', 'JJB Hyderabad', '228/2013', 'kulsumapura', 3, 'YES', 'The DPO', 'H.No16-10-228/4,\r\nMunipal colony,old malakpet,Hyderabad', '3/2014', '2014-02-01', '3 months'),
('31/2014', 'JJB Hyderabad', '250/2013', 'Hussainialam', 36, 'YES', 'Regional Inspector of Probation', 'hyd dist', '00', '2013-12-30', ''),
('359/2014', 'JJB Hyderabad', '59/2013', 'Saifabad', 25, 'YES', 'THE DPO', 'Muncipal Colony, Oldmalakpet, Hyd', 'Nil', '2013-06-20', ''),
('365/2014', 'JJB Hyderabad', '218/2013', 'Dabeerpura', 30, 'YES', 'THE DPO', 'Rangareddy', '00', '2014-10-20', ''),
('368/2014', 'JJB Hyderabad', '140/2014', 'Habeebnagar', 26, 'YES', 'Sri.N.Nageswar Rao', 'Saidabad Hyd', 'Nil', '2014-07-21', 'three months'),
('62/2014', 'JJB Hyderabad', '9/2014', 'Chilkalguda', 32, 'YES', 'Regional Inspector of Probation', 'Saidabad\r\nHyderabad', '0', '2014-04-17', ''),
('70/2014', 'JJB Hyderabad', '2/2014', 'Banjara Hills', 31, 'YES', 'Sri.N.Nageswar Rao', 'Malakpet\r\nHyd', 'Nil', '2014-10-20', ''),
('73/2014', 'JJB Hyderabad', '9/2014', 'Shahinayathgunj', 41, 'YES', 'THE DPO', 'Saidabad\r\nHyd', '0', '2014-06-11', ''),
('94/2014', 'JJB Hyderabad', '238/2014', 'Shahinayathgunj', 37, 'YES', 'THE DPO', 'Gr-II\r\nDivision-II\r\nHyd', '00', '2014-08-02', '');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `court_surrender`
--
ALTER TABLE `court_surrender`
  ADD CONSTRAINT `fk_fir_details` FOREIGN KEY (`FIR_NO`, `POLICE_STATION`) REFERENCES `fir` (`FIR_NO`, `POLICE_STATION`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `enquiry_process`
--
ALTER TABLE `enquiry_process`
  ADD CONSTRAINT `enquiry_process_ibfk_1` FOREIGN KEY (`CC_NO`) REFERENCES `social_investigation_order` (`CC_NO`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `remand_case_dairy`
--
ALTER TABLE `remand_case_dairy`
  ADD CONSTRAINT `fk_remand_fir_det` FOREIGN KEY (`FIR_NO`, `POLICE_STATION`) REFERENCES `fir` (`FIR_NO`, `POLICE_STATION`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `remand_case_dairy_ibfk_1` FOREIGN KEY (`ACCUSED_ID`) REFERENCES `court_surrender` (`ACCUSED_ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `social_investigation`
--
ALTER TABLE `social_investigation`
  ADD CONSTRAINT `social_investigation_ibfk_1` FOREIGN KEY (`CC_NO`) REFERENCES `social_investigation_order` (`CC_NO`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `social_investigation_order`
--
ALTER TABLE `social_investigation_order`
  ADD CONSTRAINT `fk_siorder_fir_det` FOREIGN KEY (`FIR_NO`, `POLICE_STATION`) REFERENCES `fir` (`FIR_NO`, `POLICE_STATION`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `social_investigation_order_ibfk_1` FOREIGN KEY (`ACCUSED_ID`) REFERENCES `court_surrender` (`ACCUSED_ID`) ON DELETE CASCADE ON UPDATE CASCADE;
