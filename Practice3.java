package internship.day5;

import java.util.Scanner;

public class Practice3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to get table :");
    int n = sc.nextInt();
    for (int i = 0; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + n * i);
    }
  }
}