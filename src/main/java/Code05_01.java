import java.util.Scanner;

public class Code05_01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int a = s.nextInt();

        if (a < 100){
            System.out.print("100보다 ");
        System.out.println("작군요.");}
        else
            System.out.println("100보다 크군요.");
        s.close();
    }
}
