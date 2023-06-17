package br.com.developer.ediaristas.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.developer.ediaristas.core.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
