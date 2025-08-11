package CodigoAula.Herança;
class Animal {
    protected String raca;
    protected int numPatas;

    public Animal(String raca, int numPatas) {
        this.raca = raca;
        this.numPatas = numPatas;
    }

    public String getRaca() {
        return this.raca;
    }

    public int getNumPatas() {
        return this.numPatas;
    }

    public void fazerSom() {
        System.out.println("Barulho de animal");
    }
}