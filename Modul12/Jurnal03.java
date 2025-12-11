import java.util.Scanner;
<<<<<<< HEAD

=======
>>>>>>> 6beec2e2b3934671a3c4b2c8bed70749b0eac642
public class Jurnal03 {
public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

<<<<<<< HEAD
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

=======
>>>>>>> 6beec2e2b3934671a3c4b2c8bed70749b0eac642
        int mulai = 0;
        int counter = 0;
        int akhir = N;
        int loop = 0;
        
        int[][] matriks = new int[N][N];

        while (akhir > 0) {
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[i + loop][mulai+loop] = counter;
            }
            akhir--;
            for (int i= mulai; i<akhir; i++) {
                counter++;
                matriks[akhir + loop][i+ 1+ loop] = counter;
            }
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[akhir - i - 1 + loop][akhir + loop] = counter;
            }
            akhir--;
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[mulai+loop][akhir - i + loop] = counter;
            }
            loop++;
        }        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(matriks[i][j]);
                if (j < N - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}