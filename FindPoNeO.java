import java.util.Scanner;

public class FindPoNeO {
    public static void main(String [] args){
        int number;
        System.out.println("Enter the number");
        Scanner scanner =  new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        if(number > 0 ){
            System.out.println("Number " + number + " is positive");
        }
        else if(number < 0){
            System.out.println("Number " + number + " is negative");
        }
        else {
            System.out.println("Number " + number + " is zero");
        }
    }
}
 
