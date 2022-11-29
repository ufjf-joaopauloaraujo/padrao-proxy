package org.araujo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlunoProxyTest {

    @BeforeEach
    void setUp() {
        DB.addLivro(new Livro(1, "1984", "George Orwell", "Companhia das Letras", 10));
        DB.addLivro(new Livro(2, "Os Lusíadas", "Camões", "Ática", 3));
    }

    @Test
    void deveRetornarDadosLivro() {
        LivroProxy livro = new LivroProxy(1);

        assertEquals(Arrays.asList("1984", "George Orwell", "Companhia das Letras"), livro.obterDados());
    }

    @Test
    void deveRetonarQuantidadeAcervoLivrio() {
        Usuario funcionario = new Usuario("Pedro", true);
        LivroProxy livro = new LivroProxy(2);

        assertEquals(Arrays.asList(3), livro.obterQuantidadeAcervo(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarQuantidadeAcervo() {
        try {
            Usuario funcionario = new Usuario("Joana", false);
            LivroProxy livro = new LivroProxy(2);

            livro.obterQuantidadeAcervo(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Usuario não autorizado", e.getMessage());
        }
    }
}