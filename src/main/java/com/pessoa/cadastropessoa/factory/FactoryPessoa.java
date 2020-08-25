package com.pessoa.cadastropessoa.factory;

import com.pessoa.cadastropessoa.domain.Pessoa;
import com.pessoa.cadastropessoa.domain.PessoaFisica;
import com.pessoa.cadastropessoa.domain.PessoaJuridica;
import com.pessoa.cadastropessoa.enumeration.TipoPessoa;
/**
 * 
 * Classe responsável por ser a fabrica de pessoas
 * @author Willian Rosa (williankeji05@gmail.com)
 *
 */
public class FactoryPessoa {
	
	public Pessoa getPessoa(TipoPessoa tipo, String nome)  {
		Pessoa obj = null;
		if (TipoPessoa.FISICA.equals(tipo))  {
			obj = new PessoaFisica(nome);
		} else {
			obj = new PessoaJuridica(nome);
		}
		return obj;
	}
}
