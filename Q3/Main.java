package Q3;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new Gerente("Julia", 12000, 1500));
        empresa.adicionarFuncionario(new Desenvolvedor("Odete", 9000, 1.2));
        empresa.adicionarFuncionario(new Estagiario("Fatima", 110000));

        empresa.calcularFolhaDePagamento();
    }
}
