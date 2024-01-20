package internship.day5;

import java.util.Scanner;

public class Practice7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number : ");
    int n = sc.nextInt();

    int i = n;
    int j;

    while (i > 0) {
      j = 1;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.print("\n");
      i--;
    }
  }
}
