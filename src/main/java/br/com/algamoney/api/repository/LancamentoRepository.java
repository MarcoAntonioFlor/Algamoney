package br.com.algamoney.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoney.api.model.Lancamento;
import br.com.algamoney.api.repository.query.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{
	
	Optional<Lancamento> findByCodigo(Long codigo);
}
