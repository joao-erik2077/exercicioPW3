package br.com.joik.banco.repository;

import br.com.joik.banco.model.ContasPagar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasPagarRepository extends JpaRepository<ContasPagar, Long> {
}
