import java.util.Scanner;
public class Quiz0409_2 {
        public static void main(String[]args){
            Scanner s = new Scanner(System.in);

            System.out.print("첫번째 숫자를 입력하세요 ==>");
            int a = s.nextInt();
            System.out.print("두번째 숫자를 입력하세요 ==>");
            int b = s.nextInt();

            for (int i = a; i >= b; i--){
                System.out.print(i+"\n");
            }

            s.close();
        }
    }

