package br.com.algamoney.api.service.facade;

import java.util.Optional;

import br.com.algamoney.api.model.Categoria;

public interface CategoriaServiceFacade extends CrudBasicService<Categoria>{
	
	/**
	 * Busca objeto por indentificador
	 * @param id
	 * @return
	 */
	Optional<Categoria> buscaPorIdentificador(final Long identificador);
	
	
	void remover(Long identificador);
}

