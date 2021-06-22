create table if not exists admin
(
	name varchar(25) not null,
	username varchar(25) charset utf8 not null,
	password varchar(25) not null,
	user int not null,
	constraint admin_username_uindex
		unique (username)
);
insert into admin (name,username,password,user)values ('管理员1','admin','admin','3');

create table if not exists teacher
(
	name varchar(25) charset utf8 not null,
	username varchar(15) not null,
	password varchar(15) not null,
	user int not null,
	constraint teacher_username_uindex
		unique (username)
);
insert into teacher (name,username,password,user)values ('老师1','1','1','2');
insert into teacher (name,username,password,user)values ('老师2','2','2','2');


create table if not exists student
(
	name varchar(255) charset utf8 not null
		primary key,
	username varchar(255) charset utf8 not null,
	password varchar(255) charset utf8 not null,
	user varchar(255) charset utf8 not null
);
insert into student (name,username,password,user)values ('学生1','1','1','1');
insert into student (name,username,password,user)values ('学生2','2','2','1');


create table if not exists leave_list
(
	id int auto_increment,
	name varchar(255) charset utf8 not null,
	username varchar(25) charset utf8 not null,
	because varchar(255) charset utf8 null,
	day varchar(25) charset utf8 not null,
	state varchar(25) charset utf8 null,
	shenqingData varchar(255) charset utf8 not null,
	shenheData varchar(255) charset utf8 null,
	constraint leave_list_id_uindex
		unique (id),
	constraint leave_list_student__fk
		foreign key (name) references student (name)
);
alter table leave_list
	add primary key (id);
insert into leave_list (name,username,because,day,state,shenqingData,shenheData)values ('学生1','1','病假','5','审核中','2019/05/04','2019/05/25');
insert into leave_list (name,username,because,day,state,shenqingData,shenheData)values ('学生1','1','事假','45','已拒绝','2019/05/04','2019/05/25');
insert into leave_list (name,username,because,day,state,shenqingData,shenheData)values ('学生2','2','头疼','3','已同意','2019/05/04','2019/05/25');
insert into leave_list (name,username,because,day,state,shenqingData,shenheData)values ('学生2','2','不念了','255','审核中','2019/05/04','2019/05/25');


