/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.controller;

import com.senac.tads4.ProjetoIntegradorIV.dao.ClienteServiceJpaImpl;
import com.senac.tads4.ProjetoIntegradorIV.model.Cliente;
import com.senac.tads4.ProjetoIntegradorIV.service.ICliente;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Pedro Lucas
 */

@Controller
@RequestMapping("/musicstore")
public class ClienteController {
    
  @Autowired
  public ICliente servicoCliente;     
  
  @GetMapping("/cadastrocliente")
  public ModelAndView cadastrousuario() {
    return new ModelAndView("cadastro_cliente").addObject("cliente", new Cliente());
  }
  
  @GetMapping("/cadastroclienteconsultar")  
  public ModelAndView cadastrousuarioconsultar() {
     List<Cliente> clienteConsultar = servicoCliente.listar();
     
     System.out.println("TESTE CLIENTE CONSULTAR: "+clienteConsultar);
      return new ModelAndView("cadastro_cliente_consultar").addObject("clienteConsultar", clienteConsultar);
  }
  
  @PostMapping("/salvar")
  public ModelAndView salvar(@ModelAttribute("cliente") @Valid Cliente cliente ,
          BindingResult bindingResult,
          RedirectAttributes redirectAttributes) {
    // @ModelAttribute - indica para o Spring que as informacoes preenchidas
    // no form HTML serao populadas no objeto produto
    // @Valid - indica que o objeto será validado de acordo com as configurações
    // feitas na classe Produto
   
    
    //if (bindingResult.hasErrors()) {
      //return new ModelAndView("/produto/formulario");
    //}     
   
    if (cliente.getCodigo() == null) {
      servicoCliente.incluir(cliente);
    } else {
    servicoCliente.alterar(cliente);
    }
   
    redirectAttributes.addFlashAttribute("clienteCadastrar", cliente);
    return new ModelAndView("redirect:/musicstore/home");
  }
 @GetMapping("/resultado")
  public ModelAndView mostrarResultado() {
    return new ModelAndView("/index");
  }
    
}
