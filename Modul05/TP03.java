import java.util.Scanner; 
public class TP03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String nama = s.nextLine();

        int sisi, panjang, lebar, alas, tinggi, diameter;
        int keliling = 0;
        int luas = 0;
        double pi = 3.14;

        switch (nama) {
            case "Persegi" :
            sisi = s.nextInt(); 
            luas = sisi * sisi; 
            keliling = 4 * sisi;
            System.out.println(luas + " " + keliling);
            break;

            case "Persegi Panjang" :
            panjang = s.nextInt();
            lebar = s.nextInt();
            luas = panjang * lebar;
            keliling = 2 * (panjang + lebar);
            System.out.println(luas + " " + keliling);
            break;

            case "Segitiga" :
            alas = s.nextInt();
            tinggi = s.nextInt();
            luas = (int) (0.5 * alas * tinggi); 
            double miring = Math.sqrt(alas * alas + tinggi * tinggi);
            keliling = (int) (alas + tinggi + miring + 0.5);
            System.out.println(luas + " " + keliling);
            break ;

            case "Lingkaran" : 
            diameter = s.nextInt();
            double r = (double) diameter / 2.0;
            double luasLingkaran = pi * r * r;
            double kelilingLingkaran= 2 * pi * r;
            System.out.printf("%.2f %.2f\n", luasLingkaran, kelilingLingkaran);

        }
    }
}