package br.ufc.quixada.npi.repository;

import java.util.List;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Pessoa;

public interface PessoaRepository {

	public abstract void save(Pessoa c);

	public abstract List<Pessoa> findAll();
	
}