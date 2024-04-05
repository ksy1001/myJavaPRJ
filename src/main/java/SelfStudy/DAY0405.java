package SelfStudy;
import java.util.Scanner;
public class DAY0405 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int age;

        System.out.print("나이를 입력하세요 ==>");
        age = s.nextInt();

        if (age <=18){
            System.out.println("와~ 좋겠다~ 나도 그나이일때가 있었지..");
        }else {
            System.out.println("어머나! 19세 이상만 볼 수 있습니다..");
        }
        System.out.println("\n \n좋은 주말 되세요 교수님~~~~~~~");

        s.close();
    }
}
