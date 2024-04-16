import java.util.Scanner;

public class Code06_14 {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int a, b;

        while(true) {
            System.out.print("숫자 1 ==>");
            a = s.nextInt();
            if (a == 0)
                break;
            System.out.print("숫자 2 ==>");
            b = s.nextInt();

            hap = a + b;
            System.out.println(a + "+" + b + "=" +hap);
        }

        System.out.println("0을 입력해서 계산을 종료합니다.");
        s.close();
    }
}
