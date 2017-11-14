package br.com.algamoney.api.service.facade;

import java.util.Optional;

import br.com.algamoney.api.model.Lancamento;

public interface LancamentoServiceFacade extends CrudBasicService<Lancamento>{
	
	public Optional<Lancamento> buscarLancamento(Long codigo);
	
	public void removerLancamentoPorIdentificador(Long codigo);
	
}
