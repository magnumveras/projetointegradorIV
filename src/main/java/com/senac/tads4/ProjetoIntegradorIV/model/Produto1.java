package com.senac.tads4.ProjetoIntegradorIV.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;


@Entity
@Table(name = "TB-PRODUTO")
public class Produto1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUTO")
	private int id;

	@Column(name = "MARCA", length = 100, nullable = false)
	private String marca;

	@Column(name = "MODELO", length = 100, nullable = false)
	private String modelo;

	@Column(name = "COR", length = 100, nullable = false)
	private String cor;

	@Column(name = "CATEGORIA", length = 100, nullable = false)
	private String categoria;

	@Column(name = "DESC", length = 1000)
	private String descricao;

	@Digits(integer = 6, fraction = 2)
	@Column(name = "VL_COMPRA", precision = 6, scale = 2, nullable = false)
	private BigDecimal vCompra;
	
	@Digits(integer = 6, fraction = 2)
	@Column(name = "VL_VENDA", precision = 6, scale = 2, nullable = false)
	private BigDecimal vVenda;
	
	@Column(name = "ESTOQUE", precision = 6, scale = 0, nullable = false)
	private int estoque;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public BigDecimal getvCompra() {
		return vCompra;
	}

	public void setvCompra(BigDecimal vCompra) {
		this.vCompra = vCompra;
	}

	public BigDecimal getvVenda() {
		return vVenda;
	}

	public void setvVenda(BigDecimal vVenda) {
		this.vVenda = vVenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
