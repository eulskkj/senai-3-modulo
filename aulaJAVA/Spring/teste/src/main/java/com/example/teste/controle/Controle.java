package com.example.teste.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.teste.repositorio.Repositorio;
import com.example.teste.modelo.Pessoa;


@RestController
public class Controle {

    private final Repositorio acao;
    
    public Controle(Repositorio acao) {
        this.acao = acao;
    }
    
    @PostMapping("/api")
    public Pessoa cadastrar(@RequestBody Pessoa obj) {
        return acao.save(obj);
    }

    @GetMapping("")
    public String mensagem() {
        return "Olá";
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Bem-vindo à minha API!";
    }

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Bem-vindo à minha API!" + nome;
    }

    @PostMapping("/pessoa")
    public Pessoa pessoa (@RequestBody Pessoa p) {
        return p;
    }
}
