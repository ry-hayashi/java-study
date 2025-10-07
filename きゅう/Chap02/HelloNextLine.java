// 名前を読み込んで挨拶する（その２：nextLine（）版）
import java.util.Scanner;
class HelloNextLine {
    public static void main (String[] args){
        Scanner stdIn = new Scanner (System.in);
        System.out.print("お名前は：");
        String str = stdIn.nextLine();
        System.out.println("こんにちは" + str + "さん。");
    }
}