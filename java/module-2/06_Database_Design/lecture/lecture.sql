begin transaction;

drop table if exists artist, painting, customer, transaction, customer_transaction, customer_address, address cascade

create table artist (
	artist_id serial,
	artist_name varchar(20) not null,
	constraint pk_artist primary key (artist_id)
);
create table painting (
	painting_id serial,
	artist_id int not null,
	painting_name varchar(30) not null,
	constraint pk_painting primary key(painting_id)
);
create table customer (
	
);
create table transaction (
	
);
create table customer_transaction (
	
);
create table customer_address (
	
);
create table address (
	
);

-- foreign key
alter table painting add constraint fk_artist foreign key(artist_id) references artist(artist_id)

commit;