package com.alexandre.financeiro.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandre.financeiro.api.model.Lancamento;
import com.alexandre.financeiro.api.model.Pessoa;
import com.alexandre.financeiro.api.repository.LancamentoRepository;
import com.alexandre.financeiro.api.repository.PessoaRepository;
import com.alexandre.financeiro.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired 
	private LancamentoRepository lancamentorepository;

	public Lancamento salvar(Lancamento lancamento) {
		
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getId());
		if(!pessoa.isPresent() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		return lancamentorepository.save(lancamento);
		
	}
	
	

}
