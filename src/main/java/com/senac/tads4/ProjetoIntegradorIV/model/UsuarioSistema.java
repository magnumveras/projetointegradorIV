/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.util.Set;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Pedro Lucas
 */
public class UsuarioSistema implements UserDetails{
    
    private String userName;
    private String nomeCompleto;
    private String senha;
    
   private Set<Papel> papeis; 
  @Override
    public Set<Papel> /*Collection<? extends GrantedAuthority>*/ getAuthorities() {
        
        return papeis;
        }

    @Override
    public String getPassword() {
       //retornar a senha digitada pelo usuario
    return this.senha;
       
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccountNonLocked() {
        //mostra se esta trancado
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        //metodo usado para saber se é uma conta valida, ex na regra de negocio o usuario deve ter acesso nos ultimo 30 dias
        return true;
        }

    @Override
    public boolean isEnabled() {
        //metodos que mostra se esta ativo ou não
        return true;
    }
      
}
