/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.movimentacao;

import java.sql.Timestamp;

public class Movimentacao {

    public enum Tipo { ENTRADA, SAIDA }

    private int id;
    private int produtoId;
    private String produtoNome;   // para exibição
    private int usuarioId;
    private String usuarioLogin;  // para exibição
    private Tipo tipo;
    private int quantidade;
    private String observacao;
    private Timestamp data;

    public Movimentacao() {}

    public Movimentacao(int produtoId, int usuarioId, Tipo tipo,
                        int quantidade, String observacao) {
        this.produtoId  = produtoId;
        this.usuarioId  = usuarioId;
        this.tipo       = tipo;
        this.quantidade = quantidade;
        this.observacao = observacao;
    }

    public int getId()                      { return id; }
    public void setId(int id)               { this.id = id; }

    public int getProdutoId()               { return produtoId; }
    public void setProdutoId(int pid)       { this.produtoId = pid; }

    public String getProdutoNome()          { return produtoNome; }
    public void setProdutoNome(String n)    { this.produtoNome = n; }

    public int getUsuarioId()               { return usuarioId; }
    public void setUsuarioId(int uid)       { this.usuarioId = uid; }

    public String getUsuarioLogin()         { return usuarioLogin; }
    public void setUsuarioLogin(String l)   { this.usuarioLogin = l; }

    public Tipo getTipo()                   { return tipo; }
    public void setTipo(Tipo tipo)          { this.tipo = tipo; }

    public int getQuantidade()              { return quantidade; }
    public void setQuantidade(int q)        { this.quantidade = q; }

    public String getObservacao()           { return observacao; }
    public void setObservacao(String obs)   { this.observacao = obs; }

    public Timestamp getData()              { return data; }
    public void setData(Timestamp data)     { this.data = data; }
}