import processing.core.PApplet;

public class CircleAgent extends BaseSpark {
    float size;

    public CircleAgent(PApplet p5) {
        super(p5, p5.random(0f, 800f), p5.random(0f, 600f));
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
