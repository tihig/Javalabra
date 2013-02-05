/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viivi
 */
public class Main {

   static int kutsut;

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      kutsut = 1;
      System.out.println(bin(6, 2));
      System.out.println(bin2(6, 2));



   }

   private static int bin(int n, int k) {
      int luku = 0;
      if (k == 0 || n == k) {
         return 1;
      }

      return bin(n - 1, k - 1) + bin(n - 1, k);
   }

   private static int bin2(int n, int k) {
      
      return kolmio(n, k);
   }

   public static int kolmio(int n, int k) {
      int x = n+1;
      int triangle[][] = new int[x][x];
      for (int i = 0; i < x; i++) {
         for (int j = 0; j < x; j++) {
            triangle[i][j] = 0;
         }
      }
      for (int i = 0; i < x; i++) {
         triangle[i][0] = 1;
      }
      for (int i = 1; i < x; i++) {
         for (int j = 1; j < x; j++) {
            triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
         }
      }
//      for (int i = 0; i < x; i++) {
//         for (int j = 0; j <= i; j++) {
//            System.out.print(triangle[i][j] + " ");
//         }
//         System.out.println();
//      }
      return triangle[x-1][k];
   }
}
