import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Menu();
    }
    public static void Menu(){
        System.out.println("Please select an operation : "
                + "\n1.Addition "
                + "\n2.Subtraction "
                + "\n3.Multiplication "
                + "\n4.Division ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        if(choice == 1){
            Util.Addition(a, b);
        } else if (choice == 2) {
            Util.Subtraction(a, b);
        } else if (choice == 3) {
            Util.Multiplication(a, b);
        }else if(choice == 4) {
            Util.Division(a, b);
        }
        else {
            System.out.println("The choice is wrong !");
        }
    }

}