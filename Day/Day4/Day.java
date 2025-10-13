//List10

public class Day {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public static boolean isLeap(int y) {   //クラスメソッド
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
    }
    
    public boolean isLeap() { //インスタンスメソッド
        return isLeap(year);
    }

    public Day() {}

    public Day(int year) {
        this.year = year;
    }
    
    public Day(int year, int month) {
        this(year);
        this.month = month;
    }
    
    public Day(int year, int month, int date) {
        this(year, month);
        this.date = date;
    }

    public Day(Day d){
        this(d.year,d.month,d.date);
    }

    int getYear() { return year; }

    int getMonth() { return month; }

    int getDate() { return date; }
        
    void setYear(int year) { this.year = year; }

    void setMonth(int month) { this.month = month; }

    void setDate(int date) { this.date = date; }

    void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    int dayOfWeek() {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;   //ツェラーの公式を利用。日が0、土曜が6。
        }
}