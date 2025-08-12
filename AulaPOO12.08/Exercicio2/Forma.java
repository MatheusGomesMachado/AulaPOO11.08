package Exercicio2;

public class Forma {
    private String cor;
    private boolean preenchida;

    // Construtor simples
    public Forma(String cor, boolean preenchida) {
        this.cor = cor;
        this.preenchida = preenchida;
    }

    // Métodos para acessar os atributos
    public String getCor() {
        return cor;
    }

    public boolean isPreenchida() {
        return preenchida;
    }
}
