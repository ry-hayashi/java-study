// 0~9のラッキーナンバーを乱数で生成して表示

import java.util.Random;
class RandomNo{
    public static void main(String[] args){
        Random rand = new Random();
        double random = 10.0 * rand.nextDouble();
        System.out.println("今日のラッキーナンバーは" + random + "です。");
    }
}