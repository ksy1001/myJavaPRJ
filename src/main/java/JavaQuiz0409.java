import java.util.Scanner;

public class JavaQuiz0409 {
    //숫자 입력받아서 첫번째가 시작값, 두번째가 끝나는값.
    //끝나는값까지 반복
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 ==>");
        int a = s.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ==>");
        int b = s.nextInt();

        for (int i = a; i <= b; i++){
            System.out.print(i+"\n");
        }

        s.close();
    }
}
