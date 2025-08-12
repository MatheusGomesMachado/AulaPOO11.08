package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo("azul", true, 4.0, 2.0);
        Circulo cir = new Circulo("vermelho", false, 3.0);

        System.out.println("Retângulo: cor = " + ret.getCor()
                + ", preenchido = " + ret.isPreenchida()
                + ", área = " + ret.calcularArea());

        System.out.println("Círculo: cor = " + cir.getCor()
                + ", preenchido = " + cir.isPreenchida()
                + ", área = " + cir.calcularArea());
    }
}
