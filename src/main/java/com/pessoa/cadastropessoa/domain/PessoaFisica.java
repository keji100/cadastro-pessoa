package com.pessoa.cadastropessoa.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Classe entidade que representa a tabela 'PESSOA_FISICA'
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Entity
public class PessoaFisica extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	private String apelido;
	
	private String cpf;
	
	@OneToOne(mappedBy = "pessoaFisica", cascade = CascadeType.ALL)
	private PessoaProfissao profissao;
	
	@OneToMany(mappedBy="pessoaFisica")
	private List<Dependente> depedentes;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataNascimento;
	
	public PessoaFisica(String nome) {
		this.setNome(nome);
	}

	public PessoaFisica(String apelido, PessoaProfissao profissao, List<Dependente> depedentes, Date dataNascimento) {
		this.apelido = apelido;
		this.profissao = profissao;
		this.depedentes = depedentes;
		this.dataNascimento = dataNascimento;
	}

	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
		
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaProfissao getProfissao() {
		return profissao;
	}
	
	public void setProfissao(PessoaProfissao profissao) {
		this.profissao = profissao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Dependente> getDepedentes() {
		return depedentes;
	}

	public void setDepedentes(List<Dependente> depedentes) {
		this.depedentes = depedentes;
	}
	
}
