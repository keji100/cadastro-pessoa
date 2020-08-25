package com.pessoa.cadastropessoa.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodados.utils.service.CRUDService;
import com.pessoa.cadastropessoa.domain.Dependente;
import com.pessoa.cadastropessoa.domain.Pessoa;
import com.pessoa.cadastropessoa.domain.PessoaEndereco;
import com.pessoa.cadastropessoa.domain.PessoaFisica;
import com.pessoa.cadastropessoa.domain.PessoaJuridica;
import com.pessoa.cadastropessoa.domain.PessoaProfissao;
import com.pessoa.cadastropessoa.dto.DependenteDTO;
import com.pessoa.cadastropessoa.dto.PessoaDTO;
import com.pessoa.cadastropessoa.dto.PessoaEnderecoDTO;
import com.pessoa.cadastropessoa.enumeration.TipoPessoa;
import com.pessoa.cadastropessoa.factory.FactoryPessoa;
import com.pessoa.cadastropessoa.repository.PessoaRepository;
import com.utils.generic.NumberUtils;

/**
 * Classe de negócio da entidade {@link Pessoa}
 * @author Willian Rosa (williankeji05@gmail.com)
 *
 */

@Service
public class PessoaService implements CRUDService<Pessoa>{
	
	@Autowired
	private PessoaRepository repository;
	@Autowired
	private PessoaProfissaoService pessoaProfissaoService;
	@Autowired
	private DependenteService dependenteService;
	@Autowired
	private PessoaEnderecoService pessoaEnderecoService;

	@Override
	public Pessoa insert(Pessoa obj) {
		return this.repository.save(obj);
	}

	@Override
	public Pessoa update(Pessoa obj) {
		return this.repository.save(obj);	
	}

	@Override
	public Pessoa delete(Long id) {
		Optional<Pessoa> obj = this.repository.findById(id);
		Pessoa pessoa = null;
		if (obj.isPresent()) {
			this.repository.delete(obj.get());
			pessoa = obj.get();
		}
		return pessoa;
	}

	@Override
	public Pessoa getById(Long id) {
		Optional<Pessoa> obj = this.repository.findById(id);
		return obj.orElse(null);
	}

	@Override
	public List<Pessoa> getAll() {
		return this.repository.findAll();
	}
	
	public Pessoa insertDTO(PessoaDTO dto) {
		Pessoa pessoa = this.fromDTO(dto);
		pessoa = this.insert(pessoa);
		this.validarOperacoesPosInsert(pessoa, dto);
		return pessoa;
	}
	
	private void validarOperacoesPosInsert(Pessoa obj, PessoaDTO dto)  {
		if (dto.getEnderecos() != null && !dto.getEnderecos().isEmpty()) {
			for (PessoaEnderecoDTO enderecoDTO: dto.getEnderecos())  {
				PessoaEndereco endereco = new PessoaEndereco.Builder(obj)
											.tipoEndereco(enderecoDTO.getTipoEndereco())
											.tipo(enderecoDTO.getTipo())
											.nome(enderecoDTO.getNome())
											.numero(enderecoDTO.getNumero())
											.complemento(enderecoDTO.getComplemento())
											.cep(enderecoDTO.getCep())
											.bairro(enderecoDTO.getBairro())
											.cidade(enderecoDTO.getCidade())
											.estado(enderecoDTO.getEstado())
											.pais(enderecoDTO.getPais())
											.build();		
				this.pessoaEnderecoService.insert(endereco);
			}
		}
		if (TipoPessoa.FISICA.equals(dto.getTipoPessoa()))  {
			PessoaFisica pf = (PessoaFisica) obj;
			boolean existeProfissao = dto.getNomeProfissao() != null && !dto.getNomePrincipal().isEmpty();
			boolean existeSalario = dto.getSalario() != null && NumberUtils.isBigDecimal(dto.getSalario());
			if (existeProfissao && existeSalario) {
				PessoaProfissao profissao = new PessoaProfissao();
				profissao.setProfissao(dto.getNomeProfissao());
				profissao.setSalario(new BigDecimal(dto.getSalario()));
				profissao.setPessoaFisica(obj);
				profissao = this.pessoaProfissaoService.insert(profissao);
				pf.setProfissao(profissao);
			}
			if (dto.getDepedentes() != null && !dto.getDepedentes().isEmpty()) {
				List<Dependente> dependentes = new ArrayList<Dependente>();
				Dependente depedente = null;
				boolean existeNomeDepedente = false;
				boolean existeTipoDepedente = false;
				for (DependenteDTO depedenteDTO: dto.getDepedentes())  {
					existeNomeDepedente = depedenteDTO.getNome() != null && !depedenteDTO.getNome().isEmpty();
					existeTipoDepedente = depedenteDTO.getTipoDependente() != null;
					if (existeNomeDepedente && existeTipoDepedente)  {
						depedente = new Dependente();
						depedente.setNome(depedenteDTO.getNome());
						depedente.setTipoDependente(depedenteDTO.getTipoDependente());
						depedente.setPessoaFisica(pf);
						this.dependenteService.insert(depedente);
						dependentes.add(depedente);
					}
				}
			}
		}			
	}
	
	private Pessoa fromDTO(PessoaDTO dto) {
		FactoryPessoa fabrica = new FactoryPessoa();
		Pessoa pessoa = fabrica.getPessoa(dto.getTipoPessoa(), dto.getNomePrincipal());
		if (pessoa instanceof PessoaFisica)  {
			PessoaFisica fisica = (PessoaFisica) pessoa;
			this.setarAtributosBasicoClasseFilha(fisica, dto);
		} else if (pessoa instanceof PessoaJuridica)  {
			PessoaJuridica juridica = (PessoaJuridica) pessoa;
			this.setarAtributosBasicoClasseFilha(juridica, dto);
		}
		return pessoa;
	}
	
	private void setarAtributosBasicoClasseFilha(PessoaJuridica obj, PessoaDTO dto)  {
		
	}
	
	private void setarAtributosBasicoClasseFilha(PessoaFisica obj, PessoaDTO dto) {
		if (dto.getNomeSecudario() != null && !dto.getNomeSecudario().isEmpty() ) {
			obj.setApelido(dto.getNomeSecudario());
		}
		if (dto.getNumeroIdentificacao() != null) {
			obj.setCpf(dto.getNumeroIdentificacao());
		}
		if (dto.getDataNascimento() != null)  {
			obj.setDataNascimento(dto.getDataNascimento());
		}
	}
		
}
