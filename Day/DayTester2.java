//List9-3
import java.util.Scanner;
class DayTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("day1を入力せよ。");
        System.out.print("年：");
        int y = stdIn.nextInt();
        System.out.print("月：");
        int m = stdIn.nextInt();
        System.out.print("日：");
        int d = stdIn.nextInt();
        Day day1 = new Day(y, m, d);

        System.out.println("day2を入力せよ。");
        System.out.print("年：");
        y = stdIn.nextInt();
        System.out.print("月：");
        m = stdIn.nextInt();
        System.out.print("日：");
        d = stdIn.nextInt();
        Day day2 = new Day(y, m, d);

        if (day1 == day2) { //参照先を比べているだけだから等しくありませんと表示される。
            System.out.println("等しいです。");
        } else {
            System.out.println("等しくありません。");
        }

        Day day3 = day1;    //初期化。ただしインスタンスへの参照。参照先が同じになっただけ。
        day3.set(2999, 12, 31); //書き換え。ただし参照先の値を。つまりday1の参照先も内容が書き換えられる。
        System.out.printf("day1=%d年%d月%d日\n", day1.getYear(), day1.getMonth(), day1.getDate());
        System.out.printf("day3=%d年%d月%d日\n", day3.getYear(), day3.getMonth(), day3.getDate());
    }
}
