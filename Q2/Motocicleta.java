package Q2;

public class Motocicleta extends Veiculo {
    private String tipoGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoGuidao) {
        super(marca, modelo, ano);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Tipo do guidão: " + tipoGuidao);
    }
}
