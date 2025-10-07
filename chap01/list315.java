import java.util.Scanner;

class list315 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("手を選べ。グー0、チョキ1、パー2:");
        int hand = stdIn.nextInt();

        switch (hand) {
            case 0:
                System.out.println("ぐー。");
                break;
            case 1:
                System.out.println("ちょき。");
                break;
            case 2:
                System.out.println("ぱー。");
                break;
        }
    }    
    
}
