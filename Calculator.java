import java.util.Scanner;
public class Calculator {

    public static void main(String args[]) {
        while (true) { 

            System.out.println("==== Calculator ==== ");
            System.out.println("1. Addition ");
            System.out.println("2. Subtract ");
            System.out.println("3. Multiply ");
            System.out.println("4. Divide  ");
            System.out.println("5. Module  ");
            System.out.println("6. Square ");
            System.out.println("7. Exit  \n");


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice 1 to 7 : ");
        int choice = sc.nextInt();

    
        if (choice == 7) {
            System.out.println("Thankyou for using Calculator!");
            break; 
        }


        if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice! Please select between 1 and 7.");
                continue; 
        }


        System.out.print("Enter Your num1 :  ");
        int num1 = sc.nextInt();

        System.out.print("Enter Your num2 : ");
        int num2 = sc.nextInt();


        switch(choice){
            case 1:
                int sum = num1+num2;
                System.out.println("Sum  is =  " +sum);
                System.out.println("\n");

                break;

                case 2:
                int sub = num1 - num2;
                System.out.println("Sub  is =  " + sub);
                System.out.println("\n");
                break;

                case 3:
                int multiply = num1 * num2;
                System.out.println("Multiply  is =  " + multiply);
                System.out.println("\n");

                break;

                case 4:
                int divide = num1 / num2;
                System.out.println("Divide  is =  " + divide);
                System.out.println("\n");

                break;

                case 5:
                int module = num1 % num2;
                System.out.println("Module  is =  " + module);
                System.out.println("\n");

                break;

                case 6:
                int sum1 = num1 + num2;
                int square = sum1 * sum1;
                System.out.println("Square  is =  " + square);
                System.out.println("\n");

                break;
                
                
        }


    }}}


