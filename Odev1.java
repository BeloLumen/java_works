
import java.util.Scanner;
public class Odev1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        System.out.print("ilk sayıyı giriniz:");
        num1=scan.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        num2=scan.nextInt();
        // asdkjaslkdjasd 
        num1=num1^num2;
        num2=num2^num1;
        num1=num1^num2;
        
        System.out.println("ilk sayi:"+num1);
        System.out.println("ikinci sayi:"+num2);
        
    }
    
}
