package br.com.joik.banco.resource;

import br.com.joik.banco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;
}
