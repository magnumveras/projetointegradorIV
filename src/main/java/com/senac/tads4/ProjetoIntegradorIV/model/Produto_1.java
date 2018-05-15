/*
 * The MIT License
 *
 * Copyright 2018 fernando.tsuda.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ProdutoOld")
public class Produto_1 implements Serializable {

    @Id
    @Column(name = "Codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Size(min = 1, max = 70)
    @Column(name = "nome", length = 70, nullable = false)
    private String nome;

    @Size(min = 1, max = 1000)
    @Column(name = "descricao", length = 1000)
    private String descricao;

    @Digits(integer = 8, fraction = 2)
    @Column(name = "precocompra", precision = 8,
            scale = 2, nullable = false)
    private BigDecimal precoCompra;

    @Digits(integer = 8, fraction = 2)
    @Column(name = "precovenda", precision = 8,
            scale = 2, nullable = false)
    private BigDecimal precoVenda;

    @Column(name = "estoque", precision = 6,
            scale = 0, nullable = false)
    private Integer estoque;

    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "codigofornecedor",nullable=false) //Pega o codigo da tabela Fornecedor
    //private Fornecedor fornecedor;

    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "codigocategoria",nullable=false) //Pega o codigo da tabela Categoria
    //private Categoria categoria;

    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "codigoimagem",nullable=false) //Pega o codigo da tabela Imagem
    //private Imagem Imagem;

    public Produto_1(){
        super();
    }
    
    /*public Produto_1(Integer codigo, String nome, String descricao, BigDecimal precoCompra, BigDecimal precoVenda, Integer estoque, Fornecedor fornecedor, Categoria categoria, Imagem Imagem) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
        //this.fornecedor = fornecedor;
        //this.categoria = categoria;
        //this.Imagem = Imagem;
    }*/

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    //public Fornecedor getFornecedor() {
        //return fornecedor;
    //}

    //public void setFornecedor(Fornecedor fornecedor) {
        //this.fornecedor = fornecedor;
    //}

    //public Categoria getCategoria() {
        //return categoria;
    //}

    //public void setCategoria(Categoria categoria) {
        //this.categoria = categoria;
    //}

    //public Imagem getImagem() {
        //return Imagem;
    //}

    //public void setImagem(Imagem Imagem) {
        //this.Imagem = Imagem;
    //}

    //@Override
    //public String toString() {
        //return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", precoCompra=" + precoCompra + ", precoVenda=" + precoVenda + ", estoque=" + estoque + ", fornecedor=" + fornecedor + ", categoria=" + categoria + ", Imagem=" + Imagem + '}';
    //}


}
