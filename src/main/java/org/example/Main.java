
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();

        double average = (m1 + m2 + m3) / 3;

        System.out.println("Average = " + average);

        if (average >= 90)
            System.out.println("Grade = A");
        else if (average >= 75)
            System.out.println("Grade = B");
        else if (average >= 50)
            System.out.println("Grade = C");
        else
            System.out.println("Grade = F");

        sc.close();
    }
}
