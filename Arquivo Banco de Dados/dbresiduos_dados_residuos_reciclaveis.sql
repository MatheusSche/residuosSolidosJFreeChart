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
-- Table structure for table `dados_residuos_reciclaveis`
--

DROP TABLE IF EXISTS `dados_residuos_reciclaveis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dados_residuos_reciclaveis` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `municipio` varchar(255) DEFAULT NULL,
  `janeiro` mediumint(9) DEFAULT NULL,
  `fevereiro` mediumint(9) DEFAULT NULL,
  `marco` mediumint(9) DEFAULT NULL,
  `abril` mediumint(9) DEFAULT NULL,
  `maio` mediumint(9) DEFAULT NULL,
  `junho` mediumint(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados_residuos_reciclaveis`
--

LOCK TABLES `dados_residuos_reciclaveis` WRITE;
/*!40000 ALTER TABLE `dados_residuos_reciclaveis` DISABLE KEYS */;
INSERT INTO `dados_residuos_reciclaveis` VALUES (1,'Weston-super-Mare',62,66,55,61,78,87),(2,'Cheltenham',66,77,60,88,92,87),(3,'Castiglione di Garfagnana',52,55,79,77,75,95),(4,'Brodick',62,91,99,62,87,80),(5,'Villers-Poterie',82,78,80,74,68,74),(6,'Créteil',52,57,91,56,91,85),(7,'Glovertown',70,54,69,90,74,50),(8,'Bergen op Zoom',79,85,89,85,84,84),(9,'San Donato di Ninea',82,90,57,59,52,77),(10,'Renaico',86,90,66,53,84,75),(11,'Poulseur',95,87,57,99,84,93),(12,'Genzano di Lucania',63,63,62,72,97,61),(13,'Mayerthorpe',93,91,81,55,98,71),(14,'Sarreguemines',68,89,75,75,63,88),(15,'Fraser Lake',62,71,81,70,77,75),(16,'Colchester',50,71,96,84,81,58),(17,'Meerhout',62,72,100,92,84,91),(18,'Spruce Grove',59,52,51,96,95,95),(19,'Lo Prado',70,57,82,58,87,76),(20,'Wambeek',85,65,92,92,72,81),(21,'Pontevedra',56,55,72,97,93,83),(22,'Canino',86,65,90,58,77,80),(23,'Sanzeno',78,92,88,62,81,68),(24,'MalŽves-Sainte-Marie-Wastines',55,91,77,54,57,63),(25,'Gent',56,83,82,97,96,90),(26,'Malderen',68,85,83,91,50,69),(27,'Vedrin',77,78,69,91,54,82),(28,'Zweibrücken',59,78,54,94,83,52),(29,'Darlington',62,82,88,58,86,50),(30,'Township of Minden Hills',82,79,80,62,89,99),(31,'Alcalá de Henares',86,92,98,77,73,83),(32,'Saint Paul',97,82,57,92,56,53),(33,'Saint-Remy-Geest',91,90,89,81,98,53),(34,'Tarvisio',63,58,87,62,90,86),(35,'Palanzano',87,74,99,59,65,51),(36,'Worcester',73,81,78,94,77,74),(37,'Santa Caterina Villarmosa',84,52,95,64,100,71),(38,'Ambala',78,61,80,70,52,80),(39,'Angers',65,66,57,100,93,54),(40,'Las Condes',50,69,97,62,67,97),(41,'Lagundo/Algund',63,53,93,53,58,98),(42,'Boise',63,80,97,56,74,80),(43,'Emarèse',52,63,58,54,79,97),(44,'Püttlingen',56,61,52,51,58,60),(45,'Erie',69,90,61,70,71,98),(46,'Worcester',59,93,71,61,70,92),(47,'Compiano',56,87,62,95,73,53),(48,'Quellón',63,99,64,55,65,63),(49,'Petacciato',92,98,82,71,53,99),(50,'Arendonk',53,78,73,96,88,67),(51,'Whitehaven',97,100,62,95,83,82),(52,'LaSalle',83,56,50,56,63,80),(53,'Rochester',73,65,64,93,95,66),(54,'FlŽnu',65,84,86,90,82,50),(55,'Merksplas',81,54,100,58,83,57),(56,'Jaunpur',66,75,97,54,98,76),(57,'Otukpo',72,55,97,85,86,59),(58,'Chapadinha',70,100,97,53,57,65),(59,'Waarmaarde',62,89,82,73,79,68),(60,'Dewas',62,59,98,71,94,73);
/*!40000 ALTER TABLE `dados_residuos_reciclaveis` ENABLE KEYS */;
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
