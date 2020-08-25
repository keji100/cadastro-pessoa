package com.pessoa.cadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoa.cadastropessoa.domain.Pessoa;

/**
 * Classe de acesso a dados da entidade {@link Pessoa}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {}
