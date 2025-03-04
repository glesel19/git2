public class rrethi {

    public class Rrethor {
        private double radius;
        private double hohe;

        // Konstruktor
        public Rrethor(double radius, double hohe) {
            this.radius = radius;
            this.hohe = hohe;
        }

        // Getter-Methoden
        public double getRadius() {
            return radius;
        }

        public double getHohe() {
            return hohe;
        }

        // Methode zur Berechnung des Volumens
        public double calcVolume() {
            return Math.PI * Math.pow(radius, 2) * hohe;
        }

        // Hauptmethode zum Testen
        public static void main(String[] args) {
            Rrethor zylinder = new Rrethor(5, 10);
            System.out.println("Volumen: " + zylinder.calcVolume());
        }
}
