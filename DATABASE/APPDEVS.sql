CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.5-m15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `action`
--

DROP TABLE IF EXISTS `action`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `action` (
  `actionId` int(11) NOT NULL AUTO_INCREMENT,
  `roleId` int(11) NOT NULL,
  `action` varchar(45) DEFAULT NULL,
  `flag` binary(1) DEFAULT '1',
  PRIMARY KEY (`actionId`,`roleId`),
  KEY `fk_action_role1_idx` (`roleId`),
  CONSTRAINT `fk_action_role1` FOREIGN KEY (`roleId`) REFERENCES `role` (`roleId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `action`
--

LOCK TABLES `action` WRITE;
/*!40000 ALTER TABLE `action` DISABLE KEYS */;
/*!40000 ALTER TABLE `action` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `customerTin` decimal(9,0) NOT NULL,
  `employeeId` char(5) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `clientName` varchar(45) NOT NULL,
  `companyAddress` varchar(45) NOT NULL,
  `contactPerson` varchar(45) NOT NULL,
  `contact_num` varchar(15) NOT NULL,
  PRIMARY KEY (`customerTin`),
  KEY `fk_customer_employee1_idx` (`employeeId`),
  KEY `fk_customer_user1_idx` (`userId`),
  CONSTRAINT `fk_customer_employee1` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`employeeId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_customer_user1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (20869924,'AKA94',135,'arcu@et.net','Metus Limited','5405 Augue St.','Moana','+639193737286'),(23795191,'IGL57',108,'id@cursusnonegestas.com','Augue PC','229-2327 Orci, Av.','Sylvia','+639138168169'),(31177846,'AKA94',200,'penatibus@adipiscing.net','Est Associates','Ap #930-6341 Proin Avenue','Brody','+639144668753'),(35442966,'BCP48',110,'pede@Proinnon.ca','Sollicitudin Adipiscing Ligula Ltd','P.O. Box 841, 7154 Natoque Rd.','Tyler','+639157817678'),(43444641,'FBD91',189,'arcu.iaculis.enim@eumetusIn.co.uk','Pellentesque Massa PC','836-7060 Habitant Rd.','Jescie','+639116317265'),(43802756,'AKA94',146,'Nunc@Phasellus.edu','Porta Foundation','Ap #714-2005 Molestie Ave','Sloane','+639189445996'),(46714684,'OBH36',111,'nibh.dolor@in.edu','Magna LLC','6488 Lobortis, Av.','Iola','+639142166448'),(98062285,'FQV71',145,'vitae.mauris@Duiselementumdui.org','Quisque Foundation','P.O. Box 593, 6428 Malesuada Road','Alyssa','+639164137663'),(98334204,'OBH36',141,'dolor@augue.net','Felis Ullamcorper LLP','Ap #662-6678 Magna. Avenue','Clarke','+639162497624'),(102902937,'BCP48',140,'nisi.nibh@imperdietnon.net','Fringilla Industries','P.O. Box 479, 3175 Nulla. Road','Jason','+639129174932'),(113437230,'OBH36',188,'semper@ultricesmaurisipsum.net','Arcu Foundation','Ap #633-4596 Rutrum, Street','Wanda','+639173998498'),(132252215,'IGL57',192,'sit@anteMaecenas.com','Metus PC','790-2387 Class St.','Hillary','+639136185957'),(148660144,'IGL57',194,'et.magnis.dis@ipsum.org','Tincidunt Donec Incorporated','2129 Amet St.','Yvonne','+639128329447'),(167470887,'FQV71',147,'cursus@pharetra.net','Vel LLC','P.O. Box 919, 1168 Sit Ave','Kaseem','+639153394731'),(174506966,'FQV71',190,'laoreet@diam.ca','Adipiscing Foundation','P.O. Box 531, 4106 Vehicula. Avenue','Amery','+639195816569'),(176221986,'IGL57',148,'senectus.et@Quisquetinciduntpede.org','Curabitur Egestas Nunc PC','P.O. Box 531, 9254 Dui, Rd.','Daniel','+639199812338'),(179655918,'CGF62',187,'Nulla@turpisvitaepurus.edu','Congue LLP','Ap #837-4477 Donec St.','Herman','+639116917157'),(192187946,'CGF62',167,'non.egestas.a@Donec.co.uk','Amet Risus PC','203-130 Quis, Street','Walker','+639148574214'),(195421966,'COF73',168,'vel.pede@elit.org','Magnis Dis Parturient Company','356-463 Blandit. St.','Tyrone','+639182379667'),(198088057,'OBH36',136,'Curae.Phasellus@velitduisemper.net','Ut Aliquam Iaculis Company','P.O. Box 213, 1421 Varius Rd.','Quyn','+639138524154'),(200015637,'FQV71',172,'enim@lectusconvallisest.edu','Lorem Incorporated','8009 Purus, St.','Bernard','+639168393937'),(217339241,'CGF62',137,'elit.Curabitur.sed@at.edu','Est Congue Incorporated','284 Consectetuer Road','Uriel','+639146531145'),(221964176,'AKA94',125,'In@Duisdignissimtempor.net','Tellus Aenean Egestas Institute','P.O. Box 950, 7350 Diam. Street','Christopher','+639117517762'),(223422988,'IGL57',173,'laoreet.ipsum.Curabitur@milorem.org','Iaculis Nec Associates','Ap #410-2445 Eu, Road','Hollee','+639143569971'),(257573821,'BCP48',164,'risus@placerategetvenenatis.org','Quisque Incorporated','5662 Amet, Av.','Acton','+639176974527'),(266327787,'BCP48',160,'nec.quam@lectus.org','Nunc Industries','428-4202 Dolor. Rd.','Kirestin','+639168146192'),(318084953,'FBD91',129,'ornare.placerat.orci@Suspendissealiquetmolestie.net','Vulputate Velit Eu Consulting','Ap #184-4772 In St.','Drake','+639157795571'),(319142866,'CGF62',117,'nonummy@sedduiFusce.edu','Mauris Corp.','196-2162 Enim Av.','Elton','+639117851154'),(319852060,'AKA94',143,'arcu.Sed.et@lectus.com','Dictum Sapien LLP','Ap #826-3281 Diam. Rd.','Keelie','+639191296349'),(323672246,'IGL57',127,'aliquam@enim.org','Mauris Molestie Pharetra Foundation','P.O. Box 397, 9762 Praesent Av.','Burke','+639167633841'),(324362080,'FQV71',176,'mattis@Donec.edu','Ante Bibendum Industries','9277 Adipiscing, Avenue','Drew','+639113959735'),(333264636,'AKA94',183,'per@faucibusut.org','Sed PC','Ap #586-6381 Arcu. Rd.','Deborah','+639199287956'),(336152920,'IGL57',198,'lobortis.mauris.Suspendisse@lacus.org','Tincidunt Institute','9781 Auctor St.','Nyssa','+639195692491'),(338311495,'AKA94',152,'Maecenas@dolorNulla.com','Est Nunc Ullamcorper Ltd','P.O. Box 679, 8735 Consectetuer St.','Matthew','+639115445854'),(345280127,'FBD91',195,'tortor.at@orciUtsemper.ca','Duis At Lacus Consulting','Ap #167-9363 In St.','Sopoline','+639196357137'),(346249647,'OBH36',163,'iaculis@arcu.net','Vel Arcu Curabitur Ltd','244-9922 Lacinia Street','Lars','+639174488498'),(351551399,'CGF62',101,'nibh.Phasellus.nulla@rhoncusNullamvelit.edu','Ullamcorper Magna Sed LLP','Ap #982-2904 Duis Avenue','Gil','+639161561737'),(357708488,'FBD91',121,'Nam.nulla.magna@dolornonummyac.org','Laoreet Libero Et Company','354-1461 Luctus Street','Gage','+639135121166'),(360422515,'FBD91',126,'Aliquam.vulputate@dapibus.org','Commodo Inc.','P.O. Box 971, 1417 Euismod Road','Jemima','+639192959593'),(365422908,'FQV71',123,'vestibulum.massa.rutrum@nullaDonec.ca','Mauris Erat Eget Industries','Ap #192-7710 Sed Avenue','Brielle','+639155145667'),(367856596,'BCP48',186,'Donec.vitae@eratvolutpatNulla.co.uk','Bibendum Associates','Ap #177-6822 Congue St.','Pamela','+639179925752'),(371352955,'BCP48',118,'scelerisque@sollicitudin.ca','Et Risus LLC','7808 Nullam Rd.','Tate','+639178383971'),(391244440,'IGL57',165,'Aliquam.tincidunt@enimconsequat.co.uk','Vulputate Ullamcorper Magna Industries','P.O. Box 168, 3751 Lobortis, Av.','Whilemina','+639177838676'),(416469052,'AKA94',174,'dignissim@tristique.com','Ipsum Non Arcu Corp.','P.O. Box 248, 8916 Duis St.','Hillary','+639138866544'),(444293692,'CBD51',184,'neque@cursus.com','Nisi Dictum Company','3347 Consectetuer Avenue','Derek','+639149389866'),(444990785,'AKA94',149,'luctus.aliquet.odio@Praesent.edu','In Lorem Donec Ltd','Ap #620-5167 Quam. Rd.','Ian','+639117783144'),(469867962,'AKA94',150,'bibendum.sed@Proinnisl.edu','Sit Amet LLP','P.O. Box 827, 3563 Proin Street','Nerea','+639144485982'),(484363690,'BCP48',119,'tempor.diam.dictum@porttitorscelerisqueneque.edu','Fringilla Est Limited','Ap #843-4166 Nunc Avenue','Melyssa','+639132858898'),(486361192,'FBD91',191,'senectus.et@Curae.com','Augue Consulting','1202 Est Rd.','Thor','+639111785913'),(516854074,'OBH36',115,'purus@Vivamus.com','Tempus Corp.','288-4204 Velit. Street','Rae','+639157299756'),(517508441,'CBD51',139,'mauris.ipsum.porta@Etiamvestibulum.com','In Hendrerit Consectetuer PC','Ap #891-9935 Dolor. Rd.','Nina','+639126431753'),(531529032,'OBH36',132,'tincidunt.orci@lobortisrisusIn.org','Mollis Lectus Pede LLP','1882 Magna. St.','Noah','+639188724968'),(545564554,'FBD91',138,'fermentum.arcu@mus.ca','Leo Vivamus Corporation','P.O. Box 726, 881 Nec, St.','Samson','+639175449979'),(586398633,'BCP48',185,'id.blandit@iaculisneceleifend.co.uk','Lectus Nullam Suscipit Institute','322-9674 In Avenue','Chastity','+639178545949'),(603415324,'AKA94',114,'at@quis.edu','Sed Facilisis Vitae Ltd','8703 Viverra. Av.','Shay','+639179175116'),(606149698,'CGF62',105,'et.tristique@mattisIntegereu.co.uk','Parturient Montes Nascetur LLC','198 Amet, Rd.','Amy','+639131786574'),(608389324,'OBH36',199,'eu.erat.semper@egestasAliquam.com','Sapien Nunc Consulting','430-679 Amet St.','Stacy','+639117737937'),(609891579,'FQV71',169,'aliquam.arcu@dignissim.com','Malesuada Corporation','504-8700 Pellentesque, St.','Lacota','+639194315185'),(612088029,'CBD51',151,'eros.nec@pellentesqueSeddictum.edu','Ac Libero Ltd','P.O. Box 779, 5967 Iaculis, Rd.','Jarrod','+639199848426'),(621068354,'AKA94',156,'feugiat.tellus@egestas.edu','Tempus Eu Incorporated','Ap #551-6024 Scelerisque Rd.','Kirby','+639117364512'),(621589088,'COF73',116,'sociis.natoque.penatibus@necmalesuadaut.ca','Tellus Industries','P.O. Box 334, 2225 Tempus Street','Celeste','+639188346362'),(624182159,'IGL57',102,'odio.Nam.interdum@gravida.org','Lacus Quisque Institute','P.O. Box 249, 9910 Luctus. Rd.','Iola','+639195391556'),(640972814,'AKA94',104,'ipsum@sociis.co.uk','Elementum Purus Accumsan PC','930-9872 Gravida Road','Samuel','+639191636415'),(672754981,'IGL57',162,'Quisque.porttitor@loremfringilla.edu','Interdum Curabitur Dictum Foundation','6239 Primis Rd.','Maia','+639172485739'),(677661401,'FQV71',158,'in@quisaccumsanconvallis.ca','Vulputate Dui Nec Corporation','554-824 Non, Avenue','Upton','+639136766196'),(682364294,'FBD91',131,'sed.pede.nec@Pellentesque.edu','Ipsum Phasellus Ltd','213-7405 Nunc St.','Harding','+639136251814'),(685076703,'AKA94',142,'nec.metus.facilisis@amet.com','Libero Dui Nec Incorporated','695-5706 Arcu. St.','Kyra','+639133689814'),(692942931,'COF73',128,'condimentum.Donec.at@placerataugue.ca','Tempor Lorem Company','956-2649 Donec St.','Reagan','+639177433327'),(695638303,'CBD51',155,'Aenean.gravida.nunc@consectetuer.org','Quis Diam Luctus Inc.','Ap #735-9345 Dapibus Av.','Casey','+639115577684'),(706608549,'IGL57',122,'a.aliquet.vel@Donecconsectetuermauris.ca','Id Risus Quis Corporation','534-9810 Vestibulum Ave','Jason','+639128619933'),(721552375,'IGL57',154,'nisl@euturpis.org','Porta Foundation','P.O. Box 731, 4530 Enim, Rd.','Karleigh','+639129219571'),(744189334,'IGL57',171,'sagittis.Duis@blanditNamnulla.ca','Integer Id Magna Associates','Ap #922-5050 Massa Road','Xaviera','+639183258293'),(759016933,'AKA94',166,'lectus.Nullam.suscipit@Integerin.net','Facilisis Limited','242-3636 Ligula. St.','Kadeem','+639157611863'),(771293105,'COF73',193,'mauris@nuncnullavulputate.com','Non Enim PC','712-7131 Sem Road','Abigail','+639138344729'),(791873793,'FQV71',161,'imperdiet@iaculisaliquet.org','Placerat Eget Venenatis LLC','Ap #840-3748 Cum Av.','Jakeem','+639171324635'),(794927377,'IGL57',107,'metus.facilisis.lorem@idrisusquis.co.uk','Sit Amet Metus Associates','Ap #512-4184 Lacus. Rd.','Adam','+639174513369'),(797948548,'AKA94',113,'Suspendisse.sagittis@nonquam.com','Ac Sem Incorporated','P.O. Box 437, 1372 Diam Rd.','Samson','+639189164538'),(803684297,'OBH36',153,'montes.nascetur.ridiculus@eusemPellentesque.org','Dis Parturient Montes LLP','Ap #498-5448 Gravida. St.','Donovan','+639135527155'),(805186787,'CBD51',178,'Nam@loremvitaeodio.edu','Nisl Sem LLP','Ap #588-902 Proin St.','Christen','+639178626819'),(814487349,'CBD51',112,'Morbi@fermentumfermentumarcu.edu','Elit Foundation','P.O. Box 769, 8079 Morbi Ave','Devin','+639133665423'),(817601219,'AKA94',159,'ultrices@Morbisit.edu','Velit Aliquam Nisl Institute','P.O. Box 317, 872 Nulla Street','Nomlanga','+639186728218'),(819068949,'BCP48',144,'luctus.lobortis@temporeratneque.co.uk','Eleifend Vitae Ltd','644-3347 Ut Street','Jaime','+639196779838'),(828196501,'CGF62',106,'urna.Vivamus.molestie@enimSed.org','Eu Ultrices Sit Industries','5114 Pharetra St.','Veda','+639144719814'),(835089989,'FBD91',181,'at@lectus.edu','Nam Interdum Consulting','9699 Convallis Rd.','Carolyn','+639161343555'),(855742533,'AKA94',170,'at.risus.Nunc@estac.edu','Velit Company','P.O. Box 696, 907 Eu St.','Amaya','+639145547624'),(876806749,'FQV71',177,'ante@odio.net','Ipsum Dolor Inc.','2867 Netus Street','Steven','+639189718415'),(876844491,'CGF62',124,'elit@habitantmorbitristique.edu','Erat Company','Ap #337-6579 Diam Road','Deirdre','+639162286852'),(880110182,'AKA94',130,'purus.Nullam@Vivamusnibh.co.uk','Ante Blandit Viverra Ltd','P.O. Box 156, 1575 Convallis Road','Cara','+639182828564'),(898410496,'CGF62',179,'quis.accumsan.convallis@pharetrafeliseget.com','Enim Inc.','366-5196 Ut Road','Hammett','+639115335645'),(899620558,'FQV71',175,'Sed@Nuncmaurissapien.ca','Quis Institute','P.O. Box 446, 5770 Adipiscing Road','Leroy','+639154592888'),(905251388,'FBD91',134,'quis.turpis.vitae@maurisrhoncusid.edu','Vulputate Industries','5338 Massa Road','Ebony','+639184138885'),(941423659,'IGL57',196,'erat.eget@eumetusIn.edu','Fermentum Consulting','Ap #174-3419 Nulla St.','Tara','+639164898231'),(950699970,'OBH36',157,'non@arcu.org','Pharetra Nibh Aliquam Incorporated','3067 Nibh. Rd.','Nina','+639184656941'),(960169851,'BCP48',103,'elementum.at@dui.org','Nisi Corporation','P.O. Box 585, 7864 Sem Avenue','Vera','+639196599123'),(961398957,'OBH36',109,'dolor.nonummy@egetmollis.edu','Sit Amet Foundation','P.O. Box 778, 5466 Eget Ave','May','+639167961791'),(966259555,'IGL57',120,'erat@elementumloremut.org','Adipiscing Elit Aliquam Inc.','2111 Metus Avenue','Dorothy','+639115497119'),(971833573,'OBH36',133,'faucibus.lectus@NullamnislMaecenas.com','Eu Dolor Egestas Industries','Ap #887-574 Cursus Ave','Chiquita','+639151984557'),(977894086,'CGF62',180,'Cras.vulputate.velit@velitduisemper.co.uk','Erat LLP','3543 Fames Av.','MacKenzie','+639126472823'),(977982820,'CBD51',197,'risus@velpede.net','Dapibus Ligula Ltd','426-7656 Enim Street','Tamekah','+639184789923'),(989114796,'CBD51',182,'Donec.fringilla.Donec@egetmollis.edu','Suspendisse LLP','Ap #861-1604 Sagittis Rd.','Germaine','+639189289411');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `employeeId` char(5) NOT NULL,
  `userId` int(11) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `job_position` varchar(45) NOT NULL,
  `contact_num` varchar(15) NOT NULL,
  PRIMARY KEY (`employeeId`),
  KEY `fk_employee_user1_idx` (`userId`),
  CONSTRAINT `fk_employee_user1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('AKA94',37,'sed.dictum@aliquamenimnec.net','Jemima','George','Sales Agent','+639143671322'),('AOO43',83,'porttitor@Proin.org','Deanna','Galloway','Inventory Clerk','+639151215582'),('AVH41',59,'sit.amet.orci@erosProinultrices.co.uk','Ivy','Browning','Plant Manager','+639119782345'),('BCP48',9,'nisi.sem.semper@inaliquetlobortis.com','Harper','Alvarez','Sales Agent','+639196382473'),('CBD51',18,'turpis@mauriseu.net','Claudia','Stewart','Sales Agent','+639158564848'),('CCG46',72,'tellus.imperdiet@magnisdis.net','Shellie','Todd','Plant Manager','+639163281353'),('CGF62',24,'vehicula@Donec.ca','Naida','Hurst','Sales Agent','+639166655214'),('COF73',16,'dui.Fusce@pedenecante.net','Simon','Gay','Sales Agent','+639172868936'),('CQP82',15,'eget.ipsum@tinciduntDonecvitae.ca','Asher','Cherry','Sales Manager','+639148852467'),('CYG21',54,'magna.Suspendisse.tristique@consequatlectussit.edu','Jack','Dean','Sales Manager','+639142754731'),('DFT35',34,'quis.diam@aliquam.edu','Zephr','Valenzuela','Accountant','+639118156233'),('DJY68',17,'interdum.libero@adipiscing.co.uk','Samuel','Swanson','Inventory Clerk','+639172165533'),('EDI31',25,'orci.Ut@convallis.ca','Britanney','Pittman','Accountant','+639175596951'),('EKI16',53,'Phasellus.ornare@Integereulacus.org','Stacy','Raymond','Accountant','+639183253755'),('ERD15',88,'consectetuer.rhoncus@enim.ca','Stephen','Weber','Inventory Clerk','+639185989121'),('ERF58',19,'vestibulum.massa.rutrum@sedsapien.com','Felicia','Hardin','Sales Coordinator','+639197379477'),('EWG78',96,'ultricies@nequeetnunc.ca','Cole','Frazier','Sales Coordinator','+639145245358'),('EXJ28',29,'eu@erat.com','Kristen','Hamilton','Sales Manager','+639193417923'),('EZF71',21,'mi@dolor.com','Hunter','Benjamin','Inventory Clerk','+639142139854'),('FBD91',26,'ultrices.iaculis@adipiscingenim.co.uk','Amber','Hutchinson','Sales Agent','+639175261943'),('FJP73',80,'congue.turpis.In@Suspendissenonleo.edu','Haviva','Ortiz','Inventory Clerk','+639134385439'),('FQV71',82,'malesuada.augue@consectetuer.edu','Ina','Moon','Sales Agent','+639156538184'),('FYE83',57,'dui@euplacerat.net','Martena','Morales','Sales Manager','+639116416327'),('GRV58',90,'parturient.montes@ametmassaQuisque.net','Elvis','Terrell','Plant Manager','+639158989625'),('GTZ21',66,'lobortis.quis@dui.org','Jaquelyn','Lamb','Sales Manager','+639111714269'),('HBC61',6,'justo.sit@Cumsociisnatoque.edu','Kiayada','Sargent','Sales Manager','+639136728766'),('HHY86',84,'euismod@egetipsum.ca','Gretchen','Gaines','Plant Manager','+639116887755'),('HZM48',75,'dictum.cursus.Nunc@gravida.edu','Chastity','Bentley','Inventory Clerk','+639149335145'),('IAI73',81,'id.nunc.interdum@enimCurabiturmassa.org','August','Hall','Sales Coordinator','+639155729736'),('IEQ83',5,'egestas.Aliquam.fringilla@Suspendisse.ca','Bruce','Craig','Inventory Clerk','+639181346126'),('IGL57',28,'pede.malesuada@arcu.ca','Ruby','Peters','Sales Agent','+639167873396'),('IOY66',20,'sodales.at@bibendumsed.org','Leslie','Good','Inventory Clerk','+639157268539'),('JJQ49',58,'elit.Aliquam@enimgravida.com','Ethan','Figueroa','Sales Manager','+639178887753'),('JVH31',47,'nec.leo@ipsumsodales.co.uk','Malik','Chen','Inventory Clerk','+639114998248'),('KHL86',45,'molestie@velvenenatisvel.org','Ramona','Chapman','Sales Manager','+639176265814'),('KJL84',89,'Etiam@loremvehicula.com','Xenos','Sharp','Inventory Clerk','+639119867656'),('KJP84',30,'tincidunt.neque.vitae@sit.ca','Destiny','Pearson','Plant Manager','+639193571297'),('KWW96',35,'convallis.in@miac.edu','Ingrid','Martin','Inventory Clerk','+639173827717'),('KYL92',94,'nec.cursus.a@Nuncsollicitudincommodo.com','Wyatt','Cash','Accountant','+639144827149'),('LIA19',49,'lorem.auctor.quis@nisiMauris.edu','Nora','Sandoval','Inventory Clerk','+639197859212'),('LKQ83',41,'vitae.orci@Nullamenim.co.uk','Ingrid','Wagner','Plant Manager','+639129862237'),('LOA55',43,'dictum@Curabitur.org','Ronan','Robbins','Inventory Clerk','+639131345166'),('LXI49',8,'egestas@Vivamusmolestiedapibus.net','Isadora','Velasquez','Accountant','+639142528419'),('MDM88',62,'Curabitur.ut.odio@Fusce.edu','Christine','Trevino','Sales Coordinator','+639172496445'),('NBF41',74,'tortor.nibh.sit@cubiliaCuraeDonec.edu','Christopher','Garrett','Sales Manager','+639178633186'),('NVR27',40,'Proin.ultrices@necdiam.ca','Phillip','Ortega','Sales Coordinator','+639191452248'),('OBH36',11,'Donec.est.Nunc@nisinibhlacinia.org','Kay','Sherman','Sales Agent','+639189394676'),('OUA25',36,'nunc@fermentumfermentum.com','Calista','Rocha','Sales Manager','+639184794453'),('OXS65',14,'Quisque@Nullatincidunt.edu','Merrill','Bates','Plant Manager','+639152182272'),('PAP52',42,'scelerisque.lorem@Suspendissecommodo.edu','Brennan','Rhodes','Plant Manager','+639181244798'),('PVA38',73,'orci@rutrumjusto.com','Venus','Richard','Accountant','+639179346535'),('QNY81',10,'lectus@vulputaterisusa.net','Driscoll','Simmons','Plant Manager','+639134468155'),('QPH73',2,'Nunc.sollicitudin@rhoncusDonecest.edu','Dante','Foreman','Plant Manager','+639111435243'),('QPX63',56,'tellus@ipsumdolor.net','August','Finch','Plant Manager','+639116847276'),('QQK54',1,'hendrerit@mauriserat.org','Emily','Noble','Sales Manager','+639134254457'),('QYB16',100,'ipsum.dolor.sit@arcu.net','Josephine','Fernandez','Plant Manager','+639174346719'),('RPU44',23,'magna.Ut.tincidunt@a.net','Olympia','Ramos','Sales Agent','+639179114715'),('RTH68',61,'magna@Nam.co.uk','Brody','Bass','Sales Manager','+639171283752'),('RUF73',32,'tincidunt@tinciduntdui.com','Kasimir','Walker','Inventory Clerk','+639131911346'),('RVO85',7,'sit.amet.risus@Proin.org','Gregory','Hays','Sales Agent','+639176443424'),('SBU61',79,'nec@elit.co.uk','Sonya','Calhoun','Inventory Clerk','+639158861563'),('SEW15',77,'tortor@non.org','Ezra','Walls','Sales Manager','+639198766284'),('SNK82',31,'netus@tempusnon.co.uk','Noble','Rivera','Accountant','+639132128938'),('SRI31',33,'mi.eleifend@Duisdignissimtempor.co.uk','Sharon','Sargent','Inventory Clerk','+639188419995'),('SZX45',98,'auctor.velit@inceptoshymenaeosMauris.ca','Jenette','Keller','Sales Manager','+639121651998'),('TFS89',65,'feugiat@tellusidnunc.edu','Fatima','Parsons','Plant Manager','+639166297148'),('TIS97',85,'semper.Nam@lectusquis.ca','Magee','Koch','Sales Manager','+639189275686'),('TJN65',76,'faucibus.Morbi.vehicula@eu.com','Karleigh','Moses','Accountant','+639165872246'),('TMY66',60,'lobortis.augue@Maurisvelturpis.org','Jerome','Peterson','Sales Coordinator','+639158715176'),('TQE13',12,'libero.Donec@at.com','Aline','Mccoy','Sales Manager','+639142743194'),('TWN63',70,'accumsan.sed.facilisis@metusAeneansed.com','Amena','Christensen','Sales Agent','+639122486884'),('UBD44',97,'dapibus@nisimagna.ca','Idona','Hartman','Sales Coordinator','+639192744854'),('UCT32',4,'sodales@enim.ca','Octavia','Potts','Sales Agent','+639157767751'),('UHF66',38,'est.ac.mattis@nec.org','Ray','Juarez','Inventory Clerk','+639157675713'),('UJG14',3,'Fusce.mollis@Inatpede.ca','April','Saunders','Sales Agent','+639159282919'),('UTI66',67,'ipsum.sodales@inmolestie.ca','Ella','Mayo','Sales Agent','+639186879388'),('UWO93',78,'scelerisque@dictum.co.uk','Beatrice','Burt','Sales Manager','+639178599772'),('UXZ27',27,'mauris.ipsum@velpedeblandit.org','Cody','Larson','Inventory Clerk','+639165893823'),('VFQ14',44,'Aliquam.ornare@cursusa.net','Lucy','Branch','Sales Coordinator','+639181964839'),('VIS79',93,'Maecenas.mi@consectetuer.co.uk','Gloria','Frye','Sales Manager','+639199657551'),('VKW57',68,'consectetuer@nibhQuisquenonummy.edu','Cameron','Serrano','Sales Agent','+639179325598'),('VMB83',71,'pede@loremauctorquis.ca','Willow','Oliver','Accountant','+639179432963'),('VOS26',99,'mollis.dui.in@Quisqueporttitor.net','Bradley','Marks','Sales Coordinator','+639115421134'),('VQS43',86,'ante.Maecenas.mi@Nunclaoreet.org','Wang','Harding','Plant Manager','+639116395599'),('WAW16',39,'sed.pede.nec@non.net','Sade','David','Sales Manager','+639125116894'),('WHG11',52,'hendrerit.neque.In@quispede.co.uk','Bianca','Padilla','Sales Agent','+639138899729'),('WOK35',13,'luctus.Curabitur.egestas@eliterat.com','Tatum','Miranda','Accountant','+639112626127'),('WWI43',55,'ac.fermentum@pharetraNamac.edu','Jin','Reilly','Accountant','+639181587353'),('XBO86',95,'arcu@nunc.com','Tobias','Castro','Accountant','+639166528489'),('XEU91',69,'lacinia@odio.co.uk','Aline','Larson','Sales Agent','+639157111539'),('XLT25',92,'consequat.dolor.vitae@magnaDuisdignissim.net','Kyla','Evans','Inventory Clerk','+639159398192'),('XUW71',22,'et@infaucibusorci.co.uk','Serena','Poole','Accountant','+639175291885'),('YBQ25',50,'non.enim.commodo@nonsollicitudin.co.uk','Kennedy','Guerrero','Sales Coordinator','+639199529427'),('YKN56',63,'erat.neque.non@metusAliquam.net','David','Tate','Accountant','+639166957578'),('YNG68',48,'commodo@iaculis.org','Nerea','Hodges','Sales Coordinator','+639191647696'),('YWN26',51,'at.egestas.a@erat.org','Beatrice','Norton','Sales Coordinator','+639136364948'),('YXU48',46,'habitant@nulla.co.uk','Dana','Torres','Accountant','+639188394366'),('ZJR35',64,'neque.Nullam@ipsumDonec.org','Leigh','Church','Sales Agent','+639183168768'),('ZNI58',91,'vel.quam@malesuadautsem.org','Travis','Olsen','Sales Manager','+639197822388'),('ZPD11',87,'Integer.vulputate.risus@aliquetodio.com','Donna','Obrien','Plant Manager','+639154721461');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group`
--

DROP TABLE IF EXISTS `group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group` (
  `groupId` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(45) DEFAULT NULL,
  `flag` binary(1) DEFAULT '1',
  PRIMARY KEY (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group`
--

LOCK TABLES `group` WRITE;
/*!40000 ALTER TABLE `group` DISABLE KEYS */;
/*!40000 ALTER TABLE `group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderstatus`
--

DROP TABLE IF EXISTS `orderstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orderstatus` (
  `statusCode` char(1) NOT NULL,
  `statusDesc` varchar(45) NOT NULL,
  PRIMARY KEY (`statusCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderstatus`
--

LOCK TABLES `orderstatus` WRITE;
/*!40000 ALTER TABLE `orderstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `orderstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `productCode` char(10) NOT NULL,
  `productName` varchar(100) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `MSRP` float DEFAULT NULL,
  PRIMARY KEY (`productCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('AL10795944','GLYCERIN',77,70.49),('AN58515935','OCTINOXATE',59,91.82),('CC77504664','Esomeprazole strontium',38,65.52),('CF06497587','NITROGEN',91,19.98),('CO29214816','morphine sulfate',16,13.22),('CY19433675','CEFTRIAXONE',33,67.29),('EZ75090862','Metaxalone',76,72.47),('FQ47552017','Norepinephrine',80,65.34),('GO51290452','Docetaxel',2,74.91),('GS47220757','levetiracetam',93,55.19),('HA56306389','Mineral oil, petrolatum, phenylephrine hcl',53,36.12),('HB46449310','Hand Sanitizer Wipes',86,94.63),('HF16624321','Petrolatum',88,12.08),('HP13873178','Oxygen',87,10.42),('IT49465825','Ergotamine Tartrate and Caffeine',65,45.56),('JU49751425','SERTRALINE HYDROCHLORIDE',73,18.49),('JX91927617','Diazepam',66,37.29),('KA89809641','FERROSOFERRIC PHOSPHATE',45,0.55),('KS89830292','CARBAMAZEPINE',16,33.05),('KW19735990','Mineral Oil',65,49.11),('KX76513031','CHAMOMILLA',97,63.29),('KZ87426520','Primidone',92,56.99),('LX41853342','lamotrigine',16,68.58),('MI69508074','Quetiapine fumarate',90,86.75),('NR67285972','fenofibrate',56,81.3),('PO41449633','not applicable',75,26.61),('QC24408415','DEXTROSE, SODIUM CHLORIDE, and POTASSIUM CHLORIDE',81,30.72),('RD48389518','risperidone',47,0.42),('RY06467629','Bupropion Hydrochloride',77,34.03),('RY53776183','Johnson Grass Smut',90,88.25),('SD05839355','EDETATE CALCIUM DISODIUM',97,4.04),('SN10523281','Arnica Nettle Burn and Bite',6,82.91),('UA00337793','clorazepate dipotassium',26,98.97),('UR86040921','Tuna',46,24.22),('UV32258208','Undecylenic Acid',45,85.71),('VE74214772','Loperamide HCl',73,72.79),('VO73505007','Trazodone Hydrochloride',17,99.61),('VP16186549','Pseudoephedrine HCl',58,6.31),('WK81405017','Enalapril maleate and hydrochlorothiazide',37,19.11),('WQ35959415','Octinoxate and Titanium Dioxide',17,22.97),('WT44400545','Felodipine',45,79.44),('XH85823141','METHYLPHENIDATE HYDROCHLORIDE',88,95.86),('XL44260074','Furosemide',72,48.26),('XP23070722','Selenium Sulfide',81,80.45),('XX74856166','Ciclopirox',79,15.76),('YM14883537','aspirin',21,29.94),('YU00432822','Renagel',91,24.53),('ZO33150550','Wheat Pollen',80,41.91);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_has_purchaseorder`
--

DROP TABLE IF EXISTS `product_has_purchaseorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_has_purchaseorder` (
  `productCode` char(10) NOT NULL,
  `purchaseOrderId` int(11) NOT NULL,
  `orderQuantity` int(11) DEFAULT NULL,
  `markup` float DEFAULT NULL,
  PRIMARY KEY (`productCode`,`purchaseOrderId`),
  KEY `fk_product_has_purchaseOrder_purchaseOrder1_idx` (`purchaseOrderId`),
  KEY `fk_product_has_purchaseOrder_product1_idx` (`productCode`),
  CONSTRAINT `fk_product_has_purchaseOrder_product1` FOREIGN KEY (`productCode`) REFERENCES `product` (`productCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_has_purchaseOrder_purchaseOrder1` FOREIGN KEY (`purchaseOrderId`) REFERENCES `purchaseorder` (`purchaseOrderId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_has_purchaseorder`
--

LOCK TABLES `product_has_purchaseorder` WRITE;
/*!40000 ALTER TABLE `product_has_purchaseorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_has_purchaseorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_has_supplier`
--

DROP TABLE IF EXISTS `product_has_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_has_supplier` (
  `productCode` char(10) NOT NULL,
  `supplierTin` decimal(9,0) NOT NULL,
  PRIMARY KEY (`productCode`,`supplierTin`),
  KEY `fk_product_has_supplier_product1_idx` (`productCode`),
  KEY `fk_product_has_supplier_supplier1_idx` (`supplierTin`),
  CONSTRAINT `fk_product_has_supplier_product1` FOREIGN KEY (`productCode`) REFERENCES `product` (`productCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_has_supplier_supplier1` FOREIGN KEY (`supplierTin`) REFERENCES `supplier` (`supplierTin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_has_supplier`
--

LOCK TABLES `product_has_supplier` WRITE;
/*!40000 ALTER TABLE `product_has_supplier` DISABLE KEYS */;
INSERT INTO `product_has_supplier` VALUES ('XP23070722',19292722),('XP23070722',68668633),('XP23070722',72472590);
/*!40000 ALTER TABLE `product_has_supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchaseorder`
--

DROP TABLE IF EXISTS `purchaseorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchaseorder` (
  `purchaseOrderId` int(11) NOT NULL AUTO_INCREMENT,
  `orderStatus` char(1) NOT NULL DEFAULT 'P',
  `employeeId` char(5) NOT NULL,
  `dateIssued` date NOT NULL,
  `orderDate` date NOT NULL,
  `dateDelivered` date DEFAULT NULL,
  PRIMARY KEY (`purchaseOrderId`),
  KEY `fk_purchaseOrder_employee1_idx` (`employeeId`),
  KEY `fk_purchaseOrder_POStatus1_idx` (`orderStatus`),
  CONSTRAINT `fk_purchaseOrder_POStatus1` FOREIGN KEY (`orderStatus`) REFERENCES `orderstatus` (`statusCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_purchaseOrder_employee1` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`employeeId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchaseorder`
--

LOCK TABLES `purchaseorder` WRITE;
/*!40000 ALTER TABLE `purchaseorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchaseorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL AUTO_INCREMENT,
  `groupId` int(11) NOT NULL,
  `role_name` varchar(45) DEFAULT NULL,
  `flag` varchar(45) DEFAULT '1',
  PRIMARY KEY (`roleId`,`groupId`),
  KEY `fk_role_group1_idx` (`groupId`),
  CONSTRAINT `fk_role_group1` FOREIGN KEY (`groupId`) REFERENCES `group` (`groupId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesorder`
--

DROP TABLE IF EXISTS `salesorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesorder` (
  `SalesOrderId` int(11) NOT NULL AUTO_INCREMENT,
  `customerTin` decimal(9,0) NOT NULL,
  `statusCode` char(1) NOT NULL DEFAULT 'P',
  `deliverTo` varchar(45) NOT NULL,
  `dateIssued` date NOT NULL,
  `orderDate` date NOT NULL,
  `dateDelivered` date DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SalesOrderId`),
  KEY `fk_SalesOrder_customer1_idx` (`customerTin`),
  KEY `fk_SalesOrder_orderStatus1_idx` (`statusCode`),
  CONSTRAINT `fk_SalesOrder_customer1` FOREIGN KEY (`customerTin`) REFERENCES `customer` (`customerTin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SalesOrder_orderStatus1` FOREIGN KEY (`statusCode`) REFERENCES `orderstatus` (`statusCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesorder`
--

LOCK TABLES `salesorder` WRITE;
/*!40000 ALTER TABLE `salesorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `salesorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesorder_has_product`
--

DROP TABLE IF EXISTS `salesorder_has_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesorder_has_product` (
  `SalesOrderId` int(11) NOT NULL,
  `productCode` char(10) NOT NULL,
  `orderQuantity` int(11) DEFAULT NULL,
  `markup` float DEFAULT NULL,
  PRIMARY KEY (`SalesOrderId`,`productCode`),
  KEY `fk_SalesOrder_has_product_product1_idx` (`productCode`),
  KEY `fk_SalesOrder_has_product_SalesOrder1_idx` (`SalesOrderId`),
  CONSTRAINT `fk_SalesOrder_has_product_SalesOrder1` FOREIGN KEY (`SalesOrderId`) REFERENCES `salesorder` (`SalesOrderId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_SalesOrder_has_product_product1` FOREIGN KEY (`productCode`) REFERENCES `product` (`productCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesorder_has_product`
--

LOCK TABLES `salesorder_has_product` WRITE;
/*!40000 ALTER TABLE `salesorder_has_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `salesorder_has_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `supplierTin` decimal(9,0) NOT NULL,
  `priorityCode` decimal(1,0) NOT NULL DEFAULT '1',
  `supplierName` varchar(45) NOT NULL,
  `contact_num` varchar(45) NOT NULL,
  `supplierIndication` int(1) DEFAULT NULL,
  PRIMARY KEY (`supplierTin`,`priorityCode`),
  KEY `fk_supplier_supplierPriority1_idx` (`priorityCode`),
  CONSTRAINT `fk_supplier_supplierPriority1` FOREIGN KEY (`priorityCode`) REFERENCES `supplierpriority` (`priorityCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (19292722,3,'Nonummy Ipsum Non LLC','+63916543733955',1),(68668633,1,'Et Malesuada Incorporated','+63914781549975',0),(72055692,3,'Euismod Et Corp.','+63911345613521',0),(72472590,2,'Amet Ornare Lectus Institute','+63919349484793',0),(81654969,1,'Cursus Et Foundation','+63912743239934',0),(102603306,1,'Nulla Cras Corp.','+63918612954421',1),(108597262,2,'Molestie Tellus Institute','+63915652349678',1),(114426414,2,'Mus Proin Consulting','+63912198165355',0),(120168601,1,'Rutrum Urna Nec Consulting','+63911492916714',0),(140678966,1,'Integer LLC','+63916966656471',1),(143495479,1,'Metus In Consulting','+63911294941717',0),(161424936,3,'Ac Sem Ltd','+63911459169267',0),(164699031,3,'Arcu Nunc Consulting','+63916813348721',0),(171821094,1,'Neque Non Company','+63914141344359',0),(185440679,3,'Pede LLC','+63911332218222',1),(192041365,3,'Sed Congue LLP','+63916468255816',0),(195714793,3,'Arcu Consulting','+63918174645881',0),(206345453,2,'Aliquet Vel LLC','+63919599729569',0),(220691978,2,'Malesuada Incorporated','+63914959374739',1),(222051859,2,'Tortor Dictum Eu Institute','+63919313833361',1),(224685986,2,'Elit Nulla PC','+63917318128933',0),(236505212,3,'Semper LLP','+63913552995968',1),(242760761,1,'Porttitor Tellus Non Inc.','+63911157759753',0),(248077751,2,'Sit Company','+63917537494857',0),(266901400,1,'Vestibulum Accumsan Corp.','+63919457663256',1),(278762418,3,'Et Commodo Consulting','+63917679149597',1),(300877548,1,'Tempus Inc.','+63916494113575',1),(315153602,2,'Cum Sociis Industries','+63913122683841',1),(316982474,1,'Nam Porttitor Scelerisque Foundation','+63918324384287',0),(319504593,1,'Massa Mauris Vestibulum Limited','+63916314593723',0),(335065143,1,'Venenatis Vel Faucibus LLP','+63918796766855',0),(347863645,1,'Ornare Libero At Institute','+63915266623489',0),(358426335,1,'Euismod LLC','+63914213848478',1),(374832608,1,'Metus Sit Amet Corp.','+63913397645583',0),(395037900,1,'Metus Ltd','+63912422192965',1),(398187805,1,'Aenean Egestas Hendrerit Ltd','+63917384832494',0),(401833101,2,'Vestibulum Company','+63917493595233',0),(407939618,3,'Ante Ipsum PC','+63914317916936',0),(417820704,2,'Elit Pretium Et Corporation','+63919815955128',0),(434431591,1,'Consequat Inc.','+63911145395492',1),(445307282,3,'Dictum Limited','+63914382616252',1),(448199555,3,'Eu Ligula Inc.','+63914973284786',1),(448333976,1,'Ac Facilisis LLP','+63911588372826',1),(452015018,1,'Sem Corp.','+63917813126235',1),(461052915,3,'Libero Ltd','+63916829598292',1),(461110382,3,'Diam Company','+63917682457425',1),(463535719,2,'Velit Dui Inc.','+63912794498429',0),(469317039,1,'Tincidunt Ltd','+63917254748724',0),(482208156,3,'Dui Augue LLC','+63919371972666',1),(494483994,2,'Volutpat Inc.','+63914786757174',1),(496521437,2,'Accumsan Interdum Libero Limited','+63913488251565',0),(502838302,3,'Eros Nec Tellus PC','+63918964773794',0),(508472135,2,'Ac Nulla In PC','+63916672911687',0),(510627514,1,'Sed Malesuada LLC','+63918183224359',0),(519207470,1,'Ut Limited','+63913153888554',0),(519467633,2,'Orci Institute','+63912468398348',1),(541573373,1,'Malesuada Augue Consulting','+63919659682996',1),(544147548,1,'Et Nunc Quisque Incorporated','+63917915476698',1),(576418307,1,'Purus Sapien Gravida Limited','+63916634662939',1),(578216803,3,'Eget Volutpat Institute','+63914797781851',0),(579979036,3,'Neque Morbi Quis Institute','+63914567878376',1),(581719900,1,'Faucibus Id Incorporated','+63914645325741',1),(599317606,1,'A Feugiat Limited','+63919356886328',0),(605965002,3,'Et Nunc Quisque Foundation','+63917917214167',0),(608525489,1,'Fusce Feugiat Incorporated','+63919853465716',1),(610398931,1,'Mus Company','+63915229496449',0),(619835039,3,'Mattis Integer Consulting','+63914852559991',1),(623708032,2,'A Ultricies Limited','+63918266681674',0),(626502118,2,'Primis In Inc.','+63912782339978',1),(635239391,1,'Magna Sed Foundation','+63911341895129',1),(650024141,1,'Accumsan Interdum Incorporated','+63915442999256',1),(653541510,2,'Justo Eu Arcu Consulting','+63919935755435',0),(654615392,1,'Euismod Est Arcu Ltd','+63918393261697',0),(678014501,2,'Eleifend Corporation','+63919116221699',0),(694723824,1,'Pharetra Nam Associates','+63919516252962',1),(702841784,3,'Nisl Elementum Foundation','+63911323474179',0),(713084726,1,'Arcu Vestibulum Limited','+63914786499351',0),(727332124,1,'Vel Sapien Imperdiet PC','+63917746112313',0),(729717901,1,'Fringilla Purus Mauris Foundation','+63913946489545',1),(741182327,3,'Velit Associates','+63919842547533',0),(743062227,1,'Malesuada Vel Incorporated','+63911478963552',0),(744715418,3,'Nunc Est Mollis LLP','+63916782893225',1),(745970423,1,'Est Corporation','+63912255255999',0),(749729819,1,'Sapien Nunc Pulvinar PC','+63914261322429',1),(771467524,3,'Molestie Tortor Nibh Company','+63918598721456',0),(822164786,3,'Ac Mattis Velit Corporation','+63911666765736',1),(848853340,1,'Sagittis Placerat Limited','+63919385187653',1),(865878135,1,'Enim Suspendisse Limited','+63916759378545',0),(872952166,3,'Praesent Interdum Ligula LLC','+63918636176851',1),(873405779,3,'Luctus Ltd','+63917347658923',1),(888500080,1,'Quisque Nonummy Institute','+63917396462729',1),(891140447,1,'Vulputate Nisi Inc.','+63918231325651',0),(891241596,2,'Ut Associates','+63914179811781',0),(891985304,3,'Malesuada LLC','+63916242597475',1),(907358494,1,'Eu Tellus Incorporated','+63914617169394',1),(914881583,2,'Nunc Foundation','+63913419831844',0),(946654313,1,'Donec Tincidunt Donec LLC','+63913635833924',0),(960006401,1,'Curabitur Vel Corporation','+63912592777213',1),(962486164,3,'Ullamcorper Viverra Maecenas Industries','+63916118642789',0),(977412866,2,'Et Corporation','+63913148748565',1);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplierpriority`
--

DROP TABLE IF EXISTS `supplierpriority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplierpriority` (
  `priorityCode` decimal(1,0) NOT NULL,
  `priorityDescription` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`priorityCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplierpriority`
--

LOCK TABLES `supplierpriority` WRITE;
/*!40000 ALTER TABLE `supplierpriority` DISABLE KEYS */;
INSERT INTO `supplierpriority` VALUES (1,'First Priority'),(2,'Second Priority'),(3,'Last Priority');
/*!40000 ALTER TABLE `supplierpriority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `flag` binary(1) NOT NULL DEFAULT '1',
  `accountType` char(8) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=201 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'jmills0','cadams0','1','employee'),(2,'levans1','mwatson1','1','employee'),(3,'jedwards2','khall2','1','employee'),(4,'astanley3','wbrown3','1','employee'),(5,'msnyder4','kblack4','1','employee'),(6,'drice5','bward5','1','employee'),(7,'kmorris6','jhenderson6','1','employee'),(8,'dfowler7','jmartinez7','1','employee'),(9,'aalexander8','nlarson8','1','employee'),(10,'bking9','shughes9','1','employee'),(11,'rmcdonalda','sallena','1','employee'),(12,'cwarrenb','jreyesb','1','employee'),(13,'sjohnstonc','bjohnsonc','1','employee'),(14,'mhenryd','agarzad','1','employee'),(15,'rgutierreze','rfreemane','1','employee'),(16,'hfisherf','dtaylorf','1','employee'),(17,'kpierceg','brossg','1','employee'),(18,'dmillsh','ballenh','1','employee'),(19,'mmendozai','bkellyi','1','employee'),(20,'cfranklinj','bbradleyj','1','employee'),(21,'lnguyenk','kfoxk','1','employee'),(22,'jgilbertl','rbennettl','1','employee'),(23,'trussellm','mfowlerm','1','employee'),(24,'darmstrongn','wdavisn','1','employee'),(25,'mchapmano','bhugheso','1','employee'),(26,'mpricep','jpaynep','1','employee'),(27,'cmcdonaldq','msullivanq','1','employee'),(28,'ablackr','hwoodsr','1','employee'),(29,'agordons','hriveras','1','employee'),(30,'ssmitht','mchavezt','1','employee'),(31,'rjordanu','blarsonu','1','employee'),(32,'tgarciav','bcrawfordv','1','employee'),(33,'tcunninghamw','dhansonw','1','employee'),(34,'rpricex','sbaileyx','1','employee'),(35,'dramosy','djohnsony','1','employee'),(36,'gjohnstonz','ctuckerz','1','employee'),(37,'twheeler10','dknight10','1','employee'),(38,'lsanders11','sporter11','1','employee'),(39,'jbailey12','amiller12','1','employee'),(40,'sdixon13','rking13','1','employee'),(41,'jsimmons14','jrobertson14','1','employee'),(42,'csnyder15','cdavis15','1','employee'),(43,'jolson16','revans16','1','employee'),(44,'sboyd17','mhanson17','1','employee'),(45,'sharvey18','pgeorge18','1','employee'),(46,'abutler19','ccole19','1','employee'),(47,'mnguyen1a','cvasquez1a','1','employee'),(48,'lford1b','cprice1b','1','employee'),(49,'rharris1c','dwoods1c','1','employee'),(50,'aking1d','cburke1d','1','employee'),(51,'kyoung1e','aporter1e','1','employee'),(52,'dalexander1f','lcollins1f','1','employee'),(53,'rhicks1g','hhicks1g','1','employee'),(54,'jbowman1h','crivera1h','1','employee'),(55,'mday1i','vbishop1i','1','employee'),(56,'breid1j','rwatkins1j','1','employee'),(57,'pduncan1k','preyes1k','1','employee'),(58,'bbarnes1l','mharrison1l','1','employee'),(59,'thunt1m','sanderson1m','1','employee'),(60,'nkim1n','lmedina1n','1','employee'),(61,'sramos1o','csnyder1o','1','employee'),(62,'cmason1p','wstanley1p','1','employee'),(63,'khudson1q','rwilliamson1q','1','employee'),(64,'jcoleman1r','pday1r','1','employee'),(65,'ejames1s','mgardner1s','1','employee'),(66,'egardner1t','pcarter1t','1','employee'),(67,'jshaw1u','lpierce1u','1','employee'),(68,'cchavez1v','vlopez1v','1','employee'),(69,'dwallace1w','kwatson1w','1','employee'),(70,'ehicks1x','jreid1x','1','employee'),(71,'lcarroll1y','jkim1y','1','employee'),(72,'rgrant1z','rhughes1z','1','employee'),(73,'jfrazier20','jstevens20','1','employee'),(74,'wcunningham21','jbennett21','1','employee'),(75,'nlopez22','alarson22','1','employee'),(76,'sbrown23','sharvey23','1','employee'),(77,'hromero24','ashaw24','1','employee'),(78,'rhall25','pwebb25','1','employee'),(79,'mcrawford26','lwoods26','1','employee'),(80,'jhowell27','kdiaz27','1','employee'),(81,'wwalker28','sday28','1','employee'),(82,'lriley29','kgibson29','1','employee'),(83,'lchapman2a','maustin2a','1','employee'),(84,'tsanders2b','cmoreno2b','1','employee'),(85,'jmurphy2c','cford2c','1','employee'),(86,'kyoung2d','kbell2d','1','employee'),(87,'jlawrence2e','bstone2e','1','employee'),(88,'jmontgomery2f','dbutler2f','1','employee'),(89,'kaustin2g','relliott2g','1','employee'),(90,'nfisher2h','kbrooks2h','1','employee'),(91,'tgarrett2i','jhicks2i','1','employee'),(92,'djackson2j','ballen2j','1','employee'),(93,'mbailey2k','khayes2k','1','employee'),(94,'lgilbert2l','nallen2l','1','employee'),(95,'jnichols2m','jfoster2m','1','employee'),(96,'jmontgomery2n','afields2n','1','employee'),(97,'mburton2o','kwelch2o','1','employee'),(98,'abarnes2p','bberry2p','1','employee'),(99,'kmorales2q','jbowman2q','1','employee'),(100,'wferguson2r','ssanchez2r','1','employee'),(101,'jgarza0','dsmith0','1','customer'),(102,'sgrant1','kcole1','1','customer'),(103,'kwest2','elane2','1','customer'),(104,'srobertson3','amorris3','1','customer'),(105,'ajordan4','ledwards4','1','customer'),(106,'randerson5','charris5','1','customer'),(107,'jgray6','thunter6','1','customer'),(108,'kchapman7','dhernandez7','1','customer'),(109,'kstephens8','hburton8','1','customer'),(110,'ballen9','jsims9','1','customer'),(111,'phuntera','aromeroa','1','customer'),(112,'agibsonb','rcooperb','1','customer'),(113,'asnyderc','ksanchezc','1','customer'),(114,'aburtond','emyersd','1','customer'),(115,'jstonee','gparkere','1','customer'),(116,'jphillipsf','rpricef','1','customer'),(117,'ryoungg','lcampbellg','1','customer'),(118,'aaustinh','jreyesh','1','customer'),(119,'awilsoni','aspenceri','1','customer'),(120,'hmyersj','smurphyj','1','customer'),(121,'jhughesk','jandersonk','1','customer'),(122,'bperezl','carmstrongl','1','customer'),(123,'chunterm','wlynchm','1','customer'),(124,'bfishern','jmorenon','1','customer'),(125,'bwatsono','ematthewso','1','customer'),(126,'bjonesp','jsnyderp','1','customer'),(127,'mruizq','iwrightq','1','customer'),(128,'skelleyr','stuckerr','1','customer'),(129,'jlewiss','lolivers','1','customer'),(130,'kcrawfordt','hstewartt','1','customer'),(131,'aadamsu','efrazieru','1','customer'),(132,'mcooperv','hnguyenv','1','customer'),(133,'jmccoyw','btorresw','1','customer'),(134,'dcollinsx','tlittlex','1','customer'),(135,'jmorenoy','lcunninghamy','1','customer'),(136,'mmontgomeryz','hwoodz','1','customer'),(137,'rlee10','sstone10','1','customer'),(138,'jwhite11','jsanders11','1','customer'),(139,'bward12','rcarter12','1','customer'),(140,'echapman13','nhansen13','1','customer'),(141,'gevans14','ghall14','1','customer'),(142,'ealvarez15','jcook15','1','customer'),(143,'aarmstrong16','pjohnson16','1','customer'),(144,'dsullivan17','jrogers17','1','customer'),(145,'cwatson18','bturner18','1','customer'),(146,'ewilliamson19','mfreeman19','1','customer'),(147,'lallen1a','gharrison1a','1','customer'),(148,'eelliott1b','wanderson1b','1','customer'),(149,'dstanley1c','ehowell1c','1','customer'),(150,'ssullivan1d','rking1d','1','customer'),(151,'jcollins1e','ppayne1e','1','customer'),(152,'rgardner1f','aperez1f','1','customer'),(153,'ebarnes1g','pjohnson1g','1','customer'),(154,'dschmidt1h','ihamilton1h','1','customer'),(155,'bmcdonald1i','mspencer1i','1','customer'),(156,'lrogers1j','mrodriguez1j','1','customer'),(157,'tnichols1k','mdiaz1k','1','customer'),(158,'jdunn1l','dsimmons1l','1','customer'),(159,'jromero1m','mtorres1m','1','customer'),(160,'adean1n','hhall1n','1','customer'),(161,'dward1o','kcooper1o','1','customer'),(162,'jmason1p','egilbert1p','1','customer'),(163,'sfisher1q','rmorrison1q','1','customer'),(164,'awells1r','wchavez1r','1','customer'),(165,'jthompson1s','eedwards1s','1','customer'),(166,'rjohnson1t','gandrews1t','1','customer'),(167,'rgrant1u','rhunter1u','1','customer'),(168,'ahanson1v','cwilson1v','1','customer'),(169,'darnold1w','erice1w','1','customer'),(170,'drice1x','cbennett1x','1','customer'),(171,'wjohnston1y','mrodriguez1y','1','customer'),(172,'dkennedy1z','jdixon1z','1','customer'),(173,'wboyd20','mmarshall20','1','customer'),(174,'aalvarez21','alopez21','1','customer'),(175,'dbrooks22','jross22','1','customer'),(176,'mlawson23','ldiaz23','1','customer'),(177,'ereynolds24','shayes24','1','customer'),(178,'ahart25','lknight25','1','customer'),(179,'ehernandez26','fsimpson26','1','customer'),(180,'cschmidt27','wwilson27','1','customer'),(181,'kgilbert28','fcastillo28','1','customer'),(182,'cgilbert29','vlee29','1','customer'),(183,'wbanks2a','ssnyder2a','1','customer'),(184,'hwells2b','nevans2b','1','customer'),(185,'nfox2c','twarren2c','1','customer'),(186,'tgarcia2d','cwebb2d','1','customer'),(187,'clittle2e','cthomas2e','1','customer'),(188,'hyoung2f','sperry2f','1','customer'),(189,'ccook2g','mking2g','1','customer'),(190,'tharrison2h','thayes2h','1','customer'),(191,'bgraham2i','lhanson2i','1','customer'),(192,'rgraham2j','lboyd2j','1','customer'),(193,'ntaylor2k','rbell2k','1','customer'),(194,'mclark2l','lmeyer2l','1','customer'),(195,'jduncan2m','gchavez2m','1','customer'),(196,'kkennedy2n','aedwards2n','1','customer'),(197,'ltucker2o','dhudson2o','1','customer'),(198,'tperkins2p','chart2p','1','customer'),(199,'dadams2q','jramos2q','1','customer'),(200,'ttaylor2r','tgardner2r','1','customer');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_has_group`
--

DROP TABLE IF EXISTS `user_has_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_has_group` (
  `userId` int(11) NOT NULL,
  `groupId` int(11) NOT NULL,
  PRIMARY KEY (`userId`,`groupId`),
  KEY `fk_user_has_group_group1_idx` (`groupId`),
  KEY `fk_user_has_group_user_idx` (`userId`),
  CONSTRAINT `fk_user_has_group_group1` FOREIGN KEY (`groupId`) REFERENCES `group` (`groupId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_group_user` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_has_group`
--

LOCK TABLES `user_has_group` WRITE;
/*!40000 ALTER TABLE `user_has_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_has_group` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-04-02 22:32:25
