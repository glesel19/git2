//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          System.out.println("Hello World");
          System.out.println("Endri ca kena me ba");
        FuenfseitenPyramide pyramide = new FuenfseitenPyramide(10, 5);

        System.out.println("Seitenlänge: " + pyramide.getSeitenlaenge());
        System.out.println("Höhe: " + pyramide.getHoehe());
        System.out.println("Volumen: " + pyramide.calcVolumen());
    }
}
