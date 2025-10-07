//銀行口座クラス
class Account {
    private String name;
    private String no;
    private long balance;

    //---コンストラクタ---//
    Account(String n, String num, long z) {
        name = n;
        no = num;
        balance = z;
    }
    /**
     * 口座名義を調べる
     * @return 口座名義
     */
    String getName() {
        return name;
    }
/**
 * 口座番号を調べる
 * @return　口座番号
 */
    String getNo() {
        return no;
    }
/**
 * 預金残高を調べる
 * @return　預金残高
 */
    long getBalance() {
        return balance;
    }
/**
 * 入金処理
 * @param k　預け入れたお金
 */
    void deposit(long k) {
        balance += k;
    }
/**
 * 出勤処理
 * @param k　引き出したお金
 */
    void withdraw(long k) {
        balance -= k;
    }
}

class AccountTester {
    public static void main(String[] args) {
        Account adachi = new Account("足立幸一", "123456", 1000);/**足立くんの口座 */
        Account nakata = new Account("仲田慎二", "654321", 200);/**仲田くんの口座 */

        adachi.withdraw(200);
        nakata.deposit(100);

        System.out.println("足立くんの口座\n");
        System.out.println("口座名義：" + adachi.getName());
        System.out.println("口座番号：" + adachi.getNo());
        System.out.println("預金残高：" + adachi.getBalance());


        System.out.println("\n仲田くんの口座\n");
        System.out.println("口座名義：" + nakata.getName());
        System.out.println("口座番号：" + nakata.getNo());
        System.out.println("預金残高：" + nakata.getBalance());
    }
}