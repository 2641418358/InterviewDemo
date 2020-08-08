/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.19 : Database - interviewdemo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`interviewdemo` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `interviewdemo`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `mobile` varchar(32) DEFAULT NULL COMMENT '登录名，使用电话号码作为登录名',
  `password` varchar(64) DEFAULT NULL COMMENT '登录密码',
  `sex` varchar(32) DEFAULT NULL COMMENT '性别',
  `birthdate` datetime DEFAULT NULL COMMENT '出生日期',
  `address` varchar(250) DEFAULT NULL COMMENT '详细地址',
  `email` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `state` varchar(32) DEFAULT NULL COMMENT '-1:表示删除 ，1：正常状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';

/*Data for the table `user` */

insert  into `user`(`id`,`mobile`,`password`,`sex`,`birthdate`,`address`,`email`,`state`,`create_time`,`update_time`) values (1,'12345678911','123456','男','2020-08-07 18:43:08','四川省','123456@qq.com','1','2020-08-07 18:43:30','2020-08-07 18:43:32'),(2,'1111','123','女','2020-08-07 00:00:00','四川省','123@qq.com','2','2020-08-07 00:00:00','2020-08-07 00:00:00'),(4,'1212','123','女','2020-08-08 16:51:35','四川省','123@qq.com','2',NULL,NULL),(5,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'2222','123','女','2020-08-08 16:49:58','四川省','123@qq.com','2',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
