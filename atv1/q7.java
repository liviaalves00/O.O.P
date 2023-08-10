public class q7 {
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(10, 20);
        ret1.exibir();

    }
    
}

class Retangulo {
    double lado1;
    double lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea() {
        return lado1 * lado2;
    }

    double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public void exibir() {
        System.out.println("Resultado da área: " + calcularArea());
        System.out.println("O resultado do perímetro: " + calcularPerimetro());
    }

}
