public class Code03_09 {
    public static void main(String[]args){
        int num = 20;
        System.out.println(++num +"   //+1 이후에 변수 20 출력");
        System.out.println(num++ +"   //20 출력 이후 +1");

        num-- ; System.out.print(num+" ");
        num+= 3; System.out.print(num+" ");
        num-= 3; System.out.print(num+" ");
        num*= 3; System.out.print(num+" ");
        num/= 3; System.out.print(num+" ");
        num %= 3; System.out.print(num+" ");
    }
}
