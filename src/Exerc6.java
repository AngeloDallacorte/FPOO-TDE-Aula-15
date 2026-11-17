import java.util.ArrayList;
import java.util.Scanner;

abstract class Funcionario6 {
    protected String nome;
    Funcionario6(String nome) { this.nome = nome; }
    abstract double salario();
    void contracheque6() { System.out.printf("%s: R$ %.2f%n", nome, salario()); }
}
class Horista6 extends Funcionario {
    private double horas, valorHora;
    Horista6(String nome, double horas, double valorHora) { super(nome); this.horas = horas; this.valorHora = valorHora; }
    @Override double salario() { return horas * valorHora; }
}
class Mensalista6 extends Funcionario {
    private double fixo;
    Mensalista6(String nome, double fixo) { super(nome); this.fixo = fixo; }
    @Override double salario() { return fixo; }
}

public class Exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Tipo (h/m): ");
            String tipo = sc.next();
            if (tipo.equalsIgnoreCase("h")) {
                System.out.print("Horas: ");
                double horas = sc.nextDouble();
                System.out.print("Valor/hora: ");
                double valorHora = sc.nextDouble();
                lista.add(new Horista6(nome, horas, valorHora));
            } else {
                System.out.print("Salario fixo: ");
                double fixo = sc.nextDouble();
                lista.add(new Mensalista(nome, fixo));
            }
        }

        System.out.println("\n=== FOLHA ===");
        for (Funcionario funcionario : lista) {
            funcionario.contracheque();
        }
    }
}