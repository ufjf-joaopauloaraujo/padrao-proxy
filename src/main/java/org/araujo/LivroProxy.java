package org.araujo;

import java.util.List;

public class LivroProxy implements ILivro {

    private Livro livro;

    private Integer id;

    public LivroProxy(Integer id) {
        this.id = id;
    }

    @Override
    public List<String> obterDados() {
        if (this.livro == null) {
            this.livro = new Livro(this.id);
        }
        return this.livro.obterDados();
    }

    @Override
    public List<Integer> obterQuantidadeAcervo(Usuario usuario) {
        if (!usuario.isFuncionario()) {
            throw new IllegalArgumentException("Usuario não autorizado");
        }
        if (this.livro == null) {
            this.livro = new Livro(this.id);
        }
        return this.livro.obterQuantidadeAcervo(usuario);
    }
}
