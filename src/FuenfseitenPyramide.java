public class FuenfseitenPyramide extends abstractPyramid {
    private float seitenlaenge;

    public FuenfseitenPyramide(float hoehe, float seitenlaenge) {
        super(hoehe);
        this.seitenlaenge = seitenlaenge;
    }

    public float getSeitenlaenge() {
        return seitenlaenge;
    }

    public double calcPerimeter() {
        return 5 * seitenlaenge;
    }

    public double calcSyprine() {
        double a = seitenlaenge;
        double h = getHoehe();
        double s = Math.sqrt((a / (2 * Math.tan(Math.toRadians(54)))) * (a / (2 * Math.tan(Math.toRadians(54)))) + h * h);
        return (5 * a * s) / 2;
    }
    @Override
    public double calcVolumen() {
        double a = seitenlaenge;
        double apothem = a / (2 * Math.tan(Math.toRadians(54)));
        double grundflaeche = (5 * a * apothem) / 2;
        return (grundflaeche * getHoehe()) / 3;
    }
}
