/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.service;

import com.senac.tads4.ProjetoIntegradorIV.model.Cliente;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Pedro Lucas
 */
public interface ICliente extends Serializable{
    
    public List<Cliente> listar(int offset, int quantidade);

  public Cliente obter(long codigocCliente);

  public void incluir(Cliente cliente);

  public void alterar(Cliente cliente);

  public void remover(Integer codigoCliente);
}
