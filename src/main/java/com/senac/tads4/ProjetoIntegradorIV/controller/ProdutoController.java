package com.senac.tads4.ProjetoIntegradorIV.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/musicstore")
public class ProdutoController {

    @GetMapping("/produto")
  public ModelAndView faleconosco() {
    return new ModelAndView("cadastro_produto");
  }
    
    
}
