-- MySQL dump 10.13  Distrib 8.0.38, for macos14 (arm64)
--
-- Host: localhost    Database: dimata_qdep
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pos_category`
--

DROP TABLE IF EXISTS `pos_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pos_category` (
  `CATEGORY_ID` bigint NOT NULL DEFAULT '0',
  `NAME` varchar(50) DEFAULT NULL,
  `CODE` varchar(15) DEFAULT NULL,
  `DESCRIPTION` varchar(100) NOT NULL DEFAULT '',
  `POINT_PRICE` double NOT NULL DEFAULT '0',
  `LOCATION_ID` bigint DEFAULT '0',
  `TYPE_CATEGORY` int DEFAULT '0' COMMENT '0=item, 1=item sales',
  `CAT_PARENT_ID` bigint DEFAULT NULL,
  `STATUS` int DEFAULT '0' COMMENT 'status ditampilkan di outlet atau tidak',
  `CATEGORY` int DEFAULT NULL,
  `KENAIKAN_HARGA(%)` int DEFAULT NULL,
  `KENAIKAN_HARGA` int DEFAULT NULL,
  PRIMARY KEY (`CATEGORY_ID`),
  UNIQUE KEY `XPKCATEGORY` (`CATEGORY_ID`),
  UNIQUE KEY `CODE` (`CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pos_category`
--

LOCK TABLES `pos_category` WRITE;
/*!40000 ALTER TABLE `pos_category` DISABLE KEYS */;
INSERT INTO `pos_category` VALUES (504404882558697417,'Electrical Vechicle','EV','Electrical Vechicle',1.3,0,0,0,0,0,NULL,10),(504404882558742713,'Electronics','EL','All electronics',1.3,0,0,0,0,0,NULL,5);
/*!40000 ALTER TABLE `pos_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-22 10:21:58
