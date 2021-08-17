
//演算子
public class training3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//演算子[ ＋ 加算, - 減算, * 乗算, / 除算, % 剰余 ]

		int i = 0;
		//10と5を加算した結果 (15) を変数 i に代入
		i = 10 + 5 ;
		System.out.println(i);

		//文字列の連結

		String a = "ABC";
		String b =  a + "DEF";
		System.out.println(b);
		// 変数bには、連結結果の文字列（"ABCDEF"）が保持される。

		/*代入演算子
		 * A += B  AとBを足してAに代入  [A = A+B]
		 * A -= B  AからBを引いてAに代入  [A = A-B]
		 * A *= B  AとBを掛け合わせてAに代入  [A = A-B]
		 * A /= B  AをBで割りAに代入  [A = A/B]
		 * A %= B  AをBで割りその余りをAに代入  [A = A%B]
		 * A++ (インクリメント)  Aから値を1増やす  [A+1]
		 *Aｰｰ (デクリメント)  Aから値を1減らす  [A-1]
	     */

		int num = 10;
		num += 5;  //結果は15
		num -= 3;  //結果は7
		num *= 4;  //結果は40
		num /= 2;  //結果は5　
		num %= 6;  //結果は4


		/*比較演算子
		 * A == B  AとBが等しい時にtrue
		 * A != B  AとBが等しくない時にtrue
		 * A > B  AがBより大きい時にtrue
		 * A < B  AがBより小さい時にtrue
		 * A >= B  AがBより大きいか等しい時にtrue
		 * A <= B  AがBより小さいか等しい時にtrue
		 */

		int one = 1;
		// 変数「ii」の値が 1 の場合は 真(true)、1 でない場合は 偽(false) となる。
		System.out.println(one == 1);

		one = 2;
		System.out.println(one != 1);

		//文字列の比較は [equals] というメゾット(関数)を使う
		String moji = "KURUMI";

		System.out.println( moji != "KURUMI");


		/*理論演算子
		 * A && B  AとBが共にtrueの場合にtrue (かつ)
		 * A ll B  AかBのどちらかがtrueの場合にtrue(または)
		 * !A  Aがtrueでないときにtrue(ではない)
		 */

		// 「i >= 5」と「i <= 20」のどちらも正しければ 真(true)、それ以外の場合は 偽(false) となる。
		int x = 10;
		System.out.println(x >= 5 && x <= 20);

		// 「a > 20」と「b < 30」のどちらかが正しければ 真(true)、どちらも正しくない場合は 偽(false) となる。
		int y = 10;
		int z = 20;
		System.out.println(y > 20 || z < 30);

		// 「i < 20」の結果が「!」によって否定される。
		int w = 10;
		System.out.println(!(w < 20));




	}

}
