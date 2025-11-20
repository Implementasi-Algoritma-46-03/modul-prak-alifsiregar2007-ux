public class TP03 {

    public static void main(final String[] args) {
        int batas = 100;

        for (int i = 2; i <= batas; i++) {
            boolean apakahPrima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    apakahPrima = false;
                    break; 
                }
            }
            
            if (apakahPrima) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println();
    }
}