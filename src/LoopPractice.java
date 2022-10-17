public class LoopPractice extends World {

    // still choose 10 different shapes in different locations
    // draw 5 of the same random shape
    // each of those 5 should be a different random color

    public void go() {
        plane.pausetime = 0;
        // write a for loop that draws 10 random shapes in random places
        for(int x = 0; x < 10; x=x+1) {
            System.out.println(x);
            plane.teleport(plane.random(0,1000), plane.random(0,800));
            drawRandomShape();
        }

    }

    public void drawRandomShape() {
        int random = plane.random(0,3); // 0,1,2 at random
        System.out.println("our random number is " + random);
        if (random == 0) {
            plane.square(100);
        }
        if (random == 1) {
            plane.house(100);
        }
        if (random == 2) {
            plane.fillCircle(100);
        }
    }

}
