import processing.core.PApplet;


public abstract class BaseSpark {
    public final PApplet p5;
    float x;
    float y;
    public final int myColour;

    protected BaseSpark(PApplet p5, float x, float y) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.myColour = p5.color(p5.random(0, 255), p5.random(0, 255), p5.random(0, 255));
    }


    public abstract void display();

    public abstract void update();
}




