package uis.edu.entorno.backCliente.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uis.edu.entorno.backCliente.modelo.Cliente;
import uis.edu.entorno.backCliente.servicio.ClienteServicio;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteServicio clienteService;

    @GetMapping("/list")
    public List<Cliente> consultarTodo(){
        return (clienteService.getClientes());
    }

    @GetMapping("/list/{id}")
    public Cliente buscarPorId(@PathVariable Integer id){
        return clienteService.getCliente(id);
    }

    @PostMapping("/")
    public ResponseEntity<Cliente> agregar(@RequestBody Cliente cliente){
        Cliente obj = clienteService.grabarCliente(cliente);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/")
    public ResponseEntity<Cliente> editar(@RequestBody Cliente cliente){
        Cliente obj = clienteService.getCliente(cliente.getIdcliente());
        if (obj != null) {
            obj.setDireccion(cliente.getDireccion());
            obj.setApellidos(cliente.getApellidos());
            obj.setDocumento(cliente.getDocumento());
            obj.setEmail(cliente.getEmail());
            obj.setNombres(cliente.getNombres());
            obj.setTipdoc(cliente.getTipdoc());
            clienteService.grabarCliente(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        } return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> eliminar(@PathVariable Integer id){
        Cliente obj = clienteService.getCliente(id);
        if(obj != null){
            clienteService.delete(id);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        } return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
