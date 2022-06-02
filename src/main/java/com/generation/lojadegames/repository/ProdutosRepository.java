package com.generation.lojadegames.repository;

import java.util.List;

import com.generation.lojadegames.model.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

public List <Produtos> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
