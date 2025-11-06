import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int bil = s.nextInt();

        int puluhRibu = bil / 10000;
        int ribuan = bil / 1000 % 10;
        int ratusan = bil % 1000 / 100;
        int puluhan = bil % 100 / 10;
        int satuan = bil % 10;

        int digit1 = faktorial(puluhRibu);
        int digit2 = faktorial(ribuan);
        int digit3 = faktorial(ratusan);
        int digit4 = faktorial(puluhan);
        int digit5 = faktorial(satuan);

        int hasil = 0;
        if (bil < 10) {
            hasil = digit5;
        } else if (bil < 100) {
            hasil = digit4 + digit5;
        } else if (bil < 1000) {
            hasil = digit3 + digit4 + digit5;
        } else if (bil <10000) {
            hasil = digit2 + digit3 + digit4 + digit5;
        } else{
            hasil = digit1 + digit2 + digit3 + digit4 + digit5;
        }


        if (hasil == bil)
            System.out.println("YA");
        else 
            System.out.println("BUKAN");

        
    }
    private static int faktorial(int a) {
        int b = 1;
        while (a >= 1) {
            b = b * a;
            a--;
        }
        return b;
    }
}