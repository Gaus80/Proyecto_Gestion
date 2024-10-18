DROP DATABASE IF EXISTS proyecto_gestion;

CREATE DATABASE proyecto_gestion;

USE proyecto_gestion;
CREATE TABLE usuarios(
id int auto_increment not null, 
nombre varchar(100) not null,
 correo varchar(100) not null, 
 telefono varchar(32) not null,
 pass varchar(32) not null,
 primary key(id)
); 

CREATE TABLE productos(
codigo varchar(32), 
nombreProducto varchar(100) not null,
cantidad  int not null,
primary key(codigo)
); 
