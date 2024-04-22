public class Code04_13 {
    public static void main(String[]args){
        String str = " 한글  ABCD efgh  ";
        String cuStr = str.trim();
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        String allStr = str.replaceAll(" ", "");


        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거 ==> [" + cuStr + "]");
        System.out.println("대문자 ==> [" + upper + "]");
        System.out.println("소문자 ==> [" + lower + "]");
        System.out.println("replace_all ==> [" + allStr + "]");
    }
}
