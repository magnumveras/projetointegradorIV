/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.controller;


import com.senac.tads4.ProjetoIntegradorIV.model.Categoria;
import com.senac.tads4.ProjetoIntegradorIV.model.Produto;
import com.senac.tads4.ProjetoIntegradorIV.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author magno.veras
 */
@Controller
@RequestMapping("/gerenciamento/produto")
public class GerenciadorProdutoController {
  
  @Autowired
  private ProdutoService service;
  
  
  @GetMapping("/formulario")
  public ModelAndView mostrarFormulario() {
    return new ModelAndView("/produto/cadastro_produto")
            .addObject("produto", new Produto());    
  }
  
  @PostMapping("/salvar")
  public ModelAndView salvar(@ModelAttribute("produto") @Valid Produto produto,
          RedirectAttributes redirectAttributes) {
    // @ModelAttribute - indica para o Spring que as informacoes preenchidas
    // no form HTML serao populadas no objeto produto
    // @Valid - indica que o objeto serÃ¡ validado de acordo com as configuraÃ§Ãµes
    // feitas na classe Produto
    //if (bindingResult.hasErrors()) {
      //return new ModelAndView("produto/cadastro_produto");
    //}
    produto.setDatacadastro(new Date());
    Set<Produto> listaProdutos =  new LinkedHashSet<>();
    listaProdutos.add(produto);
    
    String teste = listaProdutos.toString();
    
    produto.setCategoria(produto.getCategoria());

    //produto.setImagens(produto.getImagens());
    
      System.out.println(produto);
    
    if (produto.getCodigo()== null) {
      service.incluir(produto);
    } else {
      service.alterar(produto);
    }
    
    redirectAttributes.addFlashAttribute("produtoCadastrado", produto);
    return new ModelAndView("redirect:/gerenciamento/produto/resultado");
  }
  
  @GetMapping("/resultado")
  public ModelAndView mostrarResultado() {
    return new ModelAndView("produto/resultado");
  }
  
  /*@GetMapping("/formulario/{id}")
  public ModelAndView mostrarFormularioAlteracao(
          @PathVariable("id") Long id) {
    Produto prodAlteracao = service.obter(id);
    Set<Integer> idsCategorias = new LinkedHashSet<>();
    if (prodAlteracao.getCategorias() != null && !prodAlteracao.getCategorias().isEmpty()) {
      for (Categoria c : prodAlteracao.getCategorias()) {
        idsCategorias.add(c.getId());
      }
      prodAlteracao.setIdsCategorias(idsCategorias);
    }
    return new ModelAndView("/produto/formulario")
            .addObject("produto", prodAlteracao)
            .addObject("categorias", categoriaService.listar());
  }
  
  @GetMapping("/excluir/{id}")
  public ModelAndView apagarProduto(
          @PathVariable("id") Long id) {
    service.remover(id);
    return new ModelAndView("redirect:/gerenciamento/produto/formulario");
  }
  
  @PostMapping("/salvar")
  public ModelAndView salvar(@ModelAttribute("produto") @Valid Produto produto,
          BindingResult bindingResult,
          RedirectAttributes redirectAttributes) {
    // @ModelAttribute - indica para o Spring que as informacoes preenchidas
    // no form HTML serao populadas no objeto produto
    // @Valid - indica que o objeto serÃ¡ validado de acordo com as configuraÃ§Ãµes
    // feitas na classe Produto
    if (bindingResult.hasErrors()) {
      return new ModelAndView("/produto/formulario");
    }
    produto.setDtCadastro(new Date());
    Set<Produto> listaProdutos =  new LinkedHashSet<>();
    listaProdutos.add(produto);
    
    Set<Categoria> listaCategorias = new LinkedHashSet<>();
    
    if (produto.getIdsCategorias() != null && !produto.getIdsCategorias().isEmpty()) {
      for (Integer id : produto.getIdsCategorias()) {
        Categoria c = categoriaService.obter(id);
        c.setProdutos(listaProdutos);
        listaCategorias.add(c);
      }
    }
    produto.setCategorias(listaCategorias);
    
    Set<ImagemProduto> listaImagens = new LinkedHashSet<>();
    ImagemProduto img1 = new ImagemProduto("bolo01.jpg", "DescriÃ§Ã£o 1");
    img1.setProduto(produto);
    listaImagens.add(img1);
    
    ImagemProduto img2 = new ImagemProduto("bolo02.jpg", "DescriÃ§Ã£o 2");
    img2.setProduto(produto);
    listaImagens.add(img2);
    
    ImagemProduto img3 = new ImagemProduto("bolo03.jpg", "DescriÃ§Ã£o 3");
    img3.setProduto(produto);
    listaImagens.add(img3);

    produto.setImagens(listaImagens);
    
    if (produto.getId() == null) {
      service.incluir(produto);
    } else {
      service.alterar(produto);
    }
    
    redirectAttributes.addFlashAttribute("produtoCadastrado", produto);
    return new ModelAndView("redirect:/gerenciamento/produto/resultado");
  }
  
  @GetMapping("/resultado")
  public ModelAndView mostrarResultado() {
    return new ModelAndView("/produto/resultado");
  }
    */
}
