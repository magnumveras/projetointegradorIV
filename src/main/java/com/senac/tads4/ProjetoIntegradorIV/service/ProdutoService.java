/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.service;

import com.senac.tads4.ProjetoIntegradorIV.model.Categoria;
import com.senac.tads4.ProjetoIntegradorIV.model.Produto;
import java.util.List;

/**
 *
 * @author magno
 */
public interface ProdutoService {
    
  public List<Produto> listar();

  public List<Produto> listarPorCategoria(Categoria categoria, int offset, int quantidade);

  public Produto obter(long idProduto);

  public void incluir(Produto p);

  public void alterar(Produto p);

  public void remover(long idProduto);
}
