import java.util.Scanner;
class drill201 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ｘとｙを加減します");

        System.out.print("ｘの値：");
        int x = stdIn.nextInt();
        System.out.print("ｙの値：");
        int y = stdIn.nextInt();

        System.out.println("ｘ＋ｙ＝" + (x + y));
        System.out.println("ｘーｙ＝" + (x - y));

    }

}