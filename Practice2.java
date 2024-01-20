package internship.day5;

import java.util.Scanner;

public class Practice2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to evaluate the sum of n even numbers :");
    int n = sc.nextInt();
    int sum = 0;
    int i = 0;

    while (i <= n) {
      sum = sum + (2 * i);
      i++;
    }
    System.out.println(sum);

    sc.close();
  }
}
