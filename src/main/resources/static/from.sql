/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.5.28 : Database - from
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`from` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `from`;

/*Table structure for table `dy_from` */

DROP TABLE IF EXISTS `dy_from`;

CREATE TABLE `dy_from` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `from_text` varchar(30) DEFAULT NULL,
  `from_type` int(3) DEFAULT NULL,
  `from_state` int(3) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `dy_from` */

insert  into `dy_from`(`id`,`from_text`,`from_type`,`from_state`) values (1,'账号',0,1),(2,'密码',1,1),(3,'出生日期',2,0),(4,'性别',3,0);

/*Table structure for table `dy_type` */

DROP TABLE IF EXISTS `dy_type`;

CREATE TABLE `dy_type` (
  `id` int(3) NOT NULL AUTO_INCREMENT,
  `type_text` varchar(30) DEFAULT NULL,
  `type_code` int(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `dy_type` */

insert  into `dy_type`(`id`,`type_text`,`type_code`) values (1,'文本',0),(2,'密码文本',1),(3,'时间类型',2),(4,'选择框',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
