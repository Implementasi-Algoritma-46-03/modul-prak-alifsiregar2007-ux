import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner sr = new Scanner (System.in);
        double gram = sr. nextDouble();
        double hari = sr. nextDouble();

        while (hari >= 10.0) {
            gram = gram / 2.0;
            hari -= 10.0;
        }
        System.out.printf("%.3f", gram);


    }
}
