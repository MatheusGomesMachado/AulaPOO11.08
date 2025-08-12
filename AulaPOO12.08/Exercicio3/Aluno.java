package Exercicio3;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);  // chama o construtor da classe Pessoa
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
