/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.charset.CodingErrorAction;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

/**
 *
 * @author magno
 */
@Entity(name = "Pedido")
public class Pedido implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @OneToOne
    @JoinColumn(name = "codigocliente",nullable=false) //Pega o codigo da tabela Cliente
    private Cliente cliente;
    
    @Column(name = "datapedido", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacarrinho;
    
    @Digits(integer = 8, fraction = 2)
    @Column(name = "valortotal", precision = 6,
              scale = 2, nullable = false)
    private BigDecimal valortotal;
    
    @OneToOne
    @JoinColumn(name = "codigopagamento",nullable=false) //Pega o codigo da tabela FormaPagamento
    private FormaPagamento formapagemnto;
    
    @OneToOne
    @JoinColumn(name = "codigoendereco",nullable=false) //Pega o codigo da tabela EndereçoEntrega
    private EnderecoEntrega enderecoentrega;
    
    @OneToOne
    @JoinColumn(name = "codigovenda") //Pega o codigo da tabela Venda
    private Venda venda;
    
}
