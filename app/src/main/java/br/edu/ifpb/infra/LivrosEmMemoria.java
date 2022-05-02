package br.edu.ifpb.infra;

import br.edu.ifpb.domain.Livro;
import br.edu.ifpb.domain.Livros;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/04/2022, 10:51:42
 */
public class LivrosEmMemoria implements Livros{

    @Override
    public List<Livro> todos() {
        return Arrays.asList(
            new Livro(1,"Java",LocalDate.now()),
            new Livro(2,"C++",LocalDate.now()),
            new Livro(3,"python",LocalDate.now())
        );
            
    }

    @Override
    public void criar(Livro livro) {
        
    }

}
