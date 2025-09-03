package uis.edu.entorno.backCliente.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uis.edu.entorno.backCliente.modelo.Cliente;
import uis.edu.entorno.backCliente.repositorio.ClienteRepositorio;

import java.util.List;

@Service
@Transactional
public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepo;

    @Override
    public List<Cliente> getClientes(){
        return clienteRepo.findAll();
    }

    @Override
    public Cliente getCliente(Integer id){
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public Cliente grabarCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Integer id){
        clienteRepo.deleteById(id);
    }
}
