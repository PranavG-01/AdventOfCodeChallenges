import java.util.Scanner;

public class test2 {
   public static void main (String [] args) {
      Scanner s = new Scanner(System.in);
      int score = 0;
      while (s.hasNextLine()) {
         String one = s.next();
         String two = s.next();
         
         switch (two) {
            case "X": //lose
               if (one.equals("A")) {
                  score += 3;// you choose Z
               }
               if (one.equals("B")) {
                  score += 1;//you choose X
               }
               if (one.equals("C")) {
                  score += 2;//you choose Y
               }
               break;
            case "Y": //draw
               score += 3;
               if (one.equals("A")) {
                  score += 1;// you choose X
               }
               if (one.equals("B")) {
                  score += 2;//you choose Y
               }
               if (one.equals("C")) {
                  score += 3;//you choose Z
               }
               break;
            case "Z": //win
               score += 6;
               if (one.equals("A")) {
                  score += 2;// you choose Y
               }
               if (one.equals("B")) {
                  score += 3;//you choose Z
               }
               if (one.equals("C")) {
                  score += 1;//you choose X
               }
               break;
         }
      
      }
      System.out.print(score);
   }
   
}
