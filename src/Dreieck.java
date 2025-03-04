public class Dreieck extends abstractPyramid {
    private double a;
    private double b;
    private double c;


    public Dreieck(double a, double b, double c, float hoehe) {
        super(hoehe);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double calcPerimeter() {
        return a + b + c;
    }


    public double calcArea() {
        double s = calcPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    @Override
    public double calcVolumen() {
        return (calcArea() * hoehe) / 3.0;
    }


    public double calcOberflaeche() {
        double baseArea = calcArea();
        // Beispiel: Berechne die Schräghöhe der Seite a
        double slantHeightA = Math.sqrt(Math.pow(hoehe, 2) + Math.pow((2 * calcArea() / a), 2));
        double slantHeightB = Math.sqrt(Math.pow(hoehe, 2) + Math.pow((2 * calcArea() / b), 2));
        double slantHeightC = Math.sqrt(Math.pow(hoehe, 2) + Math.pow((2 * calcArea() / c), 2));

        double lateralArea = (a * slantHeightA + b * slantHeightB + c * slantHeightC) / 2.0;
        return baseArea + lateralArea;

    }


}
