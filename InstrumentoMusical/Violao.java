package InstrumentoMusical;

public class Violao implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando violão...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violão.");
    }

    public void trocarCorda(){
        System.out.println("Trocando cordas do violão.");
    }
}
