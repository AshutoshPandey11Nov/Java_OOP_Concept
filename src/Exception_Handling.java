import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try{
            int n=scanner.nextInt();
            int ans=n*n;
            System.out.println("multiplication of number by number is "+ans);
        }
        catch (InputMismatchException n){
            System.out.println("Please enter a correct number in next session");
        }
        finally {
            System.out.println("The Session is over");
        }

    }
}
