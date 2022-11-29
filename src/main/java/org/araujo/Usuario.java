package org.araujo;

public class Usuario {
    private String nome;
    private boolean funcionario;

    public Usuario(String nome, boolean funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFuncionario() {
        return funcionario;
    }

    public void setFuncionario(boolean funcionario) {
        this.funcionario = funcionario;
    }
}
