package br.com.facec.orm.repository;

import br.com.facec.orm.model.Agendamento;
import org.springframework.data.repository.CrudRepository;

public interface AgendamentoRepository extends CrudRepository<Agendamento, Long> {
}
