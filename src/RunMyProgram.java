

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new B3_HalfTheRed()   );
        run.planeIcon = "plane.png";
        run.pictureFileName="oreos.jpg"; // background image
        run.HEIGHT=800; // height of your plane window in pixels
        run.WIDTH=1000; // width of your plane window in pixels
        run.Refresh();

        //new Thread(run).start();
    }
}
