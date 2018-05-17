package com.senac.tads4.ProjetoIntegradorIV.controller;

import com.senac.tads4.ProjetoIntegradorIV.model.Produto;
import com.senac.tads4.ProjetoIntegradorIV.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/musicstore")
public class ProdutoController {
    
  @Autowired
  private ProdutoService servico;
    
  //Retorna a lista de todos os produtos da empresa
  @GetMapping
  public ModelAndView listar() {
    List<Produto> produtos = servico.listar();
    System.out.println(produtos);
    return new ModelAndView("index").addObject("produtos", produtos);
  }
    
    
}
