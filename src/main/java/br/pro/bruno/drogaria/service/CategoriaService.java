package br.pro.bruno.drogaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.pro.bruno.drogaria.domain.Categoria;
import br.pro.bruno.drogaria.exception.RecursoNaoEncontradoException;
import br.pro.bruno.drogaria.repository.CategoriaRepository;

@Service
public class CategoriaService {
   @Autowired
   private CategoriaRepository categoriaRepository;
   
   public Categoria buscarPorCodigo(Short codigo) {
	   Optional<Categoria> resultado = categoriaRepository.findById(codigo);
	     
	     if(resultado.isPresent()) {
	    	throw new RecursoNaoEncontradoException();
	     }
	     
		 Categoria categoria = resultado.get();
		 return categoria;
   }
   
   public List<Categoria> listar() {
	  List<Categoria> resultado = categoriaRepository.findAll();
	   return resultado;
   }
}
