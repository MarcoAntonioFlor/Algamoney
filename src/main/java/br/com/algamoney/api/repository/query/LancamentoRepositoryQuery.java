package br.com.algamoney.api.repository.query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.algamoney.api.dto.LancamentoFilterDTO;
import br.com.algamoney.api.model.Lancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilterDTO lancamentoFilter, Pageable pageable);
}
