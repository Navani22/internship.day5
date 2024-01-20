package internship.day5;

public class Practice9 {
    public static void main(String[] args) {
  
      int sum = 0;
      for (int i = 1; i <= 10; i++) {
        int numberInTable = 8 * i;
  
        sum += numberInTable;
      }
      System.out.println("The sum of numbers in the multiplication table of 8 is: " + sum);
    }
  }