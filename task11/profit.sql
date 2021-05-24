-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: profit
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `hash_tags`
--

DROP TABLE IF EXISTS `hash_tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hash_tags` (
  `hash_tag_id` int NOT NULL AUTO_INCREMENT,
  `hash_tag_name` varchar(100) NOT NULL,
  PRIMARY KEY (`hash_tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hash_tags`
--

LOCK TABLES `hash_tags` WRITE;
/*!40000 ALTER TABLE `hash_tags` DISABLE KEYS */;
INSERT INTO `hash_tags` VALUES (1,'Развлечения'),(2,'Аквапарки'),(3,'Боулинг'),(4,'Зоопарк'),(5,'Квесты'),(6,'Выставки'),(7,'Детям'),(8,'Батуты'),(9,'Еда'),(10,'Суши'),(11,'Пицца'),(12,'Бургеры');
/*!40000 ALTER TABLE `hash_tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hash_tags_products`
--

DROP TABLE IF EXISTS `hash_tags_products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hash_tags_products` (
  `hash_tags_products_id` int NOT NULL AUTO_INCREMENT,
  `hash_tag_id` int NOT NULL,
  `product_id` int NOT NULL,
  PRIMARY KEY (`hash_tags_products_id`),
  KEY `hash_tag_id_idx` (`hash_tag_id`),
  KEY `product_id_idx` (`product_id`),
  CONSTRAINT `hash_tag_id` FOREIGN KEY (`hash_tag_id`) REFERENCES `hash_tags` (`hash_tag_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hash_tags_products`
--

LOCK TABLES `hash_tags_products` WRITE;
/*!40000 ALTER TABLE `hash_tags_products` DISABLE KEYS */;
INSERT INTO `hash_tags_products` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(9,9,8),(10,9,9),(11,9,10),(12,2,1),(13,3,2),(14,4,3),(15,5,4),(16,6,5),(17,7,6),(18,8,7),(19,10,8),(20,11,9),(21,12,10);
/*!40000 ALTER TABLE `hash_tags_products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `product_id` int NOT NULL AUTO_INCREMENT,
  `product_desciption` varchar(1000) NOT NULL,
  `product_creation_date` date NOT NULL,
  `product_link` varchar(200) NOT NULL,
  `product_vendor` varchar(200) NOT NULL,
  `product_photo_link` varchar(200) NOT NULL,
  `product_valid_until` date NOT NULL,
  `product_discount` int NOT NULL,
  `product_rating` float NOT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Аквапарк \\\"Фристайл\\\": аквазона от 15 руб/3 часа, аквазона + 6 бань от 35 руб/до 6 часов','2021-03-15','https://www.free-style.by/','Аквапарк \\\"Фристайл\\\"','https://www.free-style.by/assets/img/akvapark/photo/%D0%9E%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD%D0%B5%D1%80%20%D0%92%D0%BB%D0%B0%D0%B4%20%D0%91%D0%BE%D1%80%D0%B8%D1%81%D0%B5%D0%B2%D0%B8%D1%87%20(26)-min.jpg','2021-06-01',30,4),(2,'Боулинг в клубе НЛО всего от 10 руб/час','2021-02-15','http://www.nlo.by/','Боулинг \\\"НЛО\\\"','http://www.nlo.by/tim.php?src=images/1431501458.jpg&h=255&w=550','2021-04-01',15,3.9),(3,'Посещение зоопарка в Чижовке всего за 4,50 руб/билет','2021-03-10','http://minskzoo.by/','ГКПУ \\\"Минский зоопарк\\\"','http://minskzoo.by/images/slideshow/1%20.jpg','2021-04-10',50,4.9),(4,'Квесты \\\"Братство масонов\\\" и \\\"Вестерн: Однажды в Аризоне\\\" от 29 руб/до 6 человек. Подарочные сертификаты от 50 руб.','2021-01-15','https://pinkertonquest.by/','Пинкертон','https://www.slivki.by/znijki-media/w522_322/default/1009921/kvest-pinkertonquest.jpg','2021-10-01',52,4.9),(5,'Посещение музея экспериментальных наук \\\"Экспириментус\\\" от 6 руб/билет в ТРЦ \\\"Palazzo\\\"','2021-03-20','https://expo.expirimentus.by/','Экспириментус','https://expo.expirimentus.by/img/gallery/02.jpg','2021-06-29',40,4.8),(6,'Конные прогулки по живописным местам от 12,50 руб. в конно-спортивном клубе \\\"Тракенен\\\"','2020-03-15','https://mssg.me/ksk_trakenen','ИП Байталюк Ю.В.','https://www.slivki.by/ximage/1594731376_mceclip15.jpg','2022-06-01',45,5),(7,'Сеть батутных центров \\\"Hero Park\\\" в Минске от 5,50 руб/60 минут','2021-03-01','http://heropark.by/index.html','Hero park','https://heropark.by/wp-content/uploads/2019/01/fitnes_dlay_fzroslih_gallery_3.jpg','2021-06-30',40,4.7),(8,'Суши-сеты от 14 руб/от 440 г от \\\"ЮДЖЫН КРАБС\\\" с бесплатной доставкой','2021-01-22','https://ucrabs.by/','Юджин Крабс суши доставка','https://ucrabs.by/image/cache/catalog/catalog/seti/kupidon-2-1600x1600.jpg','2021-11-11',33,4.8),(9,'Пиццы 22, 30 и 36 см Domino’s Pizza от 9,29 руб. в ресторане + доставка + навынос!','2021-02-22','https://dominos.by/','Domino’s Pizza','https://images.dominos.by/media/uploads/2020/11/18/__852432-min.png','2022-12-12',44,4.4),(10,'KFC -50%: 3 комбо на выбор от 11,30 руб.','2021-01-01','https://www.kfc.by/','KFC','https://statickfc.cdnvideo.ru/promotions/medium/promo_3650_1405074669.jpg','2021-04-01',30,4.5);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviews`
--

DROP TABLE IF EXISTS `reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reviews` (
  `review_id` int NOT NULL AUTO_INCREMENT,
  `review_text` varchar(1000) NOT NULL,
  `review_rating` int NOT NULL,
  `user_id` int NOT NULL,
  `product_id` int NOT NULL,
  PRIMARY KEY (`review_id`),
  KEY `user_id_idx` (`user_id`),
  KEY `product_id_idx` (`product_id`),
  CONSTRAINT `product_idfk` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviews`
--

LOCK TABLES `reviews` WRITE;
/*!40000 ALTER TABLE `reviews` DISABLE KEYS */;
INSERT INTO `reviews` VALUES (1,'good',4,4,1),(2,'norm',3,5,2),(3,'like it',4,6,3),(4,'awesome',5,7,4),(5,'nice',4,8,5),(6,'bad',2,9,6),(7,'awful',1,4,7),(8,'nice',4,5,8),(9,'good',4,6,9),(10,'like it',4,7,10);
/*!40000 ALTER TABLE `reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_roles` (
  `user_role_id` int NOT NULL,
  `user_role_name` varchar(45) NOT NULL,
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (0,'ADMIN'),(1,'VENDOR'),(2,'USER');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_login` varchar(45) NOT NULL,
  `user_role_id` int NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `user_role_id_idx` (`user_role_id`),
  CONSTRAINT `user_role_id` FOREIGN KEY (`user_role_id`) REFERENCES `user_roles` (`user_role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'ADMIN',0),(2,'ivolercu',1),(3,'lcockspe',2),(4,'odgentab',2),(5,'aphomatr',2),(6,'hitypere',2),(7,'ghwincol',2),(8,'blayworb',2),(9,'ldormial',2),(10,'titereme',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-24 18:27:34
