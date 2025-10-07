import java.util.Scanner;
public class list301 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値a：");
        int a = stdIn.nextInt();
        System.out.print("整数値b：");
        int b = stdIn.nextInt();
        System.out.print("整数値c：");
        int c = stdIn.nextInt();

        int min,max; 
        if (a < b){
            min = a;    
            max = b;
        }
        else {
            min = b;
            max = a;
        }

        System.out.println("maxは"+max+"minは"+min);

    }
}
