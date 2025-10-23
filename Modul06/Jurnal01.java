import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String nama1 = s.nextLine();
        String nama2 = s.nextLine();
        int waktu = s.nextInt();

        System.out.println("Halo, " + nama1 + ". " + waktuSapa(waktu));
        System.out.println("Halo, " + nama2 + ". " + waktuSapa(waktu));
    
    }
    private static String waktuSapa(int waktu) {
        if (waktu >= 06 && waktu <= 11)
            return "Selamat pagi.";
        else if (waktu >= 12 && waktu <= 14)
            return "Selamat siang.";
        else if (waktu >= 15 && waktu <= 17)
            return "Selamat sore.";
        else
            return "Selamat malam.";
    }
}
