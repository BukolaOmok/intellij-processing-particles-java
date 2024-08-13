import processing.core.PApplet;

public class Circle extends Spark {
    float size;

    public Circle(PApplet p5, float x, float y) {
        super(p5, x, y);
        this.size = p5.random(10, 50);
    }

    @Override
    public void display() {
        p5.fill(myColour);
        p5.circle(x, y, size);
    }

    @Override
    public void update() {
        final int stepSize = 5;
        x += p5.random(-stepSize, stepSize);
        y += p5.random(-stepSize, stepSize);
        size = PApplet.constrain(size + p5.random(-1, 1), 5, 100);
    }
}
