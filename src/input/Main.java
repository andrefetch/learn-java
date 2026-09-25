package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // scanner.NextLine() -> only use this when we want to remove the \n from the input buffer.

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Hello " + name + ", ");
        System.out.println("you are " + age + " years old!");
        System.out.println("Your gpa is: " + gpa);

        if(isStudent){
            System.out.println("You are enrolled as a student.");
        } else {
            System.out.println("You are NOT enrolled as a student.");
        }

         scanner.close();
         */

        // area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm^2");

        scanner.close();
    }
}
