/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 *
 * @author magno
 */
@Entity(name = "Endereco_Entrega")
public class EnderecoEntrega implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Size(min = 1, max = 50)
    @Column(name = "endereco", length = 50, nullable=false)
    private String endereco;
        
    @Size(min = 1, max = 50)
    @Column(name = "login", length = 50, nullable=false)
    private String complemento;
    
    @Size(min = 1, max = 10)
    @Column(name = "numero", length = 10, nullable=false)
    private String numero;
    
    @Size(min = 1, max = 10)
    @Column(name = "bairro", length = 10, nullable=false)
    private String bairro;
    
    @Size(min = 1, max = 9)
    @Column(name = "cep", length = 9, nullable=false)
    private String cep;

    public EnderecoEntrega() {
        super();
    }

    public EnderecoEntrega(Integer codigo, String endereco, String complemento, String numero, String bairro, String cep) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "EnderecoEntrega{" + "codigo=" + codigo + ", endereco=" + endereco + ", complemento=" + complemento + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + '}';
    }
    
}
