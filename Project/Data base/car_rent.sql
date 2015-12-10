-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: car_rental
-- ------------------------------------------------------
-- Server version	5.6.22-log

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
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `BOOKING_NUMBER` int(11) NOT NULL AUTO_INCREMENT,
  `ID_CUSTOMER` int(11) DEFAULT NULL,
  `ID_CAR` int(11) DEFAULT NULL,
  `BOOKING_DATE` date DEFAULT NULL,
  `RETURN_DATE` date DEFAULT NULL,
  PRIMARY KEY (`BOOKING_NUMBER`),
  KEY `CUSTOMER_ID_idx` (`ID_CUSTOMER`),
  KEY `CAR_ID_idx` (`ID_CAR`),
  CONSTRAINT `ID_CAR` FOREIGN KEY (`ID_CAR`) REFERENCES `car` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ID_CUSTOMER` FOREIGN KEY (`ID_CUSTOMER`) REFERENCES `customer` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (6,1,16,'2015-01-01','2015-01-01'),(7,1,18,'2015-01-01','2016-01-01'),(8,1,20,'2017-01-01','2018-01-01'),(9,1,18,'2016-01-01','2016-01-01'),(10,1,21,'2015-01-01','2015-01-01'),(11,1,15,'2015-01-01','2015-01-01');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CAR_TYPE_ID` int(11) NOT NULL,
  `COLOR` varchar(45) NOT NULL,
  `BASE_PRICE_PER_DAY` int(11) NOT NULL,
  `DATE_OF_MANUFACTURING` date DEFAULT NULL,
  `link` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `CAR_TYPE_ID_idx` (`CAR_TYPE_ID`),
  CONSTRAINT `CAR_TYPE_ID` FOREIGN KEY (`CAR_TYPE_ID`) REFERENCES `car_type` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (13,13,'brown',1200,NULL,'images\\logoimages/logo/audicon.jpg'),(14,14,'blue',1500,NULL,'images/logo/bmwcon.jpg'),(15,15,'white',500,NULL,'images/logo/hondacivic.jpg'),(16,16,'silver',250,NULL,'images/logo/kiasedan.jpg'),(17,17,'blue',700,NULL,'images\\logo\\skoda.jpg'),(18,18,'white',250,NULL,'images/logo/toyotacorolla.jpg'),(19,19,'black',550,NULL,'images/logo/bmw.jpg'),(20,20,'brown',1700,NULL,'images/logo/fordcon.jpg'),(21,21,'white',700,NULL,'images/logo/jeep.jpg'),(22,22,'brown',500,NULL,'images/logo/mercedes.jpg'),(23,23,'black',200,NULL,'images/logo/toyotacamry.jpg');
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `car_type`
--

DROP TABLE IF EXISTS `car_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `car_type` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) NOT NULL,
  `PRODUCER` varchar(45) NOT NULL,
  `TYPE` varchar(45) NOT NULL,
  `AUTOMATIC` tinyint(2) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car_type`
--

LOCK TABLES `car_type` WRITE;
/*!40000 ALTER TABLE `car_type` DISABLE KEYS */;
INSERT INTO `car_type` VALUES (13,'audi','audi','convertible',1),(14,'bmw','bmw','convertible',1),(15,'civic','honda','sedan',1),(16,'cerato','kia','sedan',1),(17,'skoda','skoda','4x4',1),(18,'corolla','toyota','sedan',1),(19,'bmw','bmw','sedan',1),(20,'ford','ford','convertible',1),(21,'jeep','jeep','4x4',1),(22,'mercedes','mercedes','sedan',1),(23,'camry','toyota','sedan',1);
/*!40000 ALTER TABLE `car_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `LOGIN_NAME` varchar(45) NOT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  `CUSTOMER_TYPE` varchar(45) DEFAULT NULL,
  `FIRST_NAME` varchar(45) NOT NULL,
  `LAST_NAME` varchar(45) DEFAULT NULL,
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `COMPANY_NAME` varchar(45) DEFAULT NULL,
  `GENDER` tinyint(2) DEFAULT NULL,
  `NATIONALITY` varchar(45) DEFAULT NULL,
  `CUSTOMER_ADD` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `CUSTOMER_ADD_idx` (`CUSTOMER_ADD`),
  CONSTRAINT `CUSTOMER_ADD` FOREIGN KEY (`CUSTOMER_ADD`) REFERENCES `customer_address` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'costa','a@a','private','ahmed','mostafa',NULL,'123',NULL,1,'egp',1);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_address`
--

DROP TABLE IF EXISTS `customer_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_address` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `STREET_NAME` varchar(45) NOT NULL,
  `CITY_NAME` varchar(45) NOT NULL,
  `STREET_NUMBER` int(11) NOT NULL,
  `POSTAL_CODE` int(11) DEFAULT NULL,
  `PHONE_NUMBER` int(25) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `CUSTOMER_ID_idx` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_address`
--

LOCK TABLES `customer_address` WRITE;
/*!40000 ALTER TABLE `customer_address` DISABLE KEYS */;
INSERT INTO `customer_address` VALUES (1,'elnour','cairo',20,54321,120120);
/*!40000 ALTER TABLE `customer_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'car_rental'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-10 18:26:52
