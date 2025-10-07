import java.util.Scanner;

class drill204 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("姓：");
        String sei = stdIn.next();
        System.out.print("名：");
        String mei = stdIn.next();

        System.out.println("こんにちは" + sei + mei + "さん。");

    }
    
}
