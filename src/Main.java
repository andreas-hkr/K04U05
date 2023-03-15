import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bestäm om sidorna i en triangel är:
        //   Liksidig  - Alla sidor är lika långa
        //   Likbent   - Två sidor är lika långa
        //   Oliksidig - Alla sidor är olika långa

        // Om vi har längden av sidorna A och B, samt vinkeln V
        // mellan dessa kan vi räkna ut längden på sidan C med:
        // Math.sqrt(A*A + B*B - 2*A*B*cos(V_radianer) <-- Obs! Radianer

        // Vinkel i grader till radianer med:
        // radianer = vinkel * 2 * pi / 360

        // Tips: Jämför inte doubles direkt med ==

        Scanner input = new Scanner(System.in);
        System.out.print("Ange längen på A: ");
        double a = input.nextDouble();
        System.out.print("Ange längen på B: ");
        double b = input.nextDouble();
        System.out.print("Ange vinkeln V: ");
        double v = input.nextDouble();

        double rad = v * 2 * Math.PI / 360;
        double c = Math.sqrt(a*a + b*b - 2*a*b*Math.cos(rad));

        double small = 1e-10;
        if (Math.abs(a-b) < small && Math.abs(a-c) < small && Math.abs(b-c) < small) {
            System.out.println("Liksidig");
        } else if (Math.abs(a-b) < small || Math.abs(a-c) < small || Math.abs(b-c) < small) {
            System.out.println("Likbent");
        } else {
            System.out.println("Oliksidig");
        }
    }
}