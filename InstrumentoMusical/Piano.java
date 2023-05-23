package InstrumentoMusical;

public class Piano implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando piano...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o piano.");
    }

    public void tocarTecla(int tecla){
        System.out.println("Tocando a tecla " + tecla + " do piano.");
    }
}
