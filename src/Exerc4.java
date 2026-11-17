import java.util.Locale;

abstract class Funcionario {
    protected String nome;
    Funcionario(String nome) { this.nome = nome; }

    abstract double salario();

    void contracheque() {
        System.out.printf(new Locale("pt", "BR"),
                "%s: R$ %,.2f%n", nome, salario());
    }
}
class Horista extends Funcionario {
    private double horas, valorHora;
    Horista(String nome, double horas, double valorHora) { super(nome); this.horas = horas; this.valorHora = valorHora; }
    @Override double salario() { return horas * valorHora; }
}
class Mensalista extends Funcionario {
    private double fixo;
    Mensalista(String nome, double fixo) { super(nome); this.fixo = fixo; }
    @Override double salario() { return fixo; }
}

public class Exerc4 {
    public static void main(String[] args) {
        new Horista("Ana", 80, 50).contracheque();
        new Mensalista("Bruno", 5000).contracheque();
    }
}