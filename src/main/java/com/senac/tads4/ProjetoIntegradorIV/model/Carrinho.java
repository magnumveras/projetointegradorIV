/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 *
 * @author magno
 */
@Entity(name = "Carrinho")
public class Carrinho implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @OneToOne
    @JoinColumn(name = "codigocliente",nullable=false) //Pega o codigo da tabela Usuario
    private Cliente cliente;
    
    @Column(name = "datacarrinho", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacarrinho;
    
    @Digits(integer = 8, fraction = 2)
    @Column(name = "valortotal", precision = 6,
              scale = 2, nullable = false)
    private BigDecimal valortotal;
    
    public Carrinho() {
        super();
    }

    public Carrinho(Integer codigo, Cliente cliente, Date datacarrinho, BigDecimal valortotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.datacarrinho = datacarrinho;
        this.valortotal = valortotal;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDatacarrinho() {
        return datacarrinho;
    }

    public void setDatacarrinho(Date datacarrinho) {
        this.datacarrinho = datacarrinho;
    }

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "codigo=" + codigo + ", cliente=" + cliente + ", datacarrinho=" + datacarrinho + ", valortotal=" + valortotal + '}';
    }
    
}
