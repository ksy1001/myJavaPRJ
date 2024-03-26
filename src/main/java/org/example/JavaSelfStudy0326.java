import java.util.Scanner;

public class JavaSelfStudy0326 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        String name, addr;
        int weight;

        System.out.println("택바 보내기 입니다. 다음을 각각 입력하세요 ##");

        System.out.print("받는 사람 : ");
        name = s.nextLine();
        System.out.print("주소 : ");
        addr = s.nextLine();
        System.out.print("무게(g) : ");
        weight = s.nextInt();

        System.out.println("** 받는 사람 ==>" + name);
        System.out.println("** 주소 ==>" + addr);
        System.out.println("** 배송비 ==>" + weight*5 + "원");

        s.close();
    }
}
