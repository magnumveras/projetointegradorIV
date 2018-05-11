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
@Entity
@Table(name = "Perfil")
public class Perfil implements Serializable{
    
    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Size(min = 1, max = 30)
    @Column(name = "perfil", length = 30)
    private String nome;
    
    public Perfil(){
        super();
    }

    public Perfil(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Perfil{" + "Codigo=" + codigo + ", Perfil=" + nome + '}';
    }
    
    
    
}
