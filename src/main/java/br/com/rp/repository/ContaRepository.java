package br.com.rp.repository;

import javax.ejb.Local;

import br.com.rp.domain.Conta;

@Local
public interface ContaRepository extends Repository<Conta>  {

}
