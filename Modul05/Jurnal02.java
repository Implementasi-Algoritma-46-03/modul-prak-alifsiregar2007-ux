import java.util.Scanner;

public class Jurnal02 {
   public Jurnal02() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String var2 = var1.next().toLowerCase();
      int var3 = var1.nextInt();
      String[] var4 = new String[]{"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
      boolean var5 = true;
      byte var8;
      switch (var2) {
         case "senin":
            var8 = 0;
            break;
         case "selasa":
            var8 = 1;
            break;
         case "rabu":
            var8 = 2;
            break;
         case "kamis":
            var8 = 3;
            break;
         case "jumat":
            var8 = 4;
            break;
         case "sabtu":
            var8 = 5;
            break;
         case "minggu":
            var8 = 6;
            break;
         default:
            System.out.println("Hari tidak valid!");
            return;
      }

      int var6 = (var8 + var3) % 7;
      System.out.println(capitalize(var4[var6]));
      var1.close();
   }

   static String capitalize(String var0) {
      String var10000 = var0.substring(0, 1).toUpperCase();
      return var10000 + var0.substring(1);
   }
}
