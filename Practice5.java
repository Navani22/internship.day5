package internship.day5;

import java.util.Scanner;

public class Practice5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to get factorial :");
    int n = sc.nextInt();
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }
    System.out.println("Factorial of " + n + " is: " + factorial);
  }
}
