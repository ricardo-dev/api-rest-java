package com.ricardo.pontointeligente.api.repositories;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.pontointeligente.api.entities.Empresa;;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
	
	// anotacao para o JPA ignorar. 
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
