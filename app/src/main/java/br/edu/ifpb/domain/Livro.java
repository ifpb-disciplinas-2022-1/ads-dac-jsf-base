package br.edu.ifpb.domain;

import java.time.LocalDate;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/04/2022, 10:48:28
 */
public class Livro {

    private long id;
    private String titulo;
    private LocalDate dataDeLancamento;

    
    public Livro(String titulo,LocalDate dataDeLancamento) {
        this(0,titulo,dataDeLancamento);
    }

    public Livro(long id,String titulo,LocalDate dataDeLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
    }
    public String titulo(){
        return this.titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo=" + titulo + ", dataDeLancamento=" + dataDeLancamento + '}';
    }

    public LocalDate dataLancamento() {
        return this.dataDeLancamento;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
    

}
