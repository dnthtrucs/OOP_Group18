create database parking_lot;

use parking_lot;

create table Users(
                      username varchar(50) primary key,
                      password varchar(50) not null
);

create table ParkingLots(
                            id int primary key auto_increment,
                            name varchar(50) not null,
                            car_id varchar(50) not null,
                            time_in datetime not null,
                            time_out datetime not null
);
select * from parkinglots;

select * from users;
