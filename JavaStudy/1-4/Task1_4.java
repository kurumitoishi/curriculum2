public class Task1_4 {

    //定数（アカウント名）
    //登録されている名前とパスワードを定数で定義
    private static final String NAME = "alice";
    private static final String PASS = "pass";

    //定数（メッセージ）
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";


    public static void main(String[] args) {

        String name = "alice";
        String pass = "pass";

        //名前が「alice」、パスワードが「pass」であった場合、「ログイン成功です。」と出力

        if (name.equals("alice") && pass.equals("pass")) {
            System.out.println(CONST_MSG_SUCCESS);
        }
        //名前のみ正しい場合、「パスワードに誤りがあります。」と出力
        else if (name.equals("alice")) {
            System.out.println(CONST_MSG_ERROR_PASS);
        }
        //パスワードのみ正しい場合、「名前に誤りがあります。」と出力
        else if (pass.equals("pass")) {
            System.out.println(CONST_MSG_ERROR_NAME);
        }
        //名前もパスワードも間違っていた場合は「入力情報に誤りがあります。」と出力
        else {
            System.out.println(CONST_MSG_ERROR_INPUT);
        }

    }


}