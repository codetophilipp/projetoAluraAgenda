package com.philipp.projetoagendacontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.philipp.projetoagendacontatos.entidade.Contato;

public interface ContatoDao extends JpaRepository<Contato, Long> {

}
