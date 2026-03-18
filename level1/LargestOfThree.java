import java.util.Scanner;

public class LargestOfThree{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number1: ");
        int number2 = sc.nextInt();
        System.out.print("Enter a number1: ");
        int number3 = sc.nextInt();

        boolean FirstLargest = (number1 > number2) && (number1 > number3);
        boolean SecondLargest = (number2 > number1) && (number2 > number3);
        boolean ThirdLargest = (number3 > number2) && (number3 > number1);

        System.out.println("Is the first Number the Largest " + FirstLargest);
        System.out.println("Is the Second Number the Largest " + SecondLargest);
        System.out.println("Is the Third Number the Largest " + ThirdLargest);

        sc.close();
    }
}