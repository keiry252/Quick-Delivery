create database QuickDelivery;
Use QuickDelivery;

create table Usuarios
( 
  idUsuario Int auto_increment Primary Key,
  NombreUsuario Varchar(50) Not Null,
  Nombre Varchar(50) Not Null,
  Apellido Varchar (50) Not Null,
  Email Varchar (50) Not Null,
  Contra Varchar(50) Not Null
);

create table Producto
(
  idProducto int auto_increment Primary Key,
  Categoria varchar(50),
  NombreProducto Varchar(50),
  Precio decimal
);

create table Compra
(
idCompra int auto_increment Primary key,
idProducto int,
foreign key (idProducto) references Producto(idProducto)
);

create table Venta
(
idVenta int auto_increment Primary key,
idProducto int,
foreign key (idProducto) references Producto(idProducto)
);

create table Cliente
(
idCliente int auto_increment primary key,
idCompra int,
idUsuario int,
foreign key (idCompra) references Compra(idCompra)
);

create table Vendedor 
(
idVendedor int auto_increment primary key,
idCompra int,
idUsuario int,
foreign key (idCompra) references Compra(idCompra),
foreign key (idUsuario) references Usuarios(idUsuario) 
);

