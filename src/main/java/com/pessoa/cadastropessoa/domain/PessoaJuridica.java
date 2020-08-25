package com.pessoa.cadastropessoa.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

/**
 * Classe entidade que representa a tabela 'PESSOA_JURIDICA'
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Entity
public class PessoaJuridica extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	private String nomeFantasia;
	private String cpnj;
	private Date dataFundacao;
	
	public PessoaJuridica(String nome) {
		this.setNome(nome);
	}
		
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
}
