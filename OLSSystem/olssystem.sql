# Host: localhost  (Version: 5.0.67-community-nt)
# Date: 2014-04-30 18:21:38
# Generator: MySQL-Front 5.3  (Build 4.121)

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

INSERT INTO `course` VALUES ('MS1082014','Micro Statistics','2014 Summer',3,'open','Awesome Course.'),('SC108007','Statistical Concept','2014fall',3,'inside',NULL),('SE5182014','Software Engineering','2014 Spring',3,'inside','Cool Course.');

#
# Structure for table "fb_id_seq"
#

DROP TABLE IF EXISTS `fb_id_seq`;
CREATE TABLE `fb_id_seq` (
  `id` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Data for table "fb_id_seq"
#

INSERT INTO `fb_id_seq` VALUES (1),(2),(3),(4),(5),(6),(7);

#
# Structure for table "fillblankquestion"
#

DROP TABLE IF EXISTS `fillblankquestion`;
CREATE TABLE `fillblankquestion` (
  `QUESTIONID` varchar(20) NOT NULL default '"0"',
  `CONTENT` varchar(5000) default NULL,
  `OPTION` varchar(255) default NULL,
  `CORRECT` varchar(30) default NULL,
  `POINT` int(11) default NULL,
  `HINTS` varchar(2000) default NULL,
  PRIMARY KEY  (`QUESTIONID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "fillblankquestion"
#

INSERT INTO `fillblankquestion` VALUES ('fb00001','Use the following sample data -5，3， -1， 2，8. Find the sample mean of the data.<splitter>The sample standard deviation of the data is closest to<splitter>Find the median of the data.','(a) 2<op>(b) 1.4<op>(c) 3<splitter>(a) 4.317<op>(b) 23.3<op>(c)4.827<splitter>(a) 2<op>(b) 1.4<op>(c)-1','1<splitter>2<splitter>3',5,'correct answer: a, b, c'),('fb00002','The mean price of new homes from a sample of houses is $150; 000 with a standard deviationof $15; 000. The data set has a bell-shaped distribution. Between what two prices do 95% of the new homes fall?<splitter>Find the approximate percentage of new homes whose prices are less than $135; 000?<splitter>If the price of a new home is $195; 000, what is the corresponding z-score?','$135,000 and $165,000<op>$165,000 and $180,000<op>$105,000 and $195,000<splitter>34%<op>16%<op>84%<splitter>z=-2<op>z=2<op>z=-3','1<splitter>2<splitter>3',5,'correct answer: a, b, c'),('fb00003','content11','option','correct',5,'hints'),('fb00004','content11','option','correct',5,'hints'),('fb00005','aaaaaaaaaaaaaaaaaaaaaaa<splitter>sdfffffffffffff<splitter>asdasdasd','sadfasdfasdf<op>asfdsadfsad<op>asdasdasd<splitter>dddddddddd<op>asdasdasd<op><splitter>aaaa<op>asdasdasdasd<op>','2<splitter>2<splitter>1',5,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'),('fb00006','aaaaaaaaaaaaaaaaaaaaaaa<splitter>sdfffffffffffff<splitter>asdasdasd','sadfasdfasdf<op>asfdsadfsad<op><splitter>dddddddddd<op>asdasdasd<op>asdasdasdasda<splitter>aaaa<op>asdasdasdasd<op>asdadasdasdasddsadas','1<splitter>2<splitter>2',5,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa'),('fb00007','aaaaaaaaaaaaaaaaaaaaaaa<splitter>sadfdasf<splitter>sdfsadfsdf','aaaaaaaaaaaaaaaaaaaaaaaaaaaaa<op>asfdsadfsad<op>asdasdasd<splitter>dddddddddd<op>asdasdasd<op>asdasdasdasda<splitter>aaaa<op>sdfsdfsdfsdf<op>','1<splitter>1<splitter>1',4,'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa');

#
# Structure for table "mc_id_seq"
#

DROP TABLE IF EXISTS `mc_id_seq`;
CREATE TABLE `mc_id_seq` (
  `id` int(11) NOT NULL auto_increment,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for table "mc_id_seq"
#

INSERT INTO `mc_id_seq` VALUES (1),(2),(3),(4),(5),(6);

#
# Structure for table "multichoicequestion"
#

DROP TABLE IF EXISTS `multichoicequestion`;
CREATE TABLE `multichoicequestion` (
  `QUESTIONID` varchar(20) NOT NULL default '"0"',
  `CONTENT` varchar(5000) default NULL,
  `OPTION` varchar(4000) default NULL,
  `CORRECT` varchar(255) default NULL,
  `POINT` int(11) default NULL,
  `HINTS` varchar(2000) default NULL,
  PRIMARY KEY  (`QUESTIONID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "multichoicequestion"
#

INSERT INTO `multichoicequestion` VALUES ('mc00001','Two basic divisions of statistics are','inferential and descriptive.<splitter>population and sample. <splitter>sampling and scaling.<splitter>mean and median. ','A',5,'The two divisions of statistics are inferential and descriptive.'),('mc00002','Check all that apply. Inferential  statistics','allow random assignment to experimental conditions. <splitter>use data from a sample to answer questions about a population.<splitter>summarize and describe data.<splitter>allow you to generalize beyond the data at hand.','B,D',5,'Inferential statistics use data from a sample to answer questions about a population. Inferential statistics involves generalizing beyond the data at hand.'),('mc00003','Which of the following are descriptive statistics? ','The mean age of people in Detroit. <splitter>The number of people who watched the superbowl in the year 2002.<splitter>A prediction of next month\'s unemployment rate. <splitter>The median price of new homes sold in Miami.<splitter>The height of the tallest woman in the world. ','A,B,D,E',5,'Descriptive statistics are numbers that are used to summarize and describe data. Predicting next month\'s unemployment rate involves predicting future data, no describing the data at hand.'),('mc00004','aaaaaaaaaaaaaaaaaaaaa','Adil<splitter>Naffes<splitter>WangFAn<splitter>Adil<splitter>Hardeev','B',2,'aaaaaaaaaa'),('mc00005','aaaaaaaaaaaaaaaaaaaaa','Adil<splitter>Naffes<splitter>WangFAn<splitter>Adil<splitter>Hardeev','B',2,'aaaaaaaaaa'),('mc00006','aaaaaaaaaaaaaaaaaaaaa','Adil<splitter>Naffes<splitter>WangFAn<splitter>Adil<splitter>Hardeev','B',2,'aaaaaaaaaa');

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
  `QUESTIONID` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`QUIZID`,`QUESTIONID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "questionlist"
#

INSERT INTO `questionlist` VALUES ('quiz001','fb00001'),('quiz001','fb00002'),('quiz001','mc00002'),('quiz002','fb00002'),('quiz002','mc00003'),('quiz006','fb00005'),('quiz006','fb00007'),('quiz006','mc00004');

#
# Structure for table "quiz"
#

DROP TABLE IF EXISTS `quiz`;
CREATE TABLE `quiz` (
  `QUIZID` varchar(18) NOT NULL default '',
  `QUIZNAME` varchar(25) NOT NULL default '',
  `DUETIME` varchar(30) default '0000-00-00 00:00:00',
  `QUIZFULLGRADE` float(3,1) default NULL,
  `TOTALQUESTIONNUMBER` int(3) unsigned default '0',
  PRIMARY KEY  (`QUIZID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "quiz"
#

INSERT INTO `quiz` VALUES ('quiz001','statistics-quiz-01','2014-05-30 23:59:59',10.0,3),('quiz002','statistics-quiz-02','2014-06-30 18:00:00',20.0,2),('quiz003','Mid-Term','2014-05-13T23:59',0.0,0),('quiz004','Wuze jiaoshou','2014-05-05T00:00',0.0,0),('quiz006','Wuze jiaoshou','2014-05-07T12:59',0.0,3);

#
# Structure for table "quizlist"
#

DROP TABLE IF EXISTS `quizlist`;
CREATE TABLE `quizlist` (
  `COURSEID` varchar(11) NOT NULL default '0',
  `QUIZID` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`COURSEID`,`QUIZID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "quizlist"
#

INSERT INTO `quizlist` VALUES ('MS1082014','quiz001'),('MS1082014','quiz002'),('SC108007','quiz006');

#
# Structure for table "register"
#

DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `STUDENTID` varchar(20) NOT NULL default '',
  `COURSEID` varchar(18) NOT NULL default '',
  PRIMARY KEY  (`STUDENTID`,`COURSEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "register"
#

INSERT INTO `register` VALUES ('aa007','MS1082014');

#
# Structure for table "student"
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `STUDENTID` varchar(20) NOT NULL default '',
  `SEX` varchar(8) default NULL,
  `FIRSTNAME` varchar(20) default NULL,
  `LASTNAME` varchar(20) default NULL,
  `DOB` varchar(30) default '0000-00-00',
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
# Structure for table "teach"
#

DROP TABLE IF EXISTS `teach`;
CREATE TABLE `teach` (
  `TEACHERID` varchar(20) NOT NULL default '',
  `COURSEID` varchar(18) NOT NULL default '',
  PRIMARY KEY  (`TEACHERID`,`COURSEID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "teach"
#

INSERT INTO `teach` VALUES ('RK518007','MS1082014'),('RK518007','SC108007');

#
# Structure for table "teacher"
#

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `TEACHERID` varchar(20) NOT NULL default '',
  `SEX` varchar(8) default NULL,
  `FIRSTNAME` varchar(20) default NULL,
  `LASTNAME` varchar(20) default NULL,
  `DOB` varchar(30) default '0000-00-00',
  `EMAIL` varchar(35) default NULL,
  `PHONENUMBER` varchar(18) default NULL,
  `PASSWORD` varchar(255) NOT NULL default '',
  PRIMARY KEY  (`TEACHERID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "teacher"
#

INSERT INTO `teacher` VALUES ('RK518007','female','Karin','Reinhold','1970-01-01','rk2@albany.edu','518911007','rk123456');

DROP VIEW IF EXISTS `vi_course_register`;
CREATE VIEW `vi_course_register` AS 
  select `olssystem`.`course`.`COURSEID` AS `COURSEID`,`olssystem`.`course`.`COURSENAME` AS `COURSENAME`,`olssystem`.`course`.`OPENSEMESTER` AS `OPENSEMESTER`,`olssystem`.`course`.`CREDIT` AS `CREDIT`,`olssystem`.`course`.`STATE` AS `STATE`,`olssystem`.`course`.`DESCRIPTION` AS `DESCRIPTION`,`olssystem`.`register`.`STUDENTID` AS `studentID` from (`olssystem`.`course` join `olssystem`.`register`) where (`olssystem`.`course`.`COURSEID` = `olssystem`.`register`.`COURSEID`);

DROP VIEW IF EXISTS `vi_course_teach`;
CREATE VIEW `vi_course_teach` AS 
  select `olssystem`.`course`.`COURSEID` AS `COURSEID`,`olssystem`.`course`.`COURSENAME` AS `COURSENAME`,`olssystem`.`course`.`OPENSEMESTER` AS `OPENSEMESTER`,`olssystem`.`course`.`CREDIT` AS `CREDIT`,`olssystem`.`course`.`STATE` AS `STATE`,`olssystem`.`course`.`DESCRIPTION` AS `DESCRIPTION`,`olssystem`.`teach`.`TEACHERID` AS `teacherID` from (`olssystem`.`course` join `olssystem`.`teach`) where (`olssystem`.`course`.`COURSEID` = `olssystem`.`teach`.`COURSEID`);

DROP VIEW IF EXISTS `vi_fillblankquestion_questionlist`;
CREATE VIEW `vi_fillblankquestion_questionlist` AS 
  select `olssystem`.`fillblankquestion`.`QUESTIONID` AS `QUESTIONID`,`olssystem`.`fillblankquestion`.`CONTENT` AS `CONTENT`,`olssystem`.`fillblankquestion`.`OPTION` AS `OPTION`,`olssystem`.`fillblankquestion`.`CORRECT` AS `CORRECT`,`olssystem`.`fillblankquestion`.`POINT` AS `POINT`,`olssystem`.`fillblankquestion`.`HINTS` AS `HINTS`,`olssystem`.`questionlist`.`QUIZID` AS `quizID` from (`olssystem`.`fillblankquestion` join `olssystem`.`questionlist`) where (`olssystem`.`fillblankquestion`.`QUESTIONID` = `olssystem`.`questionlist`.`QUESTIONID`);

DROP VIEW IF EXISTS `vi_multichoicequestion_questionlist`;
CREATE VIEW `vi_multichoicequestion_questionlist` AS 
  select `olssystem`.`multichoicequestion`.`QUESTIONID` AS `QUESTIONID`,`olssystem`.`multichoicequestion`.`CONTENT` AS `CONTENT`,`olssystem`.`multichoicequestion`.`OPTION` AS `OPTION`,`olssystem`.`multichoicequestion`.`CORRECT` AS `CORRECT`,`olssystem`.`multichoicequestion`.`POINT` AS `POINT`,`olssystem`.`multichoicequestion`.`HINTS` AS `HINTS`,`olssystem`.`questionlist`.`QUIZID` AS `quizID` from (`olssystem`.`multichoicequestion` join `olssystem`.`questionlist`) where (`olssystem`.`multichoicequestion`.`QUESTIONID` = `olssystem`.`questionlist`.`QUESTIONID`);

DROP VIEW IF EXISTS `vi_quiz_quizlist`;
CREATE VIEW `vi_quiz_quizlist` AS 
  select `olssystem`.`quiz`.`QUIZID` AS `QUIZID`,`olssystem`.`quiz`.`QUIZNAME` AS `QUIZNAME`,`olssystem`.`quiz`.`DUETIME` AS `DUETIME`,`olssystem`.`quiz`.`QUIZFULLGRADE` AS `QUIZFULLGRADE`,`olssystem`.`quiz`.`TOTALQUESTIONNUMBER` AS `TOTALQUESTIONNUMBER`,`olssystem`.`quizlist`.`COURSEID` AS `courseID` from (`olssystem`.`quiz` join `olssystem`.`quizlist`) where (`olssystem`.`quiz`.`QUIZID` = `olssystem`.`quizlist`.`QUIZID`);

#
# Trigger "fbq_table_insert"
#

DROP TRIGGER IF EXISTS `fbq_table_insert`;
CREATE DEFINER='root'@'localhost' TRIGGER `olssystem`.`fbq_table_insert` BEFORE INSERT ON `olssystem`.`fillblankquestion`
  FOR EACH ROW BEGIN
  INSERT INTO fb_id_seq VALUES (NULL);
  SET NEW.questionid = CONCAT('fb', LPAD(LAST_INSERT_ID(), 5, '0'));
END;

#
# Trigger "mcq_table_insert"
#

DROP TRIGGER IF EXISTS `mcq_table_insert`;
CREATE DEFINER='root'@'localhost' TRIGGER `olssystem`.`mcq_table_insert` BEFORE INSERT ON `olssystem`.`multichoicequestion`
  FOR EACH ROW BEGIN
  INSERT INTO mc_id_seq VALUES (NULL);
  SET NEW.questionid = CONCAT('mc', LPAD(LAST_INSERT_ID(), 5, '0'));
END;
