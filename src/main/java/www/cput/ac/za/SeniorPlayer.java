package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class SeniorPlayer extends SrPlayer {

    @Override
    public double subscription() {
        return 500;
    }

    @Override
    public int age() {
        return 25;
    }

    @Override
    public String name() {
        return "Adeeb";
    }

    @Override
    public String surname() {
        return "Nacerodien";
    }


    //@Override
    //public String apparel() { return apparel() ; }
}
