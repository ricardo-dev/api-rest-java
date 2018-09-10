package com.ricardo.pontointeligente.api.services;

import java.util.Optional;

import com.ricardo.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	
	/**
	 * Armazena um funcionario no banco de dados
	 * 
	 * @param funcionario
	 * @return
	 */
	Funcionario Persistir(Funcionario funcionario);
	
	/**
	 * Retorna um funcionario dado um cpf
	 * 
	 * @param cpf
	 * @return
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	
	/**
	 * Retorna um funcionario dado um email
	 * 
	 * @param email
	 * @return
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	
	/**
	 * Retorna um funcionario dado um Id
	 * 
	 * @param id
	 * @return
	 */
	Optional<Funcionario> buscarPorId(Long id);

}
