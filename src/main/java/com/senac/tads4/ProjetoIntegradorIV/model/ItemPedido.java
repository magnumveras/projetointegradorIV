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
import javax.persistence.OneToOne;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author magno
 */
@Entity(name = "ItemPedido")
public class ItemPedido implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @ManyToOne
    @JoinColumn(name = "codigopedido", nullable=false) //Pega o codigo da tabela Pedido
    private Pedido pedido;
    
    @ManyToMany
    @JoinColumn(name = "codigoproduto", nullable=false) //Pega o codigo da tabela Produto
    private Produto produto;
    
    @JoinColumn(name = "quantidade", nullable=false) //Pega o codigo da tabela Quantidade
    private Integer quantidade;

    public ItemPedido() {
        super();
    }

    public ItemPedido(Integer codigo, Pedido pedido, Produto produto, Integer quantidade) {
        this.codigo = codigo;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
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
        return "ItemPedido{" + "codigo=" + codigo + ", pedido=" + pedido + ", produto=" + produto + ", quantidade=" + quantidade + '}';
    }
    
}
