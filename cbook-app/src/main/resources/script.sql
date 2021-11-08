drop table app_user;
drop table user_contact;

create table app_user(uid int primary key auto_increment,username varchar(250),email varchar(250) unique,password varchar(250));
insert into app_user(username,email,password) values('Naresh','naresh.a@gmail.com',"user@123");
insert into app_user(username,email,password) values('Lakshman','lakshman.a@gmail.com',"user@123");

create table user_contact(cid int primary key auto_increment,name varchar(100),email varchar(100),dob date,mobile varchar(12) unique,uid int,
constraint fk_uid foreign key(uid) references app_user(uid));


insert into user_contact(name,email,dob,mobile,uid) values('Ramakrishna','rk@gmail.com','1990-06-21','9867543219',1);
insert into user_contact(name,email,dob,mobile,uid) values('Nagendrababu','nb@gmail.com','1989-06-21','9867543299',1);
insert into user_contact(name,email,dob,mobile,uid) values('Sai','sai@gmail.com','1989-06-21','9867543259',1);


insert into user_contact(name,email,dob,mobile,uid) values('Balue','balu@gmail.com','1984-06-21','9867543419',2);
insert into user_contact(name,email,dob,mobile,uid) values('Manoj','manoj@gmail.com','1985-06-21','9867543599',2);
insert into user_contact(name,email,dob,mobile,uid) values('Charan','charan@gmail.com','1983-06-21','9867546259',2);