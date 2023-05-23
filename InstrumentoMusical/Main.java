package InstrumentoMusical;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        InstrumentoMusical violao = new Violao();
        InstrumentoMusical piano = new Piano();

        violao.tocar();
        violao.afinar();
        ((Violao) violao).trocarCorda();
        piano.tocar();
        piano.afinar();
        ((Piano) piano).tocarTecla(1);

    }
}
