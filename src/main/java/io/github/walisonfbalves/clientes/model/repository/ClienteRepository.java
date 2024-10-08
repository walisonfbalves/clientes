package io.github.walisonfbalves.clientes.model.repository;

import io.github.walisonfbalves.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
