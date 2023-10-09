import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void clearscreen()
    {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Clear the screen for Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Clear the screen for Unix/Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("\n\tMenu\n1. Addition\n2. Sub\n3. Mul\n4. Division");

            System.out.print("Enter your choice: ");
            int choice=s.nextInt();
            System.out.print("Enter your 1st no. : ");
            int a=s.nextInt();
            System.out.print("Enter your 2nd no. : ");
            int b=s.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Sum is: " + (a + b));
                    break;
                }
                case 2: {
                    System.out.println("Sub is: " + (a - b));
                    break;
                }
                case 3: {
                    System.out.println("Mul is: " + (a * b));
                    break;
                }
                case 4: {
                    System.out.println("Div is: " + (a / b));
                    break;
                }
                default: {
                    System.out.println("Invaid option");
                    break;
                }
            }
            System.out.print("Do you want to continue?  ");
            if (s.next().toUpperCase(Locale.ROOT).charAt(0)=='Y')
            {
                clearscreen();
                continue;
            }
            else {
                break;
            }
        }
    }
}
