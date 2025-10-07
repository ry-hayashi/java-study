import java.util.Random;
public class drill206 {

    public static void main(String[] args) {
        Random rand = new Random();
        int dice = 1 + rand.nextInt(6);

        System.out.println("サイコロ：" + dice);
    }
}