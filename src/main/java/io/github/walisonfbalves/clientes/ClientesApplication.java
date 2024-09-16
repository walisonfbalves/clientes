package io.github.walisonfbalves.clientes;

import io.github.walisonfbalves.clientes.model.entity.Cliente;
import io.github.walisonfbalves.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ClientesApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository) {
        return args -> {
            Cliente cliente = Cliente.builder().cpf("00000000000").nome("Ciclano").dataCadastro(LocalDate.now()).build();
            repository.save(cliente);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
