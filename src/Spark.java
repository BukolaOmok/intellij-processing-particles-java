import processing.core.PApplet;


public class Spark {
    public final PApplet p5;
    float x;
    float y;
    public int myColour;

    public Spark(PApplet p5, float x, float y) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.myColour = p5.color(p5.random(0, 255), p5.random(0, 255), p5.random(0, 255));
    }

    public static Spark[] createSparks(PApplet p5, int numToCreate) {
        Spark[] sparks = new Spark[numToCreate];
        for (int i = 0; i < numToCreate; i++) {
            sparks[i] = createRandomSpark(p5);
        }
        return sparks;
    }

    public static Spark createRandomSpark(PApplet p5) {
        float x = p5.random(0f, 800f);
        float y = p5.random(0f, 600f);
        int shape = (int) p5.random(3); // Random integer: 0, 1, or 2

        switch (shape) {
            case 0:
                return new Circle(p5, x, y);
            case 1:
                return new Triangle(p5, x, y);
            case 2:
                return new Rectangle(p5, x, y);
        }
        return null;
    }


    public void display() {
    }

    public void update() {
    }
}





