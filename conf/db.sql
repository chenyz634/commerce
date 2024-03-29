
CREATE TABLE C_USER (
  C_USERID int auto_increment NOT NULL, 
  C_USERNAME VARCHAR(20) NOT NULL,
  C_PASSWORD VARCHAR(20) NOT NULL,
  C_ROLES VARCHAR(100) NOT NULL,
  C_ORGCODE VARCHAR(20),
  PRIMARY KEY (C_USERID));
Insert into C_USER (C_USERNAME,C_PASSWORD,C_ROLES) values ('sa','cust214','sa');

CREATE TABLE C_ROLE (
  C_ROLE_ID VARCHAR(10) NOT NULL,
  C_ROLE_NAME VARCHAR(100) NOT NULL,
  PRIMARY KEY (c_role_id));
INSERT INTO C_ROLE (C_ROLE_ID, C_ROLE_NAME) VALUES ('sa', '超级用户');
INSERT INTO C_ROLE (C_ROLE_ID, C_ROLE_NAME) VALUES ('qyyh', '企业用户');

CREATE TABLE C_PERMISSION (
  C_PERMISSION_ID VARCHAR(30) NOT NULL,
  C_PERMISSION_NAME VARCHAR(100) NOT NULL,
  PRIMARY KEY (c_permission_id));
Insert into C_PERMISSION (C_PERMISSION_ID,C_PERMISSION_NAME) values ('cpfb','产品发布');
Insert into C_PERMISSION (C_PERMISSION_ID,C_PERMISSION_NAME) values ('cpwh','产品维护');
Insert into C_PERMISSION (C_PERMISSION_ID,C_PERMISSION_NAME) values ('cpdy','产品订阅');
Insert into C_PERMISSION (C_PERMISSION_ID,C_PERMISSION_NAME) values ('cpss','产品搜索');
Insert into C_PERMISSION (C_PERMISSION_ID,C_PERMISSION_NAME) values ('xtwh','系统维护');



CREATE TABLE C_ROLE_HAS_C_PERMISSION (
  C_ROLE_ID VARCHAR(10) NOT NULL,
  C_PERMISSION_ID VARCHAR(30) NOT NULL,
  PRIMARY KEY (c_role_id, c_permission_id));
alter table C_ROLE_HAS_C_PERMISSION add constraint fk_c_role_id foreign key(C_ROLE_ID) references C_ROLE(C_ROLE_ID);
alter table C_ROLE_HAS_C_PERMISSION add constraint fk_c_permission_id foreign key(C_PERMISSION_ID) references C_PERMISSION(C_PERMISSION_ID);
