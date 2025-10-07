// 読み込んだ整数値の桁数（ゼロ／１桁／２桁以上）を判定

import java.util.Scanner;

class DigitsNo1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数値：");
        int n = stdIn.nextInt();

        if(n == 0)
          System.out.println("ゼロです。");
        else if(n >= -9 && n <= 9)
          System.out.println("１桁です。");
        else
          System.out.println("２桁以上です。");
    }
}