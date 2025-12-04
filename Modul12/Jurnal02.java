import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[][] matriks = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                matriks[i][j] = s.nextInt();
            }
        }

        if (pemenang(matriks) == 1)
            System.out.println("O");
        else if (pemenang(matriks) == 2)
            System.out.println("X");
        else {
            if (seri(matriks)) {
                System.out.println("-");
            }
            else {
                System.out.println("?");
            }
        }
    }

    private static int pemenang(int matriks[][]) {
        for (int i=0; i<matriks.length; i++) {
            if (matriks[i][0] == matriks[i][1] && matriks[i][1] == matriks[i][2] && matriks[i][0] !=0) {
                return matriks[i][0];
            }
        }
        for (int j=0; j<matriks.length; j++) {
            if (matriks[0][j] == matriks[1][j] && matriks[1][j] == matriks[2][j] && matriks[0][j] !=0) {
                return matriks[0][j];
            }
        }
        if (matriks[0][0] == matriks[1][1] && matriks[1][1] == matriks[2][2] && matriks[0][0] != 0)
            return matriks[0][0];
        if (matriks[2][0] == matriks[1][1] && matriks[1][1] == matriks[0][2] && matriks[2][0] != 0 )
            return matriks[2][0];
        return 0;
    }
    
    private static boolean seri(int matriks[][]) {
        for (int i=0; i<matriks.length; i++) {
            for (int j=0; j<matriks.length; j++) {
                if (matriks[i][j] == 0)
                    return false;
            }
        }
        return false;
    }
}
