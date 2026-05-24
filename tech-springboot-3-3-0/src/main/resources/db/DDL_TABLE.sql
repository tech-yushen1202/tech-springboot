DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(30)  NOT NULL DEFAULT '' COMMENT '姓名',
  `sex` varchar(12) NOT NULL DEFAULT '' COMMENT '性别',
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp`  (
  `empno` integer NOT NULL AUTO_INCREMENT COMMENT '员工号',
  `ename` varchar(30)  NOT NULL COMMENT '姓名',
  `job` varchar(12) NOT NULL COMMENT '工作',
  `mgr` integer NOT NULL COMMENT '经理号',
  `sal` float NOT NULL COMMENT '薪资',
  `comm` float NOT NULL COMMENT '备注',
  `hiredate` timestamp NOT NULL COMMENT '雇佣日期',
  `deptno` integer NOT NULL COMMENT '部门号',
  PRIMARY KEY (`empno`)
);