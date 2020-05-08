package br.pro.bruno.drogaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.bruno.drogaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	

}
