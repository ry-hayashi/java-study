import java.util.Scanner;

public class list314 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a=");
        int a = stdIn.nextInt();
        System.out.print("b=");
        int b = stdIn.nextInt();

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println("昇順にソート");
        System.out.println("小さい順に" + a + "," + b);
    }

    
}