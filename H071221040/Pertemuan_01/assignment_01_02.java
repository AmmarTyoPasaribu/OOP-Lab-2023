import java.util.InputMismatchException;
import java.util.Scanner;

public class Nomor02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int n = scanner.nextInt();

      int countDecimal = 0;
      int countInteger = 0;

      for (int i = 0; i < n; i++) {
        float number = scanner.nextFloat();

        if (number - (int)number > 0) {
          countDecimal++;
        } else {
          countInteger++;
        }
      }

      System.out.printf("%d Bilangan Bulat\n", countInteger);
      System.out.printf("%d Bilangan Desimal\n", countDecimal);
    } catch (InputMismatchException e) {
      System.out.println("Please input a number!");
      e.printStackTrace();
    }

    scanner.close();
  }
}
