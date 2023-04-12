package br.com.joik.banco.resource;

import br.com.joik.banco.model.ContasPagar;
import br.com.joik.banco.repository.ContasPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contaspagar")
public class ContasPagarResource {

    @Autowired
    private ContasPagarRepository contasPagarRepository;

    @GetMapping("/todos")
    public List<ContasPagar> getAllContasPagar() {
        return contasPagarRepository.findAll();
    }
}
