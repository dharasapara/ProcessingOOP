import processing.core.PApplet;

public class UseOOP {

    private final PApplet p;
    private final int ht;

    public UseOOP(PApplet p) {
        this.p = p;
        ht = p.height / 5;
    }

    public void drawMultipleEllipse(int inc) {
        for (int i = 1; i < 5; i++) {
            p.ellipse(i * inc,i * ht, 20, 20);
        }
    }
}
