/*
Navicat MySQL Data Transfer

Source Server         : db_snoopydemo
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : db_snoopydemo

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-29 16:40:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for app_system
-- ----------------------------
DROP TABLE IF EXISTS `app_system`;
CREATE TABLE `app_system` (
  `app_id` varchar(32) NOT NULL,
  `app_code` varchar(255) NOT NULL,
  `app_name` varchar(255) NOT NULL,
  `create_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` varchar(32) NOT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `department_name` varchar(255) DEFAULT NULL,
  `last_upd_trancode` varchar(255) DEFAULT NULL,
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for department_resource
-- ----------------------------
DROP TABLE IF EXISTS `department_resource`;
CREATE TABLE `department_resource` (
  `id` varchar(32) NOT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `department_id` varchar(255) DEFAULT NULL,
  `last_upd_trancode` varchar(255) DEFAULT NULL,
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `resource_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for department_role
-- ----------------------------
DROP TABLE IF EXISTS `department_role`;
CREATE TABLE `department_role` (
  `role_id` varchar(32) NOT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `department_id` varchar(255) DEFAULT NULL,
  `last_upd_trancode` datetime DEFAULT NULL,
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for operator
-- ----------------------------
DROP TABLE IF EXISTS `operator`;
CREATE TABLE `operator` (
  `oper_id` varchar(32) NOT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `department_id` varchar(255) DEFAULT NULL,
  `last_upd_trancode` varchar(255) DEFAULT NULL,
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `last_validity_day` varchar(10) DEFAULT NULL,
  `oper_email` varchar(64) NOT NULL,
  `oper_name` varchar(64) NOT NULL,
  `oper_pwd` varchar(255) DEFAULT NULL,
  `oper_status` varchar(255) DEFAULT NULL,
  `oper_type` varchar(255) DEFAULT NULL,
  `phone_no` varchar(11) NOT NULL,
  `oper_position` varchar(128) DEFAULT NULL,
  `pwd_err_num` int(11) DEFAULT NULL,
  `pwd_last_update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`oper_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for operator_role
-- ----------------------------
DROP TABLE IF EXISTS `operator_role`;
CREATE TABLE `operator_role` (
  `id` varchar(32) NOT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_upd_trancode` varchar(255) DEFAULT NULL,
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `oper_id` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `resource_id` varchar(255) NOT NULL,
  `has_child` int(11) DEFAULT NULL,
  `last_upd_trancode` varchar(255) DEFAULT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `menu_flag` int(11) DEFAULT NULL,
  `parent_id` varchar(10) NOT NULL,
  `resource_path` varchar(500) NOT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `resource_code` varchar(128) NOT NULL,
  `resource_name` varchar(100) NOT NULL,
  `resource_url` varchar(128) NOT NULL,
  `sort_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for role_resource
-- ----------------------------
DROP TABLE IF EXISTS `role_resource`;
CREATE TABLE `role_resource` (
  `id` varchar(32) NOT NULL,
  `created_ts` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_upd_trancode` varchar(255) DEFAULT NULL,
  `last_upd_ts` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `resource_id` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
