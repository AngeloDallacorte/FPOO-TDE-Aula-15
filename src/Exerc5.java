import java.util.ArrayList;

abstract class Forma5 {
    abstract double area();
}
class Quadrado5 extends Forma {
    private double lado; Quadrado5(double lado){this.lado=lado;} double area(){return lado*lado;}
}
class Circulo5 extends Forma {
    private double raio; Circulo5(double raio){this.raio=raio;} double area(){return 3.14159*raio*raio;}
}

public class Exerc5 {
    public static void main(String[] args) {
        ArrayList<Forma> formas5 = new ArrayList<>();
        formas5.add(new Quadrado5(2));
        formas5.add(new Circulo5(3));
        double total = 0;
        for (Forma forma : formas5) {
            total += forma.area();
        }
        System.out.printf("Area total: %.2f%n", total);
    }
}