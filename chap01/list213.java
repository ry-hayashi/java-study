import java.util.Scanner;

public class list213 {
    public static void main(String[] args) {
        final double PI = 3.1416;   //final変数は大文字だけで書く。円周率
        Scanner stdIn = new Scanner(System.in);

        System.out.print("半径：");
        double r = stdIn.nextDouble();//半径

        System.out.println("円周の長さは" + 2 * PI * r + "です。");
        System.out.println("面積は" + PI * r * r + "です。");
    }

}
