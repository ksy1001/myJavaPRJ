package SelfStudy; //패키지명
public class Exam01 { //클래스명
    public static void main(String[]args){ //메인함수 메서드

        for (int i = 0;  i<4;  i++) { // 행의 수를 정하는 for 문. i를 0으로 시작한다. i가 3이 될때까지, i는 1씩 증가한다. 총4행.
            for(int blank = 1;  blank<4-i;  blank++) { // i값에 따라 공백의 수를 정하는 for 문. 첫 공백은 3개로 시작해서, 행마다 1개씩 줄어든다.
                System.out.print(" "); // 위의 for 문에 따라, 공백을 출력

            }for (int star = 0;  star<i*2+1;  star++) { // 각 행마다 출력되는 별표의 수를 정하는 for 문
                // 초기값을 0으로 시작해서, i값(몇행인지)에 따라 출력되는 별의 수가 바뀐다. 각 행마다 별의 수는 1,3,5,7개가 출력된다.
                System.out.print("*"); //for 문에 따라서 * 표시를 출력한다.
            }System.out.println(); // 줄바꿈.
        }
    }
}