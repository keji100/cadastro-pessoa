package com.pessoa.cadastropessoa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Classe entidade que representa a tabela 'PESSOA'
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Entity
@Inheritance(strategy =  InheritanceType.JOINED)
public abstract class Pessoa implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_pessoa")
	private Long oid;
	private String nome;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	private List<PessoaEndereco> enderecos;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pessoa")
	private List<PessoaTelefone> telefones;
	
	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public Long getOid() {
		return oid;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<PessoaEndereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<PessoaEndereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<PessoaTelefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<PessoaTelefone> telefones) {
		this.telefones = telefones;
	}
	
}
