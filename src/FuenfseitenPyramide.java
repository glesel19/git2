public class FuenfseitenPyramide extends abstractPyramid {
    private float seitenlaenge;

    public FuenfseitenPyramide(float hoehe, float seitenlaenge) {
        super(hoehe);
        this.seitenlaenge = seitenlaenge;
    }

    public float getSeitenlaenge() {
        return seitenlaenge;
    }
    @Override
    public double calcVolumen() {
        double a = seitenlaenge;
        double apothem = a / (2 * Math.tan(Math.toRadians(54)));
        double grundflaeche = (5 * a * apothem) / 2;
        return (grundflaeche * getHoehe()) / 3;
    }
}
