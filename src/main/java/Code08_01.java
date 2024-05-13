class Rabbit333 {
    String shape;
    int xPos;
    int yPos;
    static int count;

    Rabbit333() {
        count++;
    }
}

public class Code08_01 {
    public static void main(String[]args){
        System.out.println("객체 생성 전 총 토끼 수=>" + Rabbit333.count);

        Rabbit333 rabbit1 = new Rabbit333();
        System.out.println("객체1 생성 후 총 토끼 수=>" + Rabbit333.count);

        Rabbit333 rabbit2 = new Rabbit333();
        System.out.println("객체2 생성 후 총 토끼 수=>" + Rabbit333.count);

    }
}
