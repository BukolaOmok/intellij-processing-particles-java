import processing.core.PApplet;

public class Triangle extends BaseSpark {
    float size;

    public Triangle(PApplet p5, float x, float y) {
        super(p5, x, y);
        this.size = p5.random(10, 50);
    }

    @Override
    public void display() {
        p5.fill(myColour);
        float sizeDividedBy2 = size / 2;
        p5.triangle(x, y - sizeDividedBy2, x - sizeDividedBy2, y + sizeDividedBy2, x + sizeDividedBy2, y + sizeDividedBy2);
    }

    @Override
    public void update() {
        final int stepSize = 5;
        x += p5.random(-stepSize, stepSize);
        y += p5.random(-stepSize, stepSize);
        size = PApplet.constrain(size + p5.random(-1, 1), 5, 100);
    }
}
