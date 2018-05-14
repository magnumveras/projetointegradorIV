package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {

  @Id
  @Column(name = "Codigo")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer codigo;
  
  @Size(min = 1, max = 30)
  @Column(name = "nome", length = 30,
          nullable = false, unique = true)
  private String nome;

  public Categoria() {
      super();
  }

    public Categoria(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
    

}
