package com.pessoa.cadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pessoa.cadastropessoa.domain.Dependente;

/**
 * Classe de acesso a dados da entidade {@link Dependente}
 * @author Willian Rosa (williankeji05@gmail.com)
 */
@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {}
