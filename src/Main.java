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
        int numToCreate = 50;

        for (int i = 0; i < numToCreate; i++) {
            baseSparks.add(new CircleAgent(this));
            baseSparks.add(new RectangleAgent(this));
        }
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

        if (mousePressed) {
            baseSparks.add(new TriangleAgent(this));
        }
    }
}