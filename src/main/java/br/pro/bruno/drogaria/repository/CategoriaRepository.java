package br.pro.bruno.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.bruno.drogaria.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short>{

}
