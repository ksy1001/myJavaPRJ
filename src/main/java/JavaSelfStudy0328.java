public class JavaSelfStudy0328 {
    public static void main(String[] args){
        int java = 3, mobile = 2, excel = 1;
        double a = 4.5, a0 = 4.0, b = 3.5;

        double avg;
        avg = ((java*b)+(mobile*a0)+(excel*a))/(java + mobile +excel);
        avg = Math.round(avg*100.0)/ 100.0;

        System.out.println("평균 학점 : "+ avg);
    }
}
