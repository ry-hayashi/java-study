import java.util.Scanner;

public class drill205 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        final double PI = 9.80665;

        System.out.print("秒数：");
        double sec = stdIn.nextDouble();

        System.out.println("速度は" + (PI * sec) + "です。");
        System.out.println("距離は" + (PI * sec * sec / 2.0)+ "です。");
    }
}