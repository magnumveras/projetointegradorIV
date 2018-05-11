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
@Entity(name = "Usuario")
public class Usuario implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Size(min = 1, max = 30)
    @Column(name = "nome", length = 30, nullable=false)
    private String nome;
        
    @Size(min = 1, max = 20)
    @Column(name = "login", length = 20, unique = true, nullable=false)
    private String login;
    
    @Size(min = 1, max = 20)
    @Column(name = "senha", length = 20, nullable=false)
    private String senha;
   
    @ManyToOne
    @JoinColumn(name = "codigoperfil",nullable=false) //Pega o codigo da tabela perfil
    private Perfil perfil;

    public Usuario() {
        super();
    }
    
    
    public Usuario(Integer codigo, String nome, String login, String senha, Perfil perfil) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", perfil=" + perfil + '}';
    }
    
    
    
}
