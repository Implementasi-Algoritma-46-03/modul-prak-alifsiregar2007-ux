import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int Kodemenu = s.nextInt();
        int jumlahmakanan = s.nextInt();
        
        String menu = "";
        int harga = 0;

        switch (Kodemenu) {
            case 1: menu = "Nasi Goreng"; harga = 15; break;
            case 2: menu = "Mie Goreng / Nyemek"; harga = 18; break;
            case 3: menu = "Kwetiau Goreng / Nyemek"; harga = 20; break;
            case 4: menu = "Capcay Goreng / Kuah"; harga = 23; break;
        }
        
        int totalharga = harga * jumlahmakanan;
        System.out.println( menu + " " + jumlahmakanan + " buah, total harga Rp. " + totalharga + ".000");       
        s.close();

    }
}
