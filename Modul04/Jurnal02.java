import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        
        int penghasilanJuta = input.nextInt();
        
        double persentasePajak;
        double besarPajak;
        
        // Menentukan persentase pajak berdasarkan penghasilan
        if (penghasilanJuta <= 50) {
            persentasePajak = 5.0;
        } else if (penghasilanJuta <= 250) {
            persentasePajak = 15.0;
        } else if (penghasilanJuta <= 500) {
            persentasePajak = 25.0;
        } else {
            persentasePajak = 30.0;
        }
        
        // Menghitung besar pajak dalam rupiah
        besarPajak = (persentasePajak / 100.0) * penghasilanJuta * 1000000;
        
        // Menghitung penghasilan bersih
        double penghasilanBersih = (penghasilanJuta * 1000000) - besarPajak;
        
        // Output sesuai format
        System.out.println("Penghasilan kotor = " + penghasilanJuta + " juta Rupiah");
        System.out.printf("Pajak %.0f%% = Rp. %.0f%n", persentasePajak, besarPajak);
        System.out.printf("Penghasilan bersih = Rp. %.0f%n", penghasilanBersih);
        
        input.close();
}
}