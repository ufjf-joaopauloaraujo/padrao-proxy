package org.araujo;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private static Map<Integer, Livro> livros = new HashMap<>();

    public static Livro getLivro(Integer id) {
        return livros.get(id);
    }

    public static void addLivro(Livro livro) {
        livros.put(livro.getId(), livro);
    }
}
