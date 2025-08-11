package Exercicio1;

public class Gerente extends Funcionario {
    public String setor;

    public Gerente (String nome, int salario, String setor){
        super(nome, salario);
        this.setor = setor;
    }
    public String getSetor() {
        return this.setor;
    }
}
