package com.juliano.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
