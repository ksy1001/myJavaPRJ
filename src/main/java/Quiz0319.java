public class Quiz0319{
    public static void main(String[] args) {

        for (int i= 1; i <=4; i++){//행수 :4행
            for (int j = 1; j <= i; j++) { //별1개로 시작해서,행마다 1개씩 별이 증가하는 for 문
                System.out.print("*"); //for 문에 따라 별 출력됨.
            }
            System.out.println(); //별 출력후 행이 끝나면 줄바꿈
        }

        for (int i= 3; i >= 1; i--){ //i값: 순서대로 3,2,1. 총 행수 : 3
            for (int j = 1; j <= i; j++){ //1행 : 1,2,3 2행 : 1,2 3행 : 1
                System.out.print("*"); //for 문에 따라 별 출력됨.
            }
            System.out.println(); //별 출력후 행이 끝나면 줄바꿈
        }
    }
}
