/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.tads4.ProjetoIntegradorIV.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

/**
 *
 * @author magno
 */
@Entity(name = "Forma_Pagamento")
public class FormaPagamento implements Serializable{
    
    @Id
    @Column(name = "codigo", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @AssertTrue
    @Column(name = "cartaocredito", nullable=false)
    private boolean cartaocredito;
    
    @AssertTrue
    @Column(name = "paypal", nullable=false)
    private boolean paypal;
    
    @Size(min = 1, max = 30)
    @Column(name = "numerocartao", length = 30)
    private String numerocartao;
    
    @Size(min = 1, max = 20)
    @Column(name = "nomecartao", length = 20)
    private String nomecartao;
    
    @Size(min = 1, max = 3)
    @Column(name = "codigoseguranca", length = 3)
    private String codigoseguranca;
    
    @Size(min = 1, max = 30)
    @Column(name = "usuariopay", length = 30)
    private String usuariopay;
    
    @Size(min = 1, max = 30)
    @Column(name = "senhapay", length = 30)
    private String senhapay;

    public FormaPagamento(Integer codigo, boolean cartaocredito, boolean paypal, String numerocartao, String nomecartao, String codigoseguranca, String usuariopay, String senhapay) {
        this.codigo = codigo;
        this.cartaocredito = cartaocredito;
        this.paypal = paypal;
        this.numerocartao = numerocartao;
        this.nomecartao = nomecartao;
        this.codigoseguranca = codigoseguranca;
        this.usuariopay = usuariopay;
        this.senhapay = senhapay;
    }

    public FormaPagamento() {
        super();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public boolean isCartaocredito() {
        return cartaocredito;
    }

    public void setCartaocredito(boolean cartaocredito) {
        this.cartaocredito = cartaocredito;
    }

    public boolean isPaypal() {
        return paypal;
    }

    public void setPaypal(boolean paypal) {
        this.paypal = paypal;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getNomecartao() {
        return nomecartao;
    }

    public void setNomecartao(String nomecartao) {
        this.nomecartao = nomecartao;
    }

    public String getCodigoseguranca() {
        return codigoseguranca;
    }

    public void setCodigoseguranca(String codigoseguranca) {
        this.codigoseguranca = codigoseguranca;
    }

    public String getUsuariopay() {
        return usuariopay;
    }

    public void setUsuariopay(String usuariopay) {
        this.usuariopay = usuariopay;
    }

    public String getSenhapay() {
        return senhapay;
    }

    public void setSenhapay(String senhapay) {
        this.senhapay = senhapay;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "codigo=" + codigo + ", cartaocredito=" + cartaocredito + ", paypal=" + paypal + ", numerocartao=" + numerocartao + ", nomecartao=" + nomecartao + ", codigoseguranca=" + codigoseguranca + ", usuariopay=" + usuariopay + ", senhapay=" + senhapay + '}';
    }
    
}
