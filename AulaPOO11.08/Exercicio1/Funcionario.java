package Exercicio1;

public class Funcionario {
    public String nome;
    protected int salario;

    public Funcionario (String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome(){
        return this.nome;
    }
    public int getSalario(){
        return this.salario;
    }
    public void arrumar(){
        System.out.println("Arrumando");
    }
}
