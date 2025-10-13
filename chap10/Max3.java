import java.util.Scanner;
class Max3 {
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return max;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数を入力してください。");
        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();
        System.out.print("整数c:");
        int c = stdIn.nextInt();
            
        
        System.out.println("\n最大値は" + max(a, b, c) + "です。"); //maxだけでよべる
    }    
}
