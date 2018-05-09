

package com.senac.tads4.ProjetoIntegradorIV.model;

import org.springframework.security.core.GrantedAuthority;


public class Papel implements GrantedAuthority {
  
    private String nome;

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
       return this.nome;
    }
  
  
}
