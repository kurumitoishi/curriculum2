package study;

public class Task extends Calculator {
	 // ① TaskクラスにCalculatorクラスを継承させなさい。

    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

        int a =10;
        int b =20;
        int c =30;


      int num = plus(10);
      System.out.println("plusメソッドの引数が一つの場合:" + num );

      int num2 = plus(10,20);
      System.out.println("plusメソッドの引数が一つの場合:" + num2);

      int num3 = plus(10,20,30);
      System.out.println("plusメソッドの引数が一つの場合:" + num3);





    }
}
