package br.com.exemplo.api.controle;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.exemplo.api.modelo.Pessoa;
import br.com.exemplo.api.repositorio.Repositorio;

@RestController
public class Controle {


private final Repositorio acao;

public Controle(Repositorio acao) {
    this.acao = acao;
}

    @PostMapping("/api")
   public Pessoa cadastrar(@RequestBody Pessoa obj){
    return acao.save(obj);
   }
   @GetMapping("/api")
   public List<Pessoa> selecionar(){
    return acao.findAll();
   }
   
   @GetMapping("/api/{codigo}")
   public Pessoa selecionarPeloCodigo(@PathVariable Integer codigo){
    return acao.findByCodigo(codigo);
   }

   @PutMapping("/api")
   public Pessoa editar(@RequestBody Pessoa obj){
    return acao.save(obj);
   }

   @DeleteMapping("/api/{codigo}")
   public void remover(@PathVariable Integer codigo){
    Pessoa obj = selecionarPeloCodigo(codigo);
    acao.delete(obj);
   }

    @GetMapping("")
    public String mensagem(){
        return "olá, mundo!";
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "seja bem vindo(a)";
    }
    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "seja bem vindo(a)  "+ nome;
    }
    
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
    }

}
