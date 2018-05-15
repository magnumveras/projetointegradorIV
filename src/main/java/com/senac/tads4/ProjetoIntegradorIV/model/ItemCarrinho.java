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

@Entity(name = "ItemCarrinho")
public class ItemCarrinho implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @ManyToOne
    @JoinColumn(name = "codigovenda", nullable=false) //Pega o codigo da tabela Carrinho
    private Carrinho carrinho;
    
    @ManyToMany
    @JoinColumn(name = "codigoproduto", nullable=false) //Pega o codigo da tabela Produto
    private Produto produto;
    
    @JoinColumn(name = "quantidade", nullable=false) //Pega o codigo da tabela Quantidade
    private Integer quantidade;
}
