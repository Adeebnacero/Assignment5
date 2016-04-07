package www.cput.ac.za;

/**
 * Created by Adeebo on 2016/04/07.
 */
public abstract class Demographics extends PlayerFactory{

    public String gender;
    public String race;

    public Demographics(PlayerBuilder builder, String gender, String race) {
        super(builder);
        this.gender = gender;
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public Demographics setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getRace() {
        return race;
    }

    public Demographics setRace(String race) {
        this.race = race;
        return this;
    }

    @Override
    public String toString() {
        return "Demographics{" +
                "gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                "} " + super.toString();
    }
}
