package br.com.facec.orm.service;

import br.com.facec.orm.model.Pessoa;
import br.com.facec.orm.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoaRepository.findAll()
                .forEach(pessoas::add);

        return pessoas;
    }

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> findByNome(String pessoa) {
        return pessoaRepository.findByNome(pessoa);
    }
}
