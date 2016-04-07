package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class JuniorPlayer extends JrPlayer{

    @Override
    public double subscription() {
        return 250;
    }

    @Override
    public int age() {
        return 15;
    }

    @Override
    public String name() {
        return "Noor";
    }

    @Override
    public String surname() {
        return "Jacobs";
    }

   // @Override
   // public String apparel() { return apparel().toString(); }
}
