package study;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ① 以下のルールに従いAccountクラスのインスタンスを生成してください。
        // 変数名:「account」
        Account account = new Account("hoge",123,"abc123");
        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
        account.printAccountInfo();

	}

}
class Account {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public Account(String userName, int id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    // ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    protected void printAccountInfo() {
        
        System.out.println("ユーザー名は、" + this.userName );
        System.out.println("IDは、" + this.id);
        System.out.println("パスワードは、" + this.password); 

    }

}