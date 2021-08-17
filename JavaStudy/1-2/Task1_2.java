public class Task1_2 {

    public static void main(String[] args) {

        //「JAPAN」、「AMERICA」、「KOREA」を変数の値とする配列 countryを制作しなさい。
        String[] country = { "JAPAN", "AMERICA", "KOREA" };

        //作成した配列の要素数を出力してください
        System.out.println(country.length);

        /*下記の値を保持した、要素数３のStringクラスの配列strArrayを作成しなさい
         *1番目（先頭）の要素に「りんご」を代入
         *２番目の要素に「もも」を代入
         *３番目の要素に「ぶどう」を代入
         */
        String[] strArray = { "りんご", "もも", "ぶどう" };

         //作成した配列の２番目の要素を出力しなさい
         System.out.println(strArray[1]);

         /*下記の処理について、何をしているかコメントを記入しなさい
          *要素数が5のint[]型の配列 intArrayを定義
          */
          int[] intArray = { 10, 20, 30, 40, 50 };

          //下記の処理について、何をしているのかコメントを記述してください
          //intArrayの配列の2番目の値と5番目の値の合計を表示
          System.out.println(intArray[1] + intArray[4]);

    }
}