-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbresiduos
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `dados_residuos_vidro`
--

DROP TABLE IF EXISTS `dados_residuos_vidro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dados_residuos_vidro` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `municipio` varchar(255) DEFAULT NULL,
  `janeiro` mediumint(9) DEFAULT NULL,
  `fevereiro` mediumint(9) DEFAULT NULL,
  `marco` mediumint(9) DEFAULT NULL,
  `abril` mediumint(9) DEFAULT NULL,
  `maio` mediumint(9) DEFAULT NULL,
  `junho` mediumint(9) DEFAULT NULL,
  `julho` mediumint(9) DEFAULT NULL,
  `agosto` mediumint(9) DEFAULT NULL,
  `setembro` mediumint(9) DEFAULT NULL,
  `outubro` mediumint(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados_residuos_vidro`
--

LOCK TABLES `dados_residuos_vidro` WRITE;
/*!40000 ALTER TABLE `dados_residuos_vidro` DISABLE KEYS */;
INSERT INTO `dados_residuos_vidro` VALUES (1,'Anklam',100,64,89,93,64,61,70,54,57,44),(2,'Montpelier',83,95,25,11,89,15,99,17,84,41),(3,'Valpelline',83,52,69,78,48,83,70,24,41,22),(4,'Lasne-Chapelle-Saint-Lambert',57,92,12,26,24,77,87,24,50,70),(5,'Vancouver',86,76,21,37,30,57,35,32,63,37),(6,'Serskamp',96,66,85,64,88,94,93,52,15,61),(7,'Glabais',62,94,55,23,21,46,18,75,33,13),(8,'Outremont',99,56,86,98,50,18,81,20,79,37),(9,'Essen',99,48,80,42,66,54,98,26,35,69),(10,'Kalyan',60,62,76,99,37,79,85,75,56,46),(11,'San Isidro de El General',78,73,88,10,57,52,48,65,48,97),(12,'Chishtian Mandi',63,62,92,10,46,100,86,85,88,40),(13,'Anklam',100,64,89,93,64,61,70,54,57,44),(14,'Montpelier',83,95,25,11,89,15,99,17,84,41),(15,'Valpelline',83,52,69,78,48,83,70,24,41,22),(16,'Lasne-Chapelle-Saint-Lambert',57,92,12,26,24,77,87,24,50,70),(17,'Vancouver',86,76,21,37,30,57,35,32,63,37),(18,'Serskamp',96,66,85,64,88,94,93,52,15,61),(19,'Glabais',62,94,55,23,21,46,18,75,33,13),(20,'Outremont',99,56,86,98,50,18,81,20,79,37),(21,'Essen',99,48,80,42,66,54,98,26,35,69),(22,'Kalyan',60,62,76,99,37,79,85,75,56,46),(23,'San Isidro de El General',78,73,88,10,57,52,48,65,48,97),(24,'Chishtian Mandi',63,62,92,10,46,100,86,85,88,40);
/*!40000 ALTER TABLE `dados_residuos_vidro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-23 17:54:17
