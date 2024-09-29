import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double distance, age, type, total;

        while (true) {
            System.out.print("Please, determine the distance of the road to be traveled (KM): ");
            distance = scan.nextDouble();

            System.out.print("Please, enter your age: ");
            age = scan.nextDouble();

            System.out.println("1- One-way");
            System.out.println("2- Round-trip");
            System.out.print("Please, enter the type of trip: ");
            type = scan.nextDouble();

            if (age > 0 && distance > 0 && type >= 1 && type <= 2) {
                break;
            } else {
                System.out.println("You have entered incorrect data! Try again.");
            }
        }

        total = distance * 1.5;

        if (age < 12) {
            total *= 0.5;
        } else if (age >= 12 && age <= 24) {
            total *= 0.9;
        } else if (age > 65) {
            total *= 0.7;
        }

        if (type == 2) {
            total *= 0.8;
            total *= 2;
        }

        System.out.println("Total ticket price: " + total + " TL.");
    }
}
