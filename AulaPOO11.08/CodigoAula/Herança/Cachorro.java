package CodigoAula.Herança;
public class Cachorro extends Animal {
    private String nome;

    public Cachorro(String raca, int numPatas, String nome) {
        super(raca, numPatas);
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    } 
}
