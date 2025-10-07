// 円周の長さと円の面積を求める（その2：円周率をfinal変数で表す）

import java.util.Scanner;
class Circle2{
    public static void main(String[] args){
        final double PI = 3.1416;
        Scanner stdIn = new Scanner (System.in);
        System.out.print("半径：");
        double r = stdIn.nextDouble();
        System.out.println("円周の長さは" + 2 * PI * r + "です。");
        System.out.println("面積は" + PI * r * r + "です。");
    }
}