package br.com.algamoney.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "permissao")
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Permissao implements Serializable{

	private static final long serialVersionUID = 4349196626485438578L;
	@Id
	private Long codigo;
	private String descricao;
}
