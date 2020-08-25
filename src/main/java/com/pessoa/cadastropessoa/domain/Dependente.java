package com.pessoa.cadastropessoa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.pessoa.cadastropessoa.enumeration.TipoDependente;

/**
 * Classe entidade que representa a tabela 'DEPEDENTE'
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Entity
public class Dependente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_depedente")
	private Long oid;
	private String nome;
	@Enumerated(EnumType.STRING)
	private TipoDependente tipoDependente;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cd_pessoa", nullable = false)
	private PessoaFisica pessoaFisica;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipoDependente getTipoDependente() {
		return tipoDependente;
	}
	
	public void setTipoDependente(TipoDependente tipoDependente) {
		this.tipoDependente = tipoDependente;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
}
