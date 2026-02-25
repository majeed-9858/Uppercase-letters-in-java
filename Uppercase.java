import java.util.Scanner;
public class Uppercase{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine(); 
    String upperstr = str.toUpperCase();
    System.out.println("Uppercase String: " + upperstr);
    }
}