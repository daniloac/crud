package com.crud.demo.repository;

import com.crud.demo.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

    List<Autor> findAll();

    Autor findByCodigo(Integer codigo);

    @Transactional
    void deleteAutorByCodigo(Integer codigo);
}
