package Exercicio1;

public class PreencendoCampos {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Matheus",1000,"TI");

        g1.arrumar();

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());

    }
}
