package SelfStudy;
import java.util.Scanner;
public class SelfStudy0409 {
public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    String myhand, comhand;
    System.out.print("나의 가위/바위/보 ==> ");
    myhand = s.next();

    String[] hands = {"가위", "바위", "보"};
    int rnd = (int) (Math.random() * hands.length);
    comhand = hands[rnd];
    System.out.println("컴퓨터의 가위/바위/보 ==> "+ comhand);

    if (myhand.equals("가위")){
        if (comhand.equals("가위"))
            System.out.println("무승부!");
        else if (comhand.equals("바위"))
            System.out.println("패배!");
        else if (comhand.equals("보"))
        System.out.println("승리!");

    }else if (myhand.equals("바위")){
        if (comhand.equals("가위"))
            System.out.println("승리!");
        else if (comhand.equals("바위"))
            System.out.println("무승부!");
        else if (comhand.equals("보"))
            System.out.println("패배");

    }else if (myhand.equals("보")) {
        if (comhand.equals("가위"))
            System.out.println("패배!");
        else if (comhand.equals("바위"))
            System.out.println("승리!");
        else if (comhand.equals("보"))
            System.out.println("무승부!!");

    }else {
        System.out.println("가위/바위/보 중 하나를 내세요.");
    }
    s.close();
    }
}
