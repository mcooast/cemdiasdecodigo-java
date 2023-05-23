package SistemaCadastroVeiculos;
public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2022, 4, 500);

        System.out.println("Marca do Carro: " + carro.getMarca());
        System.out.println("Modelo do Carro: " + carro.getModelo());
        System.out.println("Ano do Carro: " + carro.getAno());
        System.out.println("Número de Portas do Carro: " + carro.getNumeroPortas());
        System.out.println("Capacidade do Porta-Malas do Carro em litros: " + carro.getCapacidadePortaMalas());

        System.out.println(""); // Linha em branco

        Motocicleta motocicleta = new Motocicleta("Honda", "CBR500R", 2021, 500, "Partida Elétrica");

        System.out.println("Marca da Motocicleta: " + motocicleta.getMarca());
        System.out.println("Modelo da Motocicleta: " + motocicleta.getModelo());
        System.out.println("Ano da Motocicleta: " + motocicleta.getAno());
        System.out.println("Cilindrada da Motocicleta: " + motocicleta.getCiclindrada());
        System.out.println("Tipo de Partida da Motocicleta: " + motocicleta.getTipoPartida());
    }

    }

