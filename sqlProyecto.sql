create database Proyecto;
use Proyecto;
create table LogInInfo (
	id INT primary key auto_increment,
	nombre VARCHAR(50),
	apellido VARCHAR(50),
	username VARCHAR(50),
	password VARCHAR(50),
	tipo VARCHAR(8)
);
insert into LogInInfo (id, nombre, apellido, username, password, tipo) values (1, 'Jan', 'Quesada', 'jquesada', '12345678', 'admin');
insert into LogInInfo (id, nombre, apellido, username, password, tipo) values (2, 'nombrePrueba', 'apellidoPrueba', 'cliente', 'password', 'client');
insert into LogInInfo (id, nombre, apellido, username, password, tipo) values (3, 'nombrePrueba', 'apellidoPrueba', 'empleado', 'password', 'employee');
insert into LogInInfo (id, nombre, apellido, username, password, tipo) values (4, 'Vanya', 'Matterson', 'vmatterson3', 'hL5)8.*H', 'visitor');

select * from proyecto.logininfo;
drop table logininfo;

create table LogInInfo (
	id INT primary key auto_increment,
	nombre VARCHAR(50),
	apellido VARCHAR(50),
	username VARCHAR(50),
	password VARCHAR(50)
);
