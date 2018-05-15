/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

/**
 *
 * @author magno
 */
@Entity

public class Fornecedor implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Size(min = 1, max = 30)
    @Column(name = "nome", length = 30, nullable=false)
    private String nome;
    
    @Size(min = 1, max = 60)
    @Column(name = "endereco", length = 60, nullable=false)
    private String endereco;
    
    @Size(min = 1, max = 10)
    @Column(name = "numero", length = 10, nullable=false)
    private String numero;
    
    @Size(min = 1, max = 60)
    @Column(name = "complemento", length = 60)
    private String complemento;
    
    @Size(min = 1, max = 30)
    @Column(name = "cidade", length = 30)
    private String cidade;
    
    @Size(min = 1, max = 2)
    @Column(name = "estado", length = 2)
    private String estado;
    
    @Size(min = 1, max = 14)
    @Column(name = "telefone", length = 14)
    private String telefone;

    
    public Fornecedor() {
        super();
    }

    public Fornecedor(Integer codigo, String nome, String endereco, String numero, String complemento, String cidade, String estado, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
