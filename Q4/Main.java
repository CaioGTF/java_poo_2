package Q4;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarProduto(new Computador("CCE", 1000));
        loja.adicionarProduto(new Smartphone("iPhone 25", 14000));
        loja.adicionarProduto(new Tablet("A32", 3500));

        loja.listarGarantias();
    }
}