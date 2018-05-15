/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.dao;


import com.senac.tads4.ProjetoIntegradorIV.model.Cliente;
import com.senac.tads4.ProjetoIntegradorIV.service.ICliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pedro Lucas
 */
@Repository
public class ClienteServiceJpaImpl implements ICliente{
    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    @Transactional
    public void remover(Integer codigoCliente) {
    Cliente cliente = entityManager.find(Cliente.class, codigoCliente);
        entityManager.remove(cliente);
    }

    @Override
    public List<Cliente> listar(int offset, int quantidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente obter(long codigocCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void incluir(Cliente cliente) {
        entityManager.persist(cliente);
    }

    
    @Override
    public void alterar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


