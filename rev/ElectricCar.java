import java.util.Scanner;

public class ElectricCar extends Car {
    private int battery; //バッテリー残量% 0~100

    //コンストラクタ
    ElectricCar(String name, int battery) {
        super(name);
        this.battery = battery;
    }

    //メソッド
    //バッテリー残量
    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("走行距離は正の数で入力してください。");
            return;
        }

        if (battery <= 0) {
            System.out.println("バッテリー残量が不足しています。");
            return;
        }

        if (battery < distance) {
            System.out.println("指定距離を走るにはバッテリーが足りません。");
            return;
        }

        // 親の処理で走行距離を加算する（重要）
        super.run(distance);

        // バッテリーを消費（1km → 1% の簡易モデル）
        battery -= distance;
    }


    //表示メソッド
    @Override
    public void showStatus() {
        super.showStatus();
        System.out.printf("バッテリー残量：%d%%\n", battery);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("車名を入力してください：");
        String name = stdIn.next();
        System.out.print("初期バッテリー残量(%)を入力してください：");
        int battery = stdIn.nextInt();
        System.out.print("走行距離を入力してください：");
        int distance = stdIn.nextInt();

        ElectricCar c1 = new ElectricCar(name, battery);
        c1.run(distance);
        System.out.printf("%sが%dkm走りました。\n", name, distance);
        c1.showStatus();

        stdIn.close();
    }
}
