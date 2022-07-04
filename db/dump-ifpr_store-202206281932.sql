-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: ifpr_store
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8mb4_general_ci NOT NULL,
  `price` double NOT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `imageUri` text COLLATE utf8mb4_general_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Notebook',2000,'Notebook dell com i7, 32GB de RAM, SSD 500GB','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png'),(2,'Mouse',10,'Mouse com botao duplo','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png'),(3,'Teclado',20,'Teclado dell','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png'),(4,'Monitor',300,'Monitor dell','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produtos`
--

DROP TABLE IF EXISTS `produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produtos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(250) COLLATE utf8mb4_general_ci NOT NULL,
  `price` double NOT NULL,
  `description` text COLLATE utf8mb4_general_ci,
  `imageUri` text COLLATE utf8mb4_general_ci,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produtos`
--

LOCK TABLES `produtos` WRITE;
/*!40000 ALTER TABLE `produtos` DISABLE KEYS */;
INSERT INTO `produtos` VALUES (1,'Notebook',2000,'Notebook dell com i7, 32GB de RAM, SSD 500GB','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png'),(2,'Mouse',10,'Mouse com botao duplo','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png'),(3,'Teclado',20,'Teclado dell','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png'),(4,'Monitor',300,'Monitor dell','http://www.dell.com/content/dam/dell/images/brand/homepage/notebook/notebook-xps-13-core-i5-8265-i7-8565-4gb-1tb-windows-10-home-edition-black-laptop-1.png');
/*!40000 ALTER TABLE `produtos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ifpr_store'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-28 19:32:54
