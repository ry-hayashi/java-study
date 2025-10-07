// 名前を読み込んで挨拶する（その１：next（）版）
import java.util.Scanner;
class HelloNext {
    public static void main (String[] args){
        Scanner stdIn = new Scanner (System.in);
        System.out.print("お名前は：");
        String str = stdIn.next();
        System.out.println("こんにちは" + str + "さん。");
    }
}