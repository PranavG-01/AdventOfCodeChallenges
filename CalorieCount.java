import java.util.Scanner;

public class CalorieCount {
  public static void main (String[] args) {
    Scanner stdin = new Scanner(System.in);
    int count = 0;
    int max = 0;
    while (stdin.hasNext()) {
        count += stdin.nextInt();
    
        if (stdin.hasNext() == "") {
            if (count > max) {
                max = count;
                count = 0;
            }
        }
    }
    System.out.print(max);
  }
}
