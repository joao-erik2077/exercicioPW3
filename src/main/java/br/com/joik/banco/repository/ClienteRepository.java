package br.com.joik.banco.repository;

import br.com.joik.banco.model.Cliente;
import br.com.joik.banco.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryQuery {
}
