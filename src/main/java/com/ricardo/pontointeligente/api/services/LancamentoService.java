package com.ricardo.pontointeligente.api.services;

import java.util.Optional;

import javax.persistence.Cacheable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ricardo.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {
	
	/***
	 * Buscar lancamento por funcionario especifico
	 * 
	 * @param funcionarioId
	 * @param pageRequest
	 * @return
	 */
	Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest);
	
	/***
	 * Retorna um lancamento na base de dados
	 * 
	 * @param id
	 * @return
	 */
	
	Optional<Lancamento> buscarPorId(Long id);
	
	/***
	 * Persiste um lancamento na base de dados
	 * 
	 * @param lancamento
	 * @return
	 */
	Lancamento persistir(Lancamento lancamento);
	
	/***
	 * Remove um lancamento na base de dados
	 * 
	 * @param id
	 */
	void remover(Long id);
}
