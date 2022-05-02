package br.edu.ifpb.domain;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/04/2022, 10:50:41
 */
public interface Livros {

    public List<Livro> todos();
    
    public void criar(Livro livro);
}
