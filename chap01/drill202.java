import java.util.Scanner;
public class drill202 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値：");
        int x = stdIn.nextInt();

        System.out.println("最下位桁を除いた値は" + x / 10 + "です。");
        System.out.println("最下位桁は" + x % 10 + "です。");
    }
}