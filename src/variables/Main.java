package variables;

public class Main {

    public static void main(String[] args) {

        int age = 30;
        int year = 2026;
        double quantity = 1.5;

        double price = 19.99;
        double gpa = 3.56;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Andre";
        String food = "Pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println(age);
        System.out.println(year);
        System.out.println("The year is: " + year);

        System.out.println("$" + price);
        System.out.println(gpa + "/4");
        System.out.println(temperature);

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        System.out.println(isStudent);
        System.out.println("Hello " + name);
        System.out.println("Your favorite food is " + food);
        System.out.println("Your email is " + email);
        System.out.println("Your choice is a " + color + " " + year + " " + car);

        if(isStudent){
            System.out.println("Hey, you're a student!");
        }
    }
}
