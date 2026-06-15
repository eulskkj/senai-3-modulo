package com.example.atividade.controle;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.atividade.modelo.Produto;
import com.example.atividade.repositorio.Repositorio;

import java.util.List;


@RestController
public class Controle {

private final Repositorio acao;

public Controle (Repositorio acao) {
        this.acao = acao;
    }

        @PostMapping("/api")
        public Produto cadastrar(@RequestBody Produto obj ) {
            return acao.save(obj);
        }

        @GetMapping("/api")
        public List<Produto> selecionar() {
            return acao.findAll();
        }

        @GetMapping("/api/{codigo}")
        public Produto selecionarPeloCodigo(@PathVariable Integer codigo) {
            return acao.findByCodigo(codigo);
        }

        @PutMapping("/api") 
        public Produto editar (@RequestBody Produto obj){
            return acao.save(obj);
        } 

        @DeleteMapping("/api/{codigo}") 
        public void remover(@PathVariable Integer codigo){
            Produto obj = selecionarPeloCodigo(codigo);
            acao.delete(obj);
        }

        @GetMapping("") 
        public String mensagem() {
            return "API funcionando";
        }

        @GetMapping("/boasVindas")
        public String boasVindas(@PathVariable String nome) {
            return "Bem-vindo, " + nome + "!";
        }

        @PostMapping("/produtos")
        public Produto produto(@RequestBody Produto p) {
            return p;
        }
        }              

