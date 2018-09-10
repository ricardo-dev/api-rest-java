package com.ricardo.pontointeligente.api.repositories;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.ricardo.pontointeligente.api.entities.Lancamento;

import java.util.List;


@Transactional(readOnly = true)
// criacao do script personalizado
@NamedQueries({
	@NamedQuery( name = "LancamentoRepository.findByFuncionarioId",
			query = "SELECT lanc FROM lancamento lanc WHERE lanc.funcionario.id = :funcionarioId")})
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);
	
	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
}
