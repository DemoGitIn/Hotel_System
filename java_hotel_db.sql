create database java_hotel_db;

use java_hotel_db;

create table Users(
id int auto_increment primary key not null,
username varchar (20) not null,
password varchar (20) not null
);

create table Clients(
id int (11) auto_increment primary key not null,
first_name varchar (25) not null,
last_name varchar (25) not null,
phone int (25) not null,
email varchar (25) not null
);
insert into Clients (first_name, last_name, phone, email) values 
(?,?,?,?);

insert into Users(username, password) values 
('testuser','pass');

SET GLOBAL time_zone = '-3:00';

create table Type(
id int (11) auto_increment primary key not null,
label varchar (25) not null,
price varchar (25) not null
);

create table Reservations(
id int (11) auto_increment primary key not null,
client_id int (11) not null,
room_number int (11) not null,
date_in date,
date_out date
);

select * from Users where username='?' and password ='?';

alter table reservations
	add constraint fk_client_id
	foreign key(client_id)
    references clients(id)
    on delete cascade;
    
alter table reservations
	add constraint fk_room_number
	foreign key(room_number)
    references rooms(r_number)
    on delete cascade;   
    
alter table rooms
	add constraint fk_type_id
	foreign key(type)
    references type(id)
    on delete cascade;   