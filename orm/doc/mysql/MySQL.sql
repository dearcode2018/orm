/* Oracle */

/* 若存在先删除 */
DROP TABLE IF EXISTS `student`;
/* 学生表 */
CREATE TABLE student (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) NOT NULL COMMENT '姓名',
  `credit` decimal(10,0) DEFAULT NULL COMMENT '学分',
  `birthday` datetime DEFAULT NULL COMMENT '出生日期 yyyy-MM-dd',
  `address` varchar(128) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

INSERT INTO student (name, credit, birthday, address) 
VALUES ('王菲', 12.5, '1980-02-23', '浙江省杭州市东风路23号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('张国焘', 34.4, '1979-01-29', '浙江省宁波市长龙路135号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('唐国强', 11.0, '1983-10-01', '上海市浦东新区南埔路93号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('赵龙', 13.4, '1981-09-02', '上海市徐汇区南京路49号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('李建', 21.8, '1989-02-04', '吉林省延吉市解放路189号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('王龙云', 29.9, '1985-09-13', '吉林省长春市青年路243号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('欧阳震华', 25.0, '1983-02-18', '广东省广州市体育西路935号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('张勇', 30.1, '1978-07-20', '广东省深圳市新田路路73号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('陈明', 26.8, '1988-04-13', '广西省北海市长兴路路101号');

INSERT INTO student (name, credit, birthday, address) 
VALUES ('何云', 41.3, '1981-04-16', '广西省贵港市东平路321号');


/* 课程表 */
/* 若存在先删除 */
DROP TABLE IF EXISTS `course`;
CREATE TABLE course (
	`oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	name varchar(64) NOT NULL COMMENT '课程名称',
	credit numeric(5, 2) COMMENT '课程的学分',
	description varchar(128) COMMENT '课程描述',
	PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

INSERT INTO course (name, credit, description) VALUES ('数学', 5.5, '大学数学课程');

INSERT INTO course (name, credit, description) VALUES ('语文', 3.5, '大学语文课程');

INSERT INTO course (name, credit, description) VALUES ('高等几何', 2.5, '大学高等几何课程');

INSERT INTO course (name, credit, description) VALUES ('线性代数', 1.5, '大学线性代数课程');

INSERT INTO course (name, credit, description) VALUES ('物理', 4.0, '大学物理课程');

INSERT INTO course (name, credit, description) VALUES ('政治', 3.5, '大学政治课程');

INSERT INTO course (name, credit, description) VALUES ('哲学', 2.5, '大学哲学课程');

INSERT INTO course (name, credit, description) VALUES ('英语', 4.0, '大学英语课程');

INSERT INTO course (name, credit, description) VALUES ('自动化', 3.5, '大学自动化课程');

INSERT INTO course (name, credit, description) VALUES ('计算机', 4.0, '大学计算机课程');







































