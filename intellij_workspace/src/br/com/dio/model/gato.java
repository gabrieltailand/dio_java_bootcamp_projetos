package br.com.dio.model;

import java.util.Objects;

public class gato {
    private string nome;
    private string cor;
    private string idade;

    public gato() {}

    public gato(string nome, string cor, string idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public string getCor() {
        return cor;
    }

    public void setCor(string cor) {
        this.cor = cor;
    }

    public string getIdade() {
        return idade;
    }

    public void setIdade(string idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        gato gato = (gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "gato{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}
