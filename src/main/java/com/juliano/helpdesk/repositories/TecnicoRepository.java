package com.juliano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
