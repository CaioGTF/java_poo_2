package Q2;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Motocicleta moto = new Motocicleta("Honda", "CB500", 2021, "Esportivo");

        System.out.println("informações básicas do carro:");
        carro.informacoes();

        System.out.println("informações básicas da moto:");
        moto.informacoes();
    }
}
