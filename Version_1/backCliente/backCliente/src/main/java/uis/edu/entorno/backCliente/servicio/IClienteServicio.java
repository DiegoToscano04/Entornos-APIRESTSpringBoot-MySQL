package uis.edu.entorno.backCliente.servicio;

import uis.edu.entorno.backCliente.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {

    //Listar todos los clientes
    public List<Cliente> getClientes();

    //Buscar un cliente por id
    public Cliente getCliente(Integer id);

    //Guardar un cliente
    public Cliente grabarCliente(Cliente cliente);

    // Eliminar un cliente
    public void delete(Integer id);
}
