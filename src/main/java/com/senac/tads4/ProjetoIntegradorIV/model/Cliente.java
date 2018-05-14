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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author magno
 */
@Entity(name = "Cliente")
@Table(name = "Cliente")
public class Cliente implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Size(min = 1, max = 30)
    @Column(name = "nome", length = 30, nullable=false)
    private String nome;
    
   // @Size(min = 1, max = 70)
  //  @Column(name = "sobrenome", length = 70, nullable=false)
   // private String sobrenome;
        
  //  @Size(min = 1, max = 15)
  //  @Column(name = "sexo", length = 15, nullable=false)
  //  private String sexo;
    
 //   @Size(min = 14, max = 14)
   // @Column(name = "cpf", length = 14, nullable=false)
 //   private String cpf;
   
   // @Size(min = 12, max = 12)
  //  @Column(name = "rg", length = 12, nullable=false)
   // private String rg;
    
    @Size(min = 8, max = 10)
    @Column(name = "datanasc", length = 10)
    private String datanasc;
    
    @Size(min = 8, max = 14)
    @Column(name = "telefone", length = 14)
    private String telefone;
    
    @Size(min = 1, max = 60)
    @Column(name = "email", length = 60)
    private String email;
    
   // @Size(min = 1, max = 70)
   // @Column(name = "endereco", length = 70, nullable = false)
   // private String endereco;
    
    @Size(min = 1, max = 10)
    @Column(name = "numero", length = 10, nullable = false)
    private String numero;
    
    @Size(min = 1, max = 15)
    @Column(name = "bairro", length = 15, nullable = false)
    private String bairro;
    
    @Size(min = 1, max = 60)
    @Column(name = "complemento", length = 60)
    private String complemento;
    
    @Size(min = 1, max = 30)
    @Column(name = "cidade", length = 30, nullable = false)
    private String cidade;
    
    @Size(min = 2, max = 10)
    @Column(name = "estado", length = 2, nullable = false)
    private String estado;
    
    @Size(min = 1, max = 9)
    @Column(name = "cep", length = 9, nullable = false)
    private String cep;
    
    @Size(min = 1, max = 9)
    @Column(name = "rua", length = 9, nullable = false)
    private String rua;    
    
   // @OneToOne
   // @JoinColumn(name = "codigousuario",nullable=false) //Pega o codigo da tabela Usuario
    @Size(min = 1, max = 9)
    @Column(name = "usuario", length = 9, nullable = false)
    private String usuario;
    
    @Size(min = 1, max = 8)
    @Column(name = "senha", length = 9, nullable = false)
    private String senha;
    
    public Cliente() {
        super();
    }

    public Cliente(String rua,Integer codigo, String nome, /*  String sobrenome,String sexo, String cpf, String rg,*/ String datanasc, String telefone, String email,/* String endereco, */ String numero, String bairro, String complemento, String cidade, String estado, String cep, String usuario, String senha) {
        this.rua = rua;
        this.codigo = codigo;
        this.nome = nome;
        //this.sobrenome = sobrenome;
       // this.sexo = sexo;
       // this.cpf = cpf;
      //  this.rg = rg;
        this.datanasc = datanasc;
        this.telefone = telefone;
        this.email = email;
       // this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

   // public String getSobrenome() {
  //      return sobrenome;
  //  }

  //  public void setSobrenome(String sobrenome) {
  //      this.sobrenome = sobrenome;
  //  }

   // public String getSexo() {
   //     return sexo;
  //  }

  //  public void setSexo(String sexo) {
  //      this.sexo = sexo;
  //  }

   // public String getCpf() {
   //     return cpf;
  //  }

   // public void setCpf(String cpf) {
   //     this.cpf = cpf;
   // }

   // public String getRg() {
 //       return rg;
   // }

   // public void setRg(String rg) {
   //     this.rg = rg;
   // }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   // public String getEndereco() {
  //      return endereco;
   // }

   // public void setEndereco(String endereco) {
  //      this.endereco = endereco;
   // }

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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    
    
    
    
}
