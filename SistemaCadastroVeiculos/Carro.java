package SistemaCadastroVeiculos;

public class Carro extends Veiculo{
    private int numeroPortas;
    private double capacidadePortaMalas;

    public Carro (String marca, String modelo, int ano, int numeroPortas, double capacidadePortaMalas){
    super (marca, modelo, ano);
    this.numeroPortas = numeroPortas;
    this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public double getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(double capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

   /* public double calculoKmPorLitro(){
    }
    public boolean carroEsportivo() {
    }
    */

}
