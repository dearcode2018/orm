/* one to one */

/* 创建表 */
CREATE TABLE person (
	oid number PRIMARY KEY,
	name varchar2(64),
	photoUrl varchar2(255),
	gender varchar2(15),
	nation varchar2(32),
	birthday date,
	address varchar2(255),
	cardId number
);

COMMENT ON TABLE person IS '人信息表';
COMMENT ON COLUMN person.oid IS '主键-唯一标识符';
COMMENT ON COLUMN person.name IS '姓名';
COMMENT ON COLUMN person.photoUrl IS '证件照片url';
COMMENT ON COLUMN person.gender IS '性别 : Unknow(未知), Male(男), Female-(女)';
COMMENT ON COLUMN person.nation IS '民族';
COMMENT ON COLUMN person.birthday IS '出生日期 yyyy-MM-dd';
COMMENT ON COLUMN person.address IS '住址';

/* 创建序列 */
CREATE SEQUENCE seq_person_oid
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 999999999999999999999999
CACHE 10
ORDER
CYCLE;

/* 添加数据 */
INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '徐明', null, 'Male', '汉族', to_date('1973-01-16', 'yyyy-MM-dd'), '广东省广州市天河区平云路11号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '王洁', null, 'Female', '回族', to_date('1987-02-18', 'yyyy-MM-dd'), '新疆自治区乌鲁木齐市五山区天长路22号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '邝边', null, 'Unknow', '壮族', to_date('1983-04-15', 'yyyy-MM-dd'), '广西省玉林市玉山区广平路13号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '刘雨', null, 'Female', '汉族', to_date('1980-12-13', 'yyyy-MM-dd'), '江西省上饶市天水区青山路19号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '赵备', null, 'Unknow', '汉族', to_date('1992-12-31', 'yyyy-MM-dd'), '广东省广州市越秀区清水路17号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '卡扎尔-龙华', null, 'Male', '臧族', to_date('1979-08-11', 'yyyy-MM-dd'), '西藏自治区拉萨市东口区江北路24号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '牛芳', null, 'Female', '汉族', to_date('1968-01-18', 'yyyy-MM-dd'), '江苏省苏州市苏南区南江路89号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '伊尔民', null, 'Unknow', '臧族', to_date('1980-03-19', 'yyyy-MM-dd'), '云南省省昆明市昆山区海平路46号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '沙尔塔', null, 'Female', '维吾尔族', to_date('1976-09-08', 'yyyy-MM-dd'), '陕西省西安市汉水区西北路104号', null);

INSERT INTO person (oid, name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES (seq_person_oid.nextVal, '郑飞', null, 'Male', '壮族', to_date('1984-02-05', 'yyyy-MM-dd'), '四川省成都市天都区天府路463号', null);


/* 创建表 */
CREATE TABLE idCard (
	oid number PRIMARY KEY,
	title varchar2(32),
	cardId varchar2(64),
	issuingAuthority varchar2(32),
	effectiveDate date,
	expiryDate date,
	personId number
);

/* 创建序列 */
CREATE SEQUENCE seq_idCard_oid
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 999999999999999999999999
CACHE 10
ORDER
CYCLE;

/* 添加注释 */
COMMENT ON TABLE idCard IS '身份证表';
COMMENT ON COLUMN idCard.oid IS '主键-唯一标识符';
COMMENT ON COLUMN idCard.title IS '身份证标题, 例如 : 中华人民共和国 - 居民身份证';
COMMENT ON COLUMN idCard.issuingAuthority IS '签发机关 (Xx市公安局)';
COMMENT ON COLUMN idCard.effectiveDate IS '生效日期 yyyy-MM-dd';
COMMENT ON COLUMN idCard.expiryDate IS '失效日期 yyyy-MM-dd';

/* 添加约束 */
ALTER TABLE person ADD CONSTRAINT fk_person_cardId FOREIGN KEY(cardId) REFERENCES idCard(oid);
/* 添加约束 */
ALTER TABLE idCard ADD CONSTRAINT fk_idCard_personId FOREIGN KEY(personId) REFERENCES person(oid);

SELECT a.* FROM person a ORDER BY a.oid ASC;



