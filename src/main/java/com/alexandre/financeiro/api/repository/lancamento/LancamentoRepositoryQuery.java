package com.alexandre.financeiro.api.repository.lancamento;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alexandre.financeiro.api.model.Lancamento;
import com.alexandre.financeiro.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
