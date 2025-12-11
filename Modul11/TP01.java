import java.util.Scanner;

public class TP01 {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        s.nextLine(); // buang enter

        String[] peserta = new String[N];

        for (int i = 0; i < N; i++) {
            peserta[i] = s.nextLine();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Bulan " + (i+1) + ": " + peserta[i]);
        }
    }
<<<<<<< HEAD
}
 
=======
}
>>>>>>> 6beec2e2b3934671a3c4b2c8bed70749b0eac642
