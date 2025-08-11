package CodigoAula.Herança;

public class TestaAnimal {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("cheetos", 4, "pitchuco");

        c1.fazerSom();

        System.out.println(c1.getNome());
        System.out.println(c1.getNumPatas());

    }
}