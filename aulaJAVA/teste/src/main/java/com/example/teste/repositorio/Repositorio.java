package com.example.teste.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.example.teste.modelo.Pessoa;

public interface Repositorio extends
CrudRepository<Pessoa, Integer> {
    
}
