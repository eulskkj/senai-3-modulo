package br.com.exemplo.api.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;


import br.com.exemplo.api.modelo.Pessoa;




public interface Repositorio extends JpaRepository<Pessoa, Integer> {

    
   
    Pessoa findByCodigo(Integer codigo);
}
