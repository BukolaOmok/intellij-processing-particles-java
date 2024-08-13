import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;


public class Main extends PApplet {
    List<BaseSpark> baseSparks;

    public static void main(String[] args) {
        PApplet.main(new String[]{"Main"});
    }

    @Override
    public void settings() {
        size(800, 600);
    }


    @Override
    public void setup() {
        baseSparks = new ArrayList<>();
        int numToCreate = 100;

        for (int i = 0; i < numToCreate; i++) {
            baseSparks.add(createRandomCircle());
            baseSparks.add(createRandomRectangle());
            baseSparks.add(createRandomTriangle());
        }
    }

    public Circle createRandomCircle() {
        float x = random(0f, 800f);
        float y = random(0f, 600f);

        return new Circle(this, x, y);
    }
    public Rectangle createRandomRectangle() {
        float x = random(0f, 800f);
        float y = random(0f, 600f);

        return new Rectangle(this, x, y);
    }
    public Triangle createRandomTriangle() {
        float x = random(0f, 800f);
        float y = random(0f, 600f);

        return new Triangle(this, x, y);
    }

    @Override
    public void draw() {
        background(100);
        for (BaseSpark s : baseSparks) {
            s.display();
        }

        for (BaseSpark s : baseSparks) {
            s.update();
        }
    }
}