import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.printf("名前を入力してください。：");
        String name = stdIn.next();
    if(name == "fff")
        System.out.printf("こんにちは、%sさん！\n", name);
        else
        System.out.println("だーれー\n");
    }
}
