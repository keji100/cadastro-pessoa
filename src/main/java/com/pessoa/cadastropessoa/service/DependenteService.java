package com.pessoa.cadastropessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodados.utils.service.CRUDService;
import com.pessoa.cadastropessoa.domain.Dependente;
import com.pessoa.cadastropessoa.repository.DependenteRepository;

/**
 * Classe de negócio da entidade {@link Dependente}
 * @author Willian Rosa (williankeji05@gmail.com)
 *
 */
@Service
public class DependenteService implements CRUDService<Dependente>{

	@Autowired
	private DependenteRepository repository;
	
	@Override
	public Dependente insert(Dependente obj) {
		return this.repository.save(obj);
	}

	@Override
	public Dependente update(Dependente obj) {
		return this.repository.save(obj);
	}

	@Override
	public Dependente delete(Long id) {
		Optional<Dependente> obj = this.repository.findById(id);
		Dependente depedente = null;
		if (obj.isPresent()) {
			this.repository.delete(obj.get());
			depedente = obj.get();
		}
		return depedente;
	}

	@Override
	public Dependente getById(Long id) {
		Optional<Dependente> obj = this.repository.findById(id);
		return obj.orElse(null);
	}

	@Override
	public List<Dependente> getAll() {
		return this.repository.findAll();
	}
		
}
