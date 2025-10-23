import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();       // bilangan pertama
        char O = scanner.next().charAt(0); // tanda operasi
        int B = scanner.nextInt();       // bilangan kedua

     switch (O) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                if (B == 0) {
                    System.out.println("Error");
                } else {
                    double hasil = (double) A / B;
                    // cetak dengan 7 angka di belakang koma (dibulatkan)
                    System.out.printf("%.7f%n", hasil);
                }
                break;
            default:
                System.out.println("Hari tidak valid!");
        }

        scanner.close();
    }
}