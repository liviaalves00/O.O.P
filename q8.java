public class q8 {
    public static void main(String[] args) {
        Circle c1 = new Circle(20);
        c1.exibition();
    }

}

class Circle {
    double radius;
    double pi = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return  pi * Math.pow(radius,2);
    }

    double calculatePerimeter() {
        return 2 * (pi * radius);
    }
    
    public void exibition() {
        System.out.println("The Area is: " + calculateArea());
        System.out.println("The Perimeter is: " + calculatePerimeter());
    }
}