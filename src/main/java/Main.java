import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz liczbe: ");
    int a = scanner.nextInt();
    System.out.println("Znak: ");
    char znak = scanner.next().charAt(0);

    for(int i = 0; i < a; i++)
      {
        if(i == 0 || i == a - 1)
        {
        for(int j = 0; j < a; j++)
          {
            System.out.print(znak);
          }
        System.out.print('\n');
        }
        else
        {
          for(int j = 0; j < a; j++)
            {
              if(j == 0 || j == a - 1)
              {
                System.out.print(znak);
              }
              else
              {
                System.out.print(" ");
              }
            }
          System.out.print('\n');
        }
      }
    

  }
}