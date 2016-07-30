
public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) throws TriangleException {
        if (a + b <= c || b + c <= a || c + a <=   b) throw new TriangleException();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleKind getKind() {
        if (a == b && b == c) return TriangleKind.EQUILATERAL;
        if (a == b || b == c || c == a) return TriangleKind.ISOSCELES;
        return TriangleKind.SCALENE;
    }
}
