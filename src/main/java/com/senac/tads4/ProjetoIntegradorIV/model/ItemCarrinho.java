/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author magno
 */

@Entity(name = "itemcarrinho")
public class ItemCarrinho implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @ManyToOne
    @JoinColumn(name = "codigovenda", nullable=false) //Pega o codigo da tabela Carrinho
    private Carrinho carrinho;
    
    @ManyToOne
    @JoinColumn(name = "codigoproduto", nullable=false) //Pega o codigo da tabela Produto
    private Produto produto;
    
    @JoinColumn(name = "quantidade", nullable=false) //Pega o codigo da tabela Quantidade
    private Integer quantidade;

    public ItemCarrinho() {
        super();
    }

    public ItemCarrinho(Integer codigo, Carrinho carrinho, Produto produto, Integer quantidade) {
        this.codigo = codigo;
        this.carrinho = carrinho;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" + "codigo=" + codigo + ", carrinho=" + carrinho + ", produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
