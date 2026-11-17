abstract class Instrumento {
    abstract String tocar();
}
class Violao extends Instrumento {
    @Override String tocar() { return "Plim plim"; }
}
class Bateria extends Instrumento {
    @Override String tocar() { return "Tum tum tsss"; }
}

public class Exerc3 {
    public static void main(String[] args) {
        System.out.println(new Violao().tocar());
        System.out.println(new Bateria().tocar());
    }
}