/* one to one */

/* 创建表 */
DROP TABLE IF EXISTS person;
CREATE TABLE person (
	`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	name varchar(64) COMMENT '姓名',
	photoUrl varchar(255) COMMENT '证件照片url',
	gender varchar(15) COMMENT '性别 : Unknow(未知), Male(男), Female-(女)',
	nation varchar(32) COMMENT '民族',
	birthday datetime COMMENT '出生日期 yyyy-MM-dd',
	address varchar(255) COMMENT '住址',
	cardId int(11) COMMENT '身份证主键',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人信息表';

/* 添加数据 */
INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('徐明', null, 'Male', '汉族', '1973-01-16', '广东省广州市天河区平云路11号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('王洁', null, 'Female', '回族', '1987-02-18', '新疆自治区乌鲁木齐市五山区天长路22号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('邝边', null, 'Unknow', '壮族', '1983-04-15', '广西省玉林市玉山区广平路13号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('刘雨', null, 'Female', '汉族', '1980-12-13', '江西省上饶市天水区青山路19号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('赵备', null, 'Unknow', '汉族', '1992-12-31', '广东省广州市越秀区清水路17号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('卡扎尔-龙华', null, 'Male', '臧族', '1979-08-11', '西藏自治区拉萨市东口区江北路24号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('牛芳', null, 'Female', '汉族', '1968-01-18', '江苏省苏州市苏南区南江路89号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('伊尔民', null, 'Unknow', '臧族', '1980-03-19', '云南省省昆明市昆山区海平路46号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('沙尔塔', null, 'Female', '维吾尔族', '1976-09-08', '陕西省西安市汉水区西北路104号', null);

INSERT INTO person (name, photoUrl, gender, nation, birthday, address, cardId) 
VALUES ('郑飞', null, 'Male', '壮族', '1984-02-05', '四川省成都市天都区天府路463号', null);


/* 创建表 */
DROP TABLE IF EXISTS idCard;
CREATE TABLE idCard (
	`id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
	title varchar(32) COMMENT '身份证标题, 例如 : 中华人民共和国 - 居民身份证',
	cardId varchar(64) COMMENT '身份证号',
	issuingAuthority varchar(32) COMMENT '签发机关 (Xx市公安局)',
	effectiveDate datetime COMMENT '生效日期 yyyy-MM-dd',
	expiryDate datetime COMMENT '失效日期 yyyy-MM-dd',
	personId int(11) COMMENT '身份证持有者id',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='身份证表';

/* 添加约束 */
ALTER TABLE person ADD CONSTRAINT fk_person_cardId FOREIGN KEY(cardId) REFERENCES idCard(id);
/* 添加约束 */
ALTER TABLE idCard ADD CONSTRAINT fk_idCard_personId FOREIGN KEY(personId) REFERENCES person(id);

/* 删除表的时候，需要先手动删除约束，然后再创建删除表 */
/* 删除约束 */
ALTER TABLE person DROP FOREIGN KEY fk_person_cardId;
/* 删除约束 */
ALTER TABLE idCard DROP FOREIGN KEY fk_idCard_personId;



