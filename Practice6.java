package internship.day5;

import java.util.Scanner;

public class Practice6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to get factorial :");
    int n = sc.nextInt();
    int i = 1;
    long factorial = 1;
    while (i <= n) {
      factorial = factorial * i;
      i++;
    }
    System.out.println("Factorial of " + n + " is : " + factorial);
  }
}