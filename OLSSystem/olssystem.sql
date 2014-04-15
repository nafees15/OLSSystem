# Host: localhost  (Version: 5.0.67-community-nt)
# Date: 2014-04-14 14:28:37
# Generator: MySQL-Front 5.3  (Build 4.113)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "course"
#

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `COURSEID` varchar(18) NOT NULL default '',
  `COURSENAME` varchar(80) default NULL,
  `OPENSEMESTER` varchar(18) default NULL,
  `CREDIT` int(11) default NULL,
  `STATE` varchar(8) default NULL,
  `DESCRIPTION` varchar(4000) default NULL,
  PRIMARY KEY  (`COURSEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "course"
#

INSERT INTO `course` VALUES ('MS1082014','Micro Statistics','2014 Summer',3,'open','Awesome Course.'),('SE5182014','Software Engineering','2014 Spring',3,'inside','Cool Course.');

#
# Structure for table "fillblankquestion"
#

DROP TABLE IF EXISTS `fillblankquestion`;
CREATE TABLE `fillblankquestion` (
  `QUESTIONID` varchar(12) NOT NULL default '',
  `CONTENT` varchar(5000) default NULL,
  `OPTION` varchar(255) default NULL,
  `CORRECT` varchar(30) default NULL,
  `HINTS` varchar(2000) default NULL,
  PRIMARY KEY  (`QUESTIONID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "fillblankquestion"
#

INSERT INTO `fillblankquestion` VALUES ('','asdasadsd#,dada#asdad.',NULL,NULL,NULL);

#
# Structure for table "mutichoicequestion"
#

DROP TABLE IF EXISTS `mutichoicequestion`;
CREATE TABLE `mutichoicequestion` (
  `QUESTIONID` varchar(18) NOT NULL default '',
  `CONTENT` varchar(5000) default NULL,
  `OPTION` varchar(4000) default NULL,
  `CORRECT` varchar(255) default NULL,
  `HINTS` varchar(2000) default NULL,
  PRIMARY KEY  (`QUESTIONID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "mutichoicequestion"
#


#
# Structure for table "notification"
#

DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
  `Id` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "notification"
#


#
# Structure for table "questionlist"
#

DROP TABLE IF EXISTS `questionlist`;
CREATE TABLE `questionlist` (
  `QUIZID` varchar(18) NOT NULL default '',
  `QUESTIONID` varchar(255) default NULL,
  PRIMARY KEY  (`QUIZID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "questionlist"
#


#
# Structure for table "quiz"
#

DROP TABLE IF EXISTS `quiz`;
CREATE TABLE `quiz` (
  `QUIZID` varchar(18) NOT NULL default '',
  `QUIZNAME` varchar(25) NOT NULL default '',
  `DUETIME` datetime default '0000-00-00 00:00:00',
  `QUIZFULLGRADE` float(3,1) default NULL,
  `TOTALQUESTIONNUMBER` int(3) unsigned default '0',
  PRIMARY KEY  (`QUIZID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "quiz"
#


#
# Structure for table "quizlist"
#

DROP TABLE IF EXISTS `quizlist`;
CREATE TABLE `quizlist` (
  `COURSEID` varchar(11) NOT NULL default '0',
  `QUIZID` varchar(255) default NULL,
  PRIMARY KEY  (`COURSEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "quizlist"
#


#
# Structure for table "student"
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `STUDENTID` varchar(20) NOT NULL default '',
  `SEX` varchar(8) default NULL,
  `FIRSTNAME` varchar(20) default NULL,
  `LASTNAME` varchar(20) default NULL,
  `DOB` date default '0000-00-00',
  `EMAIL` varchar(35) default NULL,
  `PHONENUMBER` varchar(18) default NULL,
  `PASSWORD` varchar(20) NOT NULL default '',
  PRIMARY KEY  (`STUDENTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "student"
#

INSERT INTO `student` VALUES ('aa007','male','Alex','Allen','0000-00-00','aallen@albany.edu','518911007','aa123456'),('zw486854','male','zeyang','wu','1991-01-01','zeyang@albany.edu','518911911','zw123456');

#
# Structure for table "teacher"
#

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `TEACHERID` varchar(20) NOT NULL default '',
  `SEX` varchar(8) default NULL,
  `FIRSTNAME` varchar(20) default NULL,
  `LASTNAME` varchar(20) default NULL,
  `DOB` date default '0000-00-00',
  `EMAIL` varchar(35) default NULL,
  `PHONENUMBER` varchar(18) default NULL,
  `PASSWORD` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`TEACHERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "teacher"
#

INSERT INTO `teacher` VALUES ('RK518007','female','Karin','Reinhold','1970-01-01','rk2@albany.edu','518911007','rk123456');
