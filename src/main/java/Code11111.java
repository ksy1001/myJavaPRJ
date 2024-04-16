import java.util.Scanner;
public class Code11111 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int a, b, hap;
        hap = 0;
        a = s.nextInt();
        b = s.nextInt();

        if (a < b) {
            for (int i = a; i <=b; i++){
                if (i % 2 !=0){
                    hap += i;
                }
            }
        }else if (a >b) {
            for (int i = a; i >=b; i--){
                if (i % 2 !=0){
                    hap += i;
                }
            }
        }else {
            System.out.println("a와 b가 같습니다. 다시 입력해주세요");
            return;

        }
        System.out.println(hap);
        s.close();
    }
}