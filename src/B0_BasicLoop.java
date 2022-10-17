import javax.xml.stream.events.StartElement;

public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail=true;
        plane.pausetime = 0;
        plane.teleport(0,0);
        plane.trailWidth = 10;

        squareRow(12);
//        grid();

        grid2Loops(20);
    }

    public void grid2Loops(int sideLength) {
        for (int y=0;y<7;y=y+1) {
            for(int x=0;x<10;x=x+1) {
                plane.trailWidth = plane.random(2,30);
                plane.setColor(200, y*3, x*2);
                plane.teleport(x*sideLength, y*sideLength);
                System.out.println(x);
                plane.square(sideLength);
            }
        }
    }

    public void squareRow(int y) {
        for(int x=0;x<10;x=x+1) {
            plane.setColor(200, y*30, x*20);
            plane.teleport(x*100, y*100);
            System.out.println(x);
            plane.square(100);
            System.out.println("Ms Lockwood is the coolest CS teacher");
        }
    }
    public void grid() {
        for (int y=0;y<7;y=y+1) {
            squareRow(y);
        }
    }
}
