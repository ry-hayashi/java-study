import java.util.Random;

public class list217 {

    public static void main(String[] args) {
        
        Random rand = new Random();

        int lucky = 10+rand.nextInt(90);

        System.out.println("今日のラッキーナンバーは" + lucky + "です。");
    }
}