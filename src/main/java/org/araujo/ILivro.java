package org.araujo;

import java.util.List;

public interface ILivro {
    List<String> obterDados();
    List<Integer> obterQuantidadeAcervo(Usuario funcionario);
}
