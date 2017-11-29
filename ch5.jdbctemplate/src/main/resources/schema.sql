CREATE TABLE `user` (
  `id`            INT(11) NOT NULL AUTO_INCREMENT,
  `name`          VARCHAR(45) DEFAULT NULL COMMENT '名称',
  `department_id` INT(11)          DEFAULT NULL,
  `create_time`   DATE             DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
);

CREATE TABLE `department` (
  `id`   INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `user` VALUES (1, 'helo', 1, NULL );
INSERT INTO `department` VALUES ('1', '研发部门');
