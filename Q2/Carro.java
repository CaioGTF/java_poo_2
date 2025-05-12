package Q2;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Número portas: " + numPortas);
    }
}