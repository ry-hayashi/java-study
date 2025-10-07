// 二つの整数値を読み込んで加減乗除した値を表示

import java.util.Scanner;
class ArithInt {
    public static void main(String[] args){
        Scanner stdIn = new Scanner (System.in);
        
        System.out.println("xとyを加減乗除します。");
        
        System.out.print("xの値：");
        int x = stdIn.nextInt();
        
        System.out.print("yの値：");
        int y = stdIn.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
    }
}