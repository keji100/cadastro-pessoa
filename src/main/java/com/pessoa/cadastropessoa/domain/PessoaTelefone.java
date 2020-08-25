package com.pessoa.cadastropessoa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe entidade que representa a tabela 'PESSOA_TELEFONE'
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Entity
public class PessoaTelefone implements Serializable {

	@Id
	@Column(name = "cd_telefone")
	private Long oid;
	private Long codigoPais;
	private Long ddd;
	private Long numero;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_pessoa")
	private Pessoa pessoa;
	
	public Long getOid() {
		return oid;
	}
	
	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public Long getCodigoPais() {
		return codigoPais;
	}
	
	public void setCodigoPais(Long codigoPais) {
		this.codigoPais = codigoPais;
	}
	
	public Long getDdd() {
		return ddd;
	}
	
	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
}
