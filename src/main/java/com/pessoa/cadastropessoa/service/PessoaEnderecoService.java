package com.pessoa.cadastropessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodados.utils.service.CRUDService;
import com.pessoa.cadastropessoa.domain.PessoaEndereco;
import com.pessoa.cadastropessoa.repository.PessoaEnderecoRepository;

/**
 * Classe de negócio da entidade {@link PessoaEndereco}
 * @author Willian Rosa (williankeji05@gmail.com)
 *
 */

@Service
public class PessoaEnderecoService implements CRUDService<PessoaEndereco> {

	@Autowired
	private PessoaEnderecoRepository repository;
	
	@Override
	public PessoaEndereco insert(PessoaEndereco obj) {
		return this.repository.save(obj);
	}

	@Override
	public PessoaEndereco update(PessoaEndereco obj) {
		return this.repository.save(obj);
	}

	@Override
	public PessoaEndereco delete(Long id) {
		Optional<PessoaEndereco> obj = this.repository.findById(id);
		PessoaEndereco pessoaEndereco = null;
		if (obj.isPresent()) {
			this.repository.delete(obj.get());
			pessoaEndereco = obj.get();
		}
		return pessoaEndereco;
	}

	@Override
	public PessoaEndereco getById(Long id) {
		Optional<PessoaEndereco> obj = this.repository.findById(id);
		return obj.orElse(null);
	}

	@Override
	public List<PessoaEndereco> getAll() {
		return this.repository.findAll();
	}

}
