import java.util.Scanner;

public class positivenegativenumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive.");
        }
        else if(num<0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero.");
        }

        // we can code with another method
        if(num > 0 ){
            System.out.println("The number is positive.");
        }
        else if(num < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero.");
        }
    }
}




