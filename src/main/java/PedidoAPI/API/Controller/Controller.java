package PedidoAPI.API.Controller;

import PedidoAPI.API.Repository.ClienteRepository;
import PedidoAPI.API.entity.Cliente;
import PedidoAPI.API.entity.Itens;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "cliente/v1")
public class Controller {
    @Autowired
    ClienteRepository resposity;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        for (Itens i : cliente.getItens()) {
            Itens itens = new Itens(i.getNome(), i.getPrecoIndividual(), i.getPrecoTotal(), i.getQuantidade());
            i.setPrecoTotal(i.getPrecoIndividual() * i.getQuantidade());
        }
        Cliente clienteSaved = resposity.save(cliente);
        return clienteSaved;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id)
    {
        Optional<Cliente> clienteReturned = resposity.findById(id);
        return clienteReturned;
    }
    @DeleteMapping("/{id}")
    public String de
}

