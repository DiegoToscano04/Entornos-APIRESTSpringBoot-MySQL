package uis.edu.entorno.backendVentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.edu.entorno.backendVentas.modelo.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}