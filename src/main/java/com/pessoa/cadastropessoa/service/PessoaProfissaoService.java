package com.pessoa.cadastropessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodados.utils.service.CRUDService;
import com.pessoa.cadastropessoa.domain.Pessoa;
import com.pessoa.cadastropessoa.domain.PessoaProfissao;
import com.pessoa.cadastropessoa.repository.PessoaProfissaoRepository;

/**
 * Classe de negócio da entidade {@link Pessoa}
 * @author Willian Rosa (williankeji05@gmail.com)
 *
 */
@Service
public class PessoaProfissaoService implements CRUDService<PessoaProfissao>{

	@Autowired
	private PessoaProfissaoRepository repository;

	@Override
	public PessoaProfissao insert(PessoaProfissao obj) {
		return this.repository.save(obj);
	}

	@Override
	public PessoaProfissao update(PessoaProfissao obj) {
		return this.repository.save(obj);
	}

	@Override
	public PessoaProfissao delete(Long id) {
		Optional<PessoaProfissao> obj = this.repository.findById(id);
		PessoaProfissao pessoaProfissao = null;
		if (obj.isPresent()) {
			this.repository.delete(obj.get());
			pessoaProfissao = obj.get();
		}
		return pessoaProfissao;
	}

	@Override
	public PessoaProfissao getById(Long id) {
		Optional<PessoaProfissao> obj = this.repository.findById(id);
		return obj.orElse(null);
	}

	@Override
	public List<PessoaProfissao> getAll() {
		return this.repository.findAll();
	}
	
	
}
