package com.pessoa.cadastropessoa;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pessoa.cadastropessoa.domain.Pessoa;
import com.pessoa.cadastropessoa.dto.PessoaDTO;
import com.pessoa.cadastropessoa.service.PessoaService;


/**
 * Camada REST referente a entidade {@link Pessoa}
 * @author Willian Rosa (williankeji05@gmail.com)
 */

@RestController
@RequestMapping(value="/pessoa")
public class PessoaResource {

	@Autowired
	private PessoaService service;
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody PessoaDTO dto){
		Pessoa obj = this.service.insertDTO(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}").buildAndExpand(obj.getOid()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
}
