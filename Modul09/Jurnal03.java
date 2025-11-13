import java.util.*;
public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        int angkaq = 0;
        String hasil = null;
        for (int i=1; i <= angkaq; i++){
            if (angka % i == 0)
            angkaq++;
        }
        if (angkaq == 2){
            hasil = "YA";
        } else {
            hasil = "BUKAN";
        }
    }
} 
