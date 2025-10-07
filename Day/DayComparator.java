//List9-4 日付比較メソッド

import java.util.Scanner;

class DayComparator {
    
    /**
     * d1とd2の日付が等しいかを確認する
     * @param d1 日付1のインスタンスへの参照を受け取る
     * @param d2 日付2
     * @return 年月日全てをそれぞれ比較した結果 TRUEorFALSE
     */
    static boolean compDay(Day d1, Day d2) {    //クラスメソッド
        return d1.getYear() == d2.getYear() &&  //直接非公開フィールドにアクセスできないからゲッタを利用
                d1.getMonth() == d2.getMonth() &&
                d1.getDate() == d2.getDate();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        
        System.out.println("day1を入力せよ。");
        System.out.print("年：");        int y = stdIn.nextInt();
        System.out.print("月：");        int m = stdIn.nextInt();
        System.out.print("日：");        int d = stdIn.nextInt();
        Day day1 = new Day(y, m, d);

        System.out.println("day2を入力せよ。");
        System.out.print("年：");        y = stdIn.nextInt();
        System.out.print("月：");        m = stdIn.nextInt();
        System.out.print("日：");        d = stdIn.nextInt();
        Day day2 = new Day(y, m, d);

        if(compDay(day1, day2))
            System.out.println("等しいです。");
            else
                System.out.println("等しくありません。");
    }

}