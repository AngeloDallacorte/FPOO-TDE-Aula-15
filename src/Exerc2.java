abstract class Forma {
    abstract double area();
}

class Quadrado extends Forma {
    private double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double area() {
        return lado * lado;
    }
}

class Triangulo extends Forma {
    private double base, altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double area() {
        return base * altura / 2;
    }
}

public class Exerc2 {
    public static void main(String[] args) {
        System.out.printf("Quadrado: %.1f%n", new Quadrado(4).area());
        System.out.printf("Triangulo: %.1f%n", new Triangulo(6, 4).area());
    }
}