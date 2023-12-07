import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        //Scanner Exercise
        Scanner scanner = new Scanner(System.in);

        /*System.out.format("Enter a number: ");
        int userNumber = scanner.nextInt();
        System.out.format("Your number is: "+ userNumber +"%n");

         */

        /*System.out.format("Enter 3 words:");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();
        System.out.format("Your words are: %n"+ wordOne +"%n"+ wordTwo +"%n"+ wordThree +"%n");

         */

        //System.out.format("Enter a sentence: ");
        //String sentence = scanner.nextLine();
        //System.out.format("Your sentence is:"+ sentence +"");

        System.out.format("What is the length of your Codeup classroom in ft?");
        String length = scanner.nextLine();
        System.out.format("What is the width of your Codeup classroom in ft?");
        String width = scanner.nextLine();
        int widthNew = Integer.parseInt(width);
        int lengthNew = Integer.parseInt(length);
        System.out.print("The area of the Codeup classroom is ");
        System.out.print(widthNew * lengthNew);
        System.out.println("ft.");
        System.out.print("The perimeter of the Codeup classroom is ");
        System.out.print(widthNew * 2 + lengthNew * 2);
        System.out.print("ft.");
    }
}
