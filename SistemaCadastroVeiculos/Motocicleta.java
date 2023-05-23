package SistemaCadastroVeiculos;

public class Motocicleta extends Veiculo{

    private int cilindrada;
    private String tipoPartida;

    public Motocicleta (String marca, String modelo, int ano, int cilindrada, String tipoPartida){
        super (marca, modelo, ano);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    public int getCiclindrada() {
        return cilindrada;
    }

    public void setCilindrada(int deslocamento) {
        this.cilindrada = cilindrada;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    /* public boolean partidaEletrica(){
    }
      public boolean offRoad(){} // se é adequada para off-road
     */
}
