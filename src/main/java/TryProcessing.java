import processing.core.PApplet;

public class TryProcessing extends PApplet {
    private UseOOP obj;
    private int inc;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(1600, 800);
    }

    @Override
    public void setup() {
        obj = new UseOOP(this);
        inc = 0;
    }

    @Override
    public void draw() {
        obj.drawMultipleEllipse(inc);
        inc++;
    }
}