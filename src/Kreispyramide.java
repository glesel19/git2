public class Kreispyramide extends abstractPyramid {
    private float radius;

    public Kreispyramide(float hoehe, float radius) {
        super(hoehe);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public double calcVolumen() {
        double grundflaeche = Math.PI * radius * radius;
        return (grundflaeche * getHoehe()) / 3;
    }
}