
/* many to one */

/* 创建表 */
CREATE TABLE custom (
	oid number PRIMARY KEY,
	name varchar2(64),
	balance number(9, 2),
	address varchar2(255),
	status number(2)
);

/* 添加注释 */
COMMENT ON TABLE custom IS '客户表';
COMMENT ON COLUMN custom.oid IS '主键-唯一标识符';
COMMENT ON COLUMN custom.name IS '客户姓名';
COMMENT ON COLUMN custom.balance IS '帐户余额';
COMMENT ON COLUMN custom.status IS '客户状态 (0-无效, 1-未激活, 2-正常)';
COMMENT ON COLUMN custom.address IS '地址';

/* 创建序列 */
CREATE SEQUENCE seq_custom_oid
START WITH 0
INCREMENT BY 1
MINVALUE 0
MAXVALUE 999999999999999999999999
CACHE 10
ORDER
CYCLE;

/* 添加数据 */
INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '徐明', 254.21, 1, '新疆自治区乌鲁木齐市五山区天长路22号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '王洁', 6942.47, 0, '广东省广州市天河区平云路11号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '邝边', 0.00, 2, '江西省上饶市天水区青山路19号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '刘雨', 221.01, 1, '广西省玉林市玉山区广平路13号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '赵备', 10.15, 2, '广东省广州市越秀区清水路17号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '卡扎尔-龙华', 19.11, 2, '西藏自治区拉萨市东口区江北路24号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '牛芳', 294.41, 0, '云南省省昆明市昆山区海平路46号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '伊尔民', 358.71, 0, '江苏省苏州市苏南区南江路89号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '沙尔塔', 124.01, 1, '四川省成都市天都区天府路463号');

INSERT INTO custom (oid, name, balance, status, address) 
VALUES (seq_custom_oid.nextVal, '郑飞', 239.10, 1, '陕西省西安市汉水区西北路104号');

/* 创建表 */
CREATE TABLE item (
	oid number PRIMARY KEY,
	name varchar2(64),
	orderTs timestamp,
	monetary number(7, 2),
	remark varchar2(64),
	customId number
);
/* 添加约束 */
ALTER TABLE item ADD CONSTRAINT fk_item_studentId FOREIGN KEY(customId) REFERENCES custom(oid);

COMMENT ON TABLE item IS '订单表';
COMMENT ON COLUMN item.oid IS '主键-唯一标识符';
COMMENT ON COLUMN item.name IS '定单名称';
COMMENT ON COLUMN item.orderTs IS '下单时间戳 yyyy-MM-dd HH:mm:ss';
COMMENT ON COLUMN item.monetary IS '消费金额';
COMMENT ON COLUMN item.remark IS '备注';

/* 创建序列 */
CREATE SEQUENCE seq_item_oid
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

