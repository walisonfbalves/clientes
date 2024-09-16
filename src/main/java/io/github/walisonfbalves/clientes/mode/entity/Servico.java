package io.github.walisonfbalves.clientes.mode.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String descricao;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal valor;
}
