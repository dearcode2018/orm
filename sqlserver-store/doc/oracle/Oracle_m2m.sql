/* Oracle */

/* many to many */

/* 若存在先删除 */
DROP TABLE student;
/* 学生表 */
CREATE TABLE student (
	oid number PRIMARY KEY,
	name varchar2(64) NOT NULL,
	gender number(2),
	credit number(5, 2),
	birthday date,
	address varchar2(255)
);
/* 添加约束 */

/* 添加注释 */
COMMENT ON TABLE student IS '学生表';
COMMENT ON COLUMN student.oid IS '主键-唯一标识符';
COMMENT ON COLUMN student.name IS '姓名';
COMMENT ON COLUMN student.gender IS '性别 : 0-未知, 1-男(male), 2-女(female)';
COMMENT ON COLUMN student.credit IS '学分';
COMMENT ON COLUMN student.birthday IS '出生日期 yyyy-MM-dd';
COMMENT ON COLUMN student.address IS '地址';

/* 若存在先删除 */
DROP SEQUENCE seq_student_oid;
/* 创建序列 */
CREATE SEQUENCE seq_student_oid
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 999999999999999999999999
CACHE 10
ORDER
CYCLE;

/* 添加数据 */
INSERT INTO  () VALUES ();

INSERT INTO  () VALUES ();
INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '王菲', 2, 12.5, to_date('1980-02-23', 'yyyy-MM-dd'), '浙江省杭州市东风路23号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '张国焘', 1, 34.4, to_date('1979-01-29', 'yyyy-MM-dd'), '浙江省宁波市长龙路135号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '温峥嵘', 2, 11.0, to_date('1983-10-01', 'yyyy-MM-dd'), '上海市浦东新区南埔路93号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '李丽', 2, 13.4, to_date('1981-09-02', 'yyyy-MM-dd'), '上海市徐汇区南京路49号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '李建', 1, 21.8, to_date('1989-02-04', 'yyyy-MM-dd'), '吉林省延吉市解放路189号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '王龙云', 1, 29.9, to_date('1985-09-13', 'yyyy-MM-dd'), '吉林省长春市青年路243号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '欧阳震华', 1, 25.0, to_date('1983-02-18', 'yyyy-MM-dd'), '广东省广州市体育西路935号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '程华', 2, 30.1, to_date('1978-07-20', 'yyyy-MM-dd'), '广东省深圳市新田路路73号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '陈明', 0, 26.8, to_date('1988-04-13', 'yyyy-MM-dd'), '广西省北海市长兴路路101号');

INSERT INTO student (oid, name, gender, credit, birthday, address) 
VALUES (seq_student_oid.nextVal, '何云', 0, 41.3, to_date('1981-04-16', 'yyyy-MM-dd'), '广西省贵港市东平路321号');

/* 若存在先删除 */
DROP TABLE course;
/* 课程表 */
CREATE TABLE course (
	oid number PRIMARY KEY,
	name varchar2(64) NOT NULL,
	credit number(5, 2),
	description varchar2(128)
);

/* 添加注释 */
COMMENT ON TABLE animal IS '课程表';
COMMENT ON COLUMN animal.oid IS '主键-唯一标识符';
COMMENT ON COLUMN animal.name IS '课程名称';
COMMENT ON COLUMN animal.credit IS '该课程的学分';
COMMENT ON COLUMN animal.description IS '课程描述';

/* 若存在先删除 */
DROP SEQUENCE seq_course_oid;
/* 创建序列 */
CREATE SEQUENCE seq_course_oid
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 999999999999999999999999
CACHE 10
ORDER
CYCLE;

/* 添加数据 */
INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '数学', 5.5, '大学数学课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '语文', 3.5, '大学语文课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '高等几何', 2.5, '大学高等几何课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '线性代数', 1.5, '大学线性代数课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '物理', 4.0, '大学物理课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '政治', 3.5, '大学政治课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '哲学', 2.5, '大学哲学课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '英语', 4.0, '大学英语课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '自动化', 3.5, '大学自动化课程');

INSERT INTO course (oid, name, credit, description) 
VALUES (seq_course_oid.nextVal, '计算机', 4.0, '大学计算机课程');

/* student 和 course 关系关联表 (中间表) (many to many) */
CREATE TABLE student_course (
	studentId number,
	courseId number
);
/* 添加注释 */
COMMENT ON TABLE student_course IS 'student 和 course 关系关联表 (中间表) ';

COMMENT ON COLUMN student_course.studentId IS '学生id';
COMMENT ON COLUMN student_course.courseId IS '课程id';

/* 添加约束 */
ALTER TABLE student_course ADD CONSTRAINT fk_student_course_studentId FOREIGN KEY(studentId) REFERENCES student(oid);
ALTER TABLE student_course ADD CONSTRAINT fk_student_course_courseId FOREIGN KEY(courseId) REFERENCES course(oid);
/* 联合唯一 union unique */
ALTER TABLE student_course ADD CONSTRAINT uu_student_course_courseId UNION(studentId, courseId);

/* 添加数据 */
INSERT INTO  () VALUES ();

INSERT INTO  () VALUES ();


























