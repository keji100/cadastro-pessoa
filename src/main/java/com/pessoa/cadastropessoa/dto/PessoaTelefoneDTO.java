package com.pessoa.cadastropessoa.dto;

import java.io.Serializable;

import com.pessoa.cadastropessoa.domain.PessoaTelefone;

/**
 * Classe de transporte de dados da entidade {@link PessoaTelefone}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
public class PessoaTelefoneDTO implements Serializable {

	private Long codigoPais;
	private Long ddd;
	private Long numero;
	
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
