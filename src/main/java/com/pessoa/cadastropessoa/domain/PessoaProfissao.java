package com.pessoa.cadastropessoa.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 * Classe entidade que representa a tabela 'PROFISSAO'
 * @author Willian Rosa (williankeji05@gmail.com)	
 */
@Entity
public class PessoaProfissao implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long oid;
	private String profissao;
	private BigDecimal salario;
	
	@OneToOne
    @MapsId
	private Pessoa pessoaFisica;
	
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getProfissao() {
		return profissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Pessoa getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(Pessoa pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
}
