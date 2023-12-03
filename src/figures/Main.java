package figures;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Площадь прямоугольника 5см*8см = " + rectangle.getArea());

        Square square = new Square(7);
        System.out.println("Площадь квадрата 7см*7см = " + square.getArea());

        Rhombus rhombus = new Rhombus(4, 7);
        System.out.println("Площадь ромба со стороной 4см и высотой 7см = " + rhombus.getArea());

        Circle circle = new Circle(6);
        System.out.println("Площадь круга с радиусом 6см = " + circle.getArea());

        Parallelogram parallelogram = new Parallelogram(3, 7);
        System.out.println("Площадь параллелограмма со стороной 3см и высотой 7см = " + parallelogram.getArea());
    }
}
