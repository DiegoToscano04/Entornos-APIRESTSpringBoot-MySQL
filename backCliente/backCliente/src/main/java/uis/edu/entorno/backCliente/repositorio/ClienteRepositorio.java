package uis.edu.entorno.backCliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.edu.entorno.backCliente.modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
