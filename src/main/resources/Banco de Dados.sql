/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  magno
 * Created: 11/05/2018
 */

USE PROJETOINTEGRADORIV;

CREATE TABLE Perfil (
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    perfil VARCHAR(30) NOT NULL,
    CONSTRAINT primary_key PRIMARY KEY (codigo)
);

CREATE TABLE Usuario (
    codigo INTEGER NOT NULL AUTO_INCREMENT, 
    nome VARCHAR(30) NOT NULL,
    login VARCHAR(20) NOT NULL UNIQUE,
    senha VARCHAR(20) NOT NULL,
    codigoperfil INTEGER NOT NULL,
    CONSTRAINT primary_keyUsu PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyUsu FOREIGN KEY (codigoperfil) REFERENCES Perfil(codigo)
);

CREATE TABLE Cliente (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(70) NOT NULL,
    sexo VARCHAR(15) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    rg VARCHAR(12) NOT NULL,
    datanasc VARCHAR(12),
    telefone VARCHAR(14),
    email VARCHAR(60),
    endereco VARCHAR(70) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro varchar(15) NOT NULL,
    complemento VARCHAR(60),
    cidade VARCHAR(30) NOT NULL,
    estado VARCHAR(2) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    codigousuario INTEGER NOT NULL,
    CONSTRAINT primary_keycli PRIMARY KEY (id),
    CONSTRAINT foreign_keycli FOREIGN KEY (codigousuario) REFERENCES Usuario(codigo)
);

CREATE TABLE Carrinho (
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    codigocliente INTEGER NOT NULL,
    datacarrinho TIMESTAMP NOT NULL,
    valortotal DECIMAL(8,2) NOT NULL,
    CONSTRAINT primary_keycar PRIMARY KEY (codigo),
    CONSTRAINT foreign_keycar FOREIGN KEY (codigocliente) REFERENCES Cliente(id)
);

CREATE TABLE Fornecedor (
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    endereco VARCHAR(60) NOT NULL,
    numero varchar(10) NOT NULL,
    complemento varchar (60),
    cidade varchar (30),
    estado varchar (2),
    telefone VARCHAR (14),
    CONSTRAINT primary_keyfor PRIMARY KEY (codigo)
);

CREATE TABLE Categoria (
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    CONSTRAINT primary_keycate PRIMARY KEY (codigo)
);

CREATE TABLE Imagem(
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(70) NOT NULL,
    legenda VARCHAR(70) NOT NULL,
    CONSTRAINT primary_keyimg PRIMARY KEY (codigo)
);

CREATE TABLE Produto (
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    nome VARCHAR(70) NOT NULL,
    descricao VARCHAR(200) NOT NULL,
    codigofornecedor INTEGER NOT NULL,
    codigocategoria INTEGER NOT NULL,
    precocompra DECIMAL(8,2) NOT NULL,
    precovenda DECIMAL(8,2) NOT NULL,
    estoque INTEGER NOT NULL,
    codigoimagem INTEGER NOT NULL,
    CONSTRAINT primary_keypro PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyprofor FOREIGN KEY (codigofornecedor) REFERENCES Fornecedor(codigo),
    CONSTRAINT foreign_keyprocat FOREIGN KEY (codigocategoria) REFERENCES Categoria(codigo),
    CONSTRAINT foreign_keyproimg FOREIGN KEY (codigoimagem) REFERENCES Imagem(codigo)
);

CREATE TABLE Endereco_Entrega(
	codigo INTEGER NOT NULL AUTO_INCREMENT,
    endereco VARCHAR(50),
    complemento VARCHAR(50),
    numero varchar(10),
    bairro varchar(10),
    CONSTRAINT primary_keyven PRIMARY KEY (codigo)
);

CREATE TABLE Forma_Pagamento(
	codigo INTEGER NOT NULL AUTO_INCREMENT,
    cartaocredito BOOLEAN,
    paypal BOOLEAN,
    numerocartao VARCHAR(30),
    nomecartao VARCHAR(20),
    codigoseguranca VARCHAR(3),
    usuariopay VARCHAR(30),
    senhapay VARCHAR(30),
    CONSTRAINT primary_keyforma PRIMARY KEY (codigo)
);

CREATE TABLE Pedido(
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    codigocliente INTEGER NOT NULL,
    datavenda timestamp NOT NULL,
    valortotal DECIMAL(8,2) NOT NULL,
    codigopagamento INTEGER NOT NULL,
    codigoendereco INTEGER NOT NULL,
    codigovenda INTEGER,
    CONSTRAINT primary_keyven PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyvencli FOREIGN KEY (codigocliente) REFERENCES Cliente(id),
    CONSTRAINT foreign_keycodpag FOREIGN KEY (codigopagamento) REFERENCES Forma_Pagamento(codigo),
    CONSTRAINT foreign_keycodend FOREIGN KEY (codigoendereco) REFERENCES Endereco_Entrega(codigo)
);

CREATE TABLE Venda(
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    codigocliente INTEGER NOT NULL,
    datavenda timestamp NOT NULL,
    valortotal DECIMAL(8,2) NOT NULL,
    codigopagamento INTEGER NOT NULL,
    codigoendereco INTEGER NOT NULL,
    codigopedido INTEGER NOT NULL,
    CONSTRAINT primary_keyven PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyvencli FOREIGN KEY (codigocliente) REFERENCES Cliente(id),
    CONSTRAINT foreign_keycodend FOREIGN KEY (codigoendereco) REFERENCES Endereco_Entrega(codigo),
    CONSTRAINT foreign_keycodpag FOREIGN KEY (codigopagamento) REFERENCES Forma_Pagamento(codigo),
    CONSTRAINT foreign_keycodped FOREIGN KEY (codigopedido) REFERENCES Pedido(codigo)
);


CREATE TABLE ItemPedido(
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    codigopedido INTEGER NOT NULL,
    codigoproduto INTEGER NOT NULL,
    quantidade INTEGER NOT NULL,
    CONSTRAINT primary_keyitem PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyitemcod FOREIGN KEY (codigopedido) REFERENCES Pedido(codigo),
    CONSTRAINT foreign_keyitempro FOREIGN KEY (codigoproduto) REFERENCES Produto(codigo)
);

CREATE TABLE Itemvenda (
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    codigovenda INTEGER NOT NULL,
    codigoproduto INTEGER NOT NULL,
    quantidade INTEGER NOT NULL,
    CONSTRAINT primary_keyitem PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyitemcod FOREIGN KEY (codigovenda) REFERENCES Venda(codigo),
    CONSTRAINT foreign_keyitempro FOREIGN KEY (codigoproduto) REFERENCES Produto(codigo)
);

CREATE TABLE Itemcarrinho(
    codigo INTEGER NOT NULL AUTO_INCREMENT,
    codigocarrinho INTEGER NOT NULL,
    codigoproduto INTEGER NOT NULL,
    quantidade INTEGER NOT NULL,
    CONSTRAINT primary_keyitemcar PRIMARY KEY (codigo),
    CONSTRAINT foreign_keyitemcar FOREIGN KEY (codigocarrinho) REFERENCES Carrinho(codigo),
    CONSTRAINT foreign_keyitemcarpro FOREIGN KEY (codigoproduto) REFERENCES Produto(codigo)
);