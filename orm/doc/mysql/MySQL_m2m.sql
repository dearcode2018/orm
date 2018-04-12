/* Oracle */

/* many to many */

/* 若存在先删除 */
DROP TABLE IF EXISTS student;
/* 学生表 */
CREATE TABLE student (
	`oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	name varchar(64) NOT NULL COMMENT '姓名',
	gender numeric(2) COMMENT '性别 : 0-未知, 1-男(male), 2-女(female)',
	credit numeric(5, 2) COMMENT '学分',
	birthday datetime COMMENT '出生日期 yyyy-MM-dd',
	address varchar(255) COMMENT '地址',
	PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

/* 添加数据 */
INSERT INTO student (name, gender, credit, birthday, address) VALUES ('王菲', 2, 12.5, '1980-02-23', '浙江省杭州市东风路23号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('张国焘', 1, 34.4, '1979-01-29', '浙江省宁波市长龙路135号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('温峥嵘', 2, 11.0, '1983-10-01', '上海市浦东新区南埔路93号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('李丽', 2, 13.4, '1981-09-02', '上海市徐汇区南京路49号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('李建', 1, 21.8, '1989-02-04', '吉林省延吉市解放路189号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('王龙云', 1, 29.9, '1985-09-13', '吉林省长春市青年路243号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('欧阳震华', 1, 25.0, '1983-02-18', '广东省广州市体育西路935号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('程华', 2, 30.1, '1978-07-20', '广东省深圳市新田路路73号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('陈明', 0, 26.8, '1988-04-13', '广西省北海市长兴路路101号');

INSERT INTO student (name, gender, credit, birthday, address) VALUES ('何云', 0, 41.3, '1981-04-16', '广西省贵港市东平路321号');

/* 若存在先删除 */
DROP TABLE IF EXISTS course;
/* 课程表 */
CREATE TABLE course (
	`oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	name varchar(64) NOT NULL COMMENT '课程名称',
	credit numeric(5, 2) COMMENT '课程的学分',
	description varchar(128) COMMENT '课程描述',
	PRIMARY KEY (`oid`)	
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='课程表';

/* 添加数据 */
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

/* student 和 course 关系关联表 (中间表) (many to many) */
DROP TABLE IF EXISTS student_course;
CREATE TABLE student_course (
	studentId int(11) COMMENT '学生id',
	courseId int(11) COMMENT '课程id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='student 和 course 关系关联表 (中间表)';

/* 添加约束 */
ALTER TABLE student_course ADD CONSTRAINT fk_student_course_studentId FOREIGN KEY(studentId) REFERENCES student(oid);
ALTER TABLE student_course ADD CONSTRAINT fk_student_course_courseId FOREIGN KEY(courseId) REFERENCES course(oid);
/* 联合唯一 union unique */
ALTER TABLE student_course ADD CONSTRAINT uu_student_course_courseId UNIQUE(studentId, courseId);

























