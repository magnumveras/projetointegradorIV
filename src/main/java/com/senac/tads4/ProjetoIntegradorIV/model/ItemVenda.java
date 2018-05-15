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
@Entity(name = "ItemVenda")
public class ItemVenda implements Serializable{
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @ManyToOne
    @JoinColumn(name = "codigovenda", nullable=false) //Pega o codigo da tabela Venda
    private Venda venda;
    
    @ManyToMany
    @JoinColumn(name = "codigoproduto", nullable=false) //Pega o codigo da tabela Produto
    private Produto produto;
    
    @JoinColumn(name = "quantidade", nullable=false) //Pega o codigo da tabela Quantidade
    private Integer quantidade;

    public ItemVenda() {
        super();
    }

    public ItemVenda(Integer codigo, Venda venda, Produto produto, Integer quantidade) {
        this.codigo = codigo;
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
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
        return "ItemVenda{" + "codigo=" + codigo + ", venda=" + venda + ", produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
