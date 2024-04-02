import java.util.Scanner;
public class Exam02 {
    //스캐너로 입력받는값이
    //3의 배수인지, 5의 배수인지, 3 and 5d의 배수인지 출력하는 프로그래밍

    //출력 예 : 3의 배수입니다.
    //출력 예 : 5의 배수입니다.
    //3의 배수, 5의 배수 둘다 만족합니다.
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a%15 == 0)
            System.out.println("3과 5의 배수입니다.");

        else if (a%5 == 0)
            System.out.println("5의 배수입니다.");

        else if
        (a%3 == 0)
            System.out.println("3의 배수입니다.");

        }


    }