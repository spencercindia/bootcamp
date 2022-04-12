--populate my tables

insert into member (last_night, first_name, email, email_reminders)
values ('Donkis', 'Bonkis', 'bdonkis@wonkismail.com', false);
insert into member (last_night, first_name, email, email_reminders)
values ('Jerrell', 'Benson', 'bjerrell@wonkismail.com', true);
insert into member (last_night, first_name, email, email_reminders)
values ('Trippl', 'Simmlin', 'strippl@wonkismail.com', false);
insert into member (last_night, first_name, email, email_reminders)
values ('McPluto', 'Pluto', 'pmcpluto@wonkismail.com', false);
insert into member (last_night, first_name, email, email_reminders)
values ('Davis', 'Hellish', 'hdavis@wonkismail.com', true);
insert into member (last_night, first_name, email, email_reminders)
values ('Wenst', 'Manuel', 'mwenst@wonkismail.com', false);
insert into member (last_night, first_name, email, email_reminders)
values ('Drummlummis', 'Pierre', 'pdrummlummis@wonkismail.com', false);
insert into member (last_night, first_name, email, email_reminders)
values ('Mith', 'Darry', 'dmith@wonkismail.com', false);

insert into interest_group (group_name)
values ('Tell Me a Scary Story in Silence');
insert into interest_group (group_name)
values ('Roller Blade Hockey');
insert into interest_group (group_name)
values ('Sand Paper Grit Measurements');

update interest_group 
set group_name = 'Silent Horror Stories'
where group_name = 'Tell Me a Scary Story in Silence'

select * from interest_group
join interest_group on 

select * from event

insert into event (event_name, description, start_date, group_id)
values ('Wildin Out: Silent Edition', 'Rap battle in silence. No ASL. No speaking. Winner takes all.', '2022-04-20 20:00:00', 
		(select group_id from interest_group where group_name = 'Silent Horror Stories'));

insert into event (event_name, description, start_date, group_id)
values ('Inline Spine Annihilation', 'We roll till we die.', '2022-04-25 18:00:00', 
		(select group_id from interest_group where group_name = 'Roller Blade Hockey'));
		
insert into event (event_name, description, start_date, group_id)
values ('Is Gravel a Sand Paper Measurement Unit?', 'We decide if gravel is a sand paper measurement.', '2022-05-07 12:30:00', 
		(select group_id from interest_group where group_name = 'Sand Paper Grit Measurements'));

insert into event (event_name, description, start_date, group_id)
values ('Silent Backyard Wrestling', 'Getting hurt at home.', '2022-05-05 17:30:00', 
		(select group_id from interest_group where group_name = 'Silent Horror Stories'));

insert into member_group (member_id, group_id)
values ((select member_id from member where last_night = 'Donkis'), (select group_id from interest_group where group_name = 'Roller Blade Hockey'));

-- woops
insert into member_group (group_id, member_id)
values ((select member_id from member where last_night = 'Mith'), (select group_id from interest_group where group_name = 'Roller Blade Hockey'));

insert into member_group (member_id, group_id)
values ((select member_id from member where last_night = 'Mith'), (select group_id from interest_group where group_name = 'Roller Blade Hockey'));

insert into member_group (member_id, group_id)
values ((select member_id from member where last_night = 'McPluto'), (select group_id from interest_group where group_name = 'Silent Horror Stories'));

insert into member_group (member_id, group_id)
values ((select member_id from member where last_night = 'Trippl'), (select group_id from interest_group where group_name = 'Silent Horror Stories'));

insert into member_group (member_id, group_id)
values ((select member_id from member where last_night = 'Davis'), (select group_id from interest_group where group_name = 'Sand Paper Grit Measurements'));

insert into member_group (member_id, group_id)
values ((select member_id from member where last_night = 'Drummlummis'), (select group_id from interest_group where group_name = 'Sand Paper Grit Measurements'));

insert into member_event (member_id, event_id)
values ((select member_id from member where last_night = 'Drummlummis'), (select event_id from event where event_name = 'Wildin Out: Silent Edition'));

insert into member_event (member_id, event_id)
values ((select member_id from member where last_night = 'Davis'), (select event_id from event where event_name = 'Inline Spine Annihilation'));

insert into member_event (member_id, event_id)
values ((select member_id from member where last_night = 'Mith'), (select event_id from event where event_name = 'Is Gravel a Sand Paper Measurement Unit?'));


select * from member
select * from event
select * from interest_group join member_group using(group_id) join member using(member_id)
