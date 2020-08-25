package com.pessoa.cadastropessoa.dto;

import java.io.Serializable;

import com.pessoa.cadastropessoa.domain.Dependente;
import com.pessoa.cadastropessoa.enumeration.TipoDependente;

/**
 * Classe de transporte de dados da entidade {@link Dependente}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
public class DependenteDTO implements Serializable {

	private String nome;
	private TipoDependente tipoDependente;
	
	public DependenteDTO(String nome, TipoDependente tipoDependente) {
		this.nome = nome;
		this.tipoDependente = tipoDependente;
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
	
}
