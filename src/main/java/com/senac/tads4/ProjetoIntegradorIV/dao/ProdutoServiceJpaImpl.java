/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.dao;

import com.senac.tads4.ProjetoIntegradorIV.model.Categoria;
import com.senac.tads4.ProjetoIntegradorIV.model.Produto;
import com.senac.tads4.ProjetoIntegradorIV.service.ProdutoService;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import static org.springframework.jdbc.core.JdbcOperationsExtensionsKt.query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author magno
 */
@Repository
public class ProdutoServiceJpaImpl implements ProdutoService{
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Produto> listar() {
        Query query = entityManager.createQuery(
            "SELECT DISTINCT p FROM Produto p "
            + "LEFT JOIN FETCH p.fornecedor "
            + "LEFT JOIN FETCH p.categoria");
    List<Produto> resultados = query.getResultList();
        System.out.println(resultados);
    return resultados;
    }
    
    @Override
    public List<Produto> listarPorCategoria(Categoria categoria, int offset, int quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto obter(long idProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void incluir(Produto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(Produto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(long idProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
