-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: sofipa
-- ------------------------------------------------------
-- Server version	8.0.25
CREATE DATABASE `sofipa`; 


DROP TABLE IF EXISTS `logs_sofipa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logs_sofipa` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `Ip` varchar(50) NOT NULL,
  `Estatus` varchar(29) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs_sofipa`
--

LOCK TABLES `logs_sofipa` WRITE;
/*!40000 ALTER TABLE `logs_sofipa` DISABLE KEYS */;
INSERT INTO `logs_sofipa` VALUES (1,'2025-01-14','01:01:54','0:0:0:0:0:0:0:1','INCORRECTA'),(2,'2025-01-14','01:03:06','0:0:0:0:0:0:0:1','CORRECTA'),(3,'2025-01-14','01:24:12','0:0:0:0:0:0:0:1','INCORRECTA'),(4,'2025-01-14','01:25:55','0:0:0:0:0:0:0:1','CORRECTA');
/*!40000 ALTER TABLE `logs_sofipa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-14  1:31:12
