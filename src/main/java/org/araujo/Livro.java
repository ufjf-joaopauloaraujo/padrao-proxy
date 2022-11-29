package org.araujo;

import java.util.Arrays;
import java.util.List;

public class Livro implements ILivro {

    private Integer id;
    private String nome;
    private String autor;
    private String editora;
    private Integer numAcervo;

    public Livro(int id) {
        this.id = id;
        Livro objeto = DB.getLivro(id);
        this.nome = objeto.nome;
        this.autor = objeto.autor;
        this.editora = objeto.editora;
        this.numAcervo = objeto.numAcervo;
    }

    public Livro(Integer id, String nome, String autor, String editora, Integer numAcervo) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.numAcervo = numAcervo;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDados() {
        return Arrays.asList(this.nome, this.autor, this.editora);
    }

    @Override
    public List<Integer> obterQuantidadeAcervo(Usuario usuario) {
        return Arrays.asList(this.numAcervo);
    }
}
