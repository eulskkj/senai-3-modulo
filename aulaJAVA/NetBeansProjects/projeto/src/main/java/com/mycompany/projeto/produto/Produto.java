/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.produto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Produto {

    private int id;
    private String nome;
    private int quantidade;
    private BigDecimal preco;
    private int usuarioId;
    private String usuarioLogin;   
    private int categoriaId;
    private String categoriaNome;  
    private Timestamp criadoEm;

    public Produto() {}

    public Produto(String nome, int quantidade, BigDecimal preco,
                   int usuarioId, int categoriaId) {
        this.nome        = nome;
        this.quantidade  = quantidade;
        this.preco       = preco;
        this.usuarioId   = usuarioId;
        this.categoriaId = categoriaId;
    }

    // --- Getters e Setters ---
    public int getId()                    { return id; }
    public void setId(int id)             { this.id = id; }

    public String getNome()               { return nome; }
    public void setNome(String nome)      { this.nome = nome; }

    public int getQuantidade()            { return quantidade; }
    public void setQuantidade(int q)      { this.quantidade = q; }

    public BigDecimal getPreco()          { return preco; }
    public void setPreco(BigDecimal p)    { this.preco = p; }

    public int getUsuarioId()             { return usuarioId; }
    public void setUsuarioId(int uid)     { this.usuarioId = uid; }

    public String getUsuarioLogin()       { return usuarioLogin; }
    public void setUsuarioLogin(String l) { this.usuarioLogin = l; }

    public int getCategoriaId()           { return categoriaId; }
    public void setCategoriaId(int cid)   { this.categoriaId = cid; }

    public String getCategoriaNome()       { return categoriaNome; }
    public void setCategoriaNome(String n) { this.categoriaNome = n; }

    public Timestamp getCriadoEm()               { return criadoEm; }
    public void setCriadoEm(Timestamp criadoEm)  { this.criadoEm = criadoEm; }

    @Override
    public String toString() { return nome; }
}
