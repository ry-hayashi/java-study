// 読み込んだ二つの整数値の小さい方の値を表示

import java.util.Scanner;
class Min2Cond1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数a："); int a = stdIn.nextInt();
        System.out.print("整数b："); int b = stdIn.nextInt();
        int min = a < b ? a : b;    // 小さい方の値
        System.out.println("小さいのは" + min + "です。");
    }
}