
public class trainnig2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列の格納方法
		//格納する箱の数を決める[宣言]
		int[] arr = new int[5];
		//配列に中身を入れる[初期化]、箱の名前は0から始まる
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		System.out.println(arr[2]);

		//配列の要素数を調べる [length]
		System.out.println("配列の要素数(箱の数)" + arr.length);

		//配列の宣言と初期化を同時にする
		int[] score = {10,20,30,40,50,60,70,80,90};

		System.out.println("score[]の配列の要素数 = "  + score.length + "、その中の一番初めの数は " +score[0] + " です");

		//配列の足し算

		int sum = 0; //合計スコアの宣言、０で初期化
		sum = score[0] + score[5] + score[8];


		System .out.println("score[0] と score[5] と score[8] の合計は " + sum +" です" );

		//足し算になる
		System.out.println(score[3] + score[4]);
		//間に挟むとそれぞれ表示される
		System.out.println(score[3] + " " + score[4]);

		//文字の配列
		String[] moji = {"TOISHI","KURUMI","YUJI","CHINAMI"};

		System.out.println("私の名前は" + moji[0] +" " + moji[1] + "です。");

		System.out.println("父の名前は" + moji[0] +" " + moji[2] + "です。");

		System.out.println("母の名前は" + moji[0] +" " + moji[3] + "です。");


	}
}
