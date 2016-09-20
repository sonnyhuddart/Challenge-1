package challenge.pkg1;
import java.util.Scanner;
public class Challenge1 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your name?");
        
        String answer = myScanner.nextLine();
        
        System.out.println("Hello " + answer + " ,how are you?");
        
    }
    
}
