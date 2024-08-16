
package com.senai.biblioadmin.repository;

import com.senai.biblioadmin.entity.Emprestimo;
import com.senai.biblioadmin.entity.Estudante;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante,Long> {
    
    Optional<Estudante> findByEmail(String email);
    Optional<Estudante> findByMatricula(Long matricula);
    List<Estudante> findByNome(String nome);
    Page<Estudante> findAll(Pageable pagina);

    void deleteByMatricula(Long matricula);
    
}

