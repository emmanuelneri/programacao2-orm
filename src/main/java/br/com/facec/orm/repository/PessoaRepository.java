package br.com.facec.orm.repository;

import br.com.facec.orm.model.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    @Query(name = "Pessoa.findByNome")
    List<Pessoa> findByNome(@Param("nome") String nome);
}
