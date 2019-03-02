/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.5.5-10.1.13-MariaDB : Database - hikari-spring
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`hikari-spring` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `hikari-spring`;

/*Table structure for table `app_role` */

DROP TABLE IF EXISTS `app_role`;

CREATE TABLE `app_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `app_role` */

insert  into `app_role`(`id`,`description`,`role_name`) values (1,'Standard User - Has no admin rights','STANDARD_USER'),(2,'Admin User - Has permission to perform admin tasks','ADMIN_USER');

/*Table structure for table `app_user` */

DROP TABLE IF EXISTS `app_user`;

CREATE TABLE `app_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `app_user` */

insert  into `app_user`(`id`,`first_name`,`last_name`,`password`,`username`) values (1,'John','Doe','$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe','john.doe'),(2,'Admin','Admin','$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe','admin.admin');

/*Table structure for table `author` */

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `born_date` date DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `author` */

insert  into `author`(`id`,`address`,`born_date`,`name`) values (1,'I don\'t Know','1990-12-12','Nurikhsan'),(2,'Mbuh sih','1998-10-12','Hikari');

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `id_barang` varchar(255) NOT NULL,
  `berat_barang` varchar(255) DEFAULT NULL,
  `jenis_barang` varchar(255) DEFAULT NULL,
  `nama_barang` varchar(255) DEFAULT NULL,
  `tgl_exfired` date DEFAULT NULL,
  PRIMARY KEY (`id_barang`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `barang` */

insert  into `barang`(`id_barang`,`berat_barang`,`jenis_barang`,`nama_barang`,`tgl_exfired`) values ('B0010','7kg','Sembako','Beras','1999-11-11'),('B00100','89kg','Mbuh','test  ilang','1999-11-11');

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `book_id` varchar(255) NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `book_name` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `date_release` date DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `book` */

insert  into `book`(`book_id`,`author`,`book_name`,`category`,`date_release`) values ('B002','Hikari','Tsuki No Hikari','Novel','2111-02-14'),('B004','Test','Buku Apa bae','Mbuh','2222-12-12');

/*Table structure for table `cars` */

DROP TABLE IF EXISTS `cars`;

CREATE TABLE `cars` (
  `vin` varchar(255) NOT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `prices` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  PRIMARY KEY (`vin`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `cars` */

insert  into `cars`(`vin`,`brand`,`color`,`prices`,`type`,`year`) values ('11','11','1199',11,11,11);

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `category_id` varchar(255) NOT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `category` */

insert  into `category`(`category_id`,`category_name`) values ('C001','Novel'),('C002','Shor Story Too'),('C003','Religion'),('C004','Motivation');

/*Table structure for table `contact` */

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `contact_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `contact` */

insert  into `contact`(`contact_id`,`name`,`email`,`address`,`telephone`) values (1,'Mukesh',NULL,'===','---------------'),(2,'Mukesh',NULL,'===','---------------');

/*Table structure for table `contact1` */

DROP TABLE IF EXISTS `contact1`;

CREATE TABLE `contact1` (
  `contact_id` int(11) DEFAULT NULL,
  `name` varchar(90) DEFAULT NULL,
  `address` varchar(90) DEFAULT NULL,
  `telephone` varchar(90) DEFAULT NULL,
  `email` varchar(89) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `contact1` */

insert  into `contact1`(`contact_id`,`name`,`address`,`telephone`,`email`) values (1,'Mukesh','===','---------------',NULL);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `dpt_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`dpt_id`),
  UNIQUE KEY `UK_1t68827l97cwyxo9r1u6t4p7d` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `department` */

/*Table structure for table `dokter` */

DROP TABLE IF EXISTS `dokter`;

CREATE TABLE `dokter` (
  `id` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `no_telp` varchar(255) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `dokter` */

insert  into `dokter`(`id`,`alamat`,`nama`,`no_telp`,`tgl_lahir`) values ('Dokter190','Test','Nurikhsan','089656541471','1998-12-12');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `designation` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `salary` int(11) DEFAULT NULL,
  `dpt_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `FKtnayoyhrcbo376f1kcg29ydt3` (`dpt_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

/*Table structure for table `guru` */

DROP TABLE IF EXISTS `guru`;

CREATE TABLE `guru` (
  `nid` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `guru` */

insert  into `guru`(`nid`,`alamat`,`nama`) values ('09899999','test00','jjjjj'),('7777','jjhj','hjhj');

/*Table structure for table `kota` */

DROP TABLE IF EXISTS `kota`;

CREATE TABLE `kota` (
  `id` int(11) NOT NULL,
  `kota` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `kota` */

insert  into `kota`(`id`,`kota`) values (1,'1'),(2,'Test');

/*Table structure for table `mahasiswa` */

DROP TABLE IF EXISTS `mahasiswa`;

CREATE TABLE `mahasiswa` (
  `nim` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `no_telp` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `mahasiswa` */

insert  into `mahasiswa`(`nim`,`alamat`,`email`,`nama`,`no_telp`) values ('02041510','Cirebon','Ikhsanhikari29@gmail.com','Hikari Ikhsan','089656541471'),('0899999999','test00','nurichzan@ymail.com','bebas','0999'),('','','','','');

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `icon` varchar(255) DEFAULT NULL,
  `is_display` int(11) DEFAULT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `menu_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `menu` */

insert  into `menu`(`id`,`icon`,`is_display`,`menu_name`,`menu_url`) values (1,'Test',1,'Author','http://localhost:8080/author/view'),(2,'Test',1,'Barang','http://localhost:8080/barang/view'),(3,'Test',1,'Kota','http://localhost:8080/kota/view');

/*Table structure for table `negara` */

DROP TABLE IF EXISTS `negara`;

CREATE TABLE `negara` (
  `id` varchar(255) NOT NULL,
  `negara` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `negara` */

insert  into `negara`(`id`,`negara`) values ('1','Indonesia'),('2','India'),('3','Irlandia'),('4','Palestina'),('5','Suriah');

/*Table structure for table `pasien` */

DROP TABLE IF EXISTS `pasien`;

CREATE TABLE `pasien` (
  `id` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `no_telp` varchar(255) DEFAULT NULL,
  `tgl_daftar` date DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `pasien` */

insert  into `pasien`(`id`,`alamat`,`nama`,`no_telp`,`tgl_daftar`,`tgl_lahir`) values ('1000','cirebon','Ikhsan','08977777','1999-09-12','2999-02-11');

/*Table structure for table `random_city` */

DROP TABLE IF EXISTS `random_city`;

CREATE TABLE `random_city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `random_city` */

insert  into `random_city`(`id`,`name`) values (1,'Bamako'),(2,'Nonkon'),(3,'Houston'),(4,'Toronto'),(5,'New York City'),(6,'Mopti'),(7,'Koulikoro'),(8,'Moscow');

/*Table structure for table `roles` */

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_nb4h0p6txrmfc0xbrd1kglp9t` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `roles` */

insert  into `roles`(`id`,`name`) values (1,'ROLE_USER'),(2,'ROLE_PM'),(3,'ROLE_ADMIN');

/*Table structure for table `tb_lov` */

DROP TABLE IF EXISTS `tb_lov`;

CREATE TABLE `tb_lov` (
  `id` varchar(255) NOT NULL,
  `lov_field` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `tb_lov` */

insert  into `tb_lov`(`id`,`lov_field`) values ('1','hikari'),('2','Jrs'),('3','Test Hungkul');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `no_telp` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id_user`,`alamat`,`email`,`nama`,`no_telp`,`password`,`username`) values (1,'jhj','gjhg','hgjh','gjhgjh','gjhg','jhg'),(2,'Cirebon','khsanhikari29@gmail.com','Nurikhsan','089656541471','hikari29','hikari'),(12,'Cirebon','khsanhikari29@gmail.com','Nurikhsan','089656541471','hikari29','hikari');

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `test` */

/*Table structure for table `tuser_tbl` */

DROP TABLE IF EXISTS `tuser_tbl`;

CREATE TABLE `tuser_tbl` (
  `username` varchar(90) NOT NULL,
  `userpass` varchar(90) DEFAULT NULL,
  `nama_user` varchar(90) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tuser_tbl` */

insert  into `tuser_tbl`(`username`,`userpass`,`nama_user`) values ('hikari','c4ca4238a0b923820dcc509a6f75849b','nurikhsan');

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  KEY `FK859n2jvi8ivhui0rl0esws6o` (`user_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `app_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_role` */

insert  into `user_role`(`user_id`,`role_id`) values (1,1),(2,1),(2,2);

/*Table structure for table `user_roles` */

DROP TABLE IF EXISTS `user_roles`;

CREATE TABLE `user_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKh8ciramu9cc9q3qcqiv4ue8a6` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Data for the table `user_roles` */

insert  into `user_roles`(`user_id`,`role_id`) values (1,1),(1,2),(2,1),(2,2);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`id`,`email`,`name`,`password`,`username`) values (1,'Tranparancy@gmail.com','hikari','$2a$10$Z.GPBZfZCe1nYd3Ei1SNZuUux901PKWKusZREkCHYbYIQwHxNPtqW','test'),(2,'Hikari@gmail.com','hikari','$2a$10$m1iXqPoa/8/F0Jxe1cRp0uIguht8X0rGHgQ/CuhpJ2t4KmBJZiyIG','nurikhsan');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
