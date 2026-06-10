package com.example.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import com.example.api.modelo.Pessoa;

public interface Repositorio extends
CrudRepository<Pessoa, Integer> {
    
}
