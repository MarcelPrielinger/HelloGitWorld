package Main;

import javax.swing.*;
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
            String opp;

            System.out.printf("Geben Sie bitte einen Werte ein: ");
            no_1 = scanner.nextInt();
            System.out.printf("Geben Sie noch einen Wert an: ");
            no_2 = scanner.nextInt();
            System.out.printf("Bitte geben Sie eine Rechenopperation an:");
            opp = scanner.next();


            System.out.printf("Ihr Ergebnis ist: ");
            if(opp.equals("+"))
            {
                System.out.printf("%d", no_1 + no_2);
            }
            else if (opp.equals("-"))
            {
                System.out.printf("%d",no_1 - no_2);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Fehler");
        }
    }
}
