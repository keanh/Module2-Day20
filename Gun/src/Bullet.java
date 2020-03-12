public class Bullet {
    public static int count = 0;
    private int poisition;

    public int getPoisition(){
        return poisition;
    }

    public void setPoisition(int poisition) {
        this.poisition = poisition;
    }

    public Bullet() {
        count++;
    }

    public void move(){
        poisition++;
    }

}
