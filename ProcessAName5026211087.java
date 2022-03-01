import java.util.Scanner;

public class ProcessAName5026211087 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        String userName = sc.nextLine();
        int idx = userName.lastIndexOf(' ');
        String firstName = userName.substring(0, idx);
        String secondName = userName.substring(idx + 1);
       
        System.out.println("Your name is: " + secondName + ", " + firstName);
        
    }
}