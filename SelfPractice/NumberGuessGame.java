import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char loop;

        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();
        System.out.printf("こんにちは、%sさん！\n",name);
        
    do{
        int guess = 0;
        int cnt = 0;
        int answer = random.nextInt(100) + 1; // 1〜100の乱数
    
        System.out.println("数当てゲームを始めます！1〜100の中で当ててください。");
        while (guess != answer) {
            System.out.print("あなたの予想: ");
            guess = scanner.nextInt();
            cnt++;

            if (guess > answer) {
                System.out.println("もっと小さいよ！");
            } else if (guess < answer) {
                System.out.println("もっと大きいよ！");
            } else {
                System.out.printf("%d回目で正解！おめでとう！", cnt);
                break;
            }

            if (cnt == 5) {
                System.out.printf("ハズレ！ゲームオーバー！\n答えは %d でした！\n",answer);
                break;
            }
        }
        System.out.println("もう一度遊びますか？（はい（y）、いいえ（n））：");
        loop = scanner.next().charAt(0);                                                                                   
    } while (loop == 'y');
    System.out.printf("遊んでくれてありがとう、%sさん！\n", name);
    scanner.close();
    }
}
