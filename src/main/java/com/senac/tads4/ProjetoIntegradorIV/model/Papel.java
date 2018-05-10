/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author fernando.tsuda
 */
public class Papel implements GrantedAuthority {

  private String nome;

  public Papel() {
  }

  public Papel(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String getAuthority() {
    return nome;
  }
}
