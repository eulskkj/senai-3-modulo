package com.mycompany.projeto.usuarios;

import java.sql.Timestamp;

public class Usuario {

    private int id;
    private String login;
    private String senha;
    private Timestamp criadoEm;

    public Usuario() {}

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(int id, String login, String senha, Timestamp criadoEm) {
        this.id       = id;
        this.login    = login;
        this.senha    = senha;
        this.criadoEm = criadoEm;
    }

    // Getters e Setters
    public int getId()                  { return id; }
    public void setId(int id)           { this.id = id; }

    public String getLogin()            { return login; }
    public void setLogin(String login)  { this.login = login; }

    public String getSenha()            { return senha; }
    public void setSenha(String senha)  { this.senha = senha; }

    public Timestamp getCriadoEm()               { return criadoEm; }
    public void setCriadoEm(Timestamp criadoEm)  { this.criadoEm = criadoEm; }

    @Override
    public String toString() { return login; }
}