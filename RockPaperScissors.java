import java.util.Scanner;

public class test2 {
   public static void main (String [] args) {
      Scanner s = new Scanner(System.in);
      int score = 0;
      while (s.hasNextLine()) {
         String one = s.next();
         String two = s.next();
         
         switch (two) {
            case "X": 
               score += 1;
               if (one.equals("C")) {
                  score += 6;
               }
               if (one.equals("A")) {
                  score += 3;
               }
               break;
            case "Y":
               score += 2;
               if (one.equals("A")) {
                  score += 6;
               }
               if (one.equals("B")) {
                  score += 3;
               }
               break;
            case "Z": 
               score += 3;
               if (one.equals("B")) {
                  score += 6;
               }
               if (one.equals("C")) {
                  score += 3;
               }
               break;
         }
      
      }
      System.out.print(score);
   }
   
}
