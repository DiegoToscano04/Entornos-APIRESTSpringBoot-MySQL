package uis.edu.entorno.backendVentas.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uis.edu.entorno.backendVentas.modelo.Cliente;
import uis.edu.entorno.backendVentas.repositorio.IClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository clienteRepo;

    @Override
    public List<Cliente> findAll(){
        return clienteRepo.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id){
        return clienteRepo.findById(id);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        clienteRepo.deleteById(id);
    }
}
