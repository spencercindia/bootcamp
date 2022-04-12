begin transaction;

drop table if exists member, interest_group, event, member_in_group, member_attending cascade;

alter table member alter light_night to last_name

create table member (
	member_id serial,
	last_name varchar(15) not null,
	first_name varchar(15) not null,
	email varchar(30) not null,
	phone int null,
	dob date null,
	email_reminders boolean not null,
	constraint pk_member primary key (member_id)
);

create table interest_group (
	group_id serial,
	group_name varchar(100) not null,
	constraint pk_group primary key(group_id),
	constraint uq_group unique(group_name)
);

create table event (
	event_id serial,
	event_name varchar(200) not null,
	description text not null,
	start_date timestamp not null,
	duration_minutes int null,
	group_id int not null,
	constraint pk_event primary key(event_id),
	constraint fk_event foreign key(group_id) references interest_group(group_id),
	constraint ck_event check(duration_minutes >= 30)
);

create table member_group (
	group_id int not null,
	member_id int not null,
	constraint pk_member_group primary key(group_id, member_id),
	constraint fk_group_id foreign key(group_id) references interest_group(group_id),
	constraint fk_member_id foreign key(member_id) references member(member_id)
);

create table member_event (
	member_id int not null,
	event_id int not null,
	constraint pk_member_event primary key(member_id, event_id),
	constraint fk_member_id foreign key(member_id) references member(member_id),
	constraint fk_event_id foreign key(event_id) references event(event_id)
);
