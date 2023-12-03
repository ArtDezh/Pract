package figures;

public class Rhombus implements Figure {
    private final double a;
    private final double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}
