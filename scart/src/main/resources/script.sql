
drop table if exists product;
create table product(pid int primary key auto_increment,name varchar(100),price float,description varchart(255));
insert into product(name,price,description) values
('Learn Java in 5 days',340,'Learning java is fun, to have fun please learn'),
('Lenovo Think Pad',34000,'Laptop with 8GB RAM i3 Processor'),
('iPhone13',10840,'Phone with 8GB RAM and 4 core processor');

drop table if exists app_user;

create table app_user(uid int primary key auto_increment,name varchar(100),email varchar(100),password varchar(20));