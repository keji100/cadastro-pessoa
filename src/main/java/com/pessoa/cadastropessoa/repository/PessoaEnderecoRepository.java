package com.pessoa.cadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoa.cadastropessoa.domain.PessoaEndereco;

/**
 * Classe de acesso a dados da entidade {@link PessoaEndereco}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Repository
public interface PessoaEnderecoRepository extends JpaRepository<PessoaEndereco, Long> {}
