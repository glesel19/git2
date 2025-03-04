public abstract class abstractPyramid {
    float hoehe;

    public abstractPyramid(float hoehe) {
        this.hoehe = hoehe;
    }

    public float getHoehe() {
        return hoehe;
    }

    public double calcVolumen(){ return 0; }
}
