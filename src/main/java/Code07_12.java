class Rabbit4 {
    private  String shape;
    private  int xPos;
    private  int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_12 {
    public static void main(String []args){
        Rabbit4 rabbit4 = new Rabbit4();

        rabbit4.setPosition(100,200);
    }
}
