
    public class VierSeitenPyramide extends abstractPyramid {
        private float seitenlaenge;

        public VierSeitenPyramide(float hoehe, float seitenlaenge) {
            super(hoehe);
            this.seitenlaenge = seitenlaenge;
        }

        public float getSeitenlaenge() {
            return seitenlaenge;
        }

        public void setSeitenlaenge(float seitenlaenge) {
            this.seitenlaenge = seitenlaenge;
        }

        public double calcGrundflaeche() {
            return seitenlaenge * seitenlaenge;
        }

        @Override
        public double calcVolumen() {
            return (1.0 / 3.0) * calcGrundflaeche() * getHoehe();
        }

        public double calcMantelflaeche() {
            double s = Math.sqrt((seitenlaenge / 2) * (seitenlaenge / 2) + getHoehe() * getHoehe());
            return 2 * seitenlaenge * s;
        }

        public double calcOberflaeche() {
            return calcGrundflaeche() + calcMantelflaeche();
        }
    }

