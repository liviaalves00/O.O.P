public class triangulo {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 4, 5);
        Triangulo triangulo2 = new Triangulo(2, 2, 2);
        Triangulo triangulo3 = new Triangulo(5, 7, 10);

        System.out.println("Triângulo 1: " + "Forma Triângulo: " + triangulo1.verificarTriangulo() + ", Isósceles: " + triangulo1.Ehisoceles() + ", Equilátero: " + triangulo1.Ehequilatero() + ", Escaleno: " + triangulo1.Ehescaleno());
        System.out.println("Triângulo 2: " + "Forma Triângulo: " + triangulo2.verificarTriangulo() + ", Isósceles: " + triangulo2.Ehisoceles() + ", Equilátero: " + triangulo2.Ehequilatero() + ", Escaleno: " + triangulo2.Ehescaleno());
        System.out.println("Triângulo 3: " + "Forma Triângulo: " + triangulo3.verificarTriangulo() + ", Isósceles: " + triangulo3.Ehisoceles() + ", Equilátero: " + triangulo3.Ehequilatero() + ", Escaleno: " + triangulo3.Ehescaleno());
    }
}

class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean verificarTriangulo() {
        //regra: |b-c| < a < b+c;
        if (Math.abs(lado2 - lado3) < lado1 && lado1 < (lado2 + lado3)) {
            return true;
        }
        return false; 
    }

    public boolean Ehisoceles() {
        if (!verificarTriangulo()) {
            return false;
        }
        return (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3);
    }

    public boolean Ehequilatero() {
        if (!verificarTriangulo()) {
            return false;
        }
        return (lado1 == lado2) && (lado1 == lado3) && (lado2 == lado3);
    }

    public boolean Ehescaleno() {
        if (!verificarTriangulo()) {
            return false;
        }
        return (lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3);
    }
}
