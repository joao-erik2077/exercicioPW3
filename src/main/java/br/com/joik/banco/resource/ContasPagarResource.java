package br.com.joik.banco.resource;

import br.com.joik.banco.repository.ContasPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contasPagar")
public class ContasPagarResource {

    @Autowired
    private ContasPagarRepository contasPagarRepository;
}
