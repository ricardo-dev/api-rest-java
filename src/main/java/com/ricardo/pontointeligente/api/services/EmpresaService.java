package com.ricardo.pontointeligente.api.services;

import java.util.Optional;

import com.ricardo.pontointeligente.api.entities.*;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa no banco de dados
	 * 
	 * @param empresa
	 * @return
	 */
	Empresa persistir(Empresa empresa);

}
