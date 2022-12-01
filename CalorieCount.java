import java.util.*;

public class CalorieCount {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int count = 0;
        int max = 0;
        String tracker;
        while (stdin.hasNextLine()) {
           
           tracker = stdin.nextLine();
           
           if (tracker.equals("")) {
              if (count > max) {
                 max = count;
                 count = 0;
              } else {
                 count = 0;
              }
              continue;
           }
           count += Integer.parseInt(tracker);
        }
        System.out.print(max);
        stdin.close();
     }
  }
  
