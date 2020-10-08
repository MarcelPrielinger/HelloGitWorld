package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try {
            Scanner scanner = new Scanner(System.in);
            int no_1;
            int no_2;

            System.out.printf("Geben Sie bitte einen Werte ein: ");
            no_1 = scanner.nextInt();
            System.out.printf("Geben Sie noch einen Wert an: ");
            no_2 = scanner.nextInt();

            int result = no_1 + no_2;

            System.out.println("Ihr Ergebnis ist: " + result);
        }
        catch (Exception ex)
        {
            System.out.println("Fehler");
        }
    }
}
