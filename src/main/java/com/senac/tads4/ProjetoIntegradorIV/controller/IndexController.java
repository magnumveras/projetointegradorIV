/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author magno
 */

/*Projeto adequado com Spring MVC */
@Controller
@RequestMapping("/musicstore")
public class IndexController {
    
  @GetMapping("/home")
  public ModelAndView executar1() {
    return new ModelAndView("index");
  }
  
  @GetMapping("/detalhesproduto")
  public ModelAndView cadastroproduto() {
    return new ModelAndView("cadastro_produto");
  }
   
  
  @GetMapping("/faleconosco")
  public ModelAndView faleconosco() {
    return new ModelAndView("fale_conosco");
  }
  
   @GetMapping("/carrinho")
  public ModelAndView carrinho() {
    return new ModelAndView("carrinho_produtos");
  }
  
}
