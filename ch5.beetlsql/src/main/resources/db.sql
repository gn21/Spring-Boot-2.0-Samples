CREATE TABLE `user` (
  `id`            INT(11) NOT NULL AUTO_INCREMENT,
  `name`          VARCHAR(45)
                  COLLATE utf8_bin DEFAULT NULL
  COMMENT '名称',
  `department_id` INT(11)          DEFAULT NULL,
  `create_time`   DATE             DEFAULT NULL
  COMMENT '创建时间',
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin;

CREATE TABLE `department` (
  `id`   INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45)
         COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin;


INSERT INTO `user` VALUES (1, 'helo', 1, '2017-4-21 11:52:41');
INSERT INTO `department` VALUES ('1', '研发部门');
