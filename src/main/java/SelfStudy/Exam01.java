package SelfStudy; //패키지명
public class Exam01 { //클래스명
    public static void main(String[]args){ //메인함수 메서드

        for (int i = 0;  i<4;  i++) { // i를 0으로 시작한다. i가 3이 될때까지, i는 1씩 증가한다.
            for(int blank = 1;  blank<4-i;  blank++) { // 각 행의 시작에 공백을 출력하는 for 문
                // 초기값 을 1로 시작해서, i값(몇행인지)에 따라 출력되는 공백의 수가 바뀐다.
                // 1행 :: i =0 , blank < 4-0  따라서 blank =3번 반복
                // 2행 :: i =1 , blank < 4-1  따라서 blank =2번 반복
                // 3행 :: i =2 , blank < 4-2  따라서 blank =1번 반복
                // 4행 :: i =3 , blank < 4-3  따라서 blank =0번 반복
                System.out.print(" "); // 위의 for 문에 따라, 공백을 출력

            }for (int star = 0;  star<i*2+1;  star++){ // 각 행마다 별표의 수가 증가하는 for 문
                // 초기값 을 0으로 시작해서, i값(몇행인지)에 따라 출력되는 별의 수가 바뀐다.
                // 1행 :: i =0 , star < 0x2+1,  star < 1,  따라서 star = 0인 초기값 1번만 별 출력.
                // 2행 :: i =1 , star < 1x2+1,  star < 3,  따라서 star = 0,1,2 이므로 별 세번 출력.
                // 3행 :: i =2 , star < 2x2+1,  star < 5,  따라서 star 5번 출력.
                // 4행 :: i =3 , star < 3x2+1,  star < 7,  따라서 star 7번 출력.
                System.out.print("*"); //for 문에 따라서 * 표시가 출력된다
            }
            System.out.println(); // 각 행 출력한 후 엔터를 넣는다.
        }
    }
}