import java.util.Scanner;

public class Othello {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         

        //初期位置設定
        int[][] board = new int[4][4]; //4*4の盤面を用意
        board[1][1] = 1;
        board[2][2] = 1;
        board[1][2] = -1;
        board[2][1] = -1;
        
        //手を決めるから回が終わるごとにループする(ループ設計あとで)
        int loop = 0;
        int tate, yoko;
        int turn = 1;  //1が黒、-1が白
        do {
               
        System.out.print("どこにおきますか？\n");
        System.out.print("たて：");
        tate = stdIn.nextInt();
        System.out.print("よこ：");
        yoko = stdIn.nextInt();

        //turn1or2で指示されたところに要素格納
        //すでに入っている要素の場合はそこには置けませんを表示させてループ
        if (tate < 0 || tate >= 4 || yoko < 0 || yoko >= 4 || board[tate][yoko] != 0) {
            System.out.println("そこには置けません。");
            continue; //ループの最初に戻る
        }
        loop = 0;
        board[tate][yoko] = turn; //手番の色の石を置く
        System.out.println("たて" + tate + "よこ" + yoko + "におきました。");

        //盤面表示。ループで全表示？Array使う?ループ設計後回し。
        
        System.out.println("  1 2 3 4");
        for (int j = 0; j < 4; j++) {
            System.out.print(j + 1 + " ");
            for (int k = 0; k < 4; k++) {
                if(board[j][k]==1)
                System.out.print(" ●");
            else if (board[j][k] == -1)
                System.out.print(" ◯");
            else {
                System.out.print(" _");
                loop++;
            }
            }
            System.out.println("");
            
        }

        turn = -turn;

    } while (loop > 0);
   
    
    //集計
    int kuro = 0;
    int shiro = 0;
    for(tate=0;tate<4;tate++)
    {
        for (yoko = 0; yoko < 4; yoko++) {
            if(board[tate][yoko]==1)
            kuro++;
            else if(board[tate][yoko]==-1)
           shiro++;    
        }
    }
    System.out.println("黒が"+kuro+"個、白が"+shiro+"個です。");
    String kekka = (kuro > shiro) ? "黒" : "白";
    System.out.println((kuro>shiro?kuro-shiro:shiro-kuro)+"個の差で"+kekka+"の勝ちです");
    
}
}
   

