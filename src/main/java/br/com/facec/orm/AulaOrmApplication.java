package br.com.facec.orm;

import br.com.facec.orm.model.Pessoa;
import br.com.facec.orm.repository.PessoaRepository;
import br.com.facec.orm.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AulaOrmApplication implements CommandLineRunner {

	@Autowired
	private PessoaService pessoaService;

	public static void main(String[] args) {
		SpringApplication.run(AulaOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pessoa");

		pessoaService.salvar(pessoa);

		List<Pessoa> pessoas = pessoaService.findAll();

		pessoaService.findByNome("Pessoa");

		pessoas.forEach(p -> {
			System.out.println("-----------------");
			System.out.println(p.getId());
			System.out.println(p.getNome());
			System.out.println("-----------------");
		});
	}
}
