package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public class Division extends PlayerFactory  {

    public String division;

    public Division(PlayerBuilder builder, String division) {
        super(builder);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public Division setDivision(String division) {
        this.division = division;
        return this;
    }

    @Override
    public String toString() {
        return "Division{" +
                "division='" + division + '\'' +
                "} " + super.toString();
    }
}
