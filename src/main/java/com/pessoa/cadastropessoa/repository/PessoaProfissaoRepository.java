package com.pessoa.cadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoa.cadastropessoa.domain.PessoaProfissao;

/**
 * Classe de acesso a dados da entidade {@link PessoaProfissao}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Repository
public interface PessoaProfissaoRepository extends JpaRepository<PessoaProfissao, Long> {}
