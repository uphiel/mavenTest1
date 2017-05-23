/*创建3个用户表*/
create table t_user(
  user_id NUMBER(12) not null,
  user_name VARCHAR2(30),
  credits NUMBER(10),
  password VARCHAR2(32),
  last_visit DATE,
  last_ip VARCHAR2(23),
  constraint pk_t_user primary key (user_id)
);
create table t_login_log(
  login_log_id NUMBER(12),
  user_id NUMBER(10),
  ip VARCHAR2(23),
  login_datetime DATE
);
create table t_post(
  post_id VARCHAR2(20) not null primary key,
  board_id VARCHAR2(20),
  topic_id VARCHAR2(20),
  user_id VARCHAR2(12),
  post_type VARCHAR2(1),
  post_title VARCHAR2(50),
  post_test BLOB,
  create_time TIMESTAMP
);
create table t_topic(
  topic_id VARCHAR2(20) not null primary key,
  board_id VARCHAR2(20),
  topic_title VARCHAR2(50),
  user_id NUMBER(12),
  create_time TIMESTAMP,
  last_post TIMESTAMP,
  topic_views NUMBER(12),
  topic_replies NUMBER(12),
  digest NUMBER(1)
);
insert into t_user values(1,'wangfei','','123456','','');
--COMMIT;

select * from t_user;
update t_user
set credits=0
where user_name='wangfei';

