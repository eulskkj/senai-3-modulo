package com.example.atividade.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.atividade.modelo.Produto;

public interface Repositorio extends JpaRepository<Produto, Integer> {
    Produto findByCodigo(Integer codigo);
} 
    
