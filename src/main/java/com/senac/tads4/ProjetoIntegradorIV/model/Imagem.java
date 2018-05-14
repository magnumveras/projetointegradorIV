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
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author magno
 */

@Entity
@Table(name = "Imagem")
public class Imagem implements Serializable{
    
  @Id
  @Column(name = "Codigo")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigo;
  
  @Size(min = 1, max = 70)
  @Column(name = "nome", length = 70,
          nullable = false)
  private String nome;
  
  @Size(min = 1, max = 70)
  @Column(name = "legenda", length = 70,
          nullable = false)
  private String legenda;

    public Imagem() {
            super();
    }

    public Imagem(Integer codigo, String nome, String legenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.legenda = legenda;
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

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    @Override
    public String toString() {
        return "Imagem{" + "codigo=" + codigo + ", nome=" + nome + ", legenda=" + legenda + '}';
    }
  
    
}
