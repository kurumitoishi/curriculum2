
//データ型
public class training1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//データ型
		int seisu = 1234;
		String moji = "String型 = 文字 = javaはプログラミング言語";
		double shosu =0.123;

		System.out.println("int型 = 整数 = " + seisu);

		System.out.println(moji);

		System.out.println("double型 = 少数 = " + shosu);

		//\n は改行になる、printlnと同じ効果
		System.out.print("TOISHI\nKURUMI\n");

		int hogeInt = 50;
		String hogeString = "テスト";
		double hogeDouble = 0.2;

		System.out.println(hogeInt);
		System.out.println(hogeString);
		System.out.println(hogeDouble);

		//値を上書き
		hogeInt = 100;
		hogeString = "合格";
		hogeDouble = 0.5;

		System.out.println(hogeInt);
		System.out.println(hogeString);
		System.out.println(hogeDouble);

	}

}
