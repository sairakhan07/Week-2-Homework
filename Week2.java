import java.util.Scanner;

public class Week2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        int birthYear = 2026 - age;
        System.out.println("You were born in: " + birthYear);
        if(age >= 18) {
            System.out.println("You are 18 or older.");
        }

        System.out.print("Enter your grade (A, B, C, D, E or F): ");
        String grade = input.next().toUpperCase();
        switch (grade)
        {
            case "A":
                System.out.println("Classification: 1st");
                break;

            case "B":
                System.out.println("Classification: 2:1");
                break;

            case "C":
                System.out.println("Classification: 2:2");
                break;

            case "D":
                System.out.println("Classification: 3rd");
                break;

            case "E":
                System.out.println("Classification: Ordinary");
                break;

            case "F":
                System.out.println("Classification: Fail");
                break;

            default:
                System.out.println("Invalid grade entered.");
        }

        for (int i = 0; i <= 9; i++)
        {
            System.out.println(i);
        }

        for (int i = 1; i <= 12; i++)
        {
            System.out.println(i + " x 7 = " + (i * 7));
        }

        System.out.print("Enter a number for the times table: ");
        int number = input.nextInt();
        for (int w = 1; w <= 12; w++)
        {
            System.out.println(w + " x " + number + " = " + (w * number));
        }

        char choice;
        do
        {
            System.out.print("Enter a number for the times table: ");
            int num = input.nextInt();
            for (int z = 1; z <= 12; z++)
            {
                System.out.println(z + " x " + num + " = " + (z * num));
            }
            System.out.print("Do you want to see another times table? (y/n): ");
            choice = input.next().toLowerCase().charAt(0);

        } while (choice == 'y');
        System.out.println("Goodbye!");

        System.out.print("Enter your exam mark (0-100): ");
        int mark = input.nextInt();
        if (mark >= 70 && mark <= 100)
        {
            System.out.println("Grade: A");
        }
        else if (mark >= 60)
        {
            System.out.println("Grade: B");
        }
        else if (mark >= 50)
        {
            System.out.println("Grade: C");
        }
        else if (mark >= 40)
        {
            System.out.println("Grade: D");
        }
        else if (mark >= 0)
        {
            System.out.println("Grade: U");
        }
        else
        {
            System.out.println("Invalid mark entered.");
        }

        for (int x = 1; x <= 10; x++)
        {
            if (x % 2 == 0)
            {
                System.out.println(x);
            }
        }

        input.close();
    }
}