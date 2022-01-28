/*
 Navicat Premium Data Transfer

 Source Server         : school
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : user_manage

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 28/01/2022 20:30:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Layman', 25, '男', '806312', '13964663866', '1995-07-19');
INSERT INTO `user` VALUES (2, 'Sarah', 20, '男', '557927', '18604976677', '2000-06-21');
INSERT INTO `user` VALUES (4, 'Crabbe', 21, '女', '655029', '13654254588', '1999-06-30');
INSERT INTO `user` VALUES (5, 'Steven', 20, '男', '482879', '13552426119', '2000-08-18');
INSERT INTO `user` VALUES (6, 'Lauvergne', 15, '女', '596092', '', '2005-08-17');
INSERT INTO `user` VALUES (7, 'Damian', 35, '男', '943700', '13813156404', '1985-07-17');
INSERT INTO `user` VALUES (8, 'Jones', 23, '男', '322697', '', '1997-10-24');
INSERT INTO `user` VALUES (9, 'Towns', 23, '女', '360704', '', '1997-11-27');
INSERT INTO `user` VALUES (10, 'Meyers', 15, '女', '319180', '13701963902', '2005-07-10');
INSERT INTO `user` VALUES (11, 'Jake', 30, '男', '370871', '15162420116', '1990-09-14');
INSERT INTO `user` VALUES (12, 'Tim', 25, '男', '420969', '', '1995-11-01');
INSERT INTO `user` VALUES (13, 'Nelly', 20, '女', '236581', '13717593937', '2000-04-21');
INSERT INTO `user` VALUES (14, 'Jokic', 24, '男', '346827', '', '1996-03-01');
INSERT INTO `user` VALUES (15, 'Myra', 19, '女', '207737', '', '2001-12-14');
INSERT INTO `user` VALUES (16, 'Nelly', 19, '男', '264355', '', '2001-05-09');
INSERT INTO `user` VALUES (17, 'Nora', 17, '女', '167833', '13851655177', '2003-07-18');
INSERT INTO `user` VALUES (18, 'Polly', 35, '女', '968518', '', '1985-08-17');
INSERT INTO `user` VALUES (19, 'Jerami', 24, '男', '734951', '', '1996-11-24');
INSERT INTO `user` VALUES (20, 'Kyle', 30, NULL, '648626', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
