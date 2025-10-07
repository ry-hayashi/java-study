//TODOリスト

import java.util.ArrayList; //これもしらない
import java.util.List;  //これをしらない
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        List<String> todos = new ArrayList<>(); //これがあたらしい
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== TODOリストアプリ ===");
        while (running) {
            System.out.println("\nメニュー:");
            System.out.println("1. タスク追加");
            System.out.println("2. リスト表示");
            System.out.println("3. タスク完了（削除）");
            System.out.println("4. 終了");
            System.out.print("選択: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 改行文字をクリア

            switch (choice) {
                case 1:
                    System.out.print("追加するタスク: ");
                    String task = scanner.nextLine();
                    todos.add(task);
                    System.out.println("追加しました: " + task);
                    break;
                case 2:
                    if (todos.isEmpty()) {
                        System.out.println("タスクがありません。");
                    } else {
                        System.out.println("TODOリスト:");
                        for (int i = 0; i < todos.size(); i++) {
                            System.out.println((i + 1) + ". " + todos.get(i));
                        }
                    }
                    break;
                case 3:
                    if (todos.isEmpty()) {
                        System.out.println("タスクがありません。");
                    } else {
                        System.out.println("完了するタスクの番号: ");
                        int index = scanner.nextInt() - 1;
                        if (index >= 0 && index < todos.size()) {
                            String completed = todos.remove(index);
                            System.out.println("完了しました: " + completed);
                        } else {
                            System.out.println("無効な番号です。");
                        }
                    }
                    scanner.nextLine(); // 改行クリア
                    break;
                case 4:
                    running = false;
                    System.out.println("アプリを終了します。");
                    break;
                default:
                    System.out.println("無効な選択です。1-4を入力してください。");
            }
        }
        scanner.close();
    }
}