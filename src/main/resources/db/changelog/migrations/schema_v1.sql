create table netology2.CUSTOMERS2 (
id serial primary key,
name varchar(50),
surname varchar(50),
age int,
phone_number varchar(10) unique
);

--здесь или лучше в отдельной схеме?
create table netology2.ORDERS2 (
id serial primary key,
date varchar,
customer_id int,
product_name varchar,
amount int,
foreign key (customer_id) references CUSTOMERS2 (id)
);