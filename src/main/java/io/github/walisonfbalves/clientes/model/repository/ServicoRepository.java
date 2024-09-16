package io.github.walisonfbalves.clientes.model.repository;

import io.github.walisonfbalves.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
