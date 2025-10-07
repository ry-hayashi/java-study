//List9-5,9-6

import java.util.Scanner;

class DayArray {
public static void main(String[] args) {
    
    Scanner stdIn = new Scanner(System.in);
    String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
    System.out.print("日付は何個：");    int n = stdIn.nextInt();

    Day[] a = new Day[n];
    //for (int i = 0; i < a.length; i++)
    //    a[i].set(2027,10,15);  //nullが入ってるだけ。nullに対してsetで呼び出そうとしている 
    /*
    Exception in thread "main" java.lang.NullPointerException: 
    Cannot invoke "Day.set(int, int, int)"because "<local4>[<local5>]" is null at DayArray.main(DayArray.java:14)
    */

    for (int i = 0; i < a.length; i++)
        a[i] = new Day(2027, 10, 15);   //new演算子でインスタンスを生成する必要がある
    

    for (int i = 0; i < a.length; i++)
        System.out.println("a["+i+"]="+a[i].getYear()+"年"+a[i].getMonth()+"月"+a[i].getDate()+"日（"+wd[a[i].dayOfWeek()]+"）");
}    
}
