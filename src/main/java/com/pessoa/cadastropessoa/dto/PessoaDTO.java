package com.pessoa.cadastropessoa.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.pessoa.cadastropessoa.domain.Pessoa;
import com.pessoa.cadastropessoa.enumeration.TipoPessoa;

/**
 * Classe de transporte de dados da entidade {@link Pessoa}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
public class PessoaDTO implements Serializable {
	
	//Entrada  
	private TipoPessoa tipoPessoa;
	private String numeroIdentificacao; //CPNJ / CPF
	private String nomePrincipal;
	private String nomeSecudario; //Apelido / Razao Social 
	private List<PessoaEnderecoDTO> enderecos;
	private List<PessoaTelefoneDTO> telefones;
	private String nomeProfissao;
	private String salario;
	private List<DependenteDTO> depedentes;
	private Date dataNascimento;
	
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	
	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}
	
	public String getNomePrincipal() {
		return nomePrincipal;
	}
	
	public void setNomePrincipal(String nomePrincipal) {
		this.nomePrincipal = nomePrincipal;
	}
	
	public String getNomeSecudario() {
		return nomeSecudario;
	}
	
	public void setNomeSecudario(String nomeSecudario) {
		this.nomeSecudario = nomeSecudario;
	}

	public List<PessoaEnderecoDTO> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<PessoaEnderecoDTO> enderecos) {
		this.enderecos = enderecos;
	}

	public List<PessoaTelefoneDTO> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<PessoaTelefoneDTO> telefones) {
		this.telefones = telefones;
	}

	public String getNomeProfissao() {
		return nomeProfissao;
	}

	public void setNomeProfissao(String nomeProfissao) {
		this.nomeProfissao = nomeProfissao;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public List<DependenteDTO> getDepedentes() {
		return depedentes;
	}

	public void setDepedentes(List<DependenteDTO> depedentes) {
		this.depedentes = depedentes;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
	
}
