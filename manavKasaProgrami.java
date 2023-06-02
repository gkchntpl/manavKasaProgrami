import java.util.Scanner;
public class manavKasaProgrami {
    public static void main(String[] args) {

        double a, e, d, m, p;

        a = 2.14;
        e = 3.67;
        d = 1.11;
        m = 0.95;
        p = 5.0;

        Scanner input = new Scanner(System.in);

        double aKg, eKg, dKg, mKg, pKg;

// kg kusüratlı da olableceği için double oluşturdum. örn: 3.2 kg.

        System.out.print("Kaç kilogram armut aldınız?: ");
        aKg = input.nextDouble();

        System.out.print("Kaç kilogram elma alınız?: ");
        eKg = input.nextDouble();

        System.out.print("Kaç kilogram domates aldınız?: ");
        dKg = input.nextDouble();

        System.out.print("Kaç kilogram muz aldınız?: ");
        mKg = input.nextDouble();

        System.out.print("Kaç kilogram patlıcan aldınız?: ");
        pKg = input.nextDouble();

        double toplamUcret;

        toplamUcret = a*aKg + e*eKg + d*dKg + m*mKg + p*pKg;

        System.out.println("Ödenecek Toplam Tutar: " + toplamUcret);
    }
}
