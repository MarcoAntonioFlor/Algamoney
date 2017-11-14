package br.com.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoney.api.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
