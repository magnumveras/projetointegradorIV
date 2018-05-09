
package com.senac.tads4.ProjetoIntegradorIV.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

  @Id
  @Column(name = "ID_PRODUTO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(min = 1, max = 100, message = "{produto.nome.erro}")
  @Column(name = "NM_PRODUTO", length = 100, nullable = false)
  private String nome;

  @Size(min = 1, max = 1000)
  @Column(name = "DS_PRODUTO", length = 1000)
  private String descricao;

  @Digits(integer = 6, fraction = 2)
  @Column(name = "VL_COMPRA", precision = 6,
          scale = 2, nullable = false)
  private BigDecimal precoCompra;

  @Digits(integer = 6, fraction = 2)
  @Column(name = "VL_VENDA", precision = 6,
          scale = 2, nullable = false)
  private BigDecimal precoVenda;

  @Column(name = "QT_PRODUTO", precision = 6,
          scale = 0, nullable = false)
  private int quantidade;

  @Column(name = "DT_CADASTRO", nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  private Date dtCadastro;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "TB_PRODUTO_CATEGORIA",
          joinColumns = {
            @JoinColumn(name = "ID_PRODUTO")
          },
          inverseJoinColumns = {
            @JoinColumn(name = "ID_CATEGORIA")
          })
  private Set<Categoria> categorias;

  @OneToMany(mappedBy = "produto", fetch = FetchType.LAZY,
          cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  private Set<ImagemProduto> imagens;

  @Transient
  private Set<Integer> idsCategorias;

  @Transient
  private String observacoes;

  public Produto() {

  }

  public Produto(Long id, String nome, String descricao, BigDecimal precoCompra, BigDecimal precoVenda, int quantidade, Date dtCadastro) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.precoCompra = precoCompra;
    this.precoVenda = precoVenda;
    this.quantidade = quantidade;
    this.dtCadastro = dtCadastro;
  }

  public Produto(Long id, String nome, String descricao, BigDecimal precoCompra, BigDecimal precoVenda, int quantidade, Date dtCadastro, Set<ImagemProduto> imagens, Set<Categoria> categorias) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.precoCompra = precoCompra;
    this.precoVenda = precoVenda;
    this.quantidade = quantidade;
    this.dtCadastro = dtCadastro;
    this.imagens = imagens;
    this.categorias = categorias;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome.trim();
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public BigDecimal getPrecoCompra() {
    return precoCompra;
  }

  public void setPrecoCompra(BigDecimal precoCompra) {
    this.precoCompra = precoCompra;
  }

  public BigDecimal getPrecoVenda() {
    return precoVenda;
  }

  public void setPrecoVenda(BigDecimal precoVenda) {
    this.precoVenda = precoVenda;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public Date getDtCadastro() {
    return dtCadastro;
  }

  public void setDtCadastro(Date dtCadastro) {
    this.dtCadastro = dtCadastro;
  }

  public Set<Categoria> getCategorias() {
    return categorias;
  }

  public void setCategorias(Set<Categoria> categorias) {
    this.categorias = categorias;
  }

  public Set<ImagemProduto> getImagens() {
    return imagens;
  }

  public void setImagens(Set<ImagemProduto> imagens) {
    this.imagens = imagens;
  }

  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public Set<Integer> getIdsCategorias() {
    return idsCategorias;
  }

  public void setIdsCategorias(Set<Integer> idsCategorias) {
    this.idsCategorias = idsCategorias;
  }

  @Override
  public String toString() {
    return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + ", quantidade=" + quantidade + ", dtCadastro=" + dtCadastro + ", categorias=" + categorias + ", imagens=" + imagens + ", idsCategorias=" + idsCategorias + ", observacoes=" + observacoes + '}';
  }

}
