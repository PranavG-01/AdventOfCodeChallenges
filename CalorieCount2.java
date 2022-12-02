import java.util.Scanner;

public class test {
   public static void main(String[] args) {
      Scanner stdin = new Scanner(System.in);
      int count = 0;
      int max = 0;
      int second = 0, third = 0;
      String tracker;
      while (stdin.hasNextLine()) {

         tracker = stdin.nextLine();

         if (tracker.equals("")) {
            if (count > max) {
               third = second;
               second = max;
               max = count;
               count = 0;
            } else if (count > second) {
               third = second;
               second = count;
            } else if (count > third) {
               third = count;
            }
            count = 0;
            continue;
         }
         count += Integer.parseInt(tracker);
      }
      System.out.print(max + second + third);
      stdin.close();
   }
}
