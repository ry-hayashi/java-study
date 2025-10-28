import java.util.Scanner;

class Car {
    private String name;    //車の名前
    private int mileage; //走行距離(km)
    
    //コンストラクタ
    Car(String name) {
        this.name = name;
        mileage = 0;
    }

    //アクセッサ
    public String getName() {
        return name;
    }
    
    public int getMileage() {
        return mileage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //メソッド
    //走行距離に加算
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("走行距離は正の数で入力してください。");
            return;
        }
        mileage += distance;
    }

    //ステータス表示
    public void showStatus() {
        System.out.printf("車名：%s / 走行距離：%d km\n", name, mileage);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("車名を入力してください：");
        String name = stdIn.next();
        System.out.print("走行距離を入力してください：");
        int distance = stdIn.nextInt();

        Car c = new Car(name);
        c.run(distance);
        System.out.printf("%sが%dkm走りました。\n", name, distance);
        c.showStatus();

        stdIn.close();
    }
    
}