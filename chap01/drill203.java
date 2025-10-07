import java.util.Scanner;
public class drill203 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("三角形の面積を求めます。");
        System.out.print("底辺：");
        double teihen = stdIn.nextDouble();
        System.out.print("高さ：");
        double takasa = stdIn.nextDouble();

        System.out.println("面積は"+(teihen*takasa)/2+"です。");
    }
}
