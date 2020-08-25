package com.pessoa.cadastropessoa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Classe entidade que representa a tabela 'ENDERECO'
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Entity
public class PessoaEndereco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_endereco")
	private Long oid;
	private String tipoEndereco;
	private String tipo;
	private String nome;
	private Long numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_pessoa")
	private Pessoa pessoa;
	
	public static class Builder {

		private String tipoEndereco;
		private String tipo;
		private String nome;
		private Long numero;
		private String complemento;
		private String cep;
		private String bairro;
		private String cidade;
		private String estado;
		private String pais;
		private Pessoa pessoa;

		public Builder(Pessoa pessoa) {
			this.tipoEndereco = "";
			this.tipo = "";
			this.nome = "";
			this.numero = null;
			this.complemento = "";
			this.cep = "";
			this.bairro = "";
			this.cidade = "";
			this.estado = "";
			this.pais = "";
			this.pessoa = pessoa;
		}

		public Builder tipoEndereco(String tipoEndereco) {
			this.tipoEndereco = tipoEndereco;
			return this;
		}
		
		public Builder tipo(String tipo) {
			this.tipo = tipo;
			return this;
		}
		
		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder numero(Long numero) {
			this.numero = numero;
			return this;
		}
		
		public Builder complemento(String complemento) {
			this.complemento = complemento;
			return this;
		}
		
		public Builder cep(String cep) {
			this.cep = cep;
			return this;
		}
		
		public Builder bairro(String bairro) {
			this.bairro = bairro;
			return this;
		}

		public Builder cidade(String cidade) {
			this.cidade = cidade;
			return this;
		}
		
		public Builder estado(String estado) {
			this.estado = estado;
			return this;
		}
		
		public Builder pais(String pais) {
			this.pais = pais;
			return this;
		}
		
		public PessoaEndereco build() {
			return new PessoaEndereco(this);
		}
		
	}
	
	private PessoaEndereco(Builder builder)  {
		this.tipoEndereco = builder.tipoEndereco;
		this.tipo = builder.tipo;
		this.nome = builder.nome;
		this.numero = builder.numero;
		this.complemento = builder.complemento;
		this.cep = builder.cep;
		this.bairro = builder.bairro;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.pais = builder.pais;
		this.pessoa = builder.pessoa;
	}
	
	public String getTipoEndereco() {
		return tipoEndereco;
	}
	
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getNumero() {
		return numero;
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
