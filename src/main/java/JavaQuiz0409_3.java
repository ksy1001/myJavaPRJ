import java.util.Scanner;
public class JavaQuiz0409_3 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 ==>");
        int a = s.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ==>");
        int b = s.nextInt();

        if (a > b)
        {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }


        else
        {
            for (int i = a; i >= b; i--) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }

        s.close();
    }
}



