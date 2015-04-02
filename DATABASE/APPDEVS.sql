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
  `actionId` int(11) NOT NULL,
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
INSERT INTO `action` VALUES (1,1,'/Search','1'),(2,1,'/PreLoadInventory','1');
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
  `email` varchar(45) DEFAULT NULL,
  `clientName` varchar(45) NOT NULL,
  `companyAddress` varchar(45) NOT NULL,
  `contactPerson` varchar(45) NOT NULL,
  `contactNum` varchar(45) NOT NULL,
  PRIMARY KEY (`customerTin`),
  KEY `fk_customer_employee1_idx` (`employeeId`),
  CONSTRAINT `fk_customer_employee1` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`employeeId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
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
  `email` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `middle_name` varchar(45) NOT NULL,
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
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group`
--

DROP TABLE IF EXISTS `group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group` (
  `groupId` int(11) NOT NULL,
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
-- Table structure for table `memberof`
--

DROP TABLE IF EXISTS `memberof`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `memberof` (
  `groupId` int(11) NOT NULL,
  `group_name` varchar(45) DEFAULT NULL,
  `flag` binary(1) DEFAULT '1',
  PRIMARY KEY (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memberof`
--

LOCK TABLES `memberof` WRITE;
/*!40000 ALTER TABLE `memberof` DISABLE KEYS */;
INSERT INTO `memberof` VALUES (1,NULL,'1');
/*!40000 ALTER TABLE `memberof` ENABLE KEYS */;
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
  `productName` varchar(45) NOT NULL,
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
  `priorityCode` decimal(1,0) NOT NULL,
  PRIMARY KEY (`productCode`,`supplierTin`,`priorityCode`),
  KEY `fk_product_has_supplier_supplier1_idx` (`supplierTin`,`priorityCode`),
  KEY `fk_product_has_supplier_product1_idx` (`productCode`),
  CONSTRAINT `fk_product_has_supplier_product1` FOREIGN KEY (`productCode`) REFERENCES `product` (`productCode`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_product_has_supplier_supplier1` FOREIGN KEY (`supplierTin`, `priorityCode`) REFERENCES `supplier` (`supplierTin`, `priorityCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_has_supplier`
--

LOCK TABLES `product_has_supplier` WRITE;
/*!40000 ALTER TABLE `product_has_supplier` DISABLE KEYS */;
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
  `dateDelivered` date NOT NULL,
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
  `roleId` int(11) NOT NULL,
  `groupId` int(11) NOT NULL,
  `role_name` varchar(45) DEFAULT NULL,
  `flag` binary(1) DEFAULT '1',
  PRIMARY KEY (`roleId`,`groupId`),
  KEY `fk_role_group1_idx` (`groupId`),
  CONSTRAINT `fk_role_group1` FOREIGN KEY (`groupId`) REFERENCES `memberof` (`groupId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,1,NULL,'1');
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
  `supplierIndication` binary(1) NOT NULL DEFAULT '1',
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
/*!40000 ALTER TABLE `supplierpriority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `flag` binary(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'miguel','mercado','1'),(3,'miguel','mercado','0');
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
  CONSTRAINT `fk_user_has_group_group1` FOREIGN KEY (`groupId`) REFERENCES `memberof` (`groupId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_group_user` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_has_group`
--

LOCK TABLES `user_has_group` WRITE;
/*!40000 ALTER TABLE `user_has_group` DISABLE KEYS */;
INSERT INTO `user_has_group` VALUES (1,1);
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

-- Dump completed on 2015-04-02 12:53:04
