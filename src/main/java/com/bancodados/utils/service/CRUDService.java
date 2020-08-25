package com.bancodados.utils.service;

import java.util.List;

/**
 * Interface padrão para classes services que necessitam do CRUD. 
 * @author wrosa
 *
 */
public interface CRUDService<T> {
	
	public T insert(T obj);
	public T update(T obj);
	public T delete(Long id);
	public T getById(Long id);
	public List<T> getAll();
	
}
