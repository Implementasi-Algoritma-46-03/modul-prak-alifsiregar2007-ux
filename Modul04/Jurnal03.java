import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int Dira = s.nextInt();
        int Radi = s.nextInt();
        int Idar = s.nextInt();
        
    if ( Dira < Radi && Dira < Idar ) {
        if ( Radi < Idar ) {
            System.out.println("Dira, Radi, Idar");
        } else {
            System.out.println("Dira, Idar, Radi");
        }
    } else if ( Radi < Dira && Radi < Idar ) {
        if ( Dira < Idar ) {
            System.out.println("Radi, Dira, Idar");
        } else {
            System.out.println("Radi, Idar, Dira");
        }
    } else {
        if ( Dira < Radi ) {
            System.out.println("Idar, Dira, Radi");
        } else {
            System.out.println("Idar, Radi, Dira");
        }
    }
        s.close();
}
}
