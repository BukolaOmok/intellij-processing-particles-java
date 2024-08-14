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
            baseSparks.add(new Circle(this));
            baseSparks.add(new Rectangle(this));
            baseSparks.add(new Triangle(this));
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
    }
}