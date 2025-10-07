// 整数値を読み込んで符号を反転した値を表示

import java.util.Scanner;
class Minus1 {
    public static void main (String [] args){
        Scanner stdIn = new Scanner (System.in );
        System.out.print("整数値；");
        int a = stdIn.nextInt();
        int b = -a;
        System.out.println(+a + "の符号を反転した値は" + b + "です。");
    }
}