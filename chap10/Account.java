public class Account {
    private static int counter = 0;
    private String name;
    private String no;
    private long balance;
    private int id;

    public Account(String n, String num, long z) {
        name = n;
        no = num;
        balance = z;
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getNo() {
        return no;
    }

    long getBalance() {
        return balance;
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }
}